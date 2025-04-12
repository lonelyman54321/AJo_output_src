/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.jio.jioads.multiad;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.multiad.model.a;
import com.jio.jioads.multiad.model.f;
import com.jio.jioads.multiad.z;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.c;
import com.jio.jioads.util.j;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class u
implements NetworkTaskListener {
    public final /* synthetic */ z a;
    public final /* synthetic */ a b;
    public final /* synthetic */ f c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ HashMap e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ JSONObject h;
    public final /* synthetic */ String i;
    public final /* synthetic */ ArrayList j;

    public u(z z5, a a2, f f5, HashMap hashMap, HashMap hashMap2, ArrayList arrayList, ArrayList arrayList2, JSONObject jSONObject, String string2, ArrayList arrayList3) {
        this.a = z5;
        this.b = a2;
        this.c = f5;
        this.d = hashMap;
        this.e = hashMap2;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = jSONObject;
        this.i = string2;
        this.j = arrayList3;
    }

    public final void onError(int n3, Object object, Map object2) {
        Object object3 = this.a;
        object2 = ((z)object3).F;
        if (object2 != null) {
            ((c)object2).a();
        }
        object2 = null;
        ((z)object3).F = null;
        Object object4 = new StringBuilder();
        object3 = ((z)object3).o;
        object3 = object3 != null ? object3.P() : null;
        ((StringBuilder)object4).append((String)object3);
        ((StringBuilder)object4).append(": status url responded with error for ");
        object3 = this.b;
        Object object5 = ((a)object3).a;
        ((StringBuilder)object4).append((String)object5);
        ((StringBuilder)object4).append(" in campaign ");
        object5 = this.c.a;
        ((StringBuilder)object4).append((String)object5);
        object5 = ": skipping it. error response: ";
        ((StringBuilder)object4).append((String)object5);
        if (object != null) {
            object2 = object.toString();
        }
        ir3_0.b((StringBuilder)object4, (String)object2, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object3 = ((a)object3).a;
        TypeIntrinsics.asMutableCollection(this.j).remove(object3);
        JSONObject jSONObject = this.h;
        String string2 = this.i;
        object4 = this.a;
        object5 = this.j;
        HashMap hashMap = this.d;
        HashMap hashMap2 = this.e;
        f f5 = this.c;
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = this.g;
        ((z)object4).n((ArrayList)object5, hashMap, hashMap2, f5, arrayList, arrayList2, jSONObject, string2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSuccess(String var1_1, Map var2_2) {
        block117: {
            block118: {
                block119: {
                    block110: {
                        block121: {
                            block135: {
                                block134: {
                                    block133: {
                                        block122: {
                                            block132: {
                                                block131: {
                                                    block123: {
                                                        block116: {
                                                            block115: {
                                                                block114: {
                                                                    block130: {
                                                                        block124: {
                                                                            block129: {
                                                                                block113: {
                                                                                    block112: {
                                                                                        block128: {
                                                                                            block127: {
                                                                                                block126: {
                                                                                                    block125: {
                                                                                                        block120: {
                                                                                                            block111: {
                                                                                                                var3_3 = this;
                                                                                                                var4_4 = this.a;
                                                                                                                var5_5 = var4_4.F;
                                                                                                                if (var5_5 != null) {
                                                                                                                    var5_5.a();
                                                                                                                }
                                                                                                                var6_8 = null;
                                                                                                                var4_4.F = null;
                                                                                                                var5_5 = var4_4.o;
                                                                                                                if (var5_5 != null) {
                                                                                                                    var5_5 = var5_5.k0();
                                                                                                                } else {
                                                                                                                    var7_9 = 0;
                                                                                                                    var5_5 = null;
                                                                                                                }
                                                                                                                var8_10 = JioAdView$AdState.DESTROYED;
                                                                                                                if (var5_5 == var8_10) return;
                                                                                                                var7_9 = TextUtils.isEmpty((CharSequence)var1_1);
                                                                                                                var9_11 = var3_3.j;
                                                                                                                var10_12 = ": skipping it";
                                                                                                                var11_13 = var3_3.c;
                                                                                                                var12_14 = var3_3.b;
                                                                                                                var13_15 = " in campaign ";
                                                                                                                if (var7_9 != 0) break block117;
                                                                                                                Intrinsics.checkNotNull(var1_1);
                                                                                                                var14_16 /* !! */  = var1_1;
                                                                                                                var5_5 = new JSONObject((String)var1_1);
                                                                                                                var14_16 /* !! */  = "instructions";
                                                                                                                var15_18 = var5_5.has((String)var14_16 /* !! */ );
                                                                                                                if (var15_18 == 0) break block118;
                                                                                                                var5_5 = var5_5.getJSONArray((String)var14_16 /* !! */ );
                                                                                                                Intrinsics.checkNotNullExpressionValue(var5_5, "getJSONArray(...)");
                                                                                                                var5_5 = var5_5.toString();
                                                                                                                Intrinsics.checkNotNullExpressionValue(var5_5, "toString(...)");
                                                                                                                var9_11 = new StringBuilder();
                                                                                                                var14_16 /* !! */  = var4_4.o;
                                                                                                                if (var14_16 /* !! */  != null) {
                                                                                                                    var14_16 /* !! */  = var14_16 /* !! */ .P();
                                                                                                                } else {
                                                                                                                    var16_19 = 0;
                                                                                                                    var14_16 /* !! */  = null;
                                                                                                                }
                                                                                                                var9_11.append((String)var14_16 /* !! */ );
                                                                                                                var9_11.append(": instruction for ");
                                                                                                                var14_16 /* !! */  = var12_14.a;
                                                                                                                var9_11.append((String)var14_16 /* !! */ );
                                                                                                                var9_11.append(" in ");
                                                                                                                var17_20 = var3_3.i;
                                                                                                                var9_11.append(var17_20);
                                                                                                                var14_16 /* !! */  = " is: ";
                                                                                                                var9_11.append((String)var14_16 /* !! */ );
                                                                                                                var9_11.append((String)var5_5);
                                                                                                                com.jio.jioads.util.j.a(var9_11.toString());
                                                                                                                var9_11 = var4_4.o;
                                                                                                                if (var9_11 != null) {
                                                                                                                    var9_11 = var9_11.k0();
                                                                                                                } else {
                                                                                                                    var18_21 = 0;
                                                                                                                    var9_11 = null;
                                                                                                                }
                                                                                                                if (var9_11 == var8_10) {
                                                                                                                    var5_5 = new StringBuilder();
                                                                                                                    var9_11 = var4_4.d();
                                                                                                                    var5_5.append((String)var9_11);
                                                                                                                    var9_11 = ": JioAdView state is destroyed so returning from proceedAfterValidation()";
                                                                                                                    var5_5.append((String)var9_11);
                                                                                                                    var5_5 = var5_5.toString();
                                                                                                                    com.jio.jioads.util.j.a((String)var5_5);
                                                                                                                    return;
                                                                                                                }
                                                                                                                var18_21 = TextUtils.isEmpty((CharSequence)var5_5);
                                                                                                                var19_22 = var3_3.d;
                                                                                                                var20_25 = var3_3.e;
                                                                                                                var21_28 /* !! */  = var3_3.f;
                                                                                                                var22_31 /* !! */  = var3_3.g;
                                                                                                                var14_16 /* !! */  = var3_3.h;
                                                                                                                if (var18_21 != 0) break block119;
                                                                                                                var9_11 = new JSONArray((String)var5_5);
                                                                                                                var7_9 = var9_11.length();
                                                                                                                var23_34 = 0;
                                                                                                                var10_12 = null;
                                                                                                                if (var7_9 > 0) {
                                                                                                                    var5_5 = var9_11.getJSONObject(0);
                                                                                                                    Intrinsics.checkNotNullExpressionValue(var5_5, "getJSONObject(...)");
                                                                                                                    var9_11 = "action";
                                                                                                                    var24_35 = var5_5.has((String)var9_11);
                                                                                                                    if (var24_35) {
                                                                                                                        var9_11 = var5_5.getString((String)var9_11);
                                                                                                                    } else {
                                                                                                                        var18_21 = 0;
                                                                                                                        var9_11 = null;
                                                                                                                    }
                                                                                                                    var10_12 = "expiry";
                                                                                                                    var24_35 = var5_5.has((String)var10_12);
                                                                                                                    if (var24_35) {
                                                                                                                        var5_5 = var5_5.getString((String)var10_12);
                                                                                                                    } else {
                                                                                                                        var7_9 = 0;
                                                                                                                        var5_5 = null;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var7_9 = 0;
                                                                                                                    var5_5 = null;
                                                                                                                    var18_21 = 0;
                                                                                                                    var9_11 = null;
                                                                                                                }
                                                                                                                if (var9_11 != null) {
                                                                                                                    var10_12 = Locale.getDefault();
                                                                                                                    var6_8 = "getDefault(...)";
                                                                                                                    Intrinsics.checkNotNullExpressionValue(var10_12, (String)var6_8);
                                                                                                                    var9_11 = var9_11.toUpperCase((Locale)var10_12);
                                                                                                                    var10_12 = "this as java.lang.String).toUpperCase(locale)";
                                                                                                                    Intrinsics.checkNotNullExpressionValue(var9_11, (String)var10_12);
                                                                                                                } else {
                                                                                                                    var18_21 = 0;
                                                                                                                    var9_11 = null;
                                                                                                                }
                                                                                                                var10_12 = var4_4.o;
                                                                                                                if (var10_12 == null) break block120;
                                                                                                                var6_8 = var10_12.Y();
                                                                                                                if (var6_8 == null) {
                                                                                                                    return;
                                                                                                                }
                                                                                                                var10_12 = ": skipping ad: ";
                                                                                                                if (var9_11 == null) break block121;
                                                                                                                var25_36 = var10_12;
                                                                                                                var23_34 = var9_11.hashCode();
                                                                                                                var26_37 = var14_16 /* !! */ ;
                                                                                                                var16_19 = 2173;
                                                                                                                var27_39 = var20_25;
                                                                                                                var20_25 = "total expired ad ";
                                                                                                                var28_40 = var4_4.l;
                                                                                                                if (var23_34 == var16_19) break block122;
                                                                                                                var16_19 = 2175;
                                                                                                                if (var23_34 == var16_19) break block123;
                                                                                                                var16_19 = 2638;
                                                                                                                var29_41 = var19_22;
                                                                                                                var19_22 = "message";
                                                                                                                if (var23_34 == var16_19) break block124;
                                                                                                                var16_19 = 2640;
                                                                                                                if (var23_34 == var16_19) break block125;
                                                                                                                var7_9 = 1818912567;
                                                                                                                if (var23_34 != var7_9) lbl-1000:
                                                                                                                // 2 sources

                                                                                                                {
                                                                                                                    while (true) {
                                                                                                                        var6_8 = var21_28 /* !! */ ;
                                                                                                                        var14_16 /* !! */  = var13_15;
                                                                                                                        var13_15 = var25_36;
                                                                                                                        var8_10 = var27_39;
                                                                                                                        var3_3 = var29_41;
lbl150:
                                                                                                                        // 3 sources

                                                                                                                        while (true) {
                                                                                                                            var30_42 = var11_13;
                                                                                                                            var11_13 = var22_31 /* !! */ ;
                                                                                                                            var22_31 /* !! */  = var30_42;
                                                                                                                            break block110;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                ** while ((var7_9 = (int)var9_11.equals((Object)(var5_5 = "NOACTION"))) == 0)
lbl156:
                                                                                                                // 1 sources

                                                                                                                var33_47 = var4_4.h;
                                                                                                                var31_45 = -1;
                                                                                                                cfr_temp_0 = var33_47 - var31_45;
                                                                                                                var16_19 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                                                                                if (var16_19 <= 0 && (var16_19 = (int)((cfr_temp_1 = var33_47 - (var31_45 = (long)-100)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) != 0 && (var7_9 = var4_4.i) <= 0 && var7_9 != (var28_40 = -100)) {
                                                                                                                    var5_5 = var12_14.e;
                                                                                                                    if (var5_5 != null && (var5_5 = var5_5.b) != null) {
                                                                                                                        var3_3 = "1";
                                                                                                                        var7_9 = (int)Intrinsics.areEqual(var5_5, var3_3);
                                                                                                                    } else {
                                                                                                                        var7_9 = 0;
                                                                                                                        var5_5 = null;
                                                                                                                    }
                                                                                                                    if (var7_9 == 0) lbl-1000:
                                                                                                                    // 2 sources

                                                                                                                    {
                                                                                                                        while (true) {
                                                                                                                            var19_22 = var22_31 /* !! */ ;
                                                                                                                            var8_10 = var21_28 /* !! */ ;
                                                                                                                            break block111;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                ** while ((var7_9 = (int)TextUtils.isEmpty((CharSequence)(var5_5 = var11_13.a))) != 0 || (var7_9 = (int)TextUtils.isEmpty((CharSequence)(var5_5 = var12_14.a))) != 0)
lbl174:
                                                                                                                // 1 sources

                                                                                                                var14_16 /* !! */  = var4_4.d();
                                                                                                                var5_5 = var11_13.a;
                                                                                                                Intrinsics.checkNotNull(var5_5);
                                                                                                                var3_3 = var12_14.a;
                                                                                                                Intrinsics.checkNotNull(var3_3);
                                                                                                                var18_21 = (int)var4_4.u;
                                                                                                                if (var18_21 == 0) ** GOTO lbl-1000
                                                                                                                var9_11 = var11_13.b;
                                                                                                                if (var9_11 != null) {
                                                                                                                    var10_12 = var9_11.c;
                                                                                                                } else {
                                                                                                                    var23_34 = 0;
                                                                                                                    var10_12 = null;
                                                                                                                }
                                                                                                                if (var10_12 != null) {
                                                                                                                    if (var9_11 != null) {
                                                                                                                        var9_11 = var9_11.c;
                                                                                                                    } else {
                                                                                                                        var18_21 = 0;
                                                                                                                        var9_11 = null;
                                                                                                                    }
                                                                                                                    Intrinsics.checkNotNull(var9_11);
                                                                                                                    var23_34 = var18_21 = var9_11.intValue();
                                                                                                                } else lbl-1000:
                                                                                                                // 2 sources

                                                                                                                {
                                                                                                                    var23_34 = 0;
                                                                                                                    var10_12 = null;
                                                                                                                }
                                                                                                                var9_11 = new StringBuilder();
                                                                                                                var20_25 = var4_4.o;
                                                                                                                if (var20_25 != null) {
                                                                                                                    var20_25 = var20_25.P();
                                                                                                                } else {
                                                                                                                    var35_49 = false;
                                                                                                                    var20_25 = null;
                                                                                                                }
                                                                                                                var9_11.append((String)var20_25);
                                                                                                                var9_11.append(": storing selected campaign ACI value: ");
                                                                                                                var9_11.append(var23_34);
                                                                                                                Intrinsics.checkNotNullParameter(var9_11.toString(), (String)var19_22);
                                                                                                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                                var9_11 = JioAds$LogLevel.NONE;
                                                                                                                var9_11 = var4_4;
                                                                                                                var19_22 = var22_31 /* !! */ ;
                                                                                                                var22_31 /* !! */  = var5_5;
                                                                                                                var8_10 = var21_28 /* !! */ ;
                                                                                                                var21_28 /* !! */  = var3_3;
                                                                                                                var20_25 = var17_20;
                                                                                                                var4_4.e(var23_34, (String)var14_16 /* !! */ , (String)var5_5, (String)var3_3, var17_20);
                                                                                                            }
                                                                                                            var5_5 = new StringBuilder();
                                                                                                            var3_3 = var4_4.o;
                                                                                                            if (var3_3 != null) {
                                                                                                                var3_3 = var3_3.P();
                                                                                                            } else {
                                                                                                                var28_40 = 0;
                                                                                                                var3_3 = null;
                                                                                                            }
                                                                                                            var5_5.append((String)var3_3);
                                                                                                            var5_5.append(": selected ad: ");
                                                                                                            var3_3 = var12_14.a;
                                                                                                            var5_5.append((String)var3_3);
                                                                                                            var5_5.append((String)var13_15);
                                                                                                            var3_3 = var11_13.a;
                                                                                                            var5_5.append((String)var3_3);
                                                                                                            com.jio.jioads.util.j.a(var5_5.toString());
                                                                                                            var5_5 = var4_4.w;
                                                                                                            if (var5_5 != null && (var7_9 = (int)var5_5.isEmpty()) == 0) {
                                                                                                                var23_34 = 0;
                                                                                                                var10_12 = null;
                                                                                                            } else {
                                                                                                                var23_34 = 1;
                                                                                                            }
                                                                                                            if (var23_34 == 0) {
                                                                                                                var5_5 = var4_4.w;
                                                                                                                Intrinsics.checkNotNull(var5_5);
                                                                                                                var5_5 = var5_5.iterator();
                                                                                                                while ((var28_40 = (int)var5_5.hasNext()) != 0) {
                                                                                                                    var3_3 = (String)var5_5.next();
                                                                                                                    var18_21 = (int)var8_10.contains(var3_3);
                                                                                                                    if (var18_21 == 0) continue;
                                                                                                                    var8_10.remove(var3_3);
                                                                                                                }
                                                                                                            }
                                                                                                            if ((var5_5 = var4_4.w) != null) {
                                                                                                                var5_5.clear();
                                                                                                            }
                                                                                                            var36_54 = false;
                                                                                                            var21_28 /* !! */  = null;
                                                                                                            var4_4.h(var12_14, (f)var11_13, null, (ArrayList)var19_22);
                                                                                                        }
lbl266:
                                                                                                        // 13 sources

                                                                                                        while (true) {
                                                                                                            var3_3 = this;
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                    var14_16 /* !! */  = var22_31 /* !! */ ;
                                                                                                    var22_31 /* !! */  = var21_28 /* !! */ ;
                                                                                                    var36_55 = 0;
                                                                                                    var21_28 /* !! */  = null;
                                                                                                    var10_12 = "SC";
                                                                                                    var23_34 = (int)var9_11.equals(var10_12);
                                                                                                    if (var23_34 != 0) break block126;
                                                                                                    var6_8 = var22_31 /* !! */ ;
                                                                                                    var22_31 /* !! */  = var11_13;
                                                                                                    var8_10 = var27_39;
                                                                                                    var3_3 = var29_41;
                                                                                                    var11_13 = var14_16 /* !! */ ;
                                                                                                    var14_16 /* !! */  = var13_15;
                                                                                                    var13_15 = var25_36;
                                                                                                    break block110;
                                                                                                }
                                                                                                var9_11 = var11_13.a;
                                                                                                Intrinsics.checkNotNull(var9_11);
                                                                                                var22_31 /* !! */ .add(var9_11);
                                                                                                var9_11 = var4_4.q;
                                                                                                if (var9_11 != null) {
                                                                                                    Intrinsics.checkNotNull(var9_11);
                                                                                                    var10_12 = var4_4.q;
                                                                                                    Intrinsics.checkNotNull(var10_12);
                                                                                                    var10_12 = var10_12.a;
                                                                                                    var23_34 = var10_12.l;
                                                                                                    var13_15 = var11_13.d;
                                                                                                    if (var13_15 != null) {
                                                                                                        var37_59 = var13_15.size();
                                                                                                    } else {
                                                                                                        var37_59 = 0;
                                                                                                        var13_15 = null;
                                                                                                    }
                                                                                                    var9_11.a.l = var23_34 += var37_59;
                                                                                                    var9_11 = new StringBuilder((String)var20_25);
                                                                                                    var10_12 = var4_4.q;
                                                                                                    if (var10_12 != null) {
                                                                                                        var23_34 = var10_12.a.l;
                                                                                                        var10_12 = var23_34;
                                                                                                    } else {
                                                                                                        var23_34 = 0;
                                                                                                        var10_12 = null;
                                                                                                    }
                                                                                                    var9_11.append(var10_12);
                                                                                                    var9_11 = var9_11.toString();
                                                                                                    com.jio.jioads.util.j.a((String)var9_11);
                                                                                                }
                                                                                                if (var28_40 == 0) break block127;
                                                                                                var3_3 = var12_14.a;
                                                                                                Intrinsics.checkNotNull(var3_3);
                                                                                                var4_4.k((String)var3_3);
                                                                                                var3_3 = var4_4.o;
                                                                                                if (var3_3 != null) {
                                                                                                    var3_3 = var3_3.k0();
                                                                                                } else {
                                                                                                    var28_40 = 0;
                                                                                                    var3_3 = null;
                                                                                                }
                                                                                                if (var3_3 == var8_10) ** GOTO lbl266
                                                                                                var3_3 = var4_4.o;
                                                                                                if (var3_3 != null && (var3_3 = var3_3.P()) != null) {
                                                                                                    var20_25 = var11_13.a;
                                                                                                    var37_59 = (int)var4_4.d;
                                                                                                    var24_35 = false;
                                                                                                    var9_11 = var4_4;
                                                                                                    var10_12 = var6_8;
                                                                                                    var38_61 /* !! */  = var14_16 /* !! */ ;
                                                                                                    var14_16 /* !! */  = var3_3;
                                                                                                    var3_3 = var22_31 /* !! */ ;
                                                                                                    var22_31 /* !! */  = var20_25;
                                                                                                    var36_55 = var37_59;
                                                                                                    var13_15 = var27_39;
                                                                                                    var35_50 = false;
                                                                                                    var20_25 = null;
                                                                                                    var25_36 = var3_3;
                                                                                                    var3_3 = var29_41;
                                                                                                    var13_15 = var19_22;
                                                                                                    var19_22 = var17_20;
                                                                                                    var4_4.g((Context)var6_8, (String)var14_16 /* !! */ , (String)var22_31 /* !! */ , (boolean)var37_59, false, var17_20);
                                                                                                } else {
                                                                                                    var38_61 /* !! */  = var14_16 /* !! */ ;
                                                                                                    var25_36 = var22_31 /* !! */ ;
                                                                                                    var13_15 = var19_22;
                                                                                                    var3_3 = var29_41;
                                                                                                }
                                                                                                if (var3_3 != null) {
                                                                                                    var9_11 = var12_14.a;
                                                                                                    Intrinsics.checkNotNull(var9_11);
                                                                                                    var3_3 = (a)var3_3.remove(var9_11);
                                                                                                }
                                                                                                break block128;
                                                                                            }
                                                                                            var38_61 /* !! */  = var14_16 /* !! */ ;
                                                                                            var25_36 = var22_31 /* !! */ ;
                                                                                            var13_15 = var19_22;
                                                                                        }
                                                                                        if ((var28_40 = (int)TextUtils.isEmpty((CharSequence)var5_5)) != 0) break block129;
                                                                                        if (var5_5 != null) {
                                                                                            try {
                                                                                                var31_46 = Long.parseLong((String)var5_5);
                                                                                                var5_5 = var21_28 /* !! */  = Long.valueOf(var31_46);
                                                                                                break block112;
                                                                                            }
                                                                                            catch (Exception var5_6) {
                                                                                                break block113;
                                                                                            }
                                                                                        }
                                                                                        var7_9 = 0;
                                                                                        var5_5 = null;
                                                                                    }
                                                                                    var3_3 = Calendar.getInstance();
                                                                                    var39_63 = var3_3.getTimeInMillis();
                                                                                    if (var5_5 == null || (var15_18 = (cfr_temp_2 = (var41_64 = var5_5.longValue()) - var39_63) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) <= 0) break block129;
                                                                                    var3_3 = var4_4.o;
                                                                                    if (var3_3 != null) {
                                                                                        var21_28 /* !! */  = var3_3.k0();
                                                                                    } else {
                                                                                        var36_55 = 0;
                                                                                        var21_28 /* !! */  = null;
                                                                                    }
                                                                                    if (var21_28 /* !! */  == var8_10) ** GOTO lbl266
                                                                                    var14_16 /* !! */  = var4_4.d();
                                                                                    var22_31 /* !! */  = var11_13.a;
                                                                                    Intrinsics.checkNotNull(var22_31 /* !! */ );
                                                                                    var35_50 = var4_4.d;
                                                                                    var43_65 = var5_5.longValue();
                                                                                    var36_55 = 0;
                                                                                    var21_28 /* !! */  = null;
                                                                                    var9_11 = var4_4;
                                                                                    var10_12 = var6_8;
                                                                                    var4_4.f((Context)var6_8, (String)var14_16 /* !! */ , (String)var22_31 /* !! */ , null, var35_50, var43_65);
                                                                                    var11_13.e = var39_63 = var5_5.longValue();
                                                                                    var3_3 = var4_4.o;
                                                                                    if (var3_3 != null) {
                                                                                        var14_16 /* !! */  = var3_3 = var3_3.P();
                                                                                    } else {
                                                                                        var16_19 = 0;
                                                                                        var14_16 /* !! */  = null;
                                                                                    }
                                                                                    var22_31 /* !! */  = var11_13.a;
                                                                                    Intrinsics.checkNotNull(var22_31 /* !! */ );
                                                                                    var35_50 = var4_4.d;
                                                                                    var43_65 = var5_5.longValue();
                                                                                    var36_55 = 0;
                                                                                    var21_28 /* !! */  = null;
                                                                                    var9_11 = var4_4;
                                                                                    var10_12 = var6_8;
                                                                                    var4_4.f((Context)var6_8, (String)var14_16 /* !! */ , (String)var22_31 /* !! */ , null, var35_50, var43_65);
                                                                                    break block129;
                                                                                }
                                                                                var3_3 = "Exception in storing skip expiry for campaign: ";
                                                                                LO1.b((String)var3_3, var5_6);
                                                                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                var5_5 = JioAds$LogLevel.NONE;
                                                                            }
                                                                            var5_5 = new StringBuilder();
                                                                            var3_3 = var4_4.o;
                                                                            var6_8 = var3_3 != null ? var3_3.P() : null;
                                                                            var5_5.append((String)var6_8);
                                                                            var5_5.append(": skipping campaign: ");
                                                                            var3_3 = var11_13.a;
                                                                            ir3_0.b((StringBuilder)var5_5, (String)var3_3, (String)var13_15);
                                                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                            var5_5 = JioAds$LogLevel.NONE;
                                                                            var9_11 = var25_36;
                                                                            var3_3 = var27_39;
                                                                            var19_22 = var38_61 /* !! */ ;
                                                                            var4_4.o((HashMap)var27_39, (ArrayList)var38_61 /* !! */ , (ArrayList)var25_36);
                                                                            ** GOTO lbl266
                                                                        }
                                                                        var14_16 /* !! */  = var21_28 /* !! */ ;
                                                                        var21_28 /* !! */  = var13_15;
                                                                        var13_15 = var19_22;
                                                                        var19_22 = var22_31 /* !! */ ;
                                                                        var22_31 /* !! */  = var27_39;
                                                                        var45_67 = var28_40;
                                                                        var3_3 = var29_41;
                                                                        var10_12 = "SA";
                                                                        var23_34 = (int)var9_11.equals(var10_12);
                                                                        if (var23_34 != 0) break block130;
                                                                        var6_8 = var14_16 /* !! */ ;
                                                                        var8_10 = var27_39;
                                                                        var14_16 /* !! */  = var21_28 /* !! */ ;
                                                                        var22_31 /* !! */  = var11_13;
                                                                        var13_15 = var25_36;
                                                                        var11_13 = var19_22;
                                                                        break block110;
                                                                    }
                                                                    var9_11 = var4_4.q;
                                                                    if (var9_11 != null) {
                                                                        Intrinsics.checkNotNull(var9_11);
                                                                        var10_12 = var4_4.q;
                                                                        Intrinsics.checkNotNull(var10_12);
                                                                        var9_11.a.l = var23_34 = var10_12.a.l + 1;
                                                                        var9_11 = new StringBuilder((String)var20_25);
                                                                        var10_12 = var4_4.q;
                                                                        Intrinsics.checkNotNull(var10_12);
                                                                        var10_12 = var10_12.a;
                                                                        var23_34 = var10_12.l;
                                                                        var9_11.append(var23_34);
                                                                        var9_11 = var9_11.toString();
                                                                        com.jio.jioads.util.j.a((String)var9_11);
                                                                    }
                                                                    var9_11 = var12_14.a;
                                                                    Intrinsics.checkNotNull(var9_11);
                                                                    var19_22.add(var9_11);
                                                                    var9_11 = var4_4.o;
                                                                    if (var9_11 != null) {
                                                                        var9_11 = var9_11.k0();
                                                                    } else {
                                                                        var18_21 = 0;
                                                                        var9_11 = null;
                                                                    }
                                                                    if (var9_11 == var8_10) ** GOTO lbl266
                                                                    if (var45_67 != 0) {
                                                                        var9_11 = var12_14.a;
                                                                        Intrinsics.checkNotNull(var9_11);
                                                                        var4_4.k((String)var9_11);
                                                                        var9_11 = var4_4.o;
                                                                        if (var9_11 != null && (var10_12 = var9_11.P()) != null) {
                                                                            var20_25 = var11_13.a;
                                                                            Intrinsics.checkNotNull(var20_25);
                                                                            var9_11 = var12_14.a;
                                                                            Intrinsics.checkNotNull(var9_11);
                                                                            var38_62 = var19_22;
                                                                            var46_70 = var4_4.d;
                                                                            var27_39 = var9_11;
                                                                            var9_11 = var4_4;
                                                                            var29_41 = var13_15;
                                                                            var13_15 = var25_36;
                                                                            var25_36 = var14_16 /* !! */ ;
                                                                            var14_16 /* !! */  = var20_25;
                                                                            var20_25 = var22_31 /* !! */ ;
                                                                            var22_31 /* !! */  = var27_39;
                                                                            var47_71 /* !! */  = var21_28 /* !! */ ;
                                                                            var21_28 /* !! */  = var6_8;
                                                                            var1_1 = var20_25;
                                                                            var35_51 = var46_70;
                                                                            var2_2 = var19_22;
                                                                            var19_22 = var17_20;
                                                                            var4_4.l((String)var10_12, (String)var14_16 /* !! */ , (String)var27_39, (Context)var6_8, var46_70, var17_20);
                                                                        } else {
                                                                            var1_1 = var22_31 /* !! */ ;
                                                                            var47_71 /* !! */  = var21_28 /* !! */ ;
                                                                            var2_2 = var19_22;
                                                                            var29_41 = var13_15;
                                                                            var13_15 = var25_36;
                                                                            var25_36 = var14_16 /* !! */ ;
                                                                        }
                                                                        if (var3_3 != null) {
                                                                            var9_11 = var12_14.a;
                                                                            Intrinsics.checkNotNull(var9_11);
                                                                            var9_11 = (a)var3_3.remove(var9_11);
                                                                        }
                                                                    } else {
                                                                        var1_1 = var22_31 /* !! */ ;
                                                                        var47_71 /* !! */  = var21_28 /* !! */ ;
                                                                        var2_2 = var19_22;
                                                                        var29_41 = var13_15;
                                                                        var13_15 = var25_36;
                                                                        var25_36 = var14_16 /* !! */ ;
                                                                    }
                                                                    if ((var18_21 = (int)TextUtils.isEmpty((CharSequence)var5_5)) != 0) break block116;
                                                                    if (var5_5 != null) {
                                                                        try {
                                                                            var33_48 = Long.parseLong((String)var5_5);
                                                                            var5_5 = var21_28 /* !! */  = Long.valueOf(var33_48);
                                                                            break block114;
                                                                        }
                                                                        catch (Exception var5_7) {
                                                                            break block115;
                                                                        }
                                                                    }
                                                                    var7_9 = 0;
                                                                    var5_5 = null;
                                                                }
                                                                var9_11 = Calendar.getInstance();
                                                                var33_48 = var9_11.getTimeInMillis();
                                                                if (var5_5 == null || (var14_16 /* !! */  = var11_13.a) == null || (var14_16 /* !! */  = var12_14.a) == null || (var36_56 = (cfr_temp_3 = (var48_72 = var5_5.longValue()) - var33_48) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) <= 0) break block116;
                                                                var9_11 = var4_4.o;
                                                                if (var9_11 != null) {
                                                                    var21_28 /* !! */  = var9_11.k0();
                                                                } else {
                                                                    var36_56 = 0;
                                                                    var21_28 /* !! */  = null;
                                                                }
                                                                if (var21_28 /* !! */  == var8_10) ** GOTO lbl266
                                                                {
                                                                    var9_11 = var4_4.o;
                                                                    if (var9_11 != null) {
                                                                        var14_16 /* !! */  = var9_11 = var9_11.P();
                                                                    } else {
                                                                        var16_19 = 0;
                                                                        var14_16 /* !! */  = null;
                                                                    }
                                                                    var22_31 /* !! */  = var11_13.a;
                                                                    Intrinsics.checkNotNull(var22_31 /* !! */ );
                                                                    var21_28 /* !! */  = var12_14.a;
                                                                    var35_51 = var4_4.d;
                                                                    var43_66 = var5_5.longValue();
                                                                    var9_11 = var4_4;
                                                                    var10_12 = var6_8;
                                                                    var4_4.f((Context)var6_8, (String)var14_16 /* !! */ , (String)var22_31 /* !! */ , (String)var21_28 /* !! */ , var35_51, var43_66);
                                                                    var12_14.f = var33_48 = var5_5.longValue();
                                                                    var9_11 = var4_4.o;
                                                                    if (var9_11 != null) {
                                                                        var14_16 /* !! */  = var9_11 = var9_11.P();
                                                                    } else {
                                                                        var16_19 = 0;
                                                                        var14_16 /* !! */  = null;
                                                                    }
                                                                    var22_31 /* !! */  = var11_13.a;
                                                                    Intrinsics.checkNotNull(var22_31 /* !! */ );
                                                                    var21_28 /* !! */  = var12_14.a;
                                                                    var35_51 = var4_4.d;
                                                                    var43_66 = var5_5.longValue();
                                                                    var9_11 = var4_4;
                                                                    var10_12 = var6_8;
                                                                    var4_4.f((Context)var6_8, (String)var14_16 /* !! */ , (String)var22_31 /* !! */ , (String)var21_28 /* !! */ , var35_51, var43_66);
                                                                    break block116;
                                                                }
                                                            }
                                                            var9_11 = "Exception in storing skip expiry for ad: ";
                                                            LO1.b((String)var9_11, var5_7);
                                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                            var5_5 = JioAds$LogLevel.NONE;
                                                        }
                                                        if (var3_3 == null) ** GOTO lbl-1000
                                                        var5_5 = var12_14.a;
                                                        Intrinsics.checkNotNull(var5_5);
                                                        var7_9 = (int)var3_3.containsKey(var5_5);
                                                        var18_21 = 1;
                                                        if (var7_9 == var18_21) {
                                                            var23_34 = 1;
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var23_34 = 0;
                                                            var10_12 = null;
                                                        }
                                                        if (var23_34 != 0) {
                                                            var5_5 = var12_14.a;
                                                            Intrinsics.checkNotNull(var5_5);
                                                            var3_3.remove(var5_5);
                                                        }
                                                        var5_5 = new StringBuilder();
                                                        var9_11 = var4_4.o;
                                                        var6_8 = var9_11 != null ? var9_11.P() : null;
                                                        var5_5.append((String)var6_8);
                                                        var5_5.append((String)var13_15);
                                                        var9_11 = var12_14.a;
                                                        var5_5.append((String)var9_11);
                                                        var19_22 = var47_71 /* !! */ ;
                                                        var5_5.append((String)var47_71 /* !! */ );
                                                        var9_11 = var11_13.a;
                                                        var10_12 = var29_41;
                                                        ir3_0.b((StringBuilder)var5_5, (String)var9_11, (String)var29_41);
                                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                        var5_5 = JioAds$LogLevel.NONE;
                                                        var9_11 = var4_4;
                                                        var10_12 = var3_3;
                                                        var14_16 /* !! */  = var1_1;
                                                        var22_31 /* !! */  = var11_13;
                                                        var21_28 /* !! */  = var25_36;
                                                        var20_25 = var2_2;
                                                        var19_22 = var26_37;
                                                        var8_10 = var17_20;
                                                        var4_4.p((HashMap)var3_3, (HashMap)var1_1, (f)var11_13, (ArrayList)var25_36, (ArrayList)var2_2, (JSONObject)var26_37, var17_20);
                                                        ** GOTO lbl266
                                                    }
                                                    var2_2 = var22_31 /* !! */ ;
                                                    var1_1 = var27_39;
                                                    var45_68 = var28_40;
                                                    var3_3 = var19_22;
                                                    var19_22 = var13_15;
                                                    var13_15 = var10_12;
                                                    var25_36 = var21_28 /* !! */ ;
                                                    var5_5 = "DC";
                                                    var7_9 = (int)var9_11.equals(var5_5);
                                                    if (var7_9 != 0) break block131;
                                                    var8_10 = var27_39;
                                                    var14_16 /* !! */  = var19_22;
                                                    var22_31 /* !! */  = var11_13;
                                                    var6_8 = var21_28 /* !! */ ;
                                                    var11_13 = var2_2;
                                                    break block110;
                                                }
                                                var5_5 = var11_13.a;
                                                if (var5_5 == null) break block132;
                                                var5_5 = var4_4.o;
                                                if (var5_5 != null) {
                                                    var21_28 /* !! */  = var5_5.k0();
                                                } else {
                                                    var36_57 = false;
                                                    var21_28 /* !! */  = null;
                                                }
                                                if (var21_28 /* !! */  == var8_10) ** GOTO lbl266
                                                var5_5 = var4_4.o;
                                                if (var5_5 != null && (var14_16 /* !! */  = var5_5.P()) != null) {
                                                    var22_31 /* !! */  = var11_13.a;
                                                    var36_57 = var4_4.d;
                                                    var7_9 = 0;
                                                    var5_5 = null;
                                                    var9_11 = var4_4;
                                                    var10_12 = var6_8;
                                                    var8_10 = var20_25;
                                                    var35_52 = false;
                                                    var20_25 = null;
                                                    var19_22 = var17_20;
                                                    var4_4.g((Context)var6_8, (String)var14_16 /* !! */ , (String)var22_31 /* !! */ , var36_57, false, var17_20);
                                                } else {
                                                    var8_10 = var20_25;
                                                }
                                                var5_5 = var4_4.q;
                                                if (var5_5 != null) {
                                                    Intrinsics.checkNotNull(var5_5);
                                                    var5_5 = var5_5.a;
                                                    var18_21 = var5_5.l;
                                                    var10_12 = var11_13.d;
                                                    if (var10_12 != null) {
                                                        var23_34 = var10_12.size();
                                                    } else {
                                                        var23_34 = 0;
                                                        var10_12 = null;
                                                    }
                                                    var5_5.l = var18_21 += var23_34;
                                                }
                                                var5_5 = new StringBuilder((String)var8_10);
                                                var9_11 = var4_4.q;
                                                if (var9_11 != null) {
                                                    var9_11 = var9_11.a;
                                                    var18_21 = var9_11.l;
                                                    var21_28 /* !! */  = var18_21;
                                                } else {
                                                    var36_57 = false;
                                                    var21_28 /* !! */  = null;
                                                }
                                                var5_5.append(var21_28 /* !! */ );
                                                com.jio.jioads.util.j.a(var5_5.toString());
                                                var5_5 = var12_14.a;
                                                if (var5_5 != null && var3_3 != null) {
                                                    Intrinsics.checkNotNull(var5_5);
                                                    var5_5 = (a)var3_3.remove(var5_5);
                                                }
                                                if (var45_68 != 0) {
                                                    var5_5 = var12_14.a;
                                                    Intrinsics.checkNotNull(var5_5);
                                                    var4_4.k((String)var5_5);
                                                }
                                                var5_5 = var11_13.a;
                                                Intrinsics.checkNotNull(var5_5);
                                                var20_25 = var25_36;
                                                var25_36.add(var5_5);
                                                var5_5 = new StringBuilder();
                                                var3_3 = var4_4.o;
                                                var6_8 = var3_3 != null ? var3_3.P() : null;
                                                var5_5.append((String)var6_8);
                                                var5_5.append(": deleted campaign: ");
                                                var3_3 = var11_13.a;
                                                var5_5.append((String)var3_3);
                                                var5_5 = var5_5.toString();
                                                com.jio.jioads.util.j.a((String)var5_5);
lbl717:
                                                // 2 sources

                                                while (true) {
                                                    var21_28 /* !! */  = var1_1;
                                                    var22_31 /* !! */  = var2_2;
                                                    var4_4.o((HashMap)var1_1, (ArrayList)var2_2, (ArrayList)var20_25);
                                                    ** GOTO lbl266
                                                    break;
                                                }
                                            }
                                            var20_25 = var21_28 /* !! */ ;
                                            ** while (true)
                                        }
                                        var5_5 = var20_25;
                                        var20_25 = var21_28 /* !! */ ;
                                        var21_28 /* !! */  = var27_39;
                                        var45_69 = var28_40;
                                        var3_3 = var19_22;
                                        var19_22 = var13_15;
                                        var13_15 = var10_12;
                                        var10_12 = "DA";
                                        var23_34 = (int)var9_11.equals(var10_12);
                                        if (var23_34 != 0) break block133;
                                        var8_10 = var27_39;
                                        var6_8 = var20_25;
                                        var14_16 /* !! */  = var19_22;
                                        ** GOTO lbl150
                                    }
                                    var9_11 = var11_13.a;
                                    if (var9_11 == null || (var9_11 = var12_14.a) == null) break block134;
                                    var9_11 = var4_4.o;
                                    if (var9_11 != null) {
                                        var9_11 = var9_11.k0();
                                    } else {
                                        var18_21 = 0;
                                        var9_11 = null;
                                    }
                                    if (var9_11 == var8_10) ** GOTO lbl266
                                    var9_11 = var4_4.o;
                                    if (var9_11 != null && (var10_12 = var9_11.P()) != null) {
                                        var14_16 /* !! */  = var11_13.a;
                                        Intrinsics.checkNotNull(var14_16 /* !! */ );
                                        var8_10 = var12_14.a;
                                        Intrinsics.checkNotNull(var8_10);
                                        var37_60 = var4_4.d;
                                        var9_11 = var4_4;
                                        var25_36 = var11_13;
                                        var11_13 = var22_31 /* !! */ ;
                                        var22_31 /* !! */  = var8_10;
                                        var8_10 = var21_28 /* !! */ ;
                                        var21_28 /* !! */  = var6_8;
                                        var6_8 = var20_25;
                                        var35_53 = var37_60;
                                        var13_15 = var19_22;
                                        var19_22 = var17_20;
                                        var4_4.l((String)var10_12, (String)var14_16 /* !! */ , (String)var22_31 /* !! */ , (Context)var21_28 /* !! */ , var37_60, var17_20);
                                    } else {
                                        var8_10 = var21_28 /* !! */ ;
                                        var6_8 = var20_25;
                                        var13_15 = var19_22;
                                        var25_36 = var11_13;
                                        var11_13 = var22_31 /* !! */ ;
                                    }
                                    var9_11 = var12_14.a;
                                    Intrinsics.checkNotNull(var9_11);
                                    var11_13.add(var9_11);
                                    var9_11 = var4_4.q;
                                    if (var9_11 != null) {
                                        Intrinsics.checkNotNull(var9_11);
                                        var9_11 = var9_11.a;
                                        var23_34 = var9_11.l;
                                        var16_19 = 1;
                                        var9_11.l = var23_34 += var16_19;
                                    }
                                    var9_11 = new StringBuilder((String)var5_5);
                                    var5_5 = var4_4.q;
                                    if (var5_5 != null) {
                                        var5_5 = var5_5.a;
                                        var7_9 = var5_5.l;
                                        var21_28 /* !! */  = var7_9;
                                    } else {
                                        var36_58 = false;
                                        var21_28 /* !! */  = null;
                                    }
                                    var9_11.append(var21_28 /* !! */ );
                                    var5_5 = var9_11.toString();
                                    com.jio.jioads.util.j.a((String)var5_5);
                                    if (var3_3 != null) {
                                        var5_5 = var12_14.a;
                                        Intrinsics.checkNotNull(var5_5);
                                        var5_5 = (a)var3_3.remove(var5_5);
                                    }
                                    if (var45_69 != 0) {
                                        var5_5 = var12_14.a;
                                        Intrinsics.checkNotNull(var5_5);
                                        var4_4.k((String)var5_5);
                                    }
                                    var5_5 = new StringBuilder();
                                    var9_11 = var4_4.o;
                                    if (var9_11 != null) {
                                        var9_11 = var9_11.P();
                                    } else {
                                        var18_21 = 0;
                                        var9_11 = null;
                                    }
                                    var5_5.append((String)var9_11);
                                    var5_5.append(": deleted ad: ");
                                    var9_11 = var12_14.a;
                                    var5_5.append((String)var9_11);
                                    var5_5.append((String)var13_15);
                                    var22_31 /* !! */  = var25_36;
                                    var9_11 = var25_36.a;
                                    var5_5.append((String)var9_11);
                                    var5_5 = var5_5.toString();
                                    com.jio.jioads.util.j.a((String)var5_5);
                                    break block135;
                                }
                                var8_10 = var21_28 /* !! */ ;
                                var6_8 = var20_25;
                                var30_43 = var11_13;
                                var11_13 = var22_31 /* !! */ ;
                                var22_31 /* !! */  = var30_43;
                            }
                            var9_11 = var4_4;
                            var10_12 = var3_3;
                            var14_16 /* !! */  = var8_10;
                            var21_28 /* !! */  = var6_8;
                            var20_25 = var11_13;
                            var19_22 = var26_37;
                            var8_10 = var17_20;
                            var4_4.p((HashMap)var3_3, (HashMap)var14_16 /* !! */ , (f)var22_31 /* !! */ , (ArrayList)var6_8, (ArrayList)var11_13, (JSONObject)var26_37, var17_20);
                            ** GOTO lbl266
                        }
                        var26_37 = var14_16 /* !! */ ;
                        var6_8 = var21_28 /* !! */ ;
                        var8_10 = var20_25;
                        var3_3 = var19_22;
                        var14_16 /* !! */  = var13_15;
                        var13_15 = var10_12;
                        ** while (true)
                    }
                    var10_12 = "Mod Status Url Returned unexpected value: ";
                    var5_5 = new StringBuilder((String)var10_12);
                    var5_5.append((String)var9_11);
                    com.jio.jioads.util.j.c(var5_5.toString());
                    var5_5 = new StringBuilder();
                    var9_11 = var4_4.o;
                    if (var9_11 != null) {
                        var9_11 = var9_11.P();
                    } else {
                        var18_21 = 0;
                        var9_11 = null;
                    }
                    var5_5.append((String)var9_11);
                    var5_5.append((String)var13_15);
                    var9_11 = var12_14.a;
                    var5_5.append((String)var9_11);
                    var5_5.append((String)var14_16 /* !! */ );
                    var9_11 = var22_31 /* !! */ .a;
                    var5_5.append((String)var9_11);
                    com.jio.jioads.util.j.a(var5_5.toString());
                    var5_5 = var12_14.a;
                    if (var5_5 != null) {
                        Intrinsics.checkNotNull(var5_5);
                        var11_13.add(var5_5);
                    }
                    var9_11 = var4_4;
                    var10_12 = var3_3;
                    var14_16 /* !! */  = var8_10;
                    var21_28 /* !! */  = var6_8;
                    var20_25 = var11_13;
                    var19_22 = var26_37;
                    var8_10 = var17_20;
                    var4_4.p((HashMap)var3_3, (HashMap)var14_16 /* !! */ , (f)var22_31 /* !! */ , (ArrayList)var6_8, (ArrayList)var11_13, (JSONObject)var26_37, var17_20);
                    ** GOTO lbl266
                }
                var26_38 = var14_16 /* !! */ ;
                var8_10 = var20_25;
                var3_3 = var19_22;
                var14_16 /* !! */  = var13_15;
                var6_8 = var21_28 /* !! */ ;
                var30_44 = var11_13;
                var11_13 = var22_31 /* !! */ ;
                var22_31 /* !! */  = var30_44;
                var5_5 = new StringBuilder();
                var9_11 = var4_4.o;
                if (var9_11 != null) {
                    var9_11 = var9_11.P();
                } else {
                    var18_21 = 0;
                    var9_11 = null;
                }
                var5_5.append((String)var9_11);
                var5_5.append(": empty status url result for ");
                var9_11 = var12_14.a;
                var5_5.append((String)var9_11);
                var5_5.append((String)var14_16 /* !! */ );
                var9_11 = var22_31 /* !! */ .a;
                var5_5.append((String)var9_11);
                var5_5.append((String)var10_12);
                com.jio.jioads.util.j.a(var5_5.toString());
                var5_5 = var12_14.a;
                if (var5_5 != null) {
                    Intrinsics.checkNotNull(var5_5);
                    var11_13.add(var5_5);
                }
                var9_11 = var4_4;
                var10_12 = var3_3;
                var14_16 /* !! */  = var8_10;
                var21_28 /* !! */  = var6_8;
                var20_25 = var11_13;
                var19_22 = var26_38;
                var8_10 = var17_20;
                var4_4.p((HashMap)var3_3, (HashMap)var14_16 /* !! */ , (f)var22_31 /* !! */ , (ArrayList)var6_8, (ArrayList)var11_13, (JSONObject)var26_38, var17_20);
                ** while (true)
            }
            var22_32 = var11_13;
            var14_16 /* !! */  = var13_15;
            var5_5 = new StringBuilder();
            var3_3 = var4_4.o;
            var6_8 = var3_3 != null ? var3_3.P() : null;
            var5_5.append((String)var6_8);
            var5_5.append(": status url array does not have instruction node for ");
            var3_3 = var12_14.a;
            var5_5.append((String)var3_3);
            var5_5.append((String)var14_16 /* !! */ );
            var3_3 = var22_32.a;
            j_0.k((StringBuilder)var5_5, (String)var3_3, (String)var10_12);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var5_5 = JioAds$LogLevel.NONE;
            var5_5 = var12_14.a;
            TypeIntrinsics.asMutableCollection(var9_11).remove(var5_5);
            var3_3 = this;
            var20_26 = this.f;
            var19_23 = this.g;
            var9_11 = this.a;
            var10_12 = this.j;
            var14_16 /* !! */  = this.d;
            var22_32 = this.e;
            var21_29 = this.c;
            var8_10 = this.h;
            var4_4 = this.i;
            var9_11.n((ArrayList)var10_12, (HashMap)var14_16 /* !! */ , (HashMap)var22_32, var21_29, var20_26, var19_23, (JSONObject)var8_10, (String)var4_4);
            return;
        }
        var22_33 = var11_13;
        var14_17 = var13_15;
        var5_5 = new StringBuilder();
        var21_30 = var4_4.o;
        var6_8 = var21_30 != null ? var21_30.P() : null;
        var5_5.append((String)var6_8);
        var5_5.append(": status url response is empty for ");
        var21_30 = var12_14.a;
        var5_5.append((String)var21_30);
        var5_5.append((String)var14_17);
        var14_17 = var22_33.a;
        j_0.k((StringBuilder)var5_5, (String)var14_17, (String)var10_12);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var5_5 = JioAds$LogLevel.NONE;
        var5_5 = var12_14.a;
        var9_11 = TypeIntrinsics.asMutableCollection(var9_11);
        var9_11.remove(var5_5);
        var19_24 = var3_3.f;
        var8_10 = var3_3.g;
        var10_12 = var3_3.a;
        var14_17 = var3_3.j;
        var22_33 = var3_3.d;
        var21_30 = var3_3.e;
        var20_27 = var3_3.c;
        var4_4 = var3_3.h;
        var6_8 = var3_3.i;
        var10_12.n((ArrayList)var14_17, (HashMap)var22_33, (HashMap)var21_30, var20_27, var19_24, (ArrayList)var8_10, (JSONObject)var4_4, (String)var6_8);
    }
}

