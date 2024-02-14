import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties prop = new Properties();
        FileInputStream input = null;

        try {
            input = new FileInputStream("conf/config.properties");
            prop.load(input);

            String wsUrlEmployee = prop.getProperty("ws_url_service_employee");
            String wsUrlOrganization = prop.getProperty("ws_url_service_organization");
            String wsUrlToken = prop.getProperty("ws_url_service_token");
            String securityCode = prop.getProperty("security_code");

            System.out.println("ws_url_service_employee: " + wsUrlEmployee);
            System.out.println("ws_url_service_organization: " + wsUrlOrganization);
            System.out.println("ws_url_service_token: " + wsUrlToken);
            System.out.println("security_code: " + securityCode);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
