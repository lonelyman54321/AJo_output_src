/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.viewpager2.widget;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$d;
import androidx.viewpager2.widget.ViewPager2$f;
import androidx.viewpager2.widget.ViewPager2$h$a;
import androidx.viewpager2.widget.ViewPager2$h$b;
import androidx.viewpager2.widget.e;

public final class ViewPager2$h
extends ViewPager2$d {
    public final ViewPager2$h$a a;
    public final ViewPager2$h$b b;
    public e c;
    public final /* synthetic */ ViewPager2 d;

    public ViewPager2$h(ViewPager2 object) {
        this.d = object;
        super(this);
        this.a = object;
        super(this);
        this.b = object;
    }

    public final void a(RecyclerView object) {
        object.setImportantForAccessibility(2);
        this.c = object = new e(this);
        object = this.d;
        int n3 = object.getImportantForAccessibility();
        if (n3 == 0) {
            n3 = 1;
            object.setImportantForAccessibility(n3);
        }
    }

    public final void b() {
        int n3 = 16908360;
        ViewPager2 viewPager2 = this.d;
        ViewCompat.p(n3, (View)viewPager2);
        int n4 = 0;
        C2$a c2$a = null;
        ViewCompat.k(0, (View)viewPager2);
        int n7 = 16908361;
        ViewCompat.p(n7, (View)viewPager2);
        ViewCompat.k(0, (View)viewPager2);
        int n8 = 16908358;
        ViewCompat.p(n8, (View)viewPager2);
        ViewCompat.k(0, (View)viewPager2);
        int n10 = 16908359;
        ViewCompat.p(n10, (View)viewPager2);
        ViewCompat.k(0, (View)viewPager2);
        RecyclerView$f recyclerView$f = viewPager2.getAdapter();
        if (recyclerView$f == null) {
            return;
        }
        recyclerView$f = viewPager2.getAdapter();
        int n14 = recyclerView$f.getItemCount();
        if (n14 == 0) {
            return;
        }
        int n15 = viewPager2.r;
        if (n15 == 0) {
            return;
        }
        n15 = viewPager2.getOrientation();
        int n16 = 1;
        ViewPager2$h$b viewPager2$h$b = this.b;
        ViewPager2$h$a viewPager2$h$a = this.a;
        if (n15 == 0) {
            ViewPager2$f viewPager2$f = viewPager2.g;
            n8 = viewPager2$f.getLayoutDirection();
            if (n8 == n16) {
                n4 = 1;
            }
            n8 = n4 != 0 ? 16908360 : 16908361;
            if (n4 != 0) {
                n3 = 16908361;
            }
            if ((n4 = viewPager2.d) < (n14 -= n16)) {
                c2$a = new C2$a(n8, null);
                ViewCompat.q((View)viewPager2, c2$a, null, viewPager2$h$a);
            }
            if ((n4 = viewPager2.d) > 0) {
                c2$a = new C2$a(n3, null);
                ViewCompat.q((View)viewPager2, c2$a, null, viewPager2$h$b);
            }
        } else {
            C2$a c2$a2;
            n3 = viewPager2.d;
            if (n3 < (n14 -= n16)) {
                c2$a2 = new C2$a(n10, null);
                ViewCompat.q((View)viewPager2, c2$a2, null, viewPager2$h$a);
            }
            if ((n3 = viewPager2.d) > 0) {
                c2$a2 = new C2$a(n8, null);
                ViewCompat.q((View)viewPager2, c2$a2, null, viewPager2$h$b);
            }
        }
    }
}

