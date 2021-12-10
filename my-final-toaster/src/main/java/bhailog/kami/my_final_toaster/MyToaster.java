package bhailog.kami.my_final_toaster;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

public class MyToaster {
    public static double sum(double val, double val2)
    {
        return val+val2;
    }

    public static void s(Context context,String msg)
    {
        Toast.makeText(context,msg, Toast.LENGTH_SHORT).show();
    }
}
