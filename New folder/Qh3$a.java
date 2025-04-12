/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Qh3$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;
    public final /* synthetic */ Ns2 d;
    public final /* synthetic */ dl1_1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Integer h;
    public final /* synthetic */ Integer i;

    public Qh3$a(Ns2 ns2, Ns2 ns22, dl1_1 dl1_12, int n3, int n4, Integer n7, Integer n8) {
        this.c = ns2;
        this.d = ns22;
        this.e = dl1_12;
        this.f = n3;
        this.g = n4;
        this.h = n7;
        this.i = n8;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Ns2 ns2 = this.d;
        int n3 = this.g;
        Ns2 ns22 = this.c;
        if (ns22 != null && ns2 != null) {
            Integer n4 = this.h;
            Intrinsics.checkNotNull(n4);
            int n7 = n4;
            Integer n8 = this.i;
            Intrinsics.checkNotNull(n8);
            int n10 = n8;
            float f5 = n7 == n10 ? Uh3.d : Uh3.e;
            dl1_1 dl1_12 = this.e;
            int n14 = dl1_12.e0(f5);
            float f6 = ai3.a;
            int n15 = dl1_12.e0(f6) + n14;
            n14 = ns2.b;
            long l2 = Uh3.f;
            int n16 = dl1_12.O0(l2) + n14 - n7;
            n7 = ns22.a;
            n14 = this.f;
            n7 = (n14 - n7) / 2;
            n3 = n3 - n10 - n15;
            Ns2$a.f((Ns2$a)object, ns22, n7, n3);
            int n17 = ns2.a;
            n14 = (n14 - n17) / 2;
            Ns2$a.f((Ns2$a)object, ns2, n14, n3 -= n16);
        } else {
            boolean bl2 = false;
            Object var5_6 = null;
            if (ns22 != null) {
                int n18 = ns22.b;
                n3 = (n3 - n18) / 2;
                Ns2$a.f((Ns2$a)object, ns22, 0, n3);
            } else if (ns2 != null) {
                int n19 = ns2.b;
                n3 = (n3 - n19) / 2;
                Ns2$a.f((Ns2$a)object, ns2, 0, n3);
            }
        }
        return Unit.a;
    }
}

