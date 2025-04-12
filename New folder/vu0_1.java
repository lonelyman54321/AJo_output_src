/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from VU0
 */
public final class vu0_1
implements RU0$a {
    public final ct2_1 a;
    public final Dh b;
    public final wt3 c;
    public final cv0_0 d;
    public final bt2_0 e;
    public final tu0_1 f;

    public vu0_1(bh_0 object, Dh dh2) {
        wt3 wt32 = WU0.a;
        Object object2 = WU0.b;
        cv0_0 cv0_02 = new cv0_0((Fq)object2);
        object2 = new bt2_0();
        this.a = object;
        this.b = dh2;
        this.c = wt32;
        this.d = cv0_02;
        this.e = object2;
        this.f = object = new tu0_1(this);
    }

    public final xt3 a(RU0 rU0, tv0_0 tv0_02, int n3, int n4) {
        ut3 ut32;
        Object object = this.b;
        ((Dh)object).a(rU0);
        tv0_0 tv0_03 = ((Dh)object).d(tv0_02);
        ((Dh)object).b(n3);
        ((Dh)object).c(n4);
        this.a.getClass();
        object = ut32;
        ut32 = new ut3(rU0, tv0_03, n3, n4, null);
        return this.b(ut32);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final xt3 b(ut3 var1_1) {
        block10: {
            var2_5 = this.c;
            var3_6 = new uu0_2(this, (ut3)var1_1);
            var4_7 = var2_5.a;
            synchronized (var4_7) {
                block11: {
                    try {
                        var5_8 = var2_5.b;
                        var5_8 = var5_8.a(var1_1);
                        var5_8 = (xt3)var5_8;
                        if (var5_8 == null) break block10;
                        var6_9 = var5_8.b();
                        if (!var6_9) break block11;
                    }
                    catch (Throwable var1_2) {}
                    return var5_8;
                }
                var5_8 = var2_5.b;
                var5_8 = var5_8.c(var1_1);
                var5_8 = (xt3)var5_8;
                return var5_8;
                ** finally { 
            }
        }
        try {
            var4_7 = new vt3((wt3)var2_5, (ut3)var1_1);
            var5_8 = var3_6 = var3_6.invoke(var4_7);
            var5_8 = (xt3)var3_6;
            var3_6 = var2_5.a;
        }
        catch (Exception var1_4) {
            var2_5 = new IllegalStateException("Could not load font", var1_4);
            throw var2_5;
        }
        synchronized (var3_6) {
            block13: {
                block12: {
                    try {
                        var4_7 = var2_5.b;
                        var4_7 = var4_7.a(var1_1);
                        if (var4_7 != null || !(var7_10 = var5_8.b())) break block12;
                        var2_5 = var2_5.b;
                        var2_5.b(var1_1, var5_8);
                    }
                    catch (Throwable var1_3) {
                        break block13;
                    }
                }
                var1_1 = Unit.a;
                return var5_8;
            }
            throw var1_3;
        }
    }
}

