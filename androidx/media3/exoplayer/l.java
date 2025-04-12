/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.l$a;
import androidx.media3.exoplayer.l$b;
import androidx.media3.exoplayer.l$c;
import androidx.media3.exoplayer.l$d;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.j$c;
import androidx.media3.exoplayer.source.k;
import androidx.media3.exoplayer.source.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public final class l {
    public final nu2 a;
    public final ArrayList b;
    public final IdentityHashMap c;
    public final HashMap d;
    public final l$d e;
    public final HashMap f;
    public final HashSet g;
    public final je h;
    public final H21 i;
    public s j;
    public boolean k;
    public Kq3 l;

    public l(l$d cloneable, je je2, H21 h21, nu2 nu22) {
        this.a = nu22;
        this.e = cloneable;
        cloneable = new Cloneable();
        this.j = cloneable;
        this.c = cloneable = new Cloneable();
        this.d = cloneable;
        super();
        this.b = cloneable;
        this.h = je2;
        this.i = h21;
        super();
        this.f = cloneable;
        super();
        this.g = cloneable;
    }

    public final androidx.media3.common.g a(int n3, List list, s s7) {
        int n4 = list.isEmpty();
        if (n4 == 0) {
            this.j = s7;
            for (int i3 = n3; i3 < (n4 = list.size() + n3); ++i3) {
                int n7;
                Object object;
                int n8;
                n4 = i3 - n3;
                Object object2 = (l$c)list.get(n4);
                Object object3 = this.b;
                int n10 = 0;
                Object object4 = null;
                if (i3 > 0) {
                    n8 = i3 + -1;
                    l$c l$c = (l$c)((ArrayList)object3).get(n8);
                    object = l$c.a.o;
                    n8 = l$c.d;
                    object = ((QV0)object).b;
                    ((l$c)object2).d = n7 = ((androidx.media3.common.g)object).p() + n8;
                    ((l$c)object2).e = false;
                    object4 = ((l$c)object2).c;
                    ((ArrayList)object4).clear();
                } else {
                    ((l$c)object2).d = 0;
                    ((l$c)object2).e = false;
                    object4 = ((l$c)object2).c;
                    ((ArrayList)object4).clear();
                }
                object4 = ((l$c)object2).a.o.b;
                n10 = ((androidx.media3.common.g)object4).p();
                for (n8 = i3; n8 < (n7 = ((ArrayList)object3).size()); ++n8) {
                    int n14;
                    object = (l$c)((ArrayList)object3).get(n8);
                    ((l$c)object).d = n14 = ((l$c)object).d + n10;
                }
                ((ArrayList)object3).add(i3, object2);
                object3 = this.d;
                object4 = ((l$c)object2).b;
                ((HashMap)object3).put(object4, object2);
                boolean bl2 = this.k;
                if (!bl2) continue;
                this.e((l$c)object2);
                object3 = this.c;
                bl2 = ((IdentityHashMap)object3).isEmpty();
                if (bl2) {
                    object3 = this.g;
                    ((HashSet)object3).add(object2);
                    continue;
                }
                object3 = this.f;
                if ((object2 = (l$b)((HashMap)object3).get(object2)) == null) continue;
                object3 = ((l$b)object2).a;
                object2 = ((l$b)object2).b;
                object3.k((j$c)object2);
            }
        }
        return this.b();
    }

    public final androidx.media3.common.g b() {
        int n3;
        ArrayList arrayList = this.b;
        int n4 = arrayList.isEmpty();
        if (n4 != 0) {
            return androidx.media3.common.g.a;
        }
        au2_0 au2_02 = null;
        int n7 = 0;
        s s7 = null;
        for (n4 = 0; n4 < (n3 = arrayList.size()); ++n4) {
            Object object = (l$c)arrayList.get(n4);
            ((l$c)object).d = n7;
            object = ((l$c)object).a.o.b;
            n3 = ((androidx.media3.common.g)object).p();
            n7 += n3;
        }
        s7 = this.j;
        au2_02 = new au2_0(arrayList, s7);
        return au2_02;
    }

    public final void c() {
        boolean bl2;
        Iterator iterator = this.g.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (l$c)iterator.next();
            Object object2 = ((l$c)object).c;
            boolean bl3 = ((ArrayList)object2).isEmpty();
            if (!bl3) continue;
            object2 = this.f;
            if ((object = (l$b)((HashMap)object2).get(object)) != null) {
                object2 = ((l$b)object).a;
                object = ((l$b)object).b;
                object2.k((j$c)object);
            }
            iterator.remove();
        }
    }

    public final void d(l$c l$c) {
        Object object;
        boolean bl2 = l$c.e;
        if (bl2 && (bl2 = ((ArrayList)(object = l$c.c)).isEmpty())) {
            object = (l$b)this.f.remove(l$c);
            object.getClass();
            j j3 = ((l$b)object).a;
            j$c j$c = ((l$b)object).b;
            j3.j(j$c);
            object = ((l$b)object).c;
            j3.b((k)object);
            j3.e((b)object);
            object = this.g;
            ((HashSet)object).remove(l$c);
        }
    }

    public final void e(l$c object) {
        h h3 = ((l$c)object).a;
        tn1_0 tn1_02 = new tn1_0(this);
        Object object2 = new l$a(this, (l$c)object);
        HashMap hashMap = this.f;
        l$b l$b = new l$b(h3, tn1_02, (l$a)object2);
        hashMap.put(object, l$b);
        object = Looper.myLooper();
        if (object == null) {
            object = Looper.getMainLooper();
        }
        l$b = null;
        hashMap = new Handler((Looper)object, null);
        h3.a((Handler)hashMap, (k)object2);
        object = Looper.myLooper();
        if (object == null) {
            object = Looper.getMainLooper();
        }
        hashMap = new Handler((Looper)object, null);
        h3.d((Handler)hashMap, (b)object2);
        object = this.l;
        object2 = this.a;
        h3.i(tn1_02, (Kq3)object, (nu2)object2);
    }

    public final void f(i object) {
        IdentityHashMap identityHashMap = this.c;
        l$c l$c = (l$c)identityHashMap.remove(object);
        l$c.getClass();
        l$c.a.f((i)object);
        ArrayList arrayList = l$c.c;
        object = ((g)object).a;
        arrayList.remove(object);
        boolean bl2 = identityHashMap.isEmpty();
        if (!bl2) {
            this.c();
        }
        this.d(l$c);
    }

    public final void g(int n3, int n4) {
        int n7 = 1;
        n4 -= n7;
        while (n4 >= n3) {
            int n8;
            ArrayList arrayList = this.b;
            l$c l$c = (l$c)arrayList.remove(n4);
            Object object = this.d;
            Object object2 = l$c.b;
            ((HashMap)object).remove(object2);
            object = l$c.a.o.b;
            int n10 = -((androidx.media3.common.g)object).p();
            for (int i3 = n4; i3 < (n8 = arrayList.size()); ++i3) {
                int n14;
                l$c l$c2 = (l$c)arrayList.get(i3);
                l$c2.d = n14 = l$c2.d + n10;
            }
            l$c.e = n7;
            boolean bl2 = this.k;
            if (bl2) {
                this.d(l$c);
            }
            n4 += -1;
        }
    }
}

