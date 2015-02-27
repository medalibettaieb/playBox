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

	public  Object getProxy(String jndiName) {
		Object object = null;
		if (map.containsKey(jndiName)) {
			object = map.get(jndiName);
		} else {
			try {
				object = context.lookup(jndiName);
				map.put(jndiName, object);
			} catch (NamingException e) {
				e.printStackTrace();
			}
		}
		return object;

	}

	private ServiceLocator() {
		try {
			context = new InitialContext();
			map = new HashMap<>();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

}
