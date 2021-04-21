public class Assistant {
    private String assistantEmail;
    private String assistantName;

    /**
     * @param assistantEmail Takes in the assistant email
     * @param assistantName Takes the assistant name
     */
    public Assistant(String assistantEmail, String assistantName){

        // Attaches the assistants name to the university organisations domain.
        String universityDomain = "@uok.ac.uk";
        String fullCompleteEmail = assistantEmail.concat(universityDomain);
        this.assistantEmail = fullCompleteEmail;
        this.assistantName = assistantName;
    }

    /**
     * @return Returns the assistant email
     */
    // Optional Getter methods
    public String getAssistantEmail(){return assistantEmail;}
    public String getAssistantName(){return assistantName;}


    /**
     * Prints all of the assistant data in console
     */
    public void showAssistantData(){
        System.out.print(
                "| " + assistantName + " |" + "| " + assistantEmail + " |"
        );
    }


}
