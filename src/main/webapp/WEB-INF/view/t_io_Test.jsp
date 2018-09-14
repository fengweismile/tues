<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Testing websockets</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
  <div>
    <input type="submit" value="Start" onclick="start()" />
  </div>
  <div id="messages"></div>
  <script type="text/javascript">
    var webSocket = 
      new WebSocket('ws://localhost:5678');

    webSocket.onerror = function(event) {
      onError(event)
    };

    webSocket.onopen = function(event) {
      onOpen(event)
    };

    webSocket.onmessage = function(event) {
      onMessage(event)
    };

    function onMessage(event) {
		var blob = event.data;
		var reader = new FileReader();
		reader.readAsText(blob, 'utf-8');
		reader.onload = function (e) {
			document.getElementById('messages').innerHTML 
			+= '<br />' + reader.result;
		}
    }

    function onOpen(event) {
      document.getElementById('messages').innerHTML 
        = 'Connection established';
    }

    function onError(event) {
      alert(event.data);
    }

    function start() {
      webSocket.send('hellohellohellohellohellohellohellohellohe');
    }
	//window.setInterval("start()", 10);
  </script>
</body>
</html>