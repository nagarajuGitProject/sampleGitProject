package sampleProject;

public class Test1 {

	public static void main(String[] args) {
		
		
		String actUrl = "https://www.google.com";
		String expUrl = "https://www.Google.com";
		
		if(actUrl.equals(expUrl)) {
			System.out.println("verified url");
		}else
		{
			System.out.println("does not verified");
		}
		

	}

}
