/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.Spannable
 *  android.text.SpannableString
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ClickableSpan
 *  android.text.style.ScaleXSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TtsSpan$VerbatimBuilder
 *  android.text.style.URLSpan
 *  android.text.style.UnderlineSpan
 *  android.view.View
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$RangeInfo
 */
package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.R$string;
import androidx.compose.ui.platform.c;
import androidx.compose.ui.platform.c$b;
import androidx.compose.ui.platform.c$c;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.i$b;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class c$d
extends D2 {
    public final /* synthetic */ c b;

    public c$d(c c2) {
        this.b = c2;
    }

    public final void a(int n3, C2 c2, String string2, Bundle bundle) {
        this.b.a(n3, c2, string2, bundle);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final C2 b(int var1_1) {
        block194: {
            block190: {
                block212: {
                    block211: {
                        block210: {
                            block209: {
                                block208: {
                                    block207: {
                                        block206: {
                                            block204: {
                                                block195: {
                                                    block196: {
                                                        block199: {
                                                            block200: {
                                                                block198: {
                                                                    block197: {
                                                                        block193: {
                                                                            block192: {
                                                                                var2_2 = var1_1;
                                                                                var3_3 = 2;
                                                                                var4_4 = 4;
                                                                                var5_5 /* !! */  = 1;
                                                                                var6_6 = 1.4E-45f;
                                                                                var7_7 = this;
                                                                                var8_8 = this.b;
                                                                                var9_9 /* !! */  = var8_8.a;
                                                                                var10_10 = var9_9 /* !! */ .getViewTreeOwners();
                                                                                if (var10_10 != null && (var10_10 = var10_10.a) != null && (var10_10 = var10_10.getLifecycle()) != null) {
                                                                                    var10_10 = var10_10.b();
                                                                                } else {
                                                                                    var11_11 = 0;
                                                                                    var12_12 = 0.0f;
                                                                                    var10_10 = null;
                                                                                }
                                                                                var13_13 = i$b.DESTROYED;
                                                                                if (var10_10 == var13_13) lbl-1000:
                                                                                // 2 sources

                                                                                {
                                                                                    while (true) {
                                                                                        var14_14 = var2_2;
                                                                                        var15_16 = false;
                                                                                        var16_18 = null;
                                                                                        break block190;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var10_10 = AccessibilityNodeInfo.obtain();
                                                                                var13_13 = new C2((AccessibilityNodeInfo)var10_10);
                                                                                ** while ((var17_19 = (KY2)var8_8.j().c((int)var2_2)) == null)
lbl26:
                                                                                // 1 sources

                                                                                var18_20 = -1;
                                                                                var19_21 = var17_19.a;
                                                                                if (var2_2 != var18_20) break block192;
                                                                                var20_22 /* !! */  = var9_9 /* !! */ .getParentForAccessibility();
                                                                                var21_23 = var20_22 /* !! */  instanceof View;
                                                                                if (var21_23 != 0) {
                                                                                    var20_22 /* !! */  = (View)var20_22 /* !! */ ;
                                                                                } else {
                                                                                    var22_24 = 0;
                                                                                    var20_22 /* !! */  = null;
                                                                                }
                                                                                var13_13.b = var18_20;
                                                                                var10_10.setParent((View)var20_22 /* !! */ );
                                                                                break block193;
                                                                            }
                                                                            var20_22 /* !! */  = var19_21.j();
                                                                            if (var20_22 /* !! */  != null) {
                                                                                var22_24 = var20_22 /* !! */ .g;
                                                                                var20_22 /* !! */  = Integer.valueOf(var22_24);
                                                                            } else {
                                                                                var22_24 = 0;
                                                                                var20_22 /* !! */  = null;
                                                                            }
                                                                            if (var20_22 /* !! */  == null) break block194;
                                                                            var22_24 = var20_22 /* !! */ .intValue();
                                                                            var23_25 = var9_9 /* !! */ .getSemanticsOwner().a();
                                                                            var21_23 = var23_25.g;
                                                                            if (var22_24 == var21_23) {
                                                                                var22_24 = -1;
                                                                            }
                                                                            var13_13.b = var22_24;
                                                                            var10_10.setParent((View)var9_9 /* !! */ , var22_24);
                                                                        }
                                                                        var13_13.c = var2_2;
                                                                        var10_10.setSource((View)var9_9 /* !! */ , var2_2);
                                                                        var17_19 = var8_8.b((KY2)var17_19);
                                                                        var13_13.k((Rect)var17_19);
                                                                        var13_13.l("android.view.View");
                                                                        var17_19 = var19_21.d;
                                                                        var20_22 /* !! */  = MY2.y;
                                                                        var17_19 = var17_19.a;
                                                                        var14_14 = (int)var17_19.containsKey(var20_22 /* !! */ );
                                                                        if (var14_14 != 0) {
                                                                            var17_19 = "android.widget.EditText";
                                                                            var13_13.l((CharSequence)var17_19);
                                                                        }
                                                                        var17_19 = MY2.v;
                                                                        var20_22 /* !! */  = var19_21.d;
                                                                        var23_25 = var20_22 /* !! */ .a;
                                                                        var14_14 = (int)var23_25.containsKey(var17_19);
                                                                        if (var14_14 != 0) {
                                                                            var17_19 = "android.widget.TextView";
                                                                            var13_13.l((CharSequence)var17_19);
                                                                        }
                                                                        var17_19 = MY2.t;
                                                                        if ((var17_19 = (CP2)AY2.a((zy2_0)var20_22 /* !! */ , (TY2)var17_19)) == null) break block195;
                                                                        var21_23 = (int)var19_21.e;
                                                                        if (var21_23 == 0 && (var21_23 = (int)(var23_25 = GY2.h((GY2)var19_21, (boolean)var5_5 /* !! */ , var4_4)).isEmpty()) == 0) break block196;
                                                                        var21_23 = var17_19.a;
                                                                        var24_26 = CP2.a(var21_23, var4_4);
                                                                        var16_18 = "AccessibilityNodeInfo.roleDescription";
                                                                        if (!var24_26) break block197;
                                                                        var23_25 = var9_9 /* !! */ .getContext().getResources();
                                                                        var25_27 = R$string.tab;
                                                                        var26_28 = var23_25.getString(var25_27);
                                                                        var23_25 = var10_10.getExtras();
                                                                        var23_25.putCharSequence((String)var16_18, (CharSequence)var26_28);
                                                                        break block196;
                                                                    }
                                                                    var25_27 = CP2.a(var21_23, var3_3);
                                                                    if (var25_27 == 0) break block198;
                                                                    var26_28 = var9_9 /* !! */ .getContext().getResources();
                                                                    var21_23 = R$string.switch_role;
                                                                    var26_28 = var26_28.getString(var21_23);
                                                                    var23_25 = var10_10.getExtras();
                                                                    var23_25.putCharSequence((String)var16_18, (CharSequence)var26_28);
                                                                    break block196;
                                                                }
                                                                var26_28 = VY2.g(var21_23);
                                                                var15_17 = (int)CP2.a(var21_23, 5);
                                                                if (var15_17 == 0) break block199;
                                                                var15_17 = (int)var19_21.e;
                                                                if (var15_17 != 0 || (var15_17 = (int)(var16_18 = var19_21.k()).isEmpty()) == 0) break block200;
                                                                var16_18 = var19_21.c;
                                                                var23_25 = hy2_1.c;
                                                                if ((var16_18 = JY2.b((xp1_0)var16_18, (Function1)var23_25)) == null) break block199;
                                                            }
                                                            if ((var15_17 = (int)var20_22 /* !! */ .b) == 0) break block196;
                                                        }
                                                        var13_13.l((CharSequence)var26_28);
                                                    }
                                                    var26_28 = Unit.a;
                                                }
                                                var26_28 = var9_9 /* !! */ .getContext().getPackageName();
                                                var10_10.setPackageName((CharSequence)var26_28);
                                                var25_27 = VY2.d((GY2)var19_21);
                                                var15_17 = Build.VERSION.SDK_INT;
                                                var21_23 = 24;
                                                if (var15_17 >= var21_23) {
                                                    W1.a((AccessibilityNodeInfo)var10_10, (boolean)var25_27);
                                                }
                                                var26_28 = GY2.h((GY2)var19_21, (boolean)var5_5 /* !! */ , var4_4);
                                                var15_17 = var26_28.size();
                                                var21_23 = 0;
                                                var23_25 = null;
                                                while (true) {
                                                    block203: {
                                                        block202: {
                                                            block201: {
                                                                var27_29 = var13_13.a;
                                                                if (var21_23 >= var15_17) break;
                                                                var28_30 = var26_28.get(var21_23);
                                                                var29_31 = var28_30;
                                                                var29_31 = (GY2)var28_30;
                                                                var30_32 = var8_8.j();
                                                                var5_5 /* !! */  = var30_32.a(var18_20 = var29_31.g);
                                                                if (var5_5 /* !! */  == 0) break block201;
                                                                var30_32 = var9_9 /* !! */ .getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                                                                var31_33 = var29_31.c;
                                                                var30_32 = (AndroidViewHolder)var30_32.get(var31_33);
                                                                var3_3 = var29_31.g;
                                                                var18_20 = -1;
                                                                if (var3_3 != var18_20) break block202;
                                                            }
lbl141:
                                                            // 3 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        if (var30_32 == null) break block203;
                                                        var27_29.addChild((View)var30_32);
                                                        ** GOTO lbl141
                                                    }
                                                    var27_29.addChild((View)var9_9 /* !! */ , var3_3);
                                                    ** continue;
                                                    var3_3 = 1;
                                                    var21_23 += var3_3;
                                                    var3_3 = 2;
                                                    var5_5 /* !! */  = 1;
                                                    var6_6 = 1.4E-45f;
                                                    var18_20 = -1;
                                                }
                                                var3_3 = 1;
                                                var25_27 = var8_8.k;
                                                if (var2_2 == var25_27) {
                                                    var13_13.h((boolean)var3_3);
                                                    var29_31 = C2$a.i;
                                                    var13_13.b((C2$a)var29_31);
                                                } else {
                                                    var3_3 = 0;
                                                    var13_13.h(false);
                                                    var29_31 = C2$a.h;
                                                    var13_13.b((C2$a)var29_31);
                                                }
                                                var29_31 = c.m((GY2)var19_21);
                                                if (var29_31 == null) break block204;
                                                var9_9 /* !! */ .getFontFamilyResolver();
                                                var26_28 = var9_9 /* !! */ .getDensity();
                                                var16_18 = var29_31.a;
                                                var30_32 = new Object((CharSequence)var16_18);
                                                var23_25 = var29_31.b;
                                                if (var23_25 != null) {
                                                    var18_20 = var23_25.size();
                                                    var33_35 = 0.0f;
                                                    var7_7 = null;
                                                    for (var32_34 = 0; var32_34 < var18_20; ++var32_34) {
                                                        var34_36 /* !! */  = var23_25.get(var32_34);
                                                        var35_37 = var18_20;
                                                        var31_33 = var34_36 /* !! */ ;
                                                        var31_33 = (Sl$b)var34_36 /* !! */ ;
                                                        var36_38 = var23_25;
                                                        var23_25 = (S93)var31_33.a;
                                                        var37_39 = var23_25.a;
                                                        var38_41 = var9_9 /* !! */ ;
                                                        var39_42 = var10_10;
                                                        var40_43 = var37_39.a();
                                                        var37_39 = var23_25.a;
                                                        var42_44 = var19_21;
                                                        var43_45 = var20_22 /* !! */ ;
                                                        var44_46 = var37_39.a();
                                                        var46_47 = OX.c(var40_43, var44_46);
                                                        var47_48 = 16;
                                                        if (var46_47 == 0) {
                                                            var2_2 = (int)(var40_43 == var47_48 ? 0 : (var40_43 < var47_48 ? -1 : 1));
                                                            var37_39 = var2_2 != 0 ? new gz_1(var40_43) : sl3$a.a;
                                                        }
                                                        var40_43 = var37_39.a();
                                                        var2_2 = var31_33.b;
                                                        var18_20 = var31_33.c;
                                                        Y93.b((Spannable)var30_32, var40_43, var2_2, var18_20);
                                                        var40_43 = var23_25.b;
                                                        var34_36 /* !! */  = var30_32;
                                                        var49_49 = var18_20;
                                                        Y93.c((Spannable)var30_32, var40_43, (Vo0)var26_28, var2_2, var18_20);
                                                        var9_9 /* !! */  = var23_25.c;
                                                        var10_10 = var23_25.d;
                                                        if (var9_9 /* !! */  == null && var10_10 == null) {
                                                            var50_50 /* !! */  = 33;
                                                            var51_51 = 4.6E-44f;
                                                        } else {
                                                            if (var9_9 /* !! */  == null) {
                                                                var9_9 /* !! */  = tv0_0.m;
                                                            }
                                                            if (var10_10 != null) {
                                                                var11_11 = var10_10.a;
                                                            } else {
                                                                var11_11 = 0;
                                                                var12_12 = 0.0f;
                                                                var10_10 = null;
                                                            }
                                                            var50_50 /* !! */  = Fh.a((tv0_0)var9_9 /* !! */ , var11_11);
                                                            var19_21 = new StyleSpan(var50_50 /* !! */ );
                                                            var50_50 /* !! */  = 33;
                                                            var51_51 = 4.6E-44f;
                                                            var30_32.setSpan(var19_21, var2_2, var18_20, var50_50 /* !! */ );
                                                        }
                                                        var10_10 = var23_25.m;
                                                        if (var10_10 != null) {
                                                            var11_11 = var10_10.a;
                                                            var46_47 = 1;
                                                            var22_24 = var11_11 | 1;
                                                            if (var22_24 == var11_11) {
                                                                var19_21 = new UnderlineSpan();
                                                                var30_32.setSpan(var19_21, var2_2, var18_20, var50_50 /* !! */ );
                                                            }
                                                            var46_47 = 2;
                                                            var22_24 = var11_11 | 2;
                                                            if (var22_24 == var11_11) {
                                                                var10_10 = new StrikethroughSpan();
                                                                var30_32.setSpan(var10_10, var2_2, var18_20, var50_50 /* !! */ );
                                                            }
                                                        }
                                                        if ((var10_10 = var23_25.j) != null) {
                                                            var12_12 = var10_10.a;
                                                            var19_21 = new ScaleXSpan(var12_12);
                                                            var30_32.setSpan(var19_21, var2_2, var18_20, var50_50 /* !! */ );
                                                        }
                                                        var9_9 /* !! */  = var23_25.k;
                                                        Y93.d((Spannable)var30_32, (iw1)var9_9 /* !! */ , var2_2, var18_20);
                                                        var40_43 = var23_25.l;
                                                        var46_47 = (int)(var40_43 == var47_48 ? 0 : (var40_43 < var47_48 ? -1 : 1));
                                                        if (var46_47 != 0) {
                                                            var50_50 /* !! */  = zx_0.i(var40_43);
                                                            var19_21 = new BackgroundColorSpan(var50_50 /* !! */ );
                                                            var50_50 /* !! */  = 33;
                                                            var51_51 = 4.6E-44f;
                                                            var30_32.setSpan(var19_21, var2_2, var18_20, var50_50 /* !! */ );
                                                        }
                                                        var2_2 = var1_1;
                                                        var18_20 = var35_37;
                                                        var23_25 = var36_38;
                                                        var9_9 /* !! */  = var38_41;
                                                        var10_10 = var39_42;
                                                        var19_21 = var42_44;
                                                        var20_22 /* !! */  = var43_45;
                                                    }
                                                }
                                                var38_41 = var9_9 /* !! */ ;
                                                var39_42 = var10_10;
                                                var42_44 = var19_21;
                                                var43_45 = var20_22 /* !! */ ;
                                                var2_2 = var16_18.length();
                                                var26_28 = var29_31.d;
                                                if (var26_28 != null) {
                                                    var50_50 /* !! */  = var26_28.size();
                                                    var7_7 = new ArrayList(var50_50 /* !! */ );
                                                    var50_50 /* !! */  = var26_28.size();
                                                    var12_12 = 0.0f;
                                                    var10_10 = null;
                                                    for (var11_11 = 0; var11_11 < var50_50 /* !! */ ; var11_11 += var18_20) {
                                                        var19_21 = var31_33 = var26_28.get(var11_11);
                                                        var19_21 = (Sl$b)var31_33;
                                                        var20_22 /* !! */  = var19_21.a;
                                                        var22_24 = var20_22 /* !! */  instanceof Os3;
                                                        if (var22_24 != 0) {
                                                            var22_24 = var19_21.b;
                                                            var46_47 = var19_21.c;
                                                            var21_23 = 0;
                                                            var23_25 = null;
                                                            if ((var46_47 = (int)Tl.c(0, var2_2, var22_24, var46_47)) != 0) {
                                                                var7_7.add(var31_33);
                                                            }
                                                        }
                                                        var18_20 = 1;
                                                    }
                                                } else {
                                                    var7_7 = mz0_2.a;
                                                }
                                                var37_39 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>";
                                                Intrinsics.checkNotNull(var7_7, (String)var37_39);
                                                var2_2 = var7_7.size();
                                                var51_51 = 0.0f;
                                                var9_9 /* !! */  = null;
                                                for (var50_50 /* !! */  = 0; var50_50 /* !! */  < var2_2; var50_50 /* !! */  += var11_11) {
                                                    var10_10 = (Sl$b)var7_7.get(var50_50 /* !! */ );
                                                    var31_33 = (Os3)var10_10.a;
                                                    var46_47 = var31_33 instanceof fb3_1;
                                                    if (var46_47 != 0) {
                                                        var31_33 = (fb3_1)var31_33;
                                                        var31_33 = var31_33.a;
                                                        var19_21 = new TtsSpan.VerbatimBuilder((String)var31_33);
                                                        var31_33 = var19_21.build();
                                                        var46_47 = var10_10.b;
                                                        var11_11 = var10_10.c;
                                                        var22_24 = 33;
                                                        var30_32.setSpan(var31_33, var46_47, var11_11, var22_24);
                                                        var11_11 = 1;
                                                        var12_12 = 1.4E-45f;
                                                        continue;
                                                    }
                                                    var37_39 = new NoWhenBranchMatchedException();
                                                    throw var37_39;
                                                }
                                                var2_2 = var16_18.length();
                                                if (var26_28 != null) {
                                                    var50_50 /* !! */  = var26_28.size();
                                                    var7_7 = new ArrayList(var50_50 /* !! */ );
                                                    var50_50 /* !! */  = var26_28.size();
                                                    var12_12 = 0.0f;
                                                    var10_10 = null;
                                                    for (var11_11 = 0; var11_11 < var50_50 /* !! */ ; var11_11 += var18_20) {
                                                        var19_21 = var31_33 = var26_28.get(var11_11);
                                                        var19_21 = (Sl$b)var31_33;
                                                        var20_22 /* !! */  = var19_21.a;
                                                        var22_24 = var20_22 /* !! */  instanceof hx3;
                                                        if (var22_24 != 0) {
                                                            var22_24 = var19_21.b;
                                                            var46_47 = var19_21.c;
                                                            var21_23 = 0;
                                                            var23_25 = null;
                                                            if ((var46_47 = (int)Tl.c(0, var2_2, var22_24, var46_47)) != 0) {
                                                                var7_7.add(var31_33);
                                                            }
                                                        }
                                                        var18_20 = 1;
                                                    }
                                                } else {
                                                    var7_7 = mz0_2.a;
                                                }
                                                var37_39 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>";
                                                Intrinsics.checkNotNull(var7_7, (String)var37_39);
                                                var2_2 = var7_7.size();
                                                var25_27 = 0;
                                                var26_28 = null;
                                                while (true) {
                                                    var9_9 /* !! */  = var8_8.D;
                                                    if (var25_27 >= var2_2) break;
                                                    var10_10 = (Sl$b)var7_7.get(var25_27);
                                                    var9_9 /* !! */  = var9_9 /* !! */ .a;
                                                    var31_33 = (hx3)var10_10.a;
                                                    var19_21 = var9_9 /* !! */ .get(var31_33);
                                                    if (var19_21 == null) {
                                                        var20_22 /* !! */  = var31_33.a;
                                                        var19_21 = new URLSpan((String)var20_22 /* !! */ );
                                                        var9_9 /* !! */ .put(var31_33, var19_21);
                                                    }
                                                    var19_21 = (URLSpan)var19_21;
                                                    var50_50 /* !! */  = var10_10.b;
                                                    var11_11 = var10_10.c;
                                                    var18_20 = 33;
                                                    var30_32.setSpan(var19_21, var50_50 /* !! */ , var11_11, var18_20);
                                                    var50_50 /* !! */  = 1;
                                                    var51_51 = 1.4E-45f;
                                                    var25_27 += var50_50 /* !! */ ;
                                                }
                                                var2_2 = var16_18.length();
                                                var37_39 = var29_31.a(var2_2);
                                                var3_3 = var37_39.size();
                                                var26_28 = null;
                                                for (var25_27 = 0; var25_27 < var3_3; var25_27 += var11_11) {
                                                    block205: {
                                                        var7_7 = (Sl$b)var37_39.get(var25_27);
                                                        var11_11 = var7_7.b;
                                                        var15_17 = var7_7.c;
                                                        if (var11_11 == var15_17) break block205;
                                                        var19_21 = var31_33 = var7_7.a;
                                                        var19_21 = (Gu1)var31_33;
                                                        var22_24 = var19_21 instanceof Gu1$b;
                                                        if (var22_24 != 0) {
                                                            var19_21.getClass();
                                                            Intrinsics.checkNotNull(var31_33, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                                            var31_33 = (Gu1$b)var31_33;
                                                            var7_7 = new Sl$b(var11_11, var15_17, var31_33);
                                                            var19_21 = var9_9 /* !! */ .b;
                                                            var20_22 /* !! */  = var19_21.get(var7_7);
                                                            if (var20_22 /* !! */  == null) {
                                                                var31_33 = var31_33.a;
                                                                var20_22 /* !! */  = new URLSpan((String)var31_33);
                                                                var19_21.put(var7_7, var20_22 /* !! */ );
                                                            }
                                                            var20_22 /* !! */  = (URLSpan)var20_22 /* !! */ ;
                                                            var32_34 = 33;
                                                            var33_35 = 4.6E-44f;
                                                            var30_32.setSpan((Object)var20_22 /* !! */ , var11_11, var15_17, var32_34);
lbl393:
                                                            // 3 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var31_33 = var9_9 /* !! */ .c;
                                                        var20_22 /* !! */  = var31_33.get(var7_7);
                                                        if (var20_22 /* !! */  == null) {
                                                            var20_22 /* !! */  = new u20((Gu1)var19_21);
                                                            var31_33.put(var7_7, var20_22 /* !! */ );
                                                        }
                                                        var20_22 /* !! */  = (ClickableSpan)var20_22 /* !! */ ;
                                                        var32_34 = 33;
                                                        var33_35 = 4.6E-44f;
                                                        var30_32.setSpan((Object)var20_22 /* !! */ , var11_11, var15_17, var32_34);
                                                        ** GOTO lbl393
                                                    }
                                                    var32_34 = 33;
                                                    var33_35 = 4.6E-44f;
                                                    ** continue;
                                                    var11_11 = 1;
                                                    var12_12 = 1.4E-45f;
                                                }
                                                var37_39 = (SpannableString)c.G((CharSequence)var30_32);
                                                break block206;
                                            }
                                            var38_41 = var9_9 /* !! */ ;
                                            var39_42 = var10_10;
                                            var42_44 = var19_21;
                                            var43_45 = var20_22 /* !! */ ;
                                            var2_2 = 0;
                                            var37_39 = null;
                                        }
                                        var13_13.s((CharSequence)var37_39);
                                        var37_39 = MY2.E;
                                        var29_31 = var43_45;
                                        var26_28 = var43_45.a;
                                        var5_5 /* !! */  = var26_28.containsKey(var37_39);
                                        if (var5_5 /* !! */  != 0) {
                                            var30_32 = var39_42;
                                            var32_34 = 1;
                                            var33_35 = 1.4E-45f;
                                            var39_42.setContentInvalid((boolean)var32_34);
                                            var37_39 = (CharSequence)AY2.a((zy2_0)var43_45, (TY2)var37_39);
                                            var27_29.setError((CharSequence)var37_39);
lbl435:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var30_32 = var39_42;
                                        ** while (true)
                                        var37_39 = var42_44;
                                        var7_7 = var8_8.l((GY2)var42_44);
                                        var50_50 /* !! */  = Build.VERSION.SDK_INT;
                                        var11_11 = 30;
                                        var12_12 = 4.2E-44f;
                                        if (var50_50 /* !! */  >= var11_11) {
                                            C2$b.b(var27_29, var7_7);
                                        } else {
                                            var9_9 /* !! */  = var27_29.getExtras();
                                            var10_10 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
                                            var9_9 /* !! */ .putCharSequence((String)var10_10, (CharSequence)var7_7);
                                        }
                                        var32_34 = (int)c.k((GY2)var37_39);
                                        var27_29.setCheckable((boolean)var32_34);
                                        var7_7 = MY2.C;
                                        var7_7 = (ao3)AY2.a(var29_31, (TY2)var7_7);
                                        if (var7_7 != null) {
                                            var9_9 /* !! */  = ao3.On;
                                            if (var7_7 == var9_9 /* !! */ ) {
                                                var50_50 /* !! */  = 1;
                                                var51_51 = 1.4E-45f;
                                                var27_29.setChecked((boolean)var50_50 /* !! */ );
                                            } else {
                                                var9_9 /* !! */  = ao3.Off;
                                                if (var7_7 == var9_9 /* !! */ ) {
                                                    var32_34 = 0;
                                                    var33_35 = 0.0f;
                                                    var7_7 = null;
                                                    var27_29.setChecked(false);
                                                }
                                            }
                                            var7_7 = Unit.a;
                                        }
                                        var7_7 = MY2.B;
                                        if ((var7_7 = (Boolean)AY2.a(var29_31, (TY2)var7_7)) != null) {
                                            var32_34 = (int)var7_7.booleanValue();
                                            if (var17_19 == null) {
                                                var50_50 /* !! */  = 0;
                                                var51_51 = 0.0f;
                                                var9_9 /* !! */  = null;
                                            } else {
                                                var50_50 /* !! */  = var17_19.a;
                                                var11_11 = 4;
                                                var12_12 = 5.6E-45f;
                                                var50_50 /* !! */  = (int)CP2.a(var50_50 /* !! */ , var11_11);
                                            }
                                            if (var50_50 /* !! */  != 0) {
                                                var27_29.setSelected((boolean)var32_34);
                                            } else {
                                                var27_29.setChecked((boolean)var32_34);
                                            }
                                            var7_7 = Unit.a;
                                        }
                                        if ((var32_34 = (int)var29_31.b) == 0) break block207;
                                        var33_35 = 1.4E-45f;
                                        var50_50 /* !! */  = 4;
                                        var51_51 = 5.6E-45f;
                                        var10_10 = GY2.h((GY2)var37_39, true, var50_50 /* !! */ );
                                        var32_34 = var10_10.isEmpty();
                                        if (var32_34 == 0) break block208;
                                    }
                                    var7_7 = MY2.b;
                                    if ((var7_7 = (List)AY2.a((zy2_0)var29_31, (TY2)var7_7)) != null) {
                                        var7_7 = (String)CollectionsKt.firstOrNull((List)var7_7);
                                    } else {
                                        var32_34 = 0;
                                        var33_35 = 0.0f;
                                        var7_7 = null;
                                    }
                                    var13_13.o((CharSequence)var7_7);
                                }
                                var7_7 = MY2.u;
                                if ((var7_7 = (String)AY2.a((zy2_0)var29_31, (TY2)var7_7)) != null) {
                                    block191: {
                                        for (var9_9 /* !! */  = var37_39; var9_9 /* !! */  != null; var9_9 /* !! */  = var9_9 /* !! */ .j()) {
                                            var10_10 = NY2.a;
                                            var16_18 = var9_9 /* !! */ .d;
                                            var31_33 = var16_18.a;
                                            var18_20 = (int)var31_33.containsKey(var10_10);
                                            if (var18_20 == 0) continue;
                                            var9_9 /* !! */  = (Boolean)var16_18.c((TY2)var10_10);
                                            var50_50 /* !! */  = (int)var9_9 /* !! */ .booleanValue();
                                            break block191;
                                        }
                                        var50_50 /* !! */  = 0;
                                        var51_51 = 0.0f;
                                        var9_9 /* !! */  = null;
                                    }
                                    if (var50_50 /* !! */  != 0) {
                                        var30_32.setViewIdResourceName((String)var7_7);
                                    }
                                }
                                var7_7 = MY2.a;
                                var7_7 = MY2.i;
                                if ((var7_7 = (Unit)AY2.a((zy2_0)var29_31, (TY2)var7_7)) != null) {
                                    var32_34 = 1;
                                    var33_35 = 1.4E-45f;
                                    var13_13.p((boolean)var32_34);
                                    var7_7 = Unit.a;
                                }
                                var7_7 = MY2.D;
                                var32_34 = (int)var26_28.containsKey(var7_7);
                                var30_32.setPassword((boolean)var32_34);
                                var7_7 = MY2.G;
                                var32_34 = var26_28.containsKey(var7_7);
                                var30_32.setEditable((boolean)var32_34);
                                var7_7 = MY2.H;
                                var7_7 = (Integer)AY2.a((zy2_0)var29_31, (TY2)var7_7);
                                if (var7_7 != null) {
                                    var32_34 = var7_7.intValue();
                                } else {
                                    var32_34 = -1;
                                    var33_35 = 0.0f / 0.0f;
                                }
                                var27_29.setMaxTextLength(var32_34);
                                var32_34 = (int)kg.a((GY2)var37_39);
                                var27_29.setEnabled((boolean)var32_34);
                                var7_7 = MY2.l;
                                var25_27 = (int)var26_28.containsKey(var7_7);
                                var27_29.setFocusable((boolean)var25_27);
                                var25_27 = var30_32.isFocusable();
                                if (var25_27 != 0) {
                                    var26_28 = (Boolean)var29_31.c((TY2)var7_7);
                                    var25_27 = var26_28.booleanValue();
                                    var27_29.setFocused((boolean)var25_27);
                                    var25_27 = var30_32.isFocused();
                                    if (var25_27 != 0) {
                                        var25_27 = 2;
                                        var13_13.a(var25_27);
                                    } else {
                                        var25_27 = 1;
                                        var13_13.a(var25_27);
                                    }
                                }
                                var25_27 = VY2.e((GY2)var37_39);
                                var27_29.setVisibleToUser((boolean)var25_27);
                                var26_28 = MY2.k;
                                var26_28 = (Hv1)AY2.a((zy2_0)var29_31, (TY2)var26_28);
                                if (var26_28 != null) {
                                    var25_27 = 1;
                                    var30_32.setLiveRegion(var25_27);
                                    var26_28 = Unit.a;
                                }
                                var25_27 = 0;
                                var27_29.setClickable(false);
                                var26_28 = yY2.b;
                                var26_28 = (H1)AY2.a((zy2_0)var29_31, (TY2)var26_28);
                                if (var26_28 == null) break block209;
                                var7_7 = MY2.B;
                                var7_7 = AY2.a((zy2_0)var29_31, (TY2)var7_7);
                                var9_9 /* !! */  = Boolean.TRUE;
                                var32_34 = (int)Intrinsics.areEqual(var7_7, var9_9 /* !! */ );
                                if (var17_19 == null) {
                                    var50_50 /* !! */  = 0;
                                    var51_51 = 0.0f;
                                    var9_9 /* !! */  = null;
                                } else {
                                    var50_50 /* !! */  = var17_19.a;
                                    var11_11 = 4;
                                    var12_12 = 5.6E-45f;
                                    var50_50 /* !! */  = (int)CP2.a(var50_50 /* !! */ , var11_11);
                                }
                                if (var50_50 /* !! */  != 0) ** GOTO lbl-1000
                                if (var17_19 == null) {
                                    var50_50 /* !! */  = 0;
                                    var51_51 = 0.0f;
                                    var9_9 /* !! */  = null;
                                } else {
                                    var50_50 /* !! */  = var17_19.a;
                                    var11_11 = 3;
                                    var12_12 = 4.2E-45f;
                                    var50_50 /* !! */  = (int)CP2.a(var50_50 /* !! */ , var11_11);
                                }
                                if (var50_50 /* !! */  == 0) {
                                    var50_50 /* !! */  = 0;
                                    var51_51 = 0.0f;
                                    var9_9 /* !! */  = null;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var50_50 /* !! */  = 1;
                                    var51_51 = 1.4E-45f;
                                }
                                if (var50_50 /* !! */  != 0 && (var50_50 /* !! */  == 0 || var32_34 != 0)) {
                                    var32_34 = 0;
                                    var33_35 = 0.0f;
                                    var7_7 = null;
                                } else {
                                    var32_34 = 1;
                                    var33_35 = 1.4E-45f;
                                }
                                var27_29.setClickable((boolean)var32_34);
                                var32_34 = (int)kg.a((GY2)var37_39);
                                if (var32_34 != 0 && (var32_34 = (int)var30_32.isClickable()) != 0) {
                                    var50_50 /* !! */  = 16;
                                    var51_51 = 2.2E-44f;
                                    var26_28 = var26_28.a;
                                    var7_7 = new C2$a(var50_50 /* !! */ , (CharSequence)var26_28);
                                    var13_13.b((C2$a)var7_7);
                                }
                                var26_28 = Unit.a;
                            }
                            var25_27 = 0;
                            var27_29.setLongClickable(false);
                            var26_28 = yY2.c;
                            var26_28 = (H1)AY2.a((zy2_0)var29_31, (TY2)var26_28);
                            if (var26_28 != null) {
                                var33_35 = 1.4E-45f;
                                var27_29.setLongClickable(true);
                                var32_34 = (int)kg.a((GY2)var37_39);
                                if (var32_34 != 0) {
                                    var50_50 /* !! */  = 32;
                                    var51_51 = 4.5E-44f;
                                    var26_28 = var26_28.a;
                                    var7_7 = new C2$a(var50_50 /* !! */ , (CharSequence)var26_28);
                                    var13_13.b((C2$a)var7_7);
                                }
                                var26_28 = Unit.a;
                            }
                            var26_28 = yY2.o;
                            if ((var26_28 = (H1)AY2.a((zy2_0)var29_31, (TY2)var26_28)) != null) {
                                var50_50 /* !! */  = 16384;
                                var51_51 = 2.2959E-41f;
                                var26_28 = var26_28.a;
                                var7_7 = new C2$a(var50_50 /* !! */ , (CharSequence)var26_28);
                                var13_13.b((C2$a)var7_7);
                                var26_28 = Unit.a;
                            }
                            if ((var25_27 = (int)kg.a((GY2)var37_39)) != 0) {
                                var26_28 = yY2.i;
                                if ((var26_28 = (H1)AY2.a((zy2_0)var29_31, (TY2)var26_28)) != null) {
                                    var50_50 /* !! */  = 0x200000;
                                    var51_51 = 2.938736E-39f;
                                    var26_28 = var26_28.a;
                                    var7_7 = new C2$a(var50_50 /* !! */ , (CharSequence)var26_28);
                                    var13_13.b((C2$a)var7_7);
                                    var26_28 = Unit.a;
                                }
                                var26_28 = yY2.n;
                                if ((var26_28 = (H1)AY2.a((zy2_0)var29_31, (TY2)var26_28)) != null) {
                                    var50_50 /* !! */  = 16908372;
                                    var51_51 = 2.3877464E-38f;
                                    var26_28 = var26_28.a;
                                    var7_7 = new C2$a(var50_50 /* !! */ , (CharSequence)var26_28);
                                    var13_13.b((C2$a)var7_7);
                                    var26_28 = Unit.a;
                                }
                                var26_28 = yY2.p;
                                if ((var26_28 = (H1)AY2.a((zy2_0)var29_31, (TY2)var26_28)) != null) {
                                    var50_50 /* !! */  = 65536;
                                    var51_51 = 9.1835E-41f;
                                    var26_28 = var26_28.a;
                                    var7_7 = new C2$a(var50_50 /* !! */ , (CharSequence)var26_28);
                                    var13_13.b((C2$a)var7_7);
                                    var26_28 = Unit.a;
                                }
                                var26_28 = yY2.q;
                                if ((var26_28 = (H1)AY2.a((zy2_0)var29_31, (TY2)var26_28)) != null) {
                                    var5_5 /* !! */  = (int)var30_32.isFocused();
                                    if (var5_5 /* !! */  != 0 && (var5_5 /* !! */  = (int)(var30_32 = var38_41.getClipboardManager()).c()) != 0) {
                                        var32_34 = 32768;
                                        var33_35 = 4.5918E-41f;
                                        var26_28 = var26_28.a;
                                        var30_32 = new Object(var32_34, (CharSequence)var26_28);
                                        var13_13.b((C2$a)var30_32);
                                    }
                                    var26_28 = Unit.a;
                                }
                            }
                            if ((var26_28 = c.n((GY2)var37_39)) != null && (var25_27 = var26_28.length()) != 0) {
                                var25_27 = 0;
                                var26_28 = null;
                            } else {
                                var25_27 = 1;
                            }
                            if (var25_27 != 0) break block210;
                            var25_27 = var8_8.i((GY2)var37_39);
                            var5_5 /* !! */  = var8_8.h((GY2)var37_39);
                            var13_13.t(var25_27, var5_5 /* !! */ );
                            var26_28 = yY2.h;
                            var26_28 = (H1)AY2.a((zy2_0)var29_31, (TY2)var26_28);
                            if (var26_28 != null) {
                                var26_28 = var26_28.a;
                            } else {
                                var25_27 = 0;
                                var26_28 = null;
                            }
                            var32_34 = 131072;
                            var33_35 = 1.83671E-40f;
                            var30_32 = new Object(var32_34, (CharSequence)var26_28);
                            var13_13.b((C2$a)var30_32);
                            var13_13.a(256);
                            var13_13.a(512);
                            var25_27 = 11;
                            var27_29.setMovementGranularities(var25_27);
                            var26_28 = MY2.b;
                            var26_28 = (List)AY2.a((zy2_0)var29_31, (TY2)var26_28);
                            if (var26_28 != null && (var25_27 = (int)var26_28.isEmpty()) == 0) {
                                var25_27 = 0;
                                var26_28 = null;
                            } else {
                                var25_27 = 1;
                            }
                            if (var25_27 == 0 || (var25_27 = (int)(var30_32 = var29_31.a).containsKey(var26_28 = yY2.a)) == 0) break block210;
                            var26_28 = var37_39.d;
                            var26_28 = var26_28.a;
                            var30_32 = MY2.y;
                            var25_27 = (int)var26_28.containsKey(var30_32);
                            if (var25_27 == 0) ** GOTO lbl-1000
                            var26_28 = MY2.l;
                            var25_27 = (int)Intrinsics.areEqual(var26_28 = AY2.a(var37_39.d, (TY2)var26_28), var30_32 = Boolean.TRUE);
                            if (var25_27 == 0) {
                                while (true) {
                                    var25_27 = 1;
                                    break;
                                }
                            } else lbl-1000:
                            // 2 sources

                            {
                                var26_28 = jg_0.c;
                                var30_32 = var37_39.c;
                                if ((var26_28 = kg.c((xp1_0)var30_32, (Function1)var26_28)) != null) {
                                    if ((var26_28 = var26_28.w()) != null) {
                                        var30_32 = MY2.l;
                                        var26_28 = AY2.a((zy2_0)var26_28, (TY2)var30_32);
                                        var30_32 = Boolean.TRUE;
                                        var25_27 = (int)Intrinsics.areEqual(var26_28, var30_32);
                                    } else {
                                        var25_27 = 0;
                                        var26_28 = null;
                                    }
                                    if (var25_27 == 0) ** continue;
                                }
                                var25_27 = 0;
                                var26_28 = null;
                            }
                            if (var25_27 == 0) {
                                var25_27 = var27_29.getMovementGranularities() | 20;
                                var27_29.setMovementGranularities(var25_27);
                            }
                        }
                        var25_27 = Build.VERSION.SDK_INT;
                        var5_5 /* !! */  = 26;
                        var6_6 = 3.6E-44f;
                        if (var25_27 >= var5_5 /* !! */ ) {
                            var30_32 = new Object();
                            var30_32.add("androidx.compose.ui.semantics.id");
                            var7_7 = var13_13.g();
                            if (var7_7 != null && (var32_34 = var7_7.length()) != 0) {
                                var32_34 = 0;
                                var33_35 = 0.0f;
                                var7_7 = null;
                            } else {
                                var32_34 = 1;
                                var33_35 = 1.4E-45f;
                            }
                            if (var32_34 == 0 && (var32_34 = (int)(var9_9 /* !! */  = var29_31.a).containsKey(var7_7 = yY2.a)) != 0) {
                                var7_7 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
                                var30_32.add(var7_7);
                            }
                            if ((var32_34 = (int)(var9_9 /* !! */  = var29_31.a).containsKey(var7_7 = MY2.u)) != 0) {
                                var7_7 = "androidx.compose.ui.semantics.testTag";
                                var30_32.add(var7_7);
                            }
                            var13_13.i((ArrayList)var30_32);
                        }
                        var30_32 = MY2.d;
                        if ((var30_32 = (nB2)AY2.a((zy2_0)var29_31, var30_32)) != null) {
                            var9_9 /* !! */  = var29_31.a;
                            var7_7 = yY2.g;
                            var50_50 /* !! */  = (int)var9_9 /* !! */ .containsKey(var7_7);
                            if (var50_50 /* !! */  != 0) {
                                var9_9 /* !! */  = "android.widget.SeekBar";
                                var13_13.l((CharSequence)var9_9 /* !! */ );
                            } else {
                                var9_9 /* !! */  = "android.widget.ProgressBar";
                                var13_13.l((CharSequence)var9_9 /* !! */ );
                            }
                            var9_9 /* !! */  = nB2.d;
                            var12_12 = var30_32.a;
                            var16_18 = var30_32.b;
                            if (var30_32 != var9_9 /* !! */ ) {
                                var6_6 = ((Number)var16_18.getStart()).floatValue();
                                var9_9 /* !! */  = (Number)var16_18.c();
                                var51_51 = var9_9 /* !! */ .floatValue();
                                var14_14 = 1;
                                var30_32 = AccessibilityNodeInfo.RangeInfo.obtain((int)var14_14, (float)var6_6, (float)var51_51, (float)var12_12);
                                var27_29.setRangeInfo((AccessibilityNodeInfo.RangeInfo)var30_32);
                            }
                            if ((var5_5 /* !! */  = (int)(var30_32 = var29_31.a).containsKey(var7_7)) != 0 && (var5_5 /* !! */  = (int)kg.a((GY2)var37_39)) != 0) {
                                var30_32 = (Number)var16_18.c();
                                var6_6 = var30_32.floatValue();
                                var7_7 = (Number)var16_18.getStart();
                                var33_35 = var7_7.floatValue();
                                cfr_temp_0 = var12_12 - (var6_6 = f.a(var6_6, var33_35));
                                var5_5 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                                if (var5_5 /* !! */  < 0) {
                                    var30_32 = C2$a.j;
                                    var13_13.b((C2$a)var30_32);
                                }
                                var30_32 = (Number)var16_18.getStart();
                                var6_6 = var30_32.floatValue();
                                var7_7 = (Number)var16_18.c();
                                var33_35 = var7_7.floatValue();
                                cfr_temp_1 = var12_12 - (var6_6 = f.c(var6_6, var33_35));
                                var5_5 /* !! */  = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                if (var5_5 /* !! */  > 0) {
                                    var30_32 = C2$a.k;
                                    var13_13.b((C2$a)var30_32);
                                }
                            }
                        }
                        var5_5 /* !! */  = 24;
                        var6_6 = 3.4E-44f;
                        if (var25_27 >= var5_5 /* !! */ ) {
                            c$b.a((C2)var13_13, (GY2)var37_39);
                        }
                        var30_32 = var37_39.i();
                        var7_7 = MY2.g;
                        if ((var30_32 = (qX)AY2.a((zy2_0)var30_32, (TY2)var7_7)) != null) {
                            var32_34 = var30_32.b;
                            var5_5 /* !! */  = var30_32.a;
                            var50_50 /* !! */  = 0;
                            var51_51 = 0.0f;
                            var9_9 /* !! */  = null;
                            var30_32 = C2$e.a(var5_5 /* !! */ , var32_34, 0, false);
                            var13_13.m((C2$e)var30_32);
                        } else {
                            var30_32 = new Object();
                            var7_7 = var37_39.i();
                            var9_9 /* !! */  = MY2.f;
                            if ((var7_7 = AY2.a((zy2_0)var7_7, (TY2)var9_9 /* !! */ )) != null) {
                                var33_35 = 1.4E-45f;
                                var10_10 = GY2.h((GY2)var37_39, true, 4);
                                var32_34 = var10_10.size();
                                var51_51 = 0.0f;
                                var9_9 /* !! */  = null;
                                for (var50_50 /* !! */  = 0; var50_50 /* !! */  < var32_34; var50_50 /* !! */  += var15_17) {
                                    var16_18 = (GY2)var10_10.get(var50_50 /* !! */ );
                                    var17_19 = var16_18.i();
                                    var17_19 = var17_19.a;
                                    var31_33 = MY2.B;
                                    var14_14 = (int)var17_19.containsKey(var31_33);
                                    if (var14_14 != 0) {
                                        var30_32.add(var16_18);
                                    }
                                    var15_17 = 1;
                                }
                            }
                            var15_17 = 1;
                            var32_34 = var30_32.isEmpty() ^ var15_17;
                            if (var32_34 != 0) {
                                var32_34 = (int)rX.a((ArrayList)var30_32);
                                if (var32_34 != 0) {
                                    var50_50 /* !! */  = 1;
                                    var51_51 = 1.4E-45f;
                                } else {
                                    var50_50 /* !! */  = var30_32.size();
                                }
                                if (var32_34 != 0) {
                                    var5_5 /* !! */  = var30_32.size();
lbl846:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var5_5 /* !! */  = 1;
                                var6_6 = 1.4E-45f;
                                ** continue;
                                var32_34 = 0;
                                var33_35 = 0.0f;
                                var7_7 = null;
                                var30_32 = C2$e.a(var50_50 /* !! */ , var5_5 /* !! */ , 0, false);
                                var13_13.m((C2$e)var30_32);
                            }
                        }
                        var30_32 = var37_39.i();
                        var7_7 = MY2.h;
                        var30_32 = (tx_0)AY2.a((zy2_0)var30_32, (TY2)var7_7);
                        if (var30_32 != null) {
                            var30_32 = var37_39.i();
                            var7_7 = MY2.B;
                            var9_9 /* !! */  = sx_1.c;
                            var49_49 = (int)((Boolean)var30_32.d((TY2)var7_7, (Function0)var9_9 /* !! */ )).booleanValue();
                            var52_52 = 0;
                            var53_53 = 0;
                            var54_54 = 0;
                            var34_36 /* !! */  = null;
                            var55_55 = 0;
                            var30_32 = C2$f.a(0, 0, 0, 0, false, (boolean)var49_49);
                            var13_13.n((C2$f)var30_32);
                        }
                        if ((var30_32 = var37_39.j()) != null) {
                            var7_7 = var30_32.i();
                            var9_9 /* !! */  = MY2.f;
                            if ((var7_7 = AY2.a((zy2_0)var7_7, (TY2)var9_9 /* !! */ )) != null) {
                                var7_7 = var30_32.i();
                                var9_9 /* !! */  = MY2.g;
                                if ((var7_7 = (qX)AY2.a((zy2_0)var7_7, (TY2)var9_9 /* !! */ )) == null || (var50_50 /* !! */  = var7_7.a) >= 0 && (var32_34 = var7_7.b) >= 0) {
                                    var7_7 = var37_39.i();
                                    var7_7 = var7_7.a;
                                    var9_9 /* !! */  = MY2.B;
                                    var32_34 = (int)var7_7.containsKey(var9_9 /* !! */ );
                                    if (var32_34 != 0) {
                                        var7_7 = new ArrayList();
                                        var51_51 = 1.4E-45f;
                                        var30_32 = GY2.h((GY2)var30_32, true, 4);
                                        var50_50 /* !! */  = var30_32.size();
                                        var12_12 = 0.0f;
                                        var10_10 = null;
                                        var15_17 = 0;
                                        var16_18 = null;
                                        for (var11_11 = 0; var11_11 < var50_50 /* !! */ ; var11_11 += var14_14) {
                                            var17_19 = (GY2)var30_32.get(var11_11);
                                            var31_33 = var17_19.i();
                                            var31_33 = var31_33.a;
                                            var19_21 = MY2.B;
                                            var18_20 = var31_33.containsKey(var19_21);
                                            if (var18_20 != 0) {
                                                var7_7.add(var17_19);
                                                var17_19 = var17_19.c;
                                                var14_14 = var17_19.B();
                                                var31_33 = var37_39.c;
                                                var18_20 = var31_33.B();
                                                if (var14_14 < var18_20) {
                                                    var14_14 = 1;
                                                    var15_17 += var14_14;
                                                    continue;
                                                }
                                            }
                                            var14_14 = 1;
                                        }
                                        var14_14 = 1;
                                        var5_5 /* !! */  = var7_7.isEmpty() ^ var14_14;
                                        if (var5_5 /* !! */  != 0) {
                                            var5_5 /* !! */  = (int)rX.a((ArrayList)var7_7);
                                            if (var5_5 /* !! */  != 0) {
                                                var54_54 = 0;
                                                var34_36 /* !! */  = null;
                                            } else {
                                                var54_54 = var15_17;
                                            }
                                            var53_53 = var5_5 /* !! */  != 0 ? var15_17 : 0;
                                            var30_32 = var37_39.i();
                                            var7_7 = MY2.B;
                                            var9_9 /* !! */  = rX$a.c;
                                            var49_49 = (int)((Boolean)var30_32.d((TY2)var7_7, (Function0)var9_9 /* !! */ )).booleanValue();
                                            var55_55 = 1;
                                            var52_52 = 1;
                                            var30_32 = C2$f.a(var54_54, var52_52, var53_53, var55_55, false, (boolean)var49_49);
                                            var13_13.n((C2$f)var30_32);
                                        }
                                    }
                                }
                            }
                        }
                        var30_32 = MY2.p;
                        var30_32 = (CT2)AY2.a((zy2_0)var29_31, (TY2)var30_32);
                        var7_7 = yY2.d;
                        var7_7 = (H1)AY2.a((zy2_0)var29_31, (TY2)var7_7);
                        var50_50 /* !! */  = 0;
                        var51_51 = 0.0f;
                        var9_9 /* !! */  = null;
                        if (var30_32 == null || var7_7 == null) break block211;
                        var10_10 = var37_39.i();
                        var16_18 = MY2.g;
                        if ((var10_10 = AY2.a((zy2_0)var10_10, (TY2)var16_18)) != null) ** GOTO lbl-1000
                        var10_10 = var37_39.i();
                        var16_18 = MY2.f;
                        if ((var10_10 = AY2.a((zy2_0)var10_10, (TY2)var16_18)) == null) {
                            var11_11 = 0;
                            var12_12 = 0.0f;
                            var10_10 = null;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var11_11 = 1;
                            var12_12 = 1.4E-45f;
                        }
                        if (var11_11 == 0) {
                            var10_10 = "android.widget.HorizontalScrollView";
                            var13_13.l((CharSequence)var10_10);
                        }
                        if ((var11_11 = (int)((cfr_temp_2 = (var12_12 = (var10_10 = (Number)var30_32.b.invoke()).floatValue()) - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) > 0) {
                            var11_11 = 1;
                            var12_12 = 1.4E-45f;
                            var13_13.r((boolean)var11_11);
                        }
                        if ((var11_11 = (int)kg.a((GY2)var37_39)) != 0) {
                            var11_11 = c.t((CT2)var30_32);
                            if (var11_11 != 0) {
                                var10_10 = C2$a.j;
                                var13_13.b((C2$a)var10_10);
                                var11_11 = (int)kg.b((GY2)var37_39);
                                var10_10 = var11_11 == 0 ? C2$a.s : C2$a.q;
                                var13_13.b((C2$a)var10_10);
                            }
                            if ((var5_5 /* !! */  = (int)c.s((CT2)var30_32)) != 0) {
                                var30_32 = C2$a.k;
                                var13_13.b((C2$a)var30_32);
                                var5_5 /* !! */  = kg.b((GY2)var37_39);
                                var30_32 = var5_5 /* !! */  == 0 ? C2$a.q : C2$a.s;
                                var13_13.b((C2$a)var30_32);
                            }
                        }
                    }
                    var30_32 = MY2.q;
                    if ((var30_32 = (CT2)AY2.a((zy2_0)var29_31, (TY2)var30_32)) == null || var7_7 == null) break block212;
                    var7_7 = var37_39.i();
                    var10_10 = MY2.g;
                    if ((var7_7 = AY2.a((zy2_0)var7_7, (TY2)var10_10)) != null) ** GOTO lbl-1000
                    var7_7 = var37_39.i();
                    var10_10 = MY2.f;
                    if ((var7_7 = AY2.a((zy2_0)var7_7, (TY2)var10_10)) == null) {
                        var32_34 = 0;
                        var33_35 = 0.0f;
                        var7_7 = null;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var32_34 = 1;
                        var33_35 = 1.4E-45f;
                    }
                    if (var32_34 == 0) {
                        var7_7 = "android.widget.ScrollView";
                        var13_13.l((CharSequence)var7_7);
                    }
                    if ((var32_34 = (int)((cfr_temp_3 = (var33_35 = (var7_7 = (Number)var30_32.b.invoke()).floatValue()) - 0.0f) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) > 0) {
                        var32_34 = 1;
                        var33_35 = 1.4E-45f;
                        var13_13.r((boolean)var32_34);
                    }
                    if ((var32_34 = (int)kg.a((GY2)var37_39)) != 0) {
                        var32_34 = (int)c.t((CT2)var30_32);
                        if (var32_34 != 0) {
                            var7_7 = C2$a.j;
                            var13_13.b((C2$a)var7_7);
                            var7_7 = C2$a.r;
                            var13_13.b((C2$a)var7_7);
                        }
                        if ((var5_5 /* !! */  = (int)c.s((CT2)var30_32)) != 0) {
                            var30_32 = C2$a.k;
                            var13_13.b((C2$a)var30_32);
                            var30_32 = C2$a.p;
                            var13_13.b((C2$a)var30_32);
                        }
                    }
                }
                var5_5 /* !! */  = 29;
                var6_6 = 4.1E-44f;
                if (var25_27 >= var5_5 /* !! */ ) {
                    c$c.a((C2)var13_13, (GY2)var37_39);
                }
                var30_32 = MY2.e;
                var30_32 = (CharSequence)AY2.a((zy2_0)var29_31, (TY2)var30_32);
                var32_34 = 28;
                var33_35 = 3.9E-44f;
                if (var25_27 >= var32_34) {
                    a2_0.a(var27_29, (CharSequence)var30_32);
                } else {
                    var26_28 = var27_29.getExtras();
                    var9_9 /* !! */  = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
                    var26_28.putCharSequence((String)var9_9 /* !! */ , (CharSequence)var30_32);
                }
                var25_27 = (int)kg.a((GY2)var37_39);
                if (var25_27 == 0) ** GOTO lbl1145
                var26_28 = yY2.r;
                if ((var26_28 = (H1)AY2.a((zy2_0)var29_31, (TY2)var26_28)) != null) {
                    var50_50 /* !! */  = 262144;
                    var51_51 = 3.67342E-40f;
                    var26_28 = var26_28.a;
                    var30_32 = new Object(var50_50 /* !! */ , (CharSequence)var26_28);
                    var13_13.b((C2$a)var30_32);
                    var26_28 = Unit.a;
                }
                var26_28 = yY2.s;
                if ((var26_28 = (H1)AY2.a((zy2_0)var29_31, (TY2)var26_28)) != null) {
                    var50_50 /* !! */  = 524288;
                    var51_51 = 7.34684E-40f;
                    var26_28 = var26_28.a;
                    var30_32 = new Object(var50_50 /* !! */ , (CharSequence)var26_28);
                    var13_13.b((C2$a)var30_32);
                    var26_28 = Unit.a;
                }
                var26_28 = yY2.t;
                if ((var26_28 = (H1)AY2.a((zy2_0)var29_31, (TY2)var26_28)) != null) {
                    var50_50 /* !! */  = 0x100000;
                    var51_51 = 1.469368E-39f;
                    var26_28 = var26_28.a;
                    var30_32 = new Object(var50_50 /* !! */ , (CharSequence)var26_28);
                    var13_13.b((C2$a)var30_32);
                    var26_28 = Unit.a;
                }
                if ((var5_5 /* !! */  = (int)(var30_32 = var29_31.a).containsKey(var26_28 = yY2.v)) == 0) ** GOTO lbl1145
                var29_31 = (List)var29_31.c((TY2)var26_28);
                var25_27 = var29_31.size();
                var30_32 = c.K;
                var50_50 /* !! */  = var30_32.b;
                if (var25_27 < var50_50 /* !! */ ) {
                    var50_50 /* !! */  = 0;
                    var51_51 = 0.0f;
                    var9_9 /* !! */  = null;
                    var26_28 = new ca3(0);
                    var10_10 = j62.a;
                    var15_17 = 0;
                    var10_10 = new gr1_1(null);
                    var16_18 = var8_8.q;
                    var14_14 = var1_1;
                    var18_20 = (int)var16_18.e(var1_1);
                    if (var18_20 != 0) {
                        var31_33 = (gr1_1)var16_18.f(var1_1);
                        var19_21 = new sr1_0();
                        var20_22 /* !! */  = (ViewParent)var30_32.a;
                        var5_5 /* !! */  = var30_32.b;
                        var23_25 = null;
                        for (var21_23 = 0; var21_23 < var5_5 /* !! */ ; ++var21_23) {
                            var50_50 /* !! */  = (int)var20_22 /* !! */ [var21_23];
                            var19_21.b(var50_50 /* !! */ );
                            var50_50 /* !! */  = 0;
                            var51_51 = 0.0f;
                            var9_9 /* !! */  = null;
                        }
                        var30_32 = new Object();
                        var50_50 /* !! */  = var29_31.size();
                        var20_22 /* !! */  = null;
                        for (var22_24 = 0; var22_24 < var50_50 /* !! */ ; var22_24 += var32_34) {
                            var23_25 = (Af0)var29_31.get(var22_24);
                            Intrinsics.checkNotNull(var31_33);
                            var23_25.getClass();
                            var56_56 = var31_33.a();
                            if (var56_56) {
                                var32_34 = 0;
                                var33_35 = 0.0f;
                                var7_7 = null;
                                var21_23 = var31_33.c(null);
                                var26_28.i(var21_23, null);
                                var10_10.h(null, var21_23);
                                var19_21.d(var21_23);
                                var57_57 /* !! */  = var50_50 /* !! */ ;
                                var9_9 /* !! */  = new C2$a(var21_23, null);
                                var13_13.b((C2$a)var9_9 /* !! */ );
lbl1093:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var57_57 /* !! */  = var50_50 /* !! */ ;
                            var30_32.add(var23_25);
                            ** continue;
                            var32_34 = 1;
                            var33_35 = 1.4E-45f;
                            var50_50 /* !! */  = var57_57 /* !! */ ;
                            var32_34 = 28;
                            var33_35 = 3.9E-44f;
                        }
                        var3_3 = var30_32.size();
                        var33_35 = 0.0f;
                        var7_7 = null;
                        for (var32_34 = 0; var32_34 < var3_3; var32_34 += var50_50 /* !! */ ) {
                            var9_9 /* !! */  = (Af0)var30_32.get(var32_34);
                            var18_20 = var19_21.a(var32_34);
                            var9_9 /* !! */ .getClass();
                            var9_9 /* !! */  = null;
                            var26_28.i(var18_20, null);
                            var10_10.h(null, var18_20);
                            var20_22 /* !! */  = new C2$a(var18_20, null);
                            var13_13.b((C2$a)var20_22 /* !! */ );
                            var50_50 /* !! */  = 1;
                            var51_51 = 1.4E-45f;
                        }
                    } else {
                        var32_34 = var29_31.size();
                        var51_51 = 0.0f;
                        var9_9 /* !! */  = null;
                        for (var50_50 /* !! */  = 0; var50_50 /* !! */  < var32_34; var50_50 /* !! */  += var18_20) {
                            var31_33 = (Af0)var29_31.get(var50_50 /* !! */ );
                            var46_47 = var30_32.a(var50_50 /* !! */ );
                            var31_33.getClass();
                            var31_33 = null;
                            var26_28.i(var46_47, null);
                            var10_10.h(null, var46_47);
                            var20_22 /* !! */  = new C2$a(var46_47, null);
                            var13_13.b((C2$a)var20_22 /* !! */ );
                            var18_20 = 1;
                        }
                    }
                    var29_31 = var8_8.p;
                    var29_31.i(var14_14, var26_28);
                    var16_18.i(var14_14, var10_10);
                } else {
                    var29_31 = new StringBuilder("Can't have more than ");
                    var29_31 = g30.a(var30_32.b, " custom actions for one widget", var29_31);
                    var37_39 = new IllegalStateException((String)var29_31);
                    throw var37_39;
lbl1145:
                    // 2 sources

                    var14_14 = var1_1;
                }
                var2_2 = (int)var8_8.p((GY2)var37_39);
                var3_3 = Build.VERSION.SDK_INT;
                var25_27 = 28;
                if (var3_3 >= var25_27) {
                    Z1.a(var27_29, (boolean)var2_2);
                } else {
                    var25_27 = 1;
                    var13_13.j(var25_27, (boolean)var2_2);
                }
                var37_39 = var8_8.z;
                var2_2 = var37_39.c(var14_14);
                var25_27 = -1;
                if (var2_2 != var25_27) {
                    var26_28 = VY2.f(var38_41.getAndroidViewsHandler$ui_release(), var2_2);
                    var5_5 /* !! */  = 22;
                    var6_6 = 3.1E-44f;
                    if (var26_28 != null) {
                        if (var3_3 >= var5_5 /* !! */ ) {
                            U1.a(var27_29, (AndroidViewHolder)var26_28);
                        }
                        while (true) {
                            var29_31 = var38_41;
                            break;
                        }
                    } else {
                        if (var3_3 < var5_5 /* !! */ ) ** continue;
                        var29_31 = var38_41;
                        T1.a(var27_29, (View)var38_41, var2_2);
                    }
                    var37_39 = var8_8.B;
                    var4_4 = 0;
                    var27_29 = null;
                    var8_8.a(var14_14, (C2)var13_13, (String)var37_39, null);
                } else {
                    var29_31 = var38_41;
                    var4_4 = 0;
                    var27_29 = null;
                }
                var37_39 = var8_8.A;
                var2_2 = var37_39.c(var14_14);
                var25_27 = -1;
                if (var2_2 != var25_27 && (var37_39 = VY2.f(var29_31 = var29_31.getAndroidViewsHandler$ui_release(), var2_2)) != null) {
                    var13_13.u((View)var37_39);
                    var37_39 = var8_8.C;
                    var8_8.a(var14_14, (C2)var13_13, (String)var37_39, null);
                }
                var16_18 = var13_13;
            }
            var2_2 = (int)var8_8.m;
            if (var2_2 != 0 && var14_14 == (var2_2 = var8_8.k)) {
                var8_8.l = var16_18;
            }
            return var16_18;
        }
        var14_15 = var2_2;
        var37_40 = new StringBuilder("semanticsNode ");
        var37_40.append(var2_2);
        var37_40.append(" has null parent");
        bh1_1.d(var37_40.toString());
        throw null;
    }

    public final C2 c(int n3) {
        n3 = this.b.k;
        return this.b(n3);
    }

    /*
     * Exception decompiling
     */
    public final boolean d(int var1_1, int var2_2, Bundle var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE]], but top level block is 14[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

