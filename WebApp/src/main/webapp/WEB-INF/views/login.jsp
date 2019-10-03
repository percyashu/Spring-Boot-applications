<%@include file ="../common/header.jspf"
%>
	<%@include file ="../common/nav.jspf"
%>


	<div class="container">
		<form action="/login.do" method="POST">
		Name : <input name="name" type="text" />
		Password : <input name="password" type="password" />
<input type="Submit" value="Login" />
<p><font color="red">${errorMessage}</font></p>
	</form>
	</div>

	<%@include file ="../common/footer.jspf"
%>