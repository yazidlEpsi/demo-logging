package dev.console;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App {
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	public static void main(String[] args) {
		LOG.warn("Bonjour Slf4J !");LOG.info("Impl�mentation Logback");
		new AppService().executer("valeur 1"); 

	}
}