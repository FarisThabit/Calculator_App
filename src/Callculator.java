
public class Callculator {
    private double result = 0;
    private String status = "Off";

    public Callculator(){

    }
    public void Sum(double x){
        result = result + x;


    }

    public void Sub(double x){
        result = result - x;


    }
    public void Mul(double x){
        result = result * x;


    }
    public void Div(double x){
        result = result / x;


    }

    public double equall(){
        return result;

    }

    public void power2(){
        result = result * result;
    }


    public String getStatus(){

        return status;
    }


    public void setStatus(String status){
        this.status = status;

    }
    public void setResult(double x){
        this.result = x;
    }

    public double getResult(){
        return result;
    }



}
