function validate(){
	var name=document.getElementById("name");
	if(name==''){
		alert("Please Enter a Valid Name ");
		return false;
	}else{
		return true;
	}
	
}