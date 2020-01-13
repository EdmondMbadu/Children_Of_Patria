package com.example.chilldrenofpatria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Chapter1Contiinue extends AppCompatActivity  implements View.OnClickListener {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1_contiinue);
        // set the title of the tool bar as Chapter 1
        // the beauty of this part is that I only have one toolbar resource file (toolbar.xml) that I will used again and again
        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
        textViewChapter1.setText("Chapter 1");

        TextView textViewScrollContinue= (TextView) findViewById(R.id.text_scrollChapter1ContinueAgain);

        String noonGiftPart1 = "You looks up at the bell tower. “I haven’t heard the bell ring before curfew since the wheat fields were set on fire.”\n" +
                "“Stay here and watch the store Ben, Me and Hilda are going to see what this is about.” David says.\n" +
                "And without saying another word, your adoptive parents leave the bakery to you. “At least they stopped baking already.” You think. Then another thought crosses your mind. “I bet there are enough people in there that David and Hilda would never see me.”\n";
        textViewScrollContinue.setText(noonGiftPart1);

        Button buttonStay= findViewById(R.id.button_stayWatchBakery);
        Button buttonGo= findViewById(R.id.button_GoTownHall);

        buttonStay.setOnClickListener(this);;
        buttonGo.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_stayWatchBakery:
                intent= new Intent(this,StayAndWatchBakery.class);
                startActivity(intent);
                break;
            case R.id.button_GoTownHall:
                intent = new Intent(this, GoToTownHall.class);
                startActivity(intent);
                break;
        }

    }
}
