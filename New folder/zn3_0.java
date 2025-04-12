/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Zn3
 */
public final class zn3_0
extends hv_0 {
    public boolean H;
    public Function1 I;
    public final Zn3$b J;

    public zn3_0() {
        throw null;
    }

    public zn3_0(boolean bl2, wr1_1 wr1_12, Qg1 qg1, boolean bl3, CP2 cP2, Function1 function1) {
        Zn3$b zn3$b;
        Zn3$a zn3$a = new Zn3$a(function1, bl2);
        super(wr1_12, qg1, bl3, null, cP2, zn3$a);
        this.H = bl2;
        this.I = function1;
        this.J = zn3$b = new Zn3$b(this);
    }

    public final void u1(UY2 uY2) {
        boolean bl2 = this.H;
        ao3 ao32 = bl2 ? ao3.On : ao3.Off;
        Object object = RY2.a;
        object = MY2.C;
        gn1_2 cfr_ignored_0 = RY2.a[22];
        object.getClass();
        uY2.a((TY2)object, (Object)ao32);
    }
}

