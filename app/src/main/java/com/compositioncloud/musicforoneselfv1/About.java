package com.compositioncloud.musicforoneselfv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.hyphen.DefaultHyphenator;

import java.util.List;

public class About extends AppCompatActivity {

    public final static String FROM_ABOUT = "com.compositioncloud.musicforoneselfv1.FROM_ABOUT";
    public final static String LAST_TEXT = "com.compositioncloud.musicforoneselfv1.LAST_TEXT_ABOUT";
    public final static String CURRENT_TEXT = "com.compositioncloud.musicforoneselfv1.CURRENT_TEXT_ABOUT";
    public final static String NEW_TEXT = "com.compositioncloud.musicforoneselfv1.NEW_TEXT_ABOUT";
    public final static String CONTEXT = "com.compositioncloud.musicforoneselfv1.CONTEXT_ABOUT";
    public final static String PROGRESS = "com.compositioncloud.musicforoneselfv1.PROGRESS_ABOUT";
    public final static String NOTE = "com.compositioncloud.musicforoneselfv1.NOTE_ABOUT";

    boolean from_list;
    int last_text;
    int current_text;
    int new_text;
    int context;
    boolean[] progress = new boolean[23];
    boolean note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DocumentView documentView = (DocumentView) findViewById(R.id.text);
        documentView.getDocumentLayoutParams().setHyphenator(DefaultHyphenator.
                getInstance(DefaultHyphenator.HyphenPattern.PT));
        documentView.getDocumentLayoutParams().setHyphenated(true);

        Intent intent = getIntent();

        if(intent.getBooleanExtra(ListActivity.FROM_LIST, false)) {
            from_list = true;
            current_text = intent.getIntExtra(ListActivity.CURRENT_TEXT, -1);
            context = intent.getIntExtra(ListActivity.CONTEXT, -1);
            progress = intent.getBooleanArrayExtra(ListActivity.PROGRESS);
            note = intent.getBooleanExtra(ListActivity.NOTE, false);
        }
        else {
            last_text = intent.getIntExtra(TextActivity.LAST_TEXT, -1);
            new_text = intent.getIntExtra(TextActivity.NEW_TEXT, -1);
            context = intent.getIntExtra(TextActivity.CONTEXT, -1);
            progress = intent.getBooleanArrayExtra(TextActivity.PROGRESS);
            note = intent.getBooleanExtra(TextActivity.NOTE, false);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent;
                if (from_list) {
                    intent = new Intent(this, ListActivity.class);
                }
                else {
                    intent = new Intent(this, TextActivity.class);
                }
                intent.putExtra(FROM_ABOUT, true);
                intent.putExtra(LAST_TEXT, last_text);
                intent.putExtra(CURRENT_TEXT, current_text);
                intent.putExtra(NEW_TEXT, new_text);
                intent.putExtra(CONTEXT, context);
                intent.putExtra(PROGRESS, progress);
                intent.putExtra(NOTE, note);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
