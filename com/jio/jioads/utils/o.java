/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.jio.jioads.utils;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instreamads.vastparser.model.g;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.b;
import com.jio.jioads.utils.Constants$SupportedMimeTypes;
import com.jio.jioads.utils.Constants$SupportedMimeTypes$Companion;
import com.jio.jioads.utils.m;
import com.jio.jioads.utils.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class o {
    public final Context a;

    public o(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int a(int n3, int n4, int n7, ArrayList arrayList) {
        int n8 = n3 + -1;
        if (n3 == 0) {
            n8 = n3;
        }
        if (n4 < n3) return n8;
        n8 = (n4 - n3) / 2 + n3;
        try {
            int n10;
            String string2;
            block11: {
                void var5_13;
                block12: {
                    block10: {
                        void var5_9;
                        Object e2 = arrayList.get(n8);
                        g g3 = (g)e2;
                        string2 = null;
                        if (g3 != null) {
                            String string3 = g3.c;
                        } else {
                            n10 = 0;
                            Object var5_8 = null;
                        }
                        n10 = TextUtils.isEmpty((CharSequence)var5_9);
                        if (n10 != 0) break block10;
                        Object e5 = arrayList.get(n8);
                        g g5 = (g)e5;
                        if (g5 == null) break block11;
                        String string4 = g5.c;
                        break block12;
                    }
                    Object e7 = arrayList.get(n8);
                    g g7 = (g)e7;
                    if (g7 == null) break block11;
                    String string5 = g7.b;
                }
                string2 = var5_13;
            }
            if (string2 != null && (n10 = Integer.parseInt(string2)) == n7) {
                return n8;
            }
            if (string2 != null && (n10 = Integer.parseInt(string2)) > n7) {
                n4 = n8 + -1;
                return o.a(n3, n4, n7, arrayList);
            }
            n3 = n8 + 1;
            return o.a(n3, n4, n7, arrayList);
        }
        catch (Exception exception) {}
        return n8;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static g b(int var0, ArrayList var1_1) {
        block4: {
            block6: {
                block5: {
                    var2_2 = new StringBuilder("Checking for requestedBitRate: ");
                    var2_2.append(var0);
                    var2_2 = var2_2.toString();
                    var3_3 = "message";
                    Intrinsics.checkNotNullParameter(var2_2, var3_3);
                    var2_2 = JioAds.Companion;
                    var2_2.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var4_4 /* !! */  = JioAds$LogLevel.NONE;
                    o.d((ArrayList)var1_1);
                    var4_4 /* !! */  = m.c;
                    var5_5 = new n((Function2)var4_4 /* !! */ );
                    bx_2.q((List)var1_1, (Comparator)var5_5);
                    o.d((ArrayList)var1_1);
                    var6_6 = var1_1.size() + -1;
                    var6_6 = o.a(0, var6_6, var0, (ArrayList)var1_1);
                    var5_5 = (g)var1_1.get(var6_6);
                    var7_7 = wk0_0.a(var6_6, "BitRate at index: ", " bitrate: ");
                    var8_8 = null;
                    var9_9 = var5_5 != null ? var5_5.b : null;
                    var7_7.append(var9_9);
                    var9_9 = " minbitrate: ";
                    var7_7.append(var9_9);
                    var9_9 = var5_5 != null ? var5_5.c : null;
                    d90_0.b((StringBuilder)var7_7, var9_9, var3_3, (JioAds$Companion)var2_2);
                    if (var5_5 == null || (var7_7 = var5_5.b) == null || (var10_10 = var7_7.length()) <= 0) break block4;
                    var7_7 = var5_5.c;
                    var10_10 = (int)TextUtils.isEmpty((CharSequence)var7_7);
                    if (var10_10 != 0) break block5;
                    var7_7 = var5_5.c;
                    if (var7_7 == null) ** GOTO lbl-1000
                    var10_10 = Integer.parseInt((String)var7_7);
                    var7_7 = var10_10;
                    break block6;
                }
                var7_7 = var5_5.b;
                if (var7_7 != null) {
                    var10_10 = Integer.parseInt((String)var7_7);
                    var7_7 = var10_10;
                } else lbl-1000:
                // 2 sources

                {
                    var10_10 = 0;
                    var7_7 = null;
                }
            }
            if (var7_7 != null && (var10_10 = var7_7.intValue()) > var0 && var6_6 != 0) {
                var5_5 = var11_11 = var1_1.get(var6_6 += -1);
                var5_5 = (g)var11_11;
                var1_1 = " : ";
                var11_11 = wk0_0.a(var6_6, "Bitrate at index: ", (String)var1_1);
                var1_1 = var5_5 != null ? var5_5.b : null;
                var11_11.append((String)var1_1);
                var1_1 = " and url: ";
                var11_11.append((String)var1_1);
                if (var5_5 != null) {
                    var8_8 = var5_5.a;
                }
                d90_0.b((StringBuilder)var11_11, var8_8, var3_3, (JioAds$Companion)var2_2);
            }
        }
        return var5_5;
    }

    public static void d(ArrayList object) {
        Object object2;
        Object object3 = JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (object3 == (object2 = JioAds$LogLevel.DEBUG)) {
            boolean bl2;
            object3 = new StringBuilder();
            object = ((ArrayList)object).iterator();
            while (bl2 = object.hasNext()) {
                object2 = (g)object.next();
                if (object2 == null) continue;
                String string2 = ((g)object2).c;
                boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                String string3 = " - ";
                if (!bl3) {
                    object2 = ((g)object2).c;
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append(string3);
                    continue;
                }
                object2 = ((g)object2).b;
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(string3);
            }
            object2 = "BitrateList--> ";
            object = new StringBuilder((String)object2);
            ((StringBuilder)object).append(object3);
            object = ((StringBuilder)object).toString();
            object3 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    /*
     * WARNING - void declaration
     */
    public final g c(ArrayList object, int n3, boolean bl2) {
        Object object2;
        block42: {
            String string2;
            block43: {
                void var15_37;
                block45: {
                    void var15_36;
                    Object object3;
                    Object object4;
                    int n4;
                    Object object5;
                    int n7;
                    block44: {
                        boolean bl3;
                        boolean bl4;
                        boolean bl5;
                        Object object6;
                        boolean bl6;
                        Object object7;
                        Object object8 = new ArrayList();
                        string2 = "message";
                        object2 = null;
                        if (object != null) {
                            object = ((ArrayList)object).iterator();
                            while ((n7 = object.hasNext()) != 0) {
                                object7 = (g)object.next();
                                if (object7 != null) {
                                    object5 = ((g)object7).g;
                                } else {
                                    bl6 = false;
                                    object5 = null;
                                }
                                if (object5 != null) {
                                    object5 = Constants$SupportedMimeTypes.Companion;
                                    object6 = ((g)object7).g;
                                    Intrinsics.checkNotNull(object6);
                                    bl6 = ((Constants$SupportedMimeTypes$Companion)object5).contains((String)object6);
                                    if (bl6) {
                                        ((ArrayList)object8).add(object7);
                                        continue;
                                    }
                                }
                                object6 = "Unsupported type: ";
                                object5 = new StringBuilder((String)object6);
                                if (object7 != null) {
                                    object7 = ((g)object7).g;
                                } else {
                                    n7 = 0;
                                    object7 = null;
                                }
                                ir3_0.b((StringBuilder)object5, (String)object7, string2);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object7 = JioAds$LogLevel.NONE;
                            }
                        }
                        object = CollectionsKt.k0(object8);
                        object8 = new ArrayList();
                        if (object != null) {
                            object7 = object.iterator();
                            while (bl6 = object7.hasNext()) {
                                String string3;
                                object5 = (g)object7.next();
                                if (object5 == null) continue;
                                if (bl2) {
                                    object6 = b.b;
                                    string3 = "streaming";
                                    object6 = ((g)object5).a;
                                    n4 = Intrinsics.areEqual(string3, object6);
                                    if (n4 != 0) {
                                        ((ArrayList)object8).add(object5);
                                        continue;
                                    }
                                }
                                if (bl2) continue;
                                object6 = b.b;
                                string3 = "progressive";
                                object6 = ((g)object5).a;
                                n4 = Intrinsics.areEqual(string3, object6);
                                if (n4 == 0) continue;
                                ((ArrayList)object8).add(object5);
                            }
                        }
                        if (bl5 = (bl4 = (object4 = CollectionsKt.k0(object8)).isEmpty()) ^ (n7 = 1)) {
                            object = object4;
                        }
                        if (!(bl3 = object.isEmpty() ^ n7)) break block42;
                        int n8 = object.size();
                        boolean bl7 = false;
                        object8 = null;
                        if (n8 <= n7) break block43;
                        object4 = Utility.INSTANCE;
                        object2 = this.a;
                        object5 = ((Utility)object4).getNetworkConnectionType((Context)object2);
                        if (n3 <= n7) break block44;
                        object8 = "Developer requested bitrate: ";
                        object4 = new StringBuilder((String)object8);
                        ((StringBuilder)object4).append(n3);
                        Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), string2);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object4 = JioAds$LogLevel.NONE;
                        object = CollectionsKt.m0((Collection)object);
                        object2 = o.b(n3, (ArrayList)object);
                        break block42;
                    }
                    if (object5 == null) break block45;
                    n3 = ((String)object5).hashCode();
                    n7 = 128;
                    n4 = 160;
                    int n10 = 4;
                    switch (n3) {
                        default: {
                            break block45;
                        }
                        case 55: {
                            object3 = "7";
                            n3 = (int)(((String)object5).equals(object3) ? 1 : 0);
                            if (n3 != 0) {
                                break;
                            }
                            break block45;
                        }
                        case 54: {
                            Object object9 = "6";
                            n3 = (int)(((String)object5).equals(object9) ? 1 : 0);
                            if (n3 != 0) {
                                void var15_22;
                                n3 = ((Utility)object4).getCurrentUIModeType((Context)object2);
                                if (n3 == n10) {
                                    int n14 = 3500;
                                } else {
                                    n3 = 1200;
                                    int n15 = 1200;
                                }
                                object4 = "Connection type is 5G and max bit rate is: ";
                                object9 = new StringBuilder((String)object4);
                                ((StringBuilder)object9).append((int)var15_22);
                                Intrinsics.checkNotNullParameter(((StringBuilder)object9).toString(), string2);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object9 = JioAds$LogLevel.NONE;
                            }
                            break block45;
                        }
                        case 53: {
                            Object object10 = "5";
                            n3 = (int)(((String)object5).equals(object10) ? 1 : 0);
                            if (n3 != 0) {
                                void var15_25;
                                n3 = ((Utility)object4).getCurrentUIModeType((Context)object2);
                                if (n3 == n10) {
                                    n3 = 2000;
                                    int n16 = 2000;
                                } else {
                                    n3 = 500;
                                    int n17 = 500;
                                }
                                object4 = "Connection type is 4G and max bit rate is: ";
                                object10 = new StringBuilder((String)object4);
                                ((StringBuilder)object10).append((int)var15_25);
                                Intrinsics.checkNotNullParameter(((StringBuilder)object10).toString(), string2);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object10 = JioAds$LogLevel.NONE;
                            }
                            break block45;
                        }
                        case 52: {
                            Object object11 = "4";
                            n3 = (int)(((String)object5).equals(object11) ? 1 : 0);
                            if (n3 != 0) {
                                void var15_29;
                                n3 = ((Utility)object4).getCurrentUIModeType((Context)object2);
                                if (n3 == n10) {
                                    n3 = 320;
                                    int n18 = 320;
                                } else {
                                    n3 = (int)(((Utility)object4).isDeviceTypeTablet((Context)object2) ? 1 : 0);
                                    if (n3 != 0) {
                                        int n19 = 160;
                                    } else {
                                        int n20 = 128;
                                    }
                                }
                                object4 = "Connection type is 3G and max bit rate is: ";
                                object11 = new StringBuilder((String)object4);
                                ((StringBuilder)object11).append((int)var15_29);
                                Intrinsics.checkNotNullParameter(((StringBuilder)object11).toString(), string2);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object11 = JioAds$LogLevel.NONE;
                            }
                            break block45;
                        }
                        case 51: {
                            Object object12 = "3";
                            n3 = (int)(((String)object5).equals(object12) ? 1 : 0);
                            if (n3 != 0) {
                                void var15_33;
                                n3 = ((Utility)object4).getCurrentUIModeType((Context)object2);
                                if (n3 == n10) {
                                    int n21 = 160;
                                } else {
                                    n3 = (int)(((Utility)object4).isDeviceTypeTablet((Context)object2) ? 1 : 0);
                                    if (n3 != 0) {
                                        int n22 = 128;
                                    } else {
                                        n3 = 64;
                                        int n24 = 64;
                                    }
                                }
                                object4 = "Connection type is 2G and max bit rate is: ";
                                object12 = new StringBuilder((String)object4);
                                ((StringBuilder)object12).append((int)var15_33);
                                Intrinsics.checkNotNullParameter(((StringBuilder)object12).toString(), string2);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object12 = JioAds$LogLevel.NONE;
                            }
                            break block45;
                        }
                        case 50: {
                            String string4 = "2";
                            ((String)object5).equals(string4);
                            break block45;
                        }
                        case 49: {
                            object3 = "1";
                            n3 = (int)(((String)object5).equals(object3) ? 1 : 0);
                            if (n3 == 0) break block45;
                        }
                    }
                    n3 = ((Utility)object4).getCurrentUIModeType((Context)object2);
                    if (n3 == n10) {
                        int n25 = 3500;
                    } else {
                        n3 = 640;
                        int n26 = 640;
                    }
                    object4 = "Connection type is LAN/wifi and max bit rate is: ";
                    object3 = new StringBuilder((String)object4);
                    ((StringBuilder)object3).append((int)var15_36);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                }
                object = CollectionsKt.m0((Collection)object);
                object2 = o.b((int)var15_37, (ArrayList)object);
                break block42;
            }
            Intrinsics.checkNotNullParameter("only 1 media file present", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            jioAds$LogLevel = object.get(0);
            if (jioAds$LogLevel != null) {
                object = object.get(0);
                object2 = object;
                object2 = (g)object;
            }
        }
        return object2;
    }
}

