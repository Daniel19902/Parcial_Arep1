var clima = (function(){

    return {

        api : function(pais){
            alert("entre")
            fetch('http://localhost:4567')
                  .then(response => response.json())
                  .then(json => console.log(json))

        }


    }




})();