/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 */
package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$f;
import androidx.viewpager2.widget.ViewPager2$i;

public final class b
implements ViewPager2$i {
    public final int a;

    public b(int n3) {
        if (n3 >= 0) {
            this.a = n3;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Margin must be non-negative");
        throw illegalArgumentException;
    }

    public final void a(float f5, View view) {
        ViewParent viewParent = view.getParent();
        Object object = viewParent.getParent();
        int n3 = viewParent instanceof RecyclerView;
        if (n3 != 0 && (n3 = object instanceof ViewPager2) != 0) {
            object = (ViewPager2)((Object)object);
            n3 = this.a;
            float f6 = (float)n3 * f5;
            int n4 = ((ViewPager2)((Object)object)).getOrientation();
            if (n4 == 0) {
                int n7;
                ViewPager2$f viewPager2$f = ((ViewPager2)((Object)object)).g;
                n4 = viewPager2$f.getLayoutDirection();
                if (n4 == (n7 = 1)) {
                    f6 = -f6;
                }
                view.setTranslationX(f6);
            } else {
                view.setTranslationY(f6);
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
        throw illegalStateException;
    }
}

