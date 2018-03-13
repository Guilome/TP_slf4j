/**
 * 
 */
package dev.service;

//import
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ETY0004
 *
 */
public class AppService {
	
	private static final Logger LOG = LoggerFactory.getLogger(AppService.class);
	
	public void executer(String param) {
		LOG.debug("Traitement 1 : param = {}", param);
	}

}
