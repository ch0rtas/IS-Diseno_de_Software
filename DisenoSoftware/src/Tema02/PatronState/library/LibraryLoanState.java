package Tema02.PatronState.library;

// State Interface
public interface LibraryLoanState {
    void process(LibraryLoanRequestContext context);
    String getStateName();
}