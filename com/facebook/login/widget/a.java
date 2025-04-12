/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.PopupWindow
 *  android.widget.TextView
 */
package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.login.R$drawable;
import com.facebook.login.R$id;
import com.facebook.login.widget.a$a;
import com.facebook.login.widget.a$b;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final String a;
    public final WeakReference b;
    public final Context c;
    public a$a d;
    public PopupWindow e;
    public a$b f;
    public long g;
    public final co3 h;

    public a(View object, String weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "text");
        Intrinsics.checkNotNullParameter(object, "anchor");
        this.a = weakReference;
        this.b = weakReference = new WeakReference<View>((View)object);
        object = object.getContext();
        Intrinsics.checkNotNullExpressionValue(object, "anchor.context");
        this.c = object;
        object = a$b.BLUE;
        this.f = object;
        this.g = 6000L;
        super(this);
        this.h = object;
    }

    public final void a() {
        Throwable throwable2;
        block5: {
            block4: {
                PopupWindow popupWindow;
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return;
                }
                try {
                    this.c();
                    popupWindow = this.e;
                    if (popupWindow == null) break block4;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                popupWindow.dismiss();
            }
            return;
        }
        td0.a(this, throwable2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        block18: {
            block14: {
                block15: {
                    var1_1 /* !! */  = this.c;
                    var2_3 = td0.b(this);
                    if (var2_3) {
                        return;
                    }
                    var3_4 /* !! */  = this.b;
                    var4_6 /* !! */  = var3_4 /* !! */ .get();
                    if (var4_6 /* !! */  == null) break block14;
                    var4_6 /* !! */  = new T(var1_1 /* !! */ );
                    var5_7 /* !! */  = var4_6 /* !! */ .d;
                    var6_8 /* !! */  = var4_6 /* !! */ .a;
                    var7_10 /* !! */  = var4_6 /* !! */ .b;
                    var8_11 = var4_6 /* !! */ .c;
                    this.d = var4_6 /* !! */ ;
                    var9_12 = R$id.com_facebook_tooltip_bubble_view_text_body;
                    var10_13 /* !! */  = var4_6 /* !! */ .findViewById(var9_12);
                    var11_14 /* !! */  = "null cannot be cast to non-null type android.widget.TextView";
                    Intrinsics.checkNotNull(var10_13 /* !! */ , var11_14 /* !! */ );
                    var10_13 /* !! */  = (TextView)var10_13 /* !! */ ;
                    var11_14 /* !! */  = this.a;
                    var10_13 /* !! */ .setText((CharSequence)var11_14 /* !! */ );
                    var10_13 /* !! */  = this.f;
                    var11_14 /* !! */  = a$b.BLUE;
                    if (var10_13 /* !! */  == var11_14 /* !! */ ) {
                        var9_12 = R$drawable.com_facebook_tooltip_blue_background;
                        var8_11.setBackgroundResource(var9_12);
                        var12_15 = R$drawable.com_facebook_tooltip_blue_bottomnub;
                        var7_10 /* !! */ .setImageResource(var12_15);
                        var13_17 = R$drawable.com_facebook_tooltip_blue_topnub;
                        var6_8 /* !! */ .setImageResource(var13_17);
                        var14_18 = R$drawable.com_facebook_tooltip_blue_xout;
                        var5_7 /* !! */ .setImageResource(var14_18);
                    } else {
                        var9_12 = R$drawable.com_facebook_tooltip_black_background;
                        var8_11.setBackgroundResource(var9_12);
                        var12_16 = R$drawable.com_facebook_tooltip_black_bottomnub;
                        var7_10 /* !! */ .setImageResource(var12_16);
                        var13_17 = R$drawable.com_facebook_tooltip_black_topnub;
                        var6_8 /* !! */ .setImageResource(var13_17);
                        var14_18 = R$drawable.com_facebook_tooltip_black_xout;
                        var5_7 /* !! */ .setImageResource(var14_18);
                    }
                    var5_7 /* !! */  = "null cannot be cast to non-null type android.app.Activity";
                    Intrinsics.checkNotNull(var1_1 /* !! */ , (String)var5_7 /* !! */ );
                    var1_1 /* !! */  = (Activity)var1_1 /* !! */ ;
                    var1_1 /* !! */  = var1_1 /* !! */ .getWindow();
                    var1_1 /* !! */  = var1_1 /* !! */ .getDecorView();
                    var5_7 /* !! */  = "window.decorView";
                    Intrinsics.checkNotNullExpressionValue(var1_1 /* !! */ , (String)var5_7 /* !! */ );
                    var15_19 = var1_1 /* !! */ .getWidth();
                    var16_20 = var1_1 /* !! */ .getHeight();
                    var14_18 = (int)td0.b(this);
                    if (var14_18 != 0) ** GOTO lbl65
                    {
                        catch (Throwable var1_2) {}
                    }
                    try {
                        this.c();
                        var6_8 /* !! */  = var3_4 /* !! */ .get();
                        var6_8 /* !! */  = (View)var6_8 /* !! */ ;
                        if (var6_8 /* !! */  != null && (var6_8 /* !! */  = var6_8 /* !! */ .getViewTreeObserver()) != null) {
                            var7_10 /* !! */  = this.h;
                            var6_8 /* !! */ .addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)var7_10 /* !! */ );
                        }
                        ** GOTO lbl65
                    }
                    catch (Throwable var6_9) {
                        block17: {
                            block16: {
                                td0.a(this, var6_9);
lbl65:
                                // 3 sources

                                var14_18 = -1 << -1;
                                var15_19 = View.MeasureSpec.makeMeasureSpec((int)var15_19, (int)var14_18);
                                var16_20 = View.MeasureSpec.makeMeasureSpec((int)var16_20, (int)var14_18);
                                var4_6 /* !! */ .measure(var15_19, var16_20);
                                var15_19 = var4_6 /* !! */ .getMeasuredWidth();
                                var14_18 = var4_6 /* !! */ .getMeasuredHeight();
                                var1_1 /* !! */  = new PopupWindow(var4_6 /* !! */ , var15_19, var14_18);
                                this.e = var1_1 /* !! */ ;
                                var3_4 /* !! */  = var3_4 /* !! */ .get();
                                var3_4 /* !! */  = (View)var3_4 /* !! */ ;
                                var1_1 /* !! */ .showAsDropDown((View)var3_4 /* !! */ );
                                var2_3 = td0.b(this);
                                if (var2_3) break block15;
                                try {
                                    var3_4 /* !! */  = this.e;
                                    if (var3_4 /* !! */  == null || (var15_19 = (int)var3_4 /* !! */ .isShowing()) == 0) break block15;
                                    var2_3 = (int)var3_4 /* !! */ .isAboveAnchor();
                                    var15_19 = 0;
                                    var5_7 /* !! */  = null;
                                    var14_18 = 4;
                                    if (!var2_3) break block16;
                                    var3_4 /* !! */  = this.d;
                                    if (var3_4 /* !! */  == null) break block15;
                                    var7_10 /* !! */  = var3_4 /* !! */ .a;
                                    var7_10 /* !! */ .setVisibility(var14_18);
                                    var3_4 /* !! */  = var3_4 /* !! */ .b;
                                    var3_4 /* !! */ .setVisibility(0);
                                    break block15;
                                }
                                catch (Throwable var3_5) {
                                    break block17;
                                }
                            }
                            var3_4 /* !! */  = this.d;
                            if (var3_4 /* !! */  == null) break block15;
                            var7_10 /* !! */  = var3_4 /* !! */ .a;
                            var7_10 /* !! */ .setVisibility(0);
                            var3_4 /* !! */  = var3_4 /* !! */ .b;
                            var3_4 /* !! */ .setVisibility(var14_18);
                            break block15;
                        }
                        td0.a(this, var3_5);
                    }
                    break block18;
                }
                var17_21 = this.g;
                var19_22 = 0L;
                var2_3 = var17_21 == var19_22 ? 0 : (var17_21 < var19_22 ? -1 : 1);
                if (var2_3 > 0) {
                    var13_17 = 3;
                    var3_4 /* !! */  = new Gj(this, var13_17);
                    var4_6 /* !! */ .postDelayed((Runnable)var3_4 /* !! */ , var17_21);
                }
                var2_3 = 1;
                var1_1 /* !! */ .setTouchable((boolean)var2_3);
                var1_1 /* !! */  = new do3(this);
                var4_6 /* !! */ .setOnClickListener((View.OnClickListener)var1_1 /* !! */ );
            }
            return;
        }
        td0.a(this, var1_2);
    }

    public final void c() {
        Throwable throwable2;
        block9: {
            block8: {
                WeakReference weakReference;
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return;
                }
                try {
                    weakReference = this.b;
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                weakReference = weakReference.get();
                weakReference = (View)weakReference;
                if (weakReference == null) break block8;
                weakReference = weakReference.getViewTreeObserver();
                if (weakReference == null) break block8;
                co3 co32 = this.h;
                weakReference.removeOnScrollChangedListener(co32);
            }
            return;
        }
        td0.a(this, throwable2);
    }
}

