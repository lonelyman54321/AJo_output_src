/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.jio.jioads.instreamads.vastparser;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instreamads.vastparser.listener.b;
import com.jio.jioads.instreamads.vastparser.model.g;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.o;
import com.jio.jioads.instreamads.vastparser.p;
import com.jio.jioads.instreamads.vastparser.q;
import com.jio.jioads.instreamads.vastparser.t;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.Constants$SupportedMimeTypes;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class s {
    public b a;
    public final String b;
    public String c;
    public String d;
    public Map e;
    public String f;
    public final Function1 g;

    public s(b b2, String string2, String string3, String string4, Map map2, String string5, Function1 function1) {
        this.a = b2;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = map2;
        this.f = string5;
        this.g = function1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Integer object, String object2, String object3, String object4) {
        Exception exception3;
        block12: {
            block13: {
                block11: {
                    block10: {
                        block9: {
                            t t3 = new t();
                            String string2 = this.c;
                            if (string2 != null) {
                                t3.f = string2;
                            }
                            string2 = null;
                            try {
                                String string3 = this.f;
                                if (string3 == null) break block9;
                                Intrinsics.checkNotNull(string3);
                                object = t3.a((Integer)object, string3, (String)object3, (String)object4);
                                break block10;
                            }
                            catch (Exception exception2) {
                                object3 = this.c;
                                if (object3 == null || (object3 = this.d) == null || (object3 = this.e) == null || object2 != null) break block9;
                                object3 = new StringBuilder("Error in parsing Vast Ad: ");
                                object4 = Utility.INSTANCE;
                                com.jio.jioads.jioreel.tracker.model.b.c((Utility)object4, exception2, (StringBuilder)object3);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object = JioAds$LogLevel.NONE;
                                object = this.g;
                                if (object == null) break block9;
                                object3 = new q(null);
                                object.invoke(object3);
                            }
                        }
                        object = null;
                    }
                    try {
                        boolean bl2 = this.b((m)object, (String)object2);
                        object4 = this.b;
                        if (!bl2) break block11;
                    }
                    catch (Exception exception3) {
                        break block12;
                    }
                    object3 = this.a;
                    if (object3 != null) {
                        object3.a((m)object, (String)object2, (String)object4);
                    }
                    break block13;
                }
                object = this.a;
                if (object != null) {
                    object.a(null, (String)object2, (String)object4);
                }
            }
            this.a = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            return;
        }
        object2 = this.a;
        if (object2 != null) {
            object3 = exception3.getMessage();
            object2.a((String)object3);
        }
        object2 = "VastParserTask onPostExecute exception ";
        LO1.b((String)object2, exception3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean b(m var1_1, String var2_2) {
        block27: {
            block29: {
                block28: {
                    var3_3 = 1;
                    if (var1_1 == null) break block27;
                    var4_4 = var1_1.c;
                    var5_5 = var4_4.size();
                    var6_6 = this.g;
                    var7_7 = 0;
                    if (var5_5 <= 0) break block28;
                    var5_5 = var4_4.size();
                    var9_9 = null;
                    var10_10 = 1;
                    for (var8_8 = 0; var8_8 < var5_5; var8_8 += var3_3) {
                        var11_11 /* !! */  = var4_4.get(var8_8);
                        var12_12 = "message";
                        var13_13 = "Invalid vast schema";
                        if (var11_11 /* !! */  == null) ** GOTO lbl-1000
                        var11_11 /* !! */  = (j)var4_4.get(var8_8);
                        if (var11_11 /* !! */  != null) {
                            var11_11 /* !! */  = var11_11 /* !! */ .n;
                        } else {
                            var14_14 = false;
                            var11_11 /* !! */  = null;
                        }
                        if (var11_11 /* !! */  != null) ** GOTO lbl-1000
                        var11_11 /* !! */  = (j)var4_4.get(var8_8);
                        if (var11_11 /* !! */  != null) {
                            var11_11 /* !! */  = var11_11 /* !! */ .m;
                        } else {
                            var14_14 = false;
                            var11_11 /* !! */  = null;
                        }
                        if (var11_11 /* !! */  != null) {
                            var11_11 /* !! */  = (j)var4_4.get(var8_8);
                            if (var11_11 /* !! */  != null && (var11_11 /* !! */  = var11_11 /* !! */ .m) != null) {
                                var11_11 /* !! */  = var11_11 /* !! */ .e;
                            } else {
                                var14_14 = false;
                                var11_11 /* !! */  = null;
                            }
                            if (var11_11 /* !! */  != null) {
                                var11_11 /* !! */  = (j)var4_4.get(var8_8);
                                if (var11_11 /* !! */  != null && (var11_11 /* !! */  = var11_11 /* !! */ .m) != null) {
                                    var11_11 /* !! */  = var11_11 /* !! */ .e;
                                } else {
                                    var14_14 = false;
                                    var11_11 /* !! */  = null;
                                }
                                var14_14 = TextUtils.isEmpty(var11_11 /* !! */ );
                                if (!var14_14) continue;
                            }
                            if (var6_6 != null) {
                                var11_11 /* !! */  = (j)var4_4.get(var8_8);
                                var15_15 /* !! */  = new p((j)var11_11 /* !! */ );
                                var6_6.invoke(var15_15 /* !! */ );
                            }
                            Intrinsics.checkNotNullParameter(var13_13, var12_12);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var15_15 /* !! */  = JioAds$LogLevel.NONE;
                        } else lbl-1000:
                        // 3 sources

                        {
                            if ((var11_11 /* !! */  = var4_4.get(var8_8)) != null && (var11_11 /* !! */  = m.i((j)var4_4.get(var8_8))) != null) {
                                var11_11 /* !! */  = m.i((j)var4_4.get(var8_8));
                                if (var11_11 /* !! */  != null) {
                                    var11_11 /* !! */  = var11_11 /* !! */ .b;
                                } else {
                                    var14_14 = false;
                                    var11_11 /* !! */  = null;
                                }
                                if (var11_11 /* !! */  != null) continue;
                            }
                            if (var6_6 != null) {
                                var11_11 /* !! */  = (j)var4_4.get(var8_8);
                                var15_15 /* !! */  = new o((j)var11_11 /* !! */ );
                                var6_6.invoke(var15_15 /* !! */ );
                            }
                            Intrinsics.checkNotNullParameter(var13_13, (String)var12_12);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var15_15 /* !! */  = JioAds$LogLevel.NONE;
                        }
                        var10_10 = 0;
                        var15_15 /* !! */  = null;
                    }
                    break block29;
                }
                var10_10 = 1;
            }
            var4_4 = this.c;
            var16_16 = this.d;
            var9_9 = var1_1.c;
            if (var9_9 != null && (var8_8 = var9_9.size()) > 0) {
                var9_9 = var1_1.c;
                var8_8 = var9_9.size();
                while (var7_7 < var8_8) {
                    var11_11 /* !! */  = (j)var1_1.c.get(var7_7);
                    var12_12 = m.i(var11_11 /* !! */ );
                    if (var11_11 /* !! */  != null && var12_12 != null && (var13_13 = var12_12.b) != null && (var17_17 = var13_13.size()) > 0) {
                        var12_12 = var12_12.b;
                        Intrinsics.checkNotNull(var12_12);
                        var12_12 = var12_12.iterator();
                        while ((var17_17 = (int)var12_12.hasNext()) != 0) {
                            var13_13 = (g)var12_12.next();
                            var18_18 = var13_13.g;
                            if (var18_18 != null && !(var19_19 = TextUtils.isEmpty((CharSequence)var18_18))) {
                                var18_18 = var13_13.g;
                                var19_19 = TextUtils.isEmpty((CharSequence)var18_18);
                                if (var19_19) continue;
                                var18_18 = Constants$SupportedMimeTypes.Companion;
                                var13_13 = var13_13.g;
                                if (var13_13 == null) {
                                    var13_13 = "";
                                }
                                if ((var17_17 = (int)var18_18.contains((String)var13_13)) != 0 || (var13_13 = var11_11 /* !! */ .n) == null) continue;
                            }
                            if ((var13_13 = var11_11 /* !! */ .n) != null) {
                                var18_18 = var13_13.b;
                            } else {
                                var19_19 = false;
                                var18_18 = null;
                            }
                            if (var18_18 == null) continue;
                            if (var13_13 != null) {
                                var13_13 = var13_13.b;
                            } else {
                                var17_17 = 0;
                                var13_13 = null;
                            }
                            if ((var17_17 = (int)TextUtils.isEmpty((CharSequence)var13_13)) != 0 || var4_4 == null || var16_16 == null || var2_2 != null || var6_6 == null) continue;
                            var13_13 = new q(var1_1);
                            var6_6.invoke(var13_13);
                        }
                    }
                    var7_7 += var3_3;
                }
            }
            var3_3 = var10_10;
        }
        return (boolean)var3_3;
    }
}

