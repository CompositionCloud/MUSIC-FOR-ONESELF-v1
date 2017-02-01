package com.compositioncloud.musicforoneselfv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    public final static String FROM_LIST = "com.compositioncloud.musicforoneselfv1.FROM_LIST";
    public final static String CURRENT_TEXT = "com.compositioncloud.musicforoneselfv1.CURRENT_TEXT";
    public final static String NEW_TEXT = "com.compositioncloud.musicforoneselfv1.NEW_TEXT_LIST";
    public final static String CONTEXT = "com.compositioncloud.musicforoneselfv1.CONTEXT_LIST";
    public final static String PROGRESS = "com.compositioncloud.musicforoneselfv1.PROGRESS_LIST";
    public final static String NOTE = "com.compositioncloud.musicforoneselfv1.NOTE_LIST";

    private int current_text;
    private int new_text;
    private int context;
    private boolean[] progress = new boolean[23];
    private boolean note;
    private boolean inner_silence;

    private final MusicForOneselfV1 the_game = new MusicForOneselfV1();

    private ArrayList<Integer> next_texts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        if (intent.getBooleanExtra(About.FROM_ABOUT, false)) {
            current_text = intent.getIntExtra(About.CURRENT_TEXT, -1);
            context = intent.getIntExtra(About.CONTEXT, -1);
            progress = intent.getBooleanArrayExtra(About.PROGRESS);
            note = intent.getBooleanExtra(About.NOTE, false);
        }
        else {
            current_text = intent.getIntExtra(TextActivity.NEW_TEXT, -1);
            context = intent.getIntExtra(TextActivity.CONTEXT, -1);
            progress = intent.getBooleanArrayExtra(TextActivity.PROGRESS);
            note = intent.getBooleanExtra(TextActivity.NOTE, false);
        }

        if (current_text == -1) {
            setTitle(R.string.which_beginning);
        }
        else {
            setTitle(R.string.whats_next);
        }

        next_texts = the_game.whatsNext(current_text, context, progress);

        String[] titlesList;

        if(next_texts.size()>0) {
            titlesList = new String[next_texts.size()];

            for(int i=0; i<next_texts.size(); i++) {
                titlesList[i] = the_game.TITLES[next_texts.get(i)];
            }

            if(!note) {
                if (progress[0] && (progress[9] || progress[10] || progress[11])) {
                    Toast.makeText(getApplicationContext(), "SMALL INTERVALS and PALE GLISSANDI " +
                            "are now available again.", Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), "MUSIC FOR ONESELF v1 will end when " +
                            "no more texts will be there to choose from.", Toast.LENGTH_LONG)
                            .show();
                    note = true;
                }
                else if (progress[1] && (progress[14] || progress[17])) {
                    Toast.makeText(getApplicationContext(), "REAL AND IMAGINED and PALE " +
                            "GLISSANDI are now available again.",
                            Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), "MUSIC FOR ONESELF v1 will end when " +
                            "no more texts will be there to choose from.", Toast.LENGTH_LONG)
                            .show();
                    note = true;
                }
                else if (progress[2] && (progress[16] || progress[19])) {
                    Toast.makeText(getApplicationContext(), "REAL AND IMAGINED, SMALL INTERVALS " +
                            "and CRACKING GLASSES are now available again.",
                            Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), "MUSIC FOR ONESELF v1 will end when " +
                            "no more texts will be there to choose from.", Toast.LENGTH_LONG)
                            .show();
                    note = true;
                }
                else if (progress[2] && progress[17]) {
                    Toast.makeText(getApplicationContext(), "CRACKING GLASSES is now available " +
                            "again, and you can still choose DULL NOISE or AGITATED RUBBING.",
                            Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), "MUSIC FOR ONESELF v1 will end when " +
                            "no more texts will be there to choose from.", Toast.LENGTH_LONG)
                            .show();
                    note = true;
                }
                else if (progress[2] && progress[9]) {
                    Toast.makeText(getApplicationContext(), "UNRECOGNIZABLE RUSTLE is now " +
                            "available again, and you can still choose CHAOTIC SEQUENCES or " +
                            "JERKY CHIRPS.", Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), "MUSIC FOR ONESELF v1 will end when " +
                            "no more texts will be there to choose from.", Toast.LENGTH_LONG)
                            .show();
                    note = true;
                }
                else if (progress[2] && progress[15]) {
                    Toast.makeText(getApplicationContext(), "UNRECOGNIZABLE RUSTLE is now " +
                            "available again, and you can still choose JERKY CHIRPS.",
                            Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), "MUSIC FOR ONESELF v1 will end when " +
                            "there will be no more texts to choose from.", Toast.LENGTH_LONG)
                            .show();
                    note = true;
                }
                else if (progress[2] && progress[18]) {
                    Toast.makeText(getApplicationContext(), "UNRECOGNIZABLE RUSTLE is now " +
                                    "available again, and you can still choose GIGANTIC HEART.",
                            Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), "MUSIC FOR ONESELF v1 will end when " +
                            "there will be no more texts to choose from.", Toast.LENGTH_LONG)
                            .show();
                    note = true;
                }
                else if (progress[20]) {
                    Toast.makeText(getApplicationContext(), "you can still choose " +
                            "DIFFERENT SIZES.", Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), "MUSIC FOR ONESELF v1 will end when " +
                            "there will be no more texts to choose from.", Toast.LENGTH_LONG)
                            .show();
                    note = true;
                }
            }
            if(next_texts.size() == 1) {
                Toast.makeText(getApplicationContext(), "there is only one text to choose from " +
                        "for the moment!", Toast.LENGTH_LONG).show();
            }
        }
        else {
            titlesList = new String[1]; titlesList[0] = "INNER SILENCE";
            Toast.makeText(getApplicationContext(), "there is only one text to choose from!",
                    Toast.LENGTH_LONG).show();
            inner_silence = true;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.
                simple_list_item_1, android.R.id.text1, titlesList);

        ListView listView = (ListView) findViewById(R.id.titlesList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (inner_silence) {
                    new_text = 22;
                }
                else {
                    if (current_text < 9) {
                        context = current_text;
                    }
                    new_text = next_texts.get(position);
                }
                nextText();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.start_again) {
            Intent intent = new Intent(this, TextActivity.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.about) {
            Intent intent = new Intent(this, About.class);
            intent.putExtra(FROM_LIST, true);
            intent.putExtra(CURRENT_TEXT, current_text);
            intent.putExtra(CONTEXT, context);
            intent.putExtra(PROGRESS, progress);
            intent.putExtra(NOTE, note);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void nextText() {
        Intent intent = new Intent(this, TextActivity.class);
        intent.putExtra(FROM_LIST, true);
        intent.putExtra(CURRENT_TEXT, current_text);
        intent.putExtra(NEW_TEXT, new_text);
        intent.putExtra(CONTEXT, context);
        intent.putExtra(PROGRESS, progress);
        intent.putExtra(NOTE, note);
        startActivity(intent);
    }

}