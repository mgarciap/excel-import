<html>
  <head>
    <title>File Uploader</title>
    <meta name="layout" content="main"/>
  </head>
<body>
Upload Form: <br />
	<g:form action="upload" method="post" enctype="multipart/form-data">
		<input type="file" name="theFile" />
		<input type="submit" />
	</g:form>
</body>
</html>