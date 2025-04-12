/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  android.text.method.PasswordTransformationMethod
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.b$a;
import androidx.appcompat.widget.b$b;
import androidx.appcompat.widget.b$c;
import androidx.appcompat.widget.b$d;
import androidx.appcompat.widget.b$e;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

public final class b {
    public final TextView a;
    public Rn3 b;
    public Rn3 c;
    public Rn3 d;
    public Rn3 e;
    public Rn3 f;
    public Rn3 g;
    public Rn3 h;
    public final Cn i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public b(TextView textView) {
        Cn cn2;
        this.a = textView;
        this.i = cn2 = new Cn(textView);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static Rn3 c(Context context, qn object, int n3) {
        // MONITORENTER : object
        OK2 oK2 = ((qn)object).a;
        context = oK2.i(n3, context);
        // MONITOREXIT : object
        if (context == null) return null;
        object = new Object();
        ((Rn3)object).d = true;
        ((Rn3)object).a = context;
        return object;
    }

    public final void a(Drawable drawable2, Rn3 rn3) {
        if (drawable2 != null && rn3 != null) {
            int[] nArray = this.a.getDrawableState();
            qn.e(drawable2, rn3, nArray);
        }
    }

    public final void b() {
        Drawable drawable2 = this.b;
        int n3 = 2;
        Drawable drawable3 = null;
        Object object = this.a;
        if (drawable2 != null || (drawable2 = this.c) != null || (drawable2 = this.d) != null || (drawable2 = this.e) != null) {
            drawable2 = object.getCompoundDrawables();
            Object object2 = drawable2[0];
            Rn3 rn3 = this.b;
            this.a((Drawable)object2, rn3);
            object2 = drawable2[1];
            rn3 = this.c;
            this.a((Drawable)object2, rn3);
            object2 = drawable2[n3];
            rn3 = this.d;
            this.a((Drawable)object2, rn3);
            int n4 = 3;
            drawable2 = drawable2[n4];
            object2 = this.e;
            this.a(drawable2, (Rn3)object2);
        }
        if ((drawable2 = this.f) != null || (drawable2 = this.g) != null) {
            drawable2 = object.getCompoundDrawablesRelative();
            drawable3 = drawable2[0];
            object = this.f;
            this.a(drawable3, (Rn3)object);
            drawable2 = drawable2[n3];
            Rn3 rn3 = this.g;
            this.a(drawable2, rn3);
        }
    }

    public final ColorStateList d() {
        Rn3 rn3 = this.h;
        rn3 = rn3 != null ? rn3.a : null;
        return rn3;
    }

    public final PorterDuff.Mode e() {
        Rn3 rn3 = this.h;
        rn3 = rn3 != null ? rn3.b : null;
        return rn3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void f(AttributeSet var1_1, int var2_2) {
        block111: {
            block114: {
                block116: {
                    block115: {
                        block113: {
                            block112: {
                                var3_3 = this;
                                var4_4 = var1_1;
                                var5_5 = var2_2;
                                var6_6 = this.a;
                                var7_7 = var6_6.getContext();
                                var8_8 = qn.a();
                                var9_9 /* !! */  = R$styleable.AppCompatTextHelper;
                                var10_10 = 0;
                                var11_11 = null;
                                var12_12 = Tn3.f(var7_7, (AttributeSet)var1_1, var9_9 /* !! */ , var2_2, 0);
                                var13_13 /* !! */  = var6_6.getContext();
                                var14_14 = R$styleable.AppCompatTextHelper;
                                var15_15 = 0;
                                var16_16 = null;
                                var17_17 = var12_12.b;
                                var9_9 /* !! */  = (int[])var6_6;
                                var18_18 = var1_1;
                                var19_19 = var2_2;
                                ViewCompat.r((View)var6_6, var13_13 /* !! */ , (int[])var14_14, (AttributeSet)var1_1, (TypedArray)var17_17, var2_2, 0);
                                var20_20 = R$styleable.AppCompatTextHelper_android_textAppearance;
                                var13_13 /* !! */  = var12_12.b;
                                var21_21 = -1;
                                var20_20 = var13_13 /* !! */ .getResourceId(var20_20, var21_21);
                                var22_22 = R$styleable.AppCompatTextHelper_android_drawableLeft;
                                var22_22 = (int)var13_13 /* !! */ .hasValue(var22_22);
                                if (var22_22 != 0) {
                                    var22_22 = R$styleable.AppCompatTextHelper_android_drawableLeft;
                                    var22_22 = var13_13 /* !! */ .getResourceId(var22_22, 0);
                                    var14_14 = androidx.appcompat.widget.b.c(var7_7, (qn)var8_8, var22_22);
                                    this.b = var14_14;
                                }
                                var22_22 = R$styleable.AppCompatTextHelper_android_drawableTop;
                                if ((var22_22 = (int)var13_13 /* !! */ .hasValue(var22_22)) != 0) {
                                    var22_22 = R$styleable.AppCompatTextHelper_android_drawableTop;
                                    var22_22 = var13_13 /* !! */ .getResourceId(var22_22, 0);
                                    var14_14 = androidx.appcompat.widget.b.c(var7_7, (qn)var8_8, var22_22);
                                    var3_3.c = var14_14;
                                }
                                var22_22 = R$styleable.AppCompatTextHelper_android_drawableRight;
                                if ((var22_22 = (int)var13_13 /* !! */ .hasValue(var22_22)) != 0) {
                                    var22_22 = R$styleable.AppCompatTextHelper_android_drawableRight;
                                    var22_22 = var13_13 /* !! */ .getResourceId(var22_22, 0);
                                    var14_14 = androidx.appcompat.widget.b.c(var7_7, (qn)var8_8, var22_22);
                                    var3_3.d = var14_14;
                                }
                                var22_22 = R$styleable.AppCompatTextHelper_android_drawableBottom;
                                if ((var22_22 = (int)var13_13 /* !! */ .hasValue(var22_22)) != 0) {
                                    var22_22 = R$styleable.AppCompatTextHelper_android_drawableBottom;
                                    var22_22 = var13_13 /* !! */ .getResourceId(var22_22, 0);
                                    var14_14 = androidx.appcompat.widget.b.c(var7_7, (qn)var8_8, var22_22);
                                    var3_3.e = var14_14;
                                }
                                var22_22 = R$styleable.AppCompatTextHelper_android_drawableStart;
                                if ((var22_22 = (int)var13_13 /* !! */ .hasValue(var22_22)) != 0) {
                                    var22_22 = R$styleable.AppCompatTextHelper_android_drawableStart;
                                    var22_22 = var13_13 /* !! */ .getResourceId(var22_22, 0);
                                    var14_14 = androidx.appcompat.widget.b.c(var7_7, (qn)var8_8, var22_22);
                                    var3_3.f = var14_14;
                                }
                                var22_22 = R$styleable.AppCompatTextHelper_android_drawableEnd;
                                if ((var22_22 = (int)var13_13 /* !! */ .hasValue(var22_22)) != 0) {
                                    var22_22 = R$styleable.AppCompatTextHelper_android_drawableEnd;
                                    var23_23 = var13_13 /* !! */ .getResourceId(var22_22, 0);
                                    var13_13 /* !! */  = androidx.appcompat.widget.b.c(var7_7, (qn)var8_8, var23_23);
                                    var3_3.g = var13_13 /* !! */ ;
                                }
                                var12_12.g();
                                var13_13 /* !! */  = var6_6.getTransformationMethod();
                                var23_23 = var13_13 /* !! */  instanceof PasswordTransformationMethod;
                                var22_22 = 26;
                                var24_24 = 3.6E-44f;
                                var25_25 = 23;
                                var26_26 = 3.2E-44f;
                                if (var20_20 == var21_21) break block112;
                                var17_17 = R$styleable.TextAppearance;
                                var9_9 /* !! */  = (int[])var7_7.obtainStyledAttributes(var20_20, (int[])var17_17);
                                var27_27 = new Tn3(var7_7, (TypedArray)var9_9 /* !! */ );
                                if (var23_23 != 0) ** GOTO lbl-1000
                                var28_28 = R$styleable.TextAppearance_textAllCaps;
                                if ((var28_28 = (int)var9_9 /* !! */ .hasValue(var28_28)) != 0) {
                                    var28_28 = R$styleable.TextAppearance_textAllCaps;
                                    var28_28 = (int)var9_9 /* !! */ .getBoolean(var28_28, false);
                                    var29_29 = true;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var28_28 = 0;
                                    var17_17 = null;
                                    var29_29 = false;
                                }
                                var3_3.m(var7_7, (Tn3)var27_27);
                                var15_15 = Build.VERSION.SDK_INT;
                                if (var15_15 < var25_25) {
                                    var30_30 = R$styleable.TextAppearance_android_textColor;
                                    if ((var30_30 = (int)var9_9 /* !! */ .hasValue(var30_30)) != 0) {
                                        var30_30 = R$styleable.TextAppearance_android_textColor;
                                        var12_12 = var27_27.a(var30_30);
                                    } else {
                                        var30_30 = 0;
                                        var12_12 = null;
                                    }
                                    var21_21 = R$styleable.TextAppearance_android_textColorHint;
                                    var21_21 = (int)var9_9 /* !! */ .hasValue(var21_21);
                                    if (var21_21 != 0) {
                                        var21_21 = R$styleable.TextAppearance_android_textColorHint;
                                        var31_31 = var27_27.a(var21_21);
                                    } else {
                                        var21_21 = 0;
                                        var31_31 = null;
                                    }
                                    var25_25 = R$styleable.TextAppearance_android_textColorLink;
                                    var25_25 = (int)var9_9 /* !! */ .hasValue(var25_25);
                                    if (var25_25 != 0) {
                                        var25_25 = R$styleable.TextAppearance_android_textColorLink;
                                        var18_18 = var27_27.a(var25_25);
                                    } else {
                                        var25_25 = 0;
                                        var26_26 = 0.0f;
                                        var18_18 = null;
                                    }
                                } else {
                                    var25_25 = 0;
                                    var26_26 = 0.0f;
                                    var18_18 = null;
                                    var30_30 = 0;
                                    var12_12 = null;
                                    var21_21 = 0;
                                    var31_31 = null;
                                }
                                var10_10 = R$styleable.TextAppearance_textLocale;
                                var10_10 = (int)var9_9 /* !! */ .hasValue(var10_10);
                                if (var10_10 != 0) {
                                    var10_10 = R$styleable.TextAppearance_textLocale;
                                    var11_11 = var9_9 /* !! */ .getString(var10_10);
                                } else {
                                    var10_10 = 0;
                                    var11_11 = null;
                                }
                                if (var15_15 < var22_22) ** GOTO lbl-1000
                                var15_15 = R$styleable.TextAppearance_fontVariationSettings;
                                if ((var15_15 = (int)var9_9 /* !! */ .hasValue(var15_15)) != 0) {
                                    var15_15 = R$styleable.TextAppearance_fontVariationSettings;
                                    var9_9 /* !! */  = (int[])var9_9 /* !! */ .getString(var15_15);
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var20_20 = 0;
                                    var32_32 = 0.0f;
                                    var9_9 /* !! */  = null;
                                }
                                var27_27.g();
                                break block113;
                            }
                            var20_20 = 0;
                            var32_32 = 0.0f;
                            var9_9 /* !! */  = null;
                            var25_25 = 0;
                            var26_26 = 0.0f;
                            var18_18 = null;
                            var28_28 = 0;
                            var17_17 = null;
                            var10_10 = 0;
                            var11_11 = null;
                            var30_30 = 0;
                            var12_12 = null;
                            var21_21 = 0;
                            var31_31 = null;
                            var29_29 = false;
                        }
                        var27_27 = R$styleable.TextAppearance;
                        var22_22 = 0;
                        var24_24 = 0.0f;
                        var14_14 = null;
                        var27_27 = var7_7.obtainStyledAttributes((AttributeSet)var4_4, (int[])var27_27, var5_5, 0);
                        var16_16 = new Tn3(var7_7, (TypedArray)var27_27);
                        if (var23_23 == 0) {
                            var22_22 = R$styleable.TextAppearance_textAllCaps;
                            if ((var22_22 = (int)var27_27.hasValue(var22_22)) != 0) {
                                var22_22 = R$styleable.TextAppearance_textAllCaps;
                                var17_17 = null;
                                var28_28 = var22_22 = (int)var27_27.getBoolean(var22_22, false);
                                var29_29 = true;
                            }
                        }
                        var22_22 = Build.VERSION.SDK_INT;
                        var33_33 /* !! */  = var9_9 /* !! */ ;
                        var20_20 = 23;
                        var32_32 = 3.2E-44f;
                        if (var22_22 < var20_20) {
                            var20_20 = R$styleable.TextAppearance_android_textColor;
                            if ((var20_20 = (int)var27_27.hasValue(var20_20)) != 0) {
                                var20_20 = R$styleable.TextAppearance_android_textColor;
                                var12_12 = var16_16.a(var20_20);
                            }
                            var20_20 = R$styleable.TextAppearance_android_textColorHint;
                            if ((var20_20 = (int)var27_27.hasValue(var20_20)) != 0) {
                                var20_20 = R$styleable.TextAppearance_android_textColorHint;
                                var31_31 = var16_16.a(var20_20);
                            }
                            var20_20 = R$styleable.TextAppearance_android_textColorLink;
                            if ((var20_20 = (int)var27_27.hasValue(var20_20)) != 0) {
                                var20_20 = R$styleable.TextAppearance_android_textColorLink;
                                var18_18 = var16_16.a(var20_20);
                            }
                        }
                        var20_20 = R$styleable.TextAppearance_textLocale;
                        if ((var20_20 = (int)var27_27.hasValue(var20_20)) != 0) {
                            var20_20 = R$styleable.TextAppearance_textLocale;
                            var11_11 = var27_27.getString(var20_20);
                        }
                        var20_20 = 26;
                        var32_32 = 3.6E-44f;
                        if (var22_22 < var20_20) ** GOTO lbl-1000
                        var20_20 = R$styleable.TextAppearance_fontVariationSettings;
                        if ((var20_20 = (int)var27_27.hasValue(var20_20)) != 0) {
                            var20_20 = R$styleable.TextAppearance_fontVariationSettings;
                            var9_9 /* !! */  = (int[])var27_27.getString(var20_20);
                            var34_34 = var8_8;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var34_34 = var8_8;
                            var9_9 /* !! */  = var33_33 /* !! */ ;
                        }
                        var35_35 = 28;
                        if (var22_22 >= var35_35) {
                            var35_35 = R$styleable.TextAppearance_android_textSize;
                            if ((var35_35 = (int)var27_27.hasValue(var35_35)) != 0 && (var19_19 = var27_27.getDimensionPixelSize(var35_35 = R$styleable.TextAppearance_android_textSize, var36_36 = -1)) == 0) {
                                var19_19 = 0;
                                var27_27 = null;
                                var36_36 = 0;
                                var4_4 = null;
                                var6_6.setTextSize(0, 0.0f);
                            }
                        }
                        var3_3.m(var7_7, (Tn3)var16_16);
                        var16_16.g();
                        if (var12_12 != null) {
                            var6_6.setTextColor((ColorStateList)var12_12);
                        }
                        if (var31_31 != null) {
                            var6_6.setHintTextColor(var31_31);
                        }
                        if (var18_18 != null) {
                            var6_6.setLinkTextColor((ColorStateList)var18_18);
                        }
                        if (var23_23 == 0 && var29_29) {
                            var6_6.setAllCaps((boolean)var28_28);
                        }
                        if ((var13_13 /* !! */  = var3_3.l) != null) {
                            var25_25 = var3_3.k;
                            var28_28 = -1;
                            if (var25_25 == var28_28) {
                                var25_25 = var3_3.j;
                                var6_6.setTypeface((Typeface)var13_13 /* !! */ , var25_25);
                            } else {
                                var6_6.setTypeface((Typeface)var13_13 /* !! */ );
                            }
                        }
                        if (var9_9 /* !! */  != null) {
                            b$d.d(var6_6, (String)var9_9 /* !! */ );
                        }
                        var36_36 = 24;
                        if (var11_11 == null) ** GOTO lbl233
                        if (var22_22 >= var36_36) {
                            var9_9 /* !! */  = (int[])b$c.a(var11_11);
                            b$c.b(var6_6, (LocaleList)var9_9 /* !! */ );
lbl233:
                            // 2 sources

                            var23_23 = 0;
                            var37_37 = 0.0f;
                            var13_13 /* !! */  = null;
                        } else {
                            var9_9 /* !! */  = (int[])var11_11.split(",");
                            var23_23 = 0;
                            var37_37 = 0.0f;
                            var13_13 /* !! */  = null;
                            var9_9 /* !! */  = (int[])b$b.a((String)var9_9 /* !! */ [0]);
                            var6_6.setTextLocale((Locale)var9_9 /* !! */ );
                        }
                        var9_9 /* !! */  = R$styleable.AppCompatTextView;
                        var8_8 = var3_3.i;
                        var11_11 = var8_8.j;
                        var12_12 = var1_1;
                        var31_31 = var11_11.obtainStyledAttributes((AttributeSet)var1_1, var9_9 /* !! */ , var5_5, 0);
                        var9_9 /* !! */  = (int[])var8_8.i;
                        var13_13 /* !! */  = var9_9 /* !! */ .getContext();
                        var14_14 = R$styleable.AppCompatTextView;
                        var15_15 = 0;
                        var16_16 = null;
                        var18_18 = var1_1;
                        var17_17 = var31_31;
                        var19_19 = var2_2;
                        var5_5 = 0;
                        var38_38 = null;
                        ViewCompat.r((View)var9_9 /* !! */ , var13_13 /* !! */ , (int[])var14_14, (AttributeSet)var1_1, (TypedArray)var31_31, var2_2, 0);
                        var20_20 = R$styleable.AppCompatTextView_autoSizeTextType;
                        var20_20 = (int)var31_31.hasValue(var20_20);
                        if (var20_20 != 0) {
                            var20_20 = R$styleable.AppCompatTextView_autoSizeTextType;
                            var23_23 = 0;
                            var37_37 = 0.0f;
                            var13_13 /* !! */  = null;
                            var8_8.a = var20_20 = var31_31.getInt(var20_20, 0);
                        }
                        var20_20 = R$styleable.AppCompatTextView_autoSizeStepGranularity;
                        var20_20 = (int)var31_31.hasValue(var20_20);
                        var23_23 = -1082130432;
                        var37_37 = -1.0f;
                        if (var20_20 != 0) {
                            var20_20 = R$styleable.AppCompatTextView_autoSizeStepGranularity;
                            var32_32 = var31_31.getDimension(var20_20, var37_37);
                        } else {
                            var20_20 = -1082130432;
                            var32_32 = -1.0f;
                        }
                        var22_22 = R$styleable.AppCompatTextView_autoSizeMinTextSize;
                        var22_22 = (int)var31_31.hasValue(var22_22);
                        if (var22_22 != 0) {
                            var22_22 = R$styleable.AppCompatTextView_autoSizeMinTextSize;
                            var24_24 = var31_31.getDimension(var22_22, var37_37);
                        } else {
                            var22_22 = -1082130432;
                            var24_24 = -1.0f;
                        }
                        var25_25 = R$styleable.AppCompatTextView_autoSizeMaxTextSize;
                        var25_25 = (int)var31_31.hasValue(var25_25);
                        if (var25_25 != 0) {
                            var25_25 = R$styleable.AppCompatTextView_autoSizeMaxTextSize;
                            var26_26 = var31_31.getDimension(var25_25, var37_37);
                        } else {
                            var25_25 = -1082130432;
                            var26_26 = -1.0f;
                        }
                        var28_28 = R$styleable.AppCompatTextView_autoSizePresetSizes;
                        var28_28 = (int)var31_31.hasValue(var28_28);
                        if (var28_28 != 0) {
                            var28_28 = R$styleable.AppCompatTextView_autoSizePresetSizes;
                            var19_19 = 0;
                            var27_27 = null;
                            if ((var28_28 = var31_31.getResourceId(var28_28, 0)) > 0) {
                                var27_27 = var31_31.getResources();
                                var17_17 = var27_27.obtainTypedArray(var28_28);
                                var19_19 = var17_17.length();
                                var16_16 = (Drawable)new int[var19_19];
                                if (var19_19 > 0) {
                                    var38_38 = null;
                                    for (var5_5 = 0; var5_5 < var19_19; ++var5_5) {
                                        var39_39 = var17_17.getDimensionPixelSize(var5_5, -1);
                                        var16_16[var5_5] = var39_39;
                                        var36_36 = 24;
                                    }
                                    var27_27 = Cn.b((int[])var16_16);
                                    var8_8.f = (int[])var27_27;
                                    var8_8.i();
                                }
                                var17_17.recycle();
                            }
                        }
                        var31_31.recycle();
                        var28_28 = (int)var8_8.j();
                        var19_19 = 2;
                        if (var28_28 != 0) {
                            var28_28 = var8_8.a;
                            var15_15 = 1;
                            if (var28_28 == var15_15) {
                                var28_28 = (int)var8_8.g;
                                if (var28_28 == 0) {
                                    var17_17 = var11_11.getResources().getDisplayMetrics();
                                    var15_15 = (int)(var24_24 == var37_37 ? 0 : (var24_24 > var37_37 ? 1 : -1));
                                    if (var15_15 == 0) {
                                        var22_22 = 0x41400000;
                                        var24_24 = TypedValue.applyDimension((int)var19_19, (float)12.0f, (DisplayMetrics)var17_17);
                                    }
                                    if ((var15_15 = (int)(var26_26 == var37_37 ? 0 : (var26_26 > var37_37 ? 1 : -1))) == 0) {
                                        var25_25 = 1121976320;
                                        var26_26 = TypedValue.applyDimension((int)var19_19, (float)112.0f, (DisplayMetrics)var17_17);
                                    }
                                    if ((var28_28 = (int)(var32_32 == var37_37 ? 0 : (var32_32 > var37_37 ? 1 : -1))) == 0) {
                                        var20_20 = 1065353216;
                                        var32_32 = 1.0f;
                                    }
                                    var8_8.k(var24_24, var26_26, var32_32);
                                }
                                var8_8.h();
                            }
                        } else {
                            var20_20 = 0;
                            var32_32 = 0.0f;
                            var9_9 /* !! */  = null;
                            var8_8.a = 0;
                        }
                        if ((var20_20 = (int)dE3.c) != 0 && (var20_20 = var8_8.a) != 0 && (var22_22 = (var9_9 /* !! */  = var8_8.f).length) > 0) {
                            var24_24 = b$d.a(var6_6);
                            cfr_temp_0 = var24_24 - var37_37;
                            var22_22 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                            if (var22_22 != 0) {
                                var32_32 = var8_8.d;
                                var20_20 = Math.round(var32_32);
                                var24_24 = var8_8.e;
                                var22_22 = Math.round(var24_24);
                                var26_26 = var8_8.c;
                                var25_25 = Math.round(var26_26);
                                var28_28 = 0;
                                var17_17 = null;
                                b$d.b(var6_6, var20_20, var22_22, var25_25, 0);
                            } else {
                                var28_28 = 0;
                                var17_17 = null;
                                b$d.c(var6_6, var9_9 /* !! */ , 0);
                            }
                        }
                        var9_9 /* !! */  = R$styleable.AppCompatTextView;
                        var9_9 /* !! */  = (int[])var7_7.obtainStyledAttributes((AttributeSet)var12_12, var9_9 /* !! */ );
                        var22_22 = R$styleable.AppCompatTextView_drawableLeftCompat;
                        var25_25 = -1;
                        var26_26 = 0.0f / 0.0f;
                        var22_22 = var9_9 /* !! */ .getResourceId(var22_22, var25_25);
                        var17_17 = var34_34;
                        if (var22_22 != var25_25) {
                            var16_16 = var34_34.b(var7_7, var22_22);
                        } else {
                            var15_15 = 0;
                            var16_16 = null;
                        }
                        var22_22 = R$styleable.AppCompatTextView_drawableTopCompat;
                        var22_22 = var9_9 /* !! */ .getResourceId(var22_22, var25_25);
                        if (var22_22 != var25_25) {
                            var14_14 = var17_17.b(var7_7, var22_22);
                        } else {
                            var22_22 = 0;
                            var24_24 = 0.0f;
                            var14_14 = null;
                        }
                        var36_36 = R$styleable.AppCompatTextView_drawableRightCompat;
                        var36_36 = var9_9 /* !! */ .getResourceId(var36_36, var25_25);
                        if (var36_36 != var25_25) {
                            var4_4 = var17_17.b(var7_7, var36_36);
                        } else {
                            var36_36 = 0;
                            var4_4 = null;
                        }
                        var5_5 = R$styleable.AppCompatTextView_drawableBottomCompat;
                        var5_5 = var9_9 /* !! */ .getResourceId(var5_5, var25_25);
                        if (var5_5 != var25_25) {
                            var38_38 = var17_17.b(var7_7, var5_5);
                        } else {
                            var5_5 = 0;
                            var38_38 = null;
                        }
                        var35_35 = R$styleable.AppCompatTextView_drawableStartCompat;
                        var35_35 = var9_9 /* !! */ .getResourceId(var35_35, var25_25);
                        if (var35_35 != var25_25) {
                            var8_8 = var17_17.b(var7_7, var35_35);
                        } else {
                            var35_35 = 0;
                            var8_8 = null;
                        }
                        var10_10 = R$styleable.AppCompatTextView_drawableEndCompat;
                        var10_10 = var9_9 /* !! */ .getResourceId(var10_10, var25_25);
                        if (var10_10 != var25_25) {
                            var18_18 = var17_17.b(var7_7, var10_10);
                        } else {
                            var25_25 = 0;
                            var26_26 = 0.0f;
                            var18_18 = null;
                        }
                        var28_28 = 3;
                        if (var8_8 == null && var18_18 == null) {
                            if (var16_16 != null || var14_14 != null || var4_4 != null || var38_38 != null) {
                                var18_18 = var6_6.getCompoundDrawablesRelative();
                                var35_35 = 0;
                                var8_8 = null;
                                var11_11 = var18_18[0];
                                if (var11_11 == null && (var12_12 = var18_18[var19_19]) == null) {
                                    var18_18 = var6_6.getCompoundDrawables();
                                    if (var16_16 == null) {
                                        var16_16 = var18_18[0];
                                    }
                                    if (var14_14 == null) {
                                        var22_22 = 1;
                                        var24_24 = 1.4E-45f;
                                        var14_14 = var18_18[var22_22];
                                    }
                                    if (var4_4 == null) {
                                        var4_4 = var18_18[var19_19];
                                    }
                                    if (var38_38 == null) {
                                        var38_38 = var18_18[var28_28];
                                    }
                                    var6_6.setCompoundDrawablesWithIntrinsicBounds(var16_16, (Drawable)var14_14, var4_4, var38_38);
                                } else {
                                    if (var14_14 == null) {
                                        var22_22 = 1;
                                        var24_24 = 1.4E-45f;
                                        var14_14 = var18_18[var22_22];
                                    }
                                    if (var38_38 == null) {
                                        var38_38 = var18_18[var28_28];
                                    }
                                    var18_18 = var18_18[var19_19];
                                    var6_6.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)var11_11, (Drawable)var14_14, (Drawable)var18_18, var38_38);
                                }
                            }
                        } else {
                            var16_16 = var6_6.getCompoundDrawablesRelative();
                            if (var8_8 == null) {
                                var36_36 = 0;
                                var4_4 = null;
                                var8_8 = var16_16[0];
                            }
                            if (var14_14 == null) {
                                var22_22 = 1;
                                var24_24 = 1.4E-45f;
                                var14_14 = var16_16[var22_22];
                            }
                            if (var18_18 == null) {
                                var18_18 = var16_16[var19_19];
                            }
                            if (var38_38 == null) {
                                var38_38 = var16_16[var28_28];
                            }
                            var6_6.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)var8_8, (Drawable)var14_14, (Drawable)var18_18, var38_38);
                        }
                        var22_22 = R$styleable.AppCompatTextView_drawableTint;
                        if ((var22_22 = (int)var9_9 /* !! */ .hasValue(var22_22)) == 0) break block114;
                        var22_22 = R$styleable.AppCompatTextView_drawableTint;
                        var25_25 = (int)var9_9 /* !! */ .hasValue(var22_22);
                        if (var25_25 == 0) break block115;
                        var26_26 = 0.0f;
                        var18_18 = null;
                        var25_25 = var9_9 /* !! */ .getResourceId(var22_22, 0);
                        if (var25_25 != 0 && (var18_18 = t70.getColorStateList(var7_7, var25_25)) != null) break block116;
                    }
                    var18_18 = var9_9 /* !! */ .getColorStateList(var22_22);
                }
                var22_22 = Build.VERSION.SDK_INT;
                var28_28 = 24;
                if (var22_22 >= var28_28) {
                    Hm3$a.d(var6_6, (ColorStateList)var18_18);
                } else {
                    var22_22 = var6_6 instanceof Vn3;
                    if (var22_22 != 0) {
                        var14_14 = var6_6;
                        var14_14 = (Vn3)var6_6;
                        var14_14.setSupportCompoundDrawablesTintList((ColorStateList)var18_18);
                    }
                }
            }
            var22_22 = R$styleable.AppCompatTextView_drawableTintMode;
            if ((var22_22 = (int)var9_9 /* !! */ .hasValue(var22_22)) != 0) {
                var22_22 = R$styleable.AppCompatTextView_drawableTintMode;
                var22_22 = var9_9 /* !! */ .getInt(var22_22, -1);
                var26_26 = 0.0f;
                var18_18 = null;
                var14_14 = uu0_0.c(var22_22, null);
                var25_25 = Build.VERSION.SDK_INT;
                var28_28 = 24;
                if (var25_25 >= var28_28) {
                    Hm3$a.e(var6_6, (PorterDuff.Mode)var14_14);
                } else {
                    var25_25 = var6_6 instanceof Vn3;
                    if (var25_25 != 0) {
                        var18_18 = var6_6;
                        var18_18 = (Vn3)var6_6;
                        var18_18.setSupportCompoundDrawablesTintMode((PorterDuff.Mode)var14_14);
                    }
                }
            }
            var22_22 = R$styleable.AppCompatTextView_firstBaselineToTopHeight;
            var25_25 = -1;
            var26_26 = 0.0f / 0.0f;
            var22_22 = var9_9 /* !! */ .getDimensionPixelSize(var22_22, var25_25);
            var28_28 = R$styleable.AppCompatTextView_lastBaselineToBottomHeight;
            var28_28 = var9_9 /* !! */ .getDimensionPixelSize(var28_28, var25_25);
            var25_25 = R$styleable.AppCompatTextView_lineHeight;
            if ((var25_25 = (int)var9_9 /* !! */ .hasValue(var25_25)) == 0) ** GOTO lbl519
            var25_25 = R$styleable.AppCompatTextView_lineHeight;
            var18_18 = var9_9 /* !! */ .peekValue(var25_25);
            if (var18_18 != null && (var19_19 = var18_18.type) == (var15_15 = 5)) {
                var25_25 = var18_18.data;
                var36_36 = var25_25 & 15;
                var26_26 = TypedValue.complexToFloat((int)var25_25);
                var19_19 = var36_36;
                var36_36 = -1;
            } else {
                var25_25 = R$styleable.AppCompatTextView_lineHeight;
                var36_36 = -1;
                var25_25 = var9_9 /* !! */ .getDimensionPixelSize(var25_25, var36_36);
                var26_26 = var25_25;
lbl516:
                // 2 sources

                while (true) {
                    var19_19 = -1;
                    break block111;
                    break;
                }
lbl519:
                // 1 sources

                var36_36 = -1;
                var25_25 = -1082130432;
                var26_26 = -1.0f;
                ** continue;
            }
        }
        var9_9 /* !! */ .recycle();
        if (var22_22 != var36_36) {
            Hm3.b(var6_6, var22_22);
        }
        if (var28_28 != var36_36) {
            Hm3.c(var6_6, var28_28);
        }
        if ((var20_20 = (int)(var26_26 == var37_37 ? 0 : (var26_26 > var37_37 ? 1 : -1))) != 0) {
            if (var19_19 == var36_36) {
                var20_20 = (int)var26_26;
                Hm3.d(var6_6, var20_20);
            } else {
                var20_20 = Build.VERSION.SDK_INT;
                var23_23 = 34;
                var37_37 = 4.8E-44f;
                if (var20_20 >= var23_23) {
                    Hm3$d.a(var6_6, var19_19, var26_26);
                } else {
                    var9_9 /* !! */  = (int[])((View)var6_6).getResources().getDisplayMetrics();
                    var32_32 = TypedValue.applyDimension((int)var19_19, (float)var26_26, (DisplayMetrics)var9_9 /* !! */ );
                    var20_20 = Math.round(var32_32);
                    Hm3.d(var6_6, var20_20);
                }
            }
        }
    }

    public final void g(int n3, Context context) {
        ColorStateList colorStateList;
        int n4;
        int[] nArray = R$styleable.TextAppearance;
        Object object = context.obtainStyledAttributes(n3, nArray);
        Tn3 tn3 = new Tn3(context, (TypedArray)object);
        int n7 = R$styleable.TextAppearance_textAllCaps;
        n7 = (int)(object.hasValue(n7) ? 1 : 0);
        TextView textView = this.a;
        if (n7 != 0) {
            n7 = R$styleable.TextAppearance_textAllCaps;
            n7 = (int)(object.getBoolean(n7, false) ? 1 : 0);
            textView.setAllCaps(n7 != 0);
        }
        if ((n7 = Build.VERSION.SDK_INT) < (n4 = 23)) {
            n4 = R$styleable.TextAppearance_android_textColor;
            if ((n4 = (int)(object.hasValue(n4) ? 1 : 0)) != 0 && (colorStateList = tn3.a(n4 = R$styleable.TextAppearance_android_textColor)) != null) {
                textView.setTextColor(colorStateList);
            }
            n4 = R$styleable.TextAppearance_android_textColorLink;
            if ((n4 = (int)(object.hasValue(n4) ? 1 : 0)) != 0 && (colorStateList = tn3.a(n4 = R$styleable.TextAppearance_android_textColorLink)) != null) {
                textView.setLinkTextColor(colorStateList);
            }
            n4 = R$styleable.TextAppearance_android_textColorHint;
            if ((n4 = (int)(object.hasValue(n4) ? 1 : 0)) != 0 && (colorStateList = tn3.a(n4 = R$styleable.TextAppearance_android_textColorHint)) != null) {
                textView.setHintTextColor(colorStateList);
            }
        }
        n4 = R$styleable.TextAppearance_android_textSize;
        if ((n4 = (int)(object.hasValue(n4) ? 1 : 0)) != 0) {
            n4 = R$styleable.TextAppearance_android_textSize;
            int n8 = -1;
            if ((n4 = object.getDimensionPixelSize(n4, n8)) == 0) {
                n4 = 0;
                colorStateList = null;
                textView.setTextSize(0, 0.0f);
            }
        }
        this.m(context, tn3);
        int n10 = 26;
        if (n7 >= n10) {
            n10 = R$styleable.TextAppearance_fontVariationSettings;
            if ((n10 = (int)(object.hasValue(n10) ? 1 : 0)) != 0 && (object = object.getString(n10 = R$styleable.TextAppearance_fontVariationSettings)) != null) {
                b$d.d(textView, (String)object);
            }
        }
        tn3.g();
        object = this.l;
        if (object != null) {
            n10 = this.j;
            textView.setTypeface((Typeface)object, n10);
        }
    }

    public final void h(int n3, int n4, int n7, int n8) {
        Cn cn2 = this.i;
        boolean bl2 = cn2.j();
        if (bl2) {
            DisplayMetrics displayMetrics = cn2.j.getResources().getDisplayMetrics();
            float f5 = n3;
            f5 = TypedValue.applyDimension((int)n8, (float)f5, (DisplayMetrics)displayMetrics);
            float f6 = n4;
            f6 = TypedValue.applyDimension((int)n8, (float)f6, (DisplayMetrics)displayMetrics);
            float f7 = n7;
            f7 = TypedValue.applyDimension((int)n8, (float)f7, (DisplayMetrics)displayMetrics);
            cn2.k(f5, f6, f7);
            n3 = (int)(cn2.h() ? 1 : 0);
            if (n3 != 0) {
                cn2.a();
            }
        }
    }

    public final void i(int[] object, int n3) {
        Object object2 = this.i;
        boolean n4 = ((Cn)object2).j();
        if (n4) {
            int n7 = ((Object)object).length;
            if (n7 > 0) {
                int[] nArray = new int[n7];
                if (n3 == 0) {
                    nArray = Arrays.copyOf((int[])object, n7);
                } else {
                    DisplayMetrics displayMetrics = ((Cn)object2).j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < n7; ++i3) {
                        int n8;
                        float f5 = (float)object[i3];
                        f5 = TypedValue.applyDimension((int)n3, (float)f5, (DisplayMetrics)displayMetrics);
                        nArray[i3] = n8 = Math.round(f5);
                    }
                }
                Object object3 = Cn.b(nArray);
                ((Cn)object2).f = object3;
                n3 = (int)(((Cn)object2).i() ? 1 : 0);
                if (n3 == 0) {
                    object3 = new IllegalArgumentException;
                    object2 = new StringBuilder("None of the preset sizes is valid: ");
                    object = Arrays.toString((int[])object);
                    ((StringBuilder)object2).append((String)object);
                    object = ((StringBuilder)object2).toString();
                    object3((String)object);
                    throw object3;
                }
            } else {
                ((Cn)object2).g = false;
            }
            boolean bl2 = ((Cn)object2).h();
            if (bl2) {
                ((Cn)object2).a();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void j(int n3) {
        Object object = this.i;
        int n4 = ((Cn)object).j();
        if (n4 == 0) return;
        if (n3 == 0) {
            float f5;
            n3 = 0;
            float f6 = 0.0f;
            Object var5_8 = null;
            ((Cn)object).a = 0;
            n4 = -1082130432;
            ((Cn)object).d = f5 = -1.0f;
            ((Cn)object).e = f5;
            ((Cn)object).c = f5;
            int[] nArray = new int[]{};
            ((Cn)object).f = nArray;
            ((Cn)object).b = false;
            return;
        }
        n4 = 1;
        float f7 = Float.MIN_VALUE;
        if (n3 == n4) {
            DisplayMetrics displayMetrics = ((Cn)object).j.getResources().getDisplayMetrics();
            n4 = 2;
            float f8 = TypedValue.applyDimension((int)n4, (float)12.0f, (DisplayMetrics)displayMetrics);
            float f11 = 112.0f;
            float f12 = TypedValue.applyDimension((int)n4, (float)f11, (DisplayMetrics)displayMetrics);
            n4 = 1065353216;
            f7 = 1.0f;
            ((Cn)object).k(f8, f12, f7);
            n3 = (int)(((Cn)object).h() ? 1 : 0);
            if (n3 == 0) return;
            ((Cn)object).a();
            return;
        }
        String string2 = hj0_0.a(n3, "Unknown auto-size text type: ");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final void k(ColorStateList colorStateList) {
        boolean bl2;
        Rn3 rn3 = this.h;
        if (rn3 == null) {
            this.h = rn3 = new Object();
        }
        rn3 = this.h;
        rn3.a = colorStateList;
        if (colorStateList != null) {
            bl2 = true;
        } else {
            bl2 = false;
            colorStateList = null;
        }
        rn3.d = bl2;
        this.b = rn3;
        this.c = rn3;
        this.d = rn3;
        this.e = rn3;
        this.f = rn3;
        this.g = rn3;
    }

    public final void l(PorterDuff.Mode mode) {
        boolean bl2;
        Rn3 rn3 = this.h;
        if (rn3 == null) {
            this.h = rn3 = new Object();
        }
        rn3 = this.h;
        rn3.b = mode;
        if (mode != null) {
            bl2 = true;
        } else {
            bl2 = false;
            mode = null;
        }
        rn3.c = bl2;
        this.b = rn3;
        this.c = rn3;
        this.d = rn3;
        this.e = rn3;
        this.f = rn3;
        this.g = rn3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m(Context object, Tn3 tn3) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        TypedArray typedArray;
        int n14;
        int n15;
        block17: {
            n15 = R$styleable.TextAppearance_android_textStyle;
            n14 = this.j;
            typedArray = tn3.b;
            n15 = typedArray.getInt(n15, n14);
            this.j = n15;
            n15 = Build.VERSION.SDK_INT;
            n14 = 28;
            n10 = 2;
            n8 = -1;
            if (n15 >= n14) {
                n7 = R$styleable.TextAppearance_android_textFontWeight;
                this.k = n7 = typedArray.getInt(n7, n8);
                if (n7 != n8) {
                    this.j = n7 = this.j & n10;
                }
            }
            n7 = R$styleable.TextAppearance_android_fontFamily;
            n7 = (int)(typedArray.hasValue(n7) ? 1 : 0);
            n4 = 1;
            if (n7 == 0) {
                n7 = R$styleable.TextAppearance_fontFamily;
                if ((n7 = (int)(typedArray.hasValue(n7) ? 1 : 0)) == 0) {
                    int n16 = R$styleable.TextAppearance_android_typeface;
                    if ((n16 = (int)(typedArray.hasValue(n16) ? 1 : 0)) == 0) return;
                    this.m = false;
                    n16 = R$styleable.TextAppearance_android_typeface;
                    if ((n16 = typedArray.getInt(n16, n4)) == n4) {
                        object = Typeface.SANS_SERIF;
                        this.l = object;
                        return;
                    }
                    if (n16 == n10) {
                        object = Typeface.SERIF;
                        this.l = object;
                        return;
                    }
                    int n17 = 3;
                    if (n16 != n17) {
                        return;
                    }
                    object = Typeface.MONOSPACE;
                    this.l = object;
                    return;
                }
            }
            this.l = null;
            n7 = R$styleable.TextAppearance_fontFamily;
            n7 = (n7 = (int)(typedArray.hasValue(n7) ? 1 : 0)) != 0 ? R$styleable.TextAppearance_fontFamily : R$styleable.TextAppearance_android_fontFamily;
            int n18 = this.k;
            int n19 = this.j;
            int n20 = object.isRestricted();
            if (n20 == 0) {
                block15: {
                    block16: {
                        Object object2 = this.a;
                        object = new WeakReference(object2);
                        object2 = new b$a(this, n18, n19, (WeakReference)object);
                        n20 = this.j;
                        object = tn3.d(n7, n20, (b$a)object2);
                        if (object == null) break block15;
                        if (n15 < n14 || (n3 = this.k) == n8) break block16;
                        object = Typeface.create((Typeface)object, (int)0);
                        n3 = this.k;
                        n15 = this.j & n10;
                        n15 = n15 != 0;
                        object = b$e.a((Typeface)object, n3, n15 != 0);
                        this.l = object;
                    }
                    try {
                        this.l = object;
                    }
                    catch (Resources.NotFoundException | UnsupportedOperationException throwable) {
                        break block17;
                    }
                }
                if ((object = this.l) == null) {
                    n20 = 1;
                } else {
                    n20 = 0;
                    object = null;
                }
                this.m = n20;
            }
        }
        if ((object = this.l) != null) return;
        object = typedArray.getString(n7);
        if (object == null) return;
        n3 = Build.VERSION.SDK_INT;
        if (n3 >= n14 && (n3 = this.k) != n8) {
            object = Typeface.create((String)object, (int)0);
            n3 = this.k;
            n15 = this.j & n10;
            if (!n15) {
                n4 = 0;
            }
            object = b$e.a((Typeface)object, n3, n4 != 0);
            this.l = object;
            return;
        }
        n3 = this.j;
        object = Typeface.create((String)object, (int)n3);
        this.l = object;
    }
}

