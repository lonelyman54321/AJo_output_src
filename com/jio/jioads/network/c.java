/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.network;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.i;
import com.jio.jioads.network.n;
import com.jio.jioads.util.Utility;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

public final class c {
    public Context a;
    public i b;

    public c(Context context) {
        this.a = context;
    }

    public final void a() {
        Object object = "message";
        Object object2 = this.b;
        if (object2 != null) {
            block13: {
                Object object3;
                block12: {
                    block11: {
                        object3 = ((i)object2).c;
                        if (object3 == null) break block11;
                        ((HashMap)object3).clear();
                    }
                    ((i)object2).c = null;
                    ((i)object2).f = null;
                    object3 = ((i)object2).k;
                    if (object3 == null) break block12;
                    object3.shutdownNow();
                }
                ((i)object2).k = null;
                object3 = ((i)object2).e;
                if (object3 == null) break block13;
                ((HashMap)object3).clear();
            }
            try {
                ((i)object2).e = null;
            }
            catch (Exception exception) {
                object2 = "Exception in Network task cancel";
                Intrinsics.checkNotNullParameter(object2, object);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
            catch (InterruptedException interruptedException) {
                object2 = "Interrupted exception in Network task cancel";
                Intrinsics.checkNotNullParameter(object2, object);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
        this.b = null;
        this.a = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(int n3, String string2, String string3, Map map2, Integer n4, NetworkTaskListener networkTaskListener, Boolean object) {
        Object object2;
        Object object3 = new StringBuilder("connectionHandler shouldUseVolley: ");
        ((StringBuilder)object3).append(object);
        Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), "message");
        object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        object4 = new StringBuilder("requestTimeOut makeRequest : ");
        ((StringBuilder)object4).append(n4);
        Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), "message");
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = n.c;
        Object object5 = "com.android.volley.toolbox.Volley";
        try {
            Class.forName((String)object5);
            object5 = "Volley library is available";
            object2 = "message";
            Intrinsics.checkNotNullParameter(object5, (String)object2);
            object5 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = Boolean.TRUE;
        }
        catch (ClassNotFoundException classNotFoundException) {
            object3 = "message";
            Intrinsics.checkNotNullParameter("Using Default network library for network call", (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
        boolean bl2 = Intrinsics.areEqual(object, object5);
        if (bl2) {
            object = "message";
            v12.a("Using Volley library for n/w task", (String)object, (JioAds$Companion)object3);
            string3 = this.a;
            if (string3 == null) return;
            // MONITORENTER : object4
            object = "context";
            Intrinsics.checkNotNullParameter(string3, (String)object);
            object = n.d;
            if (object == null) {
                object = new n((Context)string3);
                n.d = object;
            }
            object5 = n.d;
            // MONITOREXIT : object4
            if (object5 == null) return;
            ((n)object5).b(n3, string2, map2, n4, networkTaskListener);
            return;
        }
        object2 = map2;
        object2 = (HashMap)map2;
        object3 = object;
        object5 = string3;
        object = new i(n3, string3, (HashMap)object2, n4, networkTaskListener);
        this.b = object;
        Intrinsics.checkNotNull(object);
        ((i)object).e(string2);
    }

    public final void c(NetworkTaskListener networkTaskListener, String object, Boolean bl2) {
        Object object2;
        Object object3;
        int n3;
        Object object4;
        Object object5;
        int n4;
        block38: {
            int n7;
            block37: {
                Object object6;
                String string2;
                block36: {
                    block35: {
                        block34: {
                            int n8 = 1;
                            string2 = "message";
                            Intrinsics.checkNotNullParameter(object, "_url");
                            int n10 = ((String)object).length();
                            if (n10 <= 0) break block34;
                            n10 = ((String)object).length() - n8;
                            n4 = 0;
                            object5 = null;
                            boolean bl3 = false;
                            object4 = null;
                            while (n4 <= n10) {
                                n3 = !bl3 ? n4 : n10;
                                n3 = ((String)object).charAt(n3);
                                n7 = 32;
                                n3 = Intrinsics.compare(n3, n7);
                                n3 = n3 <= 0 ? 1 : 0;
                                if (!bl3) {
                                    if (n3 == 0) {
                                        bl3 = true;
                                        continue;
                                    }
                                    n4 += n8;
                                    continue;
                                }
                                if (n3 == 0) break;
                                n10 += -1;
                            }
                            n10 += n8;
                            object = ((String)object).subSequence(n4, n10);
                            object = object.toString();
                            object3 = " ";
                            object6 = new Regex((String)object3);
                            object3 = "%20";
                            object = ((Regex)object6).replace((CharSequence)object, (String)object3);
                        }
                        object6 = new StringBuilder();
                        object3 = "downloadVastRedirect url = ";
                        ((StringBuilder)object6).append((String)object3);
                        ((StringBuilder)object6).append((String)object);
                        object6 = ((StringBuilder)object6).toString();
                        Intrinsics.checkNotNullParameter(object6, string2);
                        object6 = JioAds.Companion;
                        object3 = ((JioAds$Companion)object6).getInstance();
                        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioAds$LogLevel.NONE;
                        object3 = new StringBuilder();
                        object5 = "downloadVastRedirect request header = ";
                        ((StringBuilder)object3).append((String)object5);
                        object5 = this.a;
                        if (object5 == null) break block35;
                        object4 = Utility.INSTANCE;
                        object5 = ((Utility)object4).getUserAgentHeader((Context)object5);
                        break block36;
                    }
                    n4 = 0;
                    object5 = null;
                }
                ((StringBuilder)object3).append(object5);
                object3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object3, string2);
                object6 = ((JioAds$Companion)object6).getInstance();
                ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = StringsKt.m0((CharSequence)object);
                object4 = object.toString();
                object = this.a;
                if (object == null) break block37;
                object6 = Utility.INSTANCE;
                object2 = object = ((Utility)object6).getUserAgentHeader((Context)object);
                break block38;
            }
            n7 = 0;
            object2 = null;
        }
        Integer n14 = 0;
        n4 = 0;
        object5 = null;
        n3 = 0;
        object3 = this;
        try {
            this.b(0, (String)object4, null, (Map)object2, n14, networkTaskListener, bl2);
        }
        catch (Exception exception) {
            object = "Exception in adrequest";
            networkTaskListener.onError(0, object, null);
        }
    }
}

