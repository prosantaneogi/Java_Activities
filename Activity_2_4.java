package javaActivity2;

public class Activity_2_4 {

	public static void main(String[] a){
		        try {
		            Activity_2_4.exceptionTest("Will print to console");
		            Activity_2_4.exceptionTest(null);
		            Activity_2_4.exceptionTest("Won't execute");
		        } catch(CustomException mae) {
		            System.out.println("Inside catch block: " + mae.getMessage());
		        }
		    }

		    static void exceptionTest(String str) throws CustomException {
		        if(str == null) {
		            throw new CustomException("String value is null");
		        } else {
		            System.out.println(str);
		        }
		    }
	}

