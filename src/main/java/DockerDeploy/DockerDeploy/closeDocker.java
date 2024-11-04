package DockerDeploy.DockerDeploy;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class closeDocker {
	
	@AfterTest
	public void closeDockerContainer() throws IOException, InterruptedException {
		
		Runtime runTime = Runtime.getRuntime();
		runTime.exec("cmd /c start closeDocker.bat");
		Thread.sleep(10000);
		System.out.println("Check if Closed");
		
	}

}
