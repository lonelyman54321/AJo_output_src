/*
 * Decompiled with CFR 0.152.
 */
package androidx.viewpager2.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.lifecycle.i$b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.a;
import androidx.viewpager2.adapter.a$c;
import androidx.viewpager2.adapter.b;
import androidx.viewpager2.adapter.c;
import androidx.viewpager2.adapter.d;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$d {
    public b a;
    public c b;
    public d c;
    public ViewPager2 d;
    public long e = -1;
    public final /* synthetic */ a f;

    public a$d(a a2) {
        this.f = a2;
    }

    public static ViewPager2 a(RecyclerView object) {
        boolean bl2 = (object = object.getParent()) instanceof ViewPager2;
        if (bl2) {
            return (ViewPager2)((Object)object);
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ViewPager2 instance. Got: ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public final void b(boolean bl2) {
        int n3;
        a a2 = this.f;
        Object object = a2.b;
        int n32 = object.S();
        if (n32 != 0) {
            return;
        }
        object = this.d;
        n32 = ((ViewPager2)((Object)object)).getScrollState();
        if (n32 != 0) {
            return;
        }
        object = a2.c;
        boolean n4 = ((pb1_0)object).j();
        if (!n4 && (n3 = a2.getItemCount()) != 0) {
            long l2;
            int n7;
            Object object2 = this.d;
            int n8 = object2.getCurrentItem();
            if (n8 >= (n7 = a2.getItemCount())) {
                return;
            }
            long l3 = a2.getItemId(n8);
            long l4 = l3 - (l2 = this.e);
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 == false && !bl2) {
                return;
            }
            Object object4 = (Fragment)((pb1_0)object).f(l3);
            if (object4 != null && (bl2 = ((Fragment)object4).isAdded())) {
                this.e = l3;
                object4 = a2.b;
                object4 = Vp0.a((FragmentManager)object4, (FragmentManager)object4);
                object2 = new ArrayList();
                n7 = 0;
                Fragment fragment = null;
                for (int i3 = 0; i3 < (object3 = (Object)((pb1_0)object).n()); ++i3) {
                    long l7 = ((pb1_0)object).k(i3);
                    Fragment fragment2 = (Fragment)((pb1_0)object).o(i3);
                    boolean bl3 = fragment2.isAdded();
                    if (!bl3) continue;
                    long l8 = this.e;
                    long l12 = l7 - l8;
                    Object object5 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object5 != false) {
                        Object object6 = i$b.STARTED;
                        ((androidx.fragment.app.a)object4).l(fragment2, (i$b)((Object)object6));
                        object6 = a2.g.a();
                        ((ArrayList)object2).add(object6);
                    } else {
                        fragment = fragment2;
                    }
                    l8 = this.e;
                    object5 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
                    object3 = object5 == false ? (Object)1 : (Object)0;
                    fragment2.setMenuVisibility((boolean)object3);
                }
                if (fragment != null) {
                    object = i$b.RESUMED;
                    ((androidx.fragment.app.a)object4).l(fragment, (i$b)((Object)object));
                    object = a2.g.a();
                    ((ArrayList)object2).add(object);
                }
                if ((n32 = (int)(((ArrayList)(object = ((k)object4).a)).isEmpty() ? 1 : 0)) == 0) {
                    ((androidx.fragment.app.a)object4).p();
                    Collections.reverse(object2);
                    object4 = ((ArrayList)object2).iterator();
                    while ((n32 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                        object = (List)object4.next();
                        object2 = a2.g;
                        ((Object)object2).getClass();
                        a$c.b((List)object);
                    }
                }
            }
        }
    }
}

