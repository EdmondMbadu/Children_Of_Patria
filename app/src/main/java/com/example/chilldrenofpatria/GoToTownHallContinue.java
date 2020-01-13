package com.example.chilldrenofpatria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GoToTownHallContinue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_to_town_hall_continue);

        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
        textViewChapter1.setText("Chapter 1");

        TextView textView = (TextView) findViewById(R.id.text_scrollChapter1GoToTownContinue);
        String stayBakery="You do as David says; you close up the shop. You finish as the last of the sunlight disappears. The town bell rings again. \n" +
                " “It will take me a few days to get used to that sound so early.” You think.\n" +
                "You lock the doors to the bakery, and put the copper back where it belongs.\n" +
                "“Make sure the windows are locked too Ben.” David says.\n" +
                "“Shit.” You say.\n" +
                "You lock all the windows and then rush upstairs to ask David what happened. He’s talking in a whisper to Hilda. \n" +
                "“So what happened?” You ask. “Why did they make the curfew night fall?”\n" +
                "David looks at you; he’s holding Hilda’s hand. “A few people have gone missing; one of them was your mother’s friend Elena.” He says. “I want the shop closed and you inside before night fall from now on until I say otherwise. If someone wants to do business during, or after, closing come and get me no matter who it is. Understand?”\n" +
                "“Yes father.” You say.\n" +
                "You look down at the ground.\n" +
                "David gives a melancholy smile. “Good, thank you.” He says “Now, one question before you go. Have you seen anything odd that we should know about?”\n" +
                " “No, I haven’t seen anything odd.” You say.\n" +
                "“I didn’t expect that you to, I haven’t seen anything out of order myself.” David says. “Go get some food, then go to bed early. We have a lot to talk about.”\n" +
                "“Have a good night Ben.” Hilda says.\n" +
                "You do as they say and once you finish eating you go to your room, not much larger than a closet, and lay on your bed. Every so often you hear them talking as you drift to asleep.\n";
        textView.setText(stayBakery);
    }
}
