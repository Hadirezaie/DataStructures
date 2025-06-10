package DataStructures.hashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class UserInfo {
    private int userId;
    private String username;
    private String email;

    public UserInfo(int userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class UserManagementSystem {

    private Map<Integer, UserInfo> userMap = new HashMap<>();
    private Set<String> activeUsernames = new HashSet<>();

    // add user
    public void addUser(UserInfo user) {
        if (activeUsernames.contains(user.getUsername())) {
            System.out.println("Username already exists: " + user.getUsername());
            return;
        }

        userMap.put(user.getUserId(), user);
        activeUsernames.add(user.getUsername());
        System.out.println("User added: " + user);
    }

    // delete user
    public void removeUser(int userId) {
        UserInfo removedUser = userMap.remove(userId);
        if (removedUser != null) {
            activeUsernames.remove(removedUser.getUsername());
            System.out.println("User removed: " + removedUser);
        } else {
            System.out.println("User not found with ID: " + userId);
        }
    }

    // show users
    public void showAllUsers() {
        System.out.println("\n=== All Users ===");
        for (UserInfo user : userMap.values()) {
            System.out.println(user);
        }
        System.out.println("==================\n");
    }

    // show active users
    public void showActiveUsernames() {
        System.out.println("Active Usernames: " + activeUsernames);
    }

    public static void main(String[] args) {
        UserManagementSystem ums = new UserManagementSystem();

        UserInfo user1 = new UserInfo(101, "ali", "ali@example.com");
        UserInfo user2 = new UserInfo(102, "sara", "sara@example.com");
        UserInfo user3 = new UserInfo(103, "reza", "reza@example.com");
        UserInfo user4 = new UserInfo(104, "ali", "ali2@example.com"); // duplicated username
        ums.addUser(user1);
        ums.addUser(user2);
        ums.addUser(user3);
        ums.addUser(user4); // the user with this username already added.

        ums.showAllUsers();
        ums.showActiveUsernames();

        ums.removeUser(102); // delete user with id: 102
        ums.showAllUsers();
        ums.showActiveUsernames();
    }
}
