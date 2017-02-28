package ec.edu.uisrael.wslocalizacion0002.wsdl.util;
/**
 * (c) 2017 Salinas Henry  
 * (c) 2017 in House
 * 
 * @author Salinas Henry  
 * @since 13:46:22 - 14.09.2017
 */

public interface IWsdlEvents {
    public void WsdlStartedRequest();
    public void WsdlFinished(String methodName,Object Data);
    public void WsdlFinishedWithException(Exception ex);
    public void WsdlEndedRequest();
}
