/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.animation.Animation
 *  android.view.animation.TranslateAnimation
 *  android.widget.TextView
 */
package com.ril.ajio.payment.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.R$id;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$string;
import com.ril.ajio.payment.activity.BaseActivity;
import com.ril.ajio.payment.activity.BaseActivity$4;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class BaseActivity$a
extends BroadcastReceiver {
    public final /* synthetic */ BaseActivity a;

    public BaseActivity$a(BaseActivity baseActivity) {
        this.a = baseActivity;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onReceive(Context object, Intent object2) {
        Object object3;
        int n3 = 1;
        String string2 = null;
        object3 = (ir2_1)((Object)cp_1.N((Intent)object3, "alert_type", ir2_1.class));
        ir2_1 ir2_12 = ir2_1.OTHERS_ERRORS;
        Object object4 = this.a;
        if (object3 == ir2_12) {
            int n4 = R$string.something_wrong_msg;
            object3 = hv3_0.K(n4);
            int n7 = R$string.acc_alert_message;
            String string3 = hv3_0.K(n7);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object3;
            String string4 = String.format(string3, objectArray);
            mq0_2.b((String)object3, string4);
            ((BaseActivity)object4).dismissSlowInternetNotification();
            return;
        }
        ir2_1 ir2_13 = ir2_1.NO_INTERNET_RETRY_INITIATED;
        if (object3 == ir2_13) {
            int n8 = object4.isFinishing();
            if (n8 != 0) {
                return;
            }
            n8 = R$id.slow_internet;
            object3 = ((AppCompatActivity)object4).findViewById(n8);
            if (object3 == null) return;
            String string5 = hv3_0.K(R$string.acc_alert_message);
            int n10 = R$string.connection_slow_error;
            String string6 = hv3_0.K(n10);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string6;
            String string7 = String.format(string5, objectArray);
            int n14 = R$id.slow_internet_text;
            TextView textView = (TextView)((AppCompatActivity)object4).findViewById(n14);
            object4 = cp_1.Companion;
            int n15 = km_1.b((cp$a)object4);
            n15 = n15 != 0 ? hv3_0.w(R$integer.notification_anim_delay_accesibility) : hv3_0.w(R$integer.notification_anim_delay);
            long l2 = n15;
            int n16 = R$string.connection_slow_error;
            textView.setText(n16);
            float f5 = -100.0f;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f5, 0.0f);
            translateAnimation.setDuration(l2);
            object3.setVisibility(0);
            object4 = Looper.getMainLooper();
            string2 = new Handler((Looper)object4);
            object4 = new BaseActivity$4(textView, string7);
            long l3 = 100;
            string2.postDelayed((Runnable)object4, l3);
            object3.setAnimation((Animation)translateAnimation);
            return;
        }
        ir2_1 ir2_14 = ir2_1.NO_INTERNET_RETRY_SUCCESS;
        if (object3 == ir2_14) {
            ((BaseActivity)object4).dismissSlowInternetNotification();
            return;
        }
        n3 = BaseActivity.Y;
        n3 = (int)(object4.isFinishing() ? 1 : 0);
        if (n3 == 0) {
            sa0_2.Companion.getClass();
            Intrinsics.checkNotNullParameter(object3, "alertType");
            Bundle bundle = new Bundle();
            String string8 = "SERVERERROR";
            bundle.putSerializable(string8, (Serializable)object3);
            object3 = new sa0_2();
            ((Fragment)object3).setArguments(bundle);
            ((DialogFragment)object3).setCancelable(false);
            FragmentManager fragmentManager = ((FragmentActivity)object4).getSupportFragmentManager();
            string2 = "ErrorBottomSheetDialog";
            ((DialogFragment)object3).show(fragmentManager, string2);
        }
        ((BaseActivity)object4).dismissSlowInternetNotification();
    }
}

