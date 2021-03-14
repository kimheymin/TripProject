<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>아이디 비밀번호 찾기</title>
		<script src="http://code.jquery.com/jquery-2.2.4.min.js"></script>
		<style>
            table,td,th{
                border: 1px solid black;
                border-collapse: collapse;
                padding: 5px 10px;
            }
            table{
            	width:500px;
            }
            #fieldset1{
                padding: 20px 30px;
                width: 500px;
                margin: auto;
                margin-top: 10%;
                border: 1px solid white;
                background-color: whitesmoke;
            }
            #fieldset2{
            	padding: 20px 30px;
            	width: 500px;
            	margin: auto;
            	border: 1px solid white;
            	background-color: whitesmoke;
            }
            div{
                margin-bottom: 10px;
            }
        </style>
	</head>
	<body>
	<h2 style="text-align : center">아이디 비밀번호 찾기</h2>
	<form action="findId" method="POST">
		<fieldset id="fieldset1">
            <div>아이디 찾기</div>
            <table>
                <tr>
                    <th>이름</th>
                    <td>
                        <input type="text" id="userName1" name="userName" placeholder="이름을 입력해주세요."/>
                    </td>
                </tr>
                <tr>
                    <th>핸드폰 번호</th>
                    <td>
                        <input type="text" id="userPhone1" name="userPhone" maxlength="13" placeholder="핸드폰번호를 입력해주세요."/>
                    </td>
                </tr>
            </table>
            <div style="text-align: right;">
                <button id="btn1" type="submit">찾기</button>
            </div>
        </fieldset>
	</form>
	
	<form action="findPw" method="POST">
        <fieldset id="fieldset2">
            <div>비밀번호 찾기</div>
            <table>
                <tr>
                    <th>아이디</th>
                    <td>
                        <input type="text" id="userId" name="userId" placeholder="아이디를 입력해주세요."/>
                    </td>
                </tr>
                <tr>
                    <th>이름</th>
                    <td>
                        <input type="text" id="userName2" name="userName" placeholder="이름을 입력해주세요."/>
                    </td>
                </tr>
                <tr>
                    <th>핸드폰 번호</th>
                    <td>
                        <input type="text" id="userPhone2" name="userPhone" maxlength="13" placeholder="핸드폰번호를 입력해주세요."/>
                    </td>
                </tr>
            </table>
            <div style="text-align: right;">
                <button id="btn2">찾기</button>
            </div>
        </fieldset>
	</form>
	</body>
	<script>
		var nameChk = false;
		var phoneChk = false;
		var idChk = false;
		
        $('#userName1').focusout(function(){
            if($(this).val()==''){
                 alert('이름을 입력해주세요.');
                 $(this).focusin();
             }else{
                 nameChk = true;
             }
         });
        
        $('#userPhone1').focusout(function(){
            if($(this).val()==''){
                 alert('번호를 입력해주세요.');
                 $(this).focusin();
             }else{
                 phoneChk = true;
             }
         });
	
	
		$('#userPhone1').keydown(function(event) {
	        var key = event.charCode || event.keyCode || 0;
	        $text = $(this);
	        if (key !== 8 && key !== 9) {
	            if ($text.val().length == 3) {
	                $text.val($text.val() + '-');
	            }
	            if ($text.val().length == 8) {
	                $text.val($text.val() + '-');
	            }
	        }
	     
	        return (key == 8 || key == 9 || key == 46 || (key >= 48 && key <= 57) || (key >= 96 && key <= 105));          
    	});
	
	
		$("#btn1").click(function(){
			var $name = $("#userName");
			var $phone = $("#userPhone");
		});
		
		$("#btn2").click(function(){
			
		});
	</script>
</html>