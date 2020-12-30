
$(function () {
    var result = getTop5Rate();
    console.log(result);
    showChart(result);
})

function getTop5Rate() {
    var result;
    $.ajax({
        url: "/count",
        type: "GET",
        async: false,
        dataType: "json",
        contentType: "application/json",
        success: function (data) {
            console.log(data);
            result = data.counts;
        },
        error: function (err) {
            console.log(err);
        }
    })
    return result;
}

function showChart(result) {
    Highcharts.chart('chart_area', {
        chart: {
            type: 'bar'
        },
        title: {
            text: '지역별 구인/구직 건수'
        },
        subtitle: {
            text: 'Source: <a href="https://www.work.go.kr/seekWantedMain.do">워크넷</a>'
        },
        xAxis: {
            categories: makeSpecificValueArray(result, "bigRegion"),
            title: {
                text: null
            }
        },
        yAxis: {
            min: 0,
            title: {
                text: '명',
                align: 'high'
            },
            labels: {
                overflow: 'justify'
            }
        },
        tooltip: {
            valueSuffix: '명'
        },
        plotOptions: {
            bar: {
                dataLabels: {
                    enabled: true
                }
            }
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'top',
            x: -40,
            y: 80,
            floating: true,
            borderWidth: 1,
            backgroundColor:
                Highcharts.defaultOptions.legend.backgroundColor || '#FFFFFF',
            shadow: true
        },
        credits: {
            enabled: false
        },
        series: [{
            name: '구인',
            data: makeSpecificValueArray(result, "wantedCnt")
        }, {
            name: '구직',
            data: makeSpecificValueArray(result, "seekCnt")
        }]
    });
}

function makeSpecificValueArray(array, key) {
    var newArr = [];

    for (var i = 0; i < array.length; i++) {
        var value = array[i][key];
        newArr.push(value);
    }

    return newArr;
}