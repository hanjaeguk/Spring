function formCheck(guestForm){	
	var guestForm=document.getElementById("guestForm");
	
	if(guestForm.name.value==""){
		alert("이름을 입력하세요.");
		guestForm.name.focus();
		return false;
	}
	
	if(guestForm.password.value==""){
		alert("비밀번호을 입력하세요.");
		guestForm.password.focus();
		return false;
	}
	
	if(guestForm.message.value==""){
		alert("메시지를 입력하세요.");
		guestForm.message.focus();
		return false;
	}
}

function deleteCheck(urlNum){	
//	alert(urlNum);
	var value=confirm("정말로 삭제 하겠습니까?");
	if(value==true){
		location.href=urlNum;
	}else{
		alert("삭제 되지 않았습니다.");
	} 
}
