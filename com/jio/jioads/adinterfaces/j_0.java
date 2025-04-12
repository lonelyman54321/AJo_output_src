/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.UiModeManager
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.pm.PackageManager
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.os.Build$VERSION
 */
package com.jio.jioads.adinterfaces;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.common.b;
import com.jio.jioads.common.h;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.multiad.a_0;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from com.jio.jioads.adinterfaces.j
 */
public abstract class j_0 {
    public static ExecutorService a;
    public static SharedPreferences b;
    public static SharedPreferences c;
    public static SharedPreferences d;
    public static SharedPreferences e;
    public static SharedPreferences f;
    public static SharedPreferences g;
    public static SharedPreferences h;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int a(String object) {
        int n3;
        long l2;
        try {
            Object object2 = "HH:mm:ss";
            Locale locale = Locale.getDefault();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object2, locale);
            object2 = "00:00:00";
            object2 = simpleDateFormat.parse((String)object2);
            object = simpleDateFormat.parse((String)object);
            long l3 = ((Date)object).getTime();
            l2 = ((Date)object2).getTime();
            l3 -= l2;
            n3 = 1000;
        }
        catch (Exception exception) {
            return 0;
        }
        l2 = n3;
        {
            // empty try
        }
        return (int)(l3 /= l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Bitmap b(int n3, byte[] object, int n4, int n7) {
        Exception exception2;
        block6: {
            BitmapFactory.Options options;
            block5: {
                try {
                    options = new BitmapFactory.Options();
                    int n8 = 1;
                    options.inJustDecodeBounds = n8;
                    BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n3, (BitmapFactory.Options)options);
                    if (n4 <= 0 || n7 <= 0) break block5;
                    int n10 = options.outHeight;
                    int n14 = options.outWidth;
                    if (n10 > n7 || n14 > n4) {
                        int n15;
                        n10 /= 2;
                        n14 /= 2;
                        while ((n15 = n10 / n8) >= n7 && (n15 = n14 / n8) >= n4) {
                            n8 *= 2;
                        }
                    }
                    options.inSampleSize = n8;
                }
                catch (Exception exception2) {
                    break block6;
                }
            }
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n3, (BitmapFactory.Options)options);
        }
        Object object2 = Utility.INSTANCE.printStacktrace(exception2);
        object = "message";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        v12.a("Image returning null", (String)object, (JioAds$Companion)object2);
        return null;
    }

    public static JioAdError c(t_0 object, JioAdError$JioAdErrorType jioAdError$JioAdErrorType, String string2) {
        object.getClass();
        object = t_0.a(jioAdError$JioAdErrorType);
        ((JioAdError)object).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2);
        return object;
    }

    public static Object d(Context context, String string2, int n3, Object object, String string3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "prefName");
        Intrinsics.checkNotNullParameter(string3, "prefKey");
        String string4 = "defaultVal";
        Intrinsics.checkNotNullParameter(object, string4);
        context = j_0.o(context, string2);
        if (n3 != 0) {
            int n4 = 1;
            float f5 = Float.MIN_VALUE;
            if (n3 != n4) {
                n4 = 2;
                f5 = 2.8E-45f;
                if (n3 != n4) {
                    n4 = 3;
                    f5 = 4.2E-45f;
                    if (n3 != n4) {
                        n4 = 4;
                        f5 = 5.6E-45f;
                        if (n3 != n4) {
                            return object;
                        }
                        n4 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                        return context.getBoolean(string3, n4 != 0);
                    }
                    long l2 = (Long)object;
                    return context.getLong(string3, l2);
                }
                f5 = ((Float)object).floatValue();
                return Float.valueOf(context.getFloat(string3, f5));
            }
            n4 = (Integer)object;
            return context.getInt(string3, n4);
        }
        object = (String)object;
        return context.getString(string3, (String)object);
    }

    public static final String e(int n3) {
        Object object;
        int n4 = 1;
        int n7 = 3;
        int n8 = 2;
        Object object2 = TimeUnit.SECONDS;
        long l2 = n3;
        n3 = (int)object2.toHours(l2);
        long l3 = object2.toMinutes(l2);
        int n10 = (int)l3;
        long l4 = object2.toSeconds(l2);
        long l7 = object2.toMinutes(l2);
        int n14 = 60;
        long l8 = n14;
        int n15 = (int)(l4 -= (l7 *= l8));
        String string2 = "format(locale, format, *args)";
        if (n3 > 0) {
            Object object3 = StringCompanionObject.INSTANCE;
            object3 = Locale.getDefault();
            object = n3;
            Integer n16 = n10;
            object2 = n15;
            Object[] objectArray = new Object[n7];
            objectArray[0] = object;
            objectArray[n4] = n16;
            objectArray[n8] = object2;
            object = IV0.a(objectArray, n7, (Locale)object3, "%02d:%02d:%02d", string2);
        } else {
            object = StringCompanionObject.INSTANCE;
            object = Locale.getDefault();
            Integer n17 = n10;
            object2 = n15;
            Object[] objectArray = new Object[n8];
            objectArray[0] = n17;
            objectArray[n4] = object2;
            String string3 = "%02d:%02d";
            object = IV0.a(objectArray, n8, (Locale)object, string3, string2);
        }
        return object;
    }

    public static void f(Context context, String string2, String string3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "prefName");
        Intrinsics.checkNotNullParameter(string3, "prefKey");
        j_0.o(context, string2).edit().remove(string3).apply();
    }

    public static void g(Context context, String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "adspotId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string3, "key");
        Object object = new StringBuilder();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": storing multi ad for: ");
        ((StringBuilder)object).append(string3);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = Executors.newSingleThreadExecutor();
        a_0 a_02 = new a_0(context, string3, string4, string2);
        Intrinsics.checkNotNull(object);
        object.submit(a_02);
    }

    public static void h(JioAdView object, StringBuilder stringBuilder, String string2) {
        object = ((JioAdView)object).getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
    }

    public static void i(b object, StringBuilder stringBuilder, String string2) {
        object = object.P();
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
    }

    public static void j(n object, StringBuilder stringBuilder, String string2) {
        object = ((n)object).v();
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
    }

    public static void k(StringBuilder stringBuilder, String string2, String string3) {
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
    }

    public static final boolean l(Context object) {
        boolean bl2;
        block5: {
            block4: {
                if (object == null) break block4;
                object = object.getSystemService("uimode");
                String string2 = "null cannot be cast to non-null type android.app.UiModeManager";
                Intrinsics.checkNotNull(object, string2);
                object = (UiModeManager)object;
                int n3 = object.getCurrentModeType();
                int n4 = 12;
                bl2 = true;
                if (n3 == n4 || n3 == (n4 = 14)) {
                    n3 = 1;
                }
                n4 = 4;
                if (n3 == n4) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean m(Context context, String object, Integer n3) {
        String string2;
        PackageManager packageManager;
        boolean bl2;
        block12: {
            block11: {
                Intrinsics.checkNotNullParameter(object, "packageName");
                bl2 = false;
                if (context == null) return bl2;
                try {
                    packageManager = context.getPackageManager();
                    string2 = null;
                    if (packageManager == null) break block11;
                }
                catch (Exception exception) {
                    return bl2;
                }
                String string3 = context.getPackageName();
                packageManager = packageManager.getPackageInfo(string3, 0);
                break block12;
            }
            packageManager = null;
        }
        if (packageManager != null) {
            string2 = packageManager.packageName;
        }
        int n4 = Intrinsics.areEqual(object, string2);
        if (n4 == 0) return bl2;
        if (n3 == null) return true;
        object = Utility.INSTANCE;
        int n7 = ((Utility)object).getCurrentUIModeType(context);
        n4 = n3;
        if (n7 != n4) return bl2;
        return true;
    }

    public static void n(b object, StringBuilder stringBuilder, String string2) {
        object = object.P();
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
    }

    public static SharedPreferences o(Context context, String string2) {
        String string3;
        block15: {
            Intrinsics.checkNotNullParameter(context, "context");
            string3 = "prefName";
            Intrinsics.checkNotNullParameter(string2, string3);
            int n3 = string2.hashCode();
            switch (n3) {
                default: {
                    break;
                }
                case 2101122723: {
                    string3 = "master_config_pref";
                    boolean bl2 = string2.equals(string3);
                    if (!bl2) break;
                    string2 = c;
                    if (string2 == null) {
                        context = context.getSharedPreferences(string3, 0);
                        c = context;
                    }
                    context = c;
                    Intrinsics.checkNotNull(context);
                    return context;
                }
                case -376597655: {
                    string3 = "fill_story_pref";
                    boolean bl3 = string2.equals(string3);
                    if (!bl3) break;
                    string2 = e;
                    if (string2 == null) {
                        context = context.getSharedPreferences(string3, 0);
                        e = context;
                    }
                    context = e;
                    Intrinsics.checkNotNull(context);
                    return context;
                }
                case -405605018: {
                    string3 = "multiad_pref";
                    boolean bl4 = string2.equals(string3);
                    if (!bl4) break;
                    string2 = d;
                    if (string2 == null) {
                        context = context.getSharedPreferences(string3, 0);
                        d = context;
                    }
                    context = d;
                    Intrinsics.checkNotNull(context);
                    return context;
                }
                case -885674971: {
                    string3 = "ad_seq_and_blk_pref";
                    boolean bl5 = string2.equals(string3);
                    if (!bl5) break;
                    string2 = f;
                    if (string2 == null) {
                        context = context.getSharedPreferences(string3, 0);
                        f = context;
                    }
                    context = f;
                    Intrinsics.checkNotNull(context);
                    return context;
                }
                case -1053932796: {
                    string3 = "video_cache_pref";
                    boolean bl6 = string2.equals(string3);
                    if (!bl6) break;
                    string2 = h;
                    if (string2 == null) {
                        context = context.getSharedPreferences(string3, 0);
                        h = context;
                    }
                    context = h;
                    Intrinsics.checkNotNull(context);
                    return context;
                }
                case -1632640476: {
                    string3 = "image_cache_pref";
                    boolean bl7 = string2.equals(string3);
                    if (bl7) break block15;
                }
            }
            string2 = b;
            if (string2 == null) {
                string2 = "common_prefs";
                context = context.getSharedPreferences(string2, 0);
                b = context;
            }
            context = b;
            Intrinsics.checkNotNull(context);
            return context;
        }
        string2 = g;
        if (string2 == null) {
            context = context.getSharedPreferences(string3, 0);
            g = context;
        }
        context = g;
        Intrinsics.checkNotNull(context);
        return context;
    }

    public static void p(Context context, String string2, int n3, Object object, String string3) {
        ExecutorService executorService;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "prefName");
        a = executorService = Executors.newSingleThreadExecutor();
        l l2 = new l(context, string2, n3, object, string3);
        Intrinsics.checkNotNull(executorService);
        executorService.submit(l2);
    }

    public static final boolean q(Context context) {
        boolean bl2;
        int n3;
        int n4;
        if (context != null && (n4 = Build.VERSION.SDK_INT) >= (n3 = 24) && (n4 = context instanceof Activity) != 0 && (bl2 = com.jio.jioads.common.h.a((Activity)(context = (Activity)context)))) {
            bl2 = true;
        } else {
            bl2 = false;
            context = null;
        }
        return bl2;
    }

    public static final boolean r(Context context) {
        boolean bl2;
        String string2 = "com.tv.v18.viola";
        boolean bl3 = j_0.m(context, string2, null);
        return bl3 || (bl3 = j_0.m(context, string2 = "com.viacom18.tv.voot", null)) || (bl3 = j_0.m(context, string2 = "com.jio.media.ondemand", null)) || (bl2 = j_0.m(context, string2 = "com.jio.media.stb.ondemand", null));
        {
        }
    }
}

