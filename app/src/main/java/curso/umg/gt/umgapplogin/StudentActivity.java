package curso.umg.gt.umgapplogin;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static curso.umg.gt.umgapplogin.R.id.tv3;

public class StudentActivity extends AppCompatActivity {

    Spinner opciones;
    EditText ete3,ete4;
    ListView lve1;
    List<String> listado1;
    ArrayAdapter<String> adapter;
    Spinner sp1;
    TextView tv3;
    Button boton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        listado1=new ArrayList<>();

        boton1=(Button) findViewById(R.id.btnenviar);
        ete3=(EditText) findViewById(R.id.ete3);
        ete4=(EditText) findViewById(R.id.ete4);
        lve1=(ListView) findViewById(R.id.lve1);

        opciones=(Spinner) findViewById(R.id.sp1);
        sp1=(Spinner) findViewById(R.id.sp1);

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listado1);
        lve1.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.Seleccione,android.R.layout.simple_spinner_item);
        opciones.setAdapter(adapter);


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "REGISTRO REALIZADO";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                ete3.setText("");
                ete4.setText("");
            }
        });

      }

}
