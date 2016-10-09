$(function () {
    var person;
    var company;
    $.when(
            $.get("/CA2/api/person/complete").done(function (data) {
        person = data;
    }),
            $.get("/CA2/api/company/complete").done(function (data) {
        company = data;
    })

            ).then(function () {

        $("#submitBt").on("click", function () {
            document.getElementById('id01').style.display = 'block';
            $('#filtered').find('thead:last').html("");
            $('#filtered').find('tbody:last').html("");
            var searchAttribute = $("#searchItem").val();
            if ($("#option").val() === "1") {
                $.each(person, function (key) {
                    var allPersons = person[key];
                    var exists = false;
                    var row = "";
                    var head = "";
                    var fullhead;
                    var fullrow;
                    $.each(allPersons, function (type, value) {
                        head = head + "<th>" + type.toUpperCase();
                        +"</th>";
                        row = row + "<td>" + value + "</td>";

                        if (value === searchAttribute) {
                            exists = true;
                        }


                    });
                    if (exists) {
                        fullhead = "<tr>" + head + "</tr>";
                        fullrow = "<tr>" + row + "</tr>";
                        $('#filtered').find('thead:last').html(fullhead);
                        $('#filtered').find('tbody:last').append(fullrow);

                    }
                });
            } else if ($("#option").val() === "2") {

            } else if ($("#option").val() === "3") {

            } else if ($("#option").val() === "4") {

            } else if ($("#option").val() === "5") {

            }
        });
        $("#submitBt2").on("click", function () {
            $('#modal2').find('thead:last').html("");
            $('#modal2').find('tbody:last').html("");
            document.getElementById('id02').style.display = 'block';
            $.each(person, function (key) {
                var allPersons = person[key];
                var row = "";
                var head = "";
                var fullhead;
                var fullrow;
                $.each(allPersons, function (type, value) {
                    head = head + "<th>" + type.toUpperCase();
                    +"</th>";
                    row = row + "<td>" + value + "</td>";
                });
                fullhead = "<tr>" + head + "</tr>";
                fullrow = "<tr>" + row + "</tr>";
                $('#modal2').find('thead:last').html(fullhead);
                $('#modal2').find('tbody:last').append(fullrow);
            });

        });
        $("#submitBt3").on("click", function () {
            $('#modal3').find('thead:last').html("");
            $('#modal3').find('tbody:last').html("");
            document.getElementById('id03').style.display = 'block';
            $.each(company, function (key) {
                var allCompanies = company[key];
                var row = "";
                var head = "";
                var fullhead;
                var fullrow;
                $.each(allCompanies, function (type, value) {
                    head = head + "<th>" + type.toUpperCase();
                    +"</th>";
                    row = row + "<td>" + value + "</td>";
                });
                fullhead = "<tr>" + head + "</tr>";
                fullrow = "<tr>" + row + "</tr>";
                $('#modal3').find('thead:last').html(fullhead);
                $('#modal3').find('tbody:last').append(fullrow);
            });
        });

    });
});

