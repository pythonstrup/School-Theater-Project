<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../layout/header.jsp"%>



<div class="container">
	<h1>영화등록</h1><br/>
	<form action="#" method="post">
		<div class="row g-2">
			<div class="col-auto">
				<label for="genre">영화 장르: </label>
			</div>
			<div class="col-auto">
				<select  class="form-select" id="genre_selector" name="genre"  required="required">
					<option val="액션/스릴러">액션/스릴러</option>
					<option val="로맨스">로맨스</option>
					<option val="한국드라마">한국드라마</option>
					<option val="외국드라마">외국드라마</option>
					<option val="애니메이션">애니메이션</option>
					<option val="코미디">코미디</option>
					<option val="다큐멘터리">다큐멘터리</option>
				</select>
			</div>
		</div><br/>
		
		<div class="row g-2">
			<div class="col-auto"><label for="genreId">영화 번호: </label></div>
			<div class="col-auto">
				<input type="text" name="genreId" class="form-control" placeholder="영화 번호 입력" id="genreId" required="required"></input>
			</div>
		</div><br/>
		
		<div class="row g-5" role="form">
			<div class="col-auto">
			<label for="genre">영화 런타임: </label>
			</div>
			<div class="col-auto">
				<select class="form-select  input-lg" name="hour"  id="hour_selector"  required="required"></select>
			</div>
			<div class="col-auto">
				시간
			</div>
			<div class="col-auto">
				<select class="form-select  input-lg" name="minute" id="minute_selector"  required="required"></select>
			</div>
			<div class="col-auto">
				분
			</div>
		</div><br/>
		
		<div class="row g-2">
			<div class="col-auto">
				<label for="genre">영화 제목</label>
			</div>
			<div class="col-auto">
				<input type="text" name="title" class="form-control" placeholder="영화 제목 입력" id="title" required="required"></input>
			</div>
		</div><br/>
		
		<button id="movie-btn" class="btn btn-primary">입력완료</button>
	</form>
</div>

<script src="/js/movie.js"></script>
<%@ include file="../layout/footer.jsp"%>