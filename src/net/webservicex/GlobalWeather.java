package net.webservicex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * GlobalWeather service = new GlobalWeather();
 * GlobalWeatherSoap portType = service.getGlobalWeatherSoap();
 * portType.getWeather(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "GlobalWeather", targetNamespace = "http://www.webserviceX.NET", wsdlLocation = "http://www.webservicex.net/globalweather.asmx?WSDL")
public class GlobalWeather extends Service {

	private final static URL GLOBALWEATHER_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(net.webservicex.GlobalWeather.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = net.webservicex.GlobalWeather.class.getResource(".");
			url = new URL(baseUrl,
					"http://www.webservicex.net/globalweather.asmx?WSDL");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://www.webservicex.net/globalweather.asmx?WSDL', retrying as a local file");
			logger.warning(e.getMessage());
		}
		GLOBALWEATHER_WSDL_LOCATION = url;
	}

	public GlobalWeather(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public GlobalWeather() {
		super(GLOBALWEATHER_WSDL_LOCATION, new QName(
				"http://www.webserviceX.NET", "GlobalWeather"));
	}

	/**
	 * 
	 * @return returns GlobalWeatherSoap
	 */
	@WebEndpoint(name = "GlobalWeatherSoap")
	public GlobalWeatherSoap getGlobalWeatherSoap() {
		return super.getPort(new QName("http://www.webserviceX.NET",
				"GlobalWeatherSoap"), GlobalWeatherSoap.class);
	}

	/**
	 * 
	 * @return returns GlobalWeatherSoap
	 */
	@WebEndpoint(name = "GlobalWeatherSoap12")
	public GlobalWeatherSoap getGlobalWeatherSoap12() {
		return super.getPort(new QName("http://www.webserviceX.NET",
				"GlobalWeatherSoap12"), GlobalWeatherSoap.class);
	}

	/**
	 * 
	 * @return returns GlobalWeatherHttpGet
	 */
	@WebEndpoint(name = "GlobalWeatherHttpGet")
	public GlobalWeatherHttpGet getGlobalWeatherHttpGet() {
		return super.getPort(new QName("http://www.webserviceX.NET",
				"GlobalWeatherHttpGet"), GlobalWeatherHttpGet.class);
	}

	/**
	 * 
	 * @return returns GlobalWeatherHttpPost
	 */
	@WebEndpoint(name = "GlobalWeatherHttpPost")
	public GlobalWeatherHttpPost getGlobalWeatherHttpPost() {
		return super.getPort(new QName("http://www.webserviceX.NET",
				"GlobalWeatherHttpPost"), GlobalWeatherHttpPost.class);
	}

}
