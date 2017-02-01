package com.compositioncloud.musicforoneselfv1;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.AlignmentSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    public final static String LAST_TEXT = "com.compositioncloud.musicforoneselfv1.LAST_TEXT";
    public final static String NEW_TEXT = "com.compositioncloud.musicforoneselfv1.NEW_TEXT";
    public final static String CONTEXT = "com.compositioncloud.musicforoneselfv1.CONTEXT";
    public final static String PROGRESS = "com.compositioncloud.musicforoneselfv1.PROGRESS";
    public final static String NOTE = "com.compositioncloud.musicforoneselfv1.NOTE";

    int last_text;
    int new_text;
    int context;
    boolean[] progress = new boolean[23];
    boolean note;

    MusicForOneselfV1 the_game = new MusicForOneselfV1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        TextView textView = (TextView) findViewById(R.id.text);

        Button button = (Button) findViewById(R.id.button);

        if(intent.getBooleanExtra(ListActivity.FROM_LIST, false)) {
            last_text = intent.getIntExtra(ListActivity.CURRENT_TEXT, -1);
            new_text = intent.getIntExtra(ListActivity.NEW_TEXT, -1);
            context = intent.getIntExtra(ListActivity.CONTEXT, -1);
            progress = intent.getBooleanArrayExtra(ListActivity.PROGRESS);
            note = intent.getBooleanExtra(ListActivity.NOTE, false);
        }
        else if (intent.getBooleanExtra(About.FROM_ABOUT, false)) {
            last_text = intent.getIntExtra(About.LAST_TEXT, -1);
            new_text = intent.getIntExtra(About.NEW_TEXT, -1);
            context = intent.getIntExtra(About.CONTEXT, -1);
            progress = intent.getBooleanArrayExtra(About.PROGRESS);
            note = intent.getBooleanExtra(About.NOTE, false);
        }
        else {
            new_text = -1;
            context = -1;
            for(int i=0; i<23; i++) {
                progress[i] = false;
            }
            note = false;
        }
        if (new_text == -1) {
            setTitle(R.string.app_name);
            button.setText(R.string.start_now);
        }
        else {
            setTitle(the_game.TITLES[new_text]);
            textView.setText(the_game.CreateText(last_text, new_text, context));
            button.setText(R.string.next);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        if (new_text == -1) {
            menu.findItem(R.id.start_again).setEnabled(false);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.start_again) {
            startAgain();
            return true;
        }
        else if (id == R.id.about) {
            Intent intent = new Intent(this, About.class);
            intent.putExtra(LAST_TEXT, last_text);
            intent.putExtra(NEW_TEXT, new_text);
            intent.putExtra(CONTEXT, context);
            intent.putExtra(PROGRESS, progress);
            intent.putExtra(NOTE, note);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void click(View view) {
        if (new_text != -1) {
            progress[new_text] = true;
        }
        if (new_text == 22) {
            new AlertDialog.Builder(this).setTitle("THE END").setMessage("this was the last text.")
                    .setPositiveButton(R.string.start_again, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            startAgain();
                        }
                    }).show();
        }
        else {
            Intent intent = new Intent(this, ListActivity.class);
            intent.putExtra(NEW_TEXT, new_text);
            intent.putExtra(CONTEXT, context);
            intent.putExtra(PROGRESS, progress);
            intent.putExtra(NOTE, note);
            startActivity(intent);
        }
    }

    public void startAgain() {
        Intent intent = new Intent(this, TextActivity.class);
        startActivity(intent);
    }
}
