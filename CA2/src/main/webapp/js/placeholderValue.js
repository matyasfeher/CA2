$(function(){
   
   $("#option").on("click", function () {
       if($(this).val() === "1"){
           $("#seachItem").attr('placeholder', 'First Name, Last Name');
       }
       else if($(this).val() === "2"){
           $("#seachItem").attr('placeholder', 'Company Name, CVR, etc.');
       }
       else if($(this).val() === "3"){
           $("#seachItem").attr('placeholder', 'Phone Number');
       }
       else if($(this).val() === "4"){
           $("#seachItem").attr('placeholder', 'Name of the Hobby');
       }
       else if($(this).val() === "5"){
           $("#seachItem").attr('placeholder', 'Street, Zip Code, City');
       }
   });
});


