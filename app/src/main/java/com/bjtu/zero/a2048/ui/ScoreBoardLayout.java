package com.bjtu.zero.a2048.ui;

import android.content.Context;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ScoreBoardLayout extends LinearLayout {

    protected TextView scoreView;
    protected TextView highScoreView;
    protected TextView textView;
    protected TextView textView1;
    protected TextView textView2;
    private int currentScore;
    private int highestScore;

    public ScoreBoardLayout(Context context) {
        super(context);
        currentScore = 0;
        highestScore = 0;
        setOrientation(HORIZONTAL);
        setMinimumHeight(300);
        setGravity(Gravity.CENTER);
        textView = new TextView(context);
        textView.setText("2048");
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 50);
        textView.setGravity(Gravity.CENTER);
        addView(textView);
        LinearLayout vertical1 = new LinearLayout(context);
        vertical1.setOrientation(VERTICAL);
        vertical1.setMinimumWidth(300);
        addView(vertical1);
        LinearLayout vertical2 = new LinearLayout(context);
        vertical2.setOrientation(VERTICAL);
        vertical2.setMinimumWidth(300);
        addView(vertical2);
        textView1 = new TextView(context);
        textView1.setText("分数");
        textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
        textView1.setGravity(Gravity.CENTER);
        vertical1.addView(textView1);
        scoreView = new TextView(context);
        scoreView.setText(String.valueOf(currentScore));
        scoreView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        scoreView.setGravity(Gravity.CENTER);
        vertical1.addView(scoreView);
        textView2 = new TextView(context);
        textView2.setText("最高分");
        textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
        textView2.setGravity(Gravity.CENTER);
        vertical2.addView(textView2);
        highScoreView = new TextView(context);
        highScoreView.setText(String.valueOf(highestScore));
        highScoreView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        highScoreView.setGravity(Gravity.CENTER);
        vertical2.addView(highScoreView);
    }

    public void setScore(int score) {
        currentScore = score;
        scoreView.setText(String.valueOf(currentScore));
        if (score > highestScore) {
            highestScore = score;
            highScoreView.setText(String.valueOf(highestScore));
        }
    }
}
