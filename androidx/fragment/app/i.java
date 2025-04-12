/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$SavedState;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.i$b;
import java.util.ArrayList;

public abstract class i
extends Uk2 {
    public final FragmentManager c;
    public final int d;
    public a e = null;
    public final ArrayList f;
    public final ArrayList g;
    public Fragment h;
    public boolean i;

    public i(FragmentManager fragmentManager, int n3) {
        ArrayList arrayList;
        this.f = arrayList = new ArrayList();
        this.g = arrayList = new ArrayList();
        this.h = null;
        this.c = fragmentManager;
        this.d = n3;
    }

    public final void a(ViewGroup object, int n3, Object object2) {
        int n4;
        object2 = (Fragment)object2;
        object = this.e;
        Object object3 = this.c;
        if (object == null) {
            this.e = object = Vp0.a((FragmentManager)object3, (FragmentManager)object3);
        }
        while ((n4 = ((ArrayList)(object = this.f)).size()) <= n3) {
            ((ArrayList)object).add(null);
        }
        n4 = (int)(((Fragment)object2).isAdded() ? 1 : 0);
        object3 = n4 != 0 ? ((FragmentManager)object3).e0((Fragment)object2) : null;
        ((ArrayList)object).set(n3, object3);
        this.g.set(n3, null);
        this.e.i((Fragment)object2);
        object = this.h;
        boolean bl2 = ((Fragment)object2).equals(object);
        if (bl2) {
            this.h = null;
        }
    }

    public final void b() {
        a a2 = this.e;
        if (a2 != null) {
            boolean bl2 = this.i;
            if (!bl2) {
                bl2 = true;
                try {
                    this.i = bl2;
                    a2.f();
                }
                finally {
                    this.i = false;
                }
            }
            a2 = null;
            this.e = null;
        }
    }

    public final Object f(int n3, ViewGroup object) {
        int n4;
        Object object2;
        ArrayList arrayList = this.g;
        int n7 = arrayList.size();
        if (n7 > n3 && (object2 = (Fragment)arrayList.get(n3)) != null) {
            return object2;
        }
        object2 = this.e;
        if (object2 == null) {
            object2 = this.c;
            this.e = object2 = Vp0.a((FragmentManager)object2, (FragmentManager)object2);
        }
        object2 = this.n(n3);
        Object object3 = this.f;
        int n8 = ((ArrayList)object3).size();
        if (n8 > n3 && (object3 = (Fragment$SavedState)((ArrayList)object3).get(n3)) != null) {
            ((Fragment)object2).setInitialSavedState((Fragment$SavedState)object3);
        }
        while (true) {
            n4 = arrayList.size();
            n8 = 0;
            if (n4 > n3) break;
            arrayList.add(null);
        }
        n4 = 0;
        object3 = null;
        ((Fragment)object2).setMenuVisibility(false);
        int n10 = this.d;
        if (n10 == 0) {
            ((Fragment)object2).setUserVisibleHint(false);
        }
        arrayList.set(n3, object2);
        a a2 = this.e;
        int n14 = object.getId();
        int n15 = 1;
        a2.h(n14, (Fragment)object2, null, n15);
        if (n10 == n15) {
            a2 = this.e;
            object = i$b.STARTED;
            a2.l((Fragment)object2, (i$b)((Object)object));
        }
        return object2;
    }

    public final boolean g(View view, Object object) {
        boolean bl2;
        if ((object = ((Fragment)object).getView()) == view) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    public final void i(Parcelable parcelable, ClassLoader object) {
        if (parcelable != null) {
            boolean bl2;
            Object object2;
            int n3;
            int n4;
            String string2;
            parcelable = (Bundle)parcelable;
            parcelable.setClassLoader((ClassLoader)object);
            object = parcelable.getParcelableArray("states");
            Object object3 = this.f;
            ((ArrayList)object3).clear();
            ArrayList arrayList = this.g;
            arrayList.clear();
            if (object != null) {
                string2 = null;
                for (n4 = 0; n4 < (n3 = ((Parcelable[])object).length); ++n4) {
                    object2 = (Fragment$SavedState)object[n4];
                    ((ArrayList)object3).add(object2);
                }
            }
            object = parcelable.keySet().iterator();
            while (bl2 = object.hasNext()) {
                object3 = (String)object.next();
                n4 = (int)(((String)object3).startsWith(string2 = "f") ? 1 : 0);
                if (n4 == 0) continue;
                string2 = ((String)object3).substring(1);
                n4 = Integer.parseInt(string2);
                object2 = this.c;
                if ((object3 = ((FragmentManager)object2).K((Bundle)parcelable, (String)object3)) == null) continue;
                while ((n3 = arrayList.size()) <= n4) {
                    n3 = 0;
                    object2 = null;
                    arrayList.add(null);
                }
                ((Fragment)object3).setMenuVisibility(false);
                arrayList.set(n4, object3);
            }
        }
    }

    public final Parcelable j() {
        int n3;
        Object object;
        Bundle bundle;
        Object object2 = this.f;
        int n4 = ((ArrayList)object2).size();
        if (n4 > 0) {
            bundle = new Bundle();
            int n7 = ((ArrayList)object2).size();
            object = new Fragment$SavedState[n7];
            ((ArrayList)object2).toArray((T[])object);
            object2 = "states";
            bundle.putParcelableArray((String)object2, (Parcelable[])object);
        } else {
            n4 = 0;
            bundle = null;
        }
        object2 = null;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.g)).size()); ++i3) {
            if ((object = (Fragment)((ArrayList)object).get(i3)) == null || (n3 = (int)(((Fragment)object).isAdded() ? 1 : 0)) == 0) continue;
            if (bundle == null) {
                bundle = new Bundle();
            }
            String string2 = hj0_0.a(i3, "f");
            FragmentManager fragmentManager = this.c;
            fragmentManager.Z(bundle, (Fragment)object, string2);
        }
        return bundle;
    }

    public final void k(Object object) {
        Object object2 = this.h;
        if ((object = (Fragment)object) != object2) {
            Object object3 = this.c;
            boolean bl2 = this.d;
            boolean bl3 = true;
            if (object2 != null) {
                Fragment fragment = null;
                ((Fragment)object2).setMenuVisibility(false);
                if (bl2 == bl3) {
                    object2 = this.e;
                    if (object2 == null) {
                        this.e = object2 = Vp0.a(object3, object3);
                    }
                    object2 = this.e;
                    fragment = this.h;
                    i$b i$b = i$b.STARTED;
                    ((a)object2).l(fragment, i$b);
                } else {
                    object2 = this.h;
                    ((Fragment)object2).setUserVisibleHint(false);
                }
            }
            ((Fragment)object).setMenuVisibility(bl3);
            if (bl2 == bl3) {
                object2 = this.e;
                if (object2 == null) {
                    this.e = object2 = Vp0.a(object3, object3);
                }
                object2 = this.e;
                object3 = i$b.RESUMED;
                ((a)object2).l((Fragment)object, (i$b)((Object)object3));
            } else {
                ((Fragment)object).setUserVisibleHint(bl3);
            }
            this.h = object;
        }
    }

    public final void m(ViewGroup object) {
        int n3;
        int n4 = object.getId();
        if (n4 != (n3 = -1)) {
            return;
        }
        CharSequence charSequence = new StringBuilder("ViewPager with adapter ");
        charSequence.append(this);
        charSequence.append(" requires a view id");
        charSequence = charSequence.toString();
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public abstract Fragment n(int var1);
}

