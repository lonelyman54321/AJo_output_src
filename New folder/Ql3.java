/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Paint$FontMetricsInt
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.Trace
 *  android.text.BoringLayout
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.Spanned
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.text.TextUtils$TruncateAt
 */
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class Ql3 {
    public final TextPaint a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public KH3 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final zu1_0[] o;
    public final Rect p;
    public cp1_0 q;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Ql3(CharSequence var1_1, float var2_2, TextPaint var3_3, int var4_4, TextUtils.TruncateAt var5_5, int var6_6, boolean var7_7, int var8_8, int var9_9, int var10_10, int var11_11, int var12_12, int var13_13, Ip1 var14_14) {
        block39: {
            block47: {
                block46: {
                    block40: {
                        block38: {
                            block42: {
                                block43: {
                                    block44: {
                                        block45: {
                                            var15_15 = this;
                                            var16_16 = var1_1;
                                            var17_18 = var2_2;
                                            var18_19 = var4_4;
                                            var19_20 = var7_7;
                                            var20_21 = var8_8;
                                            var21_22 = true;
                                            var22_23 = 1.4E-45f;
                                            super();
                                            this.a = var3_3;
                                            this.b = var7_7;
                                            this.c = var23_24 = 1;
                                            this.p = var24_25 /* !! */  = new Rect();
                                            var25_26 = var1_1.length();
                                            var26_27 = Wl3.a(var6_6);
                                            if (var4_4 == 0) break block42;
                                            if (var4_4 == var21_22) break block43;
                                            var27_28 = 2;
                                            if (var4_4 == var27_28) break block44;
                                            var27_28 = 3;
                                            if (var4_4 == var27_28) break block45;
                                            var27_28 = 4;
                                            var28_29 /* !! */  = var4_4 != var27_28 ? Layout.Alignment.ALIGN_NORMAL : Dj3.b;
lbl25:
                                            // 5 sources

                                            while (true) {
                                                var29_30 = var28_29 /* !! */ ;
                                                var18_19 = var16_16 instanceof Spanned;
                                                if (var18_19 != 0) {
                                                    break block38;
                                                }
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                        }
                                        var28_29 /* !! */  = Dj3.a;
                                        ** GOTO lbl25
                                    }
                                    var28_29 /* !! */  = Layout.Alignment.ALIGN_CENTER;
                                    ** GOTO lbl25
                                }
                                var28_29 /* !! */  = Layout.Alignment.ALIGN_OPPOSITE;
                                ** GOTO lbl25
                            }
                            var28_29 /* !! */  = Layout.Alignment.ALIGN_NORMAL;
                            ** while (true)
                        }
                        var28_29 /* !! */  = var16_16;
                        var28_29 /* !! */  = (Spanned)var16_16;
                        var27_28 = -1;
                        var30_31 = Sw.class;
                        var18_19 = var28_29 /* !! */ .nextSpanTransition(var27_28, var25_26, var30_31);
                        if (var18_19 < var25_26) {
                            var18_19 = 1;
                            var31_32 = 1.4E-45f;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var18_19 = 0;
                            var31_32 = 0.0f;
                            var28_29 /* !! */  = null;
                        }
                        var24_25 /* !! */  = "TextLayout:initLayout";
                        Trace.beginSection((String)var24_25 /* !! */ );
                        try {
                            var32_33 = var14_14.a();
                        }
                        catch (Throwable var16_17) {
                            break block39;
                        }
                        var33_34 = var17_18;
                        {
                            var35_35 = Math.ceil(var33_34);
                        }
                        var37_36 = (float)var35_35;
                        var23_24 = (int)var37_36;
                        var38_37 = 33;
                        {
                            if (var32_33 == null || (var39_38 = (cfr_temp_0 = (var37_36 = var14_14.b()) - var17_18) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1)) > 0 || var18_19 != 0) break block40;
                        }
                        var15_15.l = var21_22;
                        if (var23_24 < 0) {
                            var41_42 = "negative width";
                            var41_42 = var41_42.toString();
                            var16_16 = new IllegalArgumentException(var41_42);
                            throw var16_16;
                        }
                        if (var23_24 < 0) {
                            var41_41 = "negative ellipsized width";
                            var41_41 = var41_41.toString();
                            var16_16 = new IllegalArgumentException(var41_41);
                            throw var16_16;
                        }
                        var39_38 = Build.VERSION.SDK_INT;
                        if (var39_38 >= var38_37) {
                            var40_39 = null;
                            var41_40 /* !! */  = var1_1;
                            var28_29 /* !! */  = var3_3;
                            var25_26 = var23_24;
                            var42_43 = 1065353216;
                            var43_44 = 1.0f;
                            var44_45 = 0;
                            var30_31 = null;
                            var37_36 = 0.0f;
                            var45_46 = 1;
                            var20_21 = 0;
                            var46_47 = null;
                            var47_48 = var5_5;
                            var48_49 = 1;
                            var2_2 = 1.4E-45f;
                            var41_40 /* !! */  = sz.a(var1_1, var3_3, var23_24, var29_30, var43_44, 0.0f, var32_33, (boolean)var7_7, (boolean)var45_46, var5_5, var23_24);
                        } else {
                            var48_49 = 1;
                            var2_2 = 1.4E-45f;
                            var20_21 = 0;
                            var46_47 = null;
                            var41_40 /* !! */  = var1_1;
                            var28_29 /* !! */  = var3_3;
                            var25_26 = var23_24;
                            var42_43 = 1065353216;
                            var43_44 = 1.0f;
                            var44_45 = 0;
                            var30_31 = null;
                            var37_36 = 0.0f;
                            var40_39 = var5_5;
                            var38_37 = var23_24;
                            var41_40 /* !! */  = tz.a(var1_1, var3_3, var23_24, var29_30, var43_44, 0.0f, var32_33, (boolean)var7_7, var5_5, var23_24);
                        }
                        ** GOTO lbl155
                    }
                    var48_49 = 1;
                    var2_2 = 1.4E-45f;
                    var20_21 = 0;
                    var46_47 = null;
                    var15_15.l = false;
                    var41_40 /* !! */  = rc3_0.a;
                    var44_45 = var1_1.length();
                    var49_50 = Math.ceil(var33_34);
                    var17_18 = (float)var49_50;
                    var38_37 = (int)var17_18;
                    {
                        var51_51 = 0;
                        var52_52 = 1;
                        var21_22 = 1065353216 != 0;
                        var22_23 = 1.0f;
                        var39_38 = (float)false;
                        var17_18 = 0.0f;
                        var27_28 = var8_8;
                        var18_19 = 0;
                        var31_32 = 0.0f;
                        var20_21 = 0;
                        var46_47 = null;
                        var25_26 = 0;
                        var24_25 /* !! */  = null;
                        var41_40 /* !! */  = var40_39;
                        var28_29 /* !! */  = var1_1;
                        var27_28 = var44_45;
                        var44_45 = var23_24;
                        var32_33 = var26_27;
                        var45_46 = var38_37;
                        var47_48 = var5_5;
                        var23_24 = var38_37;
                        var19_20 = var13_13;
                        var45_46 = var7_7;
                        var53_53 = var48_49;
                        var54_54 = var10_10;
                        var40_39 = new uc3_0(var1_1, 0, var27_28, var3_3, var44_45, var26_27, var29_30, var8_8, var5_5, var38_37, var22_23, 0.0f, var13_13, (boolean)var7_7, (boolean)var48_49, var9_9, var10_10, var11_11, var12_12, null, null);
                        var41_40 /* !! */  = rc3_0.a;
                        var28_29 /* !! */  = var40_39;
                        var41_40 /* !! */  = var41_40 /* !! */ .b(var40_39);
lbl155:
                        // 3 sources

                        var15_15.f = var41_40 /* !! */ ;
                    }
                    Trace.endSection();
                    var18_19 = var41_40 /* !! */ .getLineCount();
                    var25_26 = var8_8;
                    var15_15.g = var18_19 = Math.min(var18_19, var8_8);
                    var27_28 = 1;
                    var42_43 = var18_19 + -1;
                    if (var18_19 < var8_8) {
                        while (true) {
                            var21_22 = false;
                            var22_23 = 0.0f;
                            break;
                        }
                    } else {
                        if ((var25_26 = var41_40 /* !! */ .getEllipsisCount(var42_43)) <= 0 && (var25_26 = var41_40 /* !! */ .getLineEnd(var42_43)) == (var55_55 = var1_1.length())) ** continue;
                        var21_22 = true;
                        var22_23 = 1.4E-45f;
                    }
                    var15_15.d = var21_22;
                    var56_56 = Wl3.b;
                    var58_57 = 0xFFFFFFFFL;
                    var55_55 = 32;
                    var60_58 = 4.5E-44f;
                    if (var7_7 != 0) break block46;
                    var25_26 = (int)var15_15.l;
                    if (var25_26 != 0) {
                        Intrinsics.checkNotNull(var41_40 /* !! */ , "null cannot be cast to non-null type android.text.BoringLayout");
                        var24_25 /* !! */  = var41_40 /* !! */ ;
                        var24_25 /* !! */  = (BoringLayout)var41_40 /* !! */ ;
                        var38_37 = Build.VERSION.SDK_INT;
                        var23_24 = 33;
                        if (var38_37 >= var23_24) {
                            var38_37 = (int)sz.c((BoringLayout)var24_25 /* !! */ );
                        } else {
                            var38_37 = 0;
                            var47_48 = null;
                        }
                    } else {
                        var23_24 = 33;
                        var24_25 /* !! */  = rc3_0.a;
                        Intrinsics.checkNotNull(var41_40 /* !! */ , "null cannot be cast to non-null type android.text.StaticLayout");
                        var24_25 /* !! */  = var41_40 /* !! */ ;
                        var24_25 /* !! */  = (StaticLayout)var41_40 /* !! */ ;
                        var47_48 = rc3_0.a;
                        var21_22 = true;
                        var22_23 = 1.4E-45f;
                        var38_37 = (int)var47_48.a((StaticLayout)var24_25 /* !! */ , var21_22);
                    }
                    if (var38_37 == 0) break block47;
                }
                var21_22 = false;
                var22_23 = 0.0f;
                ** GOTO lbl-1000
            }
            var24_25 /* !! */  = var41_40 /* !! */ .getPaint();
            var47_48 = var41_40 /* !! */ .getText();
            var21_22 = false;
            var22_23 = 0.0f;
            var20_21 = var41_40 /* !! */ .getLineStart(0);
            var19_20 = var41_40 /* !! */ .getLineEnd(0);
            var46_47 = hm2.a((TextPaint)var24_25 /* !! */ , (CharSequence)var47_48, var20_21, var19_20);
            var23_24 = var46_47.top;
            var19_20 = var41_40 /* !! */ .getLineAscent(0);
            var19_20 = var23_24 < var19_20 ? (var19_20 -= var23_24) : var41_40 /* !! */ .getTopPadding();
            if (var18_19 != var27_28) {
                var18_19 = var41_40 /* !! */ .getLineStart(var42_43);
                var23_24 = var41_40 /* !! */ .getLineEnd(var42_43);
                var46_47 = hm2.a((TextPaint)var24_25 /* !! */ , (CharSequence)var47_48, var18_19, var23_24);
            }
            var18_19 = var41_40 /* !! */ .getLineDescent(var42_43);
            var25_26 = var46_47.bottom;
            var25_26 = var25_26 > var18_19 ? (var25_26 -= var18_19) : var41_40 /* !! */ .getBottomPadding();
            if (var19_20 != 0 || var25_26 != 0) {
                var61_59 = (long)var19_20 << var55_55;
                var63_60 = (long)var25_26 & var58_57 | var61_59;
            } else lbl-1000:
            // 2 sources

            {
                var63_60 = var56_56;
            }
            var47_48 = var41_40 /* !! */ .getText();
            var38_37 = var47_48 instanceof Spanned;
            if (var38_37 == 0) {
                while (true) {
                    var39_38 = (float)false;
                    var17_18 = 0.0f;
                    var41_40 /* !! */  = null;
                    break;
                }
            } else {
                var47_48 = var41_40 /* !! */ .getText();
                var46_47 = "null cannot be cast to non-null type android.text.Spanned";
                Intrinsics.checkNotNull(var47_48, var46_47);
                var47_48 = (Spanned)var47_48;
                var65_61 = zu1_0.class;
                var38_37 = (int)ki2_2.b((Spanned)var47_48, var65_61);
                if (var38_37 == 0 && (var38_37 = (var47_48 = var41_40 /* !! */ .getText()).length()) > 0) ** continue;
                var47_48 = var41_40 /* !! */ .getText();
                Intrinsics.checkNotNull(var47_48, var46_47);
                var47_48 = (Spanned)var47_48;
                var39_38 = var41_40 /* !! */ .getText().length();
                var41_40 /* !! */  = (zu1_0[])var47_48.getSpans(0, (int)var39_38, (Class)var65_61);
            }
            var15_15.o = var41_40 /* !! */ ;
            if (var41_40 /* !! */  != null) {
                var44_45 = ((Object)var41_40 /* !! */ ).length;
                var52_52 = 0;
                var32_33 = null;
                var47_48 = null;
                var20_21 = 0;
                var46_47 = null;
                for (var38_37 = 0; var38_37 < var44_45; var38_37 += var27_28) {
                    var65_61 = var41_40 /* !! */ [var38_37];
                    var23_24 = var65_61.k;
                    if (var23_24 < 0) {
                        var23_24 = Math.abs(var23_24);
                        var52_52 = Math.max(var52_52, var23_24);
                    }
                    if ((var23_24 = var65_61.l) >= 0) continue;
                    var23_24 = Math.abs(var23_24);
                    var20_21 = var23_24 = Math.max(var52_52, var23_24);
                }
                if (var52_52 == 0 && var20_21 == 0) {
                    var56_56 = Wl3.b;
                } else {
                    var56_56 = (long)var52_52 << var55_55;
                    var61_59 = (long)var20_21 & var58_57;
                    var56_56 |= var61_59;
                }
            }
            var39_38 = (int)(var63_60 >> var55_55);
            var61_59 = var56_56 >> var55_55;
            var55_55 = (int)var61_59;
            var15_15.h = var55_55 = Math.max((int)var39_38, var55_55);
            var55_55 = (int)(var63_60 & var58_57);
            var66_62 = var56_56 & var58_57;
            var18_19 = (int)var66_62;
            var15_15.i = var55_55 = Math.max(var55_55, var18_19);
            var16_16 = var15_15.a;
            var41_40 /* !! */  = var15_15.o;
            var24_25 /* !! */  = var15_15.f;
            var18_19 = var15_15.g - var27_28;
            if ((var27_28 = var24_25 /* !! */ .getLineStart(var18_19)) == (var25_26 = var24_25 /* !! */ .getLineEnd(var18_19)) && var41_40 /* !! */  != null && (var25_26 = ((zu1_0[])var41_40 /* !! */ ).length) != 0) {
                var24_25 /* !! */  = "\u200b";
                var65_61 = new SpannableString((CharSequence)var24_25 /* !! */ );
                var41_40 /* !! */  = (zu1_0)tp_2.z((Object[])var41_40 /* !! */ );
                var25_26 = var65_61.length();
                if (var18_19 != 0 && (var18_19 = (int)var41_40 /* !! */ .e) != 0) {
                    var38_37 = 0;
                    var47_48 = null;
                } else {
                    var38_37 = (int)var41_40 /* !! */ .e;
                }
                var27_28 = (int)var41_40 /* !! */ .e;
                var37_36 = var41_40 /* !! */ .f;
                var17_18 = var41_40 /* !! */ .a;
                var1_1 = var28_29 /* !! */ ;
                var2_2 = var17_18;
                var4_4 = var38_37;
                super(var17_18, var25_26, (boolean)var38_37, (boolean)var27_28, var37_36);
                var39_38 = var65_61.length();
                var25_26 = 33;
                var65_61.setSpan((Object)var28_29 /* !! */ , 0, (int)var39_38, var25_26);
                var41_40 /* !! */  = rc3_0.a;
                var53_53 = var65_61.length();
                var68_63 = yp1_0.a;
                var39_38 = (float)var15_15.b;
                var18_19 = (int)var15_15.c;
                var46_47 = var24_25 /* !! */ ;
                var45_46 = 0;
                var54_54 = -1 >>> 1;
                var51_51 = -1 >>> 1;
                var69_64 = -1 >>> 1;
                var70_65 = 1.0f;
                super((CharSequence)var65_61, 0, var53_53, (TextPaint)var16_16, var54_54, var26_27, var68_63, var51_51, null, var69_64, var70_65, 0.0f, 0, (boolean)var39_38, (boolean)var18_19, 0, 0, 0, 0, null, null);
                var16_16 = rc3_0.a.b((uc3_0)var24_25 /* !! */ );
                var71_66 = new Paint.FontMetricsInt();
                var39_38 = var16_16.getLineAscent(0);
                var71_66.ascent = (int)var39_38;
                var39_38 = var16_16.getLineDescent(0);
                var71_66.descent = (int)var39_38;
                var39_38 = var16_16.getLineTop(0);
                var71_66.top = (int)var39_38;
                var71_66.bottom = var55_55 = var16_16.getLineBottom(0);
            } else {
                var23_24 = 0;
                var71_66 = null;
            }
            if (var71_66 != null) {
                var55_55 = var71_66.bottom;
                var17_18 = var15_15.e(var42_43);
                var31_32 = var15_15.g(var42_43);
                var39_38 = (int)(var17_18 -= var31_32);
                var38_37 = var55_55 - var39_38;
            } else {
                var38_37 = 0;
                var47_48 = null;
            }
            var15_15.n = var38_37;
            var15_15.m = var71_66;
            var16_16 = var15_15.f;
            var41_40 /* !! */  = var16_16.getPaint();
            var15_15.j = var60_58 = Eg1.a((Layout)var16_16, var42_43, (Paint)var41_40 /* !! */ );
            var16_16 = var15_15.f;
            var41_40 /* !! */  = var16_16.getPaint();
            var15_15.k = var60_58 = Eg1.b((Layout)var16_16, var42_43, (Paint)var41_40 /* !! */ );
            return;
        }
        Trace.endSection();
        throw var16_17;
    }

    public final int a() {
        int n3 = this.d;
        Layout layout2 = this.f;
        if (n3 != 0) {
            n3 = this.g + -1;
            n3 = layout2.getLineBottom(n3);
        } else {
            n3 = layout2.getHeight();
        }
        int n4 = this.h;
        n3 += n4;
        n4 = this.i;
        n3 += n4;
        n4 = this.n;
        return n3 + n4;
    }

    public final float b(int n3) {
        float f5;
        int n4 = this.g + -1;
        if (n3 == n4) {
            f5 = this.j;
            float f6 = this.k;
            f5 += f6;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        return f5;
    }

    public final cp1_0 c() {
        cp1_0 cp1_02 = this.q;
        if (cp1_02 == null) {
            Layout layout2 = this.f;
            this.q = cp1_02 = new cp1_0(layout2);
            return cp1_02;
        }
        Intrinsics.checkNotNull(cp1_02);
        return cp1_02;
    }

    public final float d(int n3) {
        float f5;
        Paint.FontMetricsInt fontMetricsInt;
        int n4 = this.h;
        float f6 = n4;
        int n7 = this.g + -1;
        if (n3 == n7 && (fontMetricsInt = this.m) != null) {
            f5 = this.g(n3);
            n7 = fontMetricsInt.ascent;
            float f7 = n7;
            f5 -= f7;
        } else {
            fontMetricsInt = this.f;
            n3 = fontMetricsInt.getLineBaseline(n3);
            f5 = n3;
        }
        return f6 + f5;
    }

    public final float e(int n3) {
        float f5;
        Paint.FontMetricsInt fontMetricsInt;
        int n4 = this.g;
        int n7 = n4 + -1;
        Layout layout2 = this.f;
        if (n3 == n7 && (fontMetricsInt = this.m) != null) {
            float f6 = layout2.getLineBottom(n3 += -1);
            float f7 = fontMetricsInt.bottom;
            return f6 + f7;
        }
        n7 = this.h;
        float f8 = n7;
        int n8 = layout2.getLineBottom(n3);
        float f11 = n8;
        f8 += f11;
        if (n3 == (n4 += -1)) {
            n3 = this.i;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        f5 = n3;
        return f8 + f5;
    }

    public final int f(int n3) {
        Layout layout2 = this.f;
        int n4 = layout2.getEllipsisStart(n3);
        if (n4 == 0) {
            n3 = layout2.getLineEnd(n3);
        } else {
            CharSequence charSequence = layout2.getText();
            n3 = charSequence.length();
        }
        return n3;
    }

    public final float g(int n3) {
        float f5;
        Layout layout2 = this.f;
        int n4 = layout2.getLineTop(n3);
        float f6 = n4;
        if (n3 == 0) {
            n3 = 0;
            f5 = 0.0f;
        } else {
            n3 = this.h;
        }
        f5 = n3;
        return f6 + f5;
    }

    public final float h(int n3, boolean bl2) {
        float f5 = this.c().c(n3, true, bl2);
        n3 = this.f.getLineForOffset(n3);
        return this.b(n3) + f5;
    }

    public final float i(int n3, boolean bl2) {
        float f5 = this.c().c(n3, false, bl2);
        n3 = this.f.getLineForOffset(n3);
        return this.b(n3) + f5;
    }

    public final KH3 j() {
        KH3 kH3 = this.e;
        if (kH3 != null) {
            return kH3;
        }
        Layout layout2 = this.f;
        CharSequence charSequence = layout2.getText();
        int n3 = layout2.getText().length();
        Locale locale = this.a.getTextLocale();
        this.e = kH3 = new KH3(charSequence, n3, locale);
        return kH3;
    }
}

