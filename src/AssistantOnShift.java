public class AssistantOnShift {
    private Assistant assistant;
    private String date;
    private String status;

    /**
     * @param assistant an assistant object
     * @param date a specified user date
     * @param status the status of the assistant
     */
    public AssistantOnShift(Assistant assistant, String date, String status){
        this.assistant = assistant;
        this.date = date;
        this.status = status;
    }

    /**
     * @param status sets the status of the assistant
     */
    public void setStatus(String status){
        this.status = status;
    }

    /**
     * @return returns the status of the assistant
     */
    public String returnAsisStatus() {
        return status;
    };

    /**
     * prints out the assistant on shift data to console
     */
    public void showData(){
        System.out.print(
                "| " + date + " | " + status + " | " + assistant.getAssistantEmail() + " | "
        );
    }
}
