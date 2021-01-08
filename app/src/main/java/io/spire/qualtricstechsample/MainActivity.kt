package io.spire.qualtricstechsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.qualtrics.digital.IQualtricsCallback
import com.qualtrics.digital.Qualtrics
import com.qualtrics.digital.TargetingResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Qualtrics.instance().initialize("name", "ZN_12345678910", "SI_12345678910", this);
    }
}