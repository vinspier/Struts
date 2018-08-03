import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/19 0019.
 */
public class ActionInvocation {

    List<Interceptor> interceptors = new ArrayList<Interceptor>();
    Action a = new Action();
    int index = -1;

    public ActionInvocation(){
        this.interceptors.add(new interceptor1());
        this.interceptors.add(new interceptor2());
    }

    public void invoke(){
        index ++;
        if(index >= this.interceptors.size()){
            a.execute();
        }
        else{
            this.interceptors.get(index).intercept(this);
        }
    }
}
