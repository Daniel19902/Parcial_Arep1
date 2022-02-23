var clima = (function(){

    return {

        api : function(pais){

            fetch('https://secret-meadow-35581.herokuapp.com/consulta?lugar='+pais)
                  .then(response => response.json())
                  .then(json => $('#resultado').html(json))

        }


    }




})();