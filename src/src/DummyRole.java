public enum DummyRole implements Role {;
        private String patron;
        private String doorPerson;
        private String bartender;
        private String owner;
        private String admin;

        DummyRole(String patron, String doorPerson, String bartender, String owner, String admin){
            this.patron = patron;
            this.doorPerson = doorPerson;
            this.bartender = bartender;
            this.owner = owner;
            this.admin = admin;
        }

        public String getRole() {
            return patron;
        }

    @Override
    public void getRoles() {

    }
}
// enum for roles
// signature method in the interface of Roles


