
# This will compile the project and pack it into a war file. the war file can then be copied over to the tomcat/webapps directory for deployment

call mvn clean
call mvn compile
call mvn war:war