/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$n;
import androidx.fragment.app.FragmentManager$o;
import androidx.fragment.app.FragmentManager$q;
import androidx.fragment.app.a;
import androidx.fragment.app.h;
import androidx.fragment.app.k;
import androidx.fragment.app.k$a;
import androidx.fragment.app.n;
import androidx.fragment.app.n$a;
import androidx.fragment.app.n$c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class FragmentManager$b
extends W72 {
    public final /* synthetic */ FragmentManager a;

    public FragmentManager$b(FragmentManager fragmentManager) {
        this.a = fragmentManager;
        super(false);
    }

    public final void handleOnBackCancelled() {
        Object object = "FragmentManager";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)object, (int)n3);
        FragmentManager fragmentManager = this.a;
        if (bl2) {
            Objects.toString(fragmentManager);
        }
        fragmentManager.getClass();
        boolean bl3 = Log.isLoggable((String)object, (int)n3);
        if (bl3) {
            object = fragmentManager.h;
            Objects.toString(object);
        }
        if ((object = fragmentManager.h) != null) {
            n3 = 0;
            ((a)object).s = false;
            ((a)object).n();
            object = fragmentManager.h;
            rw0_0 rw0_02 = new rw0_0(fragmentManager);
            ArrayList arrayList = ((k)object).q;
            if (arrayList == null) {
                ((k)object).q = arrayList = new ArrayList();
            }
            ((k)object).q.add(rw0_02);
            fragmentManager.h.d();
            fragmentManager.i = true;
            fragmentManager.C();
            fragmentManager.i = false;
            bl3 = false;
            object = null;
            fragmentManager.h = null;
        }
    }

    public final void handleOnBackPressed() {
        Object object = "FragmentManager";
        int n3 = 3;
        boolean n4 = Log.isLoggable((String)object, (int)n3);
        FragmentManager fragmentManager = this.a;
        if (n4) {
            Objects.toString(fragmentManager);
        }
        int n7 = 1;
        fragmentManager.i = n7;
        fragmentManager.z(n7 != 0);
        boolean bl2 = false;
        Object object2 = null;
        fragmentManager.i = false;
        ArrayList arrayList = fragmentManager.h;
        FragmentManager$b fragmentManager$b = fragmentManager.j;
        if (arrayList != null) {
            Object object3;
            arrayList = fragmentManager.o;
            boolean bl3 = arrayList.isEmpty();
            if (!bl3) {
                boolean bl4;
                Object object4 = FragmentManager.H(fragmentManager.h);
                object3 = new Object(object4);
                arrayList = arrayList.iterator();
                while (bl4 = arrayList.hasNext()) {
                    boolean bl5;
                    object4 = (FragmentManager$n)arrayList.next();
                    Iterator iterator = object3.iterator();
                    while (bl5 = iterator.hasNext()) {
                        Fragment cfr_ignored_0 = (Fragment)iterator.next();
                        object4.getClass();
                    }
                }
            }
            arrayList = fragmentManager.h.a.iterator();
            while (bl3 = arrayList.hasNext()) {
                object3 = ((k$a)arrayList.next()).b;
                if (object3 == null) continue;
                ((Fragment)object3).mTransitioning = false;
            }
            object3 = Collections.singletonList(fragmentManager.h);
            arrayList = new ArrayList(object3);
            Iterator iterator = fragmentManager.f(arrayList, 0, n7).iterator();
            while (bl2 = iterator.hasNext()) {
                object2 = (n)iterator.next();
                object2.getClass();
                Log.isLoggable((String)object, (int)n3);
                arrayList = ((n)object2).c;
                ((n)object2).l(arrayList);
                ((n)object2).c(arrayList);
            }
            iterator = fragmentManager.h.a.iterator();
            while (bl2 = iterator.hasNext()) {
                object2 = ((k$a)iterator.next()).b;
                if (object2 == null || (arrayList = ((Fragment)object2).mContainer) != null) continue;
                object2 = fragmentManager.g((Fragment)object2);
                ((h)object2).i();
            }
            boolean bl6 = false;
            iterator = null;
            fragmentManager.h = null;
            fragmentManager.n0();
            boolean bl7 = Log.isLoggable((String)object, (int)n3);
            if (bl7) {
                fragmentManager$b.isEnabled();
                fragmentManager.toString();
            }
        } else {
            boolean bl8 = fragmentManager$b.isEnabled();
            if (bl8) {
                Log.isLoggable((String)object, (int)n3);
                fragmentManager.W();
            } else {
                Log.isLoggable((String)object, (int)n3);
                object = fragmentManager.g;
                ((d82_0)object).d();
            }
        }
    }

    public final void handleOnBackProgressed(uu_0 object) {
        Object object2;
        Object object3 = "FragmentManager";
        int n3 = 2;
        boolean bl2 = Log.isLoggable((String)object3, (int)n3);
        FragmentManager fragmentManager = this.a;
        if (bl2) {
            Objects.toString(fragmentManager);
        }
        if ((object2 = fragmentManager.h) != null) {
            boolean bl3;
            List<a> list = Collections.singletonList(fragmentManager.h);
            object2 = new ArrayList(list);
            list = null;
            int n4 = 1;
            object2 = fragmentManager.f((ArrayList)object2, 0, n4).iterator();
            while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                ArrayList arrayList;
                int n7;
                n n8 = (n)object2.next();
                n8.getClass();
                Object object4 = "backEvent";
                Intrinsics.checkNotNullParameter(object, (String)object4);
                boolean bl4 = Log.isLoggable((String)object3, (int)n3);
                if (bl4) {
                    float cfr_ignored_0 = ((uu_0)object).c;
                }
                object4 = n8.c;
                ArrayList arrayList2 = new ArrayList();
                object4 = ((ArrayList)object4).iterator();
                while ((n7 = object4.hasNext()) != 0) {
                    arrayList = ((n$c)object4.next()).k;
                    cx_2.r(arrayList, arrayList2);
                }
                object4 = CollectionsKt.k0(CollectionsKt.o0(arrayList2));
                int n10 = object4.size();
                arrayList = null;
                for (n7 = 0; n7 < n10; ++n7) {
                    n$a n$a = (n$a)object4.get(n7);
                    ViewGroup viewGroup = n8.a;
                    n$a.d((uu_0)object, viewGroup);
                }
            }
            object = fragmentManager.o.iterator();
            while (bl3 = object.hasNext()) {
                object3 = (FragmentManager$n)object.next();
                object3.getClass();
            }
        }
    }

    public final void handleOnBackStarted(uu_0 object) {
        object = "FragmentManager";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)object, (int)n3);
        FragmentManager fragmentManager = this.a;
        if (bl2) {
            Objects.toString(fragmentManager);
        }
        fragmentManager.w();
        fragmentManager.getClass();
        object = new FragmentManager$q(fragmentManager);
        fragmentManager.x((FragmentManager$o)object, false);
    }
}

