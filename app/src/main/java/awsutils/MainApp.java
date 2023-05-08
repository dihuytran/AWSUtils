import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DpsTools dpsTools = new DpsTools();

        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Create a bucket");
            System.out.println("2. Upload a file to S3 Bucket");
            System.out.println("3. Download file from S3 bucket");
            System.out.println("4. Retrieve messages from SQS");
            System.out.println("5. Submit a message to SQS");
            System.out.println("6. Submit a message to SNS");
            System.out.println("7. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    dpsTools.createBucket();
                    break;
                case 2:
                    dpsTools.uploadFileToS3();
                    break;
                case 3:
                    dpsTools.downloadFileFromS3();
                    break;
                case 4:
                    dpsTools.retrieveMessagesFromSQS();
                    break;
                case 5:
                    dpsTools.submitMessageToSQS();
                    break;
                case 6:
                    dpsTools.submitMessageToSNS();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
}