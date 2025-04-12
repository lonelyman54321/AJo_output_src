/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.a;
import java.util.ArrayList;
import java.util.Objects;

public final class a$a
implements View.OnClickListener {
    public final /* synthetic */ a a;

    public a$a(a a2) {
        this.a = a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View object) {
        Throwable throwable2;
        Object object2;
        a a2;
        block9: {
            Object object3;
            Object object4;
            Object object5;
            boolean bl2;
            block8: {
                object = (Integer)object.getTag();
                bl2 = ((Integer)object).intValue();
                a2 = this.a;
                a2.getClass();
                try {
                    object2 = a2.e;
                    object2 = ((CTInAppNotification)object2).e;
                    object5 = object2 = ((ArrayList)object2).get((int)(bl2 ? 1 : 0));
                    object5 = (CTInAppNotificationButton)object2;
                    object2 = ((CTInAppNotificationButton)object5).h;
                    if (object2 == null) {
                        object2 = CTInAppAction.CREATOR;
                        object2.getClass();
                        object2 = new CTInAppAction(null);
                        object4 = xf1_1.CLOSE;
                        ((CTInAppAction)object2).a = object4;
                    }
                    object3 = object2;
                    String string2 = ((CTInAppNotificationButton)object5).f;
                    object2 = a2.Ra();
                    if (object2 != null) {
                        object4 = a2.e;
                        FragmentActivity fragmentActivity = a2.getActivity();
                        object2 = object2.O1((CTInAppNotification)object4, (CTInAppAction)object3, string2, null, (Context)fragmentActivity);
                    } else {
                        object2 = null;
                    }
                    if (bl2) break block8;
                    object = a2.e;
                    boolean bl3 = ((CTInAppNotification)object).M;
                    if (bl3 && (object4 = a2.h) != null) {
                        bl2 = ((CTInAppNotification)object).N;
                        object4.a2(bl2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
            }
            if ((object = ((CTInAppNotificationButton)object5).h) != null && (object4 = xf1_1.REQUEST_FOR_PERMISSIONS) == (object3 = ((CTInAppAction)object).a) && (object4 = a2.h) != null) {
                bl2 = ((CTInAppAction)object).e;
                object4.a2(bl2);
                return;
            }
            a2.Pa((Bundle)object2);
            return;
        }
        object2 = a2.b.b();
        Throwable throwable3 = throwable2.getCause();
        Objects.toString(throwable3);
        object2.getClass();
        b.e();
        a2.Pa(null);
    }
}

