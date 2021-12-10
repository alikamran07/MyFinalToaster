package bhailog.kami.my_final_toaster;

import android.content.Context;
import android.widget.Toast;

public class MyToaster {
    public static void s(Context context,String msg)
    {
        Toast.makeText(context,msg, Toast.LENGTH_SHORT).show();
    }
}
