/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;

public final class MF3
implements vf3_0 {
    public final Xm2 a;
    public final HF3 b;

    public MF3() {
        Object object = new Xm2();
        this.a = object;
        this.b = object = new HF3();
    }

    public final /* synthetic */ lf3_0 a(int n3, byte[] byArray, int n4) {
        return uf3_0.a(this, byArray, n4);
    }

    /*
     * Unable to fully structure code
     */
    public final void b(byte[] var1_1, int var2_2, int var3_3, Vf3$b var4_4, n60_0 var5_5) {
        block61: {
            block62: {
                var6_6 = this;
                var7_8 = 2;
                var8_9 = 2.8E-45f;
                var9_10 = 0;
                var10_11 = null;
                var11_12 = -1;
                var12_13 = 1;
                var13_14 = var2_2 + var3_3;
                var14_15 = this.a;
                var15_16 = var1_1;
                var14_15.G(var13_14, var1_1);
                var14_15.I(var2_2);
                var16_17 = new ArrayList();
                try {
                    NF3.c(var14_15);
                }
                catch (ParserException var6_7) {
                    var16_17 = new IllegalArgumentException(var6_7);
                    throw var16_17;
                }
                do {
                    var17_18 = StandardCharsets.UTF_8;
                } while ((var13_14 = (int)TextUtils.isEmpty((CharSequence)(var17_18 = var14_15.j((Charset)var17_18)))) == 0);
                var17_18 = new ArrayList<JF3>();
                block13: while (true) {
                    var18_19 = -1;
                    var19_20 = 0;
                    var20_21 = null;
                    while (var18_19 == var11_12) {
                        var19_20 = var14_15.b;
                        var15_16 = StandardCharsets.UTF_8;
                        if ((var15_16 = (Object)var14_15.j((Charset)var15_16)) == null) {
                            var18_19 = 0;
                            var15_16 = null;
                            continue;
                        }
                        var21_22 = "STYLE";
                        var22_23 = var21_22.equals(var15_16);
                        if (var22_23) {
                            var18_19 = 2;
                            continue;
                        }
                        var21_22 = "NOTE";
                        var18_19 = (int)var15_16.startsWith((String)var21_22);
                        if (var18_19 != 0) {
                            var18_19 = 1;
                            continue;
                        }
                        var18_19 = 3;
                    }
                    var14_15.I(var19_20);
                    if (var18_19 == 0) break block61;
                    if (var18_19 == var12_13) {
                        while (true) {
                            var15_16 = StandardCharsets.UTF_8;
                            var18_19 = (int)TextUtils.isEmpty((CharSequence)(var15_16 = (Object)var14_15.j((Charset)var15_16)));
                            if (var18_19 != 0) continue block13;
                        }
                    }
                    if (var18_19 != var7_8) break block62;
                    var18_19 = (int)var17_18.isEmpty();
                    if (var18_19 == 0) break;
                    var15_16 = StandardCharsets.UTF_8;
                    var14_15.j((Charset)var15_16);
                    var15_16 = var6_6.b;
                    var21_22 = var15_16.b;
                    var21_22.setLength(0);
                    var23_24 = var14_15.b;
                    while (true) {
                        block65: {
                            var24_25 = StandardCharsets.UTF_8;
                            var25_26 = TextUtils.isEmpty((CharSequence)(var24_25 = var14_15.j((Charset)var24_25)));
                            if (var25_26 == 0) break block65;
                            var24_25 = var14_15.a;
                            var26_27 = var14_15.b;
                            var15_16 = var15_16.a;
                            var15_16.G(var26_27, (byte[])var24_25);
                            var15_16.I(var23_24);
                            var27_28 = new ArrayList<Object>();
                            while (true) {
                                block63: {
                                    HF3.c((Xm2)var15_16);
                                    var25_26 = var15_16.a();
                                    var28_29 = "{";
                                    var29_30 = "";
                                    var19_20 = 5;
                                    if (var25_26 < var19_20) lbl-1000:
                                    // 4 sources

                                    {
                                        while (true) {
                                            var19_20 = 0;
                                            var20_21 = null;
                                            break block63;
                                            break;
                                        }
                                    }
                                    var24_25 = StandardCharsets.UTF_8;
                                    var24_25 = "::cue";
                                    var20_21 = var15_16.u(var19_20, (Charset)var24_25);
                                    if ((var19_20 = (int)var24_25.equals(var20_21)) == 0) ** GOTO lbl-1000
                                    var19_20 = var15_16.b;
                                    var24_25 = HF3.b((Xm2)var15_16, (StringBuilder)var21_22);
                                    if (var24_25 == null) ** GOTO lbl-1000
                                    var30_31 = var28_29.equals(var24_25);
                                    if (var30_31 != 0) {
                                        var15_16.I(var19_20);
                                        var20_21 = var29_30;
                                    } else {
                                        var20_21 = "(";
                                        var19_20 = (int)var20_21.equals(var24_25);
                                        if (var19_20 != 0) {
                                            var19_20 = var15_16.b;
                                            var25_26 = var15_16.c;
                                            var30_31 = 0;
                                            while (var19_20 < var25_26 && var30_31 == 0) {
                                                var31_32 = var15_16.a;
                                                var30_31 = var19_20 + 1;
                                                var32_33 = 41;
                                                if ((var19_20 = (int)((char)var31_32[var19_20])) == var32_33) {
                                                    var19_20 = 1;
                                                } else {
                                                    var19_20 = 0;
                                                    var20_21 = null;
                                                }
                                                var33_34 = var30_31;
                                                var30_31 = var19_20;
                                                var19_20 = var33_34;
                                            }
                                            var19_20 += var11_12;
                                            var32_33 = var15_16.b;
                                            var31_32 = StandardCharsets.UTF_8;
                                            var20_21 = var15_16.u(var19_20 -= var32_33, (Charset)var31_32).trim();
                                        } else {
                                            var19_20 = 0;
                                            var20_21 = null;
                                        }
                                        if ((var32_33 = (var24_25 = ")").equals(var31_32 = HF3.b((Xm2)var15_16, (StringBuilder)var21_22))) != 0) ** break;
                                        ** continue;
                                    }
                                }
                                if (var20_21 == null || (var32_33 = var28_29.equals(var31_32 = HF3.b((Xm2)var15_16, (StringBuilder)var21_22))) == 0) break;
                                var31_32 = new IF3();
                                var25_26 = (int)var29_30.equals(var20_21);
                                if (var25_26 == 0) {
                                    var25_26 = var20_21.indexOf(91);
                                    if (var25_26 != var11_12) {
                                        var28_29 = HF3.c;
                                        var35_36 = var20_21.substring(var25_26);
                                        var26_27 = (int)(var35_36 = var28_29.matcher((CharSequence)var35_36)).matches();
                                        if (var26_27 != 0) {
                                            var35_36 = var35_36.group(var12_13);
                                            var35_36.getClass();
                                            var31_32.d = var35_36;
                                        }
                                        var20_21 = var20_21.substring(0, var25_26);
                                    }
                                    var7_8 = gz3.a;
                                    var35_36 = var20_21.split("\\.", var11_12);
                                    var25_26 = (var20_21 = var35_36[0]).indexOf(35);
                                    if (var25_26 != var11_12) {
                                        var31_32.b = var28_29 = var20_21.substring(0, var25_26);
                                        var20_21 = var20_21.substring(var25_26 += var12_13);
                                        var31_32.a = var20_21;
                                    } else {
                                        var31_32.b = var20_21;
                                    }
                                    var19_20 = ((Object)var35_36).length;
                                    if (var19_20 > var12_13) {
                                        var19_20 = ((Object)var35_36).length;
                                        var25_26 = ((Object)var35_36).length;
                                        if (var19_20 <= var25_26) {
                                            var25_26 = 1;
                                        } else {
                                            var25_26 = 0;
                                            var24_25 = null;
                                        }
                                        ct3.a((boolean)var25_26);
                                        var35_36 = (String[])Arrays.copyOfRange(var35_36, var12_13, var19_20);
                                        var35_36 = Arrays.asList(var35_36);
                                        var31_32.c = var20_21 = new Object(var35_36);
                                    }
                                }
                                var7_8 = 0;
                                var8_9 = 0.0f;
                                var35_36 = null;
                                var19_20 = 0;
                                var20_21 = null;
                                while (true) {
                                    block77: {
                                        block66: {
                                            block76: {
                                                block75: {
                                                    block74: {
                                                        block73: {
                                                            block72: {
                                                                block71: {
                                                                    block70: {
                                                                        block69: {
                                                                            block68: {
                                                                                block67: {
                                                                                    block64: {
                                                                                        var24_25 = "}";
                                                                                        if (var7_8 != 0) break;
                                                                                        var7_8 = var15_16.b;
                                                                                        var20_21 = HF3.b((Xm2)var15_16, (StringBuilder)var21_22);
                                                                                        if (var20_21 != null && (var26_27 = (int)var24_25.equals(var20_21)) == 0) {
                                                                                            var26_27 = 0;
                                                                                            var36_37 = 0.0f;
                                                                                            var28_29 = null;
                                                                                        } else {
                                                                                            var26_27 = 1;
                                                                                            var36_37 = 1.4E-45f;
                                                                                        }
                                                                                        if (var26_27 != 0) break block66;
                                                                                        var15_16.I(var7_8);
                                                                                        HF3.c((Xm2)var15_16);
                                                                                        var35_36 = HF3.a((Xm2)var15_16, (StringBuilder)var21_22);
                                                                                        var37_38 = var29_30.equals(var35_36);
                                                                                        if (var37_38 || (var9_10 = (int)(var10_11 = ":").equals(var38_39 = HF3.b((Xm2)var15_16, (StringBuilder)var21_22))) == 0) break block66;
                                                                                        HF3.c((Xm2)var15_16);
                                                                                        var10_11 = new StringBuilder();
                                                                                        var11_12 = 0;
                                                                                        var38_39 = null;
                                                                                        while (true) {
                                                                                            var39_40 = ";";
                                                                                            if (var11_12 != 0) break;
                                                                                            var34_35 = var15_16.b;
                                                                                            var3_3 = var11_12;
                                                                                            var38_39 = HF3.b((Xm2)var15_16, (StringBuilder)var21_22);
                                                                                            if (var38_39 == null) {
                                                                                                var34_35 = 0;
                                                                                                var6_6 = null;
                                                                                                break block64;
                                                                                            }
                                                                                            var40_41 = var24_25.equals(var38_39);
                                                                                            if (!var40_41 && (var12_13 = (int)var39_40.equals(var38_39)) == 0) {
                                                                                                var10_11.append(var38_39);
                                                                                                var6_6 = this;
                                                                                                continue;
                                                                                            }
                                                                                            var15_16.I(var34_35);
                                                                                            var11_12 = 1;
                                                                                            var6_6 = this;
                                                                                        }
                                                                                        var6_6 = var10_11.toString();
                                                                                    }
                                                                                    if (var6_6 == null || (var9_10 = (int)var29_30.equals(var6_6)) != 0) break block66;
                                                                                    var9_10 = var15_16.b;
                                                                                    var38_39 = HF3.b((Xm2)var15_16, (StringBuilder)var21_22);
                                                                                    var12_13 = (int)var39_40.equals(var38_39);
                                                                                    if (var12_13 != 0) break block67;
                                                                                    var11_12 = (int)var24_25.equals(var38_39);
                                                                                    if (var11_12 == 0) break block66;
                                                                                    var15_16.I(var9_10);
                                                                                }
                                                                                if ((var9_10 = (int)(var10_11 = "color").equals(var35_36)) == 0) break block68;
                                                                                var9_10 = 1;
                                                                                var31_32.f = var34_35 = fy_1.a((String)var6_6, (boolean)var9_10);
                                                                                var31_32.g = var9_10;
                                                                                break block66;
                                                                            }
                                                                            var9_10 = 1;
                                                                            var38_39 = "background-color";
                                                                            var11_12 = (int)var38_39.equals(var35_36);
                                                                            if (var11_12 == 0) break block69;
                                                                            var31_32.h = var34_35 = fy_1.a((String)var6_6, (boolean)var9_10);
                                                                            var31_32.i = var9_10;
                                                                            break block66;
                                                                        }
                                                                        var38_39 = "ruby-position";
                                                                        var11_12 = (int)var38_39.equals(var35_36);
                                                                        if (var11_12 == 0) break block70;
                                                                        var35_36 = "over";
                                                                        var7_8 = (int)var35_36.equals(var6_6);
                                                                        if (var7_8 != 0) {
                                                                            var31_32.p = var9_10;
                                                                        } else {
                                                                            var35_36 = "under";
                                                                            var34_35 = (int)var35_36.equals(var6_6);
                                                                            if (var34_35 != 0) {
                                                                                var31_32.p = var34_35 = 2;
                                                                            }
                                                                        }
                                                                        break block66;
                                                                    }
                                                                    var10_11 = "text-combine-upright";
                                                                    var9_10 = var10_11.equals(var35_36);
                                                                    if (var9_10 == 0) break block71;
                                                                    var35_36 = "all";
                                                                    var7_8 = (int)var35_36.equals(var6_6);
                                                                    if (var7_8 == 0 && (var34_35 = (int)var6_6.startsWith((String)(var35_36 = "digits"))) == 0) {
                                                                        var34_35 = 0;
                                                                        var6_6 = null;
                                                                    } else {
                                                                        var34_35 = 1;
                                                                    }
                                                                    var31_32.q = var34_35;
                                                                    break block66;
                                                                }
                                                                var10_11 = "text-decoration";
                                                                var9_10 = var10_11.equals(var35_36);
                                                                if (var9_10 == 0) break block72;
                                                                var35_36 = "underline";
                                                                var34_35 = (int)var35_36.equals(var6_6);
                                                                if (var34_35 != 0) {
                                                                    var31_32.k = var34_35 = 1;
                                                                }
                                                                break block66;
                                                            }
                                                            var10_11 = "font-family";
                                                            var9_10 = var10_11.equals(var35_36);
                                                            if (var9_10 == 0) break block73;
                                                            var31_32.e = var6_6 = Ascii.toLowerCase((String)var6_6);
                                                            break block66;
                                                        }
                                                        var10_11 = "font-weight";
                                                        var9_10 = var10_11.equals(var35_36);
                                                        if (var9_10 == 0) break block74;
                                                        var35_36 = "bold";
                                                        var34_35 = (int)var35_36.equals(var6_6);
                                                        if (var34_35 != 0) {
                                                            var9_10 = 1;
                                                            var31_32.l = var9_10;
                                                        }
                                                        break block66;
                                                    }
                                                    var9_10 = 1;
                                                    var38_39 = "font-style";
                                                    var11_12 = (int)var38_39.equals(var35_36);
                                                    if (var11_12 == 0) break block75;
                                                    var35_36 = "italic";
                                                    var34_35 = (int)var35_36.equals(var6_6);
                                                    if (var34_35 != 0) {
                                                        var31_32.m = var9_10;
                                                    }
                                                    break block66;
                                                }
                                                var10_11 = "font-size";
                                                var7_8 = (int)var10_11.equals(var35_36);
                                                if (var7_8 == 0) break block66;
                                                var35_36 = HF3.d;
                                                var10_11 = Ascii.toLowerCase((String)var6_6);
                                                var9_10 = (var35_36 = var35_36.matcher(var10_11)).matches();
                                                if (var9_10 == 0) break block76;
                                                var10_11 = var35_36.group(2);
                                                var10_11.getClass();
                                                var34_35 = var10_11.hashCode();
                                                switch (var34_35) lbl-1000:
                                                // 4 sources

                                                {
                                                    default: {
                                                        var9_10 = -1;
                                                        break;
                                                    }
                                                    case 3592: {
                                                        var6_6 = "px";
                                                        var34_35 = (int)var10_11.equals(var6_6);
                                                        if (var34_35 == 0) ** GOTO lbl-1000
                                                        var9_10 = 2;
                                                        break;
                                                    }
                                                    case 3240: {
                                                        var6_6 = "em";
                                                        var34_35 = (int)var10_11.equals(var6_6);
                                                        if (var34_35 == 0) ** GOTO lbl-1000
                                                        var9_10 = 1;
                                                        break;
                                                    }
                                                    case 37: {
                                                        var6_6 = "%";
                                                        var34_35 = (int)var10_11.equals(var6_6);
                                                        if (var34_35 == 0) ** GOTO lbl-1000
                                                        var9_10 = 0;
                                                        var10_11 = null;
                                                    }
                                                }
                                                switch (var9_10) {
                                                    default: {
                                                        var16_17 = new IllegalStateException();
                                                        throw var16_17;
                                                    }
                                                    case 2: {
                                                        var31_32.n = var34_35 = 1;
                                                        var9_10 = 2;
                                                        break;
                                                    }
                                                    case 1: {
                                                        var34_35 = 1;
                                                        var31_32.n = var9_10 = 2;
                                                        break;
                                                    }
                                                    case 0: {
                                                        var34_35 = 1;
                                                        var9_10 = 2;
                                                        var31_32.n = var11_12 = 3;
                                                    }
                                                }
                                                var35_36 = var35_36.group(var34_35);
                                                var35_36.getClass();
                                                var31_32.o = var8_9 = Float.parseFloat((String)var35_36);
                                                break block77;
                                            }
                                            var10_11 = "Invalid font-size: '";
                                            var35_36 = new StringBuilder((String)var10_11);
                                            var35_36.append((String)var6_6);
                                            var35_36.append("'.");
                                            var6_6 = var35_36.toString();
                                            Cx.f((String)var6_6);
                                        }
                                        var34_35 = 1;
                                        var9_10 = 2;
                                    }
                                    var6_6 = this;
                                    var7_8 = var26_27;
                                    var8_9 = var36_37;
                                    var9_10 = 0;
                                    var10_11 = null;
                                    var11_12 = -1;
                                    var12_13 = 1;
                                }
                                var34_35 = 1;
                                var9_10 = 2;
                                var7_8 = (int)var24_25.equals(var20_21);
                                if (var7_8 != 0) {
                                    var27_28.add(var31_32);
                                }
                                var6_6 = this;
                                var7_8 = 2;
                                var8_9 = 2.8E-45f;
                                var9_10 = 0;
                                var10_11 = null;
                                var11_12 = -1;
                                var12_13 = 1;
                            }
                            var34_35 = 1;
                            var9_10 = 2;
                            var16_17.addAll(var27_28);
lbl387:
                            // 4 sources

                            while (true) {
                                var6_6 = this;
                                var7_8 = 2;
                                var8_9 = 2.8E-45f;
                                var9_10 = 0;
                                var10_11 = null;
                                var11_12 = -1;
                                var12_13 = 1;
                                continue block13;
                                break;
                            }
                        }
                        var6_6 = this;
                    }
                    break;
                }
                var16_17 = new IllegalArgumentException("A style block was found after the first cue.");
                throw var16_17;
            }
            var34_35 = 1;
            var7_8 = 3;
            var8_9 = 4.2E-45f;
            var9_10 = 2;
            if (var18_19 != var7_8) ** GOTO lbl387
            var35_36 = LF3.a;
            var35_36 = StandardCharsets.UTF_8;
            var38_39 = var14_15.j((Charset)var35_36);
            if (var38_39 == null) {
                var19_20 = 0;
                var20_21 = null;
            } else {
                var39_40 = LF3.a;
                var15_16 = var39_40.matcher(var38_39);
                var19_20 = (int)var15_16.matches();
                if (var19_20 != 0) {
                    var19_20 = 0;
                    var20_21 = LF3.d(null, (Matcher)var15_16, var14_15, (ArrayList)var16_17);
                } else {
                    var19_20 = 0;
                    var20_21 = null;
                    if ((var35_36 = var14_15.j((Charset)var35_36)) != null && (var12_13 = (int)(var35_36 = var39_40.matcher((CharSequence)var35_36)).matches()) != 0) {
                        var38_39 = var38_39.trim();
                        var20_21 = LF3.d(var38_39, (Matcher)var35_36, var14_15, (ArrayList)var16_17);
                    }
                }
            }
            if (var20_21 == null) ** GOTO lbl387
            var17_18.add((JF3)var20_21);
            ** while (true)
        }
        var16_17 = new PF3(var17_18);
        var6_6 = var4_4;
        var35_36 = var5_5;
        Ut1.b((lf3_0)var16_17, var4_4, var5_5);
        return;
    }

    public final int c() {
        return 1;
    }

    public final /* synthetic */ void reset() {
    }
}

