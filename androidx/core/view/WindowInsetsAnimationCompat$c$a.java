/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.os.Build$VERSION
 *  android.view.WindowInsets
 *  android.view.WindowInsetsAnimation
 *  android.view.WindowInsetsAnimation$Bounds
 *  android.view.WindowInsetsAnimation$Callback
 */
package androidx.core.view;

import android.graphics.Insets;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsAnimationCompat$a;
import androidx.core.view.WindowInsetsAnimationCompat$b;
import androidx.core.view.WindowInsetsAnimationCompat$c;
import androidx.core.view.WindowInsetsAnimationCompat$d;
import androidx.core.view.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class WindowInsetsAnimationCompat$c$a
extends WindowInsetsAnimation.Callback {
    public final WindowInsetsAnimationCompat$b a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public WindowInsetsAnimationCompat$c$a(WindowInsetsAnimationCompat$b windowInsetsAnimationCompat$b) {
        HashMap hashMap;
        int n3 = windowInsetsAnimationCompat$b.getDispatchMode();
        super(n3);
        this.d = hashMap = new HashMap();
        this.a = windowInsetsAnimationCompat$b;
    }

    public final WindowInsetsAnimationCompat a(WindowInsetsAnimation windowInsetsAnimation) {
        WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat)this.d.get(windowInsetsAnimation);
        if (windowInsetsAnimationCompat == null) {
            Object object = null;
            long l2 = 0L;
            windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(0, null, l2);
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 30;
            if (n3 >= n4) {
                windowInsetsAnimationCompat.a = object = new WindowInsetsAnimationCompat$c(windowInsetsAnimation);
            }
            object = this.d;
            ((HashMap)object).put(windowInsetsAnimation, windowInsetsAnimationCompat);
        }
        return windowInsetsAnimationCompat;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        WindowInsetsAnimationCompat$b windowInsetsAnimationCompat$b = this.a;
        WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.a(windowInsetsAnimation);
        windowInsetsAnimationCompat$b.onEnd(windowInsetsAnimationCompat);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation object) {
        WindowInsetsAnimationCompat$b windowInsetsAnimationCompat$b = this.a;
        object = this.a((WindowInsetsAnimation)object);
        windowInsetsAnimationCompat$b.onPrepare((WindowInsetsAnimationCompat)object);
    }

    public final WindowInsets onProgress(WindowInsets object, List object2) {
        List list = this.c;
        if (list == null) {
            int n3 = object2.size();
            this.c = list = new List(n3);
            this.b = list = Collections.unmodifiableList(list);
        } else {
            list.clear();
        }
        for (int i3 = object2.size() + -1; i3 >= 0; i3 += -1) {
            Object object3 = xg3_0.a(object2.get(i3));
            WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.a((WindowInsetsAnimation)object3);
            float f5 = qg3_0.a((WindowInsetsAnimation)object3);
            WindowInsetsAnimationCompat$d windowInsetsAnimationCompat$d = windowInsetsAnimationCompat.a;
            windowInsetsAnimationCompat$d.e(f5);
            object3 = this.c;
            ((ArrayList)object3).add(windowInsetsAnimationCompat);
        }
        object2 = this.a;
        object = f.h(null, object);
        list = this.b;
        return ((WindowInsetsAnimationCompat$b)object2).onProgress((f)object, list).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation object, WindowInsetsAnimation.Bounds bounds) {
        WindowInsetsAnimationCompat$b windowInsetsAnimationCompat$b = this.a;
        object = this.a((WindowInsetsAnimation)object);
        WindowInsetsAnimationCompat$a windowInsetsAnimationCompat$a = new WindowInsetsAnimationCompat$a(bounds);
        object = windowInsetsAnimationCompat$b.onStart((WindowInsetsAnimationCompat)object, windowInsetsAnimationCompat$a);
        object.getClass();
        ng3_0.a();
        bounds = ((WindowInsetsAnimationCompat$a)object).a.d();
        object = ((WindowInsetsAnimationCompat$a)object).b.d();
        return wg3_0.a((Insets)bounds, (Insets)object);
    }
}

