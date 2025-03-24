package Tema02.PatronState.library;

class ProcessedState implements LibraryLoanState {
    @Override
    public void process(LibraryLoanRequestContext context) {
        // System.out.println("Processing Processed State: Book is currently on loan");
    }

    @Override
    public String getStateName() {
        return "Processed";
    }
}