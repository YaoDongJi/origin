package algotithm.Bsearch;

public class Result {
    private int result=-1;
    private int value =-1;

    public Result(){}
    public Result(int result,int value){
        this.result = result;
        this.value = value;
    }

    public void setResult(int result){
        this.result = result;
    }
    public int getResult(){
        return result;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "Result : [result=="+result+"value=="+value+"]";
    }

}
