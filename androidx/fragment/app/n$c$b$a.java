/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.fragment.app;

import android.view.View;
import androidx.fragment.app.n$c$b;
import kotlin.jvm.internal.Intrinsics;

public final class n$c$b$a {
    public static n$c$b a(View object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        float f5 = object.getAlpha();
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (f7 == false && (f7 = (float)object.getVisibility()) == false) {
            object = n$c$b.INVISIBLE;
        } else {
            int n3 = object.getVisibility();
            object = n$c$b$a.b(n3);
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static n$c$b b(int n3) {
        if (n3 == 0) return n$c$b.VISIBLE;
        int n4 = 4;
        if (n3 == n4) return n$c$b.INVISIBLE;
        n4 = 8;
        if (n3 == n4) {
            return n$c$b.GONE;
        }
        String string2 = hj0_0.a(n3, "Unknown visibility ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

