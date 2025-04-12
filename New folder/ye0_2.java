/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;

/*
 * Renamed from ye0
 */
public final class ye0_2
implements pr3_0 {
    public final Nr3 a;
    public final se1_0 b;
    public final int c;
    public final boolean d;

    public ye0_2(Nr3 object, se1_0 object2, int n3, boolean bl2) {
        this.a = object;
        this.b = object2;
        this.c = n3;
        this.d = bl2;
        if (n3 > 0) {
            return;
        }
        object2 = "durationMillis must be > 0.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a() {
        this.a.getClass();
        var2_2 = this.b;
        var3_3 = var2_2.a();
        var4_4 = var2_2.b();
        var5_5 = var4_4.C;
        var6_6 = var2_2 instanceof cg3_2;
        if (!var6_6) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (cg3_2)var2_2;
        var7_7 = var4_4.g;
        if (var7_7) {
            var7_7 = false;
            var4_4 = null;
            var8_8 = false;
        } else lbl-1000:
        // 2 sources

        {
            var7_7 = true;
            var8_8 = true;
        }
        var9_9 = this.d;
        var10_10 = this.c;
        var7_7 = false;
        var4_4 = null;
        var1_1 /* !! */  = new ne0(null, var3_3, var5_5, var10_10, var8_8, var9_9);
        if (var6_6 || (var11_11 = var2_2 instanceof hb0_0)) {
            return;
        }
        var1_1 /* !! */  = new NoWhenBranchMatchedException();
        throw var1_1 /* !! */ ;
    }
}

