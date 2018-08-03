package converter;

import org.apache.struts2.util.StrutsTypeConverter;

import java.awt.*;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/20 0020.
 */
public class PointConverter extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {

        Point point = new Point();
        String[] strs = (String[])values;
        String[] xy = strs[0].split(",");
        point.x = Integer.parseInt(xy[0]);
        point.y = Integer.parseInt(xy[1]);
        return point;


    }

    @Override
    public String convertToString(Map context, Object o) {
        // TODO Auto-generated method stub
        return o.toString();
    }
}
