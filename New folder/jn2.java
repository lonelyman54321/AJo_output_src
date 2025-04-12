/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class jn2
extends Uz3 {
    public ZD b;
    public float c;
    public List d;
    public float e;
    public float f;
    public ZD g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public re3_1 q;
    public final ki r;
    public ki s;
    public final rq1_2 t;

    public jn2() {
        Object object;
        boolean bl2;
        float f5;
        this.c = f5 = 1.0f;
        Serializable serializable = DA3.a;
        this.d = serializable;
        this.e = f5;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = f5;
        this.n = bl2 = true;
        this.o = bl2;
        this.r = object = ni.a();
        this.s = object;
        object = et1_2.NONE;
        serializable = jn2$a.c;
        object = yr1_2.a((et1_2)((Object)object), (Function0)((Object)serializable));
        this.t = object;
    }

    public final void a(Kt0 kt0) {
        ZD zD;
        Object object;
        List list;
        jn2 jn22 = this;
        boolean bl2 = this.n;
        if (bl2) {
            list = this.d;
            object = this.r;
            un2.b(list, (gn2)object);
            this.e();
        } else {
            bl2 = this.p;
            if (bl2) {
                this.e();
            }
        }
        bl2 = false;
        list = null;
        jn22.n = false;
        jn22.p = false;
        ZD zD3 = jn22.b;
        if (zD3 != null) {
            ki ki2 = jn22.s;
            float f5 = jn22.c;
            int n3 = 56;
            object = kt0;
            Jt0.g(kt0, ki2, zD3, f5, null, n3);
        }
        if ((zD = jn22.g) != null) {
            float f6;
            object = jn22.q;
            boolean bl3 = jn22.o;
            if (bl3 || object == null) {
                float f7 = jn22.f;
                f6 = jn22.j;
                int n4 = jn22.h;
                int n7 = jn22.i;
                int n8 = 16;
                jn22.q = object = new re3_1(f7, f6, n4, n7, null, n8);
                jn22.o = false;
            }
            ki ki3 = jn22.s;
            float f8 = jn22.e;
            int n10 = 48;
            f6 = 6.7E-44f;
            Jt0.g(kt0, ki3, zD, f8, (re3_1)object, n10);
        }
    }

    public final void e() {
        float f5;
        float f6 = this.k;
        Object object = this.r;
        int n3 = 1065353216;
        float f7 = 1.0f;
        float f8 = f6 - 0.0f;
        Object object2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object2 == false && (object2 = (f5 = (f6 = this.l) - f7) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) == false) {
            this.s = object;
        } else {
            Object object3;
            Object object4 = this.s;
            object2 = Intrinsics.areEqual(object4, object);
            if (object2 != false) {
                object4 = ni.a();
                this.s = object4;
            } else {
                object4 = this.s;
                object2 = ((ki)object4).o();
                this.s.rewind();
                object3 = this.s;
                ((ki)object3).i((int)object2);
            }
            object4 = this.t;
            object3 = (pn2)object4.getValue();
            object3.b((gn2)object);
            object = (pn2)object4.getValue();
            float f11 = object.getLength();
            float f12 = this.k;
            float f14 = this.m;
            f12 = (f12 + f14) % f7 * f11;
            float f15 = (this.l + f14) % f7 * f11;
            n3 = (int)(f12 == f15 ? 0 : (f12 > f15 ? 1 : -1));
            if (n3 > 0) {
                pn2 pn22 = (pn2)object4.getValue();
                ki ki2 = this.s;
                pn22.a(f12, f11, ki2);
                object4 = (pn2)object4.getValue();
                object = this.s;
                object4.a(0.0f, f15, (gn2)object);
            } else {
                object4 = (pn2)object4.getValue();
                object = this.s;
                object4.a(f12, f15, (gn2)object);
            }
        }
    }

    public final String toString() {
        return this.r.toString();
    }
}

