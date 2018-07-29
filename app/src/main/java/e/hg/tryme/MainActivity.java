package e.hg.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowview;
    private Button tryme;
    private int[] colors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors=new int[]{Color.RED,Color.LTGRAY,Color.CYAN,Color.DKGRAY};

        windowview=findViewById(R.id.windowViewId);



        tryme=findViewById(R.id.tryme);

        tryme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int colorArray=colors.length;

              Random random=new Random();

              int randomnumber=random.nextInt(colorArray) ;

                windowview.setBackgroundColor(colors[randomnumber]);


             //Log.d("HI","tap");
            }
        });
    }
}
