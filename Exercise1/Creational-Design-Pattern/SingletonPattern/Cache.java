import java.util.HashMap;
import java.util.Map;

public class Cache {
    private static Cache instance;
    private Map<String, Object> cacheMap;

    private Cache() {
        cacheMap = new HashMap<>();
    }

    public static Cache getInstance() {
        if (instance == null) {
            instance = new Cache();
        }
        return instance;
    }

    public void put(String key, Object value) {
        cacheMap.put(key, value);
    }

    public Object get(String key) {
        return cacheMap.get(key);
    }

    public static void main(String[] args) {
        Cache cache = Cache.getInstance();
        cache.put("user1", new User("John Doe", 30));

        User user1 = (User) cache.get("user1");
        System.out.println("User1: " + user1.getName() + ", Age: " + user1.getAge());


        Cache anotherCacheReference = Cache.getInstance();
        System.out.println("Is it the same cache instance? " + (cache == anotherCacheReference));

        anotherCacheReference.put("user3", new User("Bob Johnson", 35));

        User user3 = (User) cache.get("user3");
        System.out.println("User3: " + user3.getName() + ", Age: " + user3.getAge());
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}