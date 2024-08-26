import java.io.*;

class ReportC {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the grade of 1st subject:");
        int g1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the grade of 2nd subject:");
        int g2 = Integer.parseInt(br.readLine());
        System.out.println("Enter the grade of 3rd subject:");
        int g3 = Integer.parseInt(br.readLine());
        
        int failedSub = 0;
		
        switch (g1 <= 40 ? 1 : 0) {
            case 1: 
                failedSub++;
        }
 
        switch (g2 <= 40 ? 1 : 0) {
            case 1: 
                failedSub++;
        }
       
        switch (g3 <= 40 ? 1 : 0) {
            case 1: 
                failedSub++;
        }

        switch (failedSub) {
            case 0:
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed in " + failedSub + " subject(s)");
        }
    }
}

