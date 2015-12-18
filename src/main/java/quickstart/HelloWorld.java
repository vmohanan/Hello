package quickstart;

import org.apache.commons.httpclient.HttpURL;
import org.apache.commons.httpclient.URIException;

/**
 * Created by vxmohana on 12/15/15.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int fgy=0;
        System.out.println("Hello, World!");

        try {
            HttpURL httpURL = new HttpURL("www.google.com");
            fgy=1;
        } catch (URIException e) {
            e.printStackTrace();
        }
    }
}
