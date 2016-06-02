package kr.hs.emirim.sebin2519.simplewebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //위젯을 멤버필드에 선언
    EditText editUrl;
    Button butMove, butPrev;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //참조변수 , 캐스팅: 형변환
        editUrl=(EditText) findViewById(R.id.edit_url);
        butMove=(Button) findViewById(R.id.but_move);
        butPrev=(Button) findViewById(R.id.but_prev);
        web=(WebView)findViewById(R.id.web);

        //이벤트 핸들러(익명클래스, 형제클래스) => 형제 클래스로!
        butMove.setOnClickListener(this);

        //이벤트 소스 => butMove(이벤트: OnClick)

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

    }
}
