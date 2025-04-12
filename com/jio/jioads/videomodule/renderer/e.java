/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 */
package com.jio.jioads.videomodule.renderer;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jio.jioads.R$drawable;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.controller.m;
import com.jio.jioads.controller.o;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import com.jio.jioads.util.s;
import com.jio.jioads.utils.l;
import com.jio.jioads.videomodule.l_0;
import com.jio.jioads.videomodule.m_0;
import com.jio.jioads.videomodule.renderer.a;
import com.jio.jioads.videomodule.renderer.b;
import com.jio.jioads.videomodule.renderer.c;
import com.jio.jioads.videomodule.renderer.d;
import com.jio.jioads.videomodule.renderer.f;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class e
implements com.jio.jioads.videomodule.player.callback.a {
    public final com.jio.jioads.common.b a;
    public final com.jio.jioads.common.c b;
    public final l_0 c;
    public final f d;
    public ViewGroup e;
    public final com.jio.jioads.videomodule.config.a f;
    public final com.jio.jioads.videomodule.config.b g;
    public boolean h;
    public AdMetaData$AdParams i;
    public boolean j;
    public boolean k;
    public m_0 l;
    public long m;
    public boolean n;

    public e(com.jio.jioads.common.b b2, com.jio.jioads.common.c c2, l_0 l_02, f f5, ViewGroup viewGroup, com.jio.jioads.videomodule.config.a a2, com.jio.jioads.videomodule.config.b b3) {
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
        Intrinsics.checkNotNullParameter(l_02, "currentJioPlayer");
        Intrinsics.checkNotNullParameter(f5, "jioViewHolder");
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(a2, "config");
        Intrinsics.checkNotNullParameter(b3, "videoViewRenderingManager");
        this.a = b2;
        this.b = c2;
        this.c = l_02;
        this.d = f5;
        this.e = viewGroup;
        this.f = a2;
        this.g = b3;
    }

    public final void a() {
        f f5 = this.d;
        Drawable drawable2 = f5.G;
        if (drawable2 != null && (f5 = f5.F) != null) {
            f5.setImageDrawable(drawable2);
        }
    }

    public final void a(boolean bl2) {
        TextView textView;
        com.jio.jioads.videomodule.config.a a2 = this.f;
        bl2 = a2.t;
        int n3 = 0;
        com.jio.jioads.videomodule.config.b b2 = this.g;
        f f5 = this.d;
        int n4 = 8;
        if (bl2 && (a2 = f5.h) != null) {
            int n7 = b2.j ^ 1;
            if (n7 != 0) {
                n7 = 0;
                textView = null;
            } else {
                n7 = 8;
            }
            a2.setVisibility(n7);
        }
        if ((a2 = f5.A) != null) {
            textView = f5.w;
            if (textView != null) {
                textView.setVisibility(n4);
            }
            f5 = f5.C;
            if (f5 != null) {
                f5.setVisibility(n4);
            }
            boolean bl3 = b2.j ^ true;
            if (!bl3) {
                n3 = 8;
            }
            a2.setVisibility(n3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Pair b(com.jio.jioads.videomodule.player.o var1_1, float var2_2, float var3_3) {
        block36: {
            block41: {
                block40: {
                    block38: {
                        var4_4 = this;
                        var5_5 = var2_2;
                        var6_6 = var3_3;
                        var7_7 /* !! */  = "null cannot be cast to non-null type android.view.ViewGroup";
                        var8_8 = this.f;
                        var9_9 = this.a;
                        Intrinsics.checkNotNullParameter(var1_1, "jioPlayer");
                        var10_10 = "";
                        var11_11 = 1;
                        try {
                            var12_12 = var8_8.c;
                            if (!var12_12) break block36;
                            var8_8 = new StringBuilder();
                            var13_13 = var9_9.P();
                            var8_8.append((String)var13_13);
                            var13_13 = ": adjustAspectRatio videoWidth: ";
                            var8_8.append((String)var13_13);
                            var8_8.append(var2_2);
                            var13_13 = ",  videoHeight: ";
                            var8_8.append((String)var13_13);
                            var8_8.append(var3_3);
                            var8_8 = var8_8.toString();
                            com.jio.jioads.util.j.a((String)var8_8);
                        }
                        catch (Exception var26_26) {}
                        var14_14 = var2_2 / var3_3;
                        var13_13 = new StringBuilder();
                        var15_15 /* !! */  = var9_9.P();
                        var13_13.append((String)var15_15 /* !! */ );
                        var15_15 /* !! */  = ": aspectRatio: ";
                        var13_13.append((String)var15_15 /* !! */ );
                        var13_13.append(var14_14);
                        var13_13 = var13_13.toString();
                        com.jio.jioads.util.j.a((String)var13_13);
                        var13_13 = this.e;
                        var13_13 = var13_13.getParent();
                        if (var13_13 == null) break block36;
                        var13_13 = this.e;
                        var16_16 = (var13_13 = var13_13.getParent()) instanceof ViewGroup;
                        if (var16_16 == 0) break block36;
                        var13_13 = Utility.INSTANCE;
                        var15_15 /* !! */  = var9_9.Y();
                        var15_15 /* !! */  = var13_13.getScreenHeightAndWidth((Context)var15_15 /* !! */ );
                        var17_17 = false;
                        var18_18 = var15_15 /* !! */ [0];
                        if (var18_18 == null) {
                            var18_18 = var10_10;
                        }
                        var19_19 = Integer.parseInt(var18_18);
                        if ((var15_15 /* !! */  = var15_15 /* !! */ [var11_11]) == null) {
                            var15_15 /* !! */  = var10_10;
                        }
                        var20_20 = Integer.parseInt((String)var15_15 /* !! */ );
                        var21_21 = var4_4.e;
                        var21_21 = var21_21.getParent();
                        Intrinsics.checkNotNull(var21_21, var7_7 /* !! */ );
                        var22_22 = var21_21.getWidth();
                        var23_23 = ": adContainerWidth: ";
                        if (var22_22 == 0) {
                            var21_21 = new StringBuilder();
                            var24_24 = var9_9.P();
                            var21_21.append((String)var24_24);
                            var24_24 = ": Since adContainerWidth is 0 considering screen width";
                            var21_21.append((String)var24_24);
                            var21_21 = var21_21.toString();
                            com.jio.jioads.util.j.a((String)var21_21);
                            var21_21 = var9_9.Y();
                            if (var21_21 != null && (var21_21 = var21_21.getResources()) != null && (var21_21 = var21_21.getConfiguration()) != null && (var22_22 = var21_21.orientation) == (var25_25 = 2) && var19_19 > var20_20) {
                                var21_21 = new StringBuilder();
                                var24_24 = var9_9.P();
                                var21_21.append((String)var24_24);
                                var21_21.append((String)var23_23);
                                var21_21.append(var19_19);
                                var21_21 = var21_21.toString();
                                com.jio.jioads.util.j.a((String)var21_21);
                            } else {
                                var27_31 = var19_19;
                                var19_19 = var20_20;
                                var20_20 = var27_31;
                            }
                        } else {
                            var20_20 = var19_19;
                            var19_19 = var22_22;
                        }
                        var21_21 = new StringBuilder();
                        var24_24 = var9_9.P();
                        var21_21.append((String)var24_24);
                        var21_21.append((String)var23_23);
                        var21_21.append(var19_19);
                        var21_21 = var21_21.toString();
                        com.jio.jioads.util.j.a((String)var21_21);
                        var21_21 = var9_9.O();
                        var23_23 = Boolean.TRUE;
                        var22_22 = (int)Intrinsics.areEqual(var21_21, var23_23);
                        if (var22_22 != 0 && ((var21_21 = var9_9.m0()) != null && (var22_22 = var21_21.length()) > 0 || (var21_21 = var9_9.a()) != null && (var22_22 = (int)var21_21.isEmpty()) == 0)) {
                            var22_22 = 1;
                        } else {
                            var22_22 = 0;
                            var21_21 = null;
                        }
                        var24_24 = var4_4.e;
                        var24_24 = var24_24.getParent();
                        Intrinsics.checkNotNull(var24_24, var7_7 /* !! */ );
                        var24_24 = (ViewGroup)var24_24;
                        var28_32 /* !! */  = var24_24.getHeight();
                        var24_24 = var9_9.O();
                        var29_33 = Intrinsics.areEqual(var24_24, var23_23);
                        if (var29_33 == 0 || (var23_23 = var9_9.m0()) == null || (var29_33 = var23_23.length()) == 0) ** GOTO lbl158
                        var23_23 = var9_9.m0();
                        if (var23_23 == null || (var29_33 = var23_23.length()) <= 0) ** GOTO lbl143
                        var23_23 = var9_9.m0();
                        if (var23_23 != null) {
                            var24_24 = "x";
                            var24_24 = new String[]{var24_24};
                            var11_11 = 6;
                            var30_34 /* !! */  = StringsKt.a0((CharSequence)var23_23, var24_24, false, 0, var11_11);
                        } else {
                            var11_11 = 0;
                            var30_34 /* !! */  = null;
                        }
                        if (var30_34 /* !! */  == null) break block38;
                        var29_33 = 1;
                        var30_34 /* !! */  = var30_34 /* !! */ .get(var29_33);
                        if ((var30_34 /* !! */  = (String)var30_34 /* !! */ ) == null) break block38;
                        var28_32 /* !! */  = Integer.parseInt((String)var30_34 /* !! */ );
                    }
                    var31_35 = var28_32 /* !! */ ;
                    var28_32 /* !! */  = var13_13.convertDpToPixel(var31_35);
                    ** GOTO lbl158
lbl143:
                    // 1 sources

                    var30_34 /* !! */  = var9_9.Q();
                    if (var30_34 /* !! */  == null) ** GOTO lbl158
                    var11_11 = ((Object)var30_34 /* !! */ ).length;
                    if (var11_11 == 0) {
                        var11_11 = 1;
                        var32_36 = 1;
                    } else {
                        var11_11 = 1;
                        var32_36 = 0;
                    }
                    var16_16 = var32_36 ^ 1;
                    if (var16_16 != var11_11) ** GOTO lbl158
                    var7_7 /* !! */  = (String)var9_9.Q();
                    Intrinsics.checkNotNull(var7_7 /* !! */ );
                    var28_32 /* !! */  = (int)var7_7 /* !! */ [var11_11];
lbl158:
                    // 5 sources

                    if (var28_32 /* !! */  == 0) {
                        var7_7 /* !! */  = new StringBuilder();
                        var30_34 /* !! */  = var9_9.P();
                        var7_7 /* !! */ .append((String)var30_34 /* !! */ );
                        var30_34 /* !! */  = ": Since adContainerHeight is 0 considering screen height";
                        var7_7 /* !! */ .append((String)var30_34 /* !! */ );
                        var7_7 /* !! */  = var7_7 /* !! */ .toString();
                        com.jio.jioads.util.j.a(var7_7 /* !! */ );
                    } else {
                        var20_20 = var28_32 /* !! */ ;
                    }
                    var7_7 /* !! */  = new StringBuilder();
                    var30_34 /* !! */  = var9_9.P();
                    var7_7 /* !! */ .append((String)var30_34 /* !! */ );
                    var30_34 /* !! */  = ": adContainerHeight: ";
                    var7_7 /* !! */ .append((String)var30_34 /* !! */ );
                    var7_7 /* !! */ .append(var20_20);
                    var7_7 /* !! */  = var7_7 /* !! */ .toString();
                    com.jio.jioads.util.j.a(var7_7 /* !! */ );
                    var28_32 /* !! */  = 300;
                    var31_35 = 4.2E-43f;
                    if (var19_19 >= var28_32 /* !! */  && ((var28_32 /* !! */  = (int)((cfr_temp_0 = var5_5 - (var31_35 = 300.0f)) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) >= 0 || var22_22 != 0)) {
                        var29_33 = 1;
                    } else {
                        var29_33 = 0;
                        var23_23 = null;
                    }
                    var28_32 /* !! */  = 250;
                    var31_35 = 3.5E-43f;
                    if (var20_20 >= var28_32 /* !! */  && ((var28_32 /* !! */  = (int)((cfr_temp_1 = var6_6 - (var31_35 = 250.0f)) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) >= 0 || var22_22 != 0)) {
                        var17_17 = true;
                    }
                    if (var29_33 == 0 || !var17_17) {
                        var7_7 /* !! */  = var9_9.K();
                        var30_34 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL;
                        if (var7_7 /* !! */  != var30_34 /* !! */ ) break block36;
                    }
                    if ((var33_28 = var5_5 == var6_6 ? 0 : (var5_5 > var6_6 ? 1 : -1)) > 0) {
                        var5_5 = (float)var19_19 / var14_14;
                        var6_6 = var20_20;
                        cfr_temp_2 = var5_5 - var6_6;
                        var34_29 /* !! */  = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                        if (var34_29 /* !! */  >= 0) {
                            var26_27 = new StringBuilder();
                            var35_30 = var9_9.P();
                            var26_27.append((String)var35_30);
                            var35_30 = ": Updating container width";
                            var26_27.append((String)var35_30);
                            var26_27 = var26_27.toString();
                            com.jio.jioads.util.j.a((String)var26_27);
                        } else {
                            var20_20 = (int)var5_5;
                        }
                    } else {
                        var5_5 = (float)var20_20 / var14_14;
                        var6_6 = var19_19;
                        cfr_temp_3 = var5_5 - var6_6;
                        var33_28 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
                        if (var33_28 < 0) {
                            var26_27 = new StringBuilder();
                            var7_7 /* !! */  = var9_9.P();
                            var26_27.append(var7_7 /* !! */ );
                            var7_7 /* !! */  = ": Updating container height";
                            var26_27.append(var7_7 /* !! */ );
                            var26_27 = var26_27.toString();
                            com.jio.jioads.util.j.a((String)var26_27);
                            var20_20 = (int)(var6_6 /= var14_14);
                        }
                    }
                    var26_27 = new StringBuilder();
                    var35_30 = var9_9.P();
                    var26_27.append((String)var35_30);
                    var35_30 = ": containerWidth: ";
                    var26_27.append((String)var35_30);
                    var26_27.append(var19_19);
                    var35_30 = ", containerHeight: ";
                    var26_27.append((String)var35_30);
                    var26_27.append(var20_20);
                    var26_27 = var26_27.toString();
                    com.jio.jioads.util.j.a((String)var26_27);
                    var26_27 = var1_1.g();
                    if (var26_27 != null && (var26_27 = var26_27.getLayoutParams()) != null) {
                        var26_27.height = var20_20;
                        var26_27.width = var19_19;
                        break block40;
                    }
                    var26_27 = new RelativeLayout.LayoutParams(var19_19, var20_20);
                    var34_29 /* !! */  = 13;
                    var6_6 = 1.8E-44f;
                    var28_32 /* !! */  = -1;
                    var31_35 = 0.0f / 0.0f;
                    var26_27.addRule(var34_29 /* !! */ , var28_32 /* !! */ );
                    break block41;
                }
                var35_30 = var1_1.g();
                if (var35_30 != null) {
                    var35_30.setLayoutParams((ViewGroup.LayoutParams)var26_27);
                }
                break block36;
            }
            var35_30 = new StringBuilder();
            var7_7 /* !! */  = var9_9.P();
            var35_30.append(var7_7 /* !! */ );
            var35_30.append(": Exception while adjustAspectRatio ");
            Intrinsics.checkNotNullParameter(var26_26, "<this>");
            com.jio.jioads.jioreel.tracker.model.b.e(var26_26, (StringBuilder)var35_30);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var35_30 = JioAds$LogLevel.NONE;
            var35_30 = JioAdError.Companion;
            var7_7 /* !! */  = JioAdError$JioAdErrorType.ERROR_IN_ADJUSTING_ASPECT_RATIO;
            var35_30.getClass();
            var35_30 = t_0.a((JioAdError$JioAdErrorType)var7_7 /* !! */ );
            var36_37 = Utility.INSTANCE;
            var37_38 = var9_9.Y();
            var38_39 = var9_9.P();
            var39_40 = com.jio.jioads.cdnlogging.d.a;
            var40_41 = var35_30.getErrorTitle();
            var7_7 /* !! */  = new StringBuilder();
            var8_8 = var35_30.getErrorDescription();
            var7_7 /* !! */ .append((String)var8_8);
            var8_8 = ": ";
            var7_7 /* !! */ .append((String)var8_8);
            var26_27 = yc0_2.b(var26_26);
            var7_7 /* !! */ .append((String)var26_27);
            var41_42 = var7_7 /* !! */ .toString();
            var26_27 = (com.jio.jioads.controller.f)var4_4.b;
            var7_7 /* !! */  = var26_27.a;
            var42_43 = var7_7 /* !! */ .T();
            var43_44 = var9_9.q0();
            var44_45 = var35_30.getErrorCode();
            var26_27 = var26_27.a;
            var33_28 = var26_27.a();
            var45_46 = (boolean)var33_28;
            var46_47 = "adjustAspectRatio";
            var36_37.logError(var37_38, var38_39, var39_40, var40_41, var41_42, var42_43, var46_47, var45_46, var43_44, var44_45, false);
        }
        var34_29 /* !! */  = 1;
        var6_6 = 1.4E-45f;
        var26_27 = (boolean)var34_29 /* !! */ ;
        return new Pair(var26_27, var10_10);
    }

    public final void b() {
        f f5 = this.d;
        Drawable drawable2 = f5.E;
        if (drawable2 != null && (f5 = f5.F) != null) {
            f5.setImageDrawable(drawable2);
        }
    }

    public final void c() {
    }

    public final void c(int n3, int n4) {
        int n7 = 0;
        int n8 = 2;
        int n10 = 1;
        f f5 = this.d;
        TextView textView = f5.u;
        if (textView != null) {
            Object object = this.f;
            boolean bl2 = ((com.jio.jioads.videomodule.config.a)object).b;
            if (bl2 && n4 > n10) {
                object = StringCompanionObject.INSTANCE;
                object = Locale.ENGLISH;
                Object object2 = n3 += n10;
                Object object3 = n4;
                Object[] objectArray = new Object[n8];
                objectArray[0] = object2;
                objectArray[n10] = object3;
                object3 = "format(locale, format, *args)";
                object2 = IV0.a(objectArray, n8, (Locale)object, "Ad . %d of %d", (String)object3);
                textView.setText((CharSequence)object2);
                object2 = this.g;
                n4 = (int)(((com.jio.jioads.videomodule.config.b)object2).j ? 1 : 0);
                n8 = 8;
                if (n4 != 0) {
                    object3 = f5.u;
                    if (object3 != null) {
                        object3.setVisibility(n8);
                    }
                } else {
                    object3 = f5.u;
                    if (object3 != null) {
                        int n14 = this.j ^ n10;
                        if (n14 == 0) {
                            n7 = 8;
                        }
                        object3.setVisibility(n7);
                    }
                }
                ((com.jio.jioads.videomodule.config.b)object2).g = n10;
            }
        }
    }

    public final void d() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(long var1_1) {
        block69: {
            block71: {
                var3_2 = this;
                var4_3 = 1;
                var5_4 /* !! */  = "message";
                var6_5 = this.g;
                var7_6 = this.a;
                try {
                    var8_7 = this.k;
                    if (var8_7 != 0 && (var8_7 = var7_6.e()) == 0) {
                        return;
                    }
                }
                catch (Exception var9_8) {
                    break block69;
                }
                var10_12 /* !! */  = var6_5.h;
                var11_13 = null;
                var12_19 = false;
                var13_14 = null;
                var14_20 = 8;
                var15_15 = var3_2.d;
                if (var10_12 /* !! */  == null) ** GOTO lbl269
                var16_16 /* !! */  = "type";
                var16_16 /* !! */  = var10_12 /* !! */ .optString((String)var16_16 /* !! */ );
                var16_16 /* !! */  = var16_16 /* !! */ .toString();
                var16_16 /* !! */  = StringsKt.m0((CharSequence)var16_16 /* !! */ );
                var18_21 = Intrinsics.areEqual(var16_16 /* !! */  = var16_16 /* !! */ .toString(), var17_17 = "1");
                if (var18_21 == 0) ** GOTO lbl256
                var16_16 /* !! */  = "time";
                if ((var10_12 /* !! */  = var10_12 /* !! */ .optString((String)var16_16 /* !! */ )) == null || (var18_21 = var10_12 /* !! */ .length()) == 0) ** GOTO lbl267
                Intrinsics.checkNotNull(var10_12 /* !! */ );
                var16_16 /* !! */  = StringsKt.toIntOrNull((String)var10_12 /* !! */ );
                if (var16_16 /* !! */  == null) ** GOTO lbl267
                var18_21 = 1000;
                var19_22 = var18_21;
                var21_23 = Integer.parseInt((String)var10_12 /* !! */ );
                var22_24 = var21_23;
                cfr_temp_0 = (var19_22 = var1_1 / var19_22) - var22_24;
                var24_25 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var24_25 /* !! */  >= 0) break block71;
                var17_17 = this.r();
                if (var17_17 != null) {
                    var25_26 = var17_17.getCurrentPosition();
                    var25_26 /= var18_21;
                } else {
                    var25_26 = 0;
                    var17_17 = null;
                }
                var8_7 = Integer.parseInt((String)var10_12 /* !! */ );
                if (var25_26 < var8_7) ** GOTO lbl-1000
            }
            if ((var8_7 = var3_2.h) != 0 && (var8_7 = var6_5.f) == 0) {
                var8_7 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var8_7 = 0;
                var10_12 /* !! */  = null;
            }
            if (var8_7 == 0 && (var16_16 /* !! */  = var15_15.D) != null) {
                var16_16 /* !! */ .setClickable(false);
            }
            var18_21 = (int)var6_5.j;
            var17_17 = var3_2.f;
            if (var18_21 == 0) ** GOTO lbl62
            {
                var5_4 /* !! */  = var15_15.L;
                if (var5_4 /* !! */  != null) {
                    var5_4 /* !! */ .setVisibility(var14_20);
                }
                ** GOTO lbl147
lbl62:
                // 1 sources

                var18_21 = (int)var17_17.v;
                if (var18_21 == 0 || (var16_16 /* !! */  = var3_2.i) != null) ** GOTO lbl121
                var6_5.k = var8_7;
                if (var16_16 /* !! */  != null) {
                    var16_16 /* !! */  = var16_16 /* !! */ .getVideoCtaText();
                } else {
                    var18_21 = 0;
                    var16_16 /* !! */  = null;
                }
                if (var16_16 /* !! */  != null && (var18_21 = var16_16 /* !! */ .length()) != 0 || (var18_21 = (int)var3_2.h) == 0 || var8_7 == 0 || (var16_16 /* !! */  = var7_6.K()) != (var26_18 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL)) ** GOTO lbl117
            }
            {
                block73: {
                    block72: {
                        var16_16 /* !! */  = var15_15.L;
                        var26_18 /* !! */  = "Know More";
                        if (var16_16 /* !! */  != null) {
                            var16_16 /* !! */ .setText((CharSequence)var26_18 /* !! */ );
                        }
                        var16_16 /* !! */  = var15_15.N;
                        if (var16_16 /* !! */  != null) {
                            var16_16 /* !! */ .setText((CharSequence)var26_18 /* !! */ );
                        }
                        var16_16 /* !! */  = var7_6.Y();
                        if (var16_16 /* !! */  != null && (var18_21 = (int)j_0.l((Context)var16_16 /* !! */ )) == var4_3) {
                            var16_16 /* !! */  = var15_15.L;
                            var26_18 /* !! */  = "Visit Advertiser";
                            if (var16_16 /* !! */  != null) {
                                var16_16 /* !! */ .setText((CharSequence)var26_18 /* !! */ );
                            }
                            var16_16 /* !! */  = var15_15.N;
                            if (var16_16 /* !! */  != null) {
                                var16_16 /* !! */ .setText((CharSequence)var26_18 /* !! */ );
                            }
                        }
                        if ((var16_16 /* !! */  = var15_15.L) != null) {
                            var16_16 /* !! */ .setVisibility(0);
                        }
                        var16_16 /* !! */  = var7_6.Y();
                        if (var16_16 /* !! */  == null || (var18_21 = (int)j_0.l((Context)var16_16 /* !! */ )) != var4_3) {
                            var16_16 /* !! */  = var15_15.D;
                            if (var16_16 /* !! */  != null) {
                                var16_16 /* !! */ .setClickable((boolean)var4_3);
                            }
                            var16_16 /* !! */  = var15_15.L;
                            if (var16_16 /* !! */  != null) {
                                var13_14 = var16_16 /* !! */ .getLayoutParams();
                            }
                            if (var13_14 != null) {
                                var13_14.width = var18_21 = -1;
                            }
                            var16_16 /* !! */  = var15_15.L;
                            if (var16_16 /* !! */  != null) {
                                var16_16 /* !! */ .setLayoutParams((ViewGroup.LayoutParams)var13_14);
                            }
                        }
                        var13_14 = new StringBuilder();
                        var16_16 /* !! */  = var7_6.P();
                        var13_14.append((String)var16_16 /* !! */ );
                        var16_16 /* !! */  = ": Setting CTA text to Know More";
                        var13_14.append((String)var16_16 /* !! */ );
                        var13_14 = var13_14.toString();
                        Intrinsics.checkNotNullParameter(var13_14, var5_4 /* !! */ );
                        var5_4 /* !! */  = JioAds.Companion;
                        var5_4 /* !! */  = var5_4 /* !! */ .getInstance();
                        var5_4 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var5_4 /* !! */  = JioAds$LogLevel.NONE;
                        break block72;
lbl117:
                        // 1 sources

                        var5_4 /* !! */  = var15_15.L;
                        if (var5_4 /* !! */  != null) {
                            var5_4 /* !! */ .setVisibility(var14_20);
                        }
                        break block72;
lbl121:
                        // 1 sources

                        var5_4 /* !! */  = var15_15.N;
                        if (var5_4 /* !! */  != null && (var27_27 = var5_4 /* !! */ .getVisibility()) == 0) ** GOTO lbl-1000
                        var5_4 /* !! */  = var15_15.N;
                        if (var5_4 /* !! */  != null) {
                            var27_27 = (int)var5_4 /* !! */ .hasFocus();
                        } else {
                            var27_27 = 0;
                            var5_4 /* !! */  = null;
                        }
                        if (var27_27 != 0) lbl-1000:
                        // 2 sources

                        {
                            var27_27 = 1;
                        } else {
                            var27_27 = 0;
                            var5_4 /* !! */  = null;
                        }
                        var13_14 = var15_15.L;
                        if (var13_14 != null) {
                            if (var8_7 != 0 && var27_27 == 0) {
                                var27_27 = 1;
                            } else {
                                var27_27 = 0;
                                var5_4 /* !! */  = null;
                            }
                            if (var27_27 != 0) {
                                var27_27 = 0;
                                var5_4 /* !! */  = null;
                            } else {
                                var27_27 = 8;
                            }
                            var13_14.setVisibility(var27_27);
                        }
                    }
                    var3_2.k = var8_7;
                    if (var8_7 != 0 && (var5_4 /* !! */  = var3_2.l) != null) {
                        var5_4 /* !! */ .invoke();
                    }
                    if ((var27_27 = (int)j_0.l((Context)(var5_4 /* !! */  = var7_6.Y()))) != 0) {
                        var5_4 /* !! */  = var15_15.L;
                        if (var5_4 /* !! */  != null) {
                            var12_19 = var3_2.k;
                            var5_4 /* !! */ .setFocusable(var12_19);
                        }
                        var5_4 /* !! */  = var15_15.N;
                        if (var5_4 /* !! */  != null) {
                            var12_19 = var3_2.k;
                            var5_4 /* !! */ .setFocusable(var12_19);
                        }
                        var5_4 /* !! */  = var15_15.L;
                        if (var5_4 /* !! */  != null) {
                            var12_19 = var3_2.k;
                            var5_4 /* !! */ .setFocusableInTouchMode(var12_19);
                        }
                        var5_4 /* !! */  = var15_15.N;
                        if (var5_4 /* !! */  != null) {
                            var12_19 = var3_2.k;
                            var5_4 /* !! */ .setFocusableInTouchMode(var12_19);
                        }
                    }
                    if ((var27_27 = (int)var17_17.h) == 0 || var8_7 == 0 || (var27_27 = (int)j_0.l((Context)(var5_4 /* !! */  = var7_6.Y()))) == 0) ** GOTO lbl206
                    var5_4 /* !! */  = var15_15.w;
                    if (var5_4 /* !! */  != null && (var27_27 = var5_4 /* !! */ .getVisibility()) == 0) {
                        var27_27 = 1;
                    } else {
                        var27_27 = 0;
                        var5_4 /* !! */  = null;
                    }
                    if (var27_27 != 0) break block73;
                    var5_4 /* !! */  = var15_15.w;
                    if (var5_4 /* !! */  != null) {
                        var27_27 = (int)var5_4 /* !! */ .hasFocus();
                    } else {
                        var27_27 = 0;
                        var5_4 /* !! */  = null;
                    }
                    if (var27_27 != 0) break block73;
                    var5_4 /* !! */  = var15_15.t;
                    if (var5_4 /* !! */  != null && (var27_27 = var5_4 /* !! */ .getVisibility()) == 0) {
                        var27_27 = 1;
                    } else {
                        var27_27 = 0;
                        var5_4 /* !! */  = null;
                    }
                    if (var27_27 != 0) break block73;
                    var5_4 /* !! */  = var15_15.t;
                    if (var5_4 /* !! */  != null) {
                        var27_27 = (int)var5_4 /* !! */ .hasFocus();
                    } else {
                        var27_27 = 0;
                        var5_4 /* !! */  = null;
                    }
                    if (var27_27 != 0) break block73;
                    var27_27 = 0;
                    var5_4 /* !! */  = null;
                    ** GOTO lbl-1000
                }
                var27_27 = 1;
            }
lbl-1000:
            // 2 sources

            {
                block75: {
                    block76: {
                        block74: {
                            if (var27_27 == 0 && (var5_4 /* !! */  = var7_6.K()) != (var10_12 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL) && (var5_4 /* !! */  = var15_15.L) != null) {
                                var5_4 /* !! */ .requestFocus();
                            }
lbl206:
                            // 4 sources

                            if ((var27_27 = (int)var6_5.j) == 0) break block74;
                            var9_9 = var15_15.O;
                            if (var9_9 != null) {
                                var9_9.setVisibility(var14_20);
                            }
                            break block75;
                        }
                        var27_27 = (int)var17_17.v;
                        if (var27_27 == 0 || (var5_4 /* !! */  = var3_2.i) != null || (var27_27 = (int)var3_2.h) != 0) break block76;
                        var9_9 = var15_15.O;
                        if (var9_9 != null) {
                            var9_9.setVisibility(var14_20);
                        }
                        break block75;
                    }
                    var5_4 /* !! */  = var15_15.O;
                    if (var5_4 /* !! */  != null) {
                        block70: {
                            var28_28 = 0;
                            var6_5 = null;
                            while (true) {
                                if (var28_28 < (var8_7 = var5_4 /* !! */ .getChildCount())) {
                                    var8_7 = 1;
                                } else {
                                    var8_7 = 0;
                                    var10_12 /* !! */  = null;
                                }
                                if (var8_7 == 0) break;
                                var8_7 = var28_28 + 1;
                                var6_5 = var5_4 /* !! */ .getChildAt(var28_28);
                                if (var6_5 == null) {
                                    var9_10 = new IndexOutOfBoundsException();
                                    throw var9_10;
                                }
                                var28_28 = var6_5.getVisibility();
                                if (var28_28 == 0) {
                                    var28_28 = 1;
                                } else {
                                    var28_28 = 0;
                                    var6_5 = null;
                                }
                                if (var28_28 == 0) {
                                    var28_28 = var8_7;
                                    continue;
                                }
                                break block70;
                                break;
                            }
                            var4_3 = 0;
                            var9_9 = null;
                        }
                        if (var4_3 != 0) {
                            var4_3 = 0;
                            var9_9 = null;
                        } else {
                            var4_3 = 8;
                        }
                        var5_4 /* !! */ .setVisibility(var4_3);
                    }
                    break block75;
lbl256:
                    // 1 sources

                    var9_9 = var15_15.N;
                    if (var9_9 != null) {
                        var9_9.clearFocus();
                    }
                    if ((var9_9 = var15_15.N) != null) {
                        var9_9.setVisibility(var14_20);
                    }
                    var9_9 = var15_15.L;
                    if (var9_9 != null) {
                        var9_9.clearFocus();
                    }
                    if ((var9_9 = var15_15.L) != null) {
                        var9_9.setVisibility(var14_20);
                    }
                    var3_2.k = false;
                }
                var13_14 = Unit.a;
lbl269:
                // 2 sources

                if (var13_14 != null) return;
                var4_3 = var3_2.h;
                if (var4_3 != 0) return;
                var3_2.k = false;
                var9_9 = var15_15.L;
                if (var9_9 != null) {
                    var9_9.setVisibility(var14_20);
                }
                var9_9 = var15_15.N;
                if (var9_9 == null) {
                    return;
                }
                var9_9.setVisibility(var14_20);
                return;
            }
        }
        var5_4 /* !! */  = new StringBuilder();
        j_0.n(var7_6, (StringBuilder)var5_4 /* !! */ , ": error while rendering cta ");
        com.jio.jioads.adinterfaces.l_0.f(var9_8, (StringBuilder)var5_4 /* !! */ );
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var5_4 /* !! */  = JioAds$LogLevel.NONE;
        var5_4 /* !! */  = JioAdError.Companion;
        var6_5 = JioAdError$JioAdErrorType.ERROR_IN_CTA_RENDERING;
        var5_4 /* !! */ .getClass();
        var5_4 /* !! */  = t_0.a((JioAdError$JioAdErrorType)var6_5);
        var10_12 /* !! */  = Utility.INSTANCE;
        var11_13 = var7_6.Y();
        var13_14 = var7_6.P();
        var29_29 = com.jio.jioads.cdnlogging.d.a;
        var15_15 = var5_4 /* !! */ .getErrorTitle();
        var6_5 = new StringBuilder();
        var16_16 /* !! */  = var5_4 /* !! */ .getErrorDescription();
        var6_5.append((String)var16_16 /* !! */ );
        var6_5.append(": ");
        var9_11 = yc0_2.b(var9_8);
        var6_5.append((String)var9_11);
        var16_16 /* !! */  = var6_5.toString();
        var9_11 = (com.jio.jioads.controller.f)var3_2.b;
        var6_5 = var9_11.a;
        var17_17 = var6_5.T();
        var30_30 = var7_6.q0();
        var31_31 = var5_4 /* !! */ .getErrorCode();
        var9_11 = var9_11.a;
        var4_3 = var9_11.a();
        var32_32 = (boolean)var4_3;
        var26_18 /* !! */  = "renderCTAifPossible";
        var10_12 /* !! */ .logError(var11_13, (String)var13_14, var29_29, (String)var15_15, (String)var16_16 /* !! */ , (com.jio.jioads.cdnlogging.a)var17_17, var26_18 /* !! */ , var32_32, var30_30, var31_31, false);
    }

    public final void e() {
        f f5 = this.d;
        ImageView imageView = f5.q;
        if (imageView != null) {
            f5 = f5.n;
            imageView.setImageDrawable((Drawable)f5);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void e(AdMetaData$AdParams object) {
        int n3;
        Object object2;
        boolean bl2 = false;
        Object object3 = null;
        if (object != null) {
            object2 = ((AdMetaData$AdParams)object).getAdDescription();
        } else {
            n3 = 0;
            object2 = null;
        }
        int n4 = 8;
        f f5 = this.d;
        if (object2 != null) {
            object2 = ((AdMetaData$AdParams)object).getAdDescription();
            boolean bl3 = true;
            if (object2 != null && (object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString()) != null) {
                n3 = ((String)object2).length();
                if (!n3) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object2 = null;
                }
                object2 = n3 != 0;
            } else {
                n3 = 0;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
            if (!n3 && (object2 = f5.J) != null) {
                String string2 = ((AdMetaData$AdParams)object).getAdDescription();
                string2 = string2 != null ? ((Object)StringsKt.m0(string2)).toString() : null;
                object2.setText((CharSequence)string2);
                object2 = ((AdMetaData$AdParams)object).getDescriptionTextColor();
                if (object2 != null) {
                    object2 = ((AdMetaData$AdParams)object).getDescriptionTextColor();
                    if (object2 != null && (object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString()) != null) {
                        n3 = ((String)object2).length();
                        if (!n3) {
                            n3 = 1;
                        } else {
                            n3 = 0;
                            object2 = null;
                        }
                        object2 = n3 != 0;
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                    n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                    if (!n3 && (object2 = f5.J) != null) {
                        if ((object = ((AdMetaData$AdParams)object).getDescriptionTextColor()) != null) {
                            object = StringsKt.m0((CharSequence)object);
                            object3 = object.toString();
                        }
                        int n7 = Color.parseColor((String)object3);
                        object2.setTextColor(n7);
                    }
                }
                object = f5.J;
                object3 = this.g;
                if (object != null) {
                    n3 = ((com.jio.jioads.videomodule.config.b)object3).j ^ bl3;
                    if (n3) {
                        n3 = 0;
                        object2 = null;
                    } else {
                        n3 = 8;
                    }
                    object.setVisibility(n3);
                }
                if ((object = f5.O) == null) {
                    return;
                }
                bl2 = ((com.jio.jioads.videomodule.config.b)object3).j ^ bl3;
                if (bl2) {
                    n4 = 0;
                }
                object.setVisibility(n4);
                return;
            }
        }
        if ((object = f5.J) == null) {
            return;
        }
        object.setVisibility(n4);
    }

    public final void f() {
    }

    public final void g() {
        f f5 = this.d;
        ImageView imageView = f5.q;
        if (imageView != null) {
            f5 = f5.o;
            imageView.setImageDrawable((Drawable)f5);
        }
    }

    public final void h(long l2, long l3) {
        int n3;
        int n4 = 2;
        int n7 = 0;
        int n8 = 1;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return;
        }
        int n10 = 100;
        l4 = (long)n10 * l3 / l2;
        f f5 = this.d;
        Object object2 = f5.f;
        if (object2 != null) {
            n3 = (int)l4;
            object2.setProgress(n3);
        }
        Object[] objectArray = f5.v;
        if (objectArray != null) {
            String string2;
            int n14;
            objectArray = f5.P;
            String string3 = "VideoAdProgressCountUp";
            n3 = (int)(Intrinsics.areEqual(objectArray, string3) ? 1 : 0);
            object2 = this.g;
            String string4 = "%s/%s";
            String string5 = "format(format, *args)";
            int n15 = 1000;
            if (n3 != 0) {
                l4 = n15;
                long l8 = l3 / l4;
                int n16 = (int)l8;
                String string6 = j_0.e(n16);
                n14 = (int)(l2 /= l4);
                string2 = j_0.e(n14);
                TextView textView = f5.v;
                if (textView != null) {
                    objectArray = StringCompanionObject.INSTANCE;
                    objectArray = new Object[n4];
                    objectArray[0] = string6;
                    objectArray[n8] = string2;
                    zn0_1.b(objectArray, n4, string4, string5, textView);
                }
            } else {
                string3 = "VideoAdProgressCountTotalDuration";
                n10 = (int)(Intrinsics.areEqual(objectArray, string3) ? 1 : 0);
                if (n10 != 0) {
                    long l12;
                    l2 = object2.a;
                    l4 = n15;
                    l2 *= l4;
                    n15 = object2.b;
                    if (n15 == 0) {
                        this.m = l2;
                    } else {
                        n15 = (int)(this.n ? 1 : 0);
                        if (n15 == 0) {
                            this.m = l12 = object2.c;
                            this.n = n8;
                        }
                    }
                    object2.c = l12 = this.m - l3;
                    int n17 = (int)(l12 /= l4);
                    String string7 = j_0.e(n17);
                    n14 = (int)(l2 /= l4);
                    string2 = j_0.e(n14);
                    TextView textView = f5.v;
                    if (textView != null) {
                        objectArray = StringCompanionObject.INSTANCE;
                        objectArray = new Object[n4];
                        objectArray[0] = string7;
                        objectArray[n8] = string2;
                        zn0_1.b(objectArray, n4, string4, string5, textView);
                    }
                } else {
                    l2 -= l3;
                    l4 = n15;
                    n14 = (int)(l2 /= l4);
                    string2 = j_0.e(n14);
                    TextView textView = f5.v;
                    if (textView != null) {
                        Object[] objectArray2 = StringCompanionObject.INSTANCE;
                        objectArray2 = new Object[n8];
                        objectArray2[0] = string2;
                        string2 = "%s";
                        zn0_1.b(objectArray2, n8, string2, string5, textView);
                    }
                }
            }
            boolean bl2 = object2.j;
            n14 = 8;
            if (bl2) {
                string2 = f5.v;
                if (string2 != null) {
                    string2.setVisibility(n14);
                }
            } else {
                string2 = f5.v;
                if (string2 != null) {
                    n4 = this.j ^ n8;
                    if (n4 == 0) {
                        n7 = 8;
                    }
                    string2.setVisibility(n7);
                }
            }
        }
        this.d(l3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(AdMetaData$AdParams adMetaData$AdParams, boolean n3) {
        Object object;
        Exception exception2;
        String string2;
        Object object2;
        com.jio.jioads.videomodule.config.b b2;
        Utility utility;
        com.jio.jioads.common.b b3;
        Object object3;
        e e2;
        block12: {
            int n4;
            boolean bl2;
            Object object4;
            block9: {
                int n7;
                block11: {
                    e2 = this;
                    object4 = adMetaData$AdParams;
                    bl2 = true;
                    object3 = this.d;
                    b3 = this.a;
                    n7 = n3;
                    this.h = n3;
                    this.i = adMetaData$AdParams;
                    n7 = 0;
                    utility = null;
                    this.k = false;
                    b2 = this.g;
                    b2.k = false;
                    try {
                        this.p(adMetaData$AdParams);
                        this.k(adMetaData$AdParams);
                        this.n(adMetaData$AdParams);
                        this.o(adMetaData$AdParams);
                        this.e(adMetaData$AdParams);
                        b2 = ((f)object3).O;
                        n4 = 8;
                        if (b2 == null) break block9;
                        int n8 = 0;
                        object2 = null;
                        while (true) {
                            int n10;
                            if (n8 < (n10 = b2.getChildCount())) {
                                n10 = 1;
                            } else {
                                n10 = 0;
                                string2 = null;
                            }
                            if (n10 == 0) break;
                            n10 = n8 + 1;
                            object2 = b2.getChildAt(n8);
                            if (object2 == null) {
                                object4 = new IndexOutOfBoundsException();
                                throw object4;
                            }
                            n8 = object2.getVisibility();
                            if (n8 != 0) {
                                n8 = n10;
                                continue;
                            }
                            break block11;
                            break;
                        }
                    }
                    catch (Exception exception2) {
                        break block12;
                    }
                    n7 = 8;
                }
                b2.setVisibility(n7);
            }
            object = e2.f;
            bl2 = ((com.jio.jioads.videomodule.config.a)object).v;
            if (!bl2) return;
            if (object4 != null) return;
            object4 = b3.K();
            if (object4 == (object = JioAdView$AD_TYPE.INTERSTITIAL)) return;
            object4 = ((f)object3).O;
            if (object4 == null) {
                return;
            }
            object4.setVisibility(n4);
            return;
        }
        object = new StringBuilder();
        object3 = b3.P();
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append(": Exception while setting AdParams ");
        Intrinsics.checkNotNullParameter(exception2, "<this>");
        com.jio.jioads.jioreel.tracker.model.b.e(exception2, (StringBuilder)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = JioAdError.Companion;
        object3 = JioAdError$JioAdErrorType.ERROR_IN_AD_PARAM_RENDERING;
        object.getClass();
        object = t_0.a((JioAdError$JioAdErrorType)((Object)object3));
        utility = Utility.INSTANCE;
        b2 = b3.Y();
        String string3 = b3.P();
        object2 = com.jio.jioads.cdnlogging.d.a;
        string2 = ((JioAdError)object).getErrorTitle();
        object3 = new StringBuilder();
        String string4 = ((JioAdError)object).getErrorDescription();
        ((StringBuilder)object3).append(string4);
        ((StringBuilder)object3).append(": ");
        Object object5 = yc0_2.b(exception2);
        ((StringBuilder)object3).append((String)object5);
        string4 = ((StringBuilder)object3).toString();
        object5 = (com.jio.jioads.controller.f)e2.b;
        object3 = ((com.jio.jioads.controller.f)object5).a;
        com.jio.jioads.cdnlogging.a a2 = ((o)object3).T();
        String string5 = b3.q0();
        String string6 = ((JioAdError)object).getErrorCode();
        object5 = ((com.jio.jioads.controller.f)object5).a;
        boolean bl3 = ((o)object5).a();
        Boolean bl4 = bl3;
        String string7 = "initAdParams";
        utility.logError((Context)b2, string3, (com.jio.jioads.cdnlogging.d)((Object)object2), string2, string4, a2, string7, bl4, string5, string6, false);
    }

    public final void j(boolean bl2, String string2, Long l2) {
        Object object = this.d;
        TextView textView = ((f)object).A;
        if (textView != null) {
            TextView textView2 = ((f)object).w;
            int n3 = 8;
            if (textView2 != null) {
                textView2.setVisibility(n3);
            }
            object = ((f)object).C;
            if (object != null) {
                object.setVisibility(n3);
            }
            object = this.g;
            boolean bl3 = ((com.jio.jioads.videomodule.config.b)object).j ^ true;
            if (bl3) {
                n3 = 0;
            }
            textView.setVisibility(n3);
            object = Unit.a;
        } else {
            boolean bl4 = false;
            object = null;
        }
        if (object == null) {
            this.m(bl2, string2, l2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void k(AdMetaData$AdParams var1_1) {
        block25: {
            block27: {
                block26: {
                    var2_2 = this;
                    var3_3 = this.d;
                    var4_4 /* !! */  = var3_3.K;
                    if (var4_4 /* !! */  == null) break block25;
                    var5_5 /* !! */  = 0;
                    var4_4 /* !! */  = null;
                    if (var1_1 != null) {
                        var6_6 = var1_1.getIconUrl();
                    } else {
                        var7_7 = 0;
                        var6_6 = null;
                    }
                    var8_8 = 8;
                    if (var6_6 != null) break block26;
                    var6_6 = var3_3.K;
                    if (var6_6 != null) {
                        var6_6.setBackground(null);
                    }
                    var3_3 = var3_3.K;
                    if (var3_3 != null) {
                        var3_3.setVisibility(var8_8);
                    }
                    break block25;
                }
                var6_6 = new HashMap();
                var9_9 = var1_1.getIconUrl();
                if (var9_9 != null) {
                    var9_9 = StringsKt.m0((CharSequence)var9_9).toString();
                } else {
                    var10_10 = 0;
                    var9_9 = null;
                }
                var11_11 = var2_2.g;
                var12_12 = -1;
                var13_13 = var2_2.a;
                var14_14 = 1;
                if (var9_9 == null || (var10_10 = var9_9.length()) == 0) break block27;
                var15_15 = var1_1.getIconUrl();
                var9_9 = new URL((String)var15_15);
                if ((var9_9 = var9_9.getPath()) != null) {
                    var16_16 = 6;
                    var5_5 /* !! */  = StringsKt.Q((CharSequence)var9_9, '/', 0, var16_16);
                    var17_18 = '\\';
                    var16_16 = StringsKt.Q((CharSequence)var9_9, var17_18, 0, var16_16);
                    var5_5 /* !! */  = Math.max(var5_5 /* !! */ , var16_16) + var14_14;
                    var4_4 /* !! */  = var9_9.substring(var5_5 /* !! */ );
                    var9_9 = "this as java.lang.String).substring(startIndex)";
                    Intrinsics.checkNotNullExpressionValue(var4_4 /* !! */ , (String)var9_9);
                }
                var9_9 = "iconByteArray";
                if (var4_4 /* !! */  == null || (var16_16 = var4_4 /* !! */ .length()) == 0) ** GOTO lbl-1000
                var15_15 = Locale.ENGLISH;
                var18_20 = "ENGLISH";
                var19_21 = "this as java.lang.String).toLowerCase(locale)";
                var5_5 /* !! */  = (int)StringsKt.F((CharSequence)(var4_4 /* !! */  = zn0_1.a((Locale)var15_15, (String)var18_20, (String)var4_4 /* !! */ , (Locale)var15_15, var19_21)), (CharSequence)(var15_15 = ".gif"), false);
                if (var5_5 /* !! */  != 0) {
                    var20_22 = var1_1.getIconUrl();
                    var3_3 = var3_3.K;
                    var4_4 /* !! */  = new com.jio.jioads.videomodule.utility.a((String)var20_22, (View)var3_3, (boolean)var14_14);
                    var6_6.put(var9_9, var4_4 /* !! */ );
                } else lbl-1000:
                // 2 sources

                {
                    var15_15 = var13_13.Y();
                    var4_4 /* !! */  = new ImageView((Context)var15_15);
                    var15_15 = new ViewGroup.LayoutParams(var12_12, var12_12);
                    var21_24 = var3_3.K;
                    if (var21_24 != null) {
                        var21_24.removeAllViews();
                    }
                    if ((var21_24 = var3_3.K) != null) {
                        var21_24.addView((View)var4_4 /* !! */ , (ViewGroup.LayoutParams)var15_15);
                    }
                    if ((var3_3 = var3_3.K) != null) {
                        var22_25 = var11_11.j ^ var14_14;
                        if (var22_25 != 0) {
                            var8_8 = 0;
                            var20_22 = null;
                        }
                        var3_3.setVisibility(var8_8);
                    }
                    var20_22 = var1_1.getIconUrl();
                    var3_3 = new com.jio.jioads.videomodule.utility.a((String)var20_22, (View)var4_4 /* !! */ , false);
                    var6_6.put(var9_9, var3_3);
                }
                var18_20 = new Object();
                var3_3 = var6_6.keySet().iterator();
                while ((var5_5 /* !! */  = (int)var3_3.hasNext()) != 0) {
                    var4_4 /* !! */  = (String)var3_3.next();
                    var20_22 = (com.jio.jioads.videomodule.utility.a)var6_6.get(var4_4 /* !! */ );
                    if (var20_22 == null) continue;
                    Intrinsics.checkNotNull(var4_4 /* !! */ );
                    var20_22 = var20_22.a;
                    var18_20.put(var4_4 /* !! */ , var20_22);
                }
                var3_3 = var13_13.Y();
                if (var3_3 != null) {
                    var15_15 = var13_13.Y();
                    Intrinsics.checkNotNull(var15_15);
                    var23_26 = JioAds$MediaType.IMAGE;
                    var24_27 = var13_13.g();
                    var4_4 /* !! */  = new a((HashMap)var6_6, var2_2);
                    var25_28 = var24_27;
                    var19_21 = "";
                    var6_6 = new l((Context)var15_15, (HashMap)var18_20, var19_21, var23_26, false, null, null, (com.jio.jioads.utils.f)var4_4 /* !! */ , var25_28);
                    var6_6.a();
                }
                break block25;
            }
            var5_5 /* !! */  = R$drawable.jio_icon_01;
            var7_7 = R$drawable.jio_icon_02;
            var10_10 = R$drawable.jio_icon_03;
            var16_17 = R$drawable.jio_icon_04;
            var17_19 = R$drawable.jio_icon_05;
            var4_4 /* !! */  = (ViewGroup)new int[]{var5_5 /* !! */ , var7_7, var10_10, var16_17, var17_19};
            var9_9 = var13_13.Y();
            var6_6 = new ImageView((Context)var9_9);
            var9_9 = new Random();
            var26_29 = 5;
            var10_10 = var9_9.nextInt(var26_29);
            var5_5 /* !! */  = (int)var4_4 /* !! */ [var10_10];
            var6_6.setImageResource(var5_5 /* !! */ );
            var4_4 /* !! */  = ImageView.ScaleType.FIT_CENTER;
            var6_6.setScaleType((ImageView.ScaleType)var4_4 /* !! */ );
            var5_5 /* !! */  = var11_11.j ^ var14_14;
            if (var5_5 /* !! */  != 0) {
                var5_5 /* !! */  = 0;
                var4_4 /* !! */  = null;
            } else {
                var5_5 /* !! */  = 8;
            }
            var6_6.setVisibility(var5_5 /* !! */ );
            var4_4 /* !! */  = new ViewGroup.LayoutParams(var12_12, var12_12);
            var9_9 = var3_3.K;
            if (var9_9 != null) {
                var9_9.removeAllViews();
            }
            if ((var9_9 = var3_3.K) != null) {
                var9_9.addView((View)var6_6, (ViewGroup.LayoutParams)var4_4 /* !! */ );
            }
            if ((var4_4 /* !! */  = var3_3.K) != null) {
                var7_7 = var11_11.j ^ var14_14;
                if (var7_7 != 0) {
                    var7_7 = 0;
                    var6_6 = null;
                } else {
                    var7_7 = 8;
                }
                var4_4 /* !! */ .setVisibility(var7_7);
            }
            if ((var4_4 /* !! */  = var3_3.O) != null) {
                var7_7 = var11_11.j ^ var14_14;
                if (var7_7 != 0) {
                    var8_8 = 0;
                    var20_23 = null;
                }
                var4_4 /* !! */ .setVisibility(var8_8);
            }
            if ((var3_3 = var3_3.K) != null) {
                var3_3.bringToFront();
            }
        }
    }

    public final void l(boolean n3) {
        com.jio.jioads.videomodule.config.b b2 = this.g;
        boolean n4 = b2.j;
        f f5 = this.d;
        int n7 = 8;
        if (n4) {
            ProgressBar progressBar = f5.f;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.g;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.h;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.i;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.j;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.k;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.r;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.p;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.q;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.s;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.t;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.u;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.v;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
            progressBar = f5.w;
            if (progressBar != null) {
                progressBar.setVisibility(n7);
            }
        } else if (n3 != 0) {
            Boolean bl2;
            int n8;
            com.jio.jioads.videomodule.config.a a2;
            int n10;
            Object object = f5.s;
            int n14 = 1;
            if (object != null) {
                n10 = this.j ^ n14;
                if (n10 != 0) {
                    n10 = 0;
                    a2 = null;
                } else {
                    n10 = 8;
                }
                object.setVisibility(n10);
            }
            object = f5.r;
            a2 = this.f;
            if (object != null) {
                n8 = this.j;
                n8 = n8 == 0 && (n8 = (int)(a2.e ? 1 : 0)) != 0 ? 0 : 8;
                object.setVisibility(n8);
            }
            if ((object = f5.k) != null) {
                n8 = this.j ^ n14;
                n8 = n8 != 0 ? 0 : 8;
                object.setVisibility(n8);
            }
            if ((object = f5.q) != null) {
                n8 = (int)(this.j ? 1 : 0);
                n8 = n8 == 0 && (n8 = (int)(b2.d ? 1 : 0)) == 0 ? 0 : 8;
                object.setVisibility(n8);
            }
            if ((object = f5.F) != null) {
                n8 = (int)(this.j ? 1 : 0);
                if (n8 == 0 && (n10 = (int)(a2.f ? 1 : 0)) != 0) {
                    n10 = 0;
                    a2 = null;
                } else {
                    n10 = 8;
                }
                object.setVisibility(n10);
            }
            if ((n10 = (int)(j_0.r((Context)(a2 = (object = this.a).Y())) ? 1 : 0)) == 0) {
                a2 = f5.f;
                if (a2 != null) {
                    n8 = this.j ^ n14;
                    n8 = n8 != 0 ? 0 : 8;
                    a2.setVisibility(n8);
                }
                if ((a2 = f5.v) != null) {
                    n8 = this.j ^ n14;
                    n8 = n8 != 0 ? 0 : 8;
                    a2.setVisibility(n8);
                }
                if ((a2 = f5.u) != null) {
                    n8 = (int)(this.j ? 1 : 0);
                    if (n8 == 0 && (n8 = (int)(b2.g ? 1 : 0)) != 0) {
                        n7 = 0;
                        bl2 = null;
                    }
                    a2.setVisibility(n7);
                }
            }
            if ((n7 = (int)(this.j ? 1 : 0)) == 0 && (n3 = (int)(j_0.r((Context)(object = object.Y())) ? 1 : 0)) != 0) {
                object = f5.w;
                n7 = 0;
                bl2 = null;
                if (object != null) {
                    object = object.getText();
                } else {
                    n3 = 0;
                    object = null;
                }
                if (object != null) {
                    object = f5.w;
                    if (object != null) {
                        object = object.getText();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    n3 = object.length();
                    if (n3 > 0 && (n3 = (int)(b2.e ? 1 : 0)) != 0 && (object = f5.i) != null) {
                        object = f5.w;
                        if (object != null) {
                            boolean bl3;
                            n3 = object.getVisibility();
                            if (n3 != 0) {
                                bl3 = false;
                            }
                            bl2 = bl3;
                        }
                        Intrinsics.checkNotNull(bl2);
                        n3 = (int)(bl2.booleanValue() ? 1 : 0);
                        if (n3 == 0 && (object = f5.i) != null) {
                            object.setVisibility(0);
                        }
                    }
                }
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m(boolean var1_1, String var2_2, Long var3_3) {
        block74: {
            block72: {
                block73: {
                    var4_4 = this;
                    var5_5 = 500L;
                    var7_6 /* !! */  = this.g;
                    var8_9 = 8;
                    var9_10 = 1;
                    var10_11 = 0;
                    var11_12 /* !! */  = null;
                    var12_13 = this.a;
                    var13_14 = this.d;
                    if (!var1_1) ** GOTO lbl44
                    try {
                        var14_15 = var13_14.C;
                        if (var14_15 != null) {
                            var15_16 = var14_15.getContentDescription();
                            var14_15.setText(var15_16);
                        }
                        var14_15 = var13_14.C;
                        if (var14_15 == null) break block72;
                        var16_17 = var7_6 /* !! */ .j ^ var9_10;
                        if (var16_17 != 0) break block73;
                        var10_11 = 8;
                    }
                    catch (Exception var7_7) {
                        break block74;
                    }
                }
                var14_15.setVisibility(var10_11);
            }
            if ((var7_6 /* !! */  = var13_14.C) != null) {
                var17_18 /* !! */  = var12_13.Y();
                var9_10 = j_0.l(var17_18 /* !! */ );
                var7_6 /* !! */ .setFocusable((boolean)var9_10);
            }
            var7_6 /* !! */  = var13_14.C;
            if (var7_6 /* !! */  != null) {
                var17_18 /* !! */  = var12_13.Y();
                var9_10 = j_0.l(var17_18 /* !! */ );
                var7_6 /* !! */ .setFocusableInTouchMode((boolean)var9_10);
            }
            var16_17 = var4_4.h;
            if (var16_17 != 0 || (var16_17 = j_0.l((Context)(var7_6 /* !! */  = var12_13.Y()))) == 0 || (var7_6 /* !! */  = var13_14.C) == null) ** GOTO lbl-1000
            var7_6 /* !! */ .requestFocus();
lbl-1000:
            // 2 sources

            {
                if ((var7_6 /* !! */  = var12_13.K()) == (var17_18 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL) && (var16_17 = j_0.l((Context)(var7_6 /* !! */  = var12_13.Y()))) != 0) {
                    var7_6 /* !! */  = new b(var4_4);
                    s.b(var5_5, (Function0)var7_6 /* !! */ );
                }
                ** GOTO lbl275
lbl44:
                // 1 sources

                var14_15 = var13_14.w;
                if (var14_15 != null) {
                    var14_15 = var14_15.getContentDescription();
                } else {
                    var18_25 = false;
                    var14_15 = null;
                }
                var14_15 = String.valueOf(var14_15);
                var19_26 = j_0.a(var2_2);
                var20_19 /* !! */  = var13_14.w;
                if (var20_19 /* !! */  != null) {
                    var21_20 /* !! */  = var12_13.Y();
                    var22_27 = j_0.l(var21_20 /* !! */ );
                    var20_19 /* !! */ .setFocusable((boolean)var22_27);
                }
                var20_19 /* !! */  = var13_14.w;
                if (var20_19 /* !! */  != null) {
                    var21_20 /* !! */  = var12_13.Y();
                    var22_27 = j_0.l(var21_20 /* !! */ );
                    var20_19 /* !! */ .setFocusableInTouchMode((boolean)var22_27);
                }
                var20_19 /* !! */  = var13_14.w;
                if (var20_19 /* !! */  != null) {
                    var20_19 /* !! */  = var20_19 /* !! */ .getContentDescription();
                } else {
                    var23_28 = 0;
                    var24_29 = 0.0f;
                    var20_19 /* !! */  = null;
                }
                var21_20 /* !! */  = var4_4.f;
                var25_21 = "";
            }
            {
                block75: {
                    if (var20_19 /* !! */  == null || (var23_28 = j_0.l((Context)(var20_19 /* !! */  = var12_13.Y()))) != 0) ** GOTO lbl111
                    var23_28 = var14_15.length();
                    if (var23_28 <= 0) ** GOTO lbl97
                    var20_19 /* !! */  = var12_13.Y();
                    var23_28 = (int)j_0.q((Context)var20_19 /* !! */ );
                    if (var23_28 != 0 || var19_26 < 0 || (var30_34 = (cfr_temp_0 = (var26_30 = (long)var19_26) - (var28_32 = var3_3.longValue())) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) >= 0) ** GOTO lbl93
                    var31_22 = var13_14.w;
                    if (var31_22 != null) {
                        var31_22.setText((CharSequence)var14_15);
                    }
                    var14_15 = var13_14.w;
                    if (var14_15 == null) ** GOTO lbl90
                    var16_17 = var7_6 /* !! */ .j ^ var9_10;
                    if (var16_17 == 0) break block75;
                    var16_17 = 0;
                    var7_6 /* !! */  = null;
                    ** GOTO lbl-1000
                }
                var16_17 = 8;
            }
lbl-1000:
            // 2 sources

            {
                block76: {
                    var14_15.setVisibility(var16_17);
lbl90:
                    // 2 sources

                    if ((var7_6 /* !! */  = var13_14.i) != null) {
                        var7_6 /* !! */ .setVisibility(var8_9);
                    }
                    ** GOTO lbl191
lbl93:
                    // 1 sources

                    var7_6 /* !! */  = var13_14.w;
                    if (var7_6 /* !! */  != null) {
                        var7_6 /* !! */ .setVisibility(var8_9);
                    }
                    ** GOTO lbl191
lbl97:
                    // 1 sources

                    var14_15 = var13_14.w;
                    if (var14_15 != null) {
                        var14_15.setText((CharSequence)var25_21);
                    }
                    var14_15 = var13_14.w;
                    if (var14_15 == null) ** GOTO lbl191
                    var16_17 = var7_6 /* !! */ .j ^ var9_10;
                    if (var16_17 == 0) break block76;
                    var16_17 = 0;
                    var7_6 /* !! */  = null;
                    ** GOTO lbl-1000
                }
                var16_17 = 8;
            }
lbl-1000:
            // 2 sources

            {
                block78: {
                    block77: {
                        var14_15.setVisibility(var16_17);
                        ** GOTO lbl191
lbl111:
                        // 1 sources

                        var18_25 = var21_20 /* !! */ .i;
                        if (!var18_25) break block77;
                        var16_17 = var4_4.k;
                        var14_15 = "Skip Ad";
                        if (var16_17 != 0) {
                            var7_6 /* !! */  = var13_14.w;
                            if (var7_6 /* !! */  != null) {
                                var7_6 /* !! */ .setText((CharSequence)var14_15);
                            }
                            var7_6 /* !! */  = var13_14.w;
                            if (var7_6 /* !! */  != null) {
                                var7_6 /* !! */ .setVisibility(0);
                            }
                            var7_6 /* !! */  = var13_14.N;
                            if (var7_6 /* !! */  != null) {
                                var14_15 = var7_6 /* !! */ .getText();
                                if (var14_15 != null) {
                                    var14_15 = var14_15.toString();
                                } else {
                                    var18_25 = false;
                                    var14_15 = null;
                                }
                                var7_6 /* !! */ .setText((CharSequence)var14_15);
                            }
                        } else {
                            var7_6 /* !! */  = var13_14.w;
                            if (var7_6 /* !! */  != null) {
                                var7_6 /* !! */ .setText((CharSequence)var14_15);
                            }
                            var7_6 /* !! */  = var13_14.t;
                            if (var7_6 /* !! */  != null) {
                                var7_6 /* !! */ .setText((CharSequence)var14_15);
                            }
                            var7_6 /* !! */  = var13_14.t;
                            if (var7_6 /* !! */  != null) {
                                var7_6 /* !! */ .setVisibility(0);
                            }
                            var7_6 /* !! */  = var12_13.Y();
                            var16_17 = (int)j_0.l((Context)var7_6 /* !! */ );
                            if (var16_17 != 0 && (var7_6 /* !! */  = var13_14.w) != null) {
                                var7_6 /* !! */ .requestFocus();
                            }
                        }
                        ** GOTO lbl191
                    }
                    var14_15 = var13_14.w;
                    if (var14_15 != null && (var14_15 = var14_15.getContentDescription()) != null) {
                        var14_15 = var14_15.toString();
                    } else {
                        var18_25 = false;
                        var14_15 = null;
                    }
                    if (var14_15 == null || (var23_28 = var14_15.length()) <= 0) ** GOTO lbl178
                    var20_19 /* !! */  = var12_13.Y();
                    var23_28 = (int)j_0.q((Context)var20_19 /* !! */ );
                    if (var23_28 != 0 || (var30_35 = (cfr_temp_1 = (var26_31 = (long)var19_26) - (var28_33 = var3_3.longValue())) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) >= 0) ** GOTO lbl174
                    var31_22 = var13_14.w;
                    if (var31_22 != null) {
                        var31_22.setText((CharSequence)var14_15);
                    }
                    var14_15 = var13_14.w;
                    if (var14_15 == null) ** GOTO lbl171
                    var16_17 = var7_6 /* !! */ .j ^ var9_10;
                    if (var16_17 == 0) break block78;
                    var16_17 = 0;
                    var7_6 /* !! */  = null;
                    ** GOTO lbl-1000
                }
                var16_17 = 8;
            }
lbl-1000:
            // 2 sources

            {
                block79: {
                    var14_15.setVisibility(var16_17);
lbl171:
                    // 2 sources

                    if ((var7_6 /* !! */  = var13_14.i) != null) {
                        var7_6 /* !! */ .setVisibility(var8_9);
                    }
                    ** GOTO lbl191
lbl174:
                    // 1 sources

                    var7_6 /* !! */  = var13_14.w;
                    if (var7_6 /* !! */  != null) {
                        var7_6 /* !! */ .setVisibility(var8_9);
                    }
                    ** GOTO lbl191
lbl178:
                    // 1 sources

                    var14_15 = var13_14.w;
                    if (var14_15 != null) {
                        var14_15.setText((CharSequence)var25_21);
                    }
                    var14_15 = var13_14.w;
                    if (var14_15 == null) ** GOTO lbl191
                    var16_17 = var7_6 /* !! */ .j ^ var9_10;
                    if (var16_17 == 0) break block79;
                    var16_17 = 0;
                    var7_6 /* !! */  = null;
                    ** GOTO lbl-1000
                }
                var16_17 = 8;
            }
lbl-1000:
            // 2 sources

            {
                var14_15.setVisibility(var16_17);
lbl191:
                // 10 sources

                var7_6 /* !! */  = var13_14.A;
                if (var7_6 /* !! */  == null && (var7_6 /* !! */  = var13_14.x) != null) {
                    var21_20 /* !! */ .getClass();
                    var14_15 = var13_14.w;
                    if (var14_15 != null) {
                        var31_22 = var7_6 /* !! */ [0];
                        var23_28 = 1101004800;
                        var24_29 = 20.0f;
                        if (var31_22 != null) {
                            var21_20 /* !! */  = Resources.getSystem();
                            var21_20 /* !! */  = var21_20 /* !! */ .getDisplayMetrics();
                            var32_36 = TypedValue.applyDimension((int)var9_10, (float)var24_29, (DisplayMetrics)var21_20 /* !! */ );
                            var22_27 = ok1_1.b(var32_36);
                            var25_21 = Resources.getSystem();
                            var25_21 = var25_21.getDisplayMetrics();
                            var33_37 = TypedValue.applyDimension((int)var9_10, (float)var24_29, (DisplayMetrics)var25_21);
                            var34_38 = ok1_1.b(var33_37);
                            var31_22.setBounds(0, 0, var22_27, var34_38);
                        } else {
                            var19_26 = 0;
                            var31_22 = null;
                        }
                        var21_20 /* !! */  = var7_6 /* !! */ [var9_10];
                        if (var21_20 /* !! */  != null) {
                            var25_21 = Resources.getSystem();
                            var25_21 = var25_21.getDisplayMetrics();
                            var33_37 = TypedValue.applyDimension((int)var9_10, (float)var24_29, (DisplayMetrics)var25_21);
                            var34_38 = ok1_1.b(var33_37);
                            var35_23 = Resources.getSystem();
                            var35_23 = var35_23.getDisplayMetrics();
                            var36_39 = TypedValue.applyDimension((int)var9_10, (float)var24_29, (DisplayMetrics)var35_23);
                            var37_40 = ok1_1.b(var36_39);
                            var21_20 /* !! */ .setBounds(0, 0, var34_38, var37_40);
                        } else {
                            var22_27 = 0;
                            var32_36 = 0.0f;
                            var21_20 /* !! */  = null;
                        }
                        var34_38 = 2;
                        var33_37 = 2.8E-45f;
                        var25_21 = var7_6 /* !! */ [var34_38];
                        if (var25_21 != null) {
                            var35_23 = Resources.getSystem();
                            var35_23 = var35_23.getDisplayMetrics();
                            var36_39 = TypedValue.applyDimension((int)var9_10, (float)var24_29, (DisplayMetrics)var35_23);
                            var37_40 = ok1_1.b(var36_39);
                            var38_24 = Resources.getSystem();
                            var15_16 = var38_24.getDisplayMetrics();
                            var39_41 = TypedValue.applyDimension((int)var9_10, (float)var24_29, (DisplayMetrics)var15_16);
                            var40_42 = ok1_1.b(var39_41);
                            var25_21.setBounds(0, 0, var37_40, var40_42);
                        } else {
                            var34_38 = 0;
                            var33_37 = 0.0f;
                            var25_21 = null;
                        }
                        var40_42 = 3;
                        var39_41 = 4.2E-45f;
                        var7_6 /* !! */  = var7_6 /* !! */ [var40_42];
                        if (var7_6 /* !! */  != null) {
                            var15_16 = Resources.getSystem();
                            var15_16 = var15_16.getDisplayMetrics();
                            var39_41 = TypedValue.applyDimension((int)var9_10, (float)var24_29, (DisplayMetrics)var15_16);
                            var40_42 = ok1_1.b(var39_41);
                            var35_23 = Resources.getSystem();
                            var35_23 = var35_23.getDisplayMetrics();
                            var24_29 = TypedValue.applyDimension((int)var9_10, (float)var24_29, (DisplayMetrics)var35_23);
                            var23_28 = ok1_1.b(var24_29);
                            var7_6 /* !! */ .setBounds(0, 0, var40_42, var23_28);
                            var15_16 = var7_6 /* !! */ ;
                        } else {
                            var40_42 = 0;
                            var39_41 = 0.0f;
                            var15_16 = null;
                        }
                        var14_15.setCompoundDrawables((Drawable)var31_22, (Drawable)var21_20 /* !! */ , (Drawable)var25_21, (Drawable)var15_16);
                    }
                }
                if ((var7_6 /* !! */  = var13_14.w) != null) {
                    var7_6 /* !! */ .setVisibility(0);
                }
                var16_17 = (int)var4_4.k;
                if (var16_17 != 0 || (var7_6 /* !! */  = var13_14.w) == null) ** GOTO lbl-1000
                var11_12 /* !! */  = new d8(var4_4, var9_10);
                var7_6 /* !! */ .post((Runnable)var11_12 /* !! */ );
            }
lbl-1000:
            // 2 sources

            {
                if ((var7_6 /* !! */  = var12_13.K()) == (var11_12 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL) && (var7_6 /* !! */  = var13_14.w) != null) {
                    var11_12 /* !! */  = new Sk0(var4_4, var9_10);
                    var7_6 /* !! */ .post((Runnable)var11_12 /* !! */ );
                }
lbl275:
                // 4 sources

                var7_6 /* !! */  = var12_13.K();
                var17_18 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL;
                var11_12 /* !! */  = "Close";
                var14_15 = "Close Ad";
                if (var7_6 /* !! */  != var17_18 /* !! */ ) ** GOTO lbl306
            }
            {
                block81: {
                    block80: {
                        var16_17 = j_0.a(var2_2);
                        if (var16_17 <= 0) break block80;
                        var16_17 = j_0.a(var2_2);
                        var41_43 = var16_17;
                        var43_44 = var3_3;
                        cfr_temp_2 = var41_43 - var43_44;
                        if ((var16_17 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) < 0 && var2_2 != null) break block81;
                    }
                    if ((var7_6 /* !! */  = var13_14.C) == null || (var16_17 = var7_6 /* !! */ .getVisibility()) != 0) {
                        var7_6 /* !! */  = var13_14.w;
                        if (var7_6 /* !! */  != null) {
                            var7_6 /* !! */ .setText((CharSequence)var11_12 /* !! */ );
                        }
                        var7_6 /* !! */  = var13_14.t;
                        if (var7_6 /* !! */  != null) {
                            var7_6 /* !! */ .setText((CharSequence)var11_12 /* !! */ );
                        }
                        var7_6 /* !! */  = var12_13.Y();
                        var16_17 = (int)j_0.l((Context)var7_6 /* !! */ );
                        if (var16_17 != 0) {
                            var7_6 /* !! */  = var13_14.w;
                            if (var7_6 /* !! */  != null) {
                                var7_6 /* !! */ .setText((CharSequence)var14_15);
                            }
                            var7_6 /* !! */  = var13_14.t;
                            if (var7_6 /* !! */  != null) {
                                var7_6 /* !! */ .setText((CharSequence)var14_15);
                            }
                        }
                        var7_6 /* !! */  = new c(var4_4);
                        s.b(var5_5, (Function0)var7_6 /* !! */ );
                    }
                }
                if ((var16_17 = var12_13.e()) != 0 && ((var7_6 /* !! */  = var13_14.C) == null || (var16_17 = var7_6 /* !! */ .getVisibility()) != 0)) {
                    var7_6 /* !! */  = var13_14.w;
                    if (var7_6 /* !! */  != null) {
                        var7_6 /* !! */ .setText((CharSequence)var11_12 /* !! */ );
                    }
                    var7_6 /* !! */  = var12_13.Y();
                    var16_17 = (int)j_0.l((Context)var7_6 /* !! */ );
                    if (var16_17 != 0) {
                        var7_6 /* !! */  = var13_14.w;
                        if (var7_6 /* !! */  != null) {
                            var7_6 /* !! */ .setText((CharSequence)var14_15);
                        }
                        var7_6 /* !! */  = var13_14.t;
                        if (var7_6 /* !! */  != null) {
                            var7_6 /* !! */ .setText((CharSequence)var14_15);
                        }
                    }
                }
                if ((var7_6 /* !! */  = var13_14.C) == null) return;
                var16_17 = var7_6 /* !! */ .getVisibility();
                if (var16_17 != 0) return;
                var7_6 /* !! */  = var13_14.w;
                if (var7_6 /* !! */  != null) {
                    var7_6 /* !! */ .setVisibility(var8_9);
                }
                var7_6 /* !! */  = var13_14.t;
                if (var7_6 /* !! */  == null) {
                    return;
                }
                var7_6 /* !! */ .setVisibility(var8_9);
                return;
            }
        }
        var45_45 = new StringBuilder();
        var46_46 = var12_13.P();
        var45_45.append((String)var46_46);
        var45_45.append(": Exception while performSkipTimeCompletion: ");
        Intrinsics.checkNotNullParameter(var7_7, "<this>");
        com.jio.jioads.jioreel.tracker.model.b.e(var7_7, (StringBuilder)var45_45);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var45_45 = JioAds$LogLevel.NONE;
        var45_45 = JioAdError.Companion;
        var46_46 = JioAdError$JioAdErrorType.ERROR_IN_SKIP_RENDERING;
        var45_45.getClass();
        var45_45 = t_0.a((JioAdError$JioAdErrorType)var46_46);
        var13_14 = Utility.INSTANCE;
        var14_15 = var12_13.Y();
        var15_16 = var12_13.P();
        var31_22 = com.jio.jioads.cdnlogging.d.a;
        var20_19 /* !! */  = var45_45.getErrorTitle();
        var46_46 = new StringBuilder();
        var47_47 = var45_45.getErrorDescription();
        var46_46.append(var47_47);
        var47_47 = ": ";
        var46_46.append(var47_47);
        var7_8 = yc0_2.b(var7_7);
        var46_46.append((String)var7_8);
        var21_20 /* !! */  = var46_46.toString();
        var7_8 = (com.jio.jioads.controller.f)var4_4.b;
        var46_46 = var7_8.a;
        var25_21 = var46_46.T();
        var48_48 = var12_13.q0();
        var49_49 = var45_45.getErrorCode();
        var7_8 = var7_8.a;
        var16_17 = (int)var7_8.a();
        var38_24 = (boolean)var16_17;
        var35_23 = "performSkipTimeCompletion";
        var13_14.logError((Context)var14_15, (String)var15_16, var31_22, (String)var20_19 /* !! */ , (String)var21_20 /* !! */ , (com.jio.jioads.cdnlogging.a)var25_21, var35_23, var38_24, var48_48, var49_49, false);
    }

    public final void n(AdMetaData$AdParams object) {
        int n3;
        Object object2 = this.f;
        if (object == null && (n3 = ((com.jio.jioads.videomodule.config.a)object2).v) != 0) {
            return;
        }
        n3 = this.h;
        int n4 = 8;
        f f5 = this.d;
        if (n3 == 0) {
            object = f5.N;
            if (object != null) {
                object.clearFocus();
            }
            if ((object = f5.N) != null) {
                object.setVisibility(n4);
            }
            object = f5.L;
            if (object != null) {
                object.clearFocus();
            }
            if ((object = f5.L) != null) {
                object.setVisibility(n4);
            }
            return;
        }
        Object object3 = f5.L;
        if (object3 != null) {
            int n7;
            TextView textView;
            int n8;
            Object object4;
            Object object5;
            n3 = ((com.jio.jioads.videomodule.config.a)object2).k;
            int n10 = 0;
            Object object6 = null;
            if (n3 != 0) {
                if (object != null && (object3 = ((AdMetaData$AdParams)object).getVideoButtonColor()) != null) {
                    object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                if (object3 != null && (n3 = ((String)object3).length()) != 0 && (object3 = f5.L) != null) {
                    int n14;
                    if (object != null && (object5 = ((AdMetaData$AdParams)object).getVideoButtonColor()) != null) {
                        object5 = ((Object)StringsKt.m0((CharSequence)object5)).toString();
                    } else {
                        n14 = 0;
                        object5 = null;
                    }
                    n14 = Color.parseColor((String)object5);
                    object3.setBackgroundColor(n14);
                }
            }
            if (object != null && (object3 = ((AdMetaData$AdParams)object).getVideoCtaText()) != null) {
                object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
            } else {
                n3 = 0;
                object3 = null;
            }
            object5 = this.a;
            if (object3 != null && (n3 = ((String)object3).length()) != 0) {
                object3 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object5, ": CTA TEXT ");
                object4 = object != null && (object4 = ((AdMetaData$AdParams)object).getVideoCtaText()) != null ? ((Object)StringsKt.m0(object4)).toString() : null;
                String string2 = "message";
                ir3_0.b((StringBuilder)object3, object4, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object3 = f5.L;
                if (object3 != null) {
                    object4 = object != null && (object4 = ((AdMetaData$AdParams)object).getVideoCtaText()) != null ? ((Object)StringsKt.m0(object4)).toString() : null;
                    object3.setText((CharSequence)object4);
                }
                if ((object3 = f5.N) != null) {
                    object4 = object != null && (object4 = ((AdMetaData$AdParams)object).getVideoCtaText()) != null ? ((Object)StringsKt.m0(object4)).toString() : null;
                    object3.setText((CharSequence)object4);
                }
            } else {
                object3 = f5.L;
                if (object3 != null) {
                    object3 = object3.getText();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                object3 = String.valueOf(object3);
                n3 = ((String)object3).length();
                if (n3 > 0) {
                    object3 = f5.L;
                    if (object3 != null) {
                        object4 = String.valueOf(object3.getText());
                        object3.setText((CharSequence)object4);
                    }
                } else {
                    object3 = f5.L;
                    if (object3 != null) {
                        object4 = "Visit Advertiser";
                        object3.setText((CharSequence)object4);
                    }
                }
            }
            object3 = object5.K();
            object4 = JioAdView$AD_TYPE.INTERSTITIAL;
            int n15 = 1;
            if (object3 == object4 && ((object3 = object5.Y()) == null || (n3 = (int)(j_0.l((Context)object3) ? 1 : 0)) != n15)) {
                object3 = this.i;
                if (object3 != null) {
                    object3 = ((AdMetaData$AdParams)object3).getVideoCtaText();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                if ((object3 == null || (n3 = ((String)object3).length()) == 0) && (n3 = (int)(this.h ? 1 : 0)) != 0) {
                    object3 = f5.L;
                    if (object3 != null) {
                        object3 = object3.getLayoutParams();
                    } else {
                        n3 = 0;
                        object3 = null;
                    }
                    if (object3 != null) {
                        ((ViewGroup.LayoutParams)object3).width = n8 = -1;
                    }
                    textView = f5.L;
                    if (textView != null) {
                        textView.setLayoutParams((ViewGroup.LayoutParams)object3);
                    }
                }
            }
            if (object != null && (object3 = ((AdMetaData$AdParams)object).getVideoCtaColor()) != null) {
                object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
            } else {
                n3 = 0;
                object3 = null;
            }
            if (object3 != null && (n3 = ((String)object3).length()) != 0 && (object3 = object5.K()) != object4 && (object3 = f5.L) != null) {
                if (object != null && (object = ((AdMetaData$AdParams)object).getVideoCtaColor()) != null) {
                    object = ((Object)StringsKt.m0((CharSequence)object)).toString();
                } else {
                    n7 = 0;
                    object = null;
                }
                n7 = Color.parseColor((String)object);
                object3.setTextColor(n7);
            }
            object = this.g;
            object3 = ((com.jio.jioads.videomodule.config.b)object).h;
            n8 = 0;
            textView = null;
            if (object3 != null) {
                object6 = "type";
                n10 = ((String)(object3 = ((Object)StringsKt.m0(object3.optString((String)object6).toString())).toString())).length();
                if (n10 == 0 || (n10 = (int)(Intrinsics.areEqual(object3, object6 = "0") ? 1 : 0)) != 0) {
                    object3 = f5.L;
                    if (object3 != null) {
                        n10 = ((com.jio.jioads.videomodule.config.b)object).f ^ n15;
                        if (n10 != 0) {
                            n10 = 0;
                            object6 = null;
                        } else {
                            n10 = 8;
                        }
                        object3.setVisibility(n10);
                    }
                } else {
                    object6 = "1";
                    n10 = (int)(Intrinsics.areEqual(object3, object6) ? 1 : 0);
                    if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object3, object6 = "2") ? 1 : 0)) != 0 || (n3 = Intrinsics.areEqual(object3, object6 = "3")) != 0) {
                        object3 = f5.N;
                        if (object3 != null) {
                            object3.clearFocus();
                        }
                        if ((object3 = f5.N) != null) {
                            object3.setVisibility(n4);
                        }
                        object3 = f5.L;
                        if (object3 != null) {
                            object3.clearFocus();
                        }
                        if ((object3 = f5.L) != null) {
                            object3.setVisibility(n4);
                        }
                    }
                }
                object6 = Unit.a;
            }
            if (object6 == null) {
                boolean bl2;
                n3 = (int)(this.h ? 1 : 0);
                if (n3 != 0 && (n7 = ((com.jio.jioads.videomodule.config.b)object).f) == 0) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    object = null;
                }
                object3 = f5.L;
                if (object3 != null) {
                    if (n7 != 0) {
                        n4 = 0;
                    }
                    object3.setVisibility(n4);
                }
                if ((bl2 = ((com.jio.jioads.videomodule.config.a)object2).h) && n7 != 0 && (n7 = (int)(j_0.l((Context)(object = object5.Y())) ? 1 : 0)) != 0) {
                    object = f5.L;
                    if (object != null) {
                        object.setFocusable(n15 != 0);
                    }
                    object = f5.N;
                    if (object != null) {
                        object.setFocusable(n15 != 0);
                    }
                    object = f5.L;
                    if (object != null) {
                        object.setFocusableInTouchMode(n15 != 0);
                    }
                    object = f5.N;
                    if (object != null) {
                        object.setFocusableInTouchMode(n15 != 0);
                    }
                    this.k = n15;
                    object = object5.K();
                    if (object != object4 && (object = f5.L) != null) {
                        object2 = new d(this);
                        object.post((Runnable)object2);
                    }
                }
            }
        }
    }

    public final void o(AdMetaData$AdParams object) {
        int n3;
        Object object2;
        Object object3 = null;
        if (object != null) {
            object2 = ((AdMetaData$AdParams)object).getSecondaryCtaText();
        } else {
            n3 = 0;
            object2 = null;
        }
        int n4 = 8;
        f f5 = this.d;
        if (object2 != null && (n3 = object2.length()) != 0 && (object2 = f5.M) != null) {
            int n7;
            int n8;
            Object object4;
            if (object != null && (object2 = ((AdMetaData$AdParams)object).getSecondaryCtaButtonColor()) != null) {
                object2 = ((Object)StringsKt.m0(object2)).toString();
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null && (n3 = object2.length()) != 0 && (object2 = f5.M) != null) {
                if (object != null && (object4 = ((AdMetaData$AdParams)object).getSecondaryCtaButtonColor()) != null) {
                    object4 = ((Object)StringsKt.m0(object4)).toString();
                } else {
                    n8 = 0;
                    object4 = null;
                }
                n8 = Color.parseColor((String)object4);
                object4 = ColorStateList.valueOf((int)n8);
                object2.setBackgroundTintList((ColorStateList)object4);
            }
            if (object != null) {
                object2 = ((AdMetaData$AdParams)object).getSecondaryCtaText();
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 == null) {
                object2 = "";
            }
            if ((n3 = (object2 = ((Object)StringsKt.m0(object2)).toString()).length()) == 0) {
                object2 = f5.M;
                if (object2 != null) {
                    if (object != null && (object4 = ((AdMetaData$AdParams)object).getSecondaryCtaText()) != null) {
                        object4 = ((Object)StringsKt.m0(object4)).toString();
                    } else {
                        n8 = 0;
                        object4 = null;
                    }
                    object2.setText((CharSequence)object4);
                }
                if (object != null && (object2 = ((AdMetaData$AdParams)object).getSecondaryCtaTextColor()) != null) {
                    object2 = ((Object)StringsKt.m0(object2)).toString();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                if (object2 != null && (n3 = object2.length()) != 0 && (object2 = this.a.K()) != (object4 = JioAdView$AD_TYPE.INTERSTITIAL) && (object2 = f5.M) != null) {
                    if (object != null && (object = ((AdMetaData$AdParams)object).getSecondaryCtaTextColor()) != null) {
                        object = StringsKt.m0((CharSequence)object);
                        object3 = object.toString();
                    }
                    n7 = Color.parseColor((String)object3);
                    object2.setTextColor(n7);
                }
            }
            object = this.g;
            object3 = ((com.jio.jioads.videomodule.config.b)object).h;
            if (object3 != null) {
                object2 = "type";
                n3 = ((String)(object3 = ((Object)StringsKt.m0(object3.optString(object2).toString())).toString())).length();
                if (n3 == 0 || (n3 = (int)(Intrinsics.areEqual(object3, object2 = "0") ? 1 : 0)) != 0) {
                    object3 = f5.M;
                    if (object3 != null) {
                        n7 = ((com.jio.jioads.videomodule.config.b)object).f ^ 1;
                        if (n7 != 0) {
                            n4 = 0;
                        }
                        object3.setVisibility(n4);
                    }
                } else {
                    object = "1";
                    n7 = Intrinsics.areEqual(object3, object);
                    if ((n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object3, object = "2") ? 1 : 0)) != 0 || (n7 = (int)(Intrinsics.areEqual(object3, object = "3") ? 1 : 0)) != 0) && (object = f5.M) != null) {
                        object.setVisibility(n4);
                    }
                }
            }
        } else {
            object = f5.M;
            if (object != null) {
                object.setVisibility(n4);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void p(AdMetaData$AdParams object) {
        int n3;
        Object object2;
        boolean bl2 = false;
        Object object3 = null;
        if (object != null) {
            object2 = ((AdMetaData$AdParams)object).getAdTitle();
        } else {
            boolean bl3 = false;
            object2 = null;
        }
        int n4 = 8;
        f f5 = this.d;
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            if (object != null) {
                object2 = ((AdMetaData$AdParams)object).getAdTitle();
            } else {
                boolean bl4 = false;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString();
            int n7 = ((String)object2).length();
            if (n7 > 0 && (object2 = f5.I) != null) {
                String string2 = ((AdMetaData$AdParams)object).getAdTitle();
                string2 = string2 != null ? ((Object)StringsKt.m0(string2)).toString() : null;
                object2.setText((CharSequence)string2);
                object2 = ((AdMetaData$AdParams)object).getTitleTextColor();
                string2 = null;
                boolean bl5 = true;
                if (object2 != null) {
                    object2 = ((AdMetaData$AdParams)object).getTitleTextColor();
                    if (object2 != null && (object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString()) != null) {
                        void var5_12;
                        int n8 = ((String)object2).length();
                        if (n8 == 0) {
                            boolean bl6 = true;
                        } else {
                            boolean bl7 = false;
                            object2 = null;
                        }
                        object2 = (boolean)var5_12;
                    } else {
                        boolean bl8 = false;
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                    boolean bl9 = (Boolean)object2;
                    if (!bl9 && (object2 = f5.I) != null) {
                        if ((object = ((AdMetaData$AdParams)object).getTitleTextColor()) != null) {
                            object = StringsKt.m0((CharSequence)object);
                            object3 = object.toString();
                        }
                        int n10 = Color.parseColor((String)object3);
                        object2.setTextColor(n10);
                    }
                }
                object = f5.I;
                object3 = this.g;
                if (object != null) {
                    void var5_19;
                    boolean bl10 = ((com.jio.jioads.videomodule.config.b)object3).j ^ bl5;
                    if (bl10) {
                        boolean bl11 = false;
                        object2 = null;
                    } else {
                        int n14 = 8;
                    }
                    object.setVisibility((int)var5_19);
                }
                if ((object = f5.O) == null) {
                    return;
                }
                bl2 = ((com.jio.jioads.videomodule.config.b)object3).j ^ bl5;
                if (bl2) {
                    n4 = 0;
                }
                object.setVisibility(n4);
                return;
            }
        }
        if ((object = f5.I) == null) {
            return;
        }
        object.setVisibility(n4);
    }

    public final void q() {
        f f5 = this.d;
        RelativeLayout relativeLayout = f5.e;
        if (relativeLayout != null) {
            s.a((View)relativeLayout);
        }
        relativeLayout = this.e;
        f5 = f5.e;
        int n3 = -1;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(n3, n3);
        relativeLayout.addView((View)f5, layoutParams);
    }

    public final com.jio.jioads.videomodule.player.o r() {
        return this.c.c.X;
    }

    public final void s() {
        String string2;
        Object object;
        boolean bl2 = true;
        Object object2 = this.d;
        ProgressBar progressBar = ((f)object2).g;
        int n3 = 8;
        if (progressBar != null) {
            progressBar.setVisibility(n3);
        }
        object2 = ((f)object2).D;
        progressBar = null;
        View view = null;
        if (object2 != null) {
            int n4;
            int n7 = 0;
            Object object3 = null;
            while ((n4 = n7 < (n4 = object2.getChildCount()) ? 1 : 0) != 0) {
                n4 = n7 + 1;
                object3 = object2.getChildAt(n7);
                if (object3 != null) {
                    boolean bl3;
                    com.jio.jioads.videomodule.player.o o3 = this.r();
                    if (o3 != null) {
                        o3 = o3.g();
                    } else {
                        bl3 = false;
                        o3 = null;
                    }
                    bl3 = Intrinsics.areEqual(object3, o3);
                    if (!bl3) {
                        object3.setVisibility(n3);
                    }
                    n7 = n4;
                    continue;
                }
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
                throw indexOutOfBoundsException;
            }
            object = this.r();
            if (object != null && (object = object.g()) != null) {
                object = object.getParent();
            } else {
                bl2 = false;
                object = null;
            }
            bl2 = Intrinsics.areEqual(object, object2);
            if (!bl2) {
                object = this.r();
                if (object != null && (object = object.g()) != null) {
                    s.a((View)object);
                }
                if ((object = this.r()) != null) {
                    object = object.g();
                } else {
                    bl2 = false;
                    object = null;
                }
                n7 = -1;
                string2 = new RelativeLayout.LayoutParams(n7, n7);
                n7 = 13;
                string2.addRule(n7);
                object3 = Unit.a;
                object2.addView((View)object, (ViewGroup.LayoutParams)string2);
            }
            object2.setVisibility(0);
        }
        object = new StringBuilder();
        object2 = this.a;
        string2 = ": JioVideoRenderer Value an isCurrentAdMediation is: ";
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object, string2);
        boolean bl4 = this.g.j;
        ((StringBuilder)object).append(bl4);
        object = ((StringBuilder)object).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.l(false);
        object = this.r();
        if (object != null) {
            view = object.g();
        }
        if (view != null) {
            view.setVisibility(0);
        }
        object = this.r();
        if (object != null && (object = object.g()) != null) {
            object.bringToFront();
        }
        this.d(0L);
    }

    public final void t() {
        f f5 = this.d;
        TextView textView = f5.t;
        if (textView != null) {
            textView.clearFocus();
        }
        textView = f5.t;
        int n3 = 8;
        if (textView != null) {
            textView.setVisibility(n3);
        }
        textView = f5.w;
        if (textView != null) {
            textView.clearFocus();
        }
        if ((textView = f5.w) != null) {
            textView.setVisibility(n3);
        }
        textView = f5.N;
        if (textView != null) {
            textView.clearFocus();
        }
        if ((textView = f5.N) != null) {
            textView.setVisibility(n3);
        }
        textView = f5.L;
        if (textView != null) {
            textView.clearFocus();
        }
        if ((textView = f5.L) != null) {
            textView.setVisibility(n3);
        }
        textView = f5.M;
        if (textView != null) {
            textView.clearFocus();
        }
        if ((f5 = f5.M) != null) {
            f5.setVisibility(n3);
        }
    }

    public final void u() {
        com.jio.jioads.videomodule.config.b b2 = this.g;
        boolean bl2 = b2.j;
        int n3 = 8;
        f f5 = this.d;
        if (bl2) {
            b2 = f5.L;
            if (b2 != null) {
                b2.setVisibility(n3);
            }
            b2 = f5.N;
            if (b2 != null) {
                b2.setVisibility(n3);
            }
            b2 = f5.M;
            if (b2 != null) {
                b2.setVisibility(n3);
            }
        } else {
            int n4;
            TextView textView = f5.L;
            if (textView != null) {
                n4 = b2.f ^ 1;
                n4 = n4 != 0 ? 0 : 8;
                textView.setVisibility(n4);
            }
            if ((textView = f5.N) != null) {
                n4 = b2.f ^ 1;
                n4 = n4 != 0 ? 0 : 8;
                textView.setVisibility(n4);
            }
            if ((textView = f5.M) != null) {
                boolean bl3 = b2.f ^ true;
                if (bl3) {
                    n3 = 0;
                }
                textView.setVisibility(n3);
            }
        }
    }
}

