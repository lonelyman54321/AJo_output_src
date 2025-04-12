/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Rect
 *  android.graphics.Typeface
 *  android.text.Layout$Alignment
 *  android.text.SpannableStringBuilder
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.util.AttributeSet
 *  android.view.View
 */
package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.ui.SubtitleView$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

final class CanvasSubtitleOutput
extends View
implements SubtitleView$a {
    public final ArrayList a;
    public List b;
    public int c;
    public float d;
    public FL e;
    public float f;

    public CanvasSubtitleOutput(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        super();
        this.a = object;
        object = Collections.emptyList();
        this.b = object;
        this.c = 0;
        this.d = 0.0533f;
        object = FL.g;
        this.e = object;
        this.f = 0.08f;
    }

    public final void a(List list, FL object, float f5, int n3, float f6) {
        int n4;
        this.b = list;
        this.e = object;
        this.d = f5;
        this.c = n3;
        this.f = f6;
        while ((n4 = ((ArrayList)(object = this.a)).size()) < (n3 = list.size())) {
            Context context = this.getContext();
            sf3_0 sf3_02 = new sf3_0(context);
            ((ArrayList)object).add(sf3_02);
        }
        this.invalidate();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void dispatchDraw(Canvas var1_1) {
        block67: {
            var2_2 = this;
            var3_3 /* !! */  = var1_1;
            var4_4 = this.b;
            var5_5 = var4_4.isEmpty();
            if (var5_5 != 0) {
                return;
            }
            var5_5 = this.getHeight();
            var6_6 = this.getPaddingLeft();
            var7_7 = this.getPaddingTop();
            var8_8 = this.getWidth();
            var9_9 = this.getPaddingRight();
            var8_8 -= var9_9;
            var9_9 = this.getPaddingBottom();
            if ((var9_9 = var5_5 - var9_9) <= var7_7 || var8_8 <= var6_6) break block67;
            var10_10 = var9_9 - var7_7;
            var11_11 = this.c;
            var12_12 = this.d;
            var13_13 = zf3_0.b(var11_11, var12_12, var5_5, var10_10);
            var14_14 = 0;
            var12_12 = 0.0f;
            var15_15 = null;
            cfr_temp_0 = var13_13 - 0.0f;
            var16_16 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
            if (var16_16 /* !! */  <= 0) {
                return;
            }
            var16_16 /* !! */  = var4_4.size();
            var17_17 = 0;
            var18_18 = 0.0f;
            var19_19 = null;
            while (var17_17 < var16_16 /* !! */ ) {
                block64: {
                    block74: {
                        block71: {
                            block66: {
                                block73: {
                                    block72: {
                                        block65: {
                                            block68: {
                                                block69: {
                                                    block70: {
                                                        var20_20 = var4_4.get(var17_17);
                                                        var15_15 = (Pe0)var20_20;
                                                        var15_15 = (Pe0)var20_20;
                                                        var21_21 = var15_15.p;
                                                        var22_22 = 1.0f;
                                                        var23_23 = -8388609;
                                                        var24_24 = -3.4028235E38f;
                                                        var25_25 = -1 << -1;
                                                        var26_26 = -0.0f;
                                                        if (var21_21 != var25_25) {
                                                            var27_27 = var15_15.a();
                                                            var27_27.h = var24_24;
                                                            var27_27.i = var25_25;
                                                            var26_26 = 0.0f;
                                                            var28_28 = null;
                                                            var27_27.c = null;
                                                            var25_25 = var15_15.f;
                                                            var24_24 = var15_15.e;
                                                            if (var25_25 == 0) {
                                                                var27_27.e = var24_24 = var22_22 - var24_24;
                                                                var23_23 = 0;
                                                                var24_24 = 0.0f;
                                                                var29_29 = null;
                                                                var27_27.f = 0;
                                                            } else {
                                                                var27_27.e = var24_24 = -var24_24 - var22_22;
                                                                var23_23 = 1;
                                                                var24_24 = 1.4E-45f;
                                                                var27_27.f = var23_23;
                                                            }
                                                            var23_23 = var15_15.g;
                                                            if (var23_23 != 0) {
                                                                var14_14 = 2;
                                                                var12_12 = 2.8E-45f;
                                                                if (var23_23 == var14_14) {
                                                                    var23_23 = 0;
                                                                    var24_24 = 0.0f;
                                                                    var29_29 = null;
                                                                    var27_27.g = 0;
                                                                }
                                                            } else {
                                                                var14_14 = 2;
                                                                var12_12 = 2.8E-45f;
                                                                var27_27.g = var14_14;
                                                            }
                                                            var15_15 = var27_27.a();
                                                        }
                                                        var23_23 = var15_15.n;
                                                        var30_30 = var15_15.o;
                                                        var24_24 = zf3_0.b(var23_23, var30_30, var5_5, var10_10);
                                                        var27_27 = (sf3_0)var2_2.a.get(var17_17);
                                                        var28_28 = var2_2.e;
                                                        var31_31 = var4_4;
                                                        var32_32 = var2_2.f;
                                                        var27_27.getClass();
                                                        var2_2 = var15_15.d;
                                                        var33_33 = var5_5;
                                                        var34_34 = var10_10;
                                                        if (var2_2 == null) {
                                                            var5_5 = 1;
                                                            var35_35 = 1.4E-45f;
                                                        } else {
                                                            var5_5 = 0;
                                                            var35_35 = 0.0f;
                                                            var36_36 = null;
                                                        }
                                                        var37_37 = var15_15.a;
                                                        if (var5_5 != 0) {
                                                            var38_38 = (float)TextUtils.isEmpty((CharSequence)var37_37);
                                                            if (var38_38 != false) {
                                                                var4_4 = var3_3 /* !! */ ;
                                                                var39_39 = var6_6;
                                                                var40_40 = var7_7;
                                                                var41_41 = var8_8;
                                                                var42_42 = var9_9;
                                                                var43_43 = var13_13;
                                                                var38_38 = var16_16 /* !! */ ;
                                                                var44_44 = var17_17;
lbl105:
                                                                // 2 sources

                                                                while (true) {
                                                                    var45_45 = 1;
                                                                    var46_46 = 1.4E-45f;
                                                                    var5_5 = 2;
                                                                    var35_35 = 2.8E-45f;
                                                                    var8_8 = 0;
                                                                    var47_47 = 0.0f;
                                                                    var48_48 = null;
                                                                    var11_11 = 0;
                                                                    var13_13 = 0.0f;
                                                                    break block64;
                                                                    break;
                                                                }
                                                            }
                                                            var38_38 = var16_16 /* !! */ ;
                                                            var16_16 /* !! */  = (float)var15_15.l;
                                                            var16_16 /* !! */  = var16_16 /* !! */  != false ? (float)var15_15.m : (float)var28_28.c;
lbl119:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var38_38 = var16_16 /* !! */ ;
                                                        var16_16 /* !! */  = -16777216;
                                                        ** continue;
                                                        var44_44 = var17_17;
                                                        var19_19 = var27_27.i;
                                                        var3_3 /* !! */  = var27_27.f;
                                                        var49_49 = var5_5;
                                                        var43_43 = var35_35;
                                                        var35_35 = var15_15.k;
                                                        var42_42 = var9_9;
                                                        var50_50 = var15_15.j;
                                                        var41_41 = var8_8;
                                                        var8_8 = var15_15.i;
                                                        var40_40 = var7_7;
                                                        var51_51 = var15_15.h;
                                                        var39_39 = var6_6;
                                                        var6_6 = var15_15.g;
                                                        var52_52 = var32_32;
                                                        var53_53 = var15_15.f;
                                                        var54_54 = var24_24;
                                                        var24_24 = var15_15.e;
                                                        var15_15 = var15_15.b;
                                                        if (var19_19 != var37_37 && (var19_19 == null || (var17_17 = (int)var19_19.equals(var37_37)) == 0)) {
                                                            while (true) {
                                                                var19_19 = var3_3 /* !! */ ;
                                                                var55_55 = var53_53;
                                                                var56_56 = var49_49;
                                                                var57_57 = var43_43;
                                                                var4_4 = var1_1;
                                                                break block65;
                                                                break;
                                                            }
                                                        }
                                                        var19_19 = var27_27.j;
                                                        var55_55 = gz3.a;
                                                        if ((var17_17 = (int)Objects.equals(var19_19, var15_15)) == 0 || (var19_19 = var27_27.k) != var2_2 || (var17_17 = (int)((cfr_temp_1 = (var18_18 = var27_27.l) - var24_24) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) != 0 || (var17_17 = var27_27.m) != var53_53) ** continue;
                                                        var17_17 = var27_27.n;
                                                        var19_19 = var17_17;
                                                        var55_55 = var53_53;
                                                        var4_4 = var6_6;
                                                        var53_53 = (int)var19_19.equals(var4_4);
                                                        if (var53_53 == 0 || (var53_53 = (int)((cfr_temp_2 = (var32_32 = var27_27.o) - var51_51) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) != 0 || (var53_53 = (int)(var4_4 = Integer.valueOf(var27_27.p)).equals(var19_19 = Integer.valueOf(var8_8))) == 0 || (var53_53 = (int)((cfr_temp_3 = (var32_32 = var27_27.q) - var50_50) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) != 0 || (var53_53 = (int)((cfr_temp_4 = (var32_32 = var27_27.r) - var35_35) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1))) != 0 || (var53_53 = var27_27.s) != (var17_17 = var28_28.a) || (var53_53 = var27_27.t) != (var17_17 = var28_28.b) || (var53_53 = var27_27.u) != var16_16 /* !! */  || (var53_53 = var27_27.w) != (var17_17 = var28_28.d) || (var53_53 = var27_27.v) != (var17_17 = var28_28.e) || (var53_53 = (int)Objects.equals(var4_4 = var3_3 /* !! */ .getTypeface(), var19_19 = var28_28.f)) == 0 || (var53_53 = (int)((cfr_temp_5 = (var32_32 = var27_27.x) - var13_13) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1))) != 0 || (var53_53 = (int)((cfr_temp_6 = (var32_32 = var27_27.y) - var54_54) == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1))) != 0 || (var53_53 = (int)((cfr_temp_7 = (var32_32 = var27_27.z) - var52_52) == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1))) != 0) break block68;
                                                        var53_53 = var27_27.A;
                                                        var17_17 = var39_39;
                                                        if (var53_53 != var39_39) break block69;
                                                        var53_53 = var27_27.B;
                                                        var58_58 /* !! */  = var3_3 /* !! */ ;
                                                        var56_56 = var40_40;
                                                        if (var53_53 != var40_40) break block70;
                                                        var53_53 = var27_27.C;
                                                        var56_56 = var41_41;
                                                        if (var53_53 == var41_41) {
                                                            var53_53 = var27_27.D;
                                                            var56_56 = var42_42;
                                                            if (var53_53 == var42_42) {
                                                                var4_4 = var1_1;
                                                                var56_56 = var49_49;
                                                                var57_57 = var43_43;
                                                                var27_27.a(var1_1, (boolean)var49_49);
                                                                var43_43 = var13_13;
                                                                ** continue;
                                                            }
                                                            var4_4 = var1_1;
lbl180:
                                                            // 3 sources

                                                            while (true) {
                                                                var39_39 = var17_17;
                                                                var19_19 = var58_58 /* !! */ ;
lbl183:
                                                                // 2 sources

                                                                while (true) {
                                                                    var56_56 = var49_49;
                                                                    var57_57 = var43_43;
                                                                    break block65;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        var4_4 = var1_1;
                                                        ** GOTO lbl180
                                                    }
                                                    var4_4 = var1_1;
                                                    ** continue;
                                                }
                                                var4_4 = var1_1;
lbl194:
                                                // 2 sources

                                                while (true) {
                                                    var19_19 = var3_3 /* !! */ ;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            var4_4 = var1_1;
                                            ** continue;
                                        }
                                        var27_27.i = var37_37;
                                        var27_27.j = var15_15;
                                        var27_27.k = var2_2;
                                        var27_27.l = var24_24;
                                        var45_45 = var55_55;
                                        var27_27.m = var55_55;
                                        var27_27.n = var6_6;
                                        var27_27.o = var51_51;
                                        var27_27.p = var8_8;
                                        var27_27.q = var50_50;
                                        var27_27.r = var35_35;
                                        var27_27.s = var45_45 = var28_28.a;
                                        var27_27.t = var45_45 = var28_28.b;
                                        var27_27.u = (int)var16_16 /* !! */ ;
                                        var27_27.w = var45_45 = var28_28.d;
                                        var27_27.v = var45_45 = var28_28.e;
                                        var2_2 = var28_28.f;
                                        var19_19.setTypeface((Typeface)var2_2);
                                        var27_27.x = var13_13;
                                        var46_46 = var54_54;
                                        var27_27.y = var54_54;
                                        var46_46 = var52_52;
                                        var27_27.z = var52_52;
                                        var45_45 = var39_39;
                                        var27_27.A = var39_39;
                                        var23_23 = var40_40;
                                        var27_27.B = var40_40;
                                        var8_8 = var41_41;
                                        var27_27.C = var41_41;
                                        var5_5 = var42_42;
                                        var27_27.D = var42_42;
                                        if (var56_56 == 0) break block71;
                                        var27_27.i.getClass();
                                        var59_59 = var27_27.i;
                                        var7_7 = var59_59 instanceof SpannableStringBuilder;
                                        if (var7_7 != 0) {
                                            var59_59 = (SpannableStringBuilder)var59_59;
                                        } else {
                                            var60_60 = var27_27.i;
                                            var59_59 = new SpannableStringBuilder(var60_60);
                                        }
                                        var7_7 = var27_27.C;
                                        var9_9 = var27_27.A;
                                        var7_7 -= var9_9;
                                        var9_9 = var27_27.D;
                                        var10_10 = var27_27.B;
                                        var9_9 -= var10_10;
                                        var61_61 = var27_27.x;
                                        var19_19.setTextSize(var61_61);
                                        var61_61 = var27_27.x * 0.125f + 0.5f;
                                        var10_10 = (int)var61_61;
                                        var12_12 = 2.8E-45f;
                                        var16_16 /* !! */  = var10_10 * 2;
                                        var14_14 = var7_7 - var16_16 /* !! */ ;
                                        var26_26 = var27_27.q;
                                        var62_62 = -3.4028235E38f;
                                        var63_63 = var26_26 == var62_62 ? 0 : (var26_26 > var62_62 ? 1 : -1);
                                        if (var63_63 != false) {
                                            var12_12 = (float)var14_14 * var26_26;
                                            var14_14 = (int)var12_12;
                                        }
                                        if (var14_14 <= 0) {
                                            var59_59 = "Skipped drawing subtitle cue (insufficient space)";
                                            Cx.f((String)var59_59);
                                            var39_39 = var45_45;
                                            var64_64 = var56_56;
                                            var65_65 = var57_57;
                                            var40_40 = var23_23;
                                            var42_42 = var5_5;
                                            var41_41 = var8_8;
                                            var43_43 = var13_13;
lbl272:
                                            // 2 sources

                                            while (true) {
                                                var8_8 = 0;
                                                var47_47 = 0.0f;
                                                var48_48 = null;
                                                var11_11 = 0;
                                                var13_13 = 0.0f;
                                                break block66;
                                                break;
                                            }
                                        }
                                        var26_26 = var27_27.y;
                                        var39_39 = var45_45;
                                        cfr_temp_8 = var26_26 - 0.0f;
                                        var25_25 = (int)(cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1));
                                        if (var25_25 > 0) {
                                            var46_46 = var27_27.y;
                                            var45_45 = (int)var46_46;
                                            var28_28 = new AbsoluteSizeSpan(var45_45);
                                            var45_45 = var59_59.length();
                                            var40_40 = var23_23;
                                            var42_42 = var5_5;
                                            var23_23 = 0;
                                            var24_24 = 0.0f;
                                            var29_29 = null;
                                            var5_5 = 0xFF0000;
                                            var35_35 = 2.3418052E-38f;
                                            var59_59.setSpan(var28_28, 0, var45_45, var5_5);
                                        } else {
                                            var40_40 = var23_23;
                                            var42_42 = var5_5;
                                            var23_23 = 0;
                                            var24_24 = 0.0f;
                                            var29_29 = null;
                                        }
                                        var2_2 = new SpannableStringBuilder(var59_59);
                                        var5_5 = var27_27.w;
                                        var25_25 = 1;
                                        var26_26 = 1.4E-45f;
                                        if (var5_5 == var25_25) {
                                            var5_5 = var2_2.length();
                                            var36_36 = (StaticLayout)var2_2.getSpans(0, var5_5, ForegroundColorSpan.class);
                                            var23_23 = ((ForegroundColorSpan[])var36_36).length;
                                            var26_26 = 0.0f;
                                            var28_28 = null;
                                            for (var25_25 = 0; var25_25 < var23_23; ++var25_25) {
                                                var29_29 = var36_36[var25_25];
                                                var2_2.removeSpan((Object)var29_29);
                                                var24_24 = 1.4E-45f;
                                            }
                                        }
                                        if ((var23_23 = Color.alpha((int)var27_27.t)) <= 0) break block72;
                                        var23_23 = var27_27.w;
                                        if (var23_23 == 0) ** GOTO lbl-1000
                                        var5_5 = 2;
                                        var35_35 = 2.8E-45f;
                                        if (var23_23 != var5_5) {
                                            var5_5 = var27_27.t;
                                            var29_29 = new BackgroundColorSpan(var5_5);
                                            var5_5 = var2_2.length();
                                            var41_41 = var8_8;
                                            var8_8 = 0xFF0000;
                                            var47_47 = 2.3418052E-38f;
                                            var25_25 = 0;
                                            var26_26 = 0.0f;
                                            var28_28 = null;
                                            var2_2.setSpan((Object)var29_29, 0, var5_5, var8_8);
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var41_41 = var8_8;
                                            var8_8 = 0xFF0000;
                                            var47_47 = 2.3418052E-38f;
                                            var25_25 = 0;
                                            var26_26 = 0.0f;
                                            var28_28 = null;
                                            var5_5 = var27_27.t;
                                            var29_29 = new BackgroundColorSpan(var5_5);
                                            var5_5 = var59_59.length();
                                            var59_59.setSpan(var29_29, 0, var5_5, var8_8);
                                        }
                                        break block73;
                                    }
                                    var41_41 = var8_8;
                                }
                                var29_29 = var27_27.j;
                                if (var29_29 == null) {
                                    var29_29 = Layout.Alignment.ALIGN_CENTER;
                                }
                                var47_47 = var27_27.e;
                                var66_66 = true;
                                var26_26 = var27_27.d;
                                var27_27.E = var36_36 = new StaticLayout(var59_59, (TextPaint)var19_19, var14_14, var29_29, var26_26, var47_47, var66_66);
                                var5_5 = var36_36.getHeight();
                                var48_48 = var27_27.E;
                                var8_8 = var48_48.getLineCount();
                                var43_43 = var13_13;
                                var11_11 = 0;
                                var13_13 = 0.0f;
                                var26_26 = 0.0f;
                                var28_28 = null;
                                for (var25_25 = 0; var25_25 < var8_8; var25_25 += var45_45) {
                                    var63_63 = var8_8;
                                    var48_48 = var27_27.E;
                                    var47_47 = var48_48.getLineWidth(var25_25);
                                    var67_67 = var2_2;
                                    var64_64 = var56_56;
                                    var65_65 = var57_57;
                                    var68_68 = Math.ceil(var47_47);
                                    var11_11 = Math.max((int)var68_68, var11_11);
                                    var45_45 = 1;
                                    var46_46 = 1.4E-45f;
                                }
                                var67_67 = var2_2;
                                var64_64 = var56_56;
                                var65_65 = var57_57;
                                var46_46 = var27_27.q;
                                var56_56 = -8388609;
                                var57_57 = -3.4028235E38f;
                                cfr_temp_9 = var46_46 - var57_57;
                                var45_45 = (int)(cfr_temp_9 == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1));
                                if (var45_45 == 0 || var11_11 >= var14_14) {
                                    var14_14 = var11_11;
                                }
                                var14_14 += var16_16 /* !! */ ;
                                var46_46 = var27_27.o;
                                var8_8 = (int)(var46_46 == var57_57 ? 0 : (var46_46 > var57_57 ? 1 : -1));
                                if (var8_8 != 0) {
                                    var57_57 = (float)var7_7 * var46_46;
                                    var45_45 = Math.round(var57_57);
                                    var56_56 = var27_27.A;
                                    var45_45 += var56_56;
                                    var7_7 = var27_27.p;
                                    var8_8 = 1;
                                    var47_47 = 1.4E-45f;
                                    if (var7_7 != var8_8) {
                                        var8_8 = 2;
                                        var47_47 = 2.8E-45f;
                                        if (var7_7 == var8_8) {
                                            var45_45 -= var14_14;
                                        }
                                    } else {
                                        var8_8 = 2;
                                        var47_47 = 2.8E-45f;
                                        var45_45 = (var45_45 * 2 - var14_14) / var8_8;
                                    }
                                    var45_45 = Math.max(var45_45, var56_56);
                                    var56_56 = var27_27.C;
                                    var56_56 = Math.min(var14_14 += var45_45, var56_56);
                                } else {
                                    var8_8 = 2;
                                    var47_47 = 2.8E-45f;
                                    var7_7 = (var7_7 - var14_14) / var8_8;
                                    var45_45 = var27_27.A + var7_7;
                                    var56_56 = var45_45 + var14_14;
                                }
                                if ((var56_56 -= var45_45) <= 0) {
                                    var2_2 = "Skipped drawing subtitle cue (invalid horizontal positioning)";
                                    Cx.f((String)var2_2);
                                    ** continue;
                                }
                                var51_51 = var27_27.l;
                                var47_47 = -3.4028235E38f;
                                cfr_temp_10 = var51_51 - var47_47;
                                var8_8 = (int)(cfr_temp_10 == 0.0f ? 0 : (cfr_temp_10 > 0.0f ? 1 : -1));
                                if (var8_8 != 0) {
                                    var8_8 = var27_27.m;
                                    if (var8_8 == 0) {
                                        var47_47 = (float)var9_9 * var51_51;
                                        var7_7 = Math.round(var47_47);
                                        var8_8 = var27_27.B;
                                        var7_7 += var8_8;
                                        var8_8 = var27_27.n;
                                        var9_9 = 2;
                                        var50_50 = 2.8E-45f;
                                        if (var8_8 == var9_9) {
                                            var7_7 -= var5_5;
                                        } else {
                                            var11_11 = 1;
                                            var13_13 = 1.4E-45f;
                                            if (var8_8 == var11_11) {
                                                var7_7 = (var7_7 * 2 - var5_5) / var9_9;
                                            }
                                        }
                                        var8_8 = 0;
                                        var47_47 = 0.0f;
                                        var48_48 = null;
                                        var11_11 = 0;
                                        var13_13 = 0.0f;
                                    } else {
                                        var60_60 = var27_27.E;
                                        var8_8 = 0;
                                        var47_47 = 0.0f;
                                        var48_48 = null;
                                        var7_7 = var60_60.getLineBottom(0);
                                        var70_69 = var27_27.E;
                                        var9_9 = var70_69.getLineTop(0);
                                        var7_7 -= var9_9;
                                        var50_50 = var27_27.l;
                                        var11_11 = 0;
                                        var13_13 = 0.0f;
                                        cfr_temp_11 = var50_50 - 0.0f;
                                        var14_14 = (int)(cfr_temp_11 == 0.0f ? 0 : (cfr_temp_11 > 0.0f ? 1 : -1));
                                        if (var14_14 >= 0) {
                                            var51_51 = var7_7;
                                            var7_7 = Math.round(var50_50 *= var51_51);
                                            var9_9 = var27_27.B;
                                            var7_7 += var9_9;
                                        } else {
                                            var50_50 += var22_22;
                                            var51_51 = var7_7;
                                            var7_7 = Math.round(var50_50 *= var51_51);
                                            var9_9 = var27_27.D;
                                            var7_7 = var7_7 + var9_9 - var5_5;
                                        }
                                    }
                                    var9_9 = var7_7 + var5_5;
                                    var14_14 = var27_27.D;
                                    if (var9_9 > var14_14) {
                                        var7_7 = var14_14 - var5_5;
                                    } else {
                                        var5_5 = var27_27.B;
                                        if (var7_7 < var5_5) {
                                            var7_7 = var5_5;
                                        }
                                    }
                                } else {
                                    var8_8 = 0;
                                    var47_47 = 0.0f;
                                    var48_48 = null;
                                    var11_11 = 0;
                                    var13_13 = 0.0f;
                                    var7_7 = var27_27.D - var5_5;
                                    var35_35 = var9_9;
                                    var50_50 = var27_27.z;
                                    var5_5 = (int)(var35_35 *= var50_50);
                                    var7_7 -= var5_5;
                                }
                                var50_50 = var27_27.e;
                                var66_66 = true;
                                var12_12 = var27_27.d;
                                var27_27.E = var36_36 = new StaticLayout(var59_59, (TextPaint)var19_19, var56_56, var29_29, var12_12, var50_50, var66_66);
                                var71_70 = var27_27.e;
                                var50_50 = var27_27.d;
                                var27_27.F = var36_36 = new StaticLayout((CharSequence)var67_67, (TextPaint)var19_19, var56_56, var29_29, var50_50, var71_70, var66_66);
                                var27_27.G = var45_45;
                                var27_27.H = var7_7;
                                var27_27.I = var10_10;
                            }
                            var45_45 = var64_64;
                            var46_46 = var65_65;
                            var5_5 = 2;
                            var35_35 = 2.8E-45f;
                            break block74;
                        }
                        var64_64 = var56_56;
                        var65_65 = var57_57;
                        var43_43 = var13_13;
                        var8_8 = 0;
                        var47_47 = 0.0f;
                        var48_48 = null;
                        var11_11 = 0;
                        var13_13 = 0.0f;
                        var27_27.k.getClass();
                        var2_2 = var27_27.k;
                        var56_56 = var27_27.C;
                        var23_23 = var27_27.A;
                        var5_5 = var27_27.D;
                        var6_6 = var27_27.B;
                        var24_24 = var23_23;
                        var57_57 = var56_56 -= var23_23;
                        var51_51 = var27_27.o * var57_57 + var24_24;
                        var24_24 = var6_6;
                        var35_35 = var5_5 -= var6_6;
                        var71_70 = var27_27.l * var35_35 + var24_24;
                        var24_24 = var27_27.q;
                        var56_56 = Math.round(var57_57 *= var24_24);
                        var24_24 = var27_27.r;
                        var50_50 = -3.4028235E38f;
                        var9_9 = (int)(var24_24 == var50_50 ? 0 : (var24_24 > var50_50 ? 1 : -1));
                        if (var9_9 != 0) {
                            var45_45 = Math.round(var35_35 *= var24_24);
                        } else {
                            var24_24 = var56_56;
                            var5_5 = var2_2.getHeight();
                            var35_35 = var5_5;
                            var46_46 = var2_2.getWidth();
                            var35_35 = var35_35 / var46_46 * var24_24;
                            var45_45 = Math.round(var35_35);
                        }
                        var23_23 = var27_27.p;
                        var5_5 = 2;
                        var35_35 = 2.8E-45f;
                        if (var23_23 == var5_5) {
                            var24_24 = var56_56;
lbl545:
                            // 2 sources

                            while (true) {
                                var51_51 -= var24_24;
                                break;
                            }
                        } else {
                            var9_9 = 1;
                            var50_50 = 1.4E-45f;
                            if (var23_23 == var9_9) {
                                var23_23 = var56_56 / 2;
                                var24_24 = var23_23;
                                ** continue;
                            }
                        }
                        var23_23 = Math.round(var51_51);
                        var7_7 = var27_27.n;
                        if (var7_7 == var5_5) {
                            var51_51 = var45_45;
lbl558:
                            // 2 sources

                            while (true) {
                                var71_70 -= var51_51;
                                break;
                            }
                        } else {
                            var9_9 = 1;
                            var50_50 = 1.4E-45f;
                            if (var7_7 == var9_9) {
                                var7_7 = var45_45 / 2;
                                var51_51 = var7_7;
                                ** continue;
                            }
                        }
                        var6_6 = Math.round(var71_70);
                        var60_60 = new Rect(var23_23, var6_6, var56_56 += var23_23, var45_45 += var6_6);
                        var27_27.J = var60_60;
                        var45_45 = var64_64;
                        var46_46 = var65_65;
                    }
                    var27_27.a((Canvas)var4_4, (boolean)var45_45);
                    var45_45 = 1;
                    var46_46 = 1.4E-45f;
                }
                var17_17 = var44_44 + 1;
                var2_2 = this;
                var3_3 /* !! */  = var4_4;
                var4_4 = var31_31;
                var5_5 = var33_33;
                var10_10 = var34_34;
                var16_16 /* !! */  = var38_38;
                var13_13 = var43_43;
                var9_9 = var42_42;
                var8_8 = var41_41;
                var7_7 = var40_40;
                var6_6 = var39_39;
                var14_14 = 0;
                var12_12 = 0.0f;
                var15_15 = null;
            }
        }
    }
}

