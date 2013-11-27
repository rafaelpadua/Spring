$(document).ready(function() {

    $('#saveContact').submit(function(e) {

        $.post('/spring-ajaxII/contact/save', $(this).serialize(), function(contato) {

            $('#contactTableResponse').last().fadeIn(1000).append(
                  '<tr>' +
                    '<td>' + contato.id + '</td>' +
                    '<td>' + contato.firstName + '</td>' +
                    '<td>' + contato.lastName + '</td>' +
                    '<td>' + contato.age + '</td>' +
                    '</tr>'
                );
        });
//       clearInputs();
        e.preventDefault();
    });
});

//function clearInputs() {
//    $('input(id*="Input*")').each(function() {
//        $(this).reset();
//    });
//}
//;




