/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build$VERSION
 */
package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import androidx.lifecycle.i$a;
import androidx.lifecycle.o;
import androidx.lifecycle.w;
import androidx.lifecycle.w$c;
import androidx.lifecycle.w$c$a;
import kotlin.jvm.internal.Intrinsics;

public final class w$b {
    public static void a(Activity object, i$a i$a) {
        Intrinsics.checkNotNullParameter(object, "activity");
        String string2 = "event";
        Intrinsics.checkNotNullParameter((Object)i$a, string2);
        boolean bl2 = object instanceof ou1_0;
        if (bl2) {
            ((ou1_0)object).getLifecycle().f(i$a);
            return;
        }
        bl2 = object instanceof mu1_1;
        if (bl2 && (bl2 = (object = ((mu1_1)object).getLifecycle()) instanceof o)) {
            object = (o)object;
            ((o)object).f(i$a);
        }
    }

    public static void b(Activity activity) {
        w$c$a w$c$a;
        Object object = "activity";
        Intrinsics.checkNotNullParameter(activity, (String)object);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4) {
            w$c$a = w$c.Companion;
            w$c$a.getClass();
            Intrinsics.checkNotNullParameter(activity, (String)object);
            object = new w$c();
            GJ2.a(activity, (w$c)object);
        }
        if ((w$c$a = (activity = activity.getFragmentManager()).findFragmentByTag((String)(object = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"))) == null) {
            w$c$a = activity.beginTransaction();
            w w4 = new w();
            object = w$c$a.add(w4, (String)object);
            object.commit();
            activity.executePendingTransactions();
        }
    }
}

