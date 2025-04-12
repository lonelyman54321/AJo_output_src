/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.text.Layout
 *  android.text.Spannable
 *  android.text.SpannableString
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.LeadingMarginSpan$Standard
 *  android.text.style.ScaleXSpan
 */
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import androidx.emoji2.text.EmojiCompat;
import java.io.Serializable;
import java.text.BreakIterator;
import java.text.CharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class ii
implements vm2_0 {
    public final String a;
    public final xm3 b;
    public final List c;
    public final List d;
    public final RU0$a e;
    public final Vo0 f;
    public final kj_0 g;
    public final CharSequence h;
    public final Ip1 i;
    public qt3 j;
    public final boolean k;
    public final int l;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ii(String var1_1, xm3 var2_2, List var3_3, List var4_4, RU0$a var5_5, Vo0 var6_6) {
        block156: {
            block158: {
                block162: {
                    block153: {
                        block160: {
                            block159: {
                                block157: {
                                    block152: {
                                        block155: {
                                            block154: {
                                                var7_7 = this;
                                                var8_8 /* !! */  = var2_2;
                                                var9_9 = var3_3;
                                                var10_10 = var6_6;
                                                var11_11 = 2;
                                                var12_12 = 1;
                                                var13_13 = 1.4E-45f;
                                                super();
                                                var14_14 = var1_1;
                                                this.a = var1_1;
                                                this.b = var2_2;
                                                this.c = var3_3;
                                                var14_14 = var4_4;
                                                this.d = var4_4;
                                                var14_14 = var5_5;
                                                this.e = var5_5;
                                                this.f = var6_6;
                                                var15_15 = var6_6.getDensity();
                                                var14_14 = new TextPaint(var12_12);
                                                var14_14.density = var15_15;
                                                var16_16 = Jj3.b;
                                                var14_14.b = var16_16;
                                                var17_17 = 3;
                                                var15_15 = 4.2E-45f;
                                                var14_14.c = var17_17;
                                                var18_18 = b13_0.d;
                                                var14_14.d = var18_18;
                                                this.g = var14_14;
                                                var19_19 = ji.a(var2_2);
                                                var20_20 = 0;
                                                var21_21 = 0.0f;
                                                var22_22 /* !! */  = null;
                                                if (var19_19 == 0) {
                                                    var19_19 = 0;
                                                    var23_23 = 0.0f;
                                                    var18_18 = null;
                                                } else {
                                                    var18_18 = (Boolean)Ly0.a.a().getValue();
                                                    var19_19 = var18_18.booleanValue();
                                                }
                                                var7_7.k = var19_19;
                                                var18_18 = var8_8 /* !! */ .b;
                                                var24_24 = var18_18.b;
                                                var8_8 /* !! */  = var8_8 /* !! */ .a;
                                                var25_25 = var8_8 /* !! */ .k;
                                                var26_26 = 4;
                                                var27_27 = Pj3.a(var24_24, var26_26);
                                                var28_28 = 5;
                                                var29_29 = 7.0E-45f;
                                                if (var27_27 != 0) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        var24_24 = 2;
                                                        var30_30 = 2.8E-45f;
                                                        break block152;
                                                        break;
                                                    }
                                                }
                                                var27_27 = Pj3.a(var24_24, var28_28);
                                                if (var27_27 != 0) {
                                                    while (true) {
                                                        var24_24 = 3;
                                                        var30_30 = 4.2E-45f;
                                                        break block152;
                                                        break;
                                                    }
                                                }
                                                var27_27 = Pj3.a(var24_24, var12_12);
                                                if (var27_27 == 0) break block154;
                                                var24_24 = 0;
                                                var30_30 = 0.0f;
                                                var31_31 = null;
                                                break block152;
                                            }
                                            var27_27 = Pj3.a(var24_24, var11_11);
                                            if (var27_27 == 0) break block155;
                                            var24_24 = 1;
                                            var30_30 = 1.4E-45f;
                                            break block152;
                                        }
                                        var27_27 = Pj3.a(var24_24, var17_17);
                                        if (var27_27 != 0) {
                                            var24_24 = 1;
                                            var30_30 = 1.4E-45f;
                                        } else {
                                            var27_27 = -1 << -1;
                                            var32_32 = -0.0f;
                                            var24_24 = (int)Pj3.a(var24_24, var27_27);
                                        }
                                        if (var24_24 != 0) {
                                            if (var25_25 == null || (var31_31 = var25_25.a().a) == null) {
                                                var31_31 = Locale.getDefault();
                                            }
                                            if ((var24_24 = TextUtils.getLayoutDirectionFromLocale((Locale)var31_31)) != 0 && var24_24 == var12_12) ** continue;
                                            ** continue;
                                        }
                                        break block156;
                                    }
                                    var7_7.l = var24_24;
                                    var31_31 = new ii$a(var7_7);
                                    var18_18 = var18_18.i;
                                    if (var18_18 == null) {
                                        var18_18 = im3_0.c;
                                    }
                                    var33_33 = (var33_33 = var18_18.b) != 0 ? var14_14.getFlags() | 128 : var14_14.getFlags() & -129;
                                    var14_14.setFlags(var33_33);
                                    var19_19 = var18_18.a;
                                    if (var19_19 == var12_12) {
                                        var33_33 = 1;
                                        var34_34 = 1.4E-45f;
                                    } else {
                                        var33_33 = 0;
                                        var34_34 = 0.0f;
                                        var25_25 = null;
                                    }
                                    if (var33_33 != 0) {
                                        var19_19 = var14_14.getFlags() | 64;
                                        var14_14.setFlags(var19_19);
                                        var14_14.setHinting(0);
                                    } else {
                                        if (var19_19 == var11_11) {
                                            var33_33 = 1;
                                            var34_34 = 1.4E-45f;
                                        } else {
                                            var33_33 = 0;
                                            var34_34 = 0.0f;
                                            var25_25 = null;
                                        }
                                        if (var33_33 != 0) {
                                            var14_14.getFlags();
                                            var14_14.setHinting(var12_12);
                                        } else {
                                            if (var19_19 == var17_17) {
                                                var19_19 = 1;
                                                var23_23 = 1.4E-45f;
                                            } else {
                                                var19_19 = 0;
                                                var23_23 = 0.0f;
                                                var18_18 = null;
                                            }
                                            if (var19_19 != 0) {
                                                var14_14.getFlags();
                                                var14_14.setHinting(0);
                                            } else {
                                                var14_14.getFlags();
                                            }
                                        }
                                    }
                                    var18_18 = var9_9;
                                    var18_18 = (Collection)var9_9;
                                    var19_19 = var18_18.isEmpty() ^ var12_12;
                                    var35_35 = var8_8 /* !! */ .b;
                                    var37_36 = Dm3.b(var35_35);
                                    var39_37 = 0x100000000L;
                                    var41_38 = 2.121995791E-314;
                                    var43_39 = Fm3.a(var37_36, var39_37);
                                    var44_40 = 0x200000000L;
                                    var46_41 = var19_19;
                                    var47_42 = var8_8 /* !! */ .b;
                                    if (var43_39) {
                                        var15_15 = var10_10.h0(var47_42);
                                        var14_14.setTextSize(var15_15);
                                    } else {
                                        var33_33 = (int)Fm3.a(var37_36, var44_40);
                                        if (var33_33 != 0) {
                                            var34_34 = var14_14.getTextSize();
                                            var15_15 = Dm3.c(var47_42) * var34_34;
                                            var14_14.setTextSize(var15_15);
                                        }
                                    }
                                    var16_16 = var8_8 /* !! */ .c;
                                    var18_18 = var8_8 /* !! */ .d;
                                    var25_25 = var8_8 /* !! */ .f;
                                    if (var25_25 == null && var18_18 == null && var16_16 == null) {
                                        var26_26 = 0;
                                        var49_43 /* !! */  = null;
                                    } else {
                                        var26_26 = 1;
                                    }
                                    if (var26_26 != 0) {
                                        if (var16_16 == null) {
                                            var16_16 = tv0_0.m;
                                        }
                                        if (var18_18 != null) {
                                            var19_19 = var18_18.a;
                                        } else {
                                            var19_19 = 0;
                                            var23_23 = 0.0f;
                                            var18_18 = null;
                                        }
                                        var49_43 /* !! */  = var8_8 /* !! */ .e;
                                        var26_26 = var49_43 /* !! */  != null ? var49_43 /* !! */ .a : 1;
                                        var22_22 /* !! */  = var31_31.c;
                                        var50_44 = var22_22 /* !! */ .e.a((RU0)var25_25, (tv0_0)var16_16, var19_19, var26_26);
                                        var17_17 = var50_44 instanceof xt3$b;
                                        var18_18 = "null cannot be cast to non-null type android.graphics.Typeface";
                                        if (var17_17 == 0) {
                                            var25_25 = var22_22 /* !! */ .j;
                                            var22_22 /* !! */ .j = var16_16 = new qt3((ib3_0)var50_44, (qt3)var25_25);
                                            var50_44 = var16_16.c;
                                            Intrinsics.checkNotNull(var50_44, (String)var18_18);
                                            var50_44 = (Typeface)var50_44;
                                        } else {
                                            var50_44 = ((xt3$b)var50_44).a;
                                            Intrinsics.checkNotNull(var50_44, (String)var18_18);
                                            var50_44 = (Typeface)var50_44;
                                        }
                                        var14_14.setTypeface((Typeface)var50_44);
                                    }
                                    if ((var50_44 = var8_8 /* !! */ .k) != null) {
                                        var16_16 = iw1.c;
                                        var16_16 = jt2_0.a;
                                        var18_18 = var16_16.a();
                                        var19_19 = (int)Intrinsics.areEqual(var50_44, var18_18);
                                        if (var19_19 == 0) {
                                            var19_19 = Build.VERSION.SDK_INT;
                                            var20_20 = 24;
                                            var21_21 = 3.4E-44f;
                                            if (var19_19 >= var20_20) {
                                                var16_16 = mw1.a;
                                                var16_16.b((kj_0)var14_14, (iw1)var50_44);
                                            } else {
                                                var18_18 = var50_44.a;
                                                var19_19 = (int)var18_18.isEmpty();
                                                var50_44 = var19_19 != 0 ? var16_16.a().a() : var50_44.a();
                                                var50_44 = var50_44.a;
                                                var14_14.setTextLocale((Locale)var50_44);
                                            }
                                        }
                                    }
                                    if ((var50_44 = var8_8 /* !! */ .g) != null && (var17_17 = (int)Intrinsics.areEqual(var50_44, var16_16 = "")) == 0) {
                                        var14_14.setFontFeatureSettings((String)var50_44);
                                    }
                                    if ((var50_44 = var8_8 /* !! */ .j) != null && (var17_17 = (int)Intrinsics.areEqual(var50_44, var16_16 = tl3_0.c)) == 0) {
                                        var15_15 = var14_14.getTextScaleX();
                                        var23_23 = var50_44.a;
                                        var14_14.setTextScaleX(var15_15 *= var23_23);
                                        var15_15 = var14_14.getTextSkewX();
                                        var13_13 = var50_44.b;
                                        var14_14.setTextSkewX(var15_15 += var13_13);
                                    }
                                    var50_44 = var8_8 /* !! */ .a;
                                    var47_42 = var50_44.a();
                                    var14_14.d(var47_42);
                                    var16_16 = var50_44.d();
                                    var13_13 = var50_44.getAlpha();
                                    var51_45 = 9205357640488583168L;
                                    var14_14.c((ZD)var16_16, var51_45, var13_13);
                                    var50_44 = var8_8 /* !! */ .n;
                                    var14_14.f((b13_0)var50_44);
                                    var50_44 = var8_8 /* !! */ .m;
                                    var14_14.g((Jj3)var50_44);
                                    var50_44 = var8_8 /* !! */ .p;
                                    var14_14.e((Qt0)var50_44);
                                    var47_42 = var8_8 /* !! */ .h;
                                    var37_36 = Dm3.b(var47_42);
                                    var12_12 = (int)Fm3.a(var37_36, var39_37);
                                    var20_20 = 0;
                                    var21_21 = 0.0f;
                                    var22_22 /* !! */  = null;
                                    if (var12_12 != 0 && (var12_12 = (int)((cfr_temp_0 = (var13_13 = Dm3.c(var47_42)) - 0.0f) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1))) != 0) {
                                        var13_13 = var14_14.getTextSize();
                                        var34_34 = var14_14.getTextScaleX() * var13_13;
                                        var53_46 = var10_10.h0(var47_42);
                                        cfr_temp_1 = var34_34 - 0.0f;
                                        var12_12 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                                        if (var12_12 != 0) {
                                            var14_14.setLetterSpacing(var53_46 /= var34_34);
                                        }
                                    } else {
                                        var37_36 = Dm3.b(var47_42);
                                        var54_47 = (int)Fm3.a(var37_36, var44_40);
                                        if (var54_47 != 0) {
                                            var53_46 = Dm3.c(var47_42);
                                            var14_14.setLetterSpacing(var53_46);
                                        }
                                    }
                                    if (var46_41 != 0 && (var54_47 = Fm3.a(var55_48 = Dm3.b(var47_42), var39_37)) != 0 && (var54_47 = (cfr_temp_2 = (var53_46 = Dm3.c(var47_42)) - 0.0f) == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1)) != 0) {
                                        var54_47 = 1;
                                        var53_46 = 1.4E-45f;
                                    } else {
                                        var54_47 = 0;
                                        var53_46 = 0.0f;
                                        var10_10 = null;
                                    }
                                    var55_48 = OX.l;
                                    var37_36 = var8_8 /* !! */ .l;
                                    var46_41 = (int)OX.c(var37_36, var55_48);
                                    if (var46_41 == 0 && (var27_27 = (int)OX.c(var37_36, var44_40 = OX.k)) == 0) {
                                        var27_27 = 1;
                                        var32_32 = 1.4E-45f;
                                    } else {
                                        var27_27 = 0;
                                        var32_32 = 0.0f;
                                        var57_49 /* !! */  = null;
                                    }
                                    var8_8 /* !! */  = var8_8 /* !! */ .i;
                                    if (var8_8 /* !! */  != null && (var28_28 = Float.compare(var29_29 = var8_8 /* !! */ .a, 0.0f)) != 0) {
                                        var28_28 = 1;
                                        var29_29 = 1.4E-45f;
                                    } else {
                                        var28_28 = 0;
                                        var29_29 = 0.0f;
                                        var58_50 = null;
                                    }
                                    var46_41 = 0;
                                    if (var54_47 == 0 && var27_27 == 0 && var28_28 == 0) {
                                        var59_51 = 0;
                                        var8_8 /* !! */  = null;
                                        var60_52 = 0.0f;
                                    } else {
                                        if (var54_47 != 0) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var47_42 = Dm3.c;
                                        ** continue;
                                        var61_53 = var47_42;
                                        var63_54 = var27_27 != 0 ? var37_36 : var55_48;
                                        var65_55 /* !! */  = var28_28 != 0 ? var8_8 /* !! */  : null;
                                        var66_56 /* !! */  = var8_8 /* !! */ ;
                                        var67_57 = 0L;
                                        var69_58 = 0L;
                                        var71_59 = 0.0f;
                                        var72_60 = 0;
                                        var73_61 = null;
                                        var74_62 = 63103;
                                        var8_8 /* !! */  = new S93(var67_57, var69_58, null, null, null, null, null, var61_53, (Rw)var65_55 /* !! */ , null, null, var63_54, null, null, var74_62);
                                    }
                                    if (var8_8 /* !! */  != null) {
                                        var75_63 = var3_3.size();
                                        var54_47 = 1;
                                        var53_46 = 1.4E-45f;
                                        super(var75_63 += var54_47);
                                        var13_13 = 0.0f;
                                        var50_44 = null;
                                        for (var12_12 = 0; var12_12 < var75_63; var12_12 += var17_17) {
                                            if (var12_12 == 0) {
                                                var16_16 = var7_7.a;
                                                var17_17 = var16_16.length();
                                                var19_19 = 0;
                                                var23_23 = 0.0f;
                                                var18_18 = null;
                                                var14_14 = new Sl$b(0, var17_17, var8_8 /* !! */ );
                                                var17_17 = 1;
                                                var15_15 = 1.4E-45f;
                                            } else {
                                                var14_14 = var7_7.c;
                                                var17_17 = 1;
                                                var15_15 = 1.4E-45f;
                                                var19_19 = var12_12 + -1;
                                                var14_14 = (Sl$b)var14_14.get(var19_19);
                                            }
                                            var10_10.add(var14_14);
                                        }
                                        var9_9 = var10_10;
                                    }
                                    var8_8 /* !! */  = var7_7.a;
                                    var10_10 = var7_7.g;
                                    var53_46 = var10_10.getTextSize();
                                    var50_44 = var7_7.b;
                                    var14_14 = var7_7.d;
                                    var16_16 = var7_7.f;
                                    var19_19 = (int)var7_7.k;
                                    var25_25 = hi.a;
                                    if (var19_19 != 0 && (var19_19 = (int)EmojiCompat.c()) != 0) {
                                        var18_18 = var50_44.c;
                                        if (var18_18 != null && (var18_18 = var18_18.b) != null) {
                                            var19_19 = var18_18.b;
                                            var25_25 = new Uy0(var19_19);
                                        } else {
                                            var33_33 = 0;
                                            var25_25 = null;
                                            var34_34 = 0.0f;
                                        }
                                        if (var25_25 == null) {
                                            while (true) {
                                                var19_19 = 0;
                                                var23_23 = 0.0f;
                                                var18_18 = null;
                                                break;
                                            }
                                        } else {
                                            var19_19 = var25_25.a;
                                            var33_33 = 2;
                                            var34_34 = 2.8E-45f;
                                            if (var19_19 != var33_33) ** continue;
                                            var19_19 = 1;
                                            var23_23 = 1.4E-45f;
                                        }
                                        var25_25 = EmojiCompat.a();
                                        var26_26 = var8_8 /* !! */ .length();
                                        var27_27 = 0;
                                        var32_32 = 0.0f;
                                        var57_49 /* !! */  = null;
                                        var18_18 = var25_25.g((CharSequence)var8_8 /* !! */ , 0, var26_26, var19_19);
                                        Intrinsics.checkNotNull(var18_18);
                                    } else {
                                        var18_18 = var8_8 /* !! */ ;
                                    }
                                    var33_33 = (int)var9_9.isEmpty();
                                    if (var33_33 == 0 || (var33_33 = (int)var14_14.isEmpty()) == 0 || (var33_33 = (int)Intrinsics.areEqual(var25_25 = var50_44.b.d, var49_43 /* !! */  = vl3_0.c)) == 0) break block157;
                                    var25_25 = var50_44.b;
                                    var37_36 = var25_25.c;
                                    var33_33 = (int)Em3.g(var37_36);
                                    if (var33_33 != 0) break block158;
                                }
                                var18_18 = (var33_33 = var18_18 instanceof Spannable) != 0 ? (Spannable)var18_18 : (var25_25 = new SpannableString((CharSequence)var18_18));
                                var25_25 = var50_44.a.m;
                                var49_43 /* !! */  = Jj3.c;
                                var33_33 = (int)Intrinsics.areEqual(var25_25, var49_43 /* !! */ );
                                if (var33_33 != 0) {
                                    var25_25 = hi.a;
                                    var59_51 = var8_8 /* !! */ .length();
                                    var26_26 = 0;
                                    var49_43 /* !! */  = null;
                                    var27_27 = 33;
                                    var32_32 = 4.6E-44f;
                                    var18_18.setSpan(var25_25, 0, var59_51, var27_27);
                                }
                                if ((var25_25 = var50_44.c) != null && (var25_25 = var25_25.b) != null) {
                                    var33_33 = (int)var25_25.a;
                                } else {
                                    var33_33 = 0;
                                    var34_34 = 0.0f;
                                    var25_25 = null;
                                }
                                var49_43 /* !! */  = var50_44.b;
                                if (var33_33 != 0 && (var25_25 = var49_43 /* !! */ .f) == null) {
                                    var44_40 = var49_43 /* !! */ .c;
                                    var34_34 = Y93.a(var44_40, var53_46, (Vo0)var16_16);
                                    var27_27 = (int)Float.isNaN(var34_34);
                                    if (var27_27 == 0) {
                                        var57_49 /* !! */  = new xu1_0(var34_34);
                                        var33_33 = var18_18.length();
                                        var59_51 = 0;
                                        var60_52 = 0.0f;
                                        var8_8 /* !! */  = null;
                                        var28_28 = 33;
                                        var29_29 = 4.6E-44f;
                                        var18_18.setSpan(var57_49 /* !! */ , 0, var33_33, var28_28);
                                    }
lbl400:
                                    // 4 sources

                                    while (true) {
                                        var33_33 = 0;
                                        var34_34 = 0.0f;
                                        var25_25 = null;
                                        break block153;
                                        break;
                                    }
                                }
                                var25_25 = var49_43 /* !! */ .f;
                                if (var25_25 == null) {
                                    var25_25 = yu1_1.c;
                                }
                                ** while ((var27_27 = (int)Float.isNaN((float)(var76_64 = Y93.a((long)(var44_40 = var49_43 /* !! */ .c), (float)var53_46, (Vo0)var16_16)))) != 0)
lbl409:
                                // 1 sources

                                var27_27 = var18_18.length();
                                if (var27_27 == 0) break block159;
                                var27_27 = le3_2.D((CharSequence)var18_18);
                                var28_28 = 10;
                                var29_29 = 1.4E-44f;
                                if (var27_27 != var28_28) break block160;
                            }
                            var27_27 = var18_18.length();
                            var28_28 = 1;
                            var29_29 = 1.4E-45f;
                            var27_27 += var28_28;
lbl420:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var28_28 = 1;
                        var29_29 = 1.4E-45f;
                        var27_27 = var18_18.length();
                        ** while (true)
                        var77_65 = var27_27;
                        var59_51 = var25_25.b;
                        var78_66 = var59_51 & 1;
                        if (var78_66 > 0) {
                            var79_67 = true;
                            var80_68 = 1.4E-45f;
                        } else {
                            var79_67 = false;
                            var80_68 = 0.0f;
                        }
                        var81_69 = (var59_51 &= 16) > 0 ? 1 : 0;
                        var60_52 = var25_25.a;
                        var66_56 /* !! */  = var57_49 /* !! */ ;
                        var71_59 = var60_52;
                        super(var76_64, var77_65, var79_67, (boolean)var81_69, var60_52);
                        var59_51 = var18_18.length();
                        var33_33 = 0;
                        var34_34 = 0.0f;
                        var25_25 = null;
                        var28_28 = 33;
                        var29_29 = 4.6E-44f;
                        var18_18.setSpan(var57_49 /* !! */ , 0, var59_51, var28_28);
                    }
                    var49_43 /* !! */  = var49_43 /* !! */ .d;
                    if (var49_43 /* !! */  != null) {
                        var44_40 = Em3.f(0);
                        var4_4 = var31_31;
                        var82_70 = var49_43 /* !! */ .a;
                        var27_27 = (int)Dm3.a(var82_70, var44_40);
                        var3_3 = var9_9;
                        var84_71 = var49_43 /* !! */ .b;
                        if ((var27_27 == 0 || (var33_33 = (int)Dm3.a(var84_71, var35_35 = Em3.f(0))) == 0) && (var33_33 = (int)Em3.g(var82_70)) == 0 && (var33_33 = (int)Em3.g(var84_71)) == 0) {
                            var37_36 = Dm3.b(var82_70);
                            var27_27 = (int)Fm3.a(var37_36, var39_37);
                            if (var27_27 != 0) {
                                var21_21 = var16_16.h0(var82_70);
                                var39_37 = 0x200000000L;
                                var41_38 = 4.243991582E-314;
                            } else {
                                var39_37 = 0x200000000L;
                                var41_38 = 4.243991582E-314;
                                var33_33 = (int)Fm3.a(var37_36, var39_37);
                                if (var33_33 != 0) {
                                    var21_21 = Dm3.c(var82_70) * var53_46;
                                } else {
                                    var20_20 = 0;
                                    var21_21 = 0.0f;
                                    var22_22 /* !! */  = null;
                                }
                            }
                            var86_72 = Dm3.b(var84_71);
                            var35_35 = 0x100000000L;
                            var88_73 = Fm3.a(var86_72, var35_35);
                            if (var88_73 != 0) {
                                var60_52 = var16_16.h0(var84_71);
                            } else {
                                var24_24 = (int)Fm3.a(var86_72, var39_37);
                                if (var24_24 != 0) {
                                    var60_52 = Dm3.c(var84_71) * var53_46;
                                } else {
                                    var59_51 = 0;
                                    var60_52 = 0.0f;
                                    var8_8 /* !! */  = null;
                                }
                            }
                            var89_74 = Math.ceil(var21_21);
                            var54_47 = (int)var89_74;
                            var41_38 = Math.ceil(var60_52);
                            var60_52 = (float)var41_38;
                            var59_51 = (int)var60_52;
                            var9_9 = new LeadingMarginSpan.Standard(var54_47, var59_51);
                            var59_51 = var18_18.length();
                            var54_47 = 0;
                            var53_46 = 0.0f;
                            var10_10 = null;
                            var91_75 = 33;
                            var18_18.setSpan(var9_9, 0, var59_51, var91_75);
                        }
                    } else {
                        var3_3 = var9_9;
                        var4_4 = var31_31;
                    }
                    var54_47 = var3_3.size();
                    var9_9 = new ArrayList(var54_47);
                    var54_47 = var3_3.size();
                    var92_76 /* !! */  = null;
                    for (var91_75 = 0; var91_75 < var54_47; var91_75 += var20_20) {
                        var93_77 /* !! */  = var3_3;
                        var22_22 /* !! */  = var3_3.get(var91_75);
                        var31_31 = var22_22 /* !! */ ;
                        var25_25 = var31_31 = ((Sl$b)var22_22 /* !! */ ).a;
                        var25_25 = (S93)var31_31;
                        var49_43 /* !! */  = var25_25.f;
                        if (var49_43 /* !! */  == null && (var49_43 /* !! */  = var25_25.d) == null && (var25_25 = var25_25.c) == null) {
                            var33_33 = 0;
                            var34_34 = 0.0f;
                            var25_25 = null;
                        } else {
                            var33_33 = 1;
                            var34_34 = 1.4E-45f;
                        }
                        if (var33_33 == 0 && (var31_31 = ((S93)var31_31).e) == null) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var9_9.add(var22_22 /* !! */ );
                        ** continue;
                        var20_20 = 1;
                        var21_21 = 1.4E-45f;
                        var3_3 = var93_77 /* !! */ ;
                    }
                    var93_77 /* !! */  = var3_3;
                    var10_10 = var50_44.a;
                    var92_76 /* !! */  = var10_10.f;
                    if (var92_76 /* !! */  == null && (var50_44 = var10_10.d) == null && (var50_44 = var10_10.c) == null) {
                        var12_12 = 0;
                        var13_13 = 0.0f;
                        var50_44 = null;
                    } else {
                        var12_12 = 1;
                        var13_13 = 1.4E-45f;
                    }
                    if (var12_12 == 0 && (var50_44 = var10_10.e) == null) {
                        var12_12 = 0;
                        var50_44 = null;
                        var13_13 = 0.0f;
                    } else {
                        var94_78 = (char)-61;
                        var61_53 = 0L;
                        var95_79 = 0L;
                        var73_61 = var10_10.c;
                        var22_22 /* !! */  = var10_10.d;
                        var10_10 = var10_10.e;
                        var97_80 = 0L;
                        var99_81 = 0L;
                        var50_44 = new S93(var61_53, var95_79, var73_61, (nV0)var22_22 /* !! */ , (oV0)var10_10, (RU0)var92_76 /* !! */ , null, var97_80, null, null, null, var99_81, null, null, var94_78);
                    }
                    var92_76 /* !! */  = var4_4;
                    var10_10 = new X93((Spannable)var18_18, (ii$a)var4_4);
                    var91_75 = var9_9.size();
                    var20_20 = 1;
                    var21_21 = 1.4E-45f;
                    if (var91_75 <= var20_20) {
                        var91_75 = var9_9.isEmpty() ^ var20_20;
                        if (var91_75 != 0) {
                            var91_75 = 0;
                            var92_76 /* !! */  = null;
                            var22_22 /* !! */  = (S93)((Sl$b)var9_9.get((int)0)).a;
                            if (var50_44 != null) {
                                var22_22 /* !! */  = var50_44.c((S93)var22_22 /* !! */ );
                            }
                            var12_12 = ((Sl$b)var9_9.get((int)0)).b;
                            var50_44 = var12_12;
                            var75_63 = ((Sl$b)var9_9.get((int)0)).c;
                            var9_9 = var75_63;
                            var10_10.invoke(var22_22 /* !! */ , var50_44, var9_9);
                        }
                    } else {
                        var91_75 = var9_9.size();
                        var20_20 = 2;
                        var21_21 = 2.8E-45f;
                        var24_24 = var91_75 * 2;
                        var22_22 /* !! */  = new Integer[var24_24];
                        var34_34 = 0.0f;
                        var25_25 = null;
                        for (var33_33 = 0; var33_33 < var24_24; var33_33 += var27_27) {
                            var26_26 = 0;
                            var49_43 /* !! */  = null;
                            var22_22 /* !! */ [var33_33] = var57_49 /* !! */  = Integer.valueOf(0);
                            var27_27 = 1;
                            var32_32 = 1.4E-45f;
                        }
                        var26_26 = 0;
                        var49_43 /* !! */  = null;
                        var33_33 = var9_9.size();
                        var32_32 = 0.0f;
                        var57_49 /* !! */  = null;
                        for (var27_27 = 0; var27_27 < var33_33; var27_27 += var59_51) {
                            var58_50 = (Sl$b)var9_9.get(var27_27);
                            var8_8 /* !! */  = var58_50.b;
                            var22_22 /* !! */ [var27_27] = var8_8 /* !! */ ;
                            var59_51 = var27_27 + var91_75;
                            var28_28 = var58_50.c;
                            var22_22 /* !! */ [var59_51] = var58_50 = Integer.valueOf(var28_28);
                            var59_51 = 1;
                            var60_52 = 1.4E-45f;
                        }
                        var59_51 = 1;
                        var60_52 = 1.4E-45f;
                        var92_76 /* !! */  = var22_22 /* !! */ ;
                        var92_76 /* !! */  = var22_22 /* !! */ ;
                        var25_25 = "<this>";
                        Intrinsics.checkNotNullParameter(var92_76 /* !! */ , (String)var25_25);
                        var33_33 = var92_76 /* !! */ .length;
                        if (var33_33 > var59_51) {
                            Arrays.sort((Object[])var92_76 /* !! */ );
                        }
                        var8_8 /* !! */  = (Number)tp_2.z(var22_22 /* !! */ );
                        var59_51 = var8_8 /* !! */ .intValue();
                        var92_76 /* !! */  = null;
                        for (var91_75 = 0; var91_75 < var24_24; var91_75 += var75_63) {
                            var25_25 = var22_22 /* !! */ [var91_75];
                            var27_27 = var25_25.intValue();
                            if (var27_27 == var59_51) {
                                var6_6 = var9_9;
                                var3_3 = var50_44;
                                var66_56 /* !! */  = var22_22 /* !! */ ;
                                var101_82 = var24_24;
                                var75_63 = 1;
                            } else {
                                var28_28 = var9_9.size();
                                var3_3 = var50_44;
                                while (var26_26 < var28_28) {
                                    var66_56 /* !! */  = var9_9.get(var26_26);
                                    var6_6 = var9_9;
                                    var9_9 = var66_56 /* !! */ ;
                                    var9_9 = (Sl$b)var66_56 /* !! */ ;
                                    var66_56 /* !! */  = var22_22 /* !! */ ;
                                    var20_20 = var9_9.b;
                                    var101_82 = var24_24;
                                    var24_24 = var9_9.c;
                                    if (var20_20 != var24_24 && (var20_20 = (int)Tl.c(var59_51, var27_27, var20_20, var24_24)) != 0) {
                                        var9_9 = (S93)var9_9.a;
                                        if (var50_44 == null) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                var50_44 = var9_9;
                                                break;
                                            }
                                        } else {
                                            var9_9 = var50_44.c((S93)var9_9);
                                            ** continue;
                                        }
                                    }
                                    var75_63 = 1;
                                    var26_26 += var75_63;
                                    var9_9 = var6_6;
                                    var22_22 /* !! */  = var66_56 /* !! */ ;
                                    var24_24 = var101_82;
                                }
                                var6_6 = var9_9;
                                var66_56 /* !! */  = var22_22 /* !! */ ;
                                var101_82 = var24_24;
                                var75_63 = 1;
                                if (var50_44 != null) {
                                    var8_8 /* !! */  = var59_51;
                                    var10_10.invoke(var50_44, var8_8 /* !! */ , var25_25);
                                }
                                var59_51 = var27_27;
                            }
                            var50_44 = var3_3;
                            var9_9 = var6_6;
                            var22_22 /* !! */  = var66_56 /* !! */ ;
                            var24_24 = var101_82;
                            var26_26 = 0;
                            var49_43 /* !! */  = null;
                        }
                    }
                    var59_51 = var93_77 /* !! */ .size();
                    var75_63 = 0;
                    var9_9 = null;
                    var54_47 = 0;
                    var53_46 = 0.0f;
                    var10_10 = null;
                    while (var75_63 < var59_51) {
                        block161: {
                            var92_76 /* !! */  = (Sl$b)var93_77 /* !! */ .get(var75_63);
                            var12_12 = var92_76 /* !! */ .b;
                            if (var12_12 >= 0 && var12_12 < (var20_20 = var18_18.length()) && (var20_20 = var92_76 /* !! */ .c) > var12_12 && var20_20 <= (var12_12 = var18_18.length())) break block161;
                            var102_83 = var59_51;
                            var91_75 = var75_63;
                            var33_33 = 0;
                            var34_34 = 0.0f;
                            var25_25 = null;
                            ** GOTO lbl-1000
                        }
                        var50_44 = (S93)var92_76 /* !! */ .a;
                        var22_22 /* !! */  = var50_44.i;
                        var24_24 = var92_76 /* !! */ .b;
                        var91_75 = var92_76 /* !! */ .c;
                        if (var22_22 /* !! */  != null) {
                            var21_21 = var22_22 /* !! */ .a;
                            var25_25 = new Sw(var21_21);
                            var20_20 = 33;
                            var21_21 = 4.6E-44f;
                            var18_18.setSpan(var25_25, var24_24, var91_75, var20_20);
                        }
                        var25_25 = var50_44.a;
                        var35_35 = var25_25.a();
                        Y93.b((Spannable)var18_18, var35_35, var24_24, var91_75);
                        var49_43 /* !! */  = var25_25.d();
                        var34_34 = var25_25.getAlpha();
                        if (var49_43 /* !! */  != null) {
                            var27_27 = var49_43 /* !! */  instanceof i93_0;
                            if (var27_27 != 0) {
                                var49_43 /* !! */  = (i93_0)var49_43 /* !! */ ;
                                var37_36 = var49_43 /* !! */ .a;
                                Y93.b((Spannable)var18_18, var37_36, var24_24, var91_75);
                            } else {
                                var49_43 /* !! */  = (Z03)var49_43 /* !! */ ;
                                var57_49 /* !! */  = new a13_0((Z03)var49_43 /* !! */ , var34_34);
                                var20_20 = 33;
                                var21_21 = 4.6E-44f;
                                var18_18.setSpan(var57_49 /* !! */ , var24_24, var91_75, var20_20);
                            }
                        }
                        if ((var25_25 = var50_44.m) != null) {
                            var33_33 = var25_25.a;
                            var27_27 = 1;
                            var32_32 = 1.4E-45f;
                            var28_28 = var33_33 | 1;
                            if (var28_28 == var33_33) {
                                var27_27 = 1;
                                var32_32 = 1.4E-45f;
lbl718:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var27_27 = 0;
                            var32_32 = 0.0f;
                            var57_49 /* !! */  = null;
                            ** continue;
                            var28_28 = 2;
                            var29_29 = 2.8E-45f;
                            var20_20 = var33_33 | 2;
                            if (var20_20 == var33_33) {
                                var20_20 = 1;
                                var21_21 = 1.4E-45f;
                            } else {
                                var20_20 = 0;
                                var21_21 = 0.0f;
                                var22_22 /* !! */  = null;
                            }
                            var49_43 /* !! */  = new kj3_0((boolean)var27_27, (boolean)var20_20);
                            var20_20 = 33;
                            var21_21 = 4.6E-44f;
                            var18_18.setSpan(var49_43 /* !! */ , var24_24, var91_75, var20_20);
                        }
                        var37_36 = var50_44.b;
                        var66_56 /* !! */  = var18_18;
                        var67_57 = var37_36;
                        var81_69 = var24_24;
                        Y93.c((Spannable)var18_18, var37_36, (Vo0)var16_16, var24_24, var91_75);
                        var25_25 = var50_44.g;
                        if (var25_25 != null) {
                            var49_43 /* !! */  = new YU0((String)var25_25);
                            var20_20 = 33;
                            var21_21 = 4.6E-44f;
                            var18_18.setSpan(var49_43 /* !! */ , var24_24, var91_75, var20_20);
                        } else {
                            var20_20 = 33;
                            var21_21 = 4.6E-44f;
                        }
                        var25_25 = var50_44.j;
                        if (var25_25 != null) {
                            var32_32 = var25_25.a;
                            var49_43 /* !! */  = new ScaleXSpan(var32_32);
                            var18_18.setSpan(var49_43 /* !! */ , var24_24, var91_75, var20_20);
                            var34_34 = var25_25.b;
                            var49_43 /* !! */  = new a73(var34_34);
                            var18_18.setSpan(var49_43 /* !! */ , var24_24, var91_75, var20_20);
                        }
                        var25_25 = var50_44.k;
                        Y93.d((Spannable)var18_18, (iw1)var25_25, var24_24, var91_75);
                        var37_36 = 16;
                        var44_40 = var50_44.l;
                        var78_66 = (int)(var44_40 == var37_36 ? 0 : (var44_40 < var37_36 ? -1 : 1));
                        if (var78_66 != 0) {
                            var26_26 = zx_0.i(var44_40);
                            var25_25 = new BackgroundColorSpan(var26_26);
                            var20_20 = 33;
                            var21_21 = 4.6E-44f;
                            var18_18.setSpan(var25_25, var24_24, var91_75, var20_20);
                        }
                        if ((var25_25 = var50_44.n) != null) {
                            var44_40 = var25_25.a;
                            var27_27 = zx_0.i(var44_40);
                            var28_28 = var24_24;
                            var82_70 = var25_25.b;
                            var102_83 = var59_51;
                            var60_52 = e72.d(var82_70);
                            var21_21 = e72.e(var82_70);
                            var30_30 = var25_25.c;
                            var33_33 = 0;
                            var34_34 = 0.0f;
                            var25_25 = null;
                            cfr_temp_3 = var30_30 - 0.0f;
                            var78_66 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
                            if (var78_66 == 0) {
                                var24_24 = 1;
                                var30_30 = 1.4E-45f;
                            }
                            var49_43 /* !! */  = new d13_0(var60_52, var21_21, var30_30, var27_27);
                            var59_51 = var28_28;
                            var20_20 = 33;
                            var21_21 = 4.6E-44f;
                            var18_18.setSpan(var49_43 /* !! */ , var28_28, var91_75, var20_20);
                        } else {
                            var102_83 = var59_51;
                            var59_51 = var24_24;
                            var20_20 = 33;
                            var21_21 = 4.6E-44f;
                            var33_33 = 0;
                            var34_34 = 0.0f;
                            var25_25 = null;
                        }
                        var31_31 = var50_44.p;
                        if (var31_31 != null) {
                            var49_43 /* !! */  = new Rt0((Qt0)var31_31);
                            var18_18.setSpan(var49_43 /* !! */ , var59_51, var91_75, var20_20);
                        }
                        var82_70 = var50_44.h;
                        var35_35 = Dm3.b(var82_70);
                        var91_75 = var75_63;
                        var84_71 = 0x100000000L;
                        var12_12 = (int)Fm3.a(var35_35, var84_71);
                        if (var12_12 != 0 || (var59_51 = (int)Fm3.a(var84_71 = Dm3.b(var82_70), var82_70 = 0x200000000L)) != 0) {
                            var59_51 = 1;
                            var60_52 = 1.4E-45f;
                            var54_47 = 1;
                            var53_46 = 1.4E-45f;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var59_51 = 1;
                            var60_52 = 1.4E-45f;
                        }
                        var75_63 = var91_75 + 1;
                        var59_51 = var102_83;
                    }
                    if (var54_47 == 0) break block162;
                    var59_51 = var93_77 /* !! */ .size();
                    var9_9 = null;
                    for (var75_63 = 0; var75_63 < var59_51; var75_63 += var91_75) {
                        var10_10 = (Sl$b)var93_77 /* !! */ .get(var75_63);
                        var91_75 = var10_10.b;
                        var50_44 = (S93)var10_10.a;
                        if (var91_75 < 0 || var91_75 >= (var20_20 = var18_18.length()) || (var54_47 = var10_10.c) <= var91_75 || var54_47 > (var20_20 = var18_18.length())) {
                            var3_3 = var93_77 /* !! */ ;
lbl830:
                            // 3 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var82_70 = var50_44.h;
                        var37_36 = Dm3.b(var82_70);
                        var3_3 = var93_77 /* !! */ ;
                        var103_84 = 0x100000000L;
                        var27_27 = (int)Fm3.a(var37_36, var103_84);
                        if (var27_27 != 0) {
                            var13_13 = var16_16.h0(var82_70);
                            var93_77 /* !! */  = new bu1_0(var13_13);
                        } else {
                            var103_84 = 0x200000000L;
                            var33_33 = (int)Fm3.a(var37_36, var103_84);
                            if (var33_33 != 0) {
                                var13_13 = Dm3.c(var82_70);
                                var93_77 /* !! */  = new au1_0(var13_13);
                            } else {
                                var11_11 = 0;
                                var93_77 /* !! */  = null;
                            }
                        }
                        if (var93_77 /* !! */  == null) ** GOTO lbl830
                        var12_12 = 33;
                        var13_13 = 4.6E-44f;
                        var18_18.setSpan(var93_77 /* !! */ , var91_75, var54_47, var12_12);
                        ** continue;
                        var91_75 = 1;
                        var93_77 /* !! */  = var3_3;
                    }
                }
                var59_51 = var14_14.size();
                var9_9 = null;
                for (var75_63 = 0; var75_63 < var59_51; var75_63 += var11_11) {
                    block170: {
                        block164: {
                            block169: {
                                block168: {
                                    block167: {
                                        block166: {
                                            block165: {
                                                block163: {
                                                    var92_76 /* !! */  = (Sl$b)var14_14.get(var75_63);
                                                    var93_77 /* !! */  = (Rs2)var92_76 /* !! */ .a;
                                                    var12_12 = var92_76 /* !! */ .b;
                                                    var91_75 = var92_76 /* !! */ .c;
                                                    var22_22 /* !! */  = var18_18.getSpans(var12_12, var91_75, Ty0.class);
                                                    var24_24 = var22_22 /* !! */ .length;
                                                    var34_34 = 0.0f;
                                                    var25_25 = null;
                                                    for (var33_33 = 0; var33_33 < var24_24; var33_33 += var26_26) {
                                                        var49_43 /* !! */  = (Ty0)var22_22 /* !! */ [var33_33];
                                                        var18_18.removeSpan(var49_43 /* !! */ );
                                                        var26_26 = 1;
                                                    }
                                                    var93_77 /* !! */ .getClass();
                                                    var86_72 = 0L;
                                                    var76_64 = Dm3.c(var86_72);
                                                    var35_35 = Dm3.b(var86_72);
                                                    var11_11 = var91_75;
                                                    var105_85 = 0x100000000L;
                                                    var89_74 = 2.121995791E-314;
                                                    var46_41 = (int)Fm3.a(var35_35, var105_85);
                                                    if (var46_41 != 0) {
                                                        var105_85 = 0x200000000L;
                                                        var89_74 = 4.243991582E-314;
                                                        var77_65 = 0;
                                                    } else {
                                                        var105_85 = 0x200000000L;
                                                        var89_74 = 4.243991582E-314;
                                                        var26_26 = (int)Fm3.a(var35_35, var105_85);
                                                        var77_65 = var26_26 != 0 ? 1 : 2;
                                                    }
                                                    var80_68 = Dm3.c(var86_72);
                                                    var86_72 = Dm3.b(var86_72);
                                                    var35_35 = 0x100000000L;
                                                    var46_41 = (int)Fm3.a(var86_72, var35_35);
                                                    var81_69 = var46_41 != 0 ? 0 : ((var24_24 = (int)Fm3.a(var86_72, var105_85)) != 0 ? 1 : 2);
                                                    var30_30 = var16_16.H0();
                                                    var34_34 = var16_16.getDensity();
                                                    var71_59 = var34_34 * var30_30;
                                                    var24_24 = 1;
                                                    var30_30 = 1.4E-45f;
                                                    var33_33 = (int)xs2_0.a(var24_24);
                                                    if (var33_33 == 0) break block163;
                                                    var24_24 = 2;
                                                    var30_30 = 2.8E-45f;
                                                    var33_33 = 3;
                                                    var34_34 = 4.2E-45f;
                                                    var107_86 = 4;
                                                    var46_41 = 5;
                                                    var72_60 = 0;
                                                    break block164;
                                                }
                                                var24_24 = 2;
                                                var30_30 = 2.8E-45f;
                                                var33_33 = (int)xs2_0.a(var24_24);
                                                if (var33_33 == 0) break block165;
                                                var33_33 = 3;
                                                var34_34 = 4.2E-45f;
                                                var107_86 = 4;
                                                var46_41 = 5;
                                                var72_60 = 1;
                                                break block164;
                                            }
                                            var33_33 = 3;
                                            var34_34 = 4.2E-45f;
                                            var107_86 = (int)xs2_0.a(var33_33);
                                            if (var107_86 == 0) break block166;
                                            var107_86 = 4;
                                            var46_41 = 5;
                                            var72_60 = 2;
                                            break block164;
                                        }
                                        var107_86 = 4;
                                        var46_41 = (int)xs2_0.a(var107_86);
                                        if (var46_41 == 0) break block167;
                                        var46_41 = 5;
                                        var72_60 = 3;
                                        break block164;
                                    }
                                    var46_41 = 5;
                                    var88_73 = xs2_0.a(var46_41);
                                    if (var88_73 == 0) break block168;
                                    var72_60 = 4;
                                    break block164;
                                }
                                var88_73 = 6;
                                var108_87 = xs2_0.a(var88_73);
                                if (!var108_87) break block169;
                                var72_60 = 5;
                                break block164;
                            }
                            var108_87 = xs2_0.a(7);
                            if (!var108_87) break block170;
                            var72_60 = 6;
                        }
                        var66_56 /* !! */  = var22_22 /* !! */ ;
                        super(var76_64, var77_65, var80_68, var81_69, var71_59, var72_60);
                        var28_28 = 33;
                        var29_29 = 4.6E-44f;
                        var18_18.setSpan((Object)var22_22 /* !! */ , var12_12, var11_11, var28_28);
                        var11_11 = 1;
                        continue;
                    }
                    var9_9 = "Invalid PlaceholderVerticalAlign".toString();
                    super((String)var9_9);
                    throw var8_8 /* !! */ ;
                }
            }
            var7_7.h = var18_18;
            var9_9 = var7_7.g;
            var54_47 = var7_7.l;
            var8_8 /* !! */  = new Ip1((CharSequence)var18_18, (TextPaint)var9_9, var54_47);
            var7_7.i = var8_8 /* !! */ ;
            return;
        }
        var9_9 = "Invalid TextDirection.".toString();
        var8_8 /* !! */  = new IllegalStateException((String)var9_9);
        throw var8_8 /* !! */ ;
    }

    public final boolean a() {
        boolean bl2;
        Object object = this.j;
        boolean bl3 = false;
        if (object != null) {
            bl2 = ((qt3)object).a();
        } else {
            bl2 = false;
            object = null;
        }
        if (bl2 || !(bl2 = this.k) && (bl2 = ji.a((xm3)(object = this.b))) && (bl2 = ((Boolean)(object = (Boolean)Ly0.a.a().getValue())).booleanValue())) {
            bl3 = true;
        }
        return bl3;
    }

    public final float b() {
        return this.i.b();
    }

    public final float c() {
        float f5;
        Ip1 ip1 = this.i;
        float f6 = ip1.e;
        boolean bl2 = Float.isNaN(f6);
        if (!bl2) {
            f5 = ip1.e;
        } else {
            int n3;
            TextPaint textPaint = ip1.b;
            Object object = BreakIterator.getLineInstance(textPaint.getTextLocale());
            CharSequence charSequence = ip1.a;
            int n4 = charSequence.length();
            PriorityQueue<Pair> priorityQueue = new PriorityQueue<Pair>(n4, charSequence);
            ((BreakIterator)object).setText((CharacterIterator)((Object)priorityQueue));
            Object object2 = new Object();
            int n7 = 10;
            priorityQueue = new PriorityQueue<Pair>(n7, (Comparator<Pair>)object2);
            n4 = ((BreakIterator)object).next();
            int n8 = 0;
            Integer n10 = null;
            while (n4 != (n3 = -1)) {
                Serializable serializable;
                Number number;
                n3 = priorityQueue.size();
                if (n3 < n7) {
                    n10 = n8;
                    number = n4;
                    serializable = new Pair(n10, number);
                    priorityQueue.add((Pair)serializable);
                } else {
                    serializable = (Pair)priorityQueue.peek();
                    if (serializable != null) {
                        number = (Number)((Pair)serializable).b;
                        int n14 = number.intValue();
                        serializable = (Number)((Pair)serializable).a;
                        n3 = ((Number)serializable).intValue();
                        if ((n14 -= n3) < (n3 = n4 - n8)) {
                            priorityQueue.poll();
                            n10 = n8;
                            number = n4;
                            serializable = new Pair(n10, number);
                            priorityQueue.add((Pair)serializable);
                        }
                    }
                }
                int n15 = ((BreakIterator)object).next();
                n8 = n4;
                n4 = n15;
            }
            object = priorityQueue.iterator();
            float f7 = 0.0f;
            priorityQueue = null;
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (Pair)object.next();
                Number number = (Number)((Pair)object2).a;
                n7 = number.intValue();
                object2 = (Number)((Pair)object2).b;
                n4 = ((Number)object2).intValue();
                float f8 = Layout.getDesiredWidth((CharSequence)charSequence, (int)n7, (int)n4, (TextPaint)textPaint);
                f7 = Math.max(f7, f8);
            }
            ip1.e = f7;
            f5 = f7;
        }
        return f5;
    }
}

