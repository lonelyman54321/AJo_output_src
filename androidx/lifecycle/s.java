/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.i$a;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.r$a;
import androidx.lifecycle.s$a;
import androidx.lifecycle.w;
import kotlin.jvm.internal.Intrinsics;

public final class s
extends Zy0 {
    final /* synthetic */ r this$0;

    public s(r r5) {
        this.this$0 = r5;
    }

    public void onActivityCreated(Activity object, Bundle object2) {
        object2 = "activity";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 < n4) {
            n3 = w.b;
            Intrinsics.checkNotNullParameter(object, "<this>");
            object = object.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            object = (w)((Object)object);
            object2 = this.this$0.h;
            object.a = object2;
        }
    }

    public void onActivityPaused(Activity object) {
        int n3;
        String string2 = "activity";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.this$0;
        object.b = n3 = object.b + -1;
        if (n3 == 0) {
            string2 = object.e;
            Intrinsics.checkNotNull(string2);
            object = object.g;
            long l2 = 700L;
            string2.postDelayed((Runnable)object, l2);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle object) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        r r5 = this.this$0;
        object = new s$a(r5);
        r$a.a(activity, (Application.ActivityLifecycleCallbacks)object);
    }

    public void onActivityStopped(Activity object) {
        int n3;
        Object object2 = "activity";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = this.this$0;
        object.a = n3 = object.a + -1;
        if (n3 == 0 && (n3 = (int)(object.c ? 1 : 0)) != 0) {
            object2 = object.f;
            i$a i$a = i$a.ON_STOP;
            ((o)object2).f(i$a);
            n3 = 1;
            object.d = n3;
        }
    }
}

