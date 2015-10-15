<html>
<head>
    <link href="css/jquery.css" rel="stylesheet">
    <script src="js/jquery.js"></script>
    <script src="js/jquery-ui.js"></script>
  </head>
<body>

	<%@ attribute name="id" required="true"%>
	<input id="${id}" name="${id}" type="text">
	<script>
		$("#${id}").datepicker();
	</script>
</body>
</html>

