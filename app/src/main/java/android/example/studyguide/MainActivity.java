package android.example.studyguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Question> questions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_View);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionsAdapter(questions,this));
    }

    private void initialData(){
        questions=new ArrayList<>();
        questions.add(new Question(R.string.australia, R.string.question_australia, R.drawable.australia, true));
        questions.add(new Question(R.string.africa, R.string.question_africa, R.drawable.africa,false));
        questions.add(new Question(R.string.americas, R.string.question_americas, R.drawable.americas,true));
        questions.add(new Question(R.string.asia, R.string.question_asia, R.drawable.asia,true));
        questions.add(new Question(R.string.middle_east, R.string.question_middle_east, R.drawable.mideast,true));
        questions.add(new Question(R.string.oceans,R.string.question_oceans, R.drawable.oceans,true));
    }
}
