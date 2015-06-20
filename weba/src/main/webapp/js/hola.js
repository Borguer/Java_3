$("#boton-hola").click(function(){
 
 $(document).ready(function (){
 alert ("hola")
    $.ajax({
        url:"hola",
        method:"POST",
        data:{
            nombre:$("#respuesta").val()
        },
        success: function (datos){
            $("#respuesta").html(datos);
        },
        failure:function (){
            
        }
    });
    
    
    } );
});