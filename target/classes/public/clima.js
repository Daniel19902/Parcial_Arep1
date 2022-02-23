var clima = (function(){

    return {

        api : function(pais){
            alert("entre")
            fetch('http://localhost:4567/consulta')
                  .then(response => response.json())
                  .then(json => console.log(json))

        }


    }




})();