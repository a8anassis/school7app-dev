# **Requirements**

---

- JDK 17
- Apache Tomcat 10.1

# **Installation**

---

## **Manual Upload**

1. Just run 'mvn clean package' in root dir of the app
2. Start the web server with startup.bat (Windows) or startup.sh (linux/macOS) 
3. Copy /target/school7.war in webapps folder of the Server

# **Usage**

---
The server will be listening on localhost:8080/school7. The last part of the path (/school) is the name of the war file.