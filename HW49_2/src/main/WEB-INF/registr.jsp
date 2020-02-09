<form action="${pageContext.request.contextPath}/registr" method = "post">
    Username: <input type="text" name="login"/>
  <br>
  Password: <input type="password" name="password"/>
    <br>
    Email: <input type="email" name="email"/>
      <br>
     Gender: <input type="radio" name="gender" value="male"/> Male<br>
             <input type="radio" name="gender" value="female"> Female<br>
             <input type="radio" name="gender" value="other"> Other
        <br>
        <input type="submit"  value="confirm"/>
</form>
