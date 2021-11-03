<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <div class="d-sm-flex align-items-center justify-content-between mb-4">
            <h1 class="h3 mb-0 text-gray-800">공지사항 관리</h1>
          </div>

          <!-- Content Row -->
          <div class="row">
          	<form class="notice" action="/admin/noticeInsert" method="post">
          		
            제목
             내용
        등록
                   
            	<input type="submit" class="btn btn-primary btn-user btn-block" value="등록"> 
                
          	</form>
          </div>

        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->
            
            
  <%@include file="footer.jsp" %>