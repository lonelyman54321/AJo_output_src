/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.pm.PackageInfo
 *  android.database.Cursor
 *  android.net.ConnectivityManager
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.provider.Settings$Secure
 *  android.security.NetworkSecurityPolicy
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.adinterfaces;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$Environment;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.JioAdsMetadata$Builder;
import com.jio.jioads.adinterfaces.a;
import com.jio.jioads.adinterfaces.e_0;
import com.jio.jioads.adinterfaces.f_0;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.k_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.m_0;
import com.jio.jioads.adinterfaces.o_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.controller.JioAdRequestGenerator;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.multiad.N;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.user.c;
import com.jio.jioads.user.d;
import com.jio.jioads.user.e;
import com.jio.jioads.user.f;
import com.jio.jioads.user.g;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.Constants$GENDER;
import com.jio.jioads.utils.Constants$KIDS_PROTECTED;
import com.jio.retargeting.datastore.RetargetPref;
import java.io.File;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class JioAds {
    public static final JioAds$Companion Companion;
    public static JioAds H;
    public static boolean I;
    public String A;
    public Constants$GENDER B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String a;
    public JioAds$LogLevel b;
    public JioAds$Environment c;
    public Map d;
    public boolean e;
    public String f;
    public String g;
    public JioAdsMetadata h;
    public boolean i;
    public boolean j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public Constants$KIDS_PROTECTED w;
    public String x;
    public String y;
    public String z;

    static {
        JioAds$Companion jioAds$Companion;
        Companion = jioAds$Companion = new JioAds$Companion();
    }

    public JioAds() {
        Object object = JioAds$LogLevel.NONE;
        this.b = object;
        object = JioAds$Environment.PROD;
        this.c = object;
        this.f = object = "";
        this.g = object;
    }

    public /* synthetic */ JioAds(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final void a(Context context, JioAds object) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter("Sdk is already initialized but masterconfig is expired so fetching it", "message");
        Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = ((JioAds)object).f;
        N.d(context, (String)object, null, 28);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(SharedPreferences sharedPreferences2) {
        int n3;
        Iterator iterator;
        Object object;
        block4: {
            object = "message";
            try {
                iterator = sharedPreferences2.getAll();
                Intrinsics.checkNotNull(iterator);
                iterator = iterator.entrySet();
                iterator = iterator.iterator();
                break block4;
            }
            catch (Exception exception) {}
            Intrinsics.checkNotNullParameter("Exception while deleting media files", (String)object);
            object = Companion;
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Object object2 = JioAds$LogLevel.NONE;
            object2 = Utility.INSTANCE;
            String string2 = ((Utility)object2).printStacktrace(exception);
            com.jio.jioads.jioreel.tracker.model.b.g(string2, (JioAds$Companion)object);
            return;
        }
        while ((n3 = iterator.hasNext()) != 0) {
            Object object3 = iterator.next();
            object3 = (Map.Entry)object3;
            Object object4 = object3.getKey();
            object4 = (String)object4;
            object3 = object3.getValue();
            Object object5 = new StringBuilder();
            Object object6 = "map values ";
            ((StringBuilder)object5).append((String)object6);
            ((StringBuilder)object5).append((String)object4);
            object6 = ": ";
            ((StringBuilder)object5).append((String)object6);
            ((StringBuilder)object5).append(object3);
            object5 = ((StringBuilder)object5).toString();
            Intrinsics.checkNotNullParameter(object5, (String)object);
            object5 = Companion;
            object6 = ((JioAds$Companion)object5).getInstance();
            ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object6 = JioAds$LogLevel.NONE;
            object3 = String.valueOf(object3);
            Object object7 = new JSONObject(object3);
            object3 = "expiryTime";
            long l2 = object7.optLong(object3);
            object3 = Calendar.getInstance();
            long l3 = ((Calendar)object3).getTimeInMillis();
            n3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (n3 > 0) {
                String string3 = "cachePath";
                object3 = new Object((String)(object7 = object7.getString(string3)));
                boolean bl2 = ((File)object3).exists();
                if (!bl2 || (n3 = (int)(((File)object3).delete() ? 1 : 0)) == 0) continue;
                object3 = sharedPreferences2.edit();
                object3 = object3.remove(object4);
                object3.apply();
                object3 = new Object();
                object7 = "deleted file name ";
                ((StringBuilder)object3).append((String)object7);
                ((StringBuilder)object3).append((String)object4);
                object3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object3, (String)object);
                object3 = ((JioAds$Companion)object5).getInstance();
                object3 = ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                continue;
            }
            object3 = "Media file is not expired";
            Intrinsics.checkNotNullParameter(object3, (String)object);
            object3 = ((JioAds$Companion)object5).getInstance();
            object3 = ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
    }

    public static boolean a(Context context, String string2, String string3) {
        Object object = new StringBuilder();
        Object object2 = context.getFilesDir().getAbsolutePath();
        ((StringBuilder)object).append((String)object2);
        object2 = File.separator;
        string2 = h30_0.a((StringBuilder)object, object2, string2);
        object = new StringBuilder();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(" directory will be deleted");
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        object = Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = new File(string2);
        boolean bl2 = Utility.removeCachedDirectory((File)object2);
        if (bl2) {
            object2 = string3.concat(" prefs will be cleared");
            com.jio.jioads.jioreel.tracker.model.b.g(object2, (JioAds$Companion)object);
            Intrinsics.checkNotNullParameter(context, "context");
            object = "prefName";
            Intrinsics.checkNotNullParameter(string3, (String)object);
            context = j_0.o(context, string3).edit().clear();
            context.apply();
        }
        return bl2;
    }

    public static final /* synthetic */ JioAds access$getJioAdSdkInstance$cp() {
        return H;
    }

    public static final /* synthetic */ boolean access$isSdkInitialized$cp() {
        return I;
    }

    public static final /* synthetic */ void access$setJioAdSdkInstance$cp(JioAds jioAds) {
        H = jioAds;
    }

    public static final /* synthetic */ void access$setSdkInitialized$cp(boolean bl2) {
        I = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(Context context, JioAds jioAds) {
        Object object;
        Object object2;
        Object object3;
        HashMap<String, String> hashMap;
        String string2;
        String string3;
        Object object4;
        Object object5;
        int n3;
        Object object6;
        Object object7;
        String string4;
        int n4;
        int n7;
        Object object8;
        int n8;
        Object object9;
        int n10;
        Object object10;
        Context context2;
        block68: {
            int n14;
            Boolean bl2;
            int n15;
            block60: {
                int n16;
                block71: {
                    block70: {
                        block59: {
                            block69: {
                                block63: {
                                    block67: {
                                        block66: {
                                            int n17;
                                            block58: {
                                                block65: {
                                                    int n18;
                                                    block64: {
                                                        block62: {
                                                            block61: {
                                                                context2 = context;
                                                                object10 = jioAds;
                                                                n18 = 2;
                                                                n10 = 0;
                                                                object9 = null;
                                                                n8 = 1;
                                                                Intrinsics.checkNotNullParameter(context, "$context");
                                                                Intrinsics.checkNotNullParameter(jioAds, "this$0");
                                                                object8 = N.a;
                                                                object10 = jioAds.f;
                                                                object8 = new Object();
                                                                int n19 = 12;
                                                                N.d(context, (String)object10, (m_0)object8, n19);
                                                                object10 = Utility.INSTANCE;
                                                                n7 = ((Utility)object10).getCurrentUIModeType(context);
                                                                n4 = 4;
                                                                string4 = "message";
                                                                if (n7 != n4) {
                                                                    Intrinsics.checkNotNullParameter("inside init() calling getAndStoreLocationData()", string4);
                                                                    Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                    object10 = JioAds$LogLevel.NONE;
                                                                }
                                                                Intrinsics.checkNotNullParameter("Checking expired video files for deletion", string4);
                                                                object10 = Companion;
                                                                ((JioAds$Companion)object10).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                object7 = JioAds$LogLevel.NONE;
                                                                JioAds.a(j_0.o(context2, "video_cache_pref"));
                                                                Intrinsics.checkNotNullParameter("Checking expired image files for deletion", string4);
                                                                ((JioAds$Companion)object10).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                JioAds.a(j_0.o(context2, "image_cache_pref"));
                                                                object10 = new g(context2);
                                                                object7 = ((g)object10).c;
                                                                object6 = 0;
                                                                if (object7 != null && (n3 = ((String)object7).length()) != 0) {
                                                                    n3 = 0;
                                                                    object5 = null;
                                                                } else {
                                                                    n3 = 1;
                                                                }
                                                                n15 = 0;
                                                                object4 = null;
                                                                if ((n3 ^= n8) == 0) {
                                                                    n16 = 0;
                                                                    object7 = null;
                                                                }
                                                                object5 = "advid";
                                                                string3 = "null cannot be cast to non-null type kotlin.String";
                                                                string2 = "";
                                                                hashMap = "common_prefs";
                                                                if (object7 == null) {
                                                                    try {
                                                                        object7 = j_0.d(context2, (String)((Object)hashMap), 0, string2, (String)object5);
                                                                        Intrinsics.checkNotNull(object7, string3);
                                                                        ((g)object10).c = object7 = (String)object7;
                                                                    }
                                                                    catch (Exception exception) {
                                                                        n16 = 0;
                                                                        object7 = null;
                                                                    }
                                                                }
                                                                ((g)object10).c = object7;
                                                                object7 = ((g)object10).b;
                                                                object3 = "subscriberId_key";
                                                                if (object7 == null) break block61;
                                                                int n20 = ((String)object7).length();
                                                                if (n20 == 0) {
                                                                    n20 = 1;
                                                                } else {
                                                                    n20 = 0;
                                                                    bl2 = null;
                                                                }
                                                                if ((n20 ^= 1) == 0) {
                                                                    n16 = 0;
                                                                    object7 = null;
                                                                }
                                                                if (object7 != null) break block62;
                                                            }
                                                            try {
                                                                object7 = j_0.d(context2, (String)((Object)hashMap), 0, string2, (String)object3);
                                                                Intrinsics.checkNotNull(object7, string3);
                                                                ((g)object10).b = object7 = (String)object7;
                                                            }
                                                            catch (Exception exception) {
                                                                n16 = 0;
                                                                object7 = null;
                                                            }
                                                        }
                                                        ((g)object10).b = object7;
                                                        object7 = ((g)object10).c;
                                                        if (object7 != null && (n16 = ((String)object7).length()) != 0) break block63;
                                                        object7 = "Device is ";
                                                        object9 = Utility.INSTANCE;
                                                        n14 = ((Utility)object9).getCurrentUIModeType(context2);
                                                        object2 = "Amazon";
                                                        if ((n14 != n4 || (n14 = (int)(Intrinsics.areEqual(object2, object = Build.MANUFACTURER) ? 1 : 0)) != 0) && (n14 = (int)(com.jio.jioads.user.g.e() ? 1 : 0)) == 0) break block64;
                                                        try {
                                                            object = new StringBuilder((String)object7);
                                                            n10 = (int)(com.jio.jioads.user.g.e() ? 1 : 0);
                                                            object9 = n10 != 0 ? "JioBook" : "STB";
                                                            ((StringBuilder)object).append((String)object9);
                                                            object9 = ", trying to fetch advid from push service 2.0";
                                                            ((StringBuilder)object).append((String)object9);
                                                            object = ((StringBuilder)object).toString();
                                                            Intrinsics.checkNotNullParameter(object, string4);
                                                            object = Companion;
                                                            object9 = ((JioAds$Companion)object).getInstance();
                                                            ((JioAds)object9).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                            object9 = JioAds$LogLevel.NONE;
                                                            object9 = "content://com.jio.stbpushservice.SubscriberIdProvider2/cte";
                                                            Uri uri = Uri.parse((String)object9);
                                                            ContentResolver contentResolver = context.getContentResolver();
                                                            object9 = contentResolver.query(uri, null, null, null, null);
                                                            if (object9 != null && (n8 = object9.getCount()) > 0) {
                                                                ((g)object10).a((Cursor)object9);
                                                                break block58;
                                                            }
                                                            object9 = "JioAdPushService CP is null for STB, considering it as Android TV and fetching advid";
                                                            Intrinsics.checkNotNullParameter(object9, string4);
                                                            object = ((JioAds$Companion)object).getInstance();
                                                            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                            ((g)object10).d();
                                                        }
                                                        catch (Exception exception) {
                                                            Intrinsics.checkNotNullParameter("Exception in fetching adv uid from content provider 2", string4);
                                                            Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                            object = JioAds$LogLevel.NONE;
                                                        }
                                                        break block58;
                                                    }
                                                    n14 = ((Utility)object9).getCurrentUIModeType(context2);
                                                    if (n14 != n4 || (n14 = (int)(Intrinsics.areEqual(object2, object = Build.MANUFACTURER) ? 1 : 0)) == 0) break block65;
                                                    Intrinsics.checkNotNullParameter("Device is fire tv", string4);
                                                    object = Companion;
                                                    ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                    object9 = JioAds$LogLevel.NONE;
                                                    object9 = context.getContentResolver();
                                                    Intrinsics.checkNotNullExpressionValue(object9, "getContentResolver(...)");
                                                    object2 = "limit_ad_tracking";
                                                    n8 = Settings.Secure.getInt((ContentResolver)object9, (String)object2, (int)n18);
                                                    if (n8 != 0) {
                                                        if (n8 != n18) {
                                                            n10 = 1;
                                                            ((g)object10).b(null, n10 != 0);
                                                            break block58;
                                                        } else {
                                                            object9 = new StringBuilder("Adv ID not supported on this fire tv ");
                                                            object2 = Build.MODEL;
                                                            ((StringBuilder)object9).append((String)object2);
                                                            n8 = 32;
                                                            ((StringBuilder)object9).append((char)n8);
                                                            object7 = Build.BRAND;
                                                            ((StringBuilder)object9).append((String)object7);
                                                            ((StringBuilder)object9).append((char)n8);
                                                            object9 = ((StringBuilder)object9).toString();
                                                            Intrinsics.checkNotNullParameter(object9, string4);
                                                            object = ((JioAds$Companion)object).getInstance();
                                                            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                        }
                                                        break block58;
                                                    } else {
                                                        object = Settings.Secure.getString((ContentResolver)object9, (String)"advertising_id");
                                                        n10 = 0;
                                                        object9 = null;
                                                        ((g)object10).b((String)object, false);
                                                    }
                                                    break block58;
                                                }
                                                Intrinsics.checkNotNullParameter("Device is Mobile Phone, trying to fetch advid from gms", string4);
                                                Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                object = JioAds$LogLevel.NONE;
                                                ((g)object10).d();
                                            }
                                            object = ((g)object10).c;
                                            if (object != null && (n10 = ((String)object).length()) != 0) {
                                                n10 = 1;
                                                n17 = 0;
                                            } else {
                                                n10 = 1;
                                                n17 = 1;
                                            }
                                            n8 = n17 ^ 1;
                                            if (n8 == 0) {
                                                n14 = 0;
                                                object = null;
                                            }
                                            if (object == null) {
                                                n10 = 0;
                                                object9 = null;
                                                try {
                                                    object = j_0.d(context2, (String)((Object)hashMap), 0, string2, (String)object5);
                                                    Intrinsics.checkNotNull(object, string3);
                                                    object = (String)object;
                                                    ((g)object10).c = object;
                                                }
                                                catch (Exception exception) {
                                                    n14 = 0;
                                                    object = null;
                                                }
                                            }
                                            ((g)object10).c = object;
                                            object = ((g)object10).b;
                                            if (object == null) break block66;
                                            n10 = ((String)object).length();
                                            if (n10 == 0) {
                                                n10 = 1;
                                                n17 = 1;
                                            } else {
                                                n10 = 1;
                                                n17 = 0;
                                            }
                                            n8 = n17 ^ 1;
                                            if (n8 == 0) {
                                                n14 = 0;
                                                object = null;
                                            }
                                            if (object != null) break block67;
                                        }
                                        n14 = 0;
                                        object = null;
                                        try {
                                            object9 = j_0.d(context2, (String)((Object)hashMap), 0, string2, (String)object3);
                                            Intrinsics.checkNotNull(object9, string3);
                                            object = object9;
                                            object = (String)object9;
                                            ((g)object10).b = object;
                                        }
                                        catch (Exception exception) {
                                            n14 = 0;
                                            object = null;
                                        }
                                    }
                                    ((g)object10).b = object;
                                }
                                if ((n10 = ((JioAds)(object9 = ((JioAds$Companion)(object = Companion)).getInstance())).isUidServiceDisabled()) != 0 || (object9 = ((g)object10).b) != null && (n10 = ((String)object9).length()) != 0) break block68;
                                object9 = Utility.INSTANCE;
                                n8 = ((Utility)object9).getCurrentUIModeType(context2);
                                if (n8 != n4 || (n8 = (int)(((Utility)object9).isDeviceJioSTB() ? 1 : 0)) == 0 || (n8 = (int)(((Utility)object9).isJioStbOttModel() ? 1 : 0)) != 0) break block69;
                                v12.a("Device is Jio STB", string4, (JioAds$Companion)object);
                                object9 = JioAds$LogLevel.NONE;
                                object9 = new com.jio.jioads.user.a((g)object10);
                                object2 = "uid is null so trying to get it by rest api";
                                Intrinsics.checkNotNullParameter(object2, string4);
                                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object = new c((g)object10, (com.jio.jioads.user.a)object9);
                                object3 = new e((g)object10, (c)object);
                                hashMap = new HashMap<String, String>();
                                hashMap.put("Cache-Control", "no-cache");
                                object10 = "app-name";
                                object = "RJIL_JioPush2";
                                hashMap.put((String)object10, (String)object);
                                object5 = new com.jio.jioads.network.c(context2);
                                bl2 = Boolean.FALSE;
                                n15 = 0;
                                object4 = null;
                                string3 = "http://api.jio.com/ftth/v1/network/check";
                                string2 = null;
                                ((com.jio.jioads.network.c)object5).b(0, string3, null, hashMap, (Integer)object6, (NetworkTaskListener)object3, bl2);
                                break block68;
                            }
                            n10 = ((Utility)object9).getCurrentUIModeType(context2);
                            if (n10 == n4) break block68;
                            object9 = new com.jio.jioads.user.b((g)object10);
                            object3 = new d((g)object10, (com.jio.jioads.user.b)object9);
                            object10 = "networkInfo : ";
                            object2 = "connectivity";
                            try {
                                object2 = context2.getSystemService((String)object2);
                                object2 = (ConnectivityManager)object2;
                                if (object2 != null) {
                                    object2 = object2.getActiveNetworkInfo();
                                } else {
                                    n8 = 0;
                                    object2 = null;
                                }
                                if (object2 == null || (n4 = (int)(object2.isConnected() ? 1 : 0)) == 0) break block59;
                                n4 = object2.getType();
                                if (n4 == (n16 = 1)) {
                                    object10 = "Connected with wifi";
                                    Intrinsics.checkNotNullParameter(object10, string4);
                                    object10 = ((JioAds$Companion)object).getInstance();
                                    ((JioAds)object10).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object10 = JioAds$LogLevel.NONE;
                                    break block59;
                                }
                                n4 = object2.getType();
                                if (n4 == 0) {
                                    object8 = "Connected with mobile data";
                                    Intrinsics.checkNotNullParameter(object8, string4);
                                    object8 = ((JioAds$Companion)object).getInstance();
                                    ((JioAds)object8).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object8 = JioAds$LogLevel.NONE;
                                    object2 = object2.getExtraInfo();
                                    object8 = new StringBuilder((String)object10);
                                    ((StringBuilder)object8).append((String)object2);
                                    object10 = ((StringBuilder)object8).toString();
                                    Intrinsics.checkNotNullParameter(object10, string4);
                                    object10 = ((JioAds$Companion)object).getInstance();
                                    ((JioAds)object10).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object4 = object2;
                                }
                            }
                            catch (Exception exception) {}
                        }
                        l_0.h("isp-->", object4);
                        object10 = Companion;
                        ((JioAds$Companion)object10).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        if (object4 == null || (n14 = (int)(((String)object4).equalsIgnoreCase((String)(object = "jionet")) ? 1 : 0)) == 0) break block70;
                        n14 = Build.VERSION.SDK_INT;
                        n10 = 23;
                        if (n14 < n10) {
                            n14 = 1;
                        } else {
                            n10 = 24;
                            if (n14 < n10) {
                                object = sk3_1.a();
                                n14 = (int)(F20.b((NetworkSecurityPolicy)object) ? 1 : 0);
                            } else {
                                object = sk3_1.a();
                                n14 = (int)(com.jio.jioads.user.f.a((NetworkSecurityPolicy)object) ? 1 : 0);
                            }
                        }
                        if (n14 != 0) break block71;
                        object = "Jio network detected but cleartext traffic not allowed so ignoring uid call ";
                        v12.a((String)object, string4, (JioAds$Companion)object10);
                        break block68;
                    }
                    v12.a("internet is other than Jio so ignoring uid call", string4, (JioAds$Companion)object10);
                    object10 = JioAdError.Companion;
                    object = JioAdError$JioAdErrorType.ERROR_FETCHING_UID;
                    object10.getClass();
                    object10 = t_0.a((JioAdError$JioAdErrorType)((Object)object));
                    object = "Not connected with Jio network so can't fetch uid";
                    ((JioAdError)object10).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object);
                    object10 = ((com.jio.jioads.user.b)object9).a;
                    object10.getClass();
                    break block68;
                }
                Intrinsics.checkNotNullParameter("Jio network detected and cleartext traffic allowed", string4);
                ((JioAds$Companion)object10).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                Intrinsics.checkNotNullParameter("Beacon node 'hit' sent", string4);
                object10 = ((JioAds$Companion)object10).getInstance();
                ((JioAds)object10).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object5 = new com.jio.jioads.network.c(context2);
                n7 = 58;
                n14 = 0;
                object = null;
                n10 = 0;
                object9 = null;
                while (true) {
                    object2 = "http://api.jio.com/v2/users/me?app-name=RJIL_JioAds_Android";
                    if (n14 > n7) break;
                    n4 = n10 == 0 ? n14 : n7;
                    n4 = ((String)object2).charAt(n4);
                    n16 = 32;
                    if ((n4 = Intrinsics.compare(n4, n16)) <= 0) {
                        n4 = 1;
                    } else {
                        n4 = 0;
                        object8 = null;
                    }
                    if (n10 == 0) {
                        if (n4 == 0) {
                            n10 = 1;
                            continue;
                        }
                        n15 = 1;
                        n14 += n15;
                        continue;
                    }
                    n15 = 1;
                    if (n4 != 0) {
                        n7 += -1;
                        continue;
                    }
                    break block60;
                    break;
                }
                n15 = 1;
            }
            string3 = com.jio.jioads.adinterfaces.a.a(n7, n15, n14, (String)object2);
            bl2 = Boolean.FALSE;
            n15 = 0;
            object4 = null;
            string2 = null;
            hashMap = null;
            ((com.jio.jioads.network.c)object5).b(0, string3, null, null, (Integer)object6, (NetworkTaskListener)object3, bl2);
        }
        if ((n7 = (int)(Utility.ifOmSdkIsAvailable() ? 1 : 0)) == 0) return;
        Intrinsics.checkNotNullParameter(context2, "context");
        object10 = (long)-1;
        n8 = 3;
        object10 = j_0.d(context2, "master_config_pref", n8, object10, "omsdkJsStoreTime");
        object = "null cannot be cast to non-null type kotlin.Long";
        Intrinsics.checkNotNull(object10, (String)object);
        object10 = (Long)object10;
        long l2 = (Long)object10;
        object9 = Utility.INSTANCE;
        n10 = (int)(((Utility)object9).isInternetAvailable(context2) ? 1 : 0);
        if (n10 == 0) {
            Intrinsics.checkNotNullParameter("Internet is not available", string4);
            Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            return;
        }
        long l3 = System.currentTimeMillis();
        long l4 = l3 - l2;
        n4 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n4 >= 0) {
            object7 = new com.jio.jioads.network.c(context2);
            n7 = 0;
            object10 = null;
            hashMap = 0;
            object6 = new com.jio.jioads.multiad.j_0(context2);
            object3 = Boolean.FALSE;
            string3 = null;
            string2 = null;
            n3 = 0;
            object5 = null;
            object4 = "https://mercury.akamaized.net/jioads/om/omsdk-js-1.3.36/Service/omsdk-v1.js";
            ((com.jio.jioads.network.c)object7).b(0, (String)object4, null, null, (Integer)((Object)hashMap), (NetworkTaskListener)object6, (Boolean)object3);
            return;
        }
        l3 = System.currentTimeMillis();
        l2 -= l3;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l3 = timeUnit.toHours(l2);
        object9 = l3;
        long l7 = timeUnit.toMinutes(l2);
        object7 = TimeUnit.HOURS;
        long l8 = 1L;
        long l12 = ((TimeUnit)((Object)object7)).toMinutes(l8);
        object2 = l7 %= l12;
        long l14 = timeUnit.toSeconds(l2);
        long l15 = TimeUnit.MINUTES.toSeconds(l8);
        Long l16 = l14 %= l15;
        n7 = 3;
        object = new Object[n7];
        n4 = 0;
        object8 = null;
        object[0] = object9;
        n10 = 1;
        object[n10] = object2;
        object[n18] = l16;
        Object[] objectArray = Arrays.copyOf(object, n7);
        String string5 = String.format("%02d:%02d:%02d", objectArray);
        Intrinsics.checkNotNullExpressionValue(string5, "format(format, *args)");
        object10 = "Next js will be fetched after: ";
        Intrinsics.checkNotNullParameter(((String)object10).concat(string5), string4);
        Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean clearCachedMedia(Context var1_1, JioAds$MediaType var2_2) {
        block17: {
            block18: {
                block14: {
                    block15: {
                        block16: {
                            var3_3 = "message";
                            if (var1_1 /* !! */  == null || var2_2 /* !! */  == null) break block18;
                            try {
                                var4_4 = k_0.$EnumSwitchMapping$0;
                            }
                            catch (Exception v0) {
                                ** continue;
                            }
                            var5_5 = var2_2 /* !! */ .ordinal();
                            var5_5 = var4_4[var5_5];
                            var6_6 = 1;
                            var7_7 = "jioVideo";
                            var8_8 = "video_cache_pref";
                            if (var5_5 == var6_6) break block14;
                            var6_6 = 2;
                            var9_9 = "jioAudio";
                            if (var5_5 == var6_6) break block15;
                            var6_6 = 3;
                            var10_10 = "image_cache_pref";
                            var11_11 = "JioImage";
                            if (var5_5 == var6_6) break block16;
                            var6_6 = 4;
                            if (var5_5 != var6_6) break block17;
                            var5_5 = (int)JioAds.a(var1_1 /* !! */ , var7_7, var8_8);
                            var6_6 = (int)JioAds.a(var1_1 /* !! */ , var9_9, var8_8);
                            var5_5 &= var6_6;
                            var12_12 = JioAds.a(var1_1 /* !! */ , var11_11, var10_10) & var5_5;
                            ** GOTO lbl59
                        }
                        var12_12 = JioAds.a(var1_1 /* !! */ , var11_11, var10_10);
                        ** GOTO lbl59
                    }
                    var12_12 = JioAds.a(var1_1 /* !! */ , var9_9, var8_8);
                    ** GOTO lbl59
                }
                var12_12 = JioAds.a(var1_1 /* !! */ , var7_7, var8_8);
                ** GOTO lbl59
            }
            var1_1 /* !! */  = "Context or MediaType is null hence ignoring this api to clear cached media";
            Intrinsics.checkNotNullParameter(var1_1 /* !! */ , var3_3);
            var1_1 /* !! */  = JioAds.Companion;
            var1_1 /* !! */  = var1_1 /* !! */ .getInstance();
            var1_1 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var1_1 /* !! */  = JioAds$LogLevel.NONE;
        }
lbl56:
        // 2 sources

        while (true) {
            var12_12 = 0;
            var1_1 /* !! */  = null;
lbl59:
            // 5 sources

            var2_2 /* !! */  = new StringBuilder("is cached media cleared: ");
            var2_2 /* !! */ .append((boolean)var12_12);
            Intrinsics.checkNotNullParameter(var2_2 /* !! */ .toString(), var3_3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var2_2 /* !! */  = JioAds$LogLevel.NONE;
            return (boolean)var12_12;
        }
    }

    public final void disableGooglePlayService(boolean bl2) {
        this.i = bl2;
    }

    public final void disableUidService(boolean bl2) {
        this.j = bl2;
    }

    public final String getAppPackage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.f;
    }

    public final String getAppVersion$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.g;
    }

    public final String getCustomUserAgent() {
        return this.a;
    }

    public final JioAds$Environment getEnvironment$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.c;
    }

    public final Map getGlobalMetaData() {
        return this.d;
    }

    public final JioAdsMetadata getJioAdsMetaData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.h;
    }

    public final JioAds$LogLevel getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.b;
    }

    public final Map getMGlobalMetaData() {
        return this.d;
    }

    public final long getMasterConfigTime(Context object, String string2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(string2, "packageName");
        Comparable<StringBuilder> comparable = new StringBuilder("master_config_expiry_");
        comparable.append(string2);
        string2 = comparable.toString();
        comparable = Long.valueOf(-1);
        object = j_0.d(object, "master_config_pref", 3, comparable, string2);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Long");
        return (Long)object;
    }

    public final void getPredefinedMetaData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        int n3;
        boolean bl2;
        int n4;
        int n7;
        Object object;
        int n8;
        int n10 = 1;
        Object object2 = "message";
        Intrinsics.checkNotNullParameter("Inside getPredefinedMetaData", (String)object2);
        Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        object3 = this.h;
        if (object3 == null) {
            object3 = new JioAdsMetadata$Builder();
            this.h = object3 = ((JioAdsMetadata$Builder)object3).build();
        }
        if ((object3 = this.d) != null && (n8 = object3.isEmpty() ^ n10) == n10 && (object3 = this.h) != null) {
            object2 = this.d;
            ((JioAdsMetadata)object3).setCustomMetadata((Map)object2);
        }
        object3 = this.k;
        n8 = TextUtils.isEmpty((CharSequence)object3);
        int n14 = 32;
        if (n8 == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.k);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setChannelId((String)object);
        }
        if ((n8 = TextUtils.isEmpty((CharSequence)(object3 = this.m))) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.m);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setShowName((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.l)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.l);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setChannelName((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.n)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.n);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setPageCategory((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.o)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.o);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setSectionCategory((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.p)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.p);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setLanguageOfArticle((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.q)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.q);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setLanguage((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.r)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.r);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setContentId((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.G)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.G);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setContentTitle((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.s)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.s);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setContentType((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.t)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.t);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setVendor((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.u)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.u);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setActor((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.v)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.v);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setObjects((String)object);
        }
        if ((object3 = this.w) != null && (object = this.h) != null) {
            ((JioAdsMetadata)object).setKIDS_PROTECTED((Constants$KIDS_PROTECTED)((Object)object3));
        }
        if ((object3 = this.B) != null && (object = this.h) != null) {
            ((JioAdsMetadata)object).setGender((Constants$GENDER)((Object)object3));
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.g)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = this.g.toString();
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setAppVersion((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.x)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.x);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setGenre((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.y)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.y);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setState((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.z)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.z);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setCity((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.A)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.A);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setAge((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.C)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.C);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setCountry((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.D)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.D);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setPincode((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.E)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.E);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setKeywords((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object3 = this.F)) ? 1 : 0)) == 0 && (object3 = this.h) != null) {
            object = String.valueOf(this.F);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n4 += n10;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            String string2 = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object3).setPlacementName(string2);
        }
    }

    public final HashMap getRequestParams(Context context, Map hashMap) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        this.setMetaData(hashMap);
        this.getPredefinedMetaData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAdRequestGenerator jioAdRequestGenerator = new JioAdRequestGenerator(context);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        hashMap = this.h;
        hashMap = hashMap != null ? ((JioAdsMetadata)((Object)hashMap)).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(context) : null;
        String string3 = context.getPackageName();
        return JioAdRequestGenerator.commonAdRequestParams$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(jioAdRequestGenerator, linkedHashMap, hashMap, string3, null, 8, null);
    }

    public final String getSHA1(String string2) {
        return Utility.convertToSHA1(string2);
    }

    public final String getSHA2(String string2) {
        return Utility.convertToSHA2(string2);
    }

    public final void init(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        Object object2 = "message";
        Intrinsics.checkNotNullParameter("JioAds init() called. sv: AN-3", (String)object2);
        Object object3 = Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        object4 = object.getPackageName();
        Intrinsics.checkNotNullExpressionValue(object4, "getPackageName(...)");
        this.f = object4;
        object4 = object.getPackageManager();
        String string2 = object.getPackageName();
        object4 = object4.getPackageInfo((String)string2, (int)0).versionName;
        string2 = "versionName";
        Intrinsics.checkNotNullExpressionValue(object4, string2);
        this.g = object4;
        object4 = Utility.INSTANCE;
        ((Utility)object4).getUserAgent((Context)object);
        int n3 = I;
        int n4 = 1;
        if (n3 != 0) {
            Intrinsics.checkNotNullParameter("Sdk is already initialized", (String)object2);
            ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = object.getPackageManager();
            if (object4 != null && (object4 = object.getPackageName()) != null) {
                object4 = object.getPackageManager();
                String string3 = null;
                if (object4 != null) {
                    String string4 = object.getPackageName();
                    Intrinsics.checkNotNull(string4);
                    object4 = object4.getPackageInfo(string4, 0);
                } else {
                    n3 = 0;
                    object4 = null;
                }
                if (object4 != null) {
                    string3 = ((PackageInfo)object4).packageName;
                }
                Intrinsics.checkNotNull(string3);
                long l2 = this.getMasterConfigTime((Context)object, string3);
                long l3 = System.currentTimeMillis();
                long l4 = -1;
                n3 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                if (n3 != 0 && (n3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) < 0) {
                    object = "Master config already downloaded";
                    v12.a((String)object, (String)object2, (JioAds$Companion)object3);
                } else {
                    object3 = Executors.newFixedThreadPool(n4);
                    object2 = new e_0((Context)object, this);
                    object3.submit((Runnable)object2);
                }
            }
            return;
        }
        I = n4;
        object3 = Executors.newFixedThreadPool(n4);
        object2 = new f_0((Context)object, this);
        object3.submit((Runnable)object2);
    }

    public final boolean isChromiumDependencyPresent() {
        return this.e;
    }

    public final boolean isChromiumDependencyPresent1() {
        return this.e;
    }

    public final boolean isGooglePlayServiceDisabled() {
        return this.i;
    }

    public final boolean isUidServiceDisabled() {
        return this.j;
    }

    public final void release() {
        boolean bl2;
        Object object = "message";
        Intrinsics.checkNotNullParameter("Releasing jio resources", (String)object);
        Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = j_0.a;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            bl2 = object2.isShutdown();
            if (!bl2) {
                object2 = j_0.a;
                Intrinsics.checkNotNull(object2);
                object2.shutdownNow();
            }
        }
        bl2 = false;
        object2 = null;
        j_0.a = null;
        j_0.b = null;
        j_0.c = null;
        j_0.d = null;
        j_0.f = null;
        j_0.g = null;
        j_0.h = null;
        j_0.e = null;
        I = false;
        object = this.d;
        if (object != null) {
            object.clear();
            this.d = null;
        }
        N.a = null;
        N.b = null;
        N.c = null;
        object = N.d;
        if (object != null) {
            ((ConcurrentHashMap)object).clear();
        }
        N.d = null;
    }

    public final void removeMetaKeys(String[] stringArray) {
        Intrinsics.checkNotNullParameter(stringArray, "metaKeys");
    }

    public final void setActor(String string2) {
        Intrinsics.checkNotNullParameter(string2, "actor");
        this.u = string2;
    }

    public final void setAge(String string2) {
        Intrinsics.checkNotNullParameter(string2, "age");
        this.A = string2;
    }

    public final void setAppVersion(String string2) {
        Intrinsics.checkNotNullParameter(string2, "appVersion");
        this.g = string2;
    }

    public final void setChannelID(String string2) {
        Intrinsics.checkNotNullParameter(string2, "channelId");
        this.k = string2;
    }

    public final void setChannelName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "channelName");
        this.l = string2;
    }

    public final void setCity(String string2) {
        Intrinsics.checkNotNullParameter(string2, "city");
        this.z = string2;
    }

    public final void setContentID(String string2) {
        Intrinsics.checkNotNullParameter(string2, "contentId");
        this.r = string2;
    }

    public final void setContentTitle(String string2) {
        Intrinsics.checkNotNullParameter(string2, "contentTitle");
        this.G = string2;
    }

    public final void setContentType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "contentType");
        this.s = string2;
    }

    public final void setCountry(String string2) {
        Intrinsics.checkNotNullParameter(string2, "country");
        this.C = string2;
    }

    public final void setCustomUserAgent(String string2) {
        this.a = string2;
        this.e = true;
    }

    public final void setEnvironment(JioAds$Environment jioAds$Environment) {
        Intrinsics.checkNotNullParameter((Object)jioAds$Environment, "environment");
        this.c = jioAds$Environment;
    }

    public final void setGender(Constants$GENDER constants$GENDER) {
        Intrinsics.checkNotNullParameter((Object)constants$GENDER, "gender");
        this.B = constants$GENDER;
    }

    public final void setGenre(String string2) {
        Intrinsics.checkNotNullParameter(string2, "genre");
        this.x = string2;
    }

    public final void setIsKidsProtected(Constants$KIDS_PROTECTED constants$KIDS_PROTECTED) {
        Intrinsics.checkNotNullParameter((Object)constants$KIDS_PROTECTED, "isKidsProtected");
        this.w = constants$KIDS_PROTECTED;
    }

    public final void setJioAdsMetaData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAdsMetadata jioAdsMetadata) {
        this.h = jioAdsMetadata;
    }

    public final void setKeywords(String string2) {
        Intrinsics.checkNotNullParameter(string2, "keywords");
        this.E = string2;
    }

    public final void setLanguage(String string2) {
        Intrinsics.checkNotNullParameter(string2, "language");
        this.q = string2;
    }

    public final void setLanguageOfArticle(String string2) {
        Intrinsics.checkNotNullParameter(string2, "languageOfArticle");
        this.p = string2;
    }

    public final void setLogLevel(JioAds$LogLevel jioAds$LogLevel) {
        Intrinsics.checkNotNullParameter((Object)jioAds$LogLevel, "level");
        this.b = jioAds$LogLevel;
    }

    public final void setMGlobalMetaData(Map map2) {
        this.d = map2;
    }

    public final void setMetaData(Map object) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        if (object != null) {
            boolean bl2;
            object = object.entrySet().iterator();
            while (bl2 = object.hasNext()) {
                Object object2 = (Map.Entry)object.next();
                String string2 = (String)object2.getKey();
                object2 = (String)object2.getValue();
                boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                if (bl3) continue;
                String string3 = "md_";
                bl3 = StringsKt.F(string2, string3, false);
                if (!bl3) {
                    string2 = string3.concat(string2);
                    hashMap.put(string2, object2);
                    continue;
                }
                hashMap.put(string2, object2);
            }
        }
        this.d = hashMap;
    }

    public final void setObjects(String string2) {
        Intrinsics.checkNotNullParameter(string2, "objects");
        this.v = string2;
    }

    public final void setPageCategory(String string2) {
        Intrinsics.checkNotNullParameter(string2, "pageCategory");
        this.n = string2;
    }

    public final void setPincode(String string2) {
        Intrinsics.checkNotNullParameter(string2, "pincode");
        this.D = string2;
    }

    public final void setPlacementName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "placementName");
        this.F = string2;
    }

    public final void setSectionCategory(String string2) {
        Intrinsics.checkNotNullParameter(string2, "sectionCategory");
        this.o = string2;
    }

    public final void setShowName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "showName");
        this.m = string2;
    }

    public final void setState(String string2) {
        Intrinsics.checkNotNullParameter(string2, "state");
        this.y = string2;
    }

    public final void setUID(Context context, String string2) {
        String string3 = "uid";
        Intrinsics.checkNotNullParameter(string2, string3);
        if (context != null) {
            string3 = "context";
            Intrinsics.checkNotNullParameter(context, string3);
            Object object = new StringBuilder("Uid set is: ");
            object.append(string2);
            Intrinsics.checkNotNullParameter(object.toString(), "message");
            Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            Intrinsics.checkNotNullParameter(context, string3);
            string3 = null;
            object = "dev_subscriberId_key";
            String string4 = "common_prefs";
            j_0.p(context, string4, 0, string2, (String)object);
        }
    }

    public final void setVendor(String string2) {
        Intrinsics.checkNotNullParameter(string2, "vendor");
        this.t = string2;
    }

    public final void triggerConversion(Context context, String string2, String string3, HashMap hashMap) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        int n3;
        boolean bl6;
        boolean bl32;
        Context context2 = context;
        String string4 = string2;
        Object object = string3;
        Object object2 = hashMap;
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(string2, "cid");
        Intrinsics.checkNotNullParameter(string3, "level");
        RetargetPref retargetPref = RetargetPref.INSTANCE;
        Object object3 = retargetPref.getConfigs();
        Object object4 = "conversionUrl";
        if (object3 != null && (bl32 = object3.has((String)object4))) {
            object3 = object3.getString((String)object4);
        } else {
            boolean c2 = false;
            object3 = null;
        }
        bl32 = false;
        Object object5 = null;
        Object object6 = "/";
        if (object3 != null && !(bl6 = kotlin.text.b.h((String)object3, object6, false))) {
            object3 = object3.concat((String)object6);
        }
        Object object7 = new StringBuilder();
        ((StringBuilder)object7).append((String)object3);
        object3 = "delivery/cn.php";
        ((StringBuilder)object7).append((String)object3);
        object7 = ((StringBuilder)object7).toString();
        bl6 = TextUtils.isEmpty((CharSequence)object7);
        String string5 = "message";
        if (!bl6) {
            boolean bl7;
            Intrinsics.checkNotNullParameter("Retargeting Conversion URL", string5);
            Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object7 = JioAds$LogLevel.NONE;
            object7 = new StringBuilder();
            JSONObject jSONObject = retargetPref.getConfigs();
            object4 = jSONObject != null && (bl7 = jSONObject.has((String)object4)) ? jSONObject.getString((String)object4) : null;
            if (object4 != null && !(bl32 = kotlin.text.b.h((String)object4, object6, false))) {
                object4 = ((String)object4).concat((String)object6);
            }
            object5 = new StringBuilder();
            ((StringBuilder)object5).append((String)object4);
            ((StringBuilder)object5).append((String)object3);
            object3 = ((StringBuilder)object5).toString();
            ((StringBuilder)object7).append((String)object3);
            ((StringBuilder)object7).append("?level=");
            ((StringBuilder)object7).append((String)object);
            object3 = ((StringBuilder)object7).toString();
            object4 = this;
        } else {
            object3 = kp1_0.c("https://mercury-ck-stg.jio.com/delivery/cn.php?level=", (String)object);
            object4 = this;
            object5 = this.c;
            object6 = JioAds$Environment.PROD;
            if (object5 == object6) {
                object3 = kp1_0.c("https://mercury-ck.jio.com/delivery/cn.php?level=", (String)object);
            }
        }
        bl32 = kotlin.text.b.k(string2) ^ true;
        if (bl32) {
            object5 = "&cid=";
            object3 = n1.a((String)object3, (String)object5, string4);
        }
        if (object2 != null && !(bl32 = hashMap.isEmpty())) {
            object5 = Utility.INSTANCE.encodeAdRequestParameters((Map)object2, "UTF-8");
            Intrinsics.checkNotNullParameter(object5, string5);
            Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object6 = JioAds$LogLevel.NONE;
            object6 = new StringBuilder();
            ((StringBuilder)object6).append((String)object3);
            char c2 = '&';
            ((StringBuilder)object6).append(c2);
            ((StringBuilder)object6).append((String)object5);
            object3 = ((StringBuilder)object6).toString();
        }
        object7 = object3;
        l_0.h("Conversion URL ", (String)object3);
        Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        int n4 = string3.length();
        if (!(n4 <= 0 || (n3 = string2.length()) <= 0 || (bl5 = Intrinsics.areEqual(object, object3 = "3")) || (bl4 = Intrinsics.areEqual(object, object3 = "6")) || (bl3 = Intrinsics.areEqual(object, object3 = "7")) || (bl2 = Intrinsics.areEqual(object, object3 = "8")))) {
            if (object2 != null) {
                object3 = "prdid";
                object2 = (String)((HashMap)object2).get(object3);
            } else {
                object2 = null;
            }
            int n7 = Integer.parseInt(string3);
            object = n7;
            retargetPref.storeClickIds(string4, (String)object2, (Integer)object, null);
        }
        object5 = new com.jio.jioads.network.c(context2);
        Integer n8 = 15000;
        o_0 o_02 = new Object();
        Boolean bl8 = Boolean.FALSE;
        ((com.jio.jioads.network.c)object5).b(0, (String)object7, null, null, n8, o_02, bl8);
    }
}

