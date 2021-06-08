package sg.edu.rp.c346.id19011909.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    //Creating Variable,
    ListView ivExamTips;
    String[] ExamView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking Variable,
        ivExamTips = findViewById(R.id.listViewExamTips);

        //Setting Action {Array},
        ExamView = new String[5];
        ExamView[0] = "Don't just read the code, code it as much as possible during each practical session";
        ExamView[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        ExamView[2] = "Prepare your template source code for each topic";
        ExamView[3] = "Create a few empty Android projects to speed up your coding during the exam";
        ExamView[4] = "Ensure that your Android Studio is up and running before the exam";

        //Linking ArrayAdapter,
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ExamView);

        //Displaying ListView,
        ivExamTips.setAdapter(adapter);

    }
}