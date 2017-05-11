package app.com.caroline.jokeandroidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.JavaJokes;


public class MainLibraryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_library);

        TextView joke_textView = (TextView)findViewById(R.id.joke_intent_text_view);

        JavaJokes javaJokes = new JavaJokes();
        joke_textView.setText(javaJokes.jokes);
    }


}
