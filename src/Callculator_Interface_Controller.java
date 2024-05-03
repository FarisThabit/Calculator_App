import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.animation.PauseTransition;
import javafx.util.Duration;
public class Callculator_Interface_Controller {

    private Callculator object = new Callculator();

    @FXML
    private Button Cbutt;

    @FXML
    private Button Dbutt;

    @FXML
    private Button OnOffbutt;

    @FXML
    private Button X2;

    @FXML
    private Button butt1;

    @FXML
    private Button butt2;

    @FXML
    private Button butt3;

    @FXML
    private Button division;

    @FXML
    private Button dot;

    @FXML
    private Button equalButt;

    @FXML
    private Label l1;

    @FXML
    private Label opreationlable;


    @FXML
    private Button minusButt;

    @FXML
    private Button multiplicstion;

    @FXML
    private Button persentage;

    @FXML
    private Button plusButt;

    @FXML
    private TextArea ta1;

    @FXML
    private Button zeroButt;

    @FXML
    private Button butt4;

    @FXML
    private Button butt5;

    @FXML
    private Button butt6;

    @FXML
    private Button butt7;

    @FXML
    private Button butt8;

    @FXML
    private Button butt9;

    @FXML
    private Label FN;


    @FXML
    void CbuttISPressed(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{
            ta1.setText("");
            object.setResult(0);
            opreationlable.setText("");
            FN.setText("");
        }
    }

    @FXML
    void DbuttIsPressed(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{
            if(textAreaChecking() == false){
                l1.setText("You can't use the delete button in the begining");
            }
            else{
                ta1.setText(ta1.getText().substring(0,((ta1.getText().length())-1)));
            }
        }
    }

    @FXML
    void OnOffbuttIsPressed(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            onStatus();
        }
        else{
            onStatus();
        }

    }

    @FXML
    void butt1IsPressed(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{
            if(textAreaChecking() == false){
                ta1.setText("1");
            }
            else{
                ta1.setText(ta1.getText()+"1");
            }
        }
    }

    @FXML
    void butt2IsPressed(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{

            if(textAreaChecking() == false){
                ta1.setText("2");
            }
            else{
                ta1.setText(ta1.getText()+"2");
            }
        }
    }

    @FXML
    void butt3IsPressed(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{

            if(textAreaChecking() == false){
                ta1.setText("3");
            }
            else{
                ta1.setText(ta1.getText()+"3");
            }
        }
    }

    @FXML
    void divisionButtIsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{
            if(textAreaChecking() == false){
                l1.setText("Wrong opreation, Enter a number First");
            }
            else{
                opreationlable.setText("/");
                object.setResult(Double.parseDouble(ta1.getText()));
                FN.setText(ta1.getText());
                ta1.setText("");
                minusButt.setDisable(true);
                plusButt.setDisable(true);
                multiplicstion.setDisable(true);
                X2.setDisable(true);
               // equallButtIsClicked(new ActionEvent());
            }
        }
    }

    @FXML
    void dotButtIsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{
            if(textAreaChecking() == false){
                l1.setText("you can't use . in the begning");
            }
            else{
                ta1.setText(ta1.getText()+".");
            }
        }
    }

    @FXML
    void equallButtIsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{
            if(textAreaChecking() == false){
                l1.setText("you can't use = in the , Enter a number first");
            }
            else{
                if(opreationlable.getText().equals("+")){
                    object.Sum(Double.parseDouble(ta1.getText()));
                    FN.setText("");
                    opreationlable.setText("");
                    ta1.setText(""+object.getResult());
                    minusButt.setDisable(false);
                    multiplicstion.setDisable(false);
                    division.setDisable(false);
                    X2.setDisable(false);
                }
                else if(opreationlable.getText().equals("-")){
                    object.Sub(Double.parseDouble(ta1.getText()));
                    FN.setText("");
                    opreationlable.setText("");
                    ta1.setText(""+object.getResult());
                    plusButt.setDisable(false);
                    multiplicstion.setDisable(false);
                    division.setDisable(false);
                    X2.setDisable(false);
                }
                else if(opreationlable.getText().equals("x")){
                    object.Mul(Double.parseDouble(ta1.getText()));
                    FN.setText("");
                    opreationlable.setText("");
                    ta1.setText(""+object.getResult());
                    minusButt.setDisable(false);
                    plusButt.setDisable(false);
                    division.setDisable(false);
                    X2.setDisable(false);
                }
                else if(opreationlable.getText().equals("/")){
                    object.Div(Double.parseDouble(ta1.getText()));
                    FN.setText("");
                    opreationlable.setText("");
                    ta1.setText(""+object.getResult());
                    minusButt.setDisable(false);
                    multiplicstion.setDisable(false);
                    plusButt.setDisable(false);
                    X2.setDisable(false);
                }
                else if(opreationlable.getText().equals("x^2")){
                    object.setResult(Double.parseDouble(ta1.getText()));
                    object.power2();
                    ta1.setText(""+object.getResult());
                    minusButt.setDisable(false);
                    multiplicstion.setDisable(false);
                    division.setDisable(false);
                    plusButt.setDisable(false);
                }
            }
        }
    }

    @FXML
    void minusButtIsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{
            if(textAreaChecking() == false){
                l1.setText("Wrong opreation, Enter a number First");
            }
            else{
                opreationlable.setText("-");
                object.setResult(Double.parseDouble(ta1.getText()));
                FN.setText(ta1.getText());
                ta1.setText("");
                plusButt.setDisable(true);
                multiplicstion.setDisable(true);
                division.setDisable(true);
                X2.setDisable(true);
                //equallButtIsClicked(new ActionEvent());

            }
        }
    }

    @FXML
    void multiplicstionButtIsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{
            if(textAreaChecking() == false){
                l1.setText("Wrong opreation, Enter a number First");
            }
            else{
                opreationlable.setText("x");
                object.setResult(Double.parseDouble(ta1.getText()));
                FN.setText(ta1.getText());
                ta1.setText("");
                minusButt.setDisable(true);
                plusButt.setDisable(true);
                division.setDisable(true);
                X2.setDisable(true);
                //equallButtIsClicked(new ActionEvent());
            }
        }
    }

    @FXML
    void persentageButtIsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{

        }
    }

    @FXML
    void plusButtIsPressed(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{

            if(textAreaChecking() == false){
                l1.setText("Wrong opreation, Enter a number First");
            }
            else{
                opreationlable.setText("+");
                object.setResult(Double.parseDouble(ta1.getText()));
                FN.setText(ta1.getText());
                ta1.setText("");
                minusButt.setDisable(true);
                multiplicstion.setDisable(true);
                division.setDisable(true);
                X2.setDisable(true);
               // equallButtIsClicked(new ActionEvent());


            }
        }
    }

    @FXML
    void xpower2ButtISPressed(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{

            if(textAreaChecking() == false){
                l1.setText("Wrong opreation, Enter a number First");
            }
            else{
                object.setResult(Double.parseDouble(ta1.getText()));
                opreationlable.setText("x^2");
                minusButt.setDisable(true);
                multiplicstion.setDisable(true);
                division.setDisable(true);
                plusButt.setDisable(true);
            }

        }
    }

    @FXML
    void zeroButtIsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{

            if(textAreaChecking() == false){
                ta1.setText("0");
            }
            else{
                ta1.setText(ta1.getText()+"0");
            }
        }
    }

    public void offStatus(){
            l1.setText("Turn the calculator On");

            PauseTransition pause = new PauseTransition(Duration.seconds(3));
            pause.setOnFinished(event -> l1.setText(""));
            pause.play();

    }
    public void onStatus(){
        if(object.getStatus().equals("Off")){
            l1.setText("The Calculator is On");
            object.setStatus("On");
            ta1.setText("ON");
            PauseTransition pause = new PauseTransition(Duration.seconds(3));
            pause.setOnFinished(event -> l1.setText(""));
            pause.play();

        }
        else{
            l1.setText("The Calculator is Off");
            object.setStatus("Off");
            ta1.setText("OFF");
            PauseTransition pause = new PauseTransition(Duration.seconds(3));
            pause.setOnFinished(event -> l1.setText(""));
            pause.play();
        }


    }
    @FXML
    void butt4IsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{

            if(textAreaChecking() == false){
                ta1.setText("4");
            }
            else{
                ta1.setText(ta1.getText()+"4");
            }
        }
    }

    @FXML
    void butt5IsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{
            if(textAreaChecking() == false){
                ta1.setText("5");
            }
            else{
                ta1.setText(ta1.getText()+"5");
            }
        }
    }

    @FXML
    void butt6IsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{
            if(textAreaChecking() == false){
                ta1.setText("6");
            }
            else{
                ta1.setText(ta1.getText()+"6");
            }
        }
    }

    @FXML
    void butt7IsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{

            if(textAreaChecking() == false){
                ta1.setText("7");
            }
            else{
                ta1.setText(ta1.getText()+"7");
            }
        }
    }

    @FXML
    void butt8IsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{

            if(textAreaChecking() == false){
                ta1.setText("8");
            }
            else{
                ta1.setText(ta1.getText()+"8");
            }
        }
    }

    @FXML
    void butt9IsClicked(ActionEvent event) {
        if(object.getStatus().equals("Off")){
            offStatus();
        }
        else{

            if(textAreaChecking() == false){
                ta1.setText("9");
            }
            else{
                ta1.setText(ta1.getText()+"9");
            }
        }
    }
        public boolean textAreaChecking(){
            if(ta1.getText().equals("ON")){
                return false;
            }
            return true;
        }

}
