package com.example.scrollingtext2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String KEY_INDEX ="index";
    TextView texto;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.addedComments);
        editText = findViewById(R.id.comments);
        if(savedInstanceState !=null){
            texto.setText(savedInstanceState.getCharSequence(KEY_INDEX,null));
        }

    }
    public void añadirComentario(View view) {
        String comentario = editText.getText().toString();
        if (!comentario.isEmpty()){
            texto.append(comentario+"\n");
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putCharSequence(KEY_INDEX,texto.getText());
    }

}