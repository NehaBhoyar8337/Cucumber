Feature: User access to mercury tours application
 
 @Test1
 Scenario: Login Screen check
 When user open the "chrome" browser
 And user enter application url "http://demo.guru99.com/test/newtours/index.php"
 
 @Test2
 Scenario: Enter Username and Password
 When enter username as "QQQQQ"
 And enter password as "qqqqq"
 Then we get sucess page