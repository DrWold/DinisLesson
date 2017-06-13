package lessons.lessons012;


public class SingletonConnection {

    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void executeSql(String sql) {
        System.out.println("Executing......");
    }


    private SingletonConnection() {
    }

    private SingletonConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    private static SingletonConnection connection = null;

    public static SingletonConnection createConnection(String url, String password, String username) {
        if (connection == null)
            connection = new SingletonConnection(url, username, password);
        return connection;
    }

    public static SingletonConnection getInstance() {
        return connection;
    }

}
