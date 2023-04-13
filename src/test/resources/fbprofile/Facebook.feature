Feature: Facebook

Background: common fumction
 Given launch the url "https://www.facebook.com"
 And  create account
 @smoke
Scenario: oops
	Given user clicks
	When user sends
	
	@smoke
Scenario Outline: output
 Given User clicks on create account
 When user enters the firstname with one dim map "<firstname>"
 When user enters the surname with one dim map "<sname>"
 Then user send email "<email>"
 When user send password "<pass>"
 Then user send dropdown
 When user select gender
 Then user click sign up
 
 Examples:
 |firstname|sname|email|pass|
 |giri|dharan|giridharan@gmail.com|ddsbjd6759|
 |arumugam|m|arumugamajith@gmail.com|safhsasa67| 
 |aramudhan|a|aramudhan@gmail.com|amudhan123|
  
