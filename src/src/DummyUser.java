public class DummyUser implements User{
    private int RoleIDs;
    private int roleID = 1; //hard coded
    private Role r;

    DummyUser(Role r){
        this.r = r;
    }

    public void getRoles() {
        this.r.getRoles();
    }
    public int getID() {
        return roleID;
    }

    public void setID(int ID) {
        this.roleID = ID;
    }
}
