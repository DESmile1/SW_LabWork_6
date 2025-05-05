public class User {
    private String username;
    private String passwordHash;
    
    public User(String username, String password) {
        this.username = username;
        this.passwordHash = hashPassword(password);
    }
    
    private String hashPassword(String password) {
        // Реализация хеширования пароля
        return "hashed_" + password;
    }
    
    // Геттеры и сеттеры
    public String getUsername() { return username; }
    public String getPasswordHash() { return passwordHash; }
}
