<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<!-- Begin Page Content -->
<div class="container-fluid">

	<!-- Page Heading -->
	<div class="d-sm-flex align-items-center justify-content-between mb-4">
		<h1 class="h3 mb-0 text-gray-800">공지사항 관리</h1>
		<a class="btn btn-primary" href="/admin/noticeManageInsert"
			role="button">공지사항 등록</a>
	</div>

	<!-- Content Row -->
	<div class="container">
	<table class="table">
		<tr>
			<th>공지사항번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>

		<c:forEach var="nl" items="${noticeList}">
			<tr>
				<td class="no">${nl.noticeNo}</td>
				<td>${nl.noticeTitle}</td>
				<td>${nl.noticeUserId}</td>
				<td>
					<fmt:formatDate value="${mr.noticeDate}" pattern="yy/MM/dd"/>
				</td>
			</tr>
		</c:forEach>
	</table>
	</div>

</div>
<!-- /.container-fluid -->
</div>
<!-- End of Main Content -->
<%@include file="footer.jsp"%>