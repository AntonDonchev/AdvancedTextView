package test.advanced.text.view;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import anton.custom.views.AdvancedTextView;
import anton.custom.views.AdvancedTextView.Text;

public class AdvancedTextViewActivity extends Activity {
    /** Called when the activity is first created. */
	AdvancedTextView textView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        textView = new AdvancedTextView(this);
        textView.setTextGapSize(10);
        
        Text t = textView.new Text("You've\nearned");
        t.setSize(14);
        t.setColor(Color.GRAY);
        t.setGravity(Gravity.RIGHT);
        textView.addText(t);
        
        t = textView.new Text("450");
        t.setSize(25);
        t.setColor(Color.BLUE);
        t.setGravity(Gravity.BOTTOM);
        textView.addText(t);
        
        t = textView.new Text("coins!");
        t.setSize(18);
        t.setColor(Color.GRAY);
        t.setGravity(Gravity.CENTER);
        textView.addText(t);
        
        ViewGroup layout = (ViewGroup) findViewById(R.id.mainLayout);
        layout.addView(textView);
        
    }
}