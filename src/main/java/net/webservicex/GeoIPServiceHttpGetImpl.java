
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package net.webservicex;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2017-02-05T11:56:39.657+05:30
 * Generated source version: 2.7.4
 * 
 */

@javax.jws.WebService(
                      serviceName = "GeoIPService",
                      portName = "GeoIPServiceHttpGet",
                      targetNamespace = "http://www.webservicex.net/",
                      wsdlLocation = "http://www.webservicex.net/geoipservice.asmx?WSDL",
                      endpointInterface = "net.webservicex.GeoIPServiceHttpGet")
                      
public class GeoIPServiceHttpGetImpl implements GeoIPServiceHttpGet {

    private static final Logger LOG = Logger.getLogger(GeoIPServiceHttpGetImpl.class.getName());

    /* (non-Javadoc)
     * @see net.webservicex.GeoIPServiceHttpGet#getGeoIP(java.lang.String  ipAddress )*
     */
    public net.webservicex.GeoIP getGeoIP(java.lang.String ipAddress) { 
        LOG.info("Executing operation getGeoIP");
        System.out.println(ipAddress);
        try {
            net.webservicex.GeoIP _return = new net.webservicex.GeoIP();
            _return.setReturnCode(-351257110);
            _return.setIP("IP325127049");
            _return.setReturnCodeDetails("ReturnCodeDetails-1760559198");
            _return.setCountryName("CountryName1052431263");
            _return.setCountryCode("CountryCode1441003765");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.webservicex.GeoIPServiceHttpGet#getGeoIPContext(*
     */
    public net.webservicex.GeoIP getGeoIPContext() { 
        LOG.info("Executing operation getGeoIPContext");
        try {
            net.webservicex.GeoIP _return = new net.webservicex.GeoIP();
            _return.setReturnCode(1535530557);
            _return.setIP("IP-2005410552");
            _return.setReturnCodeDetails("ReturnCodeDetails1298337076");
            _return.setCountryName("CountryName1996786863");
            _return.setCountryCode("CountryCode-1323415896");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
