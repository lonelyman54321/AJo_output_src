/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.IntentFilter
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.TranslateAnimation
 */
package com.ril.ajio.payment.activity;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.app.AppCompatActivity;
import com.ril.ajio.R$id;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$string;
import com.ril.ajio.payment.activity.BaseActivity$2;
import com.ril.ajio.payment.activity.BaseActivity$a;
import com.ril.ajio.payment.activity.BaseActivity$b;

public class BaseActivity
extends AppCompatActivity {
    public static final /* synthetic */ int Y;
    public final BaseActivity$a X;

    public BaseActivity() {
        BaseActivity$a baseActivity$a;
        this.X = baseActivity$a = new BaseActivity$a(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void dismissSlowInternetNotification() {
        int n3 = this.isFinishing();
        if (n3 != 0) {
            return;
        }
        n3 = R$string.acc_alert_message;
        Object object = hv3_0.K(n3);
        String string2 = hv3_0.K(R$string.connection_slow_error);
        int n4 = 1;
        Object[] objectArray = new Object[n4];
        Object var6_8 = null;
        objectArray[0] = string2;
        object = String.format((String)object, objectArray);
        int n7 = R$id.slow_internet;
        string2 = this.findViewById(n7);
        if (string2 != null && (n4 = string2.getVisibility()) == 0) {
            cp$a cp$a = cp_1.Companion;
            n4 = (int)(km_1.b(cp$a) ? 1 : 0);
            n4 = n4 != 0 ? hv3_0.w(R$integer.notification_anim_delay_accesibility) : hv3_0.w(R$integer.notification_anim_delay);
            long l2 = n4;
            float f5 = -100.0f;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, f5);
            translateAnimation.setDuration(l2);
            Looper looper = Looper.getMainLooper();
            Handler handler = new Handler(looper);
            BaseActivity$2 baseActivity$2 = new BaseActivity$2((View)string2, (String)object);
            long l3 = 100;
            handler.postDelayed((Runnable)baseActivity$2, l3);
            object = new BaseActivity$b(this, (View)string2);
            translateAnimation.setAnimationListener((Animation.AnimationListener)object);
            string2.startAnimation((Animation)translateAnimation);
        }
    }

    public final void onPause() {
        super.onPause();
        Xv1 xv1 = Xv1.a(this.getApplicationContext());
        BaseActivity$a baseActivity$a = this.X;
        xv1.d(baseActivity$a);
    }

    public final void onResume() {
        super.onResume();
        Xv1 xv1 = Xv1.a(this.getApplicationContext());
        BaseActivity$a baseActivity$a = this.X;
        IntentFilter intentFilter = new IntentFilter("pe_no_internet_connection");
        xv1.b(baseActivity$a, intentFilter);
    }
}

