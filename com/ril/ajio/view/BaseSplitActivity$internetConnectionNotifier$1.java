/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
package com.ril.ajio.view;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.R$id;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import com.ril.ajio.view.BaseSplitActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class BaseSplitActivity$internetConnectionNotifier$1
extends BroadcastReceiver {
    public final /* synthetic */ BaseSplitActivity a;

    public BaseSplitActivity$internetConnectionNotifier$1(BaseSplitActivity baseSplitActivity) {
        this.a = baseSplitActivity;
    }

    public final void onReceive(Context object, Intent object2) {
        int n3 = 1;
        Object object3 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "intent");
        object = "alert_type";
        int n4 = 3;
        int n7 = object2.getIntExtra((String)object, n4);
        object2 = this.a;
        if (n7 != n4) {
            n4 = 4;
            if (n7 != n4) {
                n4 = 5;
                if (n7 != n4) {
                    object3 = BaseSplitActivity.access$getErrorMessageDisplayHandler$p((BaseSplitActivity)object2);
                    object3.getClass();
                    Object object4 = "activity";
                    Intrinsics.checkNotNullParameter(object2, (String)object4);
                    int n8 = object2.isFinishing();
                    if (n8 == 0) {
                        n8 = 0x1020002;
                        object4 = ((AppCompatActivity)object2).findViewById(n8);
                        Object object5 = ab0_0.a(n7);
                        int n10 = -2;
                        ((ab0_0)object3).a = object4 = Snackbar.make((View)object4, (CharSequence)object5, n10);
                        int n14 = 0;
                        object5 = null;
                        if (object4 != null) {
                            object4 = ((BaseTransientBottomBar)object4).getView();
                        } else {
                            n8 = 0;
                            object4 = null;
                        }
                        if (object4 != null) {
                            n14 = R$id.snackbar_text;
                            object5 = (TextView)object4.findViewById(n14);
                        }
                        if (object4 != null) {
                            n10 = t70.getColor((Context)object2, 17170443);
                            object4.setBackgroundColor(n10);
                        }
                        if (object5 != null) {
                            n10 = t70.getColor((Context)object2, 17170444);
                            object5.setTextColor(n10);
                        }
                        object5 = StringCompanionObject.INSTANCE;
                        n14 = R$string.acc_error_message;
                        object5 = hv3_0.K(n14);
                        object = ab0_0.a(n7);
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = object;
                        object = xh2_0.a(objectArray, n3, (String)object5, "format(...)");
                        object5 = Looper.getMainLooper();
                        Object object6 = new Handler((Looper)object5);
                        object5 = new va0_0((View)object4, (String)object);
                        long l2 = 100;
                        object6.postDelayed((Runnable)object5, l2);
                        object = ((ab0_0)object3).a;
                        if (object != null) {
                            n3 = R$color.color_176d93;
                            n3 = t70.getColor((Context)object2, n3);
                            ((Snackbar)object).setActionTextColor(n3);
                        }
                        if ((object = ((ab0_0)object3).a) != null) {
                            n3 = R$string.try_again;
                            object6 = hv3_0.K(n3);
                            object4 = new wa0_0((ab0_0)object3);
                            ((Snackbar)object).setAction((CharSequence)object6, (View.OnClickListener)object4);
                        }
                        if ((object = ((ab0_0)object3).a) != null) {
                            ((Snackbar)object).show();
                        }
                    }
                    ((BaseSplitActivity)object2).dismissSlowInternetNotification();
                } else {
                    ((BaseSplitActivity)object2).dismissSlowInternetNotification();
                }
            } else {
                ((BaseSplitActivity)object2).showSlowInternetNotification();
            }
        } else {
            object = ab0_0.Companion;
            object.getClass();
            aB0$a.a((Activity)object2);
            ((BaseSplitActivity)object2).dismissSlowInternetNotification();
        }
    }
}

