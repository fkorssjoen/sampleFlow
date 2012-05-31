import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.ValveBase;

import javax.servlet.ServletException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created with IntelliJ IDEA.
 * User: fmarich
 * Date: 31/05/12
 * Time: 14:22
 * To change this template use File | Settings | File Templates.
 */
public class CustomValve extends ValveBase
{
    @Override
    public void invoke(Request request, Response response) throws IOException, ServletException
    {


        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        ObjectOutput out = new ObjectOutputStream(outputStream);

        out.writeObject(request.getSession());

        MessageDigest m= null;
        try {
            m = MessageDigest.getInstance("MD5");
            m.update(outputStream.toByteArray(),0,s.length());
            System.out.println("MD5 Session: "+new BigInteger(1,m.digest()).toString(16));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }





    }
}
