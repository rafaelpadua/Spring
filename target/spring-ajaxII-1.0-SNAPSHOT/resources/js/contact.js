
$(document).ready(function() {

    $('#saveContact').submit(function(e) {

        $.post('/spring-ajaxII/contact/save', $(this).serialize(), function(contato) {

            $('#contactTableResponse').last().append(
                    '<tr>' +
                    '<td>' + contato.id + '</td>' +
                    '<td>' + contato.firstName + '</td>' +
                    '<td>' + contato.lastName + '</td>' +
                    '<td>' + contato.age + '</td>' +
                    '</tr>'
                    );
        });
        clearInputs();
        e.preventDefault();
    });
});
function clearInputs() {
    $('#saveContact').each(function() {
        this.reset();
    });
}


$(document).ready(function() {

    $('#button').click(function() {

        var first = $('#firstInput').val();
        var last = $('#lastInput').val();
        
        $.ajax({
            type: 'GET',
            url: '/spring-ajaxII/contact/getJSON/' + first + "/" + last,
            dataType: 'json',
            sucess: function(result) {
                
                var contact =
                        "id : " + result.id +
                        "| name : " + result.firstName + " " + result.lastName +
                        "| age : " + result.age;
                 
                $("#theJson").html(contact);
            },
            error: function(jqXHR, textStatus, errorThrown) {

                $("#theJson").html("OPSSSS!" + textStatus + " " + errorThrown + "!");
            }
        });
    });
});







