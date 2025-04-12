/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;

/*
 * Renamed from wl0
 */
public final class wl0_0
implements RS {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;

    public wl0_0(long l2, long l3, long l4, long l7, long l8, long l12, long l14, long l15, long l16, long l17, long l18) {
        this.a = l2;
        this.b = l3;
        this.c = l4;
        this.d = l7;
        this.e = l8;
        this.f = l12;
        this.g = l14;
        this.h = l15;
        this.i = l16;
        this.j = l17;
        this.k = l18;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final ib3_0 a(boolean var1_1, ao3 var2_2, b30_0 var3_3) {
        block8: {
            block7: {
                var3_3.K(-1568341342);
                var4_4 = 3;
                var5_5 = 2;
                var6_6 = 1;
                if (!var1_1) break block7;
                var7_7 = wl0$a.$EnumSwitchMapping$0;
                var8_8 = var2_2.ordinal();
                var9_10 = var7_7[var8_8];
                if (var9_10 == var6_6 || var9_10 == var5_5) ** GOTO lbl15
                if (var9_10 == var4_4) {
                    var10_11 = this.i;
                } else {
                    var12_12 = new NoWhenBranchMatchedException();
                    throw var12_12;
lbl15:
                    // 1 sources

                    var10_11 = this.h;
                }
                break block8;
            }
            var7_7 = wl0$a.$EnumSwitchMapping$0;
            var8_9 = var2_2.ordinal();
            var9_10 = var7_7[var8_9];
            if (var9_10 == var6_6) ** GOTO lbl28
            if (var9_10 == var5_5) {
                var10_11 = this.k;
            } else {
                if (var9_10 != var4_4) {
                    var12_13 = new NoWhenBranchMatchedException();
                    throw var12_13;
                }
lbl28:
                // 3 sources

                var10_11 = this.j;
            }
        }
        if (var1_1) {
            var1_1 = -840809961;
            var3_3.K((int)var1_1);
            var12_14 /* !! */  = ao3.Off;
            var1_1 = var2_2 == var12_14 /* !! */  ? 100 : 50;
            var13_15 = 6;
            var6_6 = 0;
            var9_10 = 0;
            var7_7 = null;
            var12_14 /* !! */  = Hl.c((int)var1_1, 0, null, var13_15);
            var12_14 /* !! */  = r63.a(var10_11, (Qs3)var12_14 /* !! */ , var3_3, 0);
            var3_3.E();
        } else {
            var1_1 = -840629417;
            var3_3.K((int)var1_1);
            var12_14 /* !! */  = new OX(var10_11);
            var12_14 /* !! */  = J83.j((Object)var12_14 /* !! */ , var3_3);
            var3_3.E();
        }
        var3_3.E();
        return var12_14 /* !! */ ;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final ib3_0 b(boolean bl2, ao3 ao32, b30_0 b30_02) {
        void var12_24;
        long l2;
        int n3;
        void var2_7;
        int[] nArray;
        void var3_8;
        var3_8.K(840901029);
        int n4 = 3;
        int n7 = 2;
        int n8 = 1;
        if (bl2) {
            nArray = wl0$a.$EnumSwitchMapping$0;
            int n10 = var2_7.ordinal();
            n3 = nArray[n10];
            if (n3 != n8 && n3 != n7) {
                if (n3 != n4) {
                    NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                    throw noWhenBranchMatchedException;
                }
                l2 = this.d;
            } else {
                l2 = this.c;
            }
        } else {
            nArray = wl0$a.$EnumSwitchMapping$0;
            int n14 = var2_7.ordinal();
            n3 = nArray[n14];
            if (n3 != n8) {
                if (n3 != n7) {
                    if (n3 != n4) {
                        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                        throw noWhenBranchMatchedException;
                    }
                    l2 = this.f;
                } else {
                    l2 = this.g;
                }
            } else {
                l2 = this.e;
            }
        }
        if (bl2) {
            void var1_5;
            int n15 = 507315190;
            var3_8.K(n15);
            ao3 ao33 = ao3.Off;
            if (var2_7 == ao33) {
                int n16 = 100;
            } else {
                int n17 = 50;
            }
            int n18 = 6;
            n8 = 0;
            n3 = 0;
            nArray = null;
            Qs3 qs3 = Hl.c((int)var1_5, 0, null, n18);
            ib3_0 ib3_02 = r63.a(l2, qs3, (b30_0)var3_8, 0);
            var3_8.E();
        } else {
            int n19 = 507495734;
            var3_8.K(n19);
            OX oX = new OX(l2);
            tr1_0 tr1_02 = J83.j(oX, (b30_0)var3_8);
            var3_8.E();
        }
        var3_8.E();
        return var12_24;
    }

    public final ib3_0 c(ao3 object, b30_0 b30_02) {
        int n3 = 544656267;
        b30_02.K(n3);
        ao3 ao32 = ao3.Off;
        long l2 = object == ao32 ? this.b : this.a;
        int n4 = object == ao32 ? 100 : 50;
        object = Hl.c(n4, 0, null, 6);
        object = r63.a(l2, (Qs3)object, b30_02, 0);
        b30_02.E();
        return object;
    }
}

