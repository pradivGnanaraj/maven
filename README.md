# Selenium Webdriver (Maven and testNG)


Why Selenium?
	Selenium is open source.
	Selenium works with java, python, c# and so on.
	Selenium driver works across all operating systems.

Architecture overview:
	Selenium driver (client) -> {json} http protocol -> browser driver -> browser
							<- {json} http protocol <- browser driver <- browser actions

Check if the PATH is set : 
	(base) pradivgnanaraj@Pradivs-MacBook-Air ~ % source ~/.bash_profile
	(base) pradivgnanaraj@Pradivs-MacBook-Air ~ % echo $JAVA_HOME
	/Library/Java/JavaVirtualMachines/jdk-20.jdk/Contents/Home
	(base) pradivgnanaraj@Pradivs-MacBook-Air ~ % 

Maven:
	Use maven repository and get selenium-java 
	configure maven in the project 
	add source code -> pom.xml (save and check for maven dependecies folder for .jar files) 

Create a class to invoke to drive:
	src -> public static void --> 
		WebDriver driver = new ChromeDriver(); 

	==> internal class methods of a particular bowsers drivers are not applicable for other browsers. as a result we restrict the implementaion to WebDriver.

