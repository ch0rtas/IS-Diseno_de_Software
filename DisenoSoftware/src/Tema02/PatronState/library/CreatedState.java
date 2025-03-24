package Tema02.PatronState.library;

// Concrete States
class CreatedState implements LibraryLoanState {
    @Override
    public void process(LibraryLoanRequestContext context) {
        // System.out.println("Processing Created State: Checking user account and book availability");
        if (context.getLibraryUser().isActiveAccount()) {
            context.setState(new AdmittedState());
            System.out.println("Notification to user : " + context.getLibraryUser().getName() +
                    ", library loan admited on " + context.getCreatedDate() +
                    ", due date to pickup " + context.getCreatedDate().plusDays(2));
        } else {
            context.setState(new RejectedState());
            System.out.println("Loan request rejected due to inactive account");
        }
    }

    @Override
    public String getStateName() {
        return "Created";
    }
}