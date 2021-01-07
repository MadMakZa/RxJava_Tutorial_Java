package com.example.rxjavatutorialjava;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

import static com.example.rxjavatutorialjava.RxDemo.testRx;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private EditText mEditText;
    private PublishSubject<String> mTextChangedSubject;

    private void init(){
        mRecyclerView = findViewById(R.id.recyclerView);
        mEditText = findViewById(R.id.editText);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        showDialog("First question", "Yes", "No");

    }

    Observable<Integer> showDialog(String title, String positive, String negative){

        PublishSubject publishSubject = PublishSubject.create();

        AlertDialog.Builder dialog = new AlertDialog.Builder(this)
                .setTitle(title)
                //передаем индекс нажатой кнопки
                .setPositiveButton(positive, (view, index) -> publishSubject.onNext(index))
                .setNegativeButton(negative,(view, index) -> publishSubject.onNext(index));

        return publishSubject
                .hide()
                .doOnSubscribe(disposable -> dialog.show());


    }
}