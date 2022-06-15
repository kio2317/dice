/**
 * 대화형 주사위 롤러 앱 만들기
**/
package com.example.diceriller
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

/**
 * 실행코드.
 * rollButton이라는 변수의 Button저장
 *  Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show() //한줄로 가능.
**/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val rollButton: Button = findViewById(R.id.button)
    rollButton.setOnClickListener {
            rollDice( )
          //  val  resultTextView: TextView = findViewById(R.id.textView)
            // resultTextView.text ="6"
            Toast.makeText(this, "주사위를 굴렸어요.!", Toast.LENGTH_SHORT).show()
        }
    }
    // rollDice 메서드.
    private fun rollDice() {
        val dice = Dice(6) // 주사위 번호 6번까지 입력
        val diceRoll = dice.roll() // diceRoll이라는 변수의 저장
        val resultTextView: TextView = findViewById(R.id.textView) //텍스트뷰 찾기
        resultTextView.text = diceRoll.toString() // diceroll = 변수는 숫자지만 text = 문자/ to.string으로 변환 문자열로 변환
    }

    // Dice 클래스 추가.
    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }

}