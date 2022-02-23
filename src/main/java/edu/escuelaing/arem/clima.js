


var clima = (function(){

    return {

        api : function(){
            alert("entre")
            fetch('https://openweathermap.org/city/2643743')
                  .then(response => response.json())
                  .then(json => console.log(json))

        }


    }




})();