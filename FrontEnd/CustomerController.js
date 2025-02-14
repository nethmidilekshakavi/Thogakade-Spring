$(".save-btn").click(function(e) {
    e.preventDefault();

    let customer = {
        id: $("#ID").val(),
        name: $("#customerName").val(),
        address: $("#customerAddress").val(),
        proPic: $("#profilePic").val()
    };

    $.ajax({
        url: "http://localhost:8080/customerCrud/api/v1/customer/save",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(customer),
        success: function(response) {
            alert("Customer saved successfully!");
        }
    });
});


