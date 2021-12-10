package bhailog.kami.myfinaltoaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import bhailog.kami.my_final_toaster.MyToaster;

public class MainActivity extends AppCompatActivity {

    EditText val1,val2;
    TextView tv_Result;
    Button get_result;
    String a,b;
    double save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getting values
        val1=findViewById(R.id.val1);
        val2=findViewById(R.id.val2);

        tv_Result=findViewById(R.id.result_show);
        get_result=findViewById(R.id.result_btn);

        get_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= val1.getText().toString();
                b=val2.getText().toString();
                save=MyToaster.sum(Double.parseDouble(a),Double.parseDouble(b));

                tv_Result.setText(""+save);
            }
        });

    }
}