package kagamihoge.lifegameonjavafx.ui.eventhandler;

public interface ControllButtonOnClickHandler {
    void handle();
    ControllButtonOnClickHandler nextHandler();
    String getText();
}
