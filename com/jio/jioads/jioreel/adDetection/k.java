/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.jio.jioads.jioreel.adDetection;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsTracker;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.cdnlogging.a;
import com.jio.jioads.instreamads.vastparser.model.CtaUrl;
import com.jio.jioads.jioreel.adDetection.HLSAdDetector$task$1;
import com.jio.jioads.jioreel.adDetection.f;
import com.jio.jioads.jioreel.adDetection.j;
import com.jio.jioads.jioreel.d;
import com.jio.jioads.jioreel.data.JioReelAdMetaData;
import com.jio.jioads.jioreel.data.StreamType;
import com.jio.jioads.jioreel.data.c;
import com.jio.jioads.jioreel.listeners.JioReelListener;
import com.jio.jioads.jioreel.network.b;
import com.jio.jioads.jioreel.ssai.e;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.util.Utility;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k
extends com.jio.jioads.jioreel.ssai.f {
    public long A;
    public long B;
    public String C;
    public List D;
    public int E;
    public boolean F;
    public boolean G;
    public final String H;
    public long I;
    public long J;
    public long K;
    public String L;
    public boolean M;
    public final HashMap N;
    public final HLSAdDetector$task$1 O;
    public final ExoPlayer j;
    public final HashMap k;
    public final StreamType l;
    public final HashMap m;
    public final com.jio.jioads.jioreel.data.e n;
    public String o;
    public com.jio.jioads.instreamads.vastparser.model.j p;
    public String q;
    public final LinkedHashMap r;
    public String s;
    public String t;
    public boolean u;
    public boolean v;
    public Integer w;
    public final ArrayList x;
    public final ArrayList y;
    public final ArrayList z;

    public k(ExoPlayer object, HashMap object2, JioReelListener object3, Context object4, StreamType object5, HashMap object6, com.jio.jioads.jioreel.data.e object7) {
        boolean bl2;
        boolean bl3;
        boolean n3;
        boolean bl4;
        Intrinsics.checkNotNullParameter(object3, "jioReelListener");
        Object object8 = "context";
        Intrinsics.checkNotNullParameter(object4, (String)object8);
        super((Context)object4, (JioReelListener)object3);
        this.j = object;
        this.k = object2;
        this.l = object5;
        this.m = object6;
        this.n = object7;
        object = new LinkedHashMap();
        this.r = object;
        super();
        this.x = object;
        super();
        this.y = object;
        super();
        this.z = object;
        this.C = "";
        super();
        this.D = object;
        this.H = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        super();
        this.N = object;
        this.O = object = new HLSAdDetector$task$1(this, (JioReelListener)object3);
        object4 = "message";
        Intrinsics.checkNotNullParameter("Inside Init of HLSAdDetector", (String)object4);
        object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object5 = JioAds$LogLevel.NONE;
        if (object2 != null && (bl4 = (n3 = ((HashMap)object2).isEmpty()) ^ (bl3 = true)) == bl3) {
            long l2;
            object6 = "init adDetailsMap ";
            object5 = new StringBuilder((String)object6);
            ((StringBuilder)object5).append(object2);
            Intrinsics.checkNotNullParameter(((StringBuilder)object5).toString(), (String)object4);
            ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Intrinsics.checkNotNull(object2);
            object5 = "X-AD-VAST";
            boolean bl5 = ((HashMap)object2).containsKey(object5);
            if (bl5) {
                Intrinsics.checkNotNull(object2);
                object5 = (String)((HashMap)object2).get(object5);
                object6 = new f(this, (String)object5);
                object7 = "vastParseListener";
                Intrinsics.checkNotNullParameter(object6, (String)object7);
                if (object5 != null) {
                    com.jio.jioads.jioreel.tracker.model.b.g("VAST URL ".concat((String)object5), (JioAds$Companion)object3);
                    object7 = new b();
                    object8 = new e(this, (com.jio.jioads.jioreel.vast.interfaces.a)object6);
                    int n4 = 8;
                    ((b)object7).a(n4, (String)object5, (Function1)object8);
                }
            }
            Intrinsics.checkNotNull(object2);
            object5 = "X-AD-POD-SIZE";
            boolean bl6 = ((HashMap)object2).containsKey(object5);
            if (bl6) {
                Intrinsics.checkNotNull(object2);
                object5 = (String)((HashMap)object2).get(object5);
                if (object5 != null) {
                    int n7 = Integer.parseInt((String)object5);
                    object5 = n7;
                } else {
                    boolean bl7 = false;
                    object5 = null;
                }
                this.w = object5;
            }
            Intrinsics.checkNotNull(object2);
            object5 = (String)((HashMap)object2).get("START-DATE");
            Intrinsics.checkNotNull(object2);
            object6 = "PLANNED-DURATION";
            object2 = (String)((HashMap)object2).get(object6);
            this.A = l2 = this.i((String)object5, (String)object2);
            this.B = l2;
            object2 = new StringBuilder("AdPodSize: ");
            object5 = this.w;
            ((StringBuilder)object2).append(object5);
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), (String)object4);
            ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = "FinalEndTime: ";
            object2 = new StringBuilder((String)object5);
            l2 = this.A;
            ((StringBuilder)object2).append(l2);
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), (String)object4);
            object2 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            this.f();
            this.M = bl2 = Utility.ifOmSdkIsAvailable();
        }
        Intrinsics.checkNotNullParameter("perform ad detection for SSAI ad", (String)object4);
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        this.f();
        object2 = "Inside detectAd";
        v12.a((String)object2, (String)object4, (JioAds$Companion)object3);
        bl2 = this.G;
        if (!bl2) {
            this.f();
            object2 = this.c;
            if (object2 != null) {
                object2.post((Runnable)object);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JioReelAdMetaData j(k k2, String string2, String object, long l2, String string3, boolean bl2, AdMetaData$AdParams adMetaData$AdParams, int n3, int n4) {
        Exception exception2;
        Object object2;
        block19: {
            int n7;
            Object object3;
            boolean bl3;
            String string4;
            long l3;
            Object object4;
            block21: {
                block20: {
                    int n8;
                    int n10;
                    block18: {
                        n10 = n4 & 2;
                        object4 = n10 != 0 ? "" : object;
                        int n14 = n4 & 4;
                        l3 = n14 != 0 ? 0L : l2;
                        int n15 = n4 & 8;
                        object2 = null;
                        if (n15 != 0) {
                            n15 = 0;
                            string4 = null;
                        } else {
                            string4 = string3;
                        }
                        n8 = n4 & 0x10;
                        bl3 = false;
                        n8 = n8 != 0 ? 0 : (int)(bl2 ? 1 : 0);
                        int n16 = n4 & 0x20;
                        if (n16 != 0) {
                            n16 = 0;
                            object3 = null;
                        } else {
                            object3 = adMetaData$AdParams;
                        }
                        n7 = n4 & 0x40;
                        n7 = n7 != 0 ? 1 : n3;
                        k2.getClass();
                        if (object3 == null) {
                            block17: {
                                try {
                                    object3 = com.jio.jioads.jioreel.ssai.p.t;
                                    if (object3 == null || (object3 = ((p)object3).p) == null) break block17;
                                    object3 = object4 = ((JioAdsTracker)object3).getAdParams(string2, (String)object4);
                                    break block18;
                                }
                                catch (Exception exception2) {
                                    break block19;
                                }
                            }
                            n16 = 0;
                            object3 = null;
                        }
                    }
                    if (n8 != 0) break block20;
                    if (object3 != null && (object4 = ((AdMetaData$AdParams)object3).getCtaUrl()) != null) {
                        object4 = ((CtaUrl)object4).getDeeplink();
                    } else {
                        n10 = 0;
                        object4 = null;
                    }
                    if (object4 != null && (n10 = ((String)object4).length()) != 0) break block20;
                    if (object3 != null && (object4 = ((AdMetaData$AdParams)object3).getCtaUrl()) != null) {
                        object4 = ((CtaUrl)object4).getFallback();
                    } else {
                        n10 = 0;
                        object4 = null;
                    }
                    if (object4 != null && (n10 = ((String)object4).length()) != 0) break block20;
                    if (object3 != null) {
                        object4 = ((AdMetaData$AdParams)object3).getSecondaryCtaUrl();
                    } else {
                        n10 = 0;
                        object4 = null;
                    }
                    if (object4 == null || (n10 = ((String)object4).length()) == 0) break block21;
                }
                bl3 = true;
            }
            object = object4;
            n3 = bl3;
            object4 = new JioReelAdMetaData(string2, string4, n7, l3, bl3, (AdMetaData$AdParams)object3);
            return object4;
        }
        CharSequence charSequence = new StringBuilder("Error in getting meta data ");
        String string5 = exception2.getLocalizedMessage();
        charSequence.append(string5);
        char c2 = ',';
        charSequence.append(c2);
        charSequence.append(exception2);
        Object object5 = charSequence.toString();
        charSequence = "message";
        Intrinsics.checkNotNullParameter(object5, (String)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object5 = JioAds$LogLevel.NONE;
        return object2;
    }

    public static long o(long l2, String object) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = simpleDateFormat.parse((String)object);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int n3 = (int)l2;
        calendar.add(14, n3);
        Object object2 = calendar.getTime();
        object2 = simpleDateFormat.format((Date)object2);
        CharSequence charSequence = kp1_0.c("merc Original Timestamp: ", (String)object);
        object = System.out;
        ((PrintStream)object).println(charSequence);
        charSequence = new StringBuilder("merc Updated Timestamp: ");
        ((StringBuilder)charSequence).append((String)object2);
        charSequence = ((StringBuilder)charSequence).toString();
        ((PrintStream)object).println(charSequence);
        return simpleDateFormat.parse((String)object2).getTime();
    }

    public static long p(String object) {
        long l2;
        int n3;
        Object object2;
        int n4 = 1;
        if (object != null) {
            object2 = new char[n4];
            object2[0] = n3 = 46;
            object = StringsKt.Z((CharSequence)object, (char[])object2);
        } else {
            object = null;
        }
        if (object != null) {
            int n7 = object.size();
            n3 = 1000;
            if (n7 > n4) {
                int n8;
                object2 = (String)object.get(n4);
                String string2 = (String)object.get(n4);
                if ((n4 = string2.length()) > (n8 = 2)) {
                    object2 = ((String)object2).substring(0, n8);
                    string2 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                }
                object = (String)object.get(0);
                long l3 = Long.parseLong((String)object);
                long l4 = n3;
                l2 = Long.parseLong((String)object2) + (l3 *= l4);
            } else {
                object = (String)object.get(0);
                long l7 = Long.parseLong((String)object);
                l2 = (long)n3 * l7;
            }
        } else {
            l2 = 0L;
        }
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long i(String object, String string2) {
        Exception exception2;
        long l2;
        block5: {
            Object object2;
            SimpleDateFormat simpleDateFormat;
            block4: {
                block3: {
                    long l3 = com.jio.jioads.jioreel.adDetection.k.p(string2);
                    String string3 = this.H;
                    simpleDateFormat = new SimpleDateFormat(string3);
                    l2 = 0L;
                    try {
                        Date date = simpleDateFormat.parse((String)object);
                        String string4 = "parse(...)";
                        Intrinsics.checkNotNullExpressionValue(date, string4);
                        if (string2 == null) break block3;
                        long l4 = date.getTime() + l3;
                        object2 = new Date(l4);
                        object2 = simpleDateFormat.format((Date)object2);
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                object2 = null;
            }
            if (object2 != null) {
                object2 = simpleDateFormat.parse((String)object2);
                return ((Date)object2).getTime();
            }
            return l2;
        }
        StringBuilder stringBuilder = new StringBuilder("Error with getEndTime ");
        stringBuilder.append((String)object);
        char c2 = ' ';
        stringBuilder.append(c2);
        stringBuilder.append(string2);
        stringBuilder.append(c2);
        object = exception2.getLocalizedMessage();
        stringBuilder.append((String)object);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        return l2;
    }

    public final void k(long l2, String string2) {
        Object object;
        block2: {
            boolean bl2;
            Intrinsics.checkNotNullParameter(string2, "dateRangeId");
            Iterator iterator = this.z.iterator();
            while (bl2 = iterator.hasNext()) {
                long l3;
                long l4;
                long l7;
                long l8;
                Object object2 = object = iterator.next();
                object2 = (c)object;
                String string3 = ((c)object2).a;
                boolean bl3 = Intrinsics.areEqual(string3, string2);
                if (!bl3 || (l8 = (l7 = (l4 = ((c)object2).c) - (l3 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) continue;
                break block2;
            }
            bl2 = false;
            object = null;
        }
        object = (c)object;
        if (object != null) {
            ((c)object).c = l2;
            Object object3 = new StringBuilder("Adding end time for ad ");
            object3.append(object);
            object3 = object3.toString();
            String string4 = "message";
            Intrinsics.checkNotNullParameter(object3, string4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
        }
    }

    public final void l(com.jio.jioads.jioreel.data.d object) {
        Object object2;
        boolean bl2;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "model");
        Object object4 = this.y;
        int n3 = object4 instanceof Collection;
        if (n3 == 0 || (n3 = ((ArrayList)object4).isEmpty()) == 0) {
            object3 = ((ArrayList)object4).iterator();
            while (bl2 = object3.hasNext()) {
                object2 = (com.jio.jioads.jioreel.data.d)object3.next();
                long l2 = ((com.jio.jioads.jioreel.data.d)object2).b;
                long l3 = ((com.jio.jioads.jioreel.data.d)object).b;
                long l4 = l2 - l3;
                Object object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object5 != false) continue;
                break;
            }
        } else {
            object3 = new StringBuilder("adding model data: ");
            ((StringBuilder)object3).append(object);
            object3 = ((StringBuilder)object3).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object3, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            ((ArrayList)object4).add(object);
            object4 = com.jio.jioads.jioreel.ssai.p.t;
            if (object4 != null && (object4 = ((p)object4).p) != null) {
                n3 = 2;
                bl2 = false;
                object2 = null;
                object = ((com.jio.jioads.jioreel.data.d)object).c;
                JioAdsTracker.fetchAdTrackers$default((JioAdsTracker)object4, (String)object, null, n3, null);
            }
        }
    }

    public final void m(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "subAdDetailsMap");
        Object object = new StringBuilder("subsequentDateRange ");
        object.append(hashMap);
        object.append(" and size is ");
        ArrayList arrayList = this.x;
        int n3 = arrayList.size();
        object.append(n3);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        arrayList.add(hashMap);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(HashMap hashMap, long l2) {
        Enum enum_;
        Object object;
        boolean bl2;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        String string2;
        Object object6;
        String string3;
        Object object7;
        Object object8;
        String string4;
        Object object9;
        String string5;
        k k2;
        block8: {
            int n3;
            k2 = this;
            Object object10 = hashMap;
            int n4 = 1;
            string5 = "getString(...)";
            String string6 = "|";
            object9 = "custom_vast_data";
            string4 = "identifiers";
            Intrinsics.checkNotNullParameter(hashMap, "adDetailsMap");
            object8 = new StringBuilder("Adding Creative Signal ");
            object8.append(hashMap);
            object8 = object8.toString();
            object7 = "message";
            Intrinsics.checkNotNullParameter(object8, object7);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object8 = JioAds$LogLevel.NONE;
            string3 = "#EXT-X-DATERANGE:ID";
            try {
                object6 = string3 = hashMap.get(string3);
                object6 = string3;
                string3 = "DURATION";
                string3 = hashMap.get(string3);
                string2 = "X-AD-CREATIVE-SIGNALING";
                object10 = hashMap.get(string2);
                object10 = (String)object10;
                object5 = new JSONObject((String)object10);
                boolean bl3 = object5.has(string4);
                if (!bl3) return;
                object10 = object5.getJSONArray(string4);
                n3 = object10.length();
                object5 = null;
                string2 = null;
                object4 = null;
            }
            catch (Exception exception) {
                string6 = null;
                break block8;
            }
            for (int n7 = 0; n7 < n3; object3 = object3.getString((String)object9), n7 += n4) {
                object3 = object10.getJSONObject(n7);
                object4 = object3.getString((String)object9);
                object2 = "";
                Intrinsics.checkNotNull(object4);
                bl2 = StringsKt.F(object4, string6, false);
                if (bl2) {
                    object2 = new String[]{string6};
                    int n8 = 6;
                    object8 = StringsKt.a0(object4, object2, false, 0, n8);
                    object4 = object8.get(0);
                    object8 = object8.get(n4);
                    object2 = object8;
                    object2 = (String)object8;
                }
                object5 = "ad_position";
                object5 = object3.getString((String)object5);
                Intrinsics.checkNotNullExpressionValue(object5, string5);
                Intrinsics.checkNotNull(object4);
                Intrinsics.checkNotNullExpressionValue(object3, string5);
                object8 = new com.jio.jioads.jioreel.data.b((String)object5, (String)object4, (String)object3, (String)object2);
                object4 = object8;
                object5 = null;
            }
            Intrinsics.checkNotNull(string3);
            double d2 = Double.parseDouble(string3);
            object5 = object10;
            object8 = object4;
            object10 = new c((String)object6, l2, d2, (com.jio.jioads.jioreel.data.b)object4);
            object = k2.z;
            ((ArrayList)object).add(object10);
            object = new StringBuilder();
            string5 = "Added creative signal ";
            ((StringBuilder)object).append(string5);
            ((StringBuilder)object).append(object10);
            object10 = ((StringBuilder)object).toString();
            Intrinsics.checkNotNullParameter(object10, object7);
            object10 = JioAds.Companion;
            object10 = ((JioAds$Companion)object10).getInstance();
            ((JioAds)object10).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object10 = JioAds$LogLevel.NONE;
            if (object4 == null) return;
            object10 = com.jio.jioads.jioreel.ssai.p.t;
            if (object10 == null) return;
            object10 = ((p)object10).p;
            if (object10 == null) return;
            object = ((com.jio.jioads.jioreel.data.b)object4).b;
            int n10 = 2;
            string6 = null;
            try {
                JioAdsTracker.fetchAdTrackers$default((JioAdsTracker)object10, (String)object, null, n10, null);
                return;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        object = new StringBuilder("Error adding creative signal  ");
        string5 = ((Throwable)((Object)enum_)).getLocalizedMessage();
        ((StringBuilder)object).append(string5);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), object7);
        Intrinsics.checkNotNullParameter(enum_, "throwable");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        enum_ = JioAds$LogLevel.NONE;
        object9 = Utility.INSTANCE;
        object7 = com.jio.jioads.cdnlogging.d.a;
        enum_ = JioAdError$JioAdErrorType.SPOT_AD;
        string3 = ((JioAdError$JioAdErrorType)enum_).getErrorTitle();
        object = com.jio.jioads.jioreel.ssai.p.t;
        if (object != null) {
            object8 = new a();
            object6 = object8;
        } else {
            object6 = null;
        }
        object3 = Boolean.FALSE;
        object = k2.a;
        object4 = object.getPackageName();
        object2 = ((JioAdError$JioAdErrorType)enum_).getErrorCode();
        object8 = "";
        object5 = "Exception while adding Date range";
        string4 = k2.a;
        string2 = "HLSAdDetector-addDateRangeCreativeSignal";
        bl2 = false;
        ((Utility)object9).logError((Context)string4, (String)object8, (com.jio.jioads.cdnlogging.d)((Object)object7), string3, (String)object5, (a)object6, string2, (Boolean)object3, (String)object4, (String)object2, false);
    }

    public final void q() {
        long l2;
        Object object = "message";
        Intrinsics.checkNotNullParameter("Inside clearVodAdData", (String)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        this.e();
        object2 = this.m;
        if (object2 != null) {
            object = this.o;
            object2 = (com.jio.jioads.jioreel.vod.a)TypeIntrinsics.asMutableMap(object2).remove(object);
        }
        object2 = null;
        this.o = null;
        object = null;
        this.v = false;
        this.p = null;
        this.q = null;
        this.u = false;
        this.d.clear();
        this.A = l2 = 0L;
        this.s = null;
        this.t = null;
        HashMap hashMap = this.N;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.h = null;
        object2 = this.j;
        if (object2 == null) {
            object2 = this.b;
            object2.onAdDetection(false);
        }
        this.h();
        object = Looper.getMainLooper();
        object2 = new Handler((Looper)object);
        object = new cx1_2(this, 1);
        object2.post((Runnable)object);
    }

    public final void r(String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "adId");
        this.e = bl2 = true;
        l_0.h("invoke trackers for tracker.json ", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = com.jio.jioads.jioreel.ssai.p.t;
        if (object != null && (object = ((p)object).p) != null) {
            int n3 = 2;
            JioAdsTracker.fetchAdTrackers$default((JioAdsTracker)object, string2, null, n3, null);
        }
    }

    public final void s(String object) {
        l_0.h("Inside setAlternateDuration: ", (String)object);
        JioAds$Companion jioAds$Companion = JioAds.Companion;
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = this.k;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            String string2 = "START-DATE";
            Object v4 = ((HashMap)object2).get(string2);
            if (v4 != null) {
                long l2;
                Intrinsics.checkNotNull(object2);
                object2 = (String)((HashMap)object2).get(string2);
                this.B = l2 = this.i((String)object2, (String)object);
                object = new StringBuilder("altEndTime is: ");
                l2 = this.B;
                ((StringBuilder)object).append(l2);
                object = ((StringBuilder)object).toString();
                object2 = "message";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = jioAds$Companion.getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void t() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 50->60)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    public final boolean u() {
        return this.F;
    }

    public final void v() {
        int n3;
        this.M = n3 = Utility.ifOmSdkIsAvailable();
        Object object = this.a;
        String string2 = "common_prefs";
        Object object2 = j_0.d((Context)object, string2, 0, "", "vod_ad_details");
        String string3 = "null cannot be cast to non-null type kotlin.String";
        Intrinsics.checkNotNull(object2, string3);
        object2 = (String)object2;
        int n4 = ((String)object2).length();
        if (n4 != 0) {
            string3 = new JSONArray((String)object2);
            n3 = string3.length();
            for (int i3 = 0; i3 < n3; ++i3) {
                object = string3.getJSONObject(i3);
                string2 = object.optString("daterangeId");
                int n7 = object.optInt("playTime");
                String string4 = object.optString("vast");
                int n8 = object.optInt("time");
                String string5 = object.optString("pts");
                String string6 = object.optString("ts");
                object = this.r;
                Integer n10 = n7;
                Integer n14 = n8;
                d d2 = new d(string2, n10, string4, string5, string6, n14);
                ((HashMap)object).put(string2, d2);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void w() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [6 : 97->107)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    public final void x() {
        boolean bl2;
        Intrinsics.checkNotNullParameter("Inside release of HLSManifestReader", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        this.e();
        this.y();
        jioAds$LogLevel = null;
        this.G = false;
        this.F = bl2 = true;
        this.x.clear();
        Object object = this.N;
        if (object != null) {
            ((HashMap)object).clear();
        }
        bl2 = false;
        this.h = null;
        object = this.j;
        if (object == null) {
            object = this.b;
            object.onAdDetection(false);
        }
        this.h();
        object = Looper.getMainLooper();
        jioAds$LogLevel = new Handler((Looper)object);
        object = new j(this);
        jioAds$LogLevel.post((Runnable)object);
    }

    public final void y() {
        boolean bl2 = this.G;
        if (bl2) {
            Object object = this.j;
            HLSAdDetector$task$1 hLSAdDetector$task$1 = null;
            if (object == null) {
                object = this.b;
                object.onAdDetection(false);
            }
            this.G = false;
            object = this.c;
            if (object != null) {
                hLSAdDetector$task$1 = this.O;
                object.removeCallbacks((Runnable)hLSAdDetector$task$1);
            }
            object = this.c;
            hLSAdDetector$task$1 = null;
            if (object != null) {
                object.removeCallbacksAndMessages(null);
            }
            this.c = null;
        }
    }
}

