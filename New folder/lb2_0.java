/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 */
import com.clevertap.android.sdk.b;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/*
 * Renamed from lB2
 */
public final class lb2_0 {
    public final ha3_1 a;
    public final ea3_1 b;

    public lb2_0(ha3_1 ha3_12, ea3_1 ea3_12) {
        Intrinsics.checkNotNullParameter(ha3_12, "validator");
        Intrinsics.checkNotNullParameter(ea3_12, "validationResultStack");
        this.a = ha3_12;
        this.b = ea3_12;
    }

    public static lB2$a a(Number object) {
        Number number = object.intValue();
        boolean bl2 = Intrinsics.areEqual(object, number);
        if (bl2) {
            object = lB2$a.INT_NUMBER;
        } else {
            double d2 = object.doubleValue();
            number = d2;
            bl2 = Intrinsics.areEqual(object, number);
            if (bl2) {
                object = lB2$a.DOUBLE_NUMBER;
            } else {
                float f5 = object.floatValue();
                number = Float.valueOf(f5);
                boolean bl3 = Intrinsics.areEqual(object, number);
                if (bl3) {
                    object = lB2$a.FLOAT_NUMBER;
                } else {
                    bl3 = false;
                    object = null;
                }
            }
        }
        return object;
    }

    public static Number b(Number number, String string2, Number object) {
        Intrinsics.checkNotNullParameter(number, "value");
        String string3 = "command";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n3 = 2;
        int n4 = 1;
        int n7 = -1;
        String string4 = "$decr";
        String string5 = "$incr";
        Number number2 = null;
        if (object == null) {
            int n8;
            object = lb2_0.a(number);
            if (object != null) {
                int[] nArray = lB2$b.$EnumSwitchMapping$0;
                n8 = ((Enum)object).ordinal();
                n7 = nArray[n8];
            }
            if (n7 != n4) {
                if (n7 != n3) {
                    n8 = (int)(Intrinsics.areEqual(string2, string5) ? 1 : 0);
                    if (n8 != 0) {
                        int n10 = number.intValue();
                        number2 = n10;
                    } else {
                        boolean bl2 = Intrinsics.areEqual(string2, string4);
                        if (bl2) {
                            int n14 = -number.intValue();
                            number2 = n14;
                        }
                    }
                } else {
                    n8 = (int)(Intrinsics.areEqual(string2, string5) ? 1 : 0);
                    if (n8 != 0) {
                        float f5 = number.floatValue();
                        number2 = Float.valueOf(f5);
                    } else {
                        boolean bl3 = Intrinsics.areEqual(string2, string4);
                        if (bl3) {
                            float f6 = -number.floatValue();
                            number2 = Float.valueOf(f6);
                        }
                    }
                }
            } else {
                n8 = (int)(Intrinsics.areEqual(string2, string5) ? 1 : 0);
                if (n8 != 0) {
                    double d2 = number.doubleValue();
                    number2 = d2;
                } else {
                    boolean bl4 = Intrinsics.areEqual(string2, string4);
                    if (bl4) {
                        double d5 = -number.doubleValue();
                        number2 = d5;
                    }
                }
            }
            return number2;
        }
        lB2$a lB2$a = lb2_0.a(object);
        if (lB2$a != null) {
            int[] nArray = lB2$b.$EnumSwitchMapping$0;
            int n15 = lB2$a.ordinal();
            n7 = nArray[n15];
        }
        if (n7 != n4) {
            if (n7 != n3) {
                n3 = (int)(Intrinsics.areEqual(string2, string5) ? 1 : 0);
                if (n3 != 0) {
                    int n16 = object.intValue();
                    int n17 = number.intValue() + n16;
                    number2 = n17;
                } else {
                    int n18 = Intrinsics.areEqual(string2, string4);
                    if (n18 != 0) {
                        n18 = object.intValue();
                        int n19 = number.intValue();
                        number2 = n18 -= n19;
                    }
                }
            } else {
                n3 = (int)(Intrinsics.areEqual(string2, string5) ? 1 : 0);
                if (n3 != 0) {
                    float f7 = object.floatValue();
                    float f8 = number.floatValue() + f7;
                    number2 = Float.valueOf(f8);
                } else {
                    boolean bl5 = Intrinsics.areEqual(string2, string4);
                    if (bl5) {
                        float f11 = object.floatValue();
                        float f12 = number.floatValue();
                        number2 = Float.valueOf(f11 -= f12);
                    }
                }
            }
        } else {
            n3 = (int)(Intrinsics.areEqual(string2, string5) ? 1 : 0);
            if (n3 != 0) {
                double d7 = object.doubleValue();
                double d9 = number.doubleValue() + d7;
                number2 = d9;
            } else {
                boolean bl6 = Intrinsics.areEqual(string2, string4);
                if (bl6) {
                    double d12 = object.doubleValue();
                    double d13 = number.doubleValue();
                    number2 = d12 -= d13;
                }
            }
        }
        return number2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final JSONArray c(String var1_1, JSONArray var2_2, String var3_3, Object var4_4) {
        block66: {
            var5_5 /* !! */  = var1_1;
            var6_6 = var3_3;
            var7_7 = var4_4;
            Intrinsics.checkNotNullParameter(var1_1, "key");
            Intrinsics.checkNotNullParameter(var3_3, "command");
            var8_8 = "$remove";
            var9_9 = Intrinsics.areEqual(var3_3, var8_8);
            var10_10 = "$add";
            var11_11 = Intrinsics.areEqual(var3_3, var10_10);
            var12_12 = this.b;
            var13_13 = this.a;
            if (!var9_9 && var11_11 == 0) {
                var7_7 = new JSONArray();
            } else if (var7_7 == null) {
                if (var9_9) {
                    var14_14 = 0;
                    var7_7 = null;
                } else {
                    var7_7 = new JSONArray();
                }
            } else {
                var9_9 = var7_7 instanceof JSONArray;
                if (var9_9) {
                    var7_7 = (JSONArray)var7_7;
                } else {
                    if (var11_11 != 0) {
                        var15_15 = new JSONArray();
                    } else {
                        var9_9 = false;
                        var15_15 = null;
                    }
                    try {
                        var7_7 = var4_4.toString();
                    }
                    catch (Exception v0) {
                        var14_14 = 0;
                        var7_7 = null;
                    }
                    if (var7_7 != null) {
                        var13_13.getClass();
                        var7_7 = ha3_1.b((String)var7_7);
                        var11_11 = var7_7.a;
                        if (var11_11 != 0) {
                            var12_12.b((da3_1)var7_7);
                        }
                        if ((var7_7 = var7_7.c) != null) {
                            var7_7 = var7_7.toString();
                        } else {
                            var14_14 = 0;
                            var7_7 = null;
                        }
                    }
                    if (var7_7 != null) {
                        var15_15 = new JSONArray();
                        var7_7 = var15_15.put(var7_7);
                    } else {
                        var7_7 = var15_15;
                    }
                }
            }
            Intrinsics.checkNotNull(var2_2);
            var15_15 = new ArrayList();
            var11_11 = 0;
            var10_10 = null;
            var17_17 = null;
            block32: for (var16_16 = 0; var16_16 < (var18_18 = var2_2.length()); ++var16_16) {
                var19_19 = var2_2.get(var16_16);
                var15_15.add(var19_19);
lbl65:
                // 2 sources

                continue block32;
            }
            var17_17 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }";
            Intrinsics.checkNotNull(var15_15, var17_17);
            var16_16 = 512;
            var18_18 = 1;
            try {
                var19_19 = new JSONArray();
                var15_15 = var15_15.iterator();
            }
            catch (Throwable v1) {
                com.clevertap.android.sdk.b.l();
                var15_15 = zB1.a(new String[]{var1_1}, var16_16, var18_18);
                var12_12.b((da3_1)var15_15);
                com.clevertap.android.sdk.b.j();
                ** continue;
            }
            while (true) {
                var20_20 = var15_15.hasNext();
                if (var20_20 == 0) break block66;
                break;
            }
            {
                block68: {
                    block67: {
                        var21_21 = var15_15.next();
                        var21_21 = (String)var21_21;
                        var13_13.getClass();
                        var22_22 = ha3_1.b(var21_21);
                        var23_23 = "validator.cleanMultiValuePropertyValue(value)";
                        Intrinsics.checkNotNullExpressionValue(var22_22, (String)var23_23);
                        var24_24 = var22_22.a;
                        if (var24_24 == 0) ** GOTO lbl99
                        var12_12.b((da3_1)var22_22);
lbl99:
                        // 2 sources

                        if ((var22_22 = var22_22.c) == null) break block67;
                        var22_22 = var22_22.toString();
                    }
                    var25_25 = 0;
                    var22_22 = null;
                    var23_23 = "value";
                    Intrinsics.checkNotNullExpressionValue(var21_21, (String)var23_23);
                    var20_20 = var21_21.length();
                    if (var20_20 != 0) break block68;
                    var15_15 = new String[]{var1_1};
                    var15_15 = zB1.a((String[])var15_15, var16_16, var18_18);
                    var12_12.b((da3_1)var15_15);
                    com.clevertap.android.sdk.b.j();
lbl118:
                    // 2 sources

                    while (true) {
                        var19_19 = null;
                        break block66;
                        break;
                    }
                }
                var19_19.put(var22_22);
                continue;
            }
        }
        if (var7_7 != null && var19_19 != null) {
            var27_28 = Intrinsics.areEqual(var6_6, var8_8);
            var8_8 = "multiValuePropertyRemoveValues";
            var6_6 = var27_28 != 0 ? var8_8 : "multiValuePropertyAddValues";
            var13_13.getClass();
            var15_15 = new da3_1();
            var27_28 = var8_8.equals(var6_6);
            var8_8 = new JSONArray();
            var13_13 = new HashSet<E>();
            var16_16 = var7_7.length();
            var18_18 = var19_19.length();
            if (var27_28 == 0) {
                var25_25 = var16_16 + var18_18;
                var21_21 = new BitSet(var25_25);
            } else {
                var20_20 = 0;
                var21_21 = null;
            }
            var25_25 = ha3_1.e((JSONArray)var19_19, var13_13, (BitSet)var21_21, var16_16);
            var24_24 = 100;
            if (var27_28 == 0 && (var28_29 = var13_13.size()) < var24_24) {
                var11_11 = ha3_1.e((JSONArray)var7_7, var13_13, (BitSet)var21_21, 0);
            }
            block36: for (var28_29 = var11_11; var28_29 < var16_16; ++var28_29) {
                block69: {
                    if (var27_28 != 0) {
                        var23_23 = var29_30 = var7_7.get(var28_29);
                        var23_23 = (String)var29_30;
                        var30_31 = var13_13.contains(var23_23);
                        if (var30_31) break block69;
                        var8_8.put(var23_23);
                    }
                    var24_24 = (int)var21_21.get(var28_29);
                    if (var24_24 != 0) break block69;
                    var23_23 = var7_7.get(var28_29);
                    var8_8.put(var23_23);
                }
lbl171:
                // 2 sources

                while (true) {
                    var24_24 = 100;
                    continue block36;
                    break;
                }
            }
            if (var27_28 == 0 && (var27_28 = var8_8.length()) < (var14_14 = 100)) {
                block38: for (var27_28 = var25_25; var27_28 < var18_18; ++var27_28) {
                    block70: {
                        var14_14 = var27_28 + var16_16;
                        var14_14 = (int)var21_21.get(var14_14);
                        if (var14_14 != 0) break block70;
                        var7_7 = var19_19.get(var27_28);
                        var8_8.put(var7_7);
                    }
lbl186:
                    // 2 sources

                }
            }
            if (var25_25 > 0 || var11_11 > 0) {
                var6_6 = "100";
                var5_5 /* !! */  = new String[]{var5_5 /* !! */ , var6_6};
                var14_14 = 12;
                var5_5 /* !! */  = zB1.a((String[])var5_5 /* !! */ , 521, var14_14);
                var15_15.a = var27_28 = var5_5 /* !! */ .a;
                var5_5 /* !! */  = var5_5 /* !! */ .b;
                var15_15.b = var5_5 /* !! */ ;
            }
            var15_15.c = var8_8;
            var26_27 = var15_15.a;
            if (var26_27 != 0) {
                var12_12.b((da3_1)var15_15);
            }
            var5_5 /* !! */  = var15_15.c;
            var6_6 = "null cannot be cast to non-null type org.json.JSONArray";
            Intrinsics.checkNotNull(var5_5 /* !! */ , var6_6);
            var5_5 /* !! */  = var5_5 /* !! */ ;
            var27_28 = var5_5 /* !! */ .length();
            if (var27_28 <= 0) {
                var28_29 = 0;
                var31_32 = null;
            } else {
                var31_32 = var5_5 /* !! */ ;
            }
            return var31_32;
        }
        var26_26 = false;
        var5_5 /* !! */  = null;
        return null;
        catch (JSONException v2) {
            ** continue;
        }
        catch (Throwable v3) {}
        ** while (true)
        catch (Throwable v4) {
            ** continue;
        }
    }
}

