/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import androidx.fragment.app.k$a;
import androidx.lifecycle.i$b;

/*
 * Renamed from vW0
 */
public abstract class vw0_0
extends Uk2 {
    public final FragmentManager c;
    public final int d;
    public a e = null;
    public Fragment f = null;
    public boolean g;

    public vw0_0(FragmentManager fragmentManager) {
        this.c = fragmentManager;
        this.d = 1;
    }

    public final void a(ViewGroup object, int n3, Object object2) {
        object2 = (Fragment)object2;
        object = this.e;
        if (object == null) {
            object = this.c;
            object = Vp0.a((FragmentManager)object, (FragmentManager)object);
            this.e = object;
        }
        this.e.g((Fragment)object2);
        object = this.f;
        boolean bl2 = ((Fragment)object2).equals(object);
        if (bl2) {
            bl2 = false;
            object = null;
            this.f = null;
        }
    }

    public final void b() {
        a a2 = this.e;
        if (a2 != null) {
            boolean bl2 = this.g;
            if (!bl2) {
                bl2 = true;
                try {
                    this.g = bl2;
                    a2.f();
                }
                finally {
                    this.g = false;
                }
            }
            a2 = null;
            this.e = null;
        }
    }

    public Object f(int n3, ViewGroup object) {
        int n4;
        Object object2;
        Object object3 = this.e;
        Object object4 = this.c;
        if (object3 == null) {
            object3 = Vp0.a((FragmentManager)object4, (FragmentManager)object4);
            this.e = object3;
        }
        long l2 = n3;
        int n7 = object.getId();
        String string2 = "android:switcher:";
        CharSequence charSequence = new StringBuilder(string2);
        charSequence.append(n7);
        object3 = ":";
        charSequence.append((String)object3);
        charSequence.append(l2);
        charSequence = charSequence.toString();
        object4 = ((FragmentManager)object4).E((String)charSequence);
        int n8 = 1;
        if (object4 != null) {
            object2 = this.e;
            object2.getClass();
            n7 = 7;
            object = new k$a((Fragment)object4, n7);
            ((k)object2).b((k$a)object);
        } else {
            object4 = this.n(n3);
            object2 = this.e;
            int n10 = object.getId();
            n4 = object.getId();
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(n4);
            stringBuilder.append((String)object3);
            stringBuilder.append(l2);
            object = stringBuilder.toString();
            ((a)object2).h(n10, (Fragment)object4, (String)object, n8);
        }
        object2 = this.f;
        if (object4 != object2) {
            n3 = 0;
            object2 = null;
            ((Fragment)object4).setMenuVisibility(false);
            n4 = this.d;
            if (n4 == n8) {
                object2 = this.e;
                object = i$b.STARTED;
                ((a)object2).l((Fragment)object4, (i$b)((Object)object));
            } else {
                ((Fragment)object4).setUserVisibleHint(false);
            }
        }
        return object4;
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

    public final void i(Parcelable parcelable, ClassLoader classLoader) {
    }

    public final Parcelable j() {
        return null;
    }

    public final void k(Object object) {
        Object object2 = this.f;
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
                    fragment = this.f;
                    i$b i$b = i$b.STARTED;
                    ((a)object2).l(fragment, i$b);
                } else {
                    object2 = this.f;
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
            this.f = object;
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

