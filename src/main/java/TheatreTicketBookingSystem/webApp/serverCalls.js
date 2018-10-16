/**
 * Created by Hasan on 10/16/2018.
 */

function registerCustomer(name, surname, email, cell)
{
    $.ajaxSetup({headers:{
        'Content-Type': 'application/json',
        'Access-Control-Allow-Methods': 'PUT, POST, GET, OPTIONS, DELETE'
    }});

    var Customer = JSON.stringify({"name": name, "surname": surname, "email": email , "cell": cell});
    console.log(Customer);
    $.post('http://localhost:3309/customer/add', Customer,
        function(data){
            console.log(data);
        });

}

function getHorrorFilms()
{
    $.get('http://localhost:3309/movie/horror',
        function(data){
            console.log(data);
        });
}

function getDocumenaryFilms()
{
    $.get('http://localhost:3309/movie/documentary',
        function(data){
            console.log(data);
        });
}

function getScifiFilms()
{
    $.get('http://localhost:3309/movie/scifi',
        function(data){
            console.log(data);
        });
}

function getActionFilms()
{
    $.get('http://localhost:3309/movie/action',
        function(data){
            console.log(data);
        });
}

function getAllFilms()
{
    $.get('http://localhost:3309/movie/all',
        function(data){
            console.log(data);
        });
}

function findCustomer(email, password)
{
    var Customer = 1;
    $.get('http://localhost:3309/customer/find/' + Customer,
        function(data){
            console.log(data);
        });
}

function findReservation(email, password)
{console.log("kak");
    $.get('http://localhost:3309/customer/login/' + email + "/" + password,
        function(data){
            findCustomerReservation(data);
        });
}

function findCustomerReservation(customer)
{
    var Customer = JSON.stringify(customer);
    console.log(Customer);
    $.ajaxSetup({headers:{'Content-Type': 'application/json'}});
    $.post('http://localhost:3309/reservation/findCustReservation/', Customer,
        function(data){
            console.log(data);
        });
}