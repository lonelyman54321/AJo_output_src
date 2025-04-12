/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package androidx.lifecycle;

import android.app.Activity;
import androidx.lifecycle.i$a;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import kotlin.jvm.internal.Intrinsics;

public final class s$a
extends Zy0 {
    final /* synthetic */ r this$0;

    public s$a(r r5) {
        this.this$0 = r5;
    }

    public void onActivityPostResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.this$0.a();
    }

    public void onActivityPostStarted(Activity object) {
        Object object2 = "activity";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = this.this$0;
        int n3 = object.a;
        int n4 = 1;
        object.a = n3 += n4;
        if (n3 == n4 && (n3 = (int)(object.d ? 1 : 0)) != 0) {
            object2 = object.f;
            i$a i$a = i$a.ON_START;
            ((o)object2).f(i$a);
            n3 = 0;
            object2 = null;
            object.d = false;
        }
    }
}

