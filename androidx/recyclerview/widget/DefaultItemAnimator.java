/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 */
package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator$1;
import androidx.recyclerview.widget.DefaultItemAnimator$2;
import androidx.recyclerview.widget.DefaultItemAnimator$3;
import androidx.recyclerview.widget.DefaultItemAnimator$a;
import androidx.recyclerview.widget.DefaultItemAnimator$b;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$l$a;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.x;
import java.util.ArrayList;
import java.util.List;

public final class DefaultItemAnimator
extends x {
    public static TimeInterpolator s;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public final ArrayList q;
    public final ArrayList r;

    public DefaultItemAnimator() {
        ArrayList arrayList;
        this.h = arrayList = new ArrayList();
        this.i = arrayList = new ArrayList();
        this.j = arrayList = new ArrayList();
        this.k = arrayList = new ArrayList();
        this.l = arrayList = new ArrayList();
        this.m = arrayList = new ArrayList();
        this.n = arrayList = new ArrayList();
        this.o = arrayList = new ArrayList();
        this.p = arrayList = new ArrayList();
        this.q = arrayList = new ArrayList();
        this.r = arrayList = new ArrayList();
    }

    public static void l(ArrayList arrayList) {
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            ViewPropertyAnimator viewPropertyAnimator = ((RecyclerView$B)arrayList.get((int)i3)).itemView.animate();
            viewPropertyAnimator.cancel();
        }
    }

    public final boolean b(RecyclerView$B recyclerView$B, List list) {
        boolean bl2;
        boolean bl3 = list.isEmpty();
        if (bl3 && !(bl2 = super.b(recyclerView$B, list))) {
            bl2 = false;
            recyclerView$B = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void d(RecyclerView$B recyclerView$B) {
        boolean bl2;
        ArrayList arrayList;
        int n3;
        Object object;
        int n4;
        View view = recyclerView$B.itemView;
        view.animate().cancel();
        ArrayList arrayList2 = this.j;
        int n7 = arrayList2.size() + -1;
        while (true) {
            n4 = 0;
            if (n7 < 0) break;
            object = ((DefaultItemAnimator$b)arrayList2.get((int)n7)).a;
            if (object == recyclerView$B) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                this.c(recyclerView$B);
                arrayList2.remove(n7);
            }
            n7 += -1;
        }
        arrayList2 = this.k;
        this.n(recyclerView$B, arrayList2);
        arrayList2 = this.h;
        boolean bl3 = arrayList2.remove(recyclerView$B);
        n7 = 1065353216;
        float f5 = 1.0f;
        if (bl3) {
            view.setAlpha(f5);
            this.c(recyclerView$B);
        }
        if (bl3 = (arrayList2 = this.i).remove(recyclerView$B)) {
            view.setAlpha(f5);
            this.c(recyclerView$B);
        }
        arrayList2 = this.n;
        for (n3 = arrayList2.size() + -1; n3 >= 0; n3 += -1) {
            arrayList = (ArrayList)arrayList2.get(n3);
            this.n(recyclerView$B, arrayList);
            bl2 = arrayList.isEmpty();
            if (!bl2) continue;
            arrayList2.remove(n3);
        }
        arrayList2 = this.m;
        block2: for (n3 = arrayList2.size() + -1; n3 >= 0; n3 += -1) {
            arrayList = (ArrayList)arrayList2.get(n3);
            for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
                RecyclerView$B recyclerView$B2 = ((DefaultItemAnimator$b)arrayList.get((int)i3)).a;
                if (recyclerView$B2 != recyclerView$B) continue;
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                this.c(recyclerView$B);
                arrayList.remove(i3);
                bl2 = arrayList.isEmpty();
                if (!bl2) continue block2;
                arrayList2.remove(n3);
                continue block2;
            }
        }
        arrayList2 = this.l;
        for (n4 = arrayList2.size() + -1; n4 >= 0; n4 += -1) {
            object = (ArrayList)arrayList2.get(n4);
            bl2 = ((ArrayList)object).remove(recyclerView$B);
            if (!bl2) continue;
            view.setAlpha(f5);
            this.c(recyclerView$B);
            n3 = (int)(((ArrayList)object).isEmpty() ? 1 : 0);
            if (n3 == 0) continue;
            arrayList2.remove(n4);
        }
        this.q.remove(recyclerView$B);
        this.o.remove(recyclerView$B);
        this.r.remove(recyclerView$B);
        this.p.remove(recyclerView$B);
        this.m();
    }

    public final void e() {
        int n3;
        Object object;
        int n4;
        Object object2;
        float f5;
        int n7;
        Object object3;
        Object object4;
        Object object5;
        int n8;
        ArrayList arrayList = this.j;
        int n10 = arrayList.size() + -1;
        while (true) {
            n8 = 0;
            object5 = null;
            if (n10 < 0) break;
            object4 = (DefaultItemAnimator$b)arrayList.get(n10);
            object3 = ((DefaultItemAnimator$b)object4).a.itemView;
            object3.setTranslationY(0.0f);
            object3.setTranslationX(0.0f);
            object5 = ((DefaultItemAnimator$b)object4).a;
            this.c((RecyclerView$B)object5);
            arrayList.remove(n10);
            n10 += -1;
        }
        arrayList = this.h;
        for (n10 = arrayList.size() + -1; n10 >= 0; n10 += -1) {
            object4 = (RecyclerView$B)arrayList.get(n10);
            this.c((RecyclerView$B)object4);
            arrayList.remove(n10);
        }
        arrayList = this.i;
        n10 = arrayList.size() + -1;
        while (true) {
            n7 = 1065353216;
            f5 = 1.0f;
            if (n10 < 0) break;
            object3 = (RecyclerView$B)arrayList.get(n10);
            object2 = ((RecyclerView$B)object3).itemView;
            object2.setAlpha(f5);
            this.c((RecyclerView$B)object3);
            arrayList.remove(n10);
            n10 += -1;
        }
        arrayList = this.k;
        for (n10 = arrayList.size() + -1; n10 >= 0; n10 += -1) {
            object3 = (DefaultItemAnimator$a)arrayList.get(n10);
            object2 = ((DefaultItemAnimator$a)object3).a;
            if (object2 != null) {
                this.o((DefaultItemAnimator$a)object3, (RecyclerView$B)object2);
            }
            if ((object2 = ((DefaultItemAnimator$a)object3).b) == null) continue;
            this.o((DefaultItemAnimator$a)object3, (RecyclerView$B)object2);
        }
        arrayList.clear();
        boolean bl2 = this.f();
        if (!bl2) {
            return;
        }
        arrayList = this.m;
        for (n10 = arrayList.size() + -1; n10 >= 0; n10 += -1) {
            object3 = (ArrayList)arrayList.get(n10);
            for (n4 = ((ArrayList)object3).size() + -1; n4 >= 0; n4 += -1) {
                object = (DefaultItemAnimator$b)((ArrayList)object3).get(n4);
                View view = ((DefaultItemAnimator$b)object).a.itemView;
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                object = ((DefaultItemAnimator$b)object).a;
                this.c((RecyclerView$B)object);
                ((ArrayList)object3).remove(n4);
                boolean bl3 = ((ArrayList)object3).isEmpty();
                if (!bl3) continue;
                arrayList.remove(object3);
            }
        }
        arrayList = this.l;
        for (n10 = arrayList.size() + -1; n10 >= 0; n10 += -1) {
            object5 = (ArrayList)arrayList.get(n10);
            for (n3 = ((ArrayList)object5).size() + -1; n3 >= 0; n3 += -1) {
                object2 = (RecyclerView$B)((ArrayList)object5).get(n3);
                object = object2.itemView;
                object.setAlpha(f5);
                this.c((RecyclerView$B)object2);
                ((ArrayList)object5).remove(n3);
                n4 = (int)(((ArrayList)object5).isEmpty() ? 1 : 0);
                if (n4 == 0) continue;
                arrayList.remove(object5);
            }
        }
        arrayList = this.n;
        for (n10 = arrayList.size() + -1; n10 >= 0; n10 += -1) {
            object5 = (ArrayList)arrayList.get(n10);
            for (n7 = ((ArrayList)object5).size() + -1; n7 >= 0; n7 += -1) {
                object3 = (DefaultItemAnimator$a)((ArrayList)object5).get(n7);
                object2 = ((DefaultItemAnimator$a)object3).a;
                if (object2 != null) {
                    this.o((DefaultItemAnimator$a)object3, (RecyclerView$B)object2);
                }
                if ((object2 = ((DefaultItemAnimator$a)object3).b) != null) {
                    this.o((DefaultItemAnimator$a)object3, (RecyclerView$B)object2);
                }
                if ((n3 = (int)(((ArrayList)object5).isEmpty() ? 1 : 0)) == 0) continue;
                arrayList.remove(object5);
            }
        }
        DefaultItemAnimator.l(this.q);
        DefaultItemAnimator.l(this.p);
        DefaultItemAnimator.l(this.o);
        DefaultItemAnimator.l(this.r);
        arrayList = this.b;
        n10 = arrayList.size();
        object5 = null;
        for (n8 = 0; n8 < n10; ++n8) {
            object4 = (RecyclerView$l$a)arrayList.get(n8);
            object4.a();
        }
        arrayList.clear();
    }

    public final boolean f() {
        ArrayList arrayList = this.i;
        boolean bl2 = arrayList.isEmpty();
        if (bl2 && (bl2 = (arrayList = this.k).isEmpty()) && (bl2 = (arrayList = this.j).isEmpty()) && (bl2 = (arrayList = this.h).isEmpty()) && (bl2 = (arrayList = this.p).isEmpty()) && (bl2 = (arrayList = this.q).isEmpty()) && (bl2 = (arrayList = this.o).isEmpty()) && (bl2 = (arrayList = this.r).isEmpty()) && (bl2 = (arrayList = this.m).isEmpty()) && (bl2 = (arrayList = this.l).isEmpty()) && (bl2 = (arrayList = this.n).isEmpty())) {
            bl2 = false;
            arrayList = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void g() {
        Object object;
        long l2;
        ArrayList arrayList = this.h;
        boolean bl2 = arrayList.isEmpty() ^ true;
        Object object2 = this.j;
        boolean bl3 = ((ArrayList)object2).isEmpty() ^ true;
        Object object3 = this.k;
        boolean bl4 = ((ArrayList)object3).isEmpty() ^ true;
        ArrayList arrayList2 = this.i;
        boolean bl5 = arrayList2.isEmpty() ^ true;
        if (!(bl2 || bl3 || bl5 || bl4)) {
            return;
        }
        Object object4 = arrayList.iterator();
        while (true) {
            boolean bl6 = object4.hasNext();
            l2 = this.d;
            if (!bl6) break;
            object = (RecyclerView$B)object4.next();
            View view = ((RecyclerView$B)object).itemView;
            ViewPropertyAnimator viewPropertyAnimator = view.animate();
            ArrayList arrayList3 = this.q;
            arrayList3.add(object);
            ViewPropertyAnimator viewPropertyAnimator2 = viewPropertyAnimator.setDuration(l2).alpha(0.0f);
            f f5 = new f(view, viewPropertyAnimator, this, (RecyclerView$B)object);
            object = viewPropertyAnimator2.setListener((Animator.AnimatorListener)f5);
            object.start();
        }
        arrayList.clear();
        arrayList = null;
        if (bl3) {
            object4 = new ArrayList();
            ((ArrayList)object4).addAll(object2);
            object = this.m;
            ((ArrayList)object).add(object4);
            ((ArrayList)object2).clear();
            object2 = new DefaultItemAnimator$1(this, (ArrayList)object4);
            if (bl2) {
                object4 = ((DefaultItemAnimator$b)((ArrayList)object4).get((int)0)).a.itemView;
                object = ViewCompat.a;
                object4.postOnAnimationDelayed((Runnable)object2, l2);
            } else {
                ((DefaultItemAnimator$1)object2).run();
            }
        }
        if (bl4) {
            object2 = new ArrayList();
            ((ArrayList)object2).addAll(object3);
            object4 = this.n;
            ((ArrayList)object4).add(object2);
            ((ArrayList)object3).clear();
            object3 = new DefaultItemAnimator$2(this, (ArrayList)object2);
            if (bl2) {
                object2 = ((DefaultItemAnimator$a)((ArrayList)object2).get((int)0)).a.itemView;
                object4 = ViewCompat.a;
                object2.postOnAnimationDelayed((Runnable)object3, l2);
            } else {
                ((DefaultItemAnimator$2)object3).run();
            }
        }
        if (bl5) {
            object2 = new ArrayList();
            ((ArrayList)object2).addAll(arrayList2);
            this.l.add(object2);
            arrayList2.clear();
            object3 = new DefaultItemAnimator$3(this, (ArrayList)object2);
            if (!(bl2 || bl3 || bl4)) {
                ((DefaultItemAnimator$3)object3).run();
            } else {
                long l3 = 0L;
                if (!bl2) {
                    l2 = l3;
                }
                long l4 = bl3 ? this.e : l3;
                if (bl4) {
                    l3 = this.f;
                }
                long l7 = Math.max(l4, l3) + l2;
                arrayList = ((RecyclerView$B)((ArrayList)object2).get((int)0)).itemView;
                arrayList.postOnAnimationDelayed((Runnable)object3, l7);
            }
        }
    }

    public final void h(RecyclerView$B recyclerView$B) {
        this.p(recyclerView$B);
        recyclerView$B.itemView.setAlpha(0.0f);
        this.i.add(recyclerView$B);
    }

    public final boolean i(RecyclerView$B recyclerView$B, RecyclerView$B recyclerView$B2, int n3, int n4, int n7, int n8) {
        if (recyclerView$B == recyclerView$B2) {
            DefaultItemAnimator defaultItemAnimator = this;
            RecyclerView$B recyclerView$B3 = recyclerView$B;
            int n10 = n4;
            int n14 = n7;
            return this.j(recyclerView$B, n3, n4, n7, n8);
        }
        float f5 = recyclerView$B.itemView.getTranslationX();
        Object object = recyclerView$B.itemView;
        float f6 = object.getTranslationY();
        View view = recyclerView$B.itemView;
        float f7 = view.getAlpha();
        this.p(recyclerView$B);
        float f8 = (float)(n7 - n3) - f5;
        int n15 = (int)f8;
        float f11 = (float)(n8 - n4) - f6;
        int n16 = (int)f11;
        View view2 = recyclerView$B.itemView;
        view2.setTranslationX(f5);
        recyclerView$B.itemView.setTranslationY(f6);
        Object object2 = recyclerView$B.itemView;
        object2.setAlpha(f7);
        if (recyclerView$B2 != null) {
            this.p(recyclerView$B2);
            object2 = recyclerView$B2.itemView;
            f6 = -n15;
            object2.setTranslationX(f6);
            object2 = recyclerView$B2.itemView;
            f6 = -n16;
            object2.setTranslationY(f6);
            object2 = recyclerView$B2.itemView;
            f6 = 0.0f;
            object = null;
            object2.setAlpha(0.0f);
        }
        object2 = this.k;
        object = new Object();
        object.a = recyclerView$B;
        object.b = recyclerView$B2;
        object.c = n3;
        object.d = n4;
        object.e = n7;
        object.f = n8;
        ((ArrayList)object2).add(object);
        return true;
    }

    public final boolean j(RecyclerView$B recyclerView$B, int n3, int n4, int n7, int n8) {
        Object object = recyclerView$B.itemView;
        int n10 = (int)object.getTranslationX();
        n3 += n10;
        Object object2 = recyclerView$B.itemView;
        float f5 = object2.getTranslationY();
        n10 = (int)f5;
        n4 += n10;
        this.p(recyclerView$B);
        n10 = n7 - n3;
        int n14 = n8 - n4;
        if (n10 == 0 && n14 == 0) {
            this.c(recyclerView$B);
            return false;
        }
        if (n10 != 0) {
            n10 = -n10;
            f5 = n10;
            object.setTranslationX(f5);
        }
        if (n14 != 0) {
            n10 = -n14;
            f5 = n10;
            object.setTranslationY(f5);
        }
        object = this.j;
        object2 = new Object();
        object2.a = recyclerView$B;
        object2.b = n3;
        object2.c = n4;
        object2.d = n7;
        object2.e = n8;
        ((ArrayList)object).add(object2);
        return true;
    }

    public final void k(RecyclerView$B recyclerView$B) {
        this.p(recyclerView$B);
        this.h.add(recyclerView$B);
    }

    public final void m() {
        boolean bl2 = this.f();
        if (!bl2) {
            ArrayList arrayList = this.b;
            int n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                RecyclerView$l$a recyclerView$l$a = (RecyclerView$l$a)arrayList.get(i3);
                recyclerView$l$a.a();
            }
            arrayList.clear();
        }
    }

    public final void n(RecyclerView$B recyclerView$B, List list) {
        for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
            RecyclerView$B recyclerView$B2;
            DefaultItemAnimator$a defaultItemAnimator$a = (DefaultItemAnimator$a)list.get(i3);
            boolean bl2 = this.o(defaultItemAnimator$a, recyclerView$B);
            if (!bl2 || (recyclerView$B2 = defaultItemAnimator$a.a) != null || (recyclerView$B2 = defaultItemAnimator$a.b) != null) continue;
            list.remove(defaultItemAnimator$a);
        }
    }

    public final boolean o(DefaultItemAnimator$a defaultItemAnimator$a, RecyclerView$B recyclerView$B) {
        block4: {
            block3: {
                RecyclerView$B recyclerView$B2;
                block2: {
                    recyclerView$B2 = defaultItemAnimator$a.b;
                    if (recyclerView$B2 != recyclerView$B) break block2;
                    defaultItemAnimator$a.b = null;
                    break block3;
                }
                recyclerView$B2 = defaultItemAnimator$a.a;
                if (recyclerView$B2 != recyclerView$B) break block4;
                defaultItemAnimator$a.a = null;
            }
            recyclerView$B.itemView.setAlpha(1.0f);
            recyclerView$B.itemView.setTranslationX(0.0f);
            recyclerView$B.itemView.setTranslationY(0.0f);
            this.c(recyclerView$B);
            return true;
        }
        return false;
    }

    public final void p(RecyclerView$B recyclerView$B) {
        TimeInterpolator timeInterpolator = s;
        if (timeInterpolator == null) {
            timeInterpolator = new ValueAnimator();
            s = timeInterpolator = timeInterpolator.getInterpolator();
        }
        timeInterpolator = recyclerView$B.itemView.animate();
        TimeInterpolator timeInterpolator2 = s;
        timeInterpolator.setInterpolator(timeInterpolator2);
        this.d(recyclerView$B);
    }
}

