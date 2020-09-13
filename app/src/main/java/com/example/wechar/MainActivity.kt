package com.example.wechar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 获取传递过来的数据
        intent.data?.schemeSpecificPart.also {
            // 显示到textview中
            text.text = it
        }

        // 返回按钮
        mBack.setOnClickListener {
            // 回调数据
            Intent().apply {
                putExtra("shareResult","分享成功")
            }.also {
                setResult(1,it)
                finish()
            }
        }
    }
}