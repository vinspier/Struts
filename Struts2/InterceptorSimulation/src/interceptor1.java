/**
 * Created by Administrator on 2017/7/19 0019.
 */
public class interceptor1 implements Interceptor {
    public void intercept(ActionInvocation invocation){
        System.out.println("1");
        invocation.invoke();
        System.out.println("-1");
    }
}
