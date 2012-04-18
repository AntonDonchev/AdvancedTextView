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

		Text t = textView.new Text("n\nlines\nline\nline\nline\nline\nline");
		t.setSize(14);
		t.setColor(Color.GRAY);
		t.setGravity(Gravity.LEFT);
		textView.addText(t);

		t = textView.new Text("bottom");
		t.setSize(24);
		t.setColor(Color.BLUE);
		t.setGravity(Gravity.BOTTOM);
		textView.addText(t);

		t = textView.new Text("center\nmany\nlines");
		t.setSize(18);
		t.setColor(Color.GRAY);
		t.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
		textView.addText(t);

		ViewGroup layout = (ViewGroup) findViewById(R.id.mainLayout);
		layout.addView(textView);

	}
}