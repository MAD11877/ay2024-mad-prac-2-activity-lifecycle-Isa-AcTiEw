package sg.edu.np.mad.madpractical2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MaiActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.parent), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        User user = new User("John Doe","MAD Developer",1,false);
        ButtonFollow btn = new ButtonFollow("Follow");
        TextView tvName = findViewById(R.id.tvName);
        TextView tvDescription = findViewById(R.id.tvDescription);

        Button btnFollow = findViewById(R.id.btnFollow);

        tvName.setText(user.name);
        tvDescription.setText(user.description);
        btnFollow.setText(btn.name);

        btnFollow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                boolean state = btn.changeState();
                if(!state){
                    btn.name = "Follow";
                    btnFollow.setText(btn.name);

                }
                else{
                    btn.name = "Unfollow";
                    btnFollow.setText(btn.name);
                }


            }
        });

    }




}

