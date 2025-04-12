/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Log
 */
package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import kotlin.jvm.internal.Intrinsics;

public final class FragmentManager$k
extends x3 {
    public final Intent a(Context context, Object object) {
        int n3;
        int n4;
        Object object2;
        Bundle bundle;
        object = (IntentSenderRequest)object;
        context = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Object object3 = ((IntentSenderRequest)object).b;
        if (object3 != null && (bundle = object3.getBundleExtra((String)(object2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"))) != null) {
            context.putExtra((String)object2, bundle);
            object3.removeExtra((String)object2);
            object2 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
            int n7 = 0;
            bundle = null;
            n4 = (int)(object3.getBooleanExtra((String)object2, false) ? 1 : 0);
            if (n4 != 0) {
                object3 = ((IntentSenderRequest)object).a;
                Intrinsics.checkNotNullParameter(object3, "intentSender");
                n7 = ((IntentSenderRequest)object).c;
                n3 = ((IntentSenderRequest)object).d;
                object = object2 = new IntentSenderRequest((IntentSender)object3, null, n7, n3);
            }
        }
        object3 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        context.putExtra((String)object3, (Parcelable)object);
        object = "FragmentManager";
        n4 = 2;
        n3 = Log.isLoggable((String)object, (int)n4);
        if (n3 != 0) {
            context.toString();
        }
        return context;
    }

    public final Object c(int n3, Intent intent) {
        ActivityResult activityResult = new ActivityResult(n3, intent);
        return activityResult;
    }
}

