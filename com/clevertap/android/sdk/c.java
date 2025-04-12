/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 */
package com.clevertap.android.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.InAppNotificationActivity$c;
import com.clevertap.android.sdk.R$string;
import com.clevertap.android.sdk.b;
import kotlin.jvm.internal.Intrinsics;

public final class c {
    public final CleverTapInstanceConfig a;
    public boolean b;
    public final Activity c;
    public boolean d;

    public c(Activity activity, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.c = activity;
        this.a = cleverTapInstanceConfig;
        this.d = false;
    }

    public final void a(boolean bl2, InAppNotificationActivity$c object) {
        Object object2 = this.c;
        int n3 = qi_2.f(32, (Context)object2);
        if (n3 != 0) {
            this.b = bl2;
            String[] stringArray = "android.permission.POST_NOTIFICATIONS";
            n3 = t70.checkSelfPermission((Context)object2, (String)stringArray);
            int n4 = -1;
            int n7 = 1;
            if (n3 == n4) {
                object = this.a;
                yi_1.a((Context)object2, (CleverTapInstanceConfig)object);
                int n8 = yi_1.c;
                Object object3 = E80.e();
                if (object3 == null) {
                    com.clevertap.android.sdk.b.c();
                } else {
                    n3 = (int)(androidx.core.app.b.b((Activity)object3, (String)stringArray) ? 1 : 0);
                    if (n8 == 0 && n3 != 0 && (n8 = this.b) != 0) {
                        stringArray = new aC2(this);
                        n3 = 1;
                        object = new P7(this, n3);
                        Intrinsics.checkNotNullParameter(object2, "activity");
                        Intrinsics.checkNotNullParameter(stringArray, "onAccept");
                        Intrinsics.checkNotNullParameter(object, "onDecline");
                        Object object4 = object2.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(object4, "activity.applicationContext");
                        int n10 = R$string.ct_permission_not_available_title;
                        int n14 = R$string.ct_permission_not_available_message;
                        int n15 = R$string.ct_permission_not_available_open_settings_option;
                        int n16 = R$string.ct_txt_cancel;
                        int[] nArray = new int[]{n10, n14, n15, n16};
                        object3 = new fi_1((Context)object4, nArray);
                        object4 = object3.b;
                        n10 = 0;
                        nArray = null;
                        object4 = (String)tp_2.E(0, object4);
                        Object object5 = object3.b;
                        String string2 = (String)tp_2.E(n7, object5);
                        object5 = object3.b;
                        object5 = (String)tp_2.E(2, object5);
                        object3 = object3.b;
                        n15 = 3;
                        object3 = (String)tp_2.E(n15, object3);
                        n16 = 16974394;
                        AlertDialog.Builder builder = new AlertDialog.Builder((Context)object2, n16);
                        object2 = builder.setTitle((CharSequence)object4).setCancelable(false).setMessage((CharSequence)string2);
                        object4 = new Jc((aC2)stringArray);
                        stringArray = object2.setPositiveButton((CharSequence)object5, (DialogInterface.OnClickListener)object4);
                        object2 = new Kc((P7)object);
                        stringArray = stringArray.setNegativeButton((CharSequence)object3, (DialogInterface.OnClickListener)object2);
                        stringArray.show();
                    } else {
                        stringArray = new String[]{stringArray};
                        n8 = 102;
                        androidx.core.app.b.a(n8, object2, stringArray);
                    }
                }
            } else {
                object.a();
                bl2 = object2 instanceof InAppNotificationActivity;
                if (bl2) {
                    object2 = (InAppNotificationActivity)object2;
                    bl2 = false;
                    stringArray = null;
                    object2.s2(null, n7 != 0);
                }
            }
        }
    }
}

