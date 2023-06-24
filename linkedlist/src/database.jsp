<%@page contentType="text/html" pageEncoding="UTF-8"%>


<script>
function show()
{

var form=document.getElementById("f2");


form.style.display="block"; return true;
}
function valid(){
var pass=document.forms["f2"]["t6"].value; if(pass==""){
alert("No Password : "+pass); return false;
}
else{
alert("Hello Password : "+pass); return true;
}
/*if(pass==null or pass==""){ alert("Enter PAssword"); return false;
}

else{
//var pass=document.getElementById("t6").value;

alert("Hello Password : "+pass); return true;
}*/
}
</script>
<table border="1" style="width: 100%">
<thead>

<tr>
<th colspan="2" style="height: 80px;font-size: 20;font-family: fantasy;font-weight: bold;color: brown">
<img src="Image/nine.jpg" width="1210" height="150" alt="No Image Found..."/>
</th>
</tr>
</thead>
<tbody>
<tr>
<td colspan="2" style="width: 40px">
<jsp:include page="main_menu.jsp"></jsp:include>
</td>

</tr>
<tr>
<td style="width: 30%;height: 300px"> <jsp:include page="main/left.jsp" /></td>
<td style="width: 70%">
<table border="0" style="width: 100%">

<tbody>
<tr>
<td style="text-align: center">

<form action="login_code.jsp" name="f1">

<tbody>
<tr>
<td>
<center>
<table border="1">
<thead>
<tr>
<th colspan="3" style="background-color: blueviolet">Login</th>

</tr>
</thead>
<tbody>
<tr>
<td rowspan="4"><img src="Image/ten.jpg" width="80px" height="76px"></td>
</tr>
<tr style="background-color: aliceblue">
<td>Select User</td>
<td><select name="ddl1">
<option value="Select">Select User</option>
<option value="Admin">Admin</option>
<option value="User">User</option>

</select></td>
</tr>
<tr>
<td style="width: 130px">Enter Id</td>
<td><input type="text" name="t1" placeholder="Login Id..." value="" size="20" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="t2" placeholder="Password...?" value="" size="20" /></td>
</tr>
<tr style="background-color: aliceblue">
<td colspan="3" style="text-align: center"><a href="#">Forgotten Account...?</a></td>
</tr>
<tr style="background-color: cadetblue">

<td colspan="3" style="text-align: center"><input type="submit" value="Submit" name="b1" /><input type="button" value="Sign Up" name="b2" onclick="return show()" /></td>
</tr>
</tbody>
</table>
</center>
</td>
</tr>
</tbody>



</form>

</td>
</tr>
<tr>
<td>
<form id="f2" name="f2" style="display: none" action="client_reg_code.jsp">
<center>
<table border="0">
<thead>
<tr>
<th>Client Registration</th>
</tr>
</thead>
<tbody>
<tr>

<td><input placeholder="Aadhar Number" type="text" name="t1" value="" size="20" /></td>
</tr>
<tr>

<td><input placeholder="Your Name" type="text" name="t2" value="" size="20" /></td>
</tr>
<tr>

<td><input type="radio" name="gender" value="Male" />Male<input type="radio" name="gender" value="Female" />Female</td>
</tr>
<tr>

<td><input placeholder="Contact" type="text" name="t3" value="" size="20" /></td>
</tr>
<tr>

<td><input placeholder="Age" type="text" name="t4" value="" size="20" /></td>
</tr>
<tr>

<td><select name="ddl1">
<option>Select</option>
<option>High School</option>
<option>Higher Secondary</option>
<option>Graduation</option>
<option>Post Graduation</option>
</select></td>
</tr>
<tr>

<td><input placeholder="User Id" type="text" name="t5" value="" size="20" /></td>
</tr>
<tr>

<td><input placeholder="New Password" type="password" name="t6" value="" size="20" /></td>
</tr>
<tr>

<td><input placeholder="Renter Password" type="password" name="t7" value="" size="20" /></td>
</tr>

<tr>

<td><select name="ddl2">
<option>Select Question</option>
<option>Your Nick Name...?</option>
<option>Your Pet Name...?</option>
<option>Your Favourite Color...?</option>
</select></td>
</tr>
<tr>

<td><input type="text" placeholder="Your Answer" name="t8" value="" size="20" /></td>
</tr>
<tr>
<td colspan="2" style="text-align: center"><input type="submit" value="Submit" name="b1" onclick=" return valid()" /></td>

</tr>
</tbody>
</table>
</center>

</form>
</td>
</tr>
</tbody>
</table>
</td>
</tr>
<tr>
<td colspan="2"> <jsp:include page="main/footer.jsp" /></td>

</tr>

</tbody>
</table>
