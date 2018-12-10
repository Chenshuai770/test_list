package cs.com.test_list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRlList;
    private List<MultipleItem> mData=new ArrayList<>();
    private String url1="https://ws1.sinaimg.cn/large/0065oQSqgy1fxno2dvxusj30sf10nqcm.jpg";
    private String url2="https://ws1.sinaimg.cn/large/0065oQSqgy1fxd7vcz86nj30qo0ybqc1.jpg";
    private String url3="https://ws1.sinaimg.cn/large/0065oQSqgy1fwyf0wr8hhj30ie0nhq6p.jpg";
    private String url4="https://ws1.sinaimg.cn/large/0065oQSqgy1fwgzx8n1syj30sg15h7ew.jpg";
    private String url5="https://ws1.sinaimg.cn/large/0065oQSqly1fw8wzdua6rj30sg0yc7gp.jpg";
    private String url6="https://ws1.sinaimg.cn/large/0065oQSqly1fvexaq313uj30qo0wldr4.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {


        List<String > mImg1=new ArrayList<>();
        List<String> mImg2=new ArrayList<>();
        List<String> mImg3=new ArrayList<>();


        mImg1.add(url1);
        mImg2.add(url2);
        mImg2.add(url3);
        mImg3.add(url4);
        mImg3.add(url5);
        mImg3.add(url6);


        MultipleItem multipleItem1 = new MultipleItem(MultipleItem.IMG1,mImg1);
        MultipleItem multipleItem2 = new MultipleItem(MultipleItem.IMG2,mImg2);
        MultipleItem multipleItem3 = new MultipleItem(MultipleItem.IMG3,mImg3);

        MultipleItem multipleItem4 = new MultipleItem(MultipleItem.IMG1,mImg1);
        MultipleItem multipleItem5 = new MultipleItem(MultipleItem.IMG2,mImg2);
        MultipleItem multipleItem6 = new MultipleItem(MultipleItem.IMG3,mImg3);

        mData.add(multipleItem1);
        mData.add(multipleItem2);
        mData.add(multipleItem3);
        mData.add(multipleItem5);
        mData.add(multipleItem6);
        mData.add(multipleItem4);

        mRlList = (RecyclerView) findViewById(R.id.rl_list);
        ImageAdapter adapter = new ImageAdapter(mData);
        mRlList.setLayoutManager(new LinearLayoutManager(this));
        mRlList.setAdapter(adapter);

        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, position+"", Toast.LENGTH_SHORT).show();

            }
        });




    }
}
