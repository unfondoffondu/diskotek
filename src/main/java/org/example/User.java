package org.example;
class User {
    /**
     * Basic user fields to allow for login. This is just a place holder, I am relying on my team to build more functional
     * User abstract classes and interfaces, and I look forward to seeing them.
     */
    public String name;
    public int age;
    public String password;
    public boolean isAdmin = false;
    public String userName;

//    public User(String name, boolean b, String finalPW, String uName, int age) {
//    }

//    public User(String name, boolean isAdmin, String password, String userName, int age) {
//        this.isAdmin = isAdmin;
//        this.age = age;
//        this.password = password;
//        this.userName = userName;
//        this.name = name;
    //}

    // I am going to leave this in here to demonstrate my struggle, feel free to laugh and or delete

//    public static void inflateUser(Map cReg, User u, String uName) {
//        if (cReg == null) {
//            registerSelf(u);
//        }
//        u.setUserName(uName);
//        u.setPassword((String) cReg.get("password"));
//        u.setAge((int) cReg.get("age"));
//        u.setAdmin((boolean) cReg.get("isAdmin"));
//        u.setName((String) cReg.get("name"));
//    }
//
//    public static void registerSelf(User u) {
//        System.out.println("Not yet working.");
//    }
//
////    public static String getPassword() {
////        return password;
////    }
////
////    public static void setPassword(String password) {
////        User.password = password;
////    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public boolean isAdmin() {
//        return isAdmin;
//    }
//
//    public void setAdmin(boolean admin) {
//        isAdmin = admin;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
}
