package serviceLocator;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ServiceLocator {
	private static ServiceLocator instance;
	private static Map<String, Object> map;
	private static Context context;

	public synchronized Object getProxy(String jndiName) {
		Object proxy = null;
		proxy = map.get(jndiName);
		if (proxy == null) {
			try {
				proxy = context.lookup(jndiName);
			} catch (NamingException e) {
				e.printStackTrace();
			}
			map.put(jndiName, proxy);
		}

		return proxy;

	}

	private ServiceLocator() {
		map = new HashMap<>();
		try {
			context = new InitialContext();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public synchronized static ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}

}
