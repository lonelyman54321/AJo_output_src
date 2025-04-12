/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.u$a;
import androidx.recyclerview.widget.y;

public class u
extends y {
    public s a;
    public r b;

    public static int a(View view, t t3) {
        int n3 = t3.e(view);
        int n4 = t3.c(view) / 2 + n3;
        n3 = t3.k();
        int n7 = t3.l() / 2 + n3;
        return n4 - n7;
    }

    public static View b(RecyclerView$o recyclerView$o, t t3) {
        int n3 = recyclerView$o.getChildCount();
        View view = null;
        if (n3 == 0) {
            return null;
        }
        int n4 = t3.k();
        int n7 = t3.l() / 2 + n4;
        n4 = -1 >>> 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            View view2 = recyclerView$o.getChildAt(i3);
            int n8 = t3.e(view2);
            int n10 = t3.c(view2) / 2 + n8 - n7;
            n8 = Math.abs(n10);
            if (n8 >= n4) continue;
            view = view2;
            n4 = n8;
        }
        return view;
    }

    public final t c(RecyclerView$o recyclerView$o) {
        Object object = this.b;
        if (object == null || (object = ((t)object).a) != recyclerView$o) {
            this.b = object = new t(recyclerView$o);
        }
        return this.b;
    }

    public final int[] calculateDistanceToFinalSnap(RecyclerView$o object, View view) {
        int n3 = 2;
        int[] nArray = new int[n3];
        boolean n4 = ((RecyclerView$o)object).canScrollHorizontally();
        if (n4) {
            int n7;
            t t3 = this.c((RecyclerView$o)object);
            nArray[0] = n7 = u.a(view, t3);
        } else {
            nArray[0] = 0;
        }
        boolean bl2 = ((RecyclerView$o)object).canScrollVertically();
        int n8 = 1;
        if (bl2) {
            int n10;
            object = this.d((RecyclerView$o)object);
            nArray[n8] = n10 = u.a(view, (t)object);
        } else {
            nArray[n8] = 0;
        }
        return nArray;
    }

    public final RecyclerView$x createScroller(RecyclerView$o object) {
        boolean bl2 = object instanceof RecyclerView$x$b;
        if (!bl2) {
            return null;
        }
        Context context = this.mRecyclerView.getContext();
        object = new u$a(this, context);
        return object;
    }

    public final t d(RecyclerView$o recyclerView$o) {
        Object object = this.a;
        if (object == null || (object = ((t)object).a) != recyclerView$o) {
            this.a = object = new t(recyclerView$o);
        }
        return this.a;
    }

    public View findSnapView(RecyclerView$o recyclerView$o) {
        boolean bl2 = recyclerView$o.canScrollVertically();
        if (bl2) {
            t t3 = this.d(recyclerView$o);
            return u.b(recyclerView$o, t3);
        }
        bl2 = recyclerView$o.canScrollHorizontally();
        if (bl2) {
            t t4 = this.c(recyclerView$o);
            return u.b(recyclerView$o, t4);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int findTargetSnapPosition(RecyclerView$o object, int n3, int n4) {
        float f5;
        t t3;
        int n7 = ((RecyclerView$o)object).getItemCount();
        int n8 = -1;
        if (n7 == 0) {
            return n8;
        }
        int n10 = ((RecyclerView$o)object).canScrollVertically();
        boolean bl2 = false;
        View view = null;
        if (n10 != 0) {
            t3 = this.d((RecyclerView$o)object);
        } else {
            n10 = ((RecyclerView$o)object).canScrollHorizontally();
            if (n10 != 0) {
                t3 = this.c((RecyclerView$o)object);
            } else {
                n10 = 0;
                t3 = null;
                f5 = 0.0f;
            }
        }
        if (t3 == null) {
            return n8;
        }
        int n14 = ((RecyclerView$o)object).getChildCount();
        int n15 = 0;
        View view2 = null;
        int n16 = -1 << -1;
        int n17 = -1 >>> 1;
        for (int i3 = 0; i3 < n14; ++i3) {
            View view3 = ((RecyclerView$o)object).getChildAt(i3);
            if (view3 == null) continue;
            int n18 = u.a(view3, t3);
            if (n18 <= 0 && n18 > n16) {
                view2 = view3;
                n16 = n18;
            }
            if (n18 < 0 || n18 >= n17) continue;
            view = view3;
            n17 = n18;
        }
        n10 = ((RecyclerView$o)object).canScrollHorizontally();
        n14 = 1;
        n3 = (n10 != 0 ? n3 > 0 : n4 > 0) ? 1 : 0;
        if (n3 != 0 && view != null) {
            return ((RecyclerView$o)object).getPosition(view);
        }
        if (n3 == 0 && view2 != null) {
            return ((RecyclerView$o)object).getPosition(view2);
        }
        if (n3 != 0) {
            view = view2;
        }
        if (view == null) {
            return n8;
        }
        n4 = ((RecyclerView$o)object).getPosition(view);
        n10 = ((RecyclerView$o)object).getItemCount();
        bl2 = object instanceof RecyclerView$x$b;
        if (bl2) {
            object = (RecyclerView$x$b)object;
            if ((object = object.computeScrollVectorForPosition(n10 -= n14)) != null) {
                float f6;
                float f7;
                float f8;
                f5 = ((PointF)object).x;
                bl2 = false;
                view = null;
                float f11 = f5 - 0.0f;
                n10 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1));
                if (n10 < 0 || (f8 = (f7 = (f6 = ((PointF)object).y) - 0.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) < 0) {
                    n15 = 1;
                }
            }
        }
        if (n15 == n3) {
            n14 = -1;
        }
        if ((n4 += n14) < 0) return n8;
        if (n4 < n7) return n4;
        return n8;
    }
}

