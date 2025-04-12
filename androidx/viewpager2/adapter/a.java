/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.FrameLayout
 */
package androidx.viewpager2.adapter;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$SavedState;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$l;
import androidx.fragment.app.f;
import androidx.fragment.app.f$a;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.viewpager2.adapter.FragmentStateAdapter$3;
import androidx.viewpager2.adapter.a$a;
import androidx.viewpager2.adapter.a$c;
import androidx.viewpager2.adapter.a$d;
import androidx.viewpager2.adapter.a$e;
import androidx.viewpager2.adapter.a$e$a;
import androidx.viewpager2.adapter.b;
import androidx.viewpager2.adapter.c;
import androidx.viewpager2.adapter.d;
import androidx.viewpager2.widget.ViewPager2$g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

public abstract class a
extends RecyclerView$f
implements Ub3 {
    public final i a;
    public final FragmentManager b;
    public final pb1_0 c;
    public final pb1_0 d;
    public final pb1_0 e;
    public a$d f;
    public final a$c g;
    public boolean h;
    public boolean i;

    public a(FragmentActivity object) {
        FragmentManager fragmentManager = ((FragmentActivity)object).getSupportFragmentManager();
        object = ((ComponentActivity)object).getLifecycle();
        this(fragmentManager, (i)object);
    }

    public a(FragmentManager fragmentManager, i i3) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        Object object = new pb1_0();
        this.c = object;
        object = new pb1_0();
        this.d = object;
        object = new pb1_0();
        this.e = object;
        object = new Object();
        ((a$c)object).a = copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.g = object;
        this.h = false;
        this.i = false;
        this.b = fragmentManager;
        this.a = i3;
        super.setHasStableIds(true);
    }

    public static void g(View object, FrameLayout frameLayout) {
        int n3;
        int n4 = frameLayout.getChildCount();
        if (n4 <= (n3 = 1)) {
            ViewParent viewParent = object.getParent();
            if (viewParent == frameLayout) {
                return;
            }
            n4 = frameLayout.getChildCount();
            if (n4 > 0) {
                frameLayout.removeAllViews();
            }
            if ((viewParent = object.getParent()) != null) {
                viewParent = (ViewGroup)object.getParent();
                viewParent.removeView(object);
            }
            frameLayout.addView(object);
            return;
        }
        object = new IllegalStateException("Design assumption violated.");
        throw object;
    }

    public final Parcelable a() {
        int n3;
        int n4;
        Object object = this.c;
        int n7 = ((pb1_0)object).n();
        pb1_0 pb1_02 = this.d;
        int n8 = pb1_02.n() + n7;
        Bundle bundle = new Bundle(n8);
        n7 = 0;
        Parcelable parcelable = null;
        for (n8 = 0; n8 < (n4 = ((pb1_0)object).n()); ++n8) {
            boolean bl2;
            long l2 = ((pb1_0)object).k(n8);
            Fragment fragment = (Fragment)((pb1_0)object).f(l2);
            if (fragment == null || !(bl2 = fragment.isAdded())) continue;
            String string2 = "f#";
            String string3 = Wm2.a(l2, string2);
            FragmentManager fragmentManager = this.b;
            fragmentManager.Z(bundle, fragment, string3);
        }
        while (n7 < (n3 = pb1_02.n())) {
            long l3 = pb1_02.k(n7);
            n3 = (int)(this.h(l3) ? 1 : 0);
            if (n3 != 0) {
                object = Wm2.a(l3, "s#");
                parcelable = (Parcelable)pb1_02.f(l3);
                bundle.putParcelable((String)object, parcelable);
            }
            ++n7;
        }
        return bundle;
    }

    public final void e(Parcelable object) {
        Object object2;
        boolean bl2;
        Object object3 = this.d;
        boolean bl3 = ((pb1_0)object3).j();
        if (bl3 && (bl2 = ((pb1_0)(object2 = this.c)).j())) {
            int n3;
            Object object4;
            block6: {
                Object object5;
                object4 = (object = (Bundle)object).getClassLoader();
                if (object4 == null) {
                    object4 = this.getClass().getClassLoader();
                    object.setClassLoader((ClassLoader)object4);
                }
                object4 = object.keySet().iterator();
                while (true) {
                    long l2;
                    String string2;
                    boolean bl4 = object4.hasNext();
                    n3 = 1;
                    if (!bl4) break block6;
                    object5 = (String)object4.next();
                    String string3 = "f#";
                    int n4 = ((String)object5).startsWith(string3);
                    int n7 = 2;
                    if (n4 == 0 || (n4 = ((String)object5).length()) <= n7) {
                        n3 = 0;
                        string2 = null;
                    }
                    if (n3 != 0) {
                        string2 = ((String)object5).substring(n7);
                        l2 = Long.parseLong(string2);
                        FragmentManager fragmentManager = this.b;
                        object5 = fragmentManager.K((Bundle)object, (String)object5);
                        ((pb1_0)object2).l(l2, object5);
                        continue;
                    }
                    string2 = "s#";
                    n3 = ((String)object5).startsWith(string2);
                    if (n3 == 0 || (n3 = ((String)object5).length()) <= n7) break;
                    string2 = ((String)object5).substring(n7);
                    l2 = Long.parseLong(string2);
                    object5 = (Fragment$SavedState)object.getParcelable((String)object5);
                    n7 = (int)(this.h(l2) ? 1 : 0);
                    if (n7 == 0) continue;
                    ((pb1_0)object3).l(l2, object5);
                }
                object3 = "Unexpected key in savedState: ".concat((String)object5);
                object = new IllegalArgumentException((String)object3);
                throw object;
            }
            boolean bl5 = ((pb1_0)object2).j();
            if (!bl5) {
                this.i = n3;
                this.h = n3;
                this.j();
                object3 = Looper.getMainLooper();
                object = new Handler((Looper)object3);
                object3 = new FragmentStateAdapter$3(this);
                object2 = new yw0_0(this, (Handler)object, (Runnable)object3);
                object4 = this.a;
                ((i)object4).a((lu1)object2);
                long l3 = 10000L;
                object.postDelayed((Runnable)object3, l3);
            }
            return;
        }
        object = new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        throw object;
    }

    public long getItemId(int n3) {
        return n3;
    }

    public boolean h(long l2) {
        int n3;
        long l3;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        boolean bl2 = object >= 0 && (object = (l3 = l2 - (l4 = (long)(n3 = this.getItemCount()))) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0;
        return bl2;
    }

    public abstract Fragment i(int var1);

    public final void j() {
        Object object;
        boolean bl2 = this.i;
        if (bl2 && !(bl2 = ((FragmentManager)(object = this.b)).S())) {
            pb1_0 pb1_02;
            pb1_0 pb1_03;
            int n3 = 0;
            Np$a np$a = null;
            object = new Np(0);
            int n4 = 0;
            Object object2 = null;
            while (true) {
                pb1_03 = this.c;
                int n7 = pb1_03.n();
                pb1_02 = this.e;
                if (n4 >= n7) break;
                long l2 = pb1_03.k(n4);
                boolean bl3 = this.h(l2);
                if (!bl3) {
                    Long l3 = l2;
                    ((Np)object).add(l3);
                    pb1_02.m(l2);
                }
                ++n4;
            }
            n4 = (int)(this.h ? 1 : 0);
            if (n4 == 0) {
                this.i = false;
                while (n3 < (n4 = pb1_03.n())) {
                    long l4 = pb1_03.k(n3);
                    n4 = pb1_02.i(l4);
                    if (n4 < 0 && ((object2 = (Fragment)pb1_03.f(l4)) == null || (object2 = ((Fragment)object2).getView()) == null || (object2 = object2.getParent()) == null)) {
                        object2 = l4;
                        ((Np)object).add(object2);
                    }
                    ++n3;
                }
            }
            np$a = new Np$a((Np)object);
            while (bl2 = np$a.hasNext()) {
                object = (Long)np$a.next();
                long l7 = (Long)object;
                this.m(l7);
            }
        }
    }

    public final Long k(int n3) {
        pb1_0 pb1_02;
        int n4;
        Long l2 = null;
        for (int i3 = 0; i3 < (n4 = (pb1_02 = this.e).n()); ++i3) {
            Integer n7 = (Integer)pb1_02.o(i3);
            n4 = n7;
            if (n4 != n3) continue;
            if (l2 == null) {
                long l3 = pb1_02.k(i3);
                l2 = l3;
                continue;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
            throw illegalStateException;
        }
        return l2;
    }

    public final void l(iw0_0 object) {
        long l2 = ((RecyclerView$B)object).getItemId();
        ArrayList<View> arrayList = this.c;
        Object object2 = (Fragment)((pb1_0)((Object)arrayList)).f(l2);
        Object object3 = "Design assumption violated.";
        if (object2 != null) {
            arrayList = (FrameLayout)((RecyclerView$B)object).itemView;
            Object object4 = ((Fragment)object2).getView();
            boolean bl2 = ((Fragment)object2).isAdded();
            if (!bl2 && object4 != null) {
                object = new IllegalStateException((String)object3);
                throw object;
            }
            boolean bl3 = ((Fragment)object2).isAdded();
            String string2 = "cb";
            FragmentManager fragmentManager = this.b;
            if (bl3 && object4 == null) {
                object = new xw0_0(this, (Fragment)object2, (FrameLayout)arrayList);
                object2 = fragmentManager.p;
                object2.getClass();
                Intrinsics.checkNotNullParameter(object, string2);
                object2 = ((f)object2).b;
                object3 = new f$a((FragmentManager$l)object, false);
                ((CopyOnWriteArrayList)object2).add(object3);
                return;
            }
            bl3 = ((Fragment)object2).isAdded();
            if (bl3 && (object3 = object4.getParent()) != null) {
                object = object4.getParent();
                if (object != arrayList) {
                    androidx.viewpager2.adapter.a.g((View)object4, (FrameLayout)arrayList);
                }
                return;
            }
            bl3 = ((Fragment)object2).isAdded();
            if (bl3) {
                androidx.viewpager2.adapter.a.g((View)object4, (FrameLayout)arrayList);
                return;
            }
            bl3 = fragmentManager.S();
            if (!bl3) {
                int n3;
                object3 = new xw0_0(this, (Fragment)object2, (FrameLayout)arrayList);
                arrayList = fragmentManager.p;
                arrayList.getClass();
                Intrinsics.checkNotNullParameter(object3, string2);
                arrayList = ((f)((Object)arrayList)).b;
                object4 = new f$a((FragmentManager$l)object3, false);
                ((CopyOnWriteArrayList)((Object)arrayList)).add((View)object4);
                object3 = this.g;
                object3.getClass();
                arrayList = new ArrayList<View>();
                object3 = ((a$c)object3).a.iterator();
                while ((n3 = object3.hasNext()) != 0) {
                    ((a$e)object3.next()).getClass();
                    object4 = a$e.a;
                    arrayList.add((View)object4);
                }
                try {
                    ((Fragment)object2).setMenuVisibility(false);
                    object3 = new androidx.fragment.app.a(fragmentManager);
                    object4 = new StringBuilder();
                    string2 = "f";
                    ((StringBuilder)object4).append(string2);
                    long l3 = ((RecyclerView$B)object).getItemId();
                    ((StringBuilder)object4).append(l3);
                    object = ((StringBuilder)object4).toString();
                    n3 = 1;
                    ((androidx.fragment.app.a)object3).h(0, (Fragment)object2, (String)object, n3);
                    object = i$b.STARTED;
                    ((androidx.fragment.app.a)object3).l((Fragment)object2, (i$b)((Object)object));
                    ((androidx.fragment.app.a)object3).p();
                    object = this.f;
                    ((a$d)object).b(false);
                }
                finally {
                    a$c.b(arrayList);
                }
            } else {
                boolean bl4 = fragmentManager.K;
                if (bl4) {
                    return;
                }
                object2 = new a$a(this, (iw0_0)object);
                object = this.a;
                ((i)object).a((lu1)object2);
            }
            return;
        }
        object = new IllegalStateException((String)object3);
        throw object;
    }

    public final void m(long l2) {
        boolean bl2;
        Object object;
        pb1_0 pb1_02 = this.c;
        Fragment fragment = (Fragment)pb1_02.f(l2);
        if (fragment == null) {
            return;
        }
        Object object2 = fragment.getView();
        if (object2 != null && (object2 = fragment.getView().getParent()) != null) {
            object2 = (FrameLayout)object2;
            object2.removeAllViews();
        }
        boolean bl3 = this.h(l2);
        Cloneable cloneable = this.d;
        if (!bl3) {
            ((pb1_0)cloneable).m(l2);
        }
        if (!(bl3 = fragment.isAdded())) {
            pb1_02.m(l2);
            return;
        }
        object2 = this.b;
        boolean bl4 = ((FragmentManager)object2).S();
        if (bl4) {
            this.i = true;
            return;
        }
        bl4 = fragment.isAdded();
        a$e$a a$e$a = a$e.a;
        Object object3 = this.g;
        if (bl4 && (bl4 = this.h(l2))) {
            boolean bl5;
            object3.getClass();
            object = new ArrayList();
            Object object4 = ((a$c)object3).a.iterator();
            while (bl5 = object4.hasNext()) {
                a$e a$e = (a$e)object4.next();
                a$e.getClass();
                ((ArrayList)object).add(a$e$a);
            }
            object4 = ((FragmentManager)object2).e0(fragment);
            a$c.b((List)object);
            ((pb1_0)cloneable).l(l2, object4);
        }
        object3.getClass();
        cloneable = new ArrayList();
        object = ((a$c)object3).a.iterator();
        while (bl2 = object.hasNext()) {
            object3 = (a$e)object.next();
            object3.getClass();
            ((ArrayList)cloneable).add(a$e$a);
        }
        try {
            object = new androidx.fragment.app.a((FragmentManager)object2);
            ((androidx.fragment.app.a)object).i(fragment);
            ((androidx.fragment.app.a)object).p();
            pb1_02.m(l2);
            return;
        }
        finally {
            a$c.b((List)((Object)cloneable));
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView object) {
        a$d a$d = this.f;
        if (a$d == null) {
            this.f = a$d = new a$d(this);
            object = a$d.a((RecyclerView)object);
            a$d.d = object;
            object = new b(a$d);
            a$d.a = object;
            a$d.d.f((ViewPager2$g)object);
            object = new c(a$d);
            a$d.b = object;
            this.registerAdapterDataObserver((RecyclerView$h)object);
            object = new d(a$d);
            a$d.c = object;
            this.a.a((lu1)object);
            return;
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Fragment fragment;
        long l2;
        long l3;
        long l4;
        recyclerView$B = (iw0_0)recyclerView$B;
        long l7 = recyclerView$B.getItemId();
        Object object = (FrameLayout)recyclerView$B.itemView;
        int n4 = object.getId();
        Object object2 = this.k(n4);
        pb1_0 pb1_02 = this.e;
        if (object2 != null && (l4 = (l3 = (l2 = ((Long)object2).longValue()) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            l2 = (Long)object2;
            this.m(l2);
            l2 = (Long)object2;
            pb1_02.m(l2);
        }
        object = n4;
        pb1_02.l(l7, object);
        l7 = this.getItemId(n3);
        object = this.c;
        int n7 = ((pb1_0)object).i(l7);
        if (n7 < 0) {
            fragment = this.i(n3);
            object2 = (Fragment$SavedState)this.d.f(l7);
            fragment.setInitialSavedState((Fragment$SavedState)object2);
            ((pb1_0)object).l(l7, fragment);
        }
        fragment = (FrameLayout)recyclerView$B.itemView;
        n3 = (int)(fragment.isAttachedToWindow() ? 1 : 0);
        if (n3 != 0) {
            this.l((iw0_0)recyclerView$B);
        }
        this.j();
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        object = object.getContext();
        FrameLayout frameLayout = new FrameLayout((Context)object);
        int n4 = -1;
        object = new ViewGroup.LayoutParams(n4, n4);
        frameLayout.setLayoutParams((ViewGroup.LayoutParams)object);
        int n7 = View.generateViewId();
        frameLayout.setId(n7);
        frameLayout.setSaveEnabled(false);
        object = new RecyclerView$B((View)frameLayout);
        return object;
    }

    public final void onDetachedFromRecyclerView(RecyclerView object) {
        a$d a$d = this.f;
        a$d.getClass();
        object = a$d.a((RecyclerView)object);
        Object object2 = a$d.a;
        object.c.a.remove(object2);
        object = a$d.b;
        object2 = a$d.f;
        ((RecyclerView$f)object2).unregisterAdapterDataObserver((RecyclerView$h)object);
        object = a$d.c;
        ((a)object2).a.c((lu1)object);
        a$d.d = null;
        this.f = null;
    }

    public final void onViewAttachedToWindow(RecyclerView$B recyclerView$B) {
        recyclerView$B = (iw0_0)recyclerView$B;
        this.l((iw0_0)recyclerView$B);
        this.j();
    }

    public final void onViewRecycled(RecyclerView$B object) {
        int n3 = ((FrameLayout)((iw0_0)object).itemView).getId();
        object = this.k(n3);
        if (object != null) {
            long l2 = (Long)object;
            this.m(l2);
            pb1_0 pb1_02 = this.e;
            long l3 = (Long)object;
            pb1_02.m(l3);
        }
    }

    public final void setHasStableIds(boolean bl2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
        throw unsupportedOperationException;
    }
}

