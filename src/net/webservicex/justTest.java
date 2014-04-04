package net.webservicex;
import java.rmi.RemoteException;
import com.qosData.QosDataSet;
import junit.framework.TestCase;
public class justTest extends TestCase {
	 public void testGetWeather() throws RemoteException {
		   long startMili=System.currentTimeMillis();
	       GlobalWeather globalWeather = new GlobalWeather();
	       GlobalWeatherSoap globalWeatherSoap = globalWeather.getGlobalWeatherSoap();
	       globalWeatherSoap.getWeather("Guangzhou", "China");
	       long endMili = System.currentTimeMillis();
	       QosDataSet  qosDataSet = new QosDataSet();
	       qosDataSet.setQosResponseTime(startMili, endMili);
	       System.out.println(qosDataSet.getQosResponseTime());
	    }
	 
//	    public void testGetCitiesByCountry() throws RemoteException {
//	       GlobalWeather globalWeather = new GlobalWeather();
//	       GlobalWeatherSoap globalWeatherSoap = globalWeather.getGlobalWeatherSoap();
//	       System.out.println(globalWeatherSoap.getCitiesByCountry("China"));
//	    }
	
}
