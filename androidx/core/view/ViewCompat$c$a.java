/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsets
 */
package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.f;

public final class ViewCompat$c$a
implements View.OnApplyWindowInsetsListener {
    public f a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ T72 c;

    public ViewCompat$c$a(View view, T72 t72) {
        this.b = view;
        this.c = t72;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets object) {
        Object object2 = f.h(view, (WindowInsets)object);
        int n3 = Build.VERSION.SDK_INT;
        T72 t72 = this.c;
        int n4 = 30;
        if (n3 < n4) {
            View view2 = this.b;
            ViewCompat$c.a((WindowInsets)object, view2);
            object = this.a;
            boolean bl2 = ((f)object2).equals(object);
            if (bl2) {
                return t72.onApplyWindowInsets(view, (f)object2).g();
            }
        }
        this.a = object2;
        object = t72.onApplyWindowInsets(view, (f)object2);
        if (n3 >= n4) {
            return ((f)object).g();
        }
        object2 = ViewCompat.a;
        ViewCompat$b.c(view);
        return ((f)object).g();
    }
}

