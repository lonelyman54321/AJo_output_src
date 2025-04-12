/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from b41
 */
public abstract class b41_0 {
    public final String a;
    public final List b;

    public b41_0(String string2, List list) {
        Intrinsics.checkNotNullParameter(string2, "content");
        Intrinsics.checkNotNullParameter(list, "parameters");
        this.a = string2;
        this.b = list;
    }

    public final String a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        List list = this.b;
        int n3 = xx_2.h(list);
        if (n3 >= 0) {
            int n4 = 0;
            while (true) {
                a41_0 a41_02 = (a41_0)list.get(n4);
                String string3 = a41_02.a;
                boolean bl2 = true;
                boolean bl3 = kotlin.text.b.i(string3, string2, bl2);
                if (bl3) {
                    return a41_02.b;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        block21: {
            block20: {
                var1_1 = 2;
                var2_2 = 1;
                var3_3 = this.b;
                var4_4 = var3_3.isEmpty();
                var5_5 = this.a;
                if (var4_4 != 0) break block21;
                var4_4 = var5_5.length();
                var6_6 = var3_3;
                var6_6 = ((Iterable)var3_3).iterator();
                var7_7 = 0;
                var8_8 = null;
                while ((var9_9 = var6_6.hasNext()) != 0) {
                    var10_10 = (a41_0)var6_6.next();
                    var11_11 = var10_10.a;
                    var12_12 = var11_11.length();
                    var10_10 = var10_10.b;
                    var9_9 = var10_10.length() + var12_12 + 3;
                    var7_7 += var9_9;
                }
                var6_6 = new StringBuilder(var4_4 += var7_7);
                var6_6.append(var5_5);
                var4_4 = xx_2.h(var3_3);
                if (var4_4 < 0) break block20;
                var13_13 = 0;
                var5_5 = null;
                while (true) {
                    block19: {
                        var8_8 = (a41_0)var3_3.get(var13_13);
                        var6_6.append("; ");
                        var10_10 = var8_8.a;
                        var6_6.append((String)var10_10);
                        var6_6.append("=");
                        var10_10 = c41_0.a;
                        var8_8 = var8_8.b;
                        var9_9 = var8_8.length();
                        var12_12 = '\"';
                        var14_14 = '\\';
                        var15_15 = "<this>";
                        if (var9_9 == 0) ** GOTO lbl69
                        var9_9 = var8_8.length();
                        if (var9_9 < var1_1) ** GOTO lbl63
                        Intrinsics.checkNotNullParameter(var8_8, var15_15);
                        var9_9 = var8_8.length();
                        if (var9_9 == 0) break;
                        var9_9 = var8_8.charAt(0);
                        if (var9_9 != var12_12 || (var9_9 = (int)le3_2.D((CharSequence)var8_8)) != var12_12) ** GOTO lbl63
                        var9_9 = 1;
                        while ((var9_9 = StringsKt.N((CharSequence)var8_8, var12_12, var9_9, false, 4)) != (var16_16 = StringsKt.K((CharSequence)var8_8))) {
                            var16_16 = var9_9 + -1;
                            var17_17 = 0;
                            var18_18 = null;
                            while ((var19_19 = var8_8.charAt(var16_16)) == var14_14) {
                                var17_17 += var2_2;
                                var16_16 += -1;
                            }
                            if ((var17_17 %= var1_1) != 0) {
                                var16_16 = var8_8.length();
                                if ((var9_9 += var2_2) < var16_16) continue;
                                break;
                            }
lbl63:
                            // 4 sources

                            var9_9 = var8_8.length();
                            for (var16_16 = 0; var16_16 < var9_9; var16_16 += var2_2) {
                                block22: {
                                    var20_20 = c41_0.a;
                                    var18_18 = Character.valueOf(var8_8.charAt(var16_16));
                                    var17_17 = (int)var20_20.contains(var18_18);
                                    if (var17_17 == 0) break block22;
lbl69:
                                    // 2 sources

                                    Intrinsics.checkNotNullParameter(var8_8, var15_15);
                                    var15_15 = "\"";
                                    var10_10 = new StringBuilder(var15_15);
                                    var16_16 = var8_8.length();
                                    var18_18 = null;
                                    for (var17_17 = 0; var17_17 < var16_16; var17_17 += var2_2) {
                                        var19_19 = var8_8.charAt(var17_17);
                                        if (var19_19 != (var1_1 = 9)) {
                                            var1_1 = 10;
                                            if (var19_19 != var1_1) {
                                                var1_1 = 13;
                                                if (var19_19 != var1_1) {
                                                    if (var19_19 != var12_12) {
                                                        if (var19_19 != var14_14) {
                                                            var10_10.append(var19_19);
                                                        } else {
                                                            var21_21 = "\\\\";
                                                            var10_10.append((String)var21_21);
                                                        }
                                                    } else {
                                                        var21_21 = "\\\"";
                                                        var10_10.append((String)var21_21);
                                                    }
                                                } else {
                                                    var21_21 = "\\r";
                                                    var10_10.append((String)var21_21);
                                                }
                                            } else {
                                                var21_21 = "\\n";
                                                var10_10.append((String)var21_21);
                                            }
                                        } else {
                                            var21_21 = "\\t";
                                            var10_10.append((String)var21_21);
                                        }
                                        var1_1 = 2;
                                    }
                                    var10_10.append(var15_15);
                                    var21_21 = var10_10.toString();
                                    var6_6.append((String)var21_21);
                                    break block19;
                                }
                                var1_1 = 2;
                            }
                        }
                        var6_6.append((String)var8_8);
                    }
                    if (var13_13 != var4_4) {
                        var13_13 += var2_2;
                        var1_1 = 2;
                        continue;
                    }
                    break block20;
                    break;
                }
                var21_21 = new NoSuchElementException("Char sequence is empty.");
                throw var21_21;
            }
            var5_5 = var6_6.toString();
            Intrinsics.checkNotNull(var5_5);
        }
        return var5_5;
    }
}

