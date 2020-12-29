hello();

function hello() {
    $.ajax({
        url: "/sample",
        type: "GET",
        success: function (data) {
            console.log(data);
        },
        error: function (err) {
            console.log(err);
        }
    })
}