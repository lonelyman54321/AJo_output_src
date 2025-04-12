/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.c$a;
import com.bumptech.glide.load.engine.d;
import com.bumptech.glide.load.engine.f$c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class h
implements c,
ei0$a {
    public final c$a a;
    public final d b;
    public int c;
    public int d = -1;
    public qn1_0 e;
    public List f;
    public int g;
    public volatile BP1$a h;
    public File i;
    public yk2_2 j;

    public h(d d2, c$a c$a) {
        this.b = d2;
        this.a = c$a;
    }

    public final boolean b() {
        Object object = this.b.a();
        boolean n3 = ((ArrayList)object).isEmpty();
        boolean bl2 = false;
        Class clazz = null;
        if (n3) {
            return false;
        }
        Class clazz2 = this.b.d();
        int n4 = clazz2.isEmpty();
        if (n4 != 0) {
            clazz2 = File.class;
            object = this.b.k;
            boolean n10 = clazz2.equals(object);
            if (n10) {
                return false;
            }
            clazz2 = new StringBuilder("Failed to find any load path from ");
            clazz = this.b.d.getClass();
            ((StringBuilder)((Object)clazz2)).append(clazz);
            ((StringBuilder)((Object)clazz2)).append(" to ");
            clazz = this.b.k;
            ((StringBuilder)((Object)clazz2)).append(clazz);
            clazz2 = ((StringBuilder)((Object)clazz2)).toString();
            object = new IllegalStateException((String)((Object)clazz2));
            throw object;
        }
        while (true) {
            yk2_2 yk2_22;
            int n7;
            Object object2 = this.f;
            int n8 = 1;
            if (object2 != null && (n7 = this.g) < (n4 = object2.size())) {
                int n10;
                int n14 = 0;
                object = null;
                this.h = null;
                while (!bl2 && (n14 = this.g) < (n10 = (clazz2 = this.f).size())) {
                    object = this.f;
                    n10 = this.g;
                    this.g = n4 = n10 + 1;
                    object = (BP1)object.get(n10);
                    clazz2 = this.i;
                    object2 = this.b;
                    n7 = ((d)object2).e;
                    int n15 = ((d)object2).f;
                    object2 = ((d)object2).i;
                    this.h = object = object.a(clazz2, n7, n15, (Z92)object2);
                    if ((object = this.h) == null) continue;
                    object = this.b;
                    clazz2 = this.h.c.a();
                    if ((object = ((d)object).c(clazz2)) == null) continue;
                    object = this.h.c;
                    clazz2 = this.b.o;
                    object.d((Az2)((Object)clazz2), this);
                    bl2 = true;
                }
                return bl2;
            }
            this.d = n4 = this.d + n8;
            n7 = clazz2.size();
            if (n4 >= n7) {
                this.c = n4 = this.c + n8;
                n8 = ((ArrayList)object).size();
                if (n4 >= n8) {
                    return false;
                }
                this.d = 0;
            }
            n4 = this.c;
            object2 = (qn1_0)((ArrayList)object).get(n4);
            n8 = this.d;
            Object object3 = clazz2.get(n8);
            Object object4 = object3;
            object4 = (Class)object3;
            xq3_0 xq3_02 = this.b.f((Class)object4);
            d d2 = this.b;
            Object object5 = d2.c.a;
            qn1_0 qn1_02 = d2.n;
            int n16 = d2.e;
            int n17 = d2.f;
            Z92 z92 = d2.i;
            object3 = yk2_22;
            this.j = yk2_22 = new yk2_2((Kp)object5, (qn1_0)object2, qn1_02, n16, n17, xq3_02, (Class)object4, z92);
            object3 = ((f$c)d2.h).a();
            object5 = this.j;
            this.i = object3 = object3.b((qn1_0)object5);
            if (object3 == null) continue;
            this.e = object2;
            this.f = object2 = this.b.c.b().g(object3);
            this.g = 0;
        }
    }

    public final void c(Exception exception) {
        c$a c$a = this.a;
        yk2_2 yk2_22 = this.j;
        ei0_0 ei0_02 = this.h.c;
        pi0_0 pi0_02 = pi0_0.RESOURCE_DISK_CACHE;
        c$a.c(yk2_22, exception, ei0_02, pi0_02);
    }

    public final void cancel() {
        Object object = this.h;
        if (object != null) {
            object = ((BP1$a)object).c;
            object.cancel();
        }
    }

    public final void f(Object object) {
        c$a c$a = this.a;
        qn1_0 qn1_02 = this.e;
        ei0_0 ei0_02 = this.h.c;
        pi0_0 pi0_02 = pi0_0.RESOURCE_DISK_CACHE;
        yk2_2 yk2_22 = this.j;
        c$a.a(qn1_02, object, ei0_02, pi0_02, yk2_22);
    }
}

