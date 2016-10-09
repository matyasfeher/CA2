$(function(){
   
   $("#option").on("click", function () {
       $("#searchItem").prop("disabled", false);
       if($(this).val() === "1"){
           $("#searchItem").attr('placeholder', 'ID, First Name, Last Name, Email (Hobby, Address and Phone Number in Progress)');
       }
       else if($(this).val() === "2"){
           $("#searchItem").attr('placeholder', 'Name, CVR, ID, Email, Market Value, Emploee Count, etc. (Phone Number and Address in Progress)');
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


