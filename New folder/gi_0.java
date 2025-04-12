/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Path
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 *  android.text.Layout
 *  android.text.Spannable
 *  android.text.SpannableString
 *  android.text.Spanned
 *  android.text.TextPaint
 *  android.text.TextUtils$TruncateAt
 */
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gi
 */
public final class gi_0
implements sm2 {
    public final ii a;
    public final int b;
    public final long c;
    public final Ql3 d;
    public final CharSequence e;
    public final List f;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gi_0(ii var1_1, int var2_2, boolean var3_3, long var4_4) {
        block65: {
            block66: {
                block68: {
                    block67: {
                        var6_5 = this;
                        var7_6 = var1_1;
                        var8_7 = var2_2;
                        super();
                        this.a = var1_1;
                        this.b = var2_2;
                        this.c = var4_4;
                        var9_8 = c60.j(var4_4);
                        if (var9_8 != 0 || (var9_8 = c60.k(var4_4)) != 0) break block65;
                        var10_9 = 1;
                        if (var2_2 < var10_9) break block66;
                        var11_10 = var1_1.b;
                        var7_6 = var1_1.h;
                        var9_8 = 5;
                        var12_11 = 7.0E-45f;
                        var13_12 = 4;
                        var14_13 = 5.6E-45f;
                        if (var3_3) {
                            var15_14 = var11_10.a;
                            var16_15 = var15_14.h;
                            var18_16 = Em3.f(0);
                            var20_17 = Dm3.a(var16_15, var18_16);
                            if (var20_17 == 0) {
                                var15_14 = var11_10.a;
                                var16_15 = var15_14.h;
                                var18_16 = Dm3.c;
                                var20_17 = Dm3.a(var16_15, var18_16);
                                if (var20_17 == 0) {
                                    var15_14 = var11_10.b;
                                    var21_18 = var15_14.a;
                                    var22_19 = -1 << -1;
                                    var23_20 = -0.0f;
                                    if ((var21_18 = (int)Cj3.a(var21_18, var22_19)) == 0 && (var21_18 = (int)Cj3.a(var20_17 = var15_14.a, var9_8)) == 0 && (var20_17 = (int)Cj3.a(var20_17, var13_12)) == 0 && (var20_17 = var7_6.length()) != 0) {
                                        var20_17 = var7_6 instanceof Spannable;
                                        var7_6 = var20_17 != 0 ? (Spannable)var7_6 : (var15_14 = new SpannableString((CharSequence)var7_6));
                                        var15_14 = new Object();
                                        var21_18 = var7_6.length() - var10_9;
                                        var22_19 = var7_6.length() - var10_9;
                                        var24_21 = 33;
                                        var25_22 = 4.6E-44f;
                                        var7_6.setSpan(var15_14, var21_18, var22_19, var24_21);
                                    }
                                }
                            }
                        }
                        var6_5.e = var7_6;
                        var7_6 = var11_10.b;
                        var26_23 = var7_6.a;
                        var20_17 = Cj3.a(var26_23, var10_9);
                        var21_18 = 3;
                        var27_24 = 4.2E-45f;
                        var28_25 = 2;
                        var29_26 = 2.8E-45f;
                        if (var20_17 != 0) {
                            var30_27 = 3;
                            var31_28 = 4.2E-45f;
                        } else {
                            var20_17 = Cj3.a(var26_23, var28_25);
                            if (var20_17 != 0) {
                                var30_27 = 4;
                                var31_28 = 5.6E-45f;
                            } else {
                                var20_17 = Cj3.a(var26_23, var21_18);
                                if (var20_17 != 0) {
                                    var30_27 = 2;
                                    var31_28 = 2.8E-45f;
                                } else if ((var9_8 = (int)Cj3.a(var26_23, var9_8)) != 0) {
                                    while (true) {
                                        var30_27 = 0;
                                        var31_28 = 0.0f;
                                        break;
                                    }
                                } else {
                                    var9_8 = 6;
                                    var12_11 = 8.4E-45f;
                                    if ((var26_23 = (int)Cj3.a(var26_23, var9_8)) == 0) ** continue;
                                    var30_27 = 1;
                                    var31_28 = 1.4E-45f;
                                }
                            }
                        }
                        var7_6 = var11_10.b;
                        var32_29 = Cj3.a(var7_6.a, var13_12);
                        var9_8 = (int)gc1_1.a(var7_6.h, var28_25);
                        if (var9_8 != 0) {
                            var9_8 = Build.VERSION.SDK_INT;
                            var20_17 = 32;
                            var33_30 = 4.5E-44f;
                            if (var9_8 <= var20_17) {
                                var34_31 = 2;
                                var35_32 = 2.8E-45f;
                            } else {
                                var34_31 = 4;
                                var35_32 = 5.6E-45f;
                            }
                        } else {
                            var34_31 = 0;
                            var35_32 = 0.0f;
                        }
                        var26_23 = var7_6.g;
                        var9_8 = var26_23 & 255;
                        var20_17 = (int)wu1$a_0.a(var9_8, var10_9);
                        if (var20_17 != 0) {
                            while (true) {
                                var36_33 = 0;
                                var37_34 = 0.0f;
                                break;
                            }
                        } else {
                            var20_17 = (int)wu1$a_0.a(var9_8, var28_25);
                            if (var20_17 != 0) {
                                var36_33 = 1;
                                var37_34 = 1.4E-45f;
                            } else {
                                if ((var9_8 = (int)wu1$a_0.a(var9_8, var21_18)) == 0) ** continue;
                                var36_33 = 2;
                                var37_34 = 2.8E-45f;
                            }
                        }
                        var9_8 = var26_23 >> 8 & 255;
                        var20_17 = (int)wu1$b.a(var9_8, var10_9);
                        if (var20_17 != 0) {
                            while (true) {
                                var38_35 = 0;
                                var39_36 = 0.0f;
                                break;
                            }
                        } else {
                            var20_17 = (int)wu1$b.a(var9_8, var28_25);
                            if (var20_17 != 0) {
                                var38_35 = 1;
                                var39_36 = 1.4E-45f;
                            } else {
                                var20_17 = (int)wu1$b.a(var9_8, var21_18);
                                if (var20_17 != 0) {
                                    var38_35 = 2;
                                    var39_36 = 2.8E-45f;
                                } else {
                                    if ((var9_8 = (int)wu1$b.a(var9_8, var13_12)) == 0) ** continue;
                                    var38_35 = 3;
                                    var39_36 = 4.2E-45f;
                                }
                            }
                        }
                        var26_23 = var26_23 >> 16 & 255;
                        if (var26_23 == var10_9) {
                            while (true) {
                                var40_37 = 0;
                                var41_38 = 0.0f;
                                break;
                            }
                        } else {
                            if (var26_23 != var28_25) ** continue;
                            var40_37 = 1;
                            var41_38 = 1.4E-45f;
                        }
                        var42_39 = var3_3 != false ? (var7_6 = TextUtils.TruncateAt.END) : null;
                        var7_6 = this;
                        var9_8 = var30_27;
                        var12_11 = var31_28;
                        var13_12 = var32_29;
                        var15_14 = var42_39;
                        var21_18 = var2_2;
                        var22_19 = var34_31;
                        var23_20 = var35_32;
                        var24_21 = var36_33;
                        var25_22 = var37_34;
                        var43_40 = var38_35;
                        var44_41 = var39_36;
                        var28_25 = var40_37;
                        var29_26 = var41_38;
                        var7_6 = this.x(var30_27, var32_29, (TextUtils.TruncateAt)var42_39, var2_2, var34_31, var36_33, var38_35, var40_37);
                        if (var3_3 && (var9_8 = var7_6.a()) > (var13_12 = c60.h(var4_4)) && var8_7 > var10_9) {
                            block64: {
                                var9_8 = c60.h(var4_4);
                                var14_13 = 0.0f;
                                var45_42 = null;
                                for (var13_12 = 0; var13_12 < (var20_17 = var7_6.g); ++var13_12) {
                                    var33_30 = var7_6.e(var13_12);
                                    cfr_temp_0 = var33_30 - (var27_24 = (float)var9_8);
                                    var20_17 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                    if (var20_17 <= 0) {
                                        continue;
                                    }
                                    break block64;
                                }
                                var13_12 = var20_17;
                            }
                            if (var13_12 >= 0 && var13_12 != (var9_8 = var6_5.b)) {
                                if (var13_12 < var10_9) {
                                    var21_18 = 1;
                                    var27_24 = 1.4E-45f;
                                } else {
                                    var21_18 = var13_12;
                                }
                                var7_6 = this;
                                var9_8 = var30_27;
                                var12_11 = var31_28;
                                var13_12 = var32_29;
                                var15_14 = var42_39;
                                var22_19 = var34_31;
                                var23_20 = var35_32;
                                var24_21 = var36_33;
                                var25_22 = var37_34;
                                var43_40 = var38_35;
                                var44_41 = var39_36;
                                var28_25 = var40_37;
                                var29_26 = var41_38;
                                var7_6 = this.x(var30_27, var32_29, (TextUtils.TruncateAt)var42_39, var21_18, var34_31, var36_33, var38_35, var40_37);
                            }
                            var6_5.d = var7_6;
                        } else {
                            var6_5.d = var7_6;
                        }
                        var7_6 = var6_5.a.g;
                        var46_43 = var11_10.a;
                        var45_42 = var46_43.a.d();
                        var33_30 = this.getWidth();
                        var27_24 = this.getHeight();
                        var16_15 = bo1_1.a(var33_30, var27_24);
                        var12_11 = var46_43.a.getAlpha();
                        var7_6.c((ZD)var45_42, var16_15, var12_11);
                        var7_6 = var6_5.d;
                        var46_43 = var7_6.f.getText();
                        var9_8 = var46_43 instanceof Spanned;
                        if (var9_8 == 0) {
                            while (true) {
                                var26_23 = 0;
                                var7_6 = null;
                                break;
                            }
                        } else {
                            var7_6 = var7_6.f;
                            var46_43 = var7_6.getText();
                            var45_42 = "null cannot be cast to non-null type android.text.Spanned";
                            Intrinsics.checkNotNull(var46_43, (String)var45_42);
                            var46_43 = (Spanned)var46_43;
                            var20_17 = var46_43.length();
                            var21_18 = -1;
                            var27_24 = 0.0f / 0.0f;
                            if ((var20_17 = var46_43.nextSpanTransition(var21_18, var20_17, var47_46 = a13_0.class)) == (var9_8 = var46_43.length())) ** continue;
                            var46_43 = var7_6.getText();
                            Intrinsics.checkNotNull(var46_43, var45_42);
                            var46_43 = (Spanned)var46_43;
                            var26_23 = var7_6.getText().length();
                            var7_6 = (a13_0[])var46_43.getSpans(0, var26_23, var47_46);
                        }
                        if (var7_6 != null) {
                            var7_6 = ArrayIteratorKt.iterator((Object[])var7_6);
                            while ((var9_8 = (int)var7_6.hasNext()) != 0) {
                                var46_43 = (a13_0)var7_6.next();
                                var14_13 = this.getWidth();
                                var33_30 = this.getHeight();
                                var48_47 = bo1_1.a(var14_13, var33_30);
                                var46_43 = var46_43.c;
                                var50_48 = new C63(var48_47);
                                var46_43.setValue(var50_48);
                            }
                        }
                        if ((var9_8 = (var7_6 = var6_5.e) instanceof Spanned) != 0) break block67;
                        var7_6 = mz0_2.a;
                        break block68;
                    }
                    var46_43 = var7_6;
                    var46_43 = (Spanned)var7_6;
                    var26_23 = ((CharSequence)var7_6).length();
                    var7_6 = var46_43.getSpans(0, var26_23, ws2_0.class);
                    var20_17 = ((Object)var7_6).length;
                    var45_42 = new ArrayList<Layout>(var20_17);
                    var20_17 = ((Object)var7_6).length;
                    var27_24 = 0.0f;
                    var50_48 = null;
                    for (var21_18 = 0; var21_18 < var20_17; ++var21_18) {
                        block70: {
                            block69: {
                                var47_46 = (ws2_0)var7_6[var21_18];
                                var24_21 = var46_43.getSpanStart(var47_46);
                                var43_40 = var46_43.getSpanEnd(var47_46);
                                var51_49 = var6_5.d.f;
                                var28_25 = var51_49.getLineForOffset(var24_21);
                                if (var28_25 >= (var8_7 = var6_5.b)) {
                                    var8_7 = 1;
                                } else {
                                    var8_7 = 0;
                                    var52_50 = null;
                                }
                                var53_51 = var6_5.d.f;
                                var54_52 = var53_51.getEllipsisCount(var28_25);
                                if (var54_52 > 0 && var43_40 > (var54_52 = (var53_51 = var6_5.d.f).getEllipsisStart(var28_25))) {
                                    var54_52 = 1;
                                    var55_53 = 1.4E-45f;
                                } else {
                                    var54_52 = 0;
                                    var55_53 = 0.0f;
                                    var53_51 = null;
                                }
                                var56_54 = var6_5.d;
                                var57_55 = var56_54.f(var28_25);
                                if (var43_40 > var57_55) {
                                    var43_40 = 1;
                                    var44_41 = 1.4E-45f;
                                } else {
                                    var43_40 = 0;
                                    var44_41 = 0.0f;
                                    var58_56 = null;
                                }
                                if (var54_52 != 0 || var43_40 != 0 || var8_7 != 0) break block69;
                                var58_56 = var6_5.t(var24_21);
                                var52_50 = gi$a.$EnumSwitchMapping$0;
                                var43_40 = var58_56.ordinal();
                                if ((var43_40 = var52_50[var43_40]) == var10_9) ** GOTO lbl284
                                var8_7 = 2;
                                if (var43_40 == var8_7) {
                                    var25_22 = var6_5.l(var24_21, (boolean)var10_9);
                                    var43_40 = var47_46.c();
                                    var44_41 = var43_40;
                                    var25_22 -= var44_41;
                                } else {
                                    var7_6 = new NoWhenBranchMatchedException();
                                    throw var7_6;
lbl284:
                                    // 1 sources

                                    var8_7 = 2;
                                    var25_22 = var6_5.l(var24_21, (boolean)var10_9);
                                }
                                var43_40 = var47_46.c();
                                var44_41 = (float)var43_40 + var25_22;
                                var53_51 = var6_5.d;
                                var57_55 = var47_46.f;
                                block0 : switch (var57_55) {
                                    default: {
                                        var7_6 = new IllegalStateException("unexpected verticalAlignment");
                                        throw var7_6;
                                    }
                                    case 6: {
                                        var56_54 = var47_46.a();
                                        var59_57 = var56_54.ascent;
                                        var57_55 = var56_54.descent;
                                        var59_57 += var57_55;
                                        var57_55 = var47_46.b();
                                        var59_57 = (var59_57 - var57_55) / var8_7;
                                        var60_58 = var59_57;
                                        var29_26 = var53_51.d(var28_25);
lbl303:
                                        // 2 sources

                                        while (true) {
                                            var29_26 += var60_58;
                                            break block0;
                                            break;
                                        }
                                    }
                                    case 5: {
                                        var56_54 = var47_46.a();
                                        var57_55 = var56_54.descent;
                                        var60_58 = var57_55;
                                        var29_26 = var53_51.d(var28_25) + var60_58;
                                        var54_52 = var47_46.b();
lbl312:
                                        // 3 sources

                                        while (true) {
                                            var55_53 = var54_52;
                                            var29_26 -= var55_53;
                                            break block0;
                                            break;
                                        }
                                    }
                                    case 4: {
                                        var56_54 = var47_46.a();
                                        var57_55 = var56_54.ascent;
                                        var60_58 = var57_55;
                                        var29_26 = var53_51.d(var28_25);
                                        ** continue;
                                    }
                                    case 3: {
                                        var60_58 = var53_51.g(var28_25);
                                        var29_26 = var53_51.e(var28_25) + var60_58;
                                        var54_52 = var47_46.b();
                                        var55_53 = var54_52;
                                        var29_26 -= var55_53;
                                        var55_53 = var8_7;
                                        var29_26 /= var55_53;
                                        break;
                                    }
                                    case 2: {
                                        var29_26 = var53_51.e(var28_25);
                                        var54_52 = var47_46.b();
                                        ** GOTO lbl312
                                    }
                                    case 1: {
                                        var29_26 = var53_51.g(var28_25);
                                        break;
                                    }
                                    case 0: {
                                        var29_26 = var53_51.d(var28_25);
                                        var54_52 = var47_46.b();
                                        ** continue;
                                    }
                                }
                                var22_19 = var47_46.b();
                                var23_20 = (float)var22_19 + var29_26;
                                var53_51 = new aG2(var25_22, var29_26, var44_41, var23_20);
                                break block70;
                            }
                            var8_7 = 2;
                            var54_52 = 0;
                            var53_51 = null;
                            var55_53 = 0.0f;
                        }
                        var45_42.add((Layout)var53_51);
                    }
                    var7_6 = var45_42;
                }
                var6_5.f = var7_6;
                return;
            }
            var46_44 = "maxLines should be greater than 0".toString();
            var7_6 = new IllegalArgumentException(var46_44);
            throw var7_6;
        }
        var46_45 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString();
        var7_6 = new IllegalArgumentException(var46_45);
        throw var7_6;
    }

    public final uk2_0 a(int n3) {
        int n4;
        Ql3 ql3 = this.d;
        Layout layout2 = ql3.f;
        n3 = layout2.getLineForOffset(n3);
        ql3 = ql3.f;
        uk2_0 uk2_02 = (n3 = ql3.getParagraphDirection(n3)) == (n4 = 1) ? uk2_0.Ltr : uk2_0.Rtl;
        return uk2_02;
    }

    public final float b(int n3) {
        return this.d.g(n3);
    }

    public final aG2 c(int n3) {
        int n4;
        Object object = this.e;
        if (n3 >= 0 && n3 <= (n4 = object.length())) {
            Ql3 ql3 = this.d;
            float f5 = ql3.h(n3, false);
            n3 = ql3.f.getLineForOffset(n3);
            float f6 = ql3.g(n3);
            float f7 = ql3.e(n3);
            aG2 aG22 = new aG2(f5, f6, f5, f7);
            return aG22;
        }
        CharSequence charSequence = wk0_0.a(n3, "offset(", ") is out of bounds [0,");
        int n7 = object.length();
        ((StringBuilder)charSequence).append(n7);
        ((StringBuilder)charSequence).append(']');
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = ((Object)charSequence).toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    /*
     * Unable to fully structure code
     */
    public final long d(int var1_1) {
        var2_2 = this.d.j();
        var2_2.a(var1_1);
        var3_3 = var2_2.d;
        var4_4 = var3_3.preceding(var1_1);
        var4_4 = (int)var2_2.e(var4_4);
        var5_5 = -1;
        if (var4_4 != 0) {
            var2_2.a(var1_1);
            var4_4 = var1_1;
            while (var4_4 != var5_5 && ((var6_6 = var2_2.e(var4_4)) == 0 || (var6_6 = var2_2.c(var4_4)) != 0)) {
                var2_2.a(var4_4);
                var4_4 = var3_3.preceding(var4_4);
            }
        } else {
            var2_2.a(var1_1);
            var4_4 = (int)var2_2.d(var1_1);
            var4_4 = var4_4 != 0 ? ((var4_4 = (int)var3_3.isBoundary(var1_1)) != 0 && (var4_4 = (int)var2_2.b(var1_1)) == 0 ? var1_1 : var3_3.preceding(var1_1)) : ((var4_4 = (int)var2_2.b(var1_1)) != 0 ? var3_3.preceding(var1_1) : -1);
        }
        if (var4_4 == var5_5) {
            var4_4 = var1_1;
        }
        var2_2.a(var1_1);
        var6_6 = var3_3.following(var1_1);
        var6_6 = (int)var2_2.c(var6_6);
        if (var6_6 != 0) {
            var2_2.a(var1_1);
            var6_6 = var1_1;
            while (var6_6 != var5_5 && ((var7_7 = var2_2.e(var6_6)) || !(var7_7 = var2_2.c(var6_6)))) {
                var2_2.a(var6_6);
                var6_6 = var3_3.following(var6_6);
            }
        } else {
            var2_2.a(var1_1);
            var6_6 = (int)var2_2.b(var1_1);
            if (var6_6 != 0) {
                var6_6 = (int)var3_3.isBoundary(var1_1);
                var8_8 = var6_6 != 0 && (var8_8 = var2_2.d(var1_1)) == 0 ? var1_1 : var3_3.following(var1_1);
lbl36:
                // 2 sources

                while (true) {
                    var6_6 = var8_8;
                    break;
                }
            } else {
                var8_8 = var2_2.d(var1_1);
                if (var8_8 != 0) {
                    var8_8 = var3_3.following(var1_1);
                    ** continue;
                }
                var6_6 = -1;
            }
        }
        if (var6_6 != var5_5) {
            var1_1 = var6_6;
        }
        return nm3.a(var4_4, var1_1);
    }

    public final float e() {
        return this.d.d(0);
    }

    public final int f(long l2) {
        int n3 = (int)e72.e(l2);
        Ql3 ql3 = this.d;
        int n4 = ql3.h;
        n3 -= n4;
        Layout layout2 = ql3.f;
        n3 = layout2.getLineForVertical(n3);
        float f5 = e72.d(l2);
        float f6 = -1;
        float f7 = ql3.b(n3) * f6 + f5;
        return layout2.getOffsetForHorizontal(n3, f7);
    }

    public final int g(int n3) {
        return this.d.f.getLineStart(n3);
    }

    public final float getHeight() {
        return this.d.a();
    }

    public final float getWidth() {
        return c60.i(this.c);
    }

    public final int h(int n3, boolean bl2) {
        Ql3 ql3 = this.d;
        if (bl2) {
            Object object = ql3.f;
            int n4 = object.getEllipsisStart(n3);
            if (n4 == 0) {
                object = ql3.c();
                ql3 = ((cp1_0)object).a;
                n4 = ql3.getLineEnd(n3);
                n3 = ql3.getLineStart(n3);
                n3 = ((cp1_0)object).f(n4, n3);
            } else {
                int n7 = object.getLineStart(n3);
                n3 = object.getEllipsisStart(n3) + n7;
            }
        } else {
            n3 = ql3.f(n3);
        }
        return n3;
    }

    public final float i(int n3) {
        float f5;
        Ql3 ql3 = this.d;
        Layout layout2 = ql3.f;
        float f6 = layout2.getLineRight(n3);
        int n4 = ql3.g + -1;
        if (n3 == n4) {
            f5 = ql3.k;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        return f6 + f5;
    }

    public final int j(float f5) {
        int n3 = (int)f5;
        Ql3 ql3 = this.d;
        int n4 = ql3.h;
        return ql3.f.getLineForVertical(n3 -= n4);
    }

    public final ki k(int n3, int n4) {
        int n7;
        CharSequence charSequence = this.e;
        if (n3 >= 0 && n3 <= n4 && n4 <= (n7 = charSequence.length())) {
            charSequence = new Path();
            Ql3 ql3 = this.d;
            Layout layout2 = ql3.f;
            layout2.getSelectionPath(n3, n4, (Path)charSequence);
            n3 = ql3.h;
            if (n3 != 0 && (n4 = (int)(charSequence.isEmpty() ? 1 : 0)) == 0) {
                n4 = 0;
                Object var7_7 = null;
                float f5 = n3;
                charSequence.offset(0.0f, f5);
            }
            ki ki2 = new ki((Path)charSequence);
            return ki2;
        }
        CharSequence charSequence2 = fQ2.a("start(", ") or end(", ") is out of range [0..", n3, n4);
        n4 = charSequence.length();
        ((StringBuilder)charSequence2).append(n4);
        ((StringBuilder)charSequence2).append("], or start > end!");
        charSequence2 = ((StringBuilder)charSequence2).toString();
        charSequence2 = ((Object)charSequence2).toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence2);
        throw illegalArgumentException;
    }

    public final float l(int n3, boolean bl2) {
        Ql3 ql3 = this.d;
        float f5 = bl2 ? ql3.h(n3, false) : ql3.i(n3, false);
        return f5;
    }

    public final void m(iL iL2, ZD zD, float f5, b13_0 b13_02, Jj3 jj3, Qt0 qt0, int n3) {
        ii ii2 = this.a;
        kj_0 kj_02 = ii2.g;
        int n4 = kj_02.c;
        float f6 = this.getWidth();
        float f7 = this.getHeight();
        long l2 = bo1_1.a(f6, f7);
        kj_02.c(zD, l2, f5);
        kj_02.f(b13_02);
        kj_02.g(jj3);
        kj_02.e(qt0);
        kj_02.b(n3);
        this.z(iL2);
        ii2.g.b(n4);
    }

    public final float n(int n3) {
        float f5;
        Ql3 ql3 = this.d;
        Layout layout2 = ql3.f;
        float f6 = layout2.getLineLeft(n3);
        int n4 = ql3.g + -1;
        if (n3 == n4) {
            f5 = ql3.j;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        return f6 + f5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long o(aG2 var1_1, int var2_2, ul3_0 var3_3) {
        block16: {
            var4_4 /* !! */  = var2_2;
            var5_5 = cf_2.f(var1_1);
            var6_6 = 0;
            var7_7 = 1;
            if (var2_2 == 0) {
                var8_8 = 1;
                var9_9 = 1.4E-45f;
            } else {
                var8_8 = 0;
                var9_9 = 0.0f;
                var10_10 = null;
            }
            if (var8_8 != 0) {
                while (true) {
                    var4_4 /* !! */  = 0;
                    var11_11 = 0.0f;
                    var12_12 = null;
                    break;
                }
            } else {
                if (var4_4 /* !! */  != var7_7) ** continue;
                var4_4 /* !! */  = 1;
                var11_11 = 1.4E-45f;
            }
            var10_10 = var3_3;
            var13_13 = new gi$b(var3_3);
            var8_8 = Build.VERSION.SDK_INT;
            var14_14 /* !! */  = 34;
            var15_15 = 4.8E-44f;
            var16_16 = this.d;
            if (var8_8 >= var14_14 /* !! */ ) {
                var16_16.getClass();
                var10_10 = Rh.a;
                var12_12 = var10_10.a(var16_16, var5_5, var4_4 /* !! */ , var13_13);
lbl32:
                // 2 sources

                while (true) {
                    var8_8 = 1;
                    var9_9 = 1.4E-45f;
                    break block16;
                    break;
                }
            }
            var17_17 = var16_16.c();
            var18_18 = var16_16.f;
            if (var4_4 /* !! */  == var7_7) {
                var10_10 = var18_18.getText();
                var19_19 = var16_16.j();
                var12_12 = new lh3_0((CharSequence)var10_10, (KH3)var19_19);
lbl42:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var12_12 = var18_18.getText();
            var14_14 /* !! */  = 29;
            var15_15 = 4.1E-44f;
            if (var8_8 >= var14_14 /* !! */ ) {
                var19_19 = var16_16.a;
                var10_10 = new R01((TextPaint)var19_19, (CharSequence)var12_12);
lbl50:
                // 2 sources

                while (true) {
                    var12_12 = var10_10;
                    ** continue;
                    break;
                }
            }
            var10_10 = new S01((CharSequence)var12_12);
            ** while (true)
            var20_20 = var12_12;
            var11_11 = var5_5.top;
            var4_4 /* !! */  = (int)var11_11;
            var4_4 /* !! */  = var18_18.getLineForVertical(var4_4 /* !! */ );
            var9_9 = var5_5.top;
            var15_15 = var16_16.e(var4_4 /* !! */ );
            var8_8 = (int)(var9_9 == var15_15 ? 0 : (var9_9 > var15_15 ? 1 : -1));
            if (var8_8 > 0 && ++var4_4 /* !! */  >= (var8_8 = var16_16.g)) lbl-1000:
            // 4 sources

            {
                while (true) {
                    var4_4 /* !! */  = 0;
                    var12_12 = null;
                    var11_11 = 0.0f;
                    ** continue;
                    break;
                }
            }
            var21_21 /* !! */  = var4_4 /* !! */ ;
            var11_11 = var5_5.bottom;
            var4_4 /* !! */  = (int)var11_11;
            var22_22 = var18_18.getLineForVertical(var4_4 /* !! */ );
            if (var22_22 == 0 && (var4_4 /* !! */  = (int)((cfr_temp_0 = (var11_11 = var5_5.bottom) - (var9_9 = var16_16.g(0))) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1))) < 0) ** GOTO lbl-1000
            var23_23 = 1;
            var12_12 = var16_16;
            var10_10 = var18_18;
            var19_19 = var17_17;
            var24_24 /* !! */  = var21_21 /* !! */ ;
            var6_6 = var22_22;
            var25_25 = var20_20;
            var26_26 /* !! */  = var23_23;
            var26_26 /* !! */  = var4_4 /* !! */  = Rl3.b(var16_16, var18_18, var17_17, var21_21 /* !! */ , var5_5, (xx2_0)var20_20, var13_13, (boolean)var23_23);
            while (true) {
                var22_22 = var21_21 /* !! */ ;
                var27_27 = -1;
                if (var26_26 /* !! */  != var27_27 || var21_21 /* !! */  >= var6_6) break;
                var12_12 = var16_16;
                var10_10 = var18_18;
                var19_19 = var17_17;
                var24_24 /* !! */  = ++var21_21 /* !! */ ;
                var26_26 /* !! */  = Rl3.b(var16_16, var18_18, var17_17, var21_21 /* !! */ , var5_5, (xx2_0)var25_25, var13_13, true);
            }
            if (var26_26 /* !! */  == var27_27) ** GOTO lbl-1000
            var21_21 /* !! */  = 0;
            var12_12 = var16_16;
            var10_10 = var18_18;
            var19_19 = var17_17;
            var24_24 /* !! */  = var6_6;
            var7_7 = -1;
            var28_28 = var22_22;
            var29_29 /* !! */  = var26_26 /* !! */ ;
            var26_26 /* !! */  = 0;
            var20_20 = null;
            var4_4 /* !! */  = Rl3.b(var16_16, var18_18, var17_17, var6_6, var5_5, (xx2_0)var25_25, var13_13, false);
            var22_22 = var6_6;
            while (var4_4 /* !! */  == var7_7) {
                var6_6 = var28_28;
                if (var28_28 >= var22_22) break;
                var21_21 /* !! */  = var22_22 + -1;
                var26_26 /* !! */  = 0;
                var20_20 = null;
                var12_12 = var16_16;
                var10_10 = var18_18;
                var19_19 = var17_17;
                var24_24 /* !! */  = var21_21 /* !! */ ;
                var4_4 /* !! */  = Rl3.b(var16_16, var18_18, var17_17, var21_21 /* !! */ , var5_5, (xx2_0)var25_25, var13_13, false);
                var22_22 = var21_21 /* !! */ ;
            }
            if (var4_4 /* !! */  != var7_7) ** break;
            ** while (true)
            var8_8 = 1;
            var9_9 = 1.4E-45f;
            var26_26 /* !! */  = var29_29 /* !! */  + 1;
            var19_19 = var25_25;
            var24_24 /* !! */  = var25_25.j(var26_26 /* !! */ );
            var4_4 /* !! */  -= var8_8;
            var4_4 /* !! */  = var25_25.l(var4_4 /* !! */ );
            var12_12 = new int[]{var24_24 /* !! */ , var4_4 /* !! */ };
        }
        if (var12_12 == null) {
            return mm3.b;
        }
        var14_14 /* !! */  = (int)var12_12[0];
        var4_4 /* !! */  = (int)var12_12[var8_8];
        return nm3.a(var14_14 /* !! */ , var4_4 /* !! */ );
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void p(long var1_1, float[] var3_2, int var4_3) {
        var5_4 /* !! */  = var3_2;
        var6_5 = mm3.e(var1_1);
        var7_6 = mm3.d(var1_1);
        var8_7 = this.d;
        var9_8 = var8_7.f;
        var10_9 = var9_8.getText();
        var11_10 = var10_9.length();
        if (var6_5 >= 0) {
            if (var6_5 < var11_10) {
                if (var7_6 > var6_5) {
                    if (var7_6 <= var11_10) {
                        var12_11 = var3_2.length - var4_3;
                        var11_10 = (var7_6 - var6_5) * 4;
                        if (var12_11 >= var11_10) {
                            var11_10 = var9_8.getLineForOffset(var6_5);
                            var12_11 = var7_6 + -1;
                            var12_11 = var9_8.getLineForOffset(var12_11);
                            var13_12 = new q91(var8_7);
                            if (var11_10 <= var12_11) {
                                var14_13 = var11_10;
                                var11_10 = var4_3;
                                while (true) {
                                    var15_14 = var9_8.getLineStart(var14_13);
                                    var16_15 = var8_7.f(var14_13);
                                    var15_14 = Math.max(var6_5, var15_14);
                                    var16_15 = Math.min(var7_6, var16_15);
                                    var17_16 = var8_7.g(var14_13);
                                    var18_17 = var8_7.e(var14_13);
                                    var19_18 = var9_8.getParagraphDirection(var14_13);
                                    var20_19 = 1;
                                    var21_20 = var6_5;
                                    var6_5 = 0;
                                    var22_21 = 0.0f;
                                    var23_22 = null;
                                    var19_18 = var19_18 == var20_19 ? 1 : 0;
                                    var24_28 = var19_18 ^ 1;
                                    while (var15_14 < var16_15) {
                                        var25_29 = var9_8.isRtlCharAt(var15_14);
                                        if (var19_18 != 0 && var25_29 == 0) {
                                            var26_30 = var13_12.a(var15_14, false, false, (boolean)var20_19);
                                            var6_5 = var15_14 + 1;
                                            var22_21 = var13_12.a(var6_5, (boolean)var20_19, (boolean)var20_19, (boolean)var20_19);
                                            var27_31 = var7_6;
                                            var28_32 = var22_21;
lbl45:
                                            // 2 sources

                                            while (true) {
                                                var6_5 = 0;
                                                var22_21 = 0.0f;
                                                var23_22 = null;
                                                break;
                                            }
                                        } else if (var19_18 != 0 && var25_29 != 0) {
                                            var6_5 = 0;
                                            var22_21 = 0.0f;
                                            var23_22 = null;
                                            var26_30 = var13_12.a(var15_14, false, false, false);
                                            var27_31 = var7_6;
                                            var7_6 = var15_14 + 1;
                                            var28_32 = var13_12.a(var7_6, (boolean)var20_19, (boolean)var20_19, false);
                                            var29_33 = var26_30;
                                            var26_30 = var28_32;
                                            var28_32 = var29_33;
                                        } else {
                                            var27_31 = var7_6;
                                            var6_5 = 0;
                                            var22_21 = 0.0f;
                                            var23_22 = null;
                                            if (var24_28 != 0 && var25_29 != 0) {
                                                var28_32 = var13_12.a(var15_14, false, false, (boolean)var20_19);
                                                var6_5 = var15_14 + 1;
                                                var26_30 = var22_21 = var13_12.a(var6_5, (boolean)var20_19, (boolean)var20_19, (boolean)var20_19);
                                                ** continue;
                                            }
                                            var26_30 = var13_12.a(var15_14, false, false, false);
                                            var7_6 = var15_14 + 1;
                                            var28_32 = var13_12.a(var7_6, (boolean)var20_19, (boolean)var20_19, false);
                                        }
                                        var5_4 /* !! */ [var11_10] = var26_30;
                                        var25_29 = var11_10 + 1;
                                        var5_4 /* !! */ [var25_29] = var17_16;
                                        var25_29 = var11_10 + 2;
                                        var5_4 /* !! */ [var25_29] = var28_32;
                                        var7_6 = var11_10 + 3;
                                        var5_4 /* !! */ [var7_6] = var18_17;
                                        var11_10 += 4;
                                        ++var15_14;
                                        var7_6 = var27_31;
                                    }
                                    var27_31 = var7_6;
                                    if (var14_13 == var12_11) break;
                                    ++var14_13;
                                    var6_5 = var21_20;
                                }
                            }
                            return;
                        }
                        var5_4 /* !! */  = (float[])new IllegalArgumentException;
                        var23_23 = "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString();
                        var5_4 /* !! */ (var23_23);
                        throw var5_4 /* !! */ ;
                    }
                    var5_4 /* !! */  = (float[])new IllegalArgumentException;
                    var23_24 = "endOffset must be smaller or equal to text length".toString();
                    var5_4 /* !! */ (var23_24);
                    throw var5_4 /* !! */ ;
                }
                var5_4 /* !! */  = (float[])new IllegalArgumentException;
                var23_25 = "endOffset must be greater than startOffset".toString();
                var5_4 /* !! */ (var23_25);
                throw var5_4 /* !! */ ;
            }
            var5_4 /* !! */  = (float[])new IllegalArgumentException;
            var23_26 = "startOffset must be less than text length".toString();
            var5_4 /* !! */ (var23_26);
            throw var5_4 /* !! */ ;
        }
        var5_4 /* !! */  = (float[])new IllegalArgumentException;
        var23_27 = "startOffset must be > 0".toString();
        var5_4 /* !! */ (var23_27);
        throw var5_4 /* !! */ ;
    }

    public final float q() {
        Ql3 ql3 = this.d;
        int n3 = ql3.g + -1;
        return ql3.d(n3);
    }

    public final void r(iL iL2, long l2, b13_0 b13_02, Jj3 jj3, Qt0 qt0, int n3) {
        ii ii2 = this.a;
        kj_0 kj_02 = ii2.g;
        int n4 = kj_02.c;
        kj_02.d(l2);
        kj_02.f(b13_02);
        kj_02.g(jj3);
        kj_02.e(qt0);
        kj_02.b(n3);
        this.z(iL2);
        ii2.g.b(n4);
    }

    public final int s(int n3) {
        return this.d.f.getLineForOffset(n3);
    }

    public final uk2_0 t(int n3) {
        Layout layout2 = this.d.f;
        uk2_0 uk2_02 = (n3 = (int)(layout2.isRtlCharAt(n3) ? 1 : 0)) != 0 ? uk2_0.Rtl : uk2_0.Ltr;
        return uk2_02;
    }

    public final float u(int n3) {
        return this.d.e(n3);
    }

    /*
     * Unable to fully structure code
     */
    public final aG2 v(int var1_1) {
        var2_2 = this.e;
        if (var1_1 >= 0 && var1_1 < (var3_3 = var2_2.length())) {
            var2_2 = this.d;
            var4_4 = var2_2.f;
            var5_5 = var4_4.getLineForOffset(var1_1);
            var6_6 = var2_2.g(var5_5);
            var7_7 = var2_2.e(var5_5);
            if ((var5_5 = var4_4.getParagraphDirection(var5_5)) == (var8_8 = 1)) {
                var5_5 = 1;
                var9_9 = 1.4E-45f;
            } else {
                var5_5 = 0;
                var9_9 = 0.0f;
            }
            var3_3 = (int)var4_4.isRtlCharAt(var1_1);
            if (var5_5 != 0 && var3_3 == 0) {
                var10_10 = var2_2.h(var1_1, false);
                var11_11 = var2_2.h(var1_1 += var8_8, (boolean)var8_8);
            } else if (var5_5 != 0 && var3_3 != 0) {
                var10_10 = var2_2.i(var1_1, false);
                var11_11 = var2_2.i(var1_1 += var8_8, (boolean)var8_8);
lbl22:
                // 2 sources

                while (true) {
                    var12_12 = var10_10;
                    var10_10 = var11_11;
                    var11_11 = var12_12;
                    break;
                }
            } else {
                if (var3_3 != 0) {
                    var10_10 = var2_2.h(var1_1, false);
                    var11_11 = var2_2.h(var1_1 += var8_8, (boolean)var8_8);
                    ** continue;
                }
                var10_10 = var2_2.i(var1_1, false);
                var11_11 = var2_2.i(var1_1 += var8_8, (boolean)var8_8);
            }
            var2_2 = new RectF(var10_10, var6_6, var11_11, var7_7);
            var10_10 = var2_2.left;
            var9_9 = var2_2.top;
            var6_6 = var2_2.right;
            var14_15 = var2_2.bottom;
            var13_13 = new aG2(var10_10, var9_9, var6_6, var14_15);
            return var13_13;
        }
        var13_14 = wk0_0.a(var1_1, "offset(", ") is out of bounds [0,");
        var15_16 = var2_2.length();
        var13_14.append(var15_16);
        var13_14.append(')');
        var13_14 = var13_14.toString();
        var13_14 = var13_14.toString();
        var2_2 = new IllegalArgumentException((String)var13_14);
        throw var2_2;
    }

    public final List w() {
        return this.f;
    }

    public final Ql3 x(int n3, int n4, TextUtils.TruncateAt truncateAt, int n7, int n8, int n10, int n14, int n15) {
        Ql3 ql3;
        boolean bl2;
        gi_0 gi_02 = this;
        float f5 = this.getWidth();
        Object object = this.a;
        kj_0 kj_02 = ((ii)object).g;
        Object object2 = hi.a;
        object2 = ((ii)object).b.c;
        if (object2 != null && (object2 = ((ct2_0)object2).b) != null) {
            boolean bl3;
            bl2 = bl3 = ((ot2_1)object2).a;
        } else {
            boolean bl4 = false;
            object2 = null;
            bl2 = false;
        }
        object2 = gi_02.e;
        int n16 = ((ii)object).l;
        Ip1 ip1 = ((ii)object).i;
        object = ql3;
        ql3 = new Ql3((CharSequence)object2, f5, kj_02, n3, truncateAt, n16, bl2, n7, n10, n14, n15, n8, n4, ip1);
        return ql3;
    }

    public final float y() {
        return this.a.i.b();
    }

    public final void z(iL iL2) {
        boolean bl2;
        Rect rect;
        float f5;
        float f6;
        iL2 = Nf.a(iL2);
        Ql3 ql3 = this.d;
        int n3 = ql3.d;
        if (n3 != 0) {
            iL2.save();
            f6 = this.getWidth();
            f5 = this.getHeight();
            iL2.clipRect(0.0f, 0.0f, f6, f5);
        }
        if ((n3 = iL2.getClipBounds(rect = ql3.p)) != 0) {
            n3 = ql3.h;
            if (n3 != 0) {
                f5 = n3;
                iL2.translate(0.0f, f5);
            }
            Ej3 ej3 = Wl3.a;
            ej3.a = iL2;
            Layout layout2 = ql3.f;
            layout2.draw((Canvas)ej3);
            if (n3 != 0) {
                int n4 = -1;
                f5 = n4;
                f6 = n3;
                iL2.translate(0.0f, f5 *= f6);
            }
        }
        if (bl2 = ql3.d) {
            iL2.restore();
        }
    }
}

