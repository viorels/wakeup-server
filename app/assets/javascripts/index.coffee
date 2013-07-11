$ ->
  $.get "/challenges", (data) ->
    $.each data, (index, challenge) ->
      $("#challenges").append $("<li>").text challenge.objective 