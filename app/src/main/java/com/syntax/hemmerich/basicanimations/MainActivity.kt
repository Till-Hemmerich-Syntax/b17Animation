package com.syntax.hemmerich.basicanimations

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.syntax.hemmerich.basicanimations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnClick.setOnClickListener {
            if(binding.edEmail.text.isEmpty()){
                var a = AnimationUtils.loadAnimation(this,R.anim.shake)
                binding.edEmail.startAnimation(a)
                //binding.btnClick.startAnimation(a)
            }
        }

//        binding.btnClick.setOnClickListener {
//            binding.btnClick.animate().apply {
//                duration=2000
//                //scaleXBy(2.5f)
//                //scaleYBy(2.5f)
//                //rotationBy(160f)
//                //scaleX(0.5f)
//                //scaleY(0.5f)
//                scaleX(0.5f)
//                scaleY(0.5f)
//                alpha(0.5f)
//            }.withEndAction {
//                binding.btnClick.animate().apply {
//                    duration=2000
//                    rotationBy(360f)
//                }.withEndAction {
//                    binding.btnClick.animate().apply {
//                        duration=2000
//                        scaleX(1.0f)
//                        scaleY(1.0f)
//                    }.withEndAction {
//                        binding.btnClick.animate().apply {
//                            translationXBy(200f)
//                            translationYBy(100f)
//                            alpha(1.0f)
//                        }
//                    }
//            }
//            }.start()
//        }
    }
}