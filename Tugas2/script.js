$(document).ready(function(){
  var url="https://api.quotable.io/random";
  getQuote();
  var tweet;
  function getQuote(){
      $.getJSON(url, function(data)
               {
        $(".quote").html('"'+data.content+'"');
        $(".author").html("- "+data.author);
        tweet=$(".quote").text() + " by -" + $(".author").text();
      });
  };
 
   $("#tweet").on("click", function()
                {
    window.open("https://twitter.com/intent/tweet?text="+tweet);
  });
    $("#newq").on("click", function(){
      getQuote();
    });
 
});