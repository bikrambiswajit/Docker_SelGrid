package DockerDeploy.DockerDeploy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.Thread;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class startDocker {
	@BeforeTest
	public void startSystem() throws IOException, InterruptedException {
		
		Runtime runTime = Runtime.getRuntime();
		runTime.exec("cmd /c start dockerup.bat");
		Thread.sleep(20000);
		
		String outputfile = "server1.log";
		
		BufferedReader br = new BufferedReader(new FileReader(outputfile));
		
		String currentLine = br.readLine();
		
	while(currentLine!=null) {
		
		if(currentLine.contains("Node has been added")) {
			
			System.out.println("Server Started!!");
			break;
			
		}
		currentLine = br.readLine();
	}
	br.close();
	runTime.exec("cmd /c start scale.bat");
	Thread.sleep(7000);	
	
	}

}
