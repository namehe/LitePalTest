package com.example.gesangdianzi.litepaltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.litepal.LitePal;
import org.litepal.tablemanager.Connector;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button create = findViewById(R.id.create);
        Button insert = findViewById(R.id.insert);
        Button delete = findViewById(R.id.delete);
        Button update = findViewById(R.id.update);
        Button select = findViewById(R.id.select);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Connector.getDatabase();
            }
        });
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Book book = new Book("莫言","丰乳肥臀",520,12.00,"人民出版社");
               book.save();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LitePal.delete(Book.class,1);//删除某一条
                LitePal.deleteAll("price>?","15.00");//删除多条
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setPrice(15.28);
                book.setName("呵呵哒");
                book.updateAll("name=? and author=?","朝花夕拾","鲁迅");
            }
        });
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = LitePal.find(Book.class, 5);//查询某一个id值
                List<Book> allSongs = LitePal.findAll(Book.class);//查询所有
                List<Book> songs = LitePal.where("name = ? and price < ?", "丰乳肥臀", "15").order("price").find(Book.class);
                Log.e("----------------->>",songs.toString());
                //按照价格低于15的丰乳肥臀查询
            }
        });
    }
}
