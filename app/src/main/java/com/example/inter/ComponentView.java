package com.example.inter;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

public class ComponentView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componente_view);

        Bundle bundle = getIntent().getExtras();
        String componente = bundle.getString("Componente");

        switch (componente){
            case "Botão":
                ComponenteBotao();
                break;


        }

    }


    protected  void ComponenteBotao(){


        EditText eJ = findViewById(R.id.TextJava);
        EditText eH = findViewById(R.id.TextHtml);
        eJ.setText("findViewById(R.id.IDDOBOTAO);");
        eH.setText("<Button\n" +
                "        android:id=\"@+id/button3\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"72dp\"\n" +
                "        android:text=\"Button\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />;");

        FrameLayout container = (FrameLayout) findViewById(R.id.container);


        Button button = new Button(this);
        button.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT));
        button.setText("BOTÃO");


        container.addView(button);

    }
}