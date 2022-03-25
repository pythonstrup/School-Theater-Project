
$("#username").blur(function() {
		// id = "id_reg" / name = "userId"
		var username = $('#username').val();
		$.ajax({
			url : '${pageContext.request.contextPath}/auth/signup/?userId='+ username,
			type : 'get',
			success : function(data) {
				console.log("1 = 중복o / 0 = 중복x : "+ data);							
				
				if (data == 1) {
						// 1 : 아이디가 중복되는 문구
						$("#id_check").text("사용중인 아이디입니다 :p");
						$("#id_check").css("color", "red");
						$("#reg_submit").attr("disabled", true);
					} else {
						
						if(idJ.test(user_id)){
							// 0 : 아이디 길이 / 문자열 검사
							$("#id_check").text("");
							$("#reg_submit").attr("disabled", false);
				
						} else if(user_id == ""){
							
							$('#id_check').text('아이디를 입력해주세요 :)');
							$('#id_check').css('color', 'red');
							$("#reg_submit").attr("disabled", true);				
							
						} else {
							
							$('#id_check').text("아이디는 소문자와 숫자 4~12자리만 가능합니다 :) :)");
							$('#id_check').css('color', 'red');
							$("#reg_submit").attr("disabled", true);
						}
						
					}
				}, error : function() {
						console.log("실패");
				}
			});
		});

/*
function signup() {
	
	let data = {
		username: $("#username").val(),
		password: $("#password").val(),
		email: $("#email").val()
	};
	
	$.ajax({
		type: "POST",
		url: "/auth/signup",
		data: JSON.stringify(data),
		contentType: "aplication/json; charset=utf-8",
		dataType: "json"
	}).done(res=>{
		if (response.status == 500) {
			alert("아이디 중복입니다. 회원가입에 실패했습니다.");
		} else {
			alert("회원가입이 완료되었습니다.");
			location.href ="/";
		}
	}).fail(error=>{
		alert("회원가입에 실패했습니다.");
	});
}
*/