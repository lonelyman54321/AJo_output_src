/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.text.TextPaint
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewOutlineProvider
 *  android.view.ViewParent
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.TextView
 */
package com.skydoves.balloon;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.lifecycle.i;
import com.skydoves.balloon.AutoDismissRunnable;
import com.skydoves.balloon.Balloon$a;
import com.skydoves.balloon.Balloon$b;
import com.skydoves.balloon.Balloon$dismiss$$inlined$circularUnRevealed$1;
import com.skydoves.balloon.Balloon$e;
import com.skydoves.balloon.Balloon$f;
import com.skydoves.balloon.Balloon$showAlignBottom$$inlined$show$1;
import com.skydoves.balloon.R$layout;
import com.skydoves.balloon.R$style;
import com.skydoves.balloon.f$a;
import com.skydoves.balloon.g;
import com.skydoves.balloon.g$a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.c;
import kotlin.ranges.f;

public final class Balloon
implements jm0_1 {
    public final Context a;
    public final Balloon$a b;
    public final yu_1 c;
    public final PopupWindow d;
    public final PopupWindow e;
    public boolean f;
    public boolean g;
    public final rq1_2 h;
    public final rq1_2 i;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Balloon(Context var1_1, Balloon$a var2_2) {
        block28: {
            block27: {
                block24: {
                    block25: {
                        block26: {
                            var3_3 = this;
                            var4_4 = var1_1;
                            var5_5 = var2_2;
                            super();
                            this.a = var1_1;
                            this.b = var2_2;
                            var6_6 = LayoutInflater.from((Context)var1_1);
                            var7_7 = R$layout.balloon_layout_body;
                            var8_8 = 0;
                            var9_9 = 0.0f;
                            var10_10 = null;
                            var11_11 = 0;
                            var12_12 = 0.0f;
                            var13_13 = null;
                            var6_6 = yu_1.bind(var6_6.inflate(var7_7, null, false));
                            var14_14 = "inflate(LayoutInflater.from(context), null, false)";
                            Intrinsics.checkNotNullExpressionValue(var6_6, var14_14);
                            this.c = var6_6;
                            var15_15 /* !! */  = LayoutInflater.from((Context)var1_1);
                            var16_16 = R$layout.balloon_layout_overlay;
                            var15_15 /* !! */  = zu_2.bind(var15_15 /* !! */ .inflate(var16_16, null, false));
                            Intrinsics.checkNotNullExpressionValue(var15_15 /* !! */ , var14_14);
                            var17_17 = var6_6.a;
                            var18_18 = -2;
                            super((View)var17_17, var18_18, var18_18);
                            this.d = var14_14;
                            var19_19 = var15_15 /* !! */ .a;
                            var20_20 = -1;
                            super((View)var19_19, var20_20, var20_20);
                            this.e = var17_17;
                            var2_2.getClass();
                            var17_17 = et1_2.NONE;
                            var19_19 = Balloon$f.c;
                            var19_19 = yr1_2.a((et1_2)var17_17, (Function0)var19_19);
                            this.h = var19_19;
                            super(this);
                            var19_19 = yr1_2.a((et1_2)var17_17, (Function0)var19_19);
                            this.i = var19_19;
                            super(this);
                            yr1_2.a((et1_2)var17_17, (Function0)var19_19);
                            var21_21 = var2_2.F;
                            var19_19 = var6_6.d;
                            var19_19.setAlpha(var21_21);
                            var21_21 = var2_2.t;
                            var19_19.setRadius(var21_21);
                            var17_17 = ViewCompat.a;
                            var21_21 = var2_2.G;
                            ViewCompat$c.m((View)var19_19, var21_21);
                            var22_22 = new GradientDrawable();
                            var23_23 = var2_2.s;
                            var22_22.setColor(var23_23);
                            var24_24 = var2_2.t;
                            var22_22.setCornerRadius(var24_24);
                            var19_19.setBackground((Drawable)var22_22);
                            var25_25 = var2_2.d;
                            var23_23 = var2_2.e;
                            var26_26 = var2_2.f;
                            var27_27 = var2_2.g;
                            var19_19.setPadding(var25_25, var23_23, var26_26, var27_27);
                            var22_22 = var6_6.g.getLayoutParams();
                            Intrinsics.checkNotNull(var22_22, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            var22_22 = (ViewGroup.MarginLayoutParams)var22_22;
                            var23_23 = var2_2.i;
                            var26_26 = var2_2.h;
                            var22_22.setMargins(var23_23, 0, var26_26, 0);
                            var25_25 = 1;
                            var14_14.setOutsideTouchable((boolean)var25_25);
                            var23_23 = (int)var2_2.V;
                            var14_14.setFocusable((boolean)var23_23);
                            var28_28 = new ColorDrawable(0);
                            var14_14.setBackgroundDrawable((Drawable)var28_28);
                            var14_14.setElevation(var21_21);
                            var16_16 = Build.VERSION.SDK_INT;
                            var23_23 = 22;
                            var24_24 = 3.1E-44f;
                            if (var16_16 >= var23_23) {
                                var23_23 = (int)var2_2.X;
                                nu_2.a((PopupWindow)var14_14, (boolean)var23_23);
                            }
                            var23_23 = (int)this.o();
                            var29_29 = "binding.balloonCard";
                            if (var23_23 == 0) break block25;
                            var17_17 = var5_5.H;
                            if (var17_17 == null) break block26;
                            var16_16 = var17_17.intValue();
                            var30_30 = LayoutInflater.from((Context)var1_1);
                            var13_13 = var30_30.inflate(var16_16, (ViewGroup)var19_19, false);
                            if (var13_13 == null) break block26;
                            var17_17 = var13_13.getParent();
                            var20_20 = var17_17 instanceof ViewGroup;
                            if (var20_20 != 0) {
                                var10_10 = var17_17;
                                var10_10 = (ViewGroup)var17_17;
                            }
                            if (var10_10 != null) {
                                var10_10.removeView((View)var13_13);
                            }
                            var19_19.removeAllViews();
                            var19_19.addView((View)var13_13);
                            Intrinsics.checkNotNullExpressionValue(var19_19, var29_29);
                            var3_3.t((ViewGroup)var19_19);
                            var31_32 /* !! */  = var6_6;
                            break block27;
                        }
                        super("The custom layout is null.");
                        throw var4_4;
                    }
                    var28_28 = var6_6.f;
                    Intrinsics.checkNotNullExpressionValue(var28_28, "initializeIcon$lambda$16");
                    var32_33 = var28_28.getContext();
                    var33_34 = "context";
                    Intrinsics.checkNotNullExpressionValue(var32_33, var33_34);
                    Intrinsics.checkNotNullParameter(var32_33, var33_34);
                    super();
                    var32_33 = qc1_2.START;
                    var13_13.b = var32_33;
                    var34_35 = 28;
                    var13_13.c = var8_8 = on_2.b(var34_35, var25_25);
                    var13_13.d = var8_8 = on_2.b(var34_35, var25_25);
                    var9_9 = 8;
                    var13_13.e = var8_8 = on_2.b(var9_9, var25_25);
                    var13_13.f = var20_20;
                    var10_10 = StringCompanionObject.INSTANCE;
                    var13_13.g = var10_10 = "";
                    var32_33 = var5_5.z;
                    var13_13.a = var32_33;
                    var13_13.c = var27_27 = var5_5.B;
                    var13_13.d = var27_27 = var5_5.C;
                    var13_13.f = var27_27 = var5_5.E;
                    var13_13.e = var27_27 = var5_5.D;
                    var32_33 = var5_5.A;
                    var30_31 = "value";
                    Intrinsics.checkNotNullParameter(var32_33, var30_31);
                    var13_13.b = var32_33;
                    super((f$a)var13_13);
                    var13_13 = "<this>";
                    Intrinsics.checkNotNullParameter(var28_28, (String)var13_13);
                    Intrinsics.checkNotNullParameter(var32_33, "iconForm");
                    var22_22 = var32_33.a;
                    if (var22_22 != null) {
                        var35_36 = var32_33.f;
                        var36_37 = var35_36;
                        var31_32 /* !! */  = var6_6;
                        var37_38 /* !! */  = -1 << -1;
                        var38_39 = -0.0f;
                        if (var35_36 != var37_38 /* !! */ ) {
                            var35_36 = 1;
                            var39_40 = 1.4E-45f;
                        } else {
                            var35_36 = 0;
                            var39_40 = 0.0f;
                            var4_4 = null;
                        }
                        var40_41 = var35_36 != 0 ? var36_37 : null;
                        var41_42 = var32_33.e;
                        var42_43 = var32_33.c;
                        var43_44 = var32_33.d;
                        var44_45 = 238079;
                        var6_6 = var32_33.g;
                        var4_4 = new ia3_2(null, null, null, null, (String)var6_6, var41_42, var42_43, var43_44, null, var40_41, null, null, null, var44_45);
                        var6_6 = Jm3$a.$EnumSwitchMapping$0;
                        var32_33 = var32_33.b;
                        var27_27 = var32_33.ordinal();
                        var37_38 /* !! */  = (int)var6_6[var27_27];
                        var27_27 = 1;
                        var34_35 = 1.4E-45f;
                        if (var37_38 /* !! */  != var27_27) {
                            var27_27 = 2;
                            var34_35 = 2.8E-45f;
                            if (var37_38 /* !! */  != var27_27) {
                                var27_27 = 3;
                                var34_35 = 4.2E-45f;
                                if (var37_38 /* !! */  != var27_27) {
                                    var27_27 = 4;
                                    var34_35 = 5.6E-45f;
                                    if (var37_38 /* !! */  == var27_27) {
                                        var4_4.f = var22_22;
                                        var37_38 /* !! */  = 0;
                                        var38_39 = 0.0f;
                                        var6_6 = null;
                                        var4_4.b = null;
                                    }
                                } else {
                                    var37_38 /* !! */  = 0;
                                    var38_39 = 0.0f;
                                    var6_6 = null;
                                    var4_4.g = var22_22;
                                    var4_4.c = null;
                                }
                            } else {
                                var37_38 /* !! */  = 0;
                                var38_39 = 0.0f;
                                var6_6 = null;
                                var4_4.h = var22_22;
                                var4_4.d = null;
                            }
                        } else {
                            var37_38 /* !! */  = 0;
                            var38_39 = 0.0f;
                            var6_6 = null;
                            var4_4.e = var22_22;
                            var4_4.a = null;
                        }
                        var28_28.setDrawableTextViewParams((ia3_2)var4_4);
                    } else {
                        var31_32 /* !! */  = var6_6;
                    }
                    var4_4 = var28_28.a;
                    if (var4_4 != null) {
                        var37_38 /* !! */  = var5_5.T;
                        var4_4.i = var37_38 /* !! */ ;
                        jm3_0.a((TextView)var28_28, (ia3_2)var4_4);
                    }
                    Intrinsics.checkNotNullExpressionValue(var28_28, "initializeText$lambda$19");
                    var4_4 = var28_28.getContext();
                    Intrinsics.checkNotNullExpressionValue(var4_4, var33_34);
                    Intrinsics.checkNotNullParameter(var4_4, var33_34);
                    super();
                    var6_6.a = var10_10;
                    var6_6.b = 12.0f;
                    var6_6.c = -1;
                    var6_6.h = 17;
                    var4_4 = var5_5.u;
                    Intrinsics.checkNotNullParameter(var4_4, var30_31);
                    var6_6.a = var4_4;
                    var6_6.b = var39_40 = var5_5.w;
                    var6_6.c = var35_36 = var5_5.v;
                    var6_6.d = false;
                    var6_6.h = var35_36 = var5_5.y;
                    var6_6.e = var35_36 = var5_5.x;
                    var35_36 = 0;
                    var39_40 = 0.0f;
                    var4_4 = null;
                    var6_6.f = null;
                    var6_6.g = null;
                    var28_28.setMovementMethod(null);
                    var10_10 = new g((g$a)var6_6);
                    Intrinsics.checkNotNullParameter(var28_28, (String)var13_13);
                    var6_6 = "textForm";
                    Intrinsics.checkNotNullParameter(var10_10, (String)var6_6);
                    var37_38 /* !! */  = (int)var10_10.d;
                    var13_13 = var10_10.a;
                    var20_20 = 1;
                    if (var37_38 /* !! */  == var20_20) {
                        var6_6 = var13_13.toString();
                        var11_11 = 24;
                        var12_12 = 3.4E-44f;
                        if (var16_16 >= var11_11) {
                            var6_6 = jC2.a((String)var6_6);
lbl242:
                            // 2 sources

                            while (true) {
                                var13_13 = var6_6;
                                break block24;
                                break;
                            }
                        }
                        var11_11 = 0;
                        var12_12 = 0.0f;
                        var13_13 = null;
                        var6_6 = D91.a(0, (String)var6_6);
                        ** continue;
                    }
                    if (var37_38 /* !! */  != 0) break block28;
                }
                var28_28.setText((CharSequence)var13_13);
                var38_39 = var10_10.b;
                var28_28.setTextSize(var38_39);
                var37_38 /* !! */  = var10_10.h;
                var28_28.setGravity(var37_38 /* !! */ );
                var37_38 /* !! */  = var10_10.c;
                var28_28.setTextColor(var37_38 /* !! */ );
                var6_6 = var10_10.g;
                if (var6_6 != null) {
                    var38_39 = var6_6.floatValue();
                    var11_11 = 1065353216;
                    var12_12 = 1.0f;
                    var28_28.setLineSpacing(var38_39, var12_12);
                }
                if ((var6_6 = var10_10.f) != null) {
                    var28_28.setTypeface((Typeface)var6_6);
                    var4_4 = Unit.a;
                }
                if (var4_4 == null) {
                    var4_4 = var28_28.getTypeface();
                    var37_38 /* !! */  = var10_10.e;
                    var28_28.setTypeface((Typeface)var4_4, var37_38 /* !! */ );
                }
                var4_4 = "this";
                Intrinsics.checkNotNullExpressionValue(var28_28, (String)var4_4);
                Intrinsics.checkNotNullExpressionValue(var19_19, var29_29);
                var3_3.r((TextView)var28_28, (View)var19_19);
            }
            this.q();
            var2_2.getClass();
            super(var3_3);
            var14_14.setOnDismissListener((PopupWindow.OnDismissListener)var4_4);
            super(var3_3);
            var14_14.setTouchInterceptor((View.OnTouchListener)var4_4);
            super(var3_3);
            var15_15 /* !! */ .a.setOnClickListener((View.OnClickListener)var4_4);
            var4_4 = var31_32 /* !! */ ;
            var4_4 = var31_32 /* !! */ .a;
            var6_6 = "binding.root";
            Intrinsics.checkNotNullExpressionValue(var4_4, (String)var6_6);
            Balloon.f((ViewGroup)var4_4);
            var4_4 = var5_5.L;
            if (var4_4 != null) ** GOTO lbl-1000
            var6_6 = var1_1;
            var7_7 = var1_1 instanceof mu1_1;
            if (var7_7 != 0) {
                var4_4 = var1_1;
                var5_5.L = var4_4 = (mu1_1)var1_1;
                var4_4 = var4_4.getLifecycle();
                var4_4.a(var3_3);
            } else if (var4_4 != null && (var4_4 = var4_4.getLifecycle()) != null) {
                var4_4.a(var3_3);
            }
            return;
        }
        var4_4 = new NoWhenBranchMatchedException();
        throw var4_4;
    }

    public /* synthetic */ Balloon(Context context, Balloon$a balloon$a, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, balloon$a);
    }

    public static final void b(Balloon balloon2) {
        Balloon$a balloon$a = balloon2.b;
        int n3 = balloon$a.M;
        balloon2 = balloon2.d;
        int n4 = -1 << -1;
        if (n3 == n4) {
            vu_2 vu_22 = balloon$a.O;
            Object object = Balloon$b.$EnumSwitchMapping$2;
            n3 = vu_22.ordinal();
            n4 = 1;
            if ((n3 = object[n3]) != n4) {
                n4 = 2;
                int n7 = 4;
                if (n3 != n4) {
                    int n8 = 3;
                    if (n3 != n8) {
                        if (n3 != n7) {
                            n8 = 5;
                            if (n3 == n8) {
                                n8 = R$style.Balloon_Normal_Anim;
                                balloon2.setAnimationStyle(n8);
                            }
                        } else {
                            n8 = R$style.Balloon_Overshoot_Anim;
                            balloon2.setAnimationStyle(n8);
                        }
                    } else {
                        n8 = R$style.Balloon_Fade_Anim;
                        balloon2.setAnimationStyle(n8);
                    }
                } else {
                    vu_22 = balloon2.getContentView();
                    Intrinsics.checkNotNullExpressionValue((Object)vu_22, "bodyWindow.contentView");
                    Intrinsics.checkNotNullParameter((Object)vu_22, "<this>");
                    vu_22.setVisibility(n7);
                    object = new rc3_1;
                    long l2 = balloon$a.Q;
                    object(l2, (View)vu_22);
                    vu_22.post((Runnable)object);
                    int n10 = R$style.Balloon_Normal_Dispose_Anim;
                    balloon2.setAnimationStyle(n10);
                }
            } else {
                int n14 = R$style.Balloon_Elastic_Anim;
                balloon2.setAnimationStyle(n14);
            }
        } else {
            balloon2.setAnimationStyle(n3);
        }
    }

    public static final void c(Balloon balloon2) {
        Object object = balloon2.b;
        int n3 = ((Balloon$a)object).N;
        balloon2 = balloon2.e;
        int n4 = -1 << -1;
        if (n3 == n4) {
            int[] nArray = Balloon$b.$EnumSwitchMapping$3;
            object = ((Balloon$a)object).P;
            int n7 = ((Enum)object).ordinal();
            n3 = 1;
            if ((n7 = nArray[n7]) == n3) {
                n7 = R$style.Balloon_Fade_Anim;
                balloon2.setAnimationStyle(n7);
            } else {
                n7 = R$style.Balloon_Normal_Anim;
                balloon2.setAnimationStyle(n7);
            }
        } else {
            int n8 = ((Balloon$a)object).M;
            balloon2.setAnimationStyle(n8);
        }
    }

    public static final void d(Balloon balloon2, View view) {
        yu_1 yu_12 = balloon2.c;
        ImageView imageView = yu_12.c;
        Balloon$a balloon$a = balloon2.b;
        int n3 = balloon$a.l;
        Object object = new FrameLayout.LayoutParams(n3, n3);
        imageView.setLayoutParams((ViewGroup.LayoutParams)object);
        float f5 = balloon$a.F;
        imageView.setAlpha(f5);
        object = null;
        imageView.setPadding(0, 0, 0, 0);
        int n4 = -1 << -1;
        f5 = -0.0f;
        n3 = balloon$a.k;
        if (n3 != n4) {
            object = ColorStateList.valueOf((int)n3);
            Me1.a(imageView, (ColorStateList)object);
        } else {
            n4 = balloon$a.s;
            object = ColorStateList.valueOf((int)n4);
            Me1.a(imageView, (ColorStateList)object);
        }
        object = ViewOutlineProvider.BOUNDS;
        imageView.setOutlineProvider((ViewOutlineProvider)object);
        object = new ru_2(balloon2, view, (View)imageView, 0);
        yu_12.d.post((Runnable)object);
    }

    public static final void e(Balloon balloon2) {
        FrameLayout frameLayout = balloon2.c.b;
        qu_1 qu_12 = new qu_1(balloon2);
        frameLayout.post((Runnable)qu_12);
    }

    public static void f(ViewGroup object) {
        object.setFitsSystemWindows(false);
        int n3 = object.getChildCount();
        Object object2 = kotlin.ranges.f.m(0, n3);
        int n4 = yx_2.o((Iterable)object2, 10);
        ArrayList<Object> arrayList = new ArrayList<Object>(n4);
        object2 = ((c)object2).iterator();
        while (true) {
            Object object3 = object2;
            object3 = (ui1_2)object2;
            n4 = (int)(((ui1_2)object3).c ? 1 : 0);
            if (n4 == 0) break;
            object3 = object2;
            n4 = ((mi1_2)object2).nextInt();
            object3 = object.getChildAt(n4);
            arrayList.add(object3);
        }
        object = arrayList.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (View)object.next();
            object2.setFitsSystemWindows(false);
            boolean bl2 = object2 instanceof ViewGroup;
            if (!bl2) continue;
            object2 = (ViewGroup)object2;
            Balloon.f((ViewGroup)object2);
        }
    }

    public final /* synthetic */ void A(mu1_1 mu1_12) {
        im0.a(mu1_12);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean g(View view) {
        Activity activity;
        boolean bl2 = this.f;
        if (bl2) return false;
        bl2 = this.g;
        if (bl2) return false;
        Context context = this.a;
        boolean bl3 = context instanceof Activity;
        if (bl3 && (bl2 = (activity = (Activity)context).isFinishing())) return false;
        ViewParent viewParent = this.d.getContentView().getParent();
        if (viewParent != null) return false;
        WeakHashMap weakHashMap = ViewCompat.a;
        boolean bl4 = view.isAttachedToWindow();
        if (!bl4) return false;
        return true;
    }

    public final void h() {
        boolean bl2 = this.f;
        if (bl2) {
            Balloon$e balloon$e = new Balloon$e(this);
            Object object = this.b;
            vu_2 vu_22 = ((Balloon$a)object).O;
            Object object2 = vu_2.CIRCULAR;
            if (vu_22 == object2) {
                vu_22 = this.d.getContentView();
                object2 = "this.bodyWindow.contentView";
                Intrinsics.checkNotNullExpressionValue((Object)vu_22, (String)object2);
                long l2 = ((Balloon$a)object).Q;
                object = new Balloon$dismiss$$inlined$circularUnRevealed$1((View)vu_22, l2, balloon$e);
                vu_22.post((Runnable)object);
            } else {
                balloon$e.invoke();
            }
        }
    }

    public final void i(long l2) {
        Handler handler = (Handler)this.h.getValue();
        AutoDismissRunnable autoDismissRunnable = (AutoDismissRunnable)this.i.getValue();
        handler.postDelayed((Runnable)autoDismissRunnable, l2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final float j(View object) {
        yu_1 yu_12 = this.c;
        FrameLayout frameLayout = yu_12.e;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.balloonContent");
        frameLayout = ki2_2.a((View)frameLayout);
        int n3 = frameLayout.x;
        Point point = ki2_2.a(object);
        int n4 = point.x;
        Balloon$a balloon$a = this.b;
        int n7 = balloon$a.l;
        float f5 = n7;
        float f6 = balloon$a.q;
        f5 *= f6;
        f6 = 0.0f;
        f5 += f6;
        int n8 = this.n();
        f6 = (float)n8 - f5;
        float f7 = balloon$a.h;
        f6 -= f7;
        f7 = balloon$a.i;
        f6 -= f7;
        xp_2 xp_22 = balloon$a.n;
        int[] nArray = Balloon$b.$EnumSwitchMapping$1;
        int n10 = xp_22.ordinal();
        n10 = nArray[n10];
        int n14 = 1;
        float f8 = 0.5f;
        if (n10 != n14) {
            int n15 = 2;
            float f11 = 2.8E-45f;
            if (n10 == n15) {
                n10 = object.getWidth() + n4;
                if (n10 < n3) return f5;
                n10 = this.n() + n3;
                if (n10 < n4) return f6;
                int n16 = object.getWidth();
                float f12 = n16;
                f7 = balloon$a.m;
                f12 *= f7;
                float f14 = n4;
                f12 += f14;
                float f15 = n3;
                f12 -= f15;
                f15 = (float)balloon$a.l * f8;
                float f16 = (f12 -= f15) - (f15 = (float)(balloon$a.l * 2));
                n3 = (int)(f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1));
                if (n3 <= 0) return f5;
                n3 = this.n();
                n4 = balloon$a.l * 2;
                f11 = n3 -= n4;
                float f17 = f12 - f11;
                n15 = (int)(f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1));
                if (n15 <= 0) return f12;
                return f6;
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object = yu_12.g;
        int n17 = object.getWidth();
        float f18 = n17;
        float f19 = balloon$a.m;
        f18 *= f19;
        int n18 = balloon$a.l;
        f19 = (float)n18 * f8;
        return f18 - f19;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final float l(View object) {
        float f5;
        Balloon$a balloon$a = this.b;
        int n3 = balloon$a.W;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = new Rect();
        Context context = object.getContext();
        int n4 = context instanceof Activity;
        int n7 = 0;
        float f6 = 0.0f;
        if (n4 != 0 && n3 != 0) {
            context = (Activity)context;
            View view = context.getWindow().getDecorView();
            view.getWindowVisibleDisplayFrame(object2);
            n3 = object2.top;
        } else {
            n3 = 0;
            f5 = 0.0f;
            Object var9_10 = null;
        }
        object2 = this.c;
        context = object2.e;
        Intrinsics.checkNotNullExpressionValue(context, "binding.balloonContent");
        context = ki2_2.a((View)context);
        int n8 = context.y - n3;
        Point point = ki2_2.a(object);
        n4 = point.y - n3;
        n3 = balloon$a.l;
        f5 = n3;
        float f7 = balloon$a.q;
        f5 *= f7;
        f6 = 0.0f;
        int n10 = this.m();
        f7 = (float)n10 - (f5 += f6) - f6 - f6;
        n7 = balloon$a.l;
        int n14 = 2;
        n7 /= n14;
        xp_2 xp_22 = balloon$a.n;
        int[] nArray = Balloon$b.$EnumSwitchMapping$1;
        int n15 = xp_22.ordinal();
        n15 = nArray[n15];
        int n16 = 1;
        if (n15 != n16) {
            if (n15 == n14) {
                int n17 = object.getHeight() + n4;
                if (n17 < n8) return f5;
                n17 = this.m() + n8;
                if (n17 < n4) return f7;
                int n18 = object.getHeight();
                float f8 = n18;
                float f11 = balloon$a.m;
                f8 *= f11;
                f11 = n4;
                f8 += f11;
                f11 = n8;
                f8 -= f11;
                f11 = n7;
                float f12 = (f8 -= f11) - (f11 = (float)(balloon$a.l * 2));
                n17 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
                if (n17 <= 0) return f5;
                n3 = this.m();
                int n19 = balloon$a.l * 2;
                float f14 = n3 -= n19;
                float f15 = f8 - f14;
                if ((n19 = (int)(f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1))) <= 0) return f8;
                return f7;
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object = object2.g;
        int n20 = object.getHeight();
        float f16 = n20;
        float f17 = balloon$a.m;
        f16 *= f17;
        f17 = n7;
        return f16 - f17;
    }

    public final int m() {
        Balloon$a balloon$a = this.b;
        int n3 = balloon$a.c;
        int n4 = -1 << -1;
        if (n3 != n4) {
            return n3;
        }
        return this.c.a.getMeasuredHeight();
    }

    public final int n() {
        int n3 = Resources.getSystem().getDisplayMetrics().widthPixels;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int n4 = displayMetrics.heightPixels;
        Point point = new Point(n3, n4);
        int n7 = point.x;
        Balloon$a balloon$a = this.b;
        balloon$a.getClass();
        balloon$a.getClass();
        balloon$a.getClass();
        n4 = balloon$a.a;
        int n8 = -1 << -1;
        if (n4 != n8) {
            if (n4 <= n7) {
                n7 = n4;
            }
        } else {
            point = this.c.a;
            n7 = point.getMeasuredWidth();
            balloon$a.getClass();
            n3 = balloon$a.b;
            n4 = 0;
            displayMetrics = null;
            n7 = kotlin.ranges.f.g(n7, 0, n3);
        }
        return n7;
    }

    public final boolean o() {
        boolean bl2;
        Balloon$a balloon$a = this.b;
        Integer n3 = balloon$a.H;
        if (n3 == null) {
            balloon$a.getClass();
            bl2 = false;
            balloon$a = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void onDestroy(mu1_1 object) {
        boolean bl2;
        String string2 = "owner";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object, string2);
        this.g = bl2 = true;
        this.e.dismiss();
        this.d.dismiss();
        object = this.b.L;
        if (object != null && (object = object.getLifecycle()) != null) {
            ((i)object).c(this);
        }
    }

    public final /* synthetic */ void onStart(mu1_1 mu1_12) {
        im0.c(mu1_12);
    }

    public final void onStop(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final /* synthetic */ void p(mu1_1 mu1_12) {
        im0.b(mu1_12);
    }

    public final void q() {
        Object object = this.b;
        int n3 = ((Balloon$a)object).l;
        int n4 = 1;
        n3 -= n4;
        float f5 = ((Balloon$a)object).G;
        int n7 = (int)f5;
        FrameLayout frameLayout = this.c.e;
        object = ((Balloon$a)object).p;
        int[] nArray = Balloon$b.$EnumSwitchMapping$0;
        int n8 = ((Enum)object).ordinal();
        if ((n8 = nArray[n8]) != n4) {
            n4 = 2;
            if (n8 != n4) {
                n4 = 3;
                if (n8 != n4) {
                    n4 = 4;
                    if (n8 == n4) {
                        frameLayout.setPadding(n3, n7, n3, n7);
                    }
                } else {
                    frameLayout.setPadding(n3, n7, n3, n7);
                }
            } else {
                n8 = n3 < n7 ? n7 : n3;
                frameLayout.setPadding(n7, n3, n7, n8);
            }
        } else {
            n8 = n3 < n7 ? n7 : n3;
            frameLayout.setPadding(n7, n3, n7, n8);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void r(TextView textView, View view) {
        int n3;
        int n4;
        int n7;
        String string2;
        Object object;
        int n8;
        Drawable drawable2;
        block22: {
            block23: {
                int n10;
                int n14;
                Drawable drawable3;
                block21: {
                    int n15;
                    TextPaint textPaint = textView.getPaint();
                    drawable2 = ((Object)textView.getText()).toString();
                    float f5 = textPaint.measureText((String)drawable2);
                    n8 = (int)f5;
                    drawable2 = textView.getCompoundDrawablesRelative();
                    object = "compoundDrawablesRelative";
                    Intrinsics.checkNotNullExpressionValue(drawable2, (String)object);
                    string2 = "<this>";
                    Intrinsics.checkNotNullParameter(drawable2, string2);
                    n7 = 0;
                    drawable3 = drawable2[0];
                    n14 = 2;
                    if (drawable3 != null || (drawable2 = drawable2[n14]) != null) break block21;
                    drawable2 = textView.getCompoundDrawables();
                    object = "compoundDrawables";
                    Intrinsics.checkNotNullExpressionValue(drawable2, (String)object);
                    Intrinsics.checkNotNullParameter(drawable2, string2);
                    drawable3 = drawable2[0];
                    if (drawable3 == null && (drawable2 = drawable2[n14]) == null) break block22;
                    drawable2 = textView.getCompoundDrawables();
                    Intrinsics.checkNotNullExpressionValue(drawable2, (String)object);
                    Intrinsics.checkNotNullParameter(drawable2, string2);
                    drawable3 = drawable2[0];
                    if (drawable3 != null) {
                        n15 = drawable3.getIntrinsicHeight();
                    } else {
                        n15 = 0;
                        drawable3 = null;
                    }
                    drawable2 = drawable2[n14];
                    if (drawable2 != null) {
                        n4 = drawable2.getIntrinsicHeight();
                    } else {
                        n4 = 0;
                        drawable2 = null;
                    }
                    if (n15 < n4) {
                        n15 = n4;
                    }
                    textView.setMinHeight(n15);
                    drawable2 = textView.getCompoundDrawables();
                    Intrinsics.checkNotNullExpressionValue(drawable2, (String)object);
                    Intrinsics.checkNotNullParameter(drawable2, string2);
                    object = drawable2[0];
                    if (object != null) {
                        n3 = object.getIntrinsicWidth();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    drawable2 = drawable2[n14];
                    if (drawable2 != null) {
                        n7 = drawable2.getIntrinsicWidth();
                    }
                    n7 += n3;
                    n4 = textView.getCompoundPaddingStart();
                    n3 = textView.getCompoundPaddingEnd();
                    break block23;
                }
                drawable2 = textView.getCompoundDrawablesRelative();
                Intrinsics.checkNotNullExpressionValue(drawable2, (String)object);
                Intrinsics.checkNotNullParameter(drawable2, string2);
                drawable3 = drawable2[0];
                if (drawable3 != null) {
                    n10 = drawable3.getIntrinsicHeight();
                } else {
                    n10 = 0;
                    drawable3 = null;
                }
                drawable2 = drawable2[n14];
                if (drawable2 != null) {
                    n4 = drawable2.getIntrinsicHeight();
                } else {
                    n4 = 0;
                    drawable2 = null;
                }
                if (n10 < n4) {
                    n10 = n4;
                }
                textView.setMinHeight(n10);
                drawable2 = textView.getCompoundDrawablesRelative();
                Intrinsics.checkNotNullExpressionValue(drawable2, (String)object);
                Intrinsics.checkNotNullParameter(drawable2, string2);
                object = drawable2[0];
                if (object != null) {
                    n3 = object.getIntrinsicWidth();
                } else {
                    n3 = 0;
                    object = null;
                }
                drawable2 = drawable2[n14];
                if (drawable2 != null) {
                    n7 = drawable2.getIntrinsicWidth();
                }
                n7 += n3;
                n4 = textView.getCompoundPaddingStart();
                n3 = textView.getCompoundPaddingEnd();
            }
            n3 = n3 + n4 + n7;
            n8 += n3;
        }
        n3 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int n16 = Resources.getSystem().getDisplayMetrics().heightPixels;
        drawable2 = new Point(n3, n16);
        n4 = drawable2.x;
        n3 = view.getPaddingLeft();
        int n17 = view.getPaddingRight() + n3;
        object = this.b;
        string2 = ((Balloon$a)object).z;
        if (string2 != null) {
            n16 = ((Balloon$a)object).B;
            n7 = ((Balloon$a)object).D;
            n16 += n7;
        } else {
            n16 = ((Balloon$a)object).h;
            n7 = ((Balloon$a)object).i;
            n16 += n7;
            n7 = ((Balloon$a)object).l * 2;
            n16 += n7;
        }
        n17 += n16;
        n16 = ((Balloon$a)object).b - n17;
        n3 = ((Balloon$a)object).a;
        n7 = -1 << -1;
        if (n3 != n7 && n3 <= n4) {
            n3 -= n17;
        } else {
            if (n8 > n16) {
                n8 = n16;
            }
            n3 = n8;
        }
        textView.setMaxWidth(n3);
    }

    public final void s(View object, int n3, int n4) {
        Intrinsics.checkNotNullParameter(object, "anchor");
        View[] viewArray = new View[]{object};
        View view = viewArray[0];
        boolean bl2 = this.g(view);
        if (bl2) {
            Balloon$showAlignBottom$$inlined$show$1 balloon$showAlignBottom$$inlined$show$1 = new Balloon$showAlignBottom$$inlined$show$1(this, view, viewArray, this, (View)object, n3, n4);
            view.post((Runnable)balloon$showAlignBottom$$inlined$show$1);
        } else {
            object = this.b;
            object.getClass();
        }
    }

    public final void t(ViewGroup viewGroup) {
        int n3 = viewGroup.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = viewGroup.getChildAt(i3);
            String string2 = "getChildAt(index)";
            Intrinsics.checkNotNullExpressionValue(view, string2);
            boolean bl2 = view instanceof TextView;
            if (bl2) {
                view = (TextView)view;
                this.r((TextView)view, (View)viewGroup);
                continue;
            }
            bl2 = view instanceof ViewGroup;
            if (!bl2) continue;
            view = (ViewGroup)view;
            this.t((ViewGroup)view);
        }
    }

    public final void w(mu1_1 mu1_12) {
        String string2 = "owner";
        Intrinsics.checkNotNullParameter(mu1_12, string2);
        Intrinsics.checkNotNullParameter(mu1_12, string2);
        this.b.getClass();
    }
}

