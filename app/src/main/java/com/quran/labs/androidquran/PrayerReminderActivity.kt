package com.quran.labs.androidquran

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

/**
 * Shows the dedication prayer on every launch, then continues to the Quran.
 */
class PrayerReminderActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    AlertDialog.Builder(this)
      .setTitle("برجاء الدعاء لأشرف رمضان العبسي")
      .setMessage(
        "اللهم ارحم أشرف رمضان العبسي، واغفر له بقدر اشتياقنا إليه، " +
          "اللهم أنر قبره، وآنس وحشته، واجعل الجنة داره، واجعل كل دعاء يُرفع له نورًا ورحمة، " +
          "اللهم ارفع مقامه في المهديين، واجمعنا به في جنات النعيم، اللهم لا تحرمه لذة النظر إلى وجهك الكريم. 🤍\n\n" +
          "اللهم ارحمه واغفر له واجعل الفردوس الأعلى مستقره."
      )
      .setCancelable(false)
      .setPositiveButton("متابعة إلى المصحف") { _, _ ->
        startActivity(Intent(this, QuranDataActivity::class.java))
        finish()
      }
      .show()
  }
}
