/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Gk3$c
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Ns2 h;
    public final /* synthetic */ Ns2 i;
    public final /* synthetic */ Ns2 j;
    public final /* synthetic */ Ns2 k;
    public final /* synthetic */ gk3_0 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ dl1_1 o;

    public Gk3$c(Ns2 ns2, int n3, int n4, int n7, int n8, Ns2 ns22, Ns2 ns23, Ns2 ns24, Ns2 ns25, gk3_0 gk3_02, int n10, int n14, dl1_1 dl1_12) {
        this.c = ns2;
        this.d = n3;
        this.e = n4;
        this.f = n7;
        this.g = n8;
        this.h = ns22;
        this.i = ns23;
        this.j = ns24;
        this.k = ns25;
        this.l = gk3_02;
        this.m = n10;
        this.n = n14;
        this.o = dl1_12;
        super(1);
    }

    public final Object invoke(Object object) {
        Gk3$c gk3$c = this;
        Object object2 = object;
        object2 = (Ns2$a)object;
        Ns2 ns2 = this.h;
        int n3 = 0x40000000;
        float f5 = 2.0f;
        dl1_1 dl1_12 = this.o;
        Ns2 ns22 = this.k;
        Ns2 ns23 = this.j;
        Ns2 ns24 = this.i;
        int n4 = this.g;
        int n7 = this.f;
        gk3_0 gk3_02 = this.l;
        Ns2 ns25 = this.c;
        if (ns25 != null) {
            Object var25_31;
            int n8;
            float f6;
            float f7;
            int n10 = this.d;
            int n14 = this.e;
            if ((n14 = n10 - n14) < 0) {
                n14 = 0;
                f7 = 0.0f;
            }
            n10 = (int)(gk3_02.a ? 1 : 0);
            int n15 = gk3$c.m;
            int n16 = gk3$c.n;
            n15 += n16;
            float f8 = dl1_12.getDensity();
            float f11 = Fk3.a;
            if (ns23 != null) {
                int n17 = ns23.b;
                n17 = n4 - n17;
                f11 = (float)n17 / f5;
                f6 = (1.0f + 0.0f) * f11;
                n8 = Math.round(f6);
                n3 = 0;
                f5 = 0.0f;
                var25_31 = null;
                Ns2$a.f((Ns2$a)object2, ns23, 0, n8);
            }
            if (ns22 != null) {
                n8 = ns22.a;
                n7 -= n8;
                n8 = ns22.b;
                f6 = (float)(n4 - n8) / 2.0f;
                f11 = 1.0f;
                n3 = 0;
                f5 = 0.0f;
                var25_31 = null;
                f11 = (f11 + 0.0f) * f6;
                n8 = Math.round(f11);
                Ns2$a.f((Ns2$a)object2, ns22, n7, n8);
            }
            if (n10 != 0) {
                n8 = ns25.b;
                f6 = (float)(n4 -= n8) / 2.0f;
                n3 = 1;
                f5 = n3;
                n16 = 0;
                f8 = 0.0f;
                f5 = (f5 + 0.0f) * f6;
                n8 = Math.round(f5);
            } else {
                f6 = lk3_0.b * f8;
                n8 = ok1_1.b(f6);
            }
            f7 = n8 - n14;
            f5 = gk3_02.b;
            n14 = ok1_1.b(f7 *= f5);
            n8 -= n14;
            n14 = lk3_0.e(ns23);
            Ns2$a.f((Ns2$a)object2, ns25, n14, n8);
            n8 = lk3_0.e(ns23);
            Ns2$a.f((Ns2$a)object2, ns2, n8, n15);
            if (ns24 != null) {
                n8 = lk3_0.e(ns23);
                Ns2$a.f((Ns2$a)object2, ns24, n8, n15);
            }
        } else {
            float f12;
            int n18;
            float f14;
            int n19 = gk3_02.a;
            float f15 = dl1_12.getDensity();
            f5 = Fk3.a;
            mk2_0 mk2_02 = gk3_02.c;
            f5 = mk2_02.calculateTopPadding-D9Ej5fM() * f15;
            int n20 = ok1_1.b(f5);
            if (ns23 != null) {
                n3 = ns23.b;
                f5 = (float)(n4 - n3) / 2.0f;
                f14 = (1.0f + 0.0f) * f5;
                n3 = Math.round(f14);
                n18 = 0;
                f12 = 0.0f;
                Ns2$a.f((Ns2$a)object2, ns23, 0, n3);
            }
            if (ns22 != null) {
                n3 = ns22.a;
                n7 -= n3;
                n3 = ns22.b;
                f5 = (float)(n4 - n3) / 2.0f;
                f14 = 1.0f;
                n18 = 0;
                f12 = 0.0f;
                f14 = (f14 + 0.0f) * f5;
                n3 = Math.round(f14);
                Ns2$a.f((Ns2$a)object2, ns22, n7, n3);
            }
            if (n19 != 0) {
                n3 = ns2.b;
                f5 = (float)(n4 - n3) / 2.0f;
                f14 = 1.0f;
                n18 = 0;
                f12 = 0.0f;
                f14 = (f14 + 0.0f) * f5;
                n3 = Math.round(f14);
            } else {
                n3 = n20;
            }
            n18 = lk3_0.e(ns23);
            Ns2$a.f((Ns2$a)object2, ns2, n18, n3);
            if (ns24 != null) {
                if (n19 != 0) {
                    n19 = ns24.b;
                    float f16 = (float)(n4 -= n19) / 2.0f;
                    boolean bl2 = true;
                    float f17 = (float)bl2;
                    f15 = 0.0f;
                    f17 = (f17 + 0.0f) * f16;
                    n20 = Math.round(f17);
                }
                n19 = lk3_0.e(ns23);
                Ns2$a.f((Ns2$a)object2, ns24, n19, n20);
            }
        }
        return Unit.a;
    }
}

