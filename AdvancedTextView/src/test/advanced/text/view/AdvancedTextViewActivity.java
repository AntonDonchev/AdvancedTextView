package test.advanced.text.view;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
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
		textView.setTextGapSize(15);

		Text t = textView.new Text("You've\nearned");
		t.setSize(14);
		t.setColor(Color.GRAY);
		t.setGravity(Gravity.LEFT | Gravity.CENTER_VERTICAL);
		textView.addText(t);

		t = textView.new Text("424");
		t.setSize(24);
		t.setColor(Color.BLUE);
		t.setGravity(Gravity.BOTTOM);
		textView.addText(t);

		t = textView.new Text("coins!");
		t.setSize(18);
		t.setColor(Color.GRAY);
		t.setGravity(Gravity.BOTTOM | Gravity.LEFT);
		textView.addText(t);

		ViewGroup layout = (ViewGroup) findViewById(R.id.mainLayout);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		params.gravity = Gravity.CENTER;
		textView.setLayoutParams(params);
		ViewGroup.LayoutParams paramsMain = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
		layout.addView(textView, paramsMain);

	}
}