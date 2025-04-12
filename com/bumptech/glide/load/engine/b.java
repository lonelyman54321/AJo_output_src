/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.c$a;
import com.bumptech.glide.load.engine.d;
import com.bumptech.glide.load.engine.f$c;
import java.io.File;
import java.util.List;

public final class b
implements c,
ei0$a {
    public final List a;
    public final d b;
    public final c$a c;
    public int d = -1;
    public qn1_0 e;
    public List f;
    public int g;
    public volatile BP1$a h;
    public File i;

    public b(List list, d d2, c$a c$a) {
        this.a = list;
        this.b = d2;
        this.c = c$a;
    }

    public final boolean b() {
        while (true) {
            Object object;
            Object object2;
            int n3;
            int n4;
            Object object3 = this.f;
            int n7 = 1;
            boolean bl2 = false;
            Az2 az2 = null;
            if (object3 != null && (n4 = this.g) < (n3 = object3.size())) {
                n3 = 0;
                object3 = null;
                this.h = null;
                while (!bl2 && (n3 = this.g) < (n4 = (object2 = this.f).size())) {
                    int n8;
                    object3 = this.f;
                    n4 = this.g;
                    this.g = n8 = n4 + 1;
                    object3 = (BP1)object3.get(n4);
                    object2 = this.i;
                    object = this.b;
                    int n10 = ((d)object).e;
                    int n14 = ((d)object).f;
                    object = ((d)object).i;
                    this.h = object3 = object3.a(object2, n10, n14, (Z92)object);
                    if ((object3 = this.h) == null) continue;
                    object3 = this.b;
                    object2 = this.h.c.a();
                    if ((object3 = ((d)object3).c((Class)object2)) == null) continue;
                    object3 = this.h.c;
                    az2 = this.b.o;
                    object3.d(az2, this);
                    bl2 = true;
                }
                return bl2;
            }
            this.d = n3 = this.d + n7;
            Object object4 = this.a;
            n7 = object4.size();
            if (n3 >= n7) {
                return false;
            }
            object3 = this.a;
            n7 = this.d;
            object3 = (qn1_0)object3.get(n7);
            object2 = this.b;
            object = ((d)object2).n;
            object4 = new ci0((qn1_0)object3, (qn1_0)object);
            object2 = ((f$c)((d)object2).h).a();
            this.i = object4 = object2.b((qn1_0)object4);
            if (object4 == null) continue;
            this.e = object3;
            this.f = object3 = this.b.c.b().g(object4);
            this.g = 0;
        }
    }

    public final void c(Exception exception) {
        c$a c$a = this.c;
        qn1_0 qn1_02 = this.e;
        ei0_0 ei0_02 = this.h.c;
        pi0_0 pi0_02 = pi0_0.DATA_DISK_CACHE;
        c$a.c(qn1_02, exception, ei0_02, pi0_02);
    }

    public final void cancel() {
        Object object = this.h;
        if (object != null) {
            object = ((BP1$a)object).c;
            object.cancel();
        }
    }

    public final void f(Object object) {
        c$a c$a = this.c;
        qn1_0 qn1_02 = this.e;
        ei0_0 ei0_02 = this.h.c;
        pi0_0 pi0_02 = pi0_0.DATA_DISK_CACHE;
        qn1_0 qn1_03 = this.e;
        c$a.a(qn1_02, object, ei0_02, pi0_02, qn1_03);
    }
}

