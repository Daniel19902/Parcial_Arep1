var clima = (function(){

    return {

        api : function(pais){

            fetch('http://localhost:5000/consulta?lugar='+pais)
                  .then(response => response.json())
                  .then(json => $('#resultado').html(json))

        }


    }




})();