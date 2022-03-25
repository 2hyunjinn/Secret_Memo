package com.comu.android.secretmemo

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget. TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, MemoActivity::class.java)
        val textMsg = findViewById<TextView>(R.id.textView)


        findViewById<Button>(R.id.button).setOnClickListener{
            // EditText 컴포넌트를 찾아서 editText 변수에 저장한다.
            val editEmail = findViewById<EditText>(R.id.editTextEmail)
            val emailText = editEmail.text.toString()

            // editText 에서 사용자가 입력한 텍스트를 불러와 passwordText 에 저장한다.
            val editText=findViewById<EditText>(R.id.editTextNumberPassword2)
            val pwText=editText.text.toString()


            if(emailText == "guswlsdl04@naver.com"){
                if(pwText == "123456"){
                    Log.d("SecretMemo", "통과")

                    startActivity(intent)
                    this.finish()
                }
                else{
                    Log.d("SecretMemo","비밀번호 오류")
                    textMsg.text = "비밀번호가 틀렸어요. 다시 입력해주세요."
                }
            }
            else {
                Log.d("SecretMemo", "이메일 오류")
                textMsg.text = "이메일이 틀렸어요. 다시 입력해주세요."
            }
        }
    }
}