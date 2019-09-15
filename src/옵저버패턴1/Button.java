package 옵저버패턴1;

public class Button {
    public void onClick(){
        //이벤트 처리
        if(onClickListner != null)
        onClickListner.onClick(this);
    }
    public interface OnClickListner{
        public void onClick(Button button);
    }
    private  OnClickListner onClickListner;

    public void setOnClickListner(OnClickListner onClickListner) {
        this.onClickListner = onClickListner;
    }
}
