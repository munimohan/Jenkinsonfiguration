
package net.webservicex;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2017-02-04T00:57:39.354+05:30
 * Generated source version: 2.7.4
 * 
 */
public final class GeoIPServiceHttpPost_GeoIPServiceHttpPost_Client {

    private static final QName SERVICE_NAME = new QName("http://www.webservicex.net/", "GeoIPService");

    private GeoIPServiceHttpPost_GeoIPServiceHttpPost_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GeoIPService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        GeoIPService ss = new GeoIPService(wsdlURL, SERVICE_NAME);
        GeoIPServiceHttpPost port = ss.getGeoIPServiceHttpPost();  
        
        {
        System.out.println("Invoking getGeoIP...");
        java.lang.String _getGeoIP_ipAddress = "_getGeoIP_ipAddress-901100570";
        net.webservicex.GeoIP _getGeoIP__return = port.getGeoIP(_getGeoIP_ipAddress);
        System.out.println("getGeoIP.result=" + _getGeoIP__return);


        }
        {
        System.out.println("Invoking getGeoIPContext...");
        net.webservicex.GeoIP _getGeoIPContext__return = port.getGeoIPContext();
        System.out.println("getGeoIPContext.result=" + _getGeoIPContext__return);


        }

        System.exit(0);
    }

}
