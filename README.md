The project is created to send short message to the mobile numbers.

For sending sms you have to send either get request or the post request. Refer below for sending the get and lthe post request.

Hit the below URL for the Get Request.
http://localhost:8080/send-sms?phoneNumber=<MobileNumber>&message=<Message>
where the Mobile Number should contain the countrycode as well. For example +91 9876543210. And the Message will be the text message you want to send to the mobile number. For example Hello%20from%20Spring%20Boot%20Application

Example URL:- http://localhost:8080/send-sms?phoneNumber=+919876543210&message=Hello%20from%20Spring%20Boot%20Application


Send the Post request by the JSON object as per below.
URL:-http://localhost:8080/send-sms
Body:-
{
  "message": "Hello from Spring Boot",
  "phoneNumber": "+919876543210"
}
