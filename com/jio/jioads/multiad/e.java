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
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.controller.JioAdRequestGenerator;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.multiad.N;
import com.jio.jioads.multiad.c_0;
import com.jio.jioads.multiad.model.c;
import com.jio.jioads.multiad.model.h;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import com.jio.jioads.utils.Constants$HeaderKeys;
import com.jio.jioads.utils.Constants$ResponseHeaderKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e {
    public static ArrayList c;
    public static String d;
    public static ArrayList e;
    public int a = -1;
    public final HashMap b;

    public e() {
        HashMap hashMap;
        this.b = hashMap = new HashMap();
    }

    public static final void b(e object, Context context, String string2, HashMap serializable) {
        Object object2;
        Object object3;
        object.getClass();
        object = new JSONObject();
        Object object4 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
        if (serializable != null) {
            object3 = Constants$ResponseHeaderKeys.JIO_DATA;
            object2 = ((Constants$ResponseHeaderKeys)((Object)object3)).getResponseHeader();
            Locale locale = Locale.ROOT;
            object2 = ((String)object2).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
            boolean bl2 = ((HashMap)serializable).containsKey(object2);
            boolean bl3 = true;
            if (bl2 == bl3) {
                object3 = ((Constants$ResponseHeaderKeys)((Object)object3)).getResponseHeader().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                object3 = (String)((HashMap)serializable).get(object3);
                bl2 = TextUtils.isEmpty((CharSequence)object3);
                if (!bl2) {
                    Intrinsics.checkNotNull(object3);
                    object2 = new JSONObject((String)object3);
                    object3 = "blk";
                    object2 = object2.optString((String)object3);
                    boolean bl4 = TextUtils.isEmpty((CharSequence)object2);
                    if (!bl4) {
                        object.put((String)object3, object2);
                    }
                }
            }
        }
        if (serializable != null) {
            object3 = Constants$HeaderKeys.JIO_DATA.getKey();
            object2 = Locale.ROOT;
            object3 = ((String)object3).toLowerCase((Locale)object2);
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            object = object.toString();
            serializable.put(object3, object);
        }
        if (serializable != null) {
            int n3 = com.jio.jioads.utils.e.f((Map)((Object)serializable));
            try {
                object = n3;
            }
            catch (Exception exception) {
                serializable = new StringBuilder("Invalid X-Jio-Block number received ");
                object4 = Utility.INSTANCE;
                com.jio.jioads.jioreel.tracker.model.b.c((Utility)object4, exception, (StringBuilder)serializable);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                n3 = 0;
                object = 0;
            }
        } else {
            boolean bl5 = false;
            object = null;
        }
        N.f(context, string2, (Integer)object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void a(Context context, String string2, h h3, JSONArray jSONArray) {
        Object object;
        block48: {
            Ref$ObjectRef ref$ObjectRef;
            block49: {
                block51: {
                    long l2;
                    long l3;
                    long l4;
                    int n3;
                    Object object2;
                    boolean bl2;
                    String string3;
                    Object object3;
                    Object object4;
                    Object object5;
                    Object object6;
                    int n4;
                    Object object7;
                    Object object8;
                    int n7;
                    int n8;
                    h h5;
                    String string4;
                    Context context2;
                    e e2;
                    block53: {
                        block52: {
                            int n10;
                            block50: {
                                int n14;
                                e2 = this;
                                context2 = context;
                                string4 = string2;
                                h5 = h3;
                                Intrinsics.checkNotNullParameter(context, "context");
                                Intrinsics.checkNotNullParameter(string2, "packageName");
                                object = "Inside prefetch multiad";
                                j.a((String)object);
                                n8 = this.a;
                                n7 = 1;
                                this.a = n8 += n7;
                                if (h3 == null || n8 >= (n14 = jSONArray.length())) break block48;
                                ref$ObjectRef = new Ref$ObjectRef();
                                n8 = this.a;
                                object = jSONArray.get(n8);
                                if (object != null) {
                                    object = object.toString();
                                } else {
                                    n8 = 0;
                                    object = null;
                                }
                                ref$ObjectRef.element = object;
                                if (object == null || (n8 = ((String)object).length()) == 0 || (object = h5.a) == null || (n8 = (int)(((HashMap)object).containsKey(object8 = ref$ObjectRef.element) ? 1 : 0)) != n7) break block49;
                                object = new StringBuilder();
                                object8 = (String)ref$ObjectRef.element;
                                ((StringBuilder)object).append((String)object8);
                                ((StringBuilder)object).append(": Checking prefetching for adspotId");
                                j.a(((StringBuilder)object).toString());
                                object = h5.a;
                                Intrinsics.checkNotNull(object);
                                object8 = ref$ObjectRef.element;
                                object = (com.jio.jioads.multiad.model.e)((HashMap)object).get(object8);
                                object8 = c;
                                if (object8 == null) break block50;
                                Intrinsics.checkNotNull(object8);
                                object7 = ref$ObjectRef.element;
                                n4 = ((ArrayList)object8).contains(object7);
                                if (n4 != 0) break block51;
                            }
                            if (object == null || (object8 = ((com.jio.jioads.multiad.model.e)object).b) == null || (object8 = ((c)object8).d) == null || (n4 = ((Integer)object8).intValue()) != n7) break block51;
                            object8 = (String)ref$ObjectRef.element;
                            object7 = new StringBuilder();
                            ((StringBuilder)object7).append((String)object8);
                            ((StringBuilder)object7).append(": Inside shouldPlacePrefetchRequest");
                            object7 = ((StringBuilder)object7).toString();
                            object6 = "message";
                            Intrinsics.checkNotNullParameter(object7, (String)object6);
                            object7 = JioAds.Companion;
                            ((JioAds$Companion)object7).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object5 = JioAds$LogLevel.NONE;
                            object4 = null;
                            object3 = "";
                            object5 = j_0.d(context2, "multiad_pref", 0, object3, (String)object8);
                            string3 = "null cannot be cast to non-null type kotlin.String";
                            Intrinsics.checkNotNull(object5, string3);
                            object5 = (String)object5;
                            bl2 = kotlin.text.b.k((CharSequence)object5) ^ true;
                            if (!bl2) break block52;
                            object2 = new JSONObject((String)object5);
                            boolean bl3 = object2.has((String)(object5 = "vr"));
                            if (!bl3) break block53;
                            n3 = object2.optInt((String)object5);
                            object5 = ((com.jio.jioads.multiad.model.e)object).b;
                            if (object5 != null && (object5 = ((c)object5).b) != null) {
                                n10 = (Integer)object5;
                            } else {
                                n10 = 0;
                                object5 = null;
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append((String)object8);
                            stringBuilder.append(": multiadver: ");
                            stringBuilder.append(n3);
                            object4 = " & masterconfigvr: ";
                            stringBuilder.append((String)object4);
                            stringBuilder.append(n10);
                            String string5 = stringBuilder.toString();
                            com.jio.jioads.jioreel.tracker.model.b.g(string5, (JioAds$Companion)object7);
                            if (n3 != n10) break block53;
                            break block51;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String)object8);
                        object2 = ": Multiad response not available";
                        stringBuilder.append((String)object2);
                        Intrinsics.checkNotNullParameter(stringBuilder.toString(), (String)object6);
                        JioAds jioAds = ((JioAds$Companion)object7).getInstance();
                        jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    }
                    if ((n7 = (int)((l4 = (l3 = N.a(context2, (String)object8)) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) > 0) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)object8);
                        String string6 = ": Prefetching blocked for adspot";
                        ((StringBuilder)object).append(string6);
                        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object6);
                        object = ((JioAds$Companion)object7).getInstance();
                        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    } else {
                        int n15;
                        void var27_49;
                        void var27_45;
                        d = (String)ref$ObjectRef.element;
                        String string7 = kp1_0.c("config_level_te_", string4);
                        Object object9 = j_0.d(context2, "master_config_pref", 0, object3, string7);
                        Intrinsics.checkNotNull(object9, string3);
                        String string8 = (String)object9;
                        object2 = new StringBuilder();
                        object8 = (String)ref$ObjectRef.element;
                        ((StringBuilder)object2).append((String)object8);
                        object8 = ": te value taken from app level ";
                        ((StringBuilder)object2).append((String)object8);
                        ((StringBuilder)object2).append(string8);
                        object2 = ((StringBuilder)object2).toString();
                        j.a((String)object2);
                        n3 = (int)(kotlin.text.b.k(string8) ? 1 : 0);
                        n4 = 1;
                        if ((n3 ^= n4) != 0 || (n3 = (int)(Intrinsics.areEqual(string8, object2 = "0") ? 1 : 0)) != 0) {
                            object2 = ((com.jio.jioads.multiad.model.e)object).b;
                            if (object2 != null) {
                                object8 = ((c)object2).c;
                            } else {
                                n4 = 0;
                                object8 = null;
                            }
                            if (object8 != null) {
                                void var27_43;
                                if (object2 != null) {
                                    Integer n16 = ((c)object2).c;
                                } else {
                                    n7 = 0;
                                    Object var27_42 = null;
                                }
                                String string9 = String.valueOf(var27_43);
                                object2 = new StringBuilder();
                                object8 = (String)ref$ObjectRef.element;
                                ((StringBuilder)object2).append((String)object8);
                                object8 = ":te value taken from adspot level ";
                                ((StringBuilder)object2).append((String)object8);
                                ((StringBuilder)object2).append(string9);
                                object2 = ((StringBuilder)object2).toString();
                                j.a((String)object2);
                            }
                        }
                        object5 = var27_45;
                        c c2 = ((com.jio.jioads.multiad.model.e)object).b;
                        if (c2 != null) {
                            Integer n17 = c2.e;
                        } else {
                            n7 = 0;
                            Object var27_48 = null;
                        }
                        if (var27_49 != null && (n3 = var27_49.intValue()) == (n4 = 1)) {
                            JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL;
                        } else if (var27_49 != null && (n3 = var27_49.intValue()) == (n4 = 5)) {
                            JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                        } else if (var27_49 != null && (n3 = var27_49.intValue()) == (n4 = 7)) {
                            JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.INFEED;
                        } else if (var27_49 != null && (n3 = var27_49.intValue()) == (n4 = 8)) {
                            JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.CONTENT_STREAM;
                        } else if (var27_49 != null && (n3 = var27_49.intValue()) == (n4 = 9)) {
                            JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL;
                        } else if (var27_49 != null && (n3 = var27_49.intValue()) == (n4 = 10)) {
                            JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                        } else if (var27_49 != null && (n7 = var27_49.intValue()) == (n3 = 11)) {
                            JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_AUDIO;
                        } else {
                            n7 = 0;
                            Object var27_57 = null;
                        }
                        object2 = (String)ref$ObjectRef.element;
                        object8 = e2.b;
                        boolean bl4 = ((HashMap)object8).containsKey(object2);
                        if (!bl4) {
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append((String)object2);
                            String string10 = ": throttle adspotId not present";
                            ((StringBuilder)object3).append(string10);
                            object3 = ((StringBuilder)object3).toString();
                            Intrinsics.checkNotNullParameter(object3, (String)object6);
                            ((JioAds$Companion)object7).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            n15 = 0;
                            object6 = null;
                            object7 = 0;
                            ((HashMap)object8).put(object2, object7);
                            object8 = 0;
                        } else {
                            n15 = 0;
                            object6 = null;
                            object7 = (Integer)((HashMap)object8).get(object2);
                            if (object7 != null) {
                                int n18 = (Integer)object7;
                                int n19 = 1;
                                int n20 = n18 + n19;
                                object7 = n20;
                            } else {
                                boolean bl5 = false;
                                object7 = null;
                            }
                            ((HashMap)object8).put(object2, object7);
                            object8 = object7;
                        }
                        if (object8 != null) {
                            n4 = (Integer)object8;
                        } else {
                            n4 = 0;
                            object8 = null;
                        }
                        object2 = N.b((String)object2, n4, (com.jio.jioads.multiad.model.e)object);
                        object8 = new StringBuilder();
                        object7 = (String)ref$ObjectRef.element;
                        ((StringBuilder)object8).append((String)object7);
                        ((StringBuilder)object8).append(" :Selected domain ");
                        ((StringBuilder)object8).append(object2);
                        object7 = " Domain name: ";
                        ((StringBuilder)object8).append((String)object7);
                        if (object2 != null) {
                            object7 = (String)((Pair)object2).a;
                        } else {
                            boolean bl6 = false;
                            object7 = null;
                        }
                        ((StringBuilder)object8).append((String)object7);
                        object7 = " request method: ";
                        ((StringBuilder)object8).append((String)object7);
                        if (object2 != null) {
                            object7 = (Integer)((Pair)object2).b;
                        } else {
                            boolean bl7 = false;
                            object7 = null;
                        }
                        ((StringBuilder)object8).append(object7);
                        object8 = ((StringBuilder)object8).toString();
                        j.a((String)object8);
                        if (object2 != null) {
                            object8 = (String)((Pair)object2).a;
                        } else {
                            n4 = 0;
                            object8 = null;
                        }
                        object7 = "NO_FILL";
                        n4 = (int)(Intrinsics.areEqual(object8, object7) ? 1 : 0);
                        if (n4 == 0) {
                            if (object2 != null) {
                                object8 = (String)((Pair)object2).a;
                            } else {
                                n4 = 0;
                                object8 = null;
                            }
                            object7 = "BACKUP_AD";
                            n4 = (int)(Intrinsics.areEqual(object8, object7) ? 1 : 0);
                            if (n4 == 0) {
                                void var27_58;
                                Object object10;
                                object8 = new JioAdRequestGenerator(context2);
                                if (object2 != null) {
                                    object10 = object7 = (String)((Pair)object2).a;
                                } else {
                                    bl2 = false;
                                    object10 = null;
                                }
                                object3 = object7 = ref$ObjectRef.element;
                                object3 = (String)object7;
                                boolean bl8 = Utility.INSTANCE.isSystemApp$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(context2);
                                boolean bl9 = true;
                                Object var21_24 = null;
                                object4 = null;
                                String string11 = "";
                                object6 = object10;
                                object10 = string2;
                                void var38_85 = var27_58;
                                Pair pair = ((JioAdRequestGenerator)object8).getAdRequestData(bl9, (String)object6, (String)object5, (String)object3, null, null, string2, (JioAdView$AD_TYPE)var27_58, null, null, null, null, null, null, null, null, bl8, null, false, null, string11);
                                object8 = new StringBuilder();
                                object7 = (String)ref$ObjectRef.element;
                                ((StringBuilder)object8).append((String)object7);
                                ((StringBuilder)object8).append(": prefetching for adspotId");
                                object8 = ((StringBuilder)object8).toString();
                                j.a((String)object8);
                                object7 = new com.jio.jioads.network.c(context2);
                                if (object2 != null) {
                                    object2 = (Number)((Pair)object2).b;
                                    n15 = n4 = ((Number)object2).intValue();
                                } else {
                                    n15 = 1;
                                }
                                object5 = object2 = pair.a;
                                object5 = (String)object2;
                                Object[] objectArray = (Object[])pair.b;
                                object3 = String.valueOf(objectArray[0]);
                                n3 = 1;
                                Object object11 = objectArray[n3];
                                Intrinsics.checkNotNull(object11, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String?, kotlin.String?> }");
                                Object object12 = object11;
                                HashMap hashMap = (HashMap)object11;
                                object2 = object;
                                object = object10;
                                e e5 = this;
                                context2 = context;
                                string4 = string2;
                                h5 = h3;
                                object10 = new c_0(this, context, ref$ObjectRef, (com.jio.jioads.multiad.model.e)object2, string2, h3, jSONArray);
                                n8 = 20;
                                object4 = n8;
                                Boolean bl10 = Boolean.FALSE;
                                ((com.jio.jioads.network.c)object7).b(n15, (String)object5, (String)object3, hashMap, (Integer)object4, (NetworkTaskListener)object10, bl10);
                                return;
                            }
                        }
                        object = new StringBuilder();
                        String string12 = (String)ref$ObjectRef.element;
                        ((StringBuilder)object).append(string12);
                        String string13 = ": Prefetching not required as per domain selection";
                        ((StringBuilder)object).append(string13);
                        object = ((StringBuilder)object).toString();
                        j.a((String)object);
                        return;
                    }
                }
                object = new StringBuilder();
                String string14 = (String)ref$ObjectRef.element;
                ((StringBuilder)object).append(string14);
                String string15 = ": Prefetching not required";
                ((StringBuilder)object).append(string15);
                object = ((StringBuilder)object).toString();
                j.a((String)object);
                this.a(context, string2, h3, jSONArray);
                return;
            }
            object = new StringBuilder();
            String string16 = (String)ref$ObjectRef.element;
            ((StringBuilder)object).append(string16);
            String string17 = ": Master config does not contain adspot";
            ((StringBuilder)object).append(string17);
            object = ((StringBuilder)object).toString();
            j.a((String)object);
            this.a(context, string2, h3, jSONArray);
            return;
        }
        object = "Prefetching finished";
        j.a((String)object);
    }
}

