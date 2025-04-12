/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.instream.video.vodVmap;

import android.content.Context;
import com.jio.jioads.R$layout;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$VideoAdType;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.instream.video.vodVmap.m;
import com.jio.jioads.videomodule.s;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class h
extends Lambda
implements Function0 {
    public final /* synthetic */ m c;
    public final /* synthetic */ Ref$ObjectRef d;

    public h(m m2, Ref$ObjectRef ref$ObjectRef) {
        this.c = m2;
        this.d = ref$ObjectRef;
        super(0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke() {
        block22: {
            block25: {
                block24: {
                    block23: {
                        var1_1 = this.c;
                        var2_2 /* !! */  = var1_1.r;
                        if (var2_2 /* !! */  != null) break block22;
                        var2_2 /* !! */  = var1_1.a;
                        var3_3 = var2_2 /* !! */ .I();
                        var4_4 = -1;
                        if (var3_3 != null && (var5_5 = var3_3.intValue()) != var4_4) {
                            var6_6 = var3_3.intValue();
lbl9:
                            // 3 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var3_3 = (Context)this.d.element;
                        var6_6 = j_0.l((Context)var3_3);
                        if (var6_6 == 0) break block23;
                        var6_6 = R$layout.jio_instream_stb_layout;
                        ** GOTO lbl9
                    }
                    var6_6 = R$layout.jio_instream_layout;
                    ** while (true)
                    var7_7 = var6_6;
                    var8_8 /* !! */  = var1_1.p;
                    if (var8_8 /* !! */  == null) break block24;
                    var3_3 = var1_1.s;
                    if (var3_3 == null) {
                        var3_3 = new HashMap();
                    }
                    var9_9 /* !! */  = "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String?, kotlin.String?> }";
                    Intrinsics.checkNotNull(var3_3, (String)var9_9 /* !! */ );
                    var10_10 /* !! */  = var3_3;
                    var10_10 /* !! */  = var3_3;
                    var3_3 = var2_2 /* !! */ .n0();
                    var11_11 = 1;
                    var6_6 = var3_3 != null ? (int)var3_3.booleanValue() : 1;
                    var12_12 = false;
                    var13_13 = var1_1.c;
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var3_3 = var13_13.a;
                    var6_6 = (int)var3_3.u;
                    if (var6_6 != 0) {
                        var14_14 = true;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var14_14 = false;
                        var15_15 = null;
                    }
                    var16_16 = var1_1.a;
                    var17_17 = var1_1.d;
                    var9_9 /* !! */  = var3_3;
                    var3_3 = new s(var10_10 /* !! */ , (com.jio.jioads.instreamads.vastparser.model.m)var8_8 /* !! */ , var7_7, var14_14, (b)var16_16, var13_13, var17_17);
                    var3_3.z = var9_9 /* !! */  = var1_1.y;
                    var9_9 /* !! */  = var2_2 /* !! */ .k0();
                    var10_10 /* !! */  = JioAdView$AdState.DESTROYED;
                    if (var9_9 /* !! */  != var10_10 /* !! */ ) {
                        var9_9 /* !! */  = var2_2 /* !! */ .Y();
                        var10_10 /* !! */  = "<this>";
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().getClass();
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().a = var11_11;
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var8_8 /* !! */  = var3_3.g0();
                        var8_8 /* !! */ .getClass();
                        var18_18 = j_0.l((Context)var9_9 /* !! */ ) ^ var11_11;
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var19_19 = var3_3.g0();
                        var19_19.c = var18_18;
                        var18_18 = j_0.l((Context)var9_9 /* !! */ );
                        var18_18 = var18_18 != 0 ? j_0.r((Context)var9_9 /* !! */ ) : 1;
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().d = var18_18;
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().b = var11_11;
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().getClass();
                        var18_18 = j_0.l((Context)var9_9 /* !! */ ) ^ var11_11;
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().e = var18_18;
                        var18_18 = j_0.l((Context)var9_9 /* !! */ ) ^ var11_11;
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().f = var18_18;
                        var18_18 = j_0.r((Context)var9_9 /* !! */ );
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var19_19 = var3_3.g0();
                        var19_19.g = var18_18;
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().getClass();
                        var8_8 /* !! */  = var2_2 /* !! */ .I();
                        if (var8_8 /* !! */  != null && (var18_18 = var8_8 /* !! */ .intValue()) != var4_4) {
                            var4_4 = 0;
                            var20_20 /* !! */  = null;
                        } else {
                            var4_4 = 1;
                        }
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().h = var4_4;
                        var20_20 /* !! */  = var2_2 /* !! */ .L();
                        var8_8 /* !! */  = JioAdView$AdPodVariant.NONE;
                        if ((var20_20 /* !! */  == var8_8 /* !! */  || (var20_20 /* !! */  = var2_2 /* !! */ .E()) == (var8_8 /* !! */  = JioAdView$VideoAdType.VOD)) && (var20_20 /* !! */  = var2_2 /* !! */ .L()) != (var8_8 /* !! */  = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP)) {
                            var4_4 = 1;
                        } else {
                            var4_4 = 0;
                            var20_20 /* !! */  = null;
                        }
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().j = var4_4;
                        var20_20 /* !! */  = var2_2 /* !! */ .E();
                        var8_8 /* !! */  = JioAdView$VideoAdType.VOD;
                        if (var20_20 /* !! */  == var8_8 /* !! */ ) {
                            var4_4 = 1;
                        } else {
                            var4_4 = 0;
                            var20_20 /* !! */  = null;
                        }
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().m = var4_4;
                        var4_4 = 4;
                        var8_8 /* !! */  = var4_4;
                        var19_19 = "com.jio.media.stb.ondemand.patchwall";
                        var18_18 = (int)j_0.m((Context)var9_9 /* !! */ , (String)var19_19, (Integer)var8_8 /* !! */ );
                        var15_15 = "com.yupptv.androidtv";
                        if (var18_18 == 0 && (var18_18 = (int)j_0.m((Context)var9_9 /* !! */ , var15_15, (Integer)(var8_8 /* !! */  = Integer.valueOf(var4_4)))) == 0) {
                            var18_18 = 1;
                        } else {
                            var18_18 = 0;
                            var8_8 /* !! */  = null;
                        }
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var16_16 = var3_3.g0();
                        var16_16.k = var18_18;
                        var8_8 /* !! */  = var4_4;
                        var18_18 = (int)j_0.m((Context)var9_9 /* !! */ , (String)var19_19, (Integer)var8_8 /* !! */ );
                        if (var18_18 == 0) {
                            var8_8 /* !! */  = var4_4;
                            j_0.m((Context)var9_9 /* !! */ , var15_15, (Integer)var8_8 /* !! */ );
                        }
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().getClass();
                        var8_8 /* !! */  = var4_4;
                        var18_18 = (int)j_0.m((Context)var9_9 /* !! */ , (String)var19_19, (Integer)var8_8 /* !! */ );
                        if (var18_18 == 0 && (var4_4 = (int)j_0.m((Context)var9_9 /* !! */ , var15_15, (Integer)(var20_20 /* !! */  = Integer.valueOf(var4_4)))) == 0) {
                            var4_4 = 0;
                            var20_20 /* !! */  = null;
                        } else {
                            var4_4 = 1;
                        }
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().i = var4_4;
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().l = var11_11;
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().n = var11_11;
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().p = var11_11;
                        var20_20 /* !! */  = var2_2 /* !! */ .L();
                        var9_9 /* !! */  = JioAdView$AdPodVariant.DEFAULT_ADPOD;
                        if (var20_20 /* !! */  != var9_9 /* !! */  && (var20_20 /* !! */  = var2_2 /* !! */ .L()) != (var9_9 /* !! */  = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP)) {
                            var4_4 = 0;
                            var20_20 /* !! */  = null;
                        } else {
                            var4_4 = 1;
                        }
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var9_9 /* !! */  = var3_3.g0();
                        var9_9 /* !! */ .q = var4_4;
                        var2_2 /* !! */  = var2_2 /* !! */ .L();
                        var20_20 /* !! */  = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP;
                        if (var2_2 /* !! */  == var20_20 /* !! */ ) {
                            var2_2 /* !! */  = var13_13.a;
                            var21_21 = var2_2 /* !! */ .o;
                            if (var21_21) {
                                var12_12 = true;
                            }
                        }
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var3_3.g0().r = var12_12;
                        Intrinsics.checkNotNullParameter(var3_3, var10_10 /* !! */ );
                        var2_2 /* !! */  = var3_3.g0();
                        var2_2 /* !! */ .s = var11_11;
                    }
                    break block25;
                }
                var6_6 = 0;
                var3_3 = null;
            }
            var1_1.r = var3_3;
            if (var3_3 != null) {
                var3_3.h();
            }
        }
        return Unit.a;
    }
}

