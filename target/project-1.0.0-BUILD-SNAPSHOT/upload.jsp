<html>
<head>
<title>Upload a file please</title>
</head>
<body>
	<h1>Please upload a file</h1>
	<form method="post" action="upload.form" enctype="multipart/form-data">
		<input type="file" name="file" /> <input type="submit" /> <span>
		<form:errors path="file" cssClass="errors" cssStyle="color : red;"/>
		</span>

	</form>
</body>
</html>