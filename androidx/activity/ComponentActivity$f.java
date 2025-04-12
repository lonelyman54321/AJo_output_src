/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 */
package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.b;
import kotlin.jvm.internal.Intrinsics;

public final class ComponentActivity$f
extends K3 {
    public final /* synthetic */ ComponentActivity h;

    public ComponentActivity$f(ComponentActivity componentActivity) {
        this.h = componentActivity;
    }

    public final void b(int n3, x3 object, Object object2) {
        boolean bl2;
        x3$a x3$a;
        boolean bl3;
        Intrinsics.checkNotNullParameter(object, "contract");
        ComponentActivity componentActivity = this.h;
        Object object3 = object.b((Context)componentActivity, object2);
        if (object3 != null) {
            object2 = Looper.getMainLooper();
            object = new Handler((Looper)object2);
            object2 = new b10_0(this, n3, (x3$a)object3);
            object.post((Runnable)object2);
            return;
        }
        if ((object2 = (object = object.a((Context)componentActivity, object2)).getExtras()) != null) {
            object2 = object.getExtras();
            Intrinsics.checkNotNull(object2);
            object2 = object2.getClassLoader();
            if (object2 == null) {
                object2 = componentActivity.getClassLoader();
                object.setExtrasClassLoader((ClassLoader)object2);
            }
        }
        if (bl3 = object.hasExtra((String)(object2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"))) {
            object3 = object.getBundleExtra((String)object2);
            object.removeExtra((String)object2);
            x3$a = object3;
        } else {
            bl2 = false;
            object2 = null;
            x3$a = null;
        }
        object2 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        object3 = object.getAction();
        bl2 = Intrinsics.areEqual(object2, object3);
        if (bl2) {
            object2 = "androidx.activity.result.contract.extra.PERMISSIONS";
            if ((object = object.getStringArrayExtra((String)object2)) == null) {
                object = new String[]{};
            }
            androidx.core.app.b.a(n3, componentActivity, object);
        } else {
            object2 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
            object3 = object.getAction();
            bl2 = Intrinsics.areEqual(object2, object3);
            if (bl2) {
                object2 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
                object = (IntentSenderRequest)object.getParcelableExtra((String)object2);
                Intrinsics.checkNotNull(object);
                IntentSender intentSender = object.a;
                Intent intent = object.b;
                int n4 = object.c;
                int n7 = object.d;
                try {
                    componentActivity.startIntentSenderForResult(intentSender, n3, intent, n4, n7, 0, (Bundle)x3$a);
                }
                catch (IntentSender.SendIntentException sendIntentException) {
                    object3 = Looper.getMainLooper();
                    object2 = new Handler((Looper)object3);
                    object3 = new c10_0(this, n3, sendIntentException);
                    object2.post((Runnable)object3);
                }
            } else {
                componentActivity.startActivityForResult((Intent)object, n3, (Bundle)x3$a);
            }
        }
    }
}

