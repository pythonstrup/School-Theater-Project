<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp" %>
	
<div class="container">

	<form action="/auth/signup" method="post">
		<div class="form-group">
			<label for="username">Username</label> 
			<input type="text" name="username" class="form-control" placeholder="Enter username" id="username" required="required" maxlength="20">
		</div>
		
		<div class="form-group">
			<label for="password">Password</label> 
			<input type="password" name="password" class="form-control" placeholder="Enter password" id="password" required="required" maxlength="16">
		</div>
		
		<div class="form-group">
			<label for="email">Email address</label> 
			<input type="email" name="email" class="form-control" placeholder="Enter email" id="email" required="required">
		</div>
	
	<button id="btn-save" class="btn btn-primary">회원가입완료</button>	
	</form>
	

</div>

<script src="/js/auth.js"></script>
<%@ include file="../layout/footer.jsp" %>