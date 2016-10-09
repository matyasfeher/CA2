$(function(){
   
   $("#option").on("click", function () {
       $("#searchItem").prop("disabled", false);
       if($(this).val() === "1"){
           $("#searchItem").attr('placeholder', 'First Name, Last Name');
       }
       else if($(this).val() === "2"){
           $("#searchItem").attr('placeholder', 'Company Name, CVR, etc.');
       }
       else if($(this).val() === "3"){
           $("#searchItem").attr('placeholder', 'Phone Number');
       }
       else if($(this).val() === "4"){
           $("#searchItem").attr('placeholder', 'Name of the Hobby');
       }
       else if($(this).val() === "5"){
           $("#searchItem").attr('placeholder', 'Street, Zip Code, City');
       }
   });
});


