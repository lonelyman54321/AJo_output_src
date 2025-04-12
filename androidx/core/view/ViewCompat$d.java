/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.core.view;

import android.view.View;
import androidx.core.view.f;
import androidx.core.view.f$k;

public final class ViewCompat$d {
    public static f a(View view) {
        Object object = view.getRootWindowInsets();
        f$k f$k = null;
        if (object == null) {
            return null;
        }
        object = f.h(null, object);
        f$k = object.a;
        f$k.q((f)object);
        view = view.getRootView();
        f$k.d(view);
        return object;
    }

    public static void b(View view, int n3, int n4) {
        view.setScrollIndicators(n3, n4);
    }
}

