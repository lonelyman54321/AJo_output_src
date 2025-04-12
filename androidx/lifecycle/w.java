/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.i$a;
import androidx.lifecycle.w$a;
import androidx.lifecycle.w$b;
import kotlin.jvm.internal.Intrinsics;

public class w
extends Fragment {
    public static final /* synthetic */ int b;
    public w$a a;

    public final void a(i$a i$a) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 < n4) {
            Activity activity = this.getActivity();
            String string2 = "activity";
            Intrinsics.checkNotNullExpressionValue(activity, string2);
            w$b.a(activity, i$a);
        }
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated(object);
        object = i$a.ON_CREATE;
        this.a((i$a)((Object)object));
    }

    public final void onDestroy() {
        super.onDestroy();
        i$a i$a = i$a.ON_DESTROY;
        this.a(i$a);
        this.a = null;
    }

    public final void onPause() {
        super.onPause();
        i$a i$a = i$a.ON_PAUSE;
        this.a(i$a);
    }

    public final void onResume() {
        super.onResume();
        Object object = this.a;
        if (object != null) {
            object.onResume();
        }
        object = i$a.ON_RESUME;
        this.a((i$a)((Object)object));
    }

    public final void onStart() {
        super.onStart();
        Object object = this.a;
        if (object != null) {
            object.onStart();
        }
        object = i$a.ON_START;
        this.a((i$a)((Object)object));
    }

    public final void onStop() {
        super.onStop();
        i$a i$a = i$a.ON_STOP;
        this.a(i$a);
    }
}

