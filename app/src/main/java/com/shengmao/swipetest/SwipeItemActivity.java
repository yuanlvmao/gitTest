package com.shengmao.swipetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import cn.bingoogolapple.swipeitemlayout.BGASwipeItemLayout;

public class SwipeItemActivity extends AppCompatActivity {
    private BGASwipeItemLayout mTestSil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipeitem);
        mTestSil = (BGASwipeItemLayout) findViewById(R.id.sil_swipeitem_test);
        findViewById(R.id.iv_swipeitem_avator).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(SwipeItemActivity.this, "111?", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        findViewById(R.id.iv_swipeitem_delete).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(SwipeItemActivity.this, "长按了删�?", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        mTestSil.setDelegate(new BGASwipeItemLayout.BGASwipeItemLayoutDelegate() {
            @Override
            public void onBGASwipeItemLayoutOpened(BGASwipeItemLayout swipeItemLayout) {
                Toast.makeText(SwipeItemActivity.this, "打开", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onBGASwipeItemLayoutClosed(BGASwipeItemLayout swipeItemLayout) {
                Toast.makeText(SwipeItemActivity.this, "关闭", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onBGASwipeItemLayoutStartOpen(BGASwipeItemLayout swipeItemLayout) {
                Toast.makeText(SwipeItemActivity.this, "�?始打�?", Toast.LENGTH_SHORT).show();
            }

        });
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_swipeitem_avator:
                Toast.makeText(this, "点击了头�?", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_swipeitem_delete:
                Toast.makeText(this, "点击了删�?", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_swipeitem_open:
                mTestSil.open();
                break;
            case R.id.btn_swipeitem_close:
                mTestSil.close();
                break;
            case R.id.btn_swipeitem_openwithanim:
                mTestSil.openWithAnim();
                break;
            case R.id.btn_swipeitem_closewithanim:
                mTestSil.closeWithAnim();
                break;
            case R.id.btn_swipeitem_status:
                showStatus();
                break;
        }
    }

    private void showStatus() {
        if (mTestSil.isOpened()) {
            Toast.makeText(this, "打开状�??", Toast.LENGTH_SHORT).show();
        } else if (mTestSil.isClosed()) {
            Toast.makeText(this, "关闭状�??", Toast.LENGTH_SHORT).show();
        }
    }
}