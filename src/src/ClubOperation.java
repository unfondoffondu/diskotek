public enum ClubOperation {
    //Enum for list of operations(named constants) that the various roles have access to.
    accessEstablishment(new Object[]{}),
    openTab(new Object[]{}),
    serveDrinks(new Object[]{}),
    rejectEntry(new Object[]{}),
    enforceRules(new Object[]{}),
    manageRoles(new Object[]{}),
    manageOperations(new Object[]{}),
    manageEmployees(new Object[]{}),
    reviewDataDashboard(new Object[]{}),
    accessStage(new Object[]{}),
    accessGreenRoom(new Object[]{});

    private final Object[] args;

    ClubOperation(Object[] args) {
        this.args = args;
    }

    public Object[] getArgs() {
        return args;
    }

    // Define the defaultOperation constant
    public static final ClubOperation defaultOperation = accessEstablishment;
}

