<html>
<head>
	<script type="text/javascript">
		function openSearchForm()
		{
			//alert("ok");
			document.getElementById("getStudent").style.visibility = "visible";
			document.getElementById("addStudent").style.visibility = "hidden";
		}
		
		function openAddForm()
		{
			//alert("ok");
			document.getElementById("addStudent").style.visibility = "visible";
			document.getElementById("getStudent").style.visibility = "hidden";
		}
	</script>
</head>
<body>
<h2>Hello World!</h2>

<input type="button" value="Search Student" onclick="openSearchForm()">
<input type="button" value="Add Student" onclick="openAddForm()"><br><br>

<form action="getStudent" id="getStudent" style="visibility: hidden" method="get">
	<input type = "text" name="id" placeholder="enter id">
	<input type="submit"  value="Find">
</form>

<form action="addStudent" id="addStudent" style="visibility: hidden" method="post">
	<input type = "text" name="id" placeholder="enter id">
	<input type = "text" name="name" placeholder="enter name">
	<input type = "text" name="place" placeholder="enter your place">
	<input type="submit"  value="Add">
</form>

</body>
</html>
