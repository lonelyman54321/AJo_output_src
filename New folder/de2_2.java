/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.text.StringsKt;

/*
 * Renamed from DE2
 */
public final class de2_2
extends ce2_2 {
    public final boolean c() {
        this.o();
        int n3 = this.z();
        dp_1 dp_12 = this.g;
        int n4 = dp_12.b;
        if (n3 < n4 && n3 != (n4 = -1)) {
            return q0_0.u(dp_12.a[n3]);
        }
        return false;
    }

    public final byte f() {
        this.o();
        int n3 = this.z();
        dp_1 dp_12 = this.g;
        int n4 = dp_12.b;
        if (n3 < n4 && n3 != (n4 = -1)) {
            this.a = n4 = n3 + 1;
            return r0_0.a(dp_12.a[n3]);
        }
        return 10;
    }

    public final void h(char c2) {
        this.o();
        int n3 = this.z();
        Object object = this.g;
        int n4 = ((dp_1)object).b;
        int n7 = -1;
        if (n3 < n4 && n3 != n7) {
            object = ((dp_1)object).a;
            Object object2 = object[n3];
            this.a = ++n3;
            if (object2 == c2) {
                return;
            }
            this.D(c2);
            throw null;
        }
        this.a = n7;
        this.D(c2);
        throw null;
    }

    public final byte w() {
        this.o();
        int n3 = this.z();
        dp_1 dp_12 = this.g;
        int n4 = dp_12.b;
        if (n3 < n4 && n3 != (n4 = -1)) {
            this.a = n3;
            return r0_0.a(dp_12.a[n3]);
        }
        return 10;
    }

    /*
     * Unable to fully structure code
     */
    public final int z() {
        var1_1 = this.a;
        block0: while ((var1_1 = this.y(var1_1)) != (var2_2 = -1)) {
            block12: {
                block13: {
                    block14: {
                        var3_3 = this.g;
                        var4_4 = var3_3.a;
                        var5_5 = var4_4[var1_1];
                        var6_6 = 32;
                        if (var5_5 == var6_6 || var5_5 == (var6_6 = 10) || var5_5 == (var7_7 = 13) || var5_5 == (var7_7 = 9)) break block12;
                        var7_7 = 47;
                        if (var5_5 != var7_7 || (var5_5 = var1_1 + 1) >= (var8_8 = var3_3.b)) break;
                        var8_8 = var1_1 + 2;
                        var9_9 = var4_4[var5_5];
                        var5_5 = 4;
                        var10_10 = 42;
                        if (var9_9 == var10_10) break block13;
                        if (var9_9 == var7_7) break block14;
                        var11_11 = var1_1;
                        var12_12 = Boolean.FALSE;
                        var3_3 = new Pair(var11_11, var12_12);
                        ** GOTO lbl45
                    }
                    while (var1_1 != var2_2) {
                        var1_1 = StringsKt.N((CharSequence)var3_3, (char)var6_6, var8_8, false, var5_5);
                        if (var1_1 == var2_2) {
                            var1_1 = var3_3.b;
                            var1_1 = var8_8 = this.y(var1_1);
                            continue;
                        }
                        var11_11 = ++var1_1;
                        var12_12 = Boolean.TRUE;
                        var3_3 = new Pair(var11_11, var12_12);
                        ** GOTO lbl45
                    }
                    var11_11 = var2_2;
                    var12_12 = Boolean.TRUE;
                    var3_3 = new Pair(var11_11, var12_12);
                    ** GOTO lbl45
                }
                var9_9 = 0;
                var4_4 = null;
                block2: while (var1_1 != var2_2) {
                    block15: {
                        var11_11 = "*/";
                        var1_1 = StringsKt.O((CharSequence)var3_3, (String)var11_11, var8_8, false, var5_5);
                        if (var1_1 == var2_2) break block15;
                        var11_11 = var1_1 += 2;
                        var12_12 = Boolean.TRUE;
                        var3_3 = new Pair(var11_11, var12_12);
lbl45:
                        // 4 sources

                        var11_11 = (Number)var3_3.a;
                        var1_1 = var11_11.intValue();
                        var12_12 = (Boolean)var3_3.b;
                        var2_2 = (int)var12_12.booleanValue();
                        if (var2_2 != 0) continue block0;
                        break block0;
                    }
                    var13_13 = var3_3.a;
                    var1_1 = var3_3.b;
                    var6_6 = var1_1 + -1;
                    var7_7 = var13_13[var6_6];
                    if (var7_7 != var10_10) {
                        var8_8 = this.y(var1_1);
lbl58:
                        // 2 sources

                        while (true) {
                            var1_1 = var8_8;
                            continue block2;
                            break;
                        }
                    }
                    var7_7 = this.f;
                    if ((var1_1 -= var6_6) > var7_7) {
                        var8_8 = var6_6;
                    } else {
                        this.a = var6_6;
                        this.o();
                        var1_1 = this.a;
                        var8_8 = var1_1 == 0 && (var1_1 = var3_3.b) != 0 ? 0 : -1;
                    }
                    if (var9_9 != 0) break;
                    var9_9 = 1;
                    ** continue;
                }
                this.a = var1_1 = var3_3.b;
                q0_0.r(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6);
                throw null;
            }
            ++var1_1;
        }
        this.a = var1_1;
        return var1_1;
    }
}

