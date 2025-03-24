package Tema02.PatronState.library;

class FinishedState implements LibraryLoanState {
    @Override
    public void process(LibraryLoanRequestContext context) {
        System.out.println("Loan request has been completed");
    }

    @Override
    public String getStateName() {
        return "Finished";
    }
}