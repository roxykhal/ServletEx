In this project, we start by setting up a basic Servlet on Tomcat to understand how the HTTP request-response lifecycle works before transitioning to Spring Boot for the actual application. This helps provide insight into how web requests are processed, which is foundational for more complex frameworks like Spring.

Steps for Manual Servlet Setup:

Add the Servlet to Tomcat:

Create a simple servlet in Java that handles HTTP requests and responses.
Add the tomcat dependecy in the POM file
Invoke the Servlet:
Use a browser or a tool like curl or Postman to send HTTP requests to the servlet and observe the responses.
View the logs in the Tomcat console to see the lifecycle and debug output.

What's Happening Behind the Scenes:
The HTTP request goes through the servlet container (Tomcat).
The servlet processes the request, executes logic, and generates a response.
Tomcat returns the response to the client, completing the cycle.
