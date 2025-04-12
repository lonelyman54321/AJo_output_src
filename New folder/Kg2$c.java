/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Kg2$c
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Ns2 e;
    public final /* synthetic */ Ns2 f;
    public final /* synthetic */ Ns2 g;
    public final /* synthetic */ Ns2 h;
    public final /* synthetic */ Ns2 i;
    public final /* synthetic */ Ns2 j;
    public final /* synthetic */ Kg2 k;
    public final /* synthetic */ dl1_1 l;

    public Kg2$c(int n3, int n4, Ns2 ns2, Ns2 ns22, Ns2 ns23, Ns2 ns24, Ns2 ns25, Ns2 ns26, Kg2 kg2, dl1_1 dl1_12) {
        this.c = n3;
        this.d = n4;
        this.e = ns2;
        this.f = ns22;
        this.g = ns23;
        this.h = ns24;
        this.i = ns25;
        this.j = ns26;
        this.k = kg2;
        this.l = dl1_12;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3;
        int n4;
        Ns2 ns2;
        float f5;
        int n7;
        object = (Ns2$a)object;
        Kg2 kg2 = this.k;
        float f6 = kg2.c;
        Object object2 = this.l;
        float f7 = object2.getDensity();
        object2 = object2.getLayoutDirection();
        float f8 = Jg2.a;
        mk2_0 mk2_02 = kg2.d;
        float f11 = mk2_02.calculateTopPadding-D9Ej5fM() * f7;
        int n8 = ok1_1.b(f11);
        float f12 = androidx.compose.foundation.layout.h.c(mk2_02, (bp1_0)((Object)object2)) * f7;
        int n10 = ok1_1.b(f12);
        f8 = lk3_0.c * f7;
        int n14 = this.c;
        Ns2 ns22 = this.e;
        float f14 = 2.0f;
        boolean bl2 = true;
        if (ns22 != null) {
            int n15 = ns22.b;
            float f15 = (float)(n14 - n15) / f14;
            n15 = Math.round(((float)bl2 + 0.0f) * f15);
            n7 = 0;
            f5 = 0.0f;
            Ns2$a.f((Ns2$a)object, ns22, 0, n15);
        }
        if ((ns2 = this.f) != null) {
            n7 = ns2.a;
            n4 = this.d - n7;
            n7 = ns2.b;
            f5 = (float)(n14 - n7) / f14;
            float f16 = ((float)bl2 + 0.0f) * f5;
            n7 = Math.round(f16);
            Ns2$a.f((Ns2$a)object, ns2, n4, n7);
        }
        int n16 = kg2.b;
        ns2 = this.h;
        if (ns2 != null) {
            float f17;
            if (n16 != 0) {
                n7 = ns2.b;
                f5 = (float)(n14 - n7) / f14;
                f17 = ((float)bl2 + 0.0f) * f5;
                n7 = Math.round(f17);
            } else {
                n7 = n8;
            }
            n4 = -(ns2.b / 2);
            n7 = LK1.d(n7, n4, f6);
            if (ns22 == null) {
                n3 = 0;
                f8 = 0.0f;
                mk2_02 = null;
            } else {
                n4 = lk3_0.e(ns22);
                f17 = (float)n4 - f8;
                f8 = ((float)bl2 - f6) * f17;
            }
            int n17 = ok1_1.b(f8) + n10;
            Ns2$a.f((Ns2$a)object, ns2, n17, n7);
        }
        Ns2 ns23 = this.g;
        if (n16 != 0) {
            n10 = ns23.b;
            f12 = (float)(n14 - n10) / f14;
            f8 = ((float)bl2 + 0.0f) * f12;
            n10 = Math.round(f8);
        } else {
            n10 = n8;
        }
        n3 = lk3_0.d(ns2) / 2;
        n10 = Math.max(n10, n3);
        n3 = lk3_0.e(ns22);
        Ns2$a.f((Ns2$a)object, ns23, n3, n10);
        ns23 = this.i;
        if (ns23 != null) {
            if (n16 != 0) {
                n16 = ns23.b;
                float f18 = (float)(n14 -= n16) / f14;
                f12 = ((float)bl2 + 0.0f) * f18;
                n8 = Math.round(f12);
            }
            n16 = lk3_0.d(ns2) / 2;
            n16 = Math.max(n8, n16);
            n10 = lk3_0.e(ns22);
            Ns2$a.f((Ns2$a)object, ns23, n10, n16);
        }
        object2 = this.j;
        Ns2$a.e((Ns2$a)object, (Ns2)object2, 0L);
        return Unit.a;
    }
}

