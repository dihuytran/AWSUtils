import java.util.Scanner;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.core.ResponseBytes;
import software.amazon.awssdk.core.SdkBytes;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;

public class DpsTools {

    private static final Region REGION = Region.US_EAST_1;
    private final S3Client s3Client;

    public DpsTools() {
        this.s3Client = S3Client.builder()
                .credentialsProvider(DefaultCredentialsProvider.create())
                .region(REGION)
                .build();
    }

    public void createBucket() {
        // TODO: implement createBucket method
    }

    public void uploadFileToS3() {
        // TODO: implement uploadFileToS3Bucket method
    }

    public void downloadFileFromS3() {
        // TODO: implement downloadFileFromS3Bucket method
    }

    public void retrieveMessagesFromSQS() {
        // TODO: implement retrieveMessagesFromSQS method
    }

    public void submitMessageToSQS() {
        // TODO: implement submitMessageToSQS method
    }

    public void submitMessageToSNS() {
        // TODO: implement submitMessageToSNS method
    }
}
