/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.UiModeManager
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.pm.PackageManager
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.webkit.CookieManager
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.jio.jioads.util;

import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent$e;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.cdnlogging.c;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.cdnlogging.e;
import com.jio.jioads.common.b;
import com.jio.jioads.instreamads.vastparser.model.i;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.util.a;
import com.jio.jioads.util.k;
import com.jio.jioads.util.m;
import com.jio.jioads.util.n;
import com.jio.jioads.util.o;
import com.jio.jioads.util.s;
import com.jio.jioads.utils.Constants$SDKVersion;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

public final class Utility {
    public static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    public static final Utility INSTANCE;
    public static Context a;
    public static String b;
    public static boolean c;
    public static boolean d;
    public static final String[] e;
    public static final String[] f;
    public static String g;

    static {
        Utility utility;
        INSTANCE = utility = new Utility();
        e = new String[]{"JHSC200", "JHSD200", "JHSB200", "JHSB210", "JHSH200", "JHSJ100", "JTVN200", "JHZD200", "JHSL400", "JHSA400", "RMX3085", "JMSC200"};
        f = new String[]{"4KOTTSTB", "JESJ100", "UHD"};
    }

    public static String a() {
        int n3;
        long l2 = System.currentTimeMillis();
        Random random = new Random(l2);
        String string2 = "8";
        String string3 = "9";
        String string4 = "b";
        String string5 = "c";
        String string6 = "d";
        String string7 = "e";
        String string8 = "f";
        String string9 = "g";
        String string10 = "h";
        String string11 = "i";
        String string12 = "j";
        String string13 = "k";
        String string14 = "l";
        String string15 = "m";
        String string16 = "n";
        String string17 = "o";
        String string18 = "p";
        String string19 = "q";
        String string20 = "r";
        String string21 = "s";
        String string22 = "t";
        String string23 = "u";
        String string24 = "v";
        String string25 = "w";
        String string26 = "x";
        String string27 = "y";
        String string28 = "z";
        String string29 = "0";
        String string30 = "1";
        String string31 = "2";
        String string32 = "3";
        String string33 = "4";
        String string34 = "5";
        String string35 = "6";
        String string36 = "7";
        String[] stringArray = new String[]{"a", string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string2, string3};
        CharSequence charSequence = "";
        for (int i3 = 0; i3 < (n3 = 10); ++i3) {
            charSequence = Ex0.a((String)charSequence);
            n3 = random.nextInt(36);
            string4 = stringArray[n3];
            ((StringBuilder)charSequence).append(string4);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        System.out.println(charSequence);
        return charSequence;
    }

    public static String a(String string2, k object) {
        block131: {
            Object object2;
            Integer n3;
            String string3;
            String string4;
            int n4;
            Object object3;
            block130: {
                int n7;
                block129: {
                    int n8;
                    block128: {
                        Object object4;
                        Object object5;
                        block123: {
                            block122: {
                                block119: {
                                    block118: {
                                        block115: {
                                            object3 = "[leftoverduration]";
                                            n4 = -1;
                                            n7 = 1;
                                            string4 = "message";
                                            string3 = "";
                                            if (string2 != null) {
                                                block117: {
                                                    block116: {
                                                        n8 = StringsKt.F(string2, (CharSequence)object3, false);
                                                        if (n8 != n7) break block115;
                                                        object5 = ((k)object).J;
                                                        if (object5 == null) break block116;
                                                        n8 = (Integer)object5;
                                                        break block117;
                                                    }
                                                    n8 = -1;
                                                }
                                                if (n8 > 0) {
                                                    object5 = new StringBuilder(string3);
                                                    object4 = ((k)object).J;
                                                    ((StringBuilder)object5).append(object4);
                                                    object5 = ((StringBuilder)object5).toString();
                                                    string2 = kotlin.text.b.n(string2, (String)object3, (String)object5, false);
                                                    object3 = new StringBuilder();
                                                    object5 = ((k)object).q;
                                                    ((StringBuilder)object3).append((String)object5);
                                                    object5 = ": replaced leftoverduration with : ";
                                                    ((StringBuilder)object3).append((String)object5);
                                                    object5 = ((k)object).J;
                                                    ((StringBuilder)object3).append(object5);
                                                    object3 = ((StringBuilder)object3).toString();
                                                    Intrinsics.checkNotNullParameter(object3, string4);
                                                    object3 = JioAds.Companion;
                                                    object3 = ((JioAds$Companion)object3).getInstance();
                                                    object3 = ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                    object5 = JioAds$LogLevel.NONE;
                                                } else {
                                                    string2 = kotlin.text.b.n(string2, (String)object3, string3, false);
                                                    object3 = new StringBuilder();
                                                    object5 = ((k)object).q;
                                                    ((StringBuilder)object3).append((String)object5);
                                                    object5 = ": replaced leftoverduration with empty string";
                                                    ((StringBuilder)object3).append((String)object5);
                                                    object3 = ((StringBuilder)object3).toString();
                                                    Intrinsics.checkNotNullParameter(object3, string4);
                                                    object3 = JioAds.Companion;
                                                    object3 = ((JioAds$Companion)object3).getInstance();
                                                    object3 = ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                    object5 = JioAds$LogLevel.NONE;
                                                }
                                            }
                                        }
                                        object3 = "[lod]";
                                        if (string2 != null) {
                                            n8 = StringsKt.F(string2, (CharSequence)object3, false);
                                            if (n8 != n7) break block118;
                                            n8 = 1;
                                            break block119;
                                        }
                                    }
                                    n8 = 0;
                                    object5 = null;
                                }
                                if (n8 != 0) {
                                    block121: {
                                        block120: {
                                            object5 = ((k)object).J;
                                            if (object5 == null) break block120;
                                            n8 = (Integer)object5;
                                            break block121;
                                        }
                                        n8 = -1;
                                    }
                                    if (n8 > 0) {
                                        object5 = new StringBuilder(string3);
                                        object4 = ((k)object).J;
                                        ((StringBuilder)object5).append(object4);
                                        object5 = ((StringBuilder)object5).toString();
                                        string2 = kotlin.text.b.n(string2, (String)object3, (String)object5, false);
                                        object3 = new StringBuilder();
                                        object5 = ((k)object).q;
                                        ((StringBuilder)object3).append((String)object5);
                                        object5 = ": replaced lod : ";
                                        ((StringBuilder)object3).append((String)object5);
                                        object5 = ((k)object).J;
                                        ((StringBuilder)object3).append(object5);
                                        object3 = ((StringBuilder)object3).toString();
                                        Intrinsics.checkNotNullParameter(object3, string4);
                                        object3 = JioAds.Companion;
                                        object3 = ((JioAds$Companion)object3).getInstance();
                                        object3 = ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        object5 = JioAds$LogLevel.NONE;
                                    } else {
                                        string2 = kotlin.text.b.n(string2, (String)object3, string3, false);
                                        object3 = new StringBuilder();
                                        object5 = ((k)object).q;
                                        ((StringBuilder)object3).append((String)object5);
                                        object5 = ": replaced lod with empty string";
                                        ((StringBuilder)object3).append((String)object5);
                                        object3 = ((StringBuilder)object3).toString();
                                        Intrinsics.checkNotNullParameter(object3, string4);
                                        object3 = JioAds.Companion;
                                        object3 = ((JioAds$Companion)object3).getInstance();
                                        object3 = ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        object5 = JioAds$LogLevel.NONE;
                                    }
                                }
                                object3 = "[leftoverdurationmillis]";
                                if (string2 != null) {
                                    n8 = (int)(StringsKt.F(string2, (CharSequence)object3, false) ? 1 : 0);
                                    if (n8 != n7) break block122;
                                    n8 = 1;
                                    break block123;
                                }
                            }
                            n8 = 0;
                            object5 = null;
                        }
                        if (n8 != 0) {
                            block125: {
                                block124: {
                                    object5 = ((k)object).J;
                                    if (object5 == null) break block124;
                                    n8 = (Integer)object5;
                                    break block125;
                                }
                                n8 = -1;
                            }
                            if (n8 > 0) {
                                block127: {
                                    block126: {
                                        object5 = ((k)object).J;
                                        if (object5 == null) break block126;
                                        n8 = (Integer)object5;
                                        break block127;
                                    }
                                    n8 = 0;
                                    object5 = null;
                                }
                                n8 *= 1000;
                                object4 = new StringBuilder(string3);
                                ((StringBuilder)object4).append(n8);
                                object4 = ((StringBuilder)object4).toString();
                                string2 = kotlin.text.b.n(string2, (String)object3, (String)object4, false);
                                object3 = new StringBuilder();
                                object4 = ((k)object).q;
                                ((StringBuilder)object3).append((String)object4);
                                object4 = ": replaced leftoverdurationmillis : ";
                                ((StringBuilder)object3).append((String)object4);
                                ((StringBuilder)object3).append(n8);
                                object3 = ((StringBuilder)object3).toString();
                                Intrinsics.checkNotNullParameter(object3, string4);
                                object3 = JioAds.Companion;
                                object3 = ((JioAds$Companion)object3).getInstance();
                                object3 = ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object5 = JioAds$LogLevel.NONE;
                                break block128;
                            }
                            string2 = kotlin.text.b.n(string2, (String)object3, string3, false);
                            object3 = new StringBuilder();
                            object5 = ((k)object).q;
                            ((StringBuilder)object3).append((String)object5);
                            object5 = ": replaced leftoverdurationmillis with empty string";
                            ((StringBuilder)object3).append((String)object5);
                            object3 = ((StringBuilder)object3).toString();
                            Intrinsics.checkNotNullParameter(object3, string4);
                            object3 = JioAds.Companion;
                            object3 = ((JioAds$Companion)object3).getInstance();
                            object3 = ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object5 = JioAds$LogLevel.NONE;
                        }
                    }
                    object3 = "[leftoveradcount]";
                    if (string2 != null) {
                        n8 = (int)(StringsKt.F(string2, (CharSequence)object3, false) ? 1 : 0);
                        if (n8 == n7) break block129;
                    }
                    n7 = 0;
                    n3 = null;
                }
                if (n7 == 0) break block131;
                n3 = ((k)object).I;
                if (n3 == null) break block130;
                n4 = n3;
            }
            if (n4 > 0) {
                object2 = new StringBuilder(string3);
                n3 = ((k)object).I;
                ((StringBuilder)object2).append(n3);
                object2 = ((StringBuilder)object2).toString();
                string2 = kotlin.text.b.n(string2, (String)object3, (String)object2, false);
                object3 = new StringBuilder();
                object2 = ((k)object).q;
                ((StringBuilder)object3).append((String)object2);
                object2 = ": replaced leftoveradcount with : ";
                ((StringBuilder)object3).append((String)object2);
                object2 = ((k)object).I;
                ((StringBuilder)object3).append(object2);
                object3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object3, string4);
                object3 = JioAds.Companion;
                object3 = ((JioAds$Companion)object3).getInstance();
                object3 = ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
            string2 = kotlin.text.b.n(string2, (String)object3, string3, false);
            object3 = new StringBuilder();
            object2 = ((k)object).q;
            ((StringBuilder)object3).append((String)object2);
            object2 = ": replaced leftoveradcount with empty string";
            ((StringBuilder)object3).append((String)object2);
            object3 = ((StringBuilder)object3).toString();
            Intrinsics.checkNotNullParameter(object3, string4);
            object3 = JioAds.Companion;
            object3 = ((JioAds$Companion)object3).getInstance();
            object3 = ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            try {
                object = JioAds$LogLevel.NONE;
            }
            catch (Exception exception) {
                object3 = new StringBuilder();
                object = ((k)object).q;
                object2 = ": exception while replacing duration macros";
                j_0.k((StringBuilder)object3, (String)object, (String)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
        return string2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(String object, String string2, String string3) {
        CharSequence charSequence = "%7D";
        Object object2 = "%5D";
        String string4 = "%7B";
        CharSequence charSequence2 = "%5B";
        String string5 = "\\{";
        Object object3 = "\\[";
        StringBuilder stringBuilder = new StringBuilder((String)object3);
        stringBuilder.append(string2);
        object3 = "?\\]";
        stringBuilder.append((String)object3);
        object3 = stringBuilder.toString();
        Regex regex = new Regex((String)object3);
        Intrinsics.checkNotNull(string3);
        object3 = regex.replace((CharSequence)object, string3);
        stringBuilder = new StringBuilder(string5);
        stringBuilder.append(string2);
        string5 = "?\\}";
        stringBuilder.append(string5);
        string5 = stringBuilder.toString();
        regex = new Regex(string5);
        string5 = regex.replace((CharSequence)object3, string3);
        object3 = new StringBuilder((String)charSequence2);
        ((StringBuilder)object3).append(string2);
        ((StringBuilder)object3).append((String)object2);
        object3 = ((StringBuilder)object3).toString();
        regex = null;
        boolean bl2 = StringsKt.F(object, (CharSequence)object3, false);
        if (bl2) {
            stringBuilder = new StringBuilder((String)charSequence2);
            stringBuilder.append(string2);
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            object3 = new Regex((String)object2);
            string5 = ((Regex)object3).replace(string5, string3);
        }
        object2 = new StringBuilder(string4);
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append((String)charSequence);
        object2 = ((StringBuilder)object2).toString();
        boolean bl3 = StringsKt.F(object, (CharSequence)object2, false);
        if (!bl3) return string5;
        charSequence2 = new StringBuilder(string4);
        ((StringBuilder)charSequence2).append(string2);
        ((StringBuilder)charSequence2).append((String)charSequence);
        charSequence = ((StringBuilder)charSequence2).toString();
        object2 = new Regex((String)charSequence);
        return ((Regex)object2).replace(string5, string3);
        {
            catch (Exception exception) {}
        }
        catch (Exception exception) {
            string5 = object;
            object2 = "Error while replacing string--> ";
            charSequence = new StringBuilder((String)object2);
            ((StringBuilder)charSequence).append((String)object);
            char c2 = ' ';
            ((StringBuilder)charSequence).append(c2);
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(c2);
            ir3_0.b((StringBuilder)charSequence, string3, "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
        return string5;
    }

    public static String a(HashMap object, boolean bl2) {
        char c2;
        StringBuilder stringBuilder = new StringBuilder();
        object = object.entrySet().iterator();
        while ((c2 = object.hasNext()) != '\u0000') {
            Object object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            boolean bl3 = TextUtils.isEmpty((CharSequence)(object2 = (String)object2.getValue()));
            if (bl3) continue;
            String string3 = DEFAULT_PARAMS_ENCODING;
            string2 = URLEncoder.encode(string2, string3);
            stringBuilder.append(string2);
            char c3 = '=';
            stringBuilder.append(c3);
            object2 = URLEncoder.encode((String)object2, string3);
            stringBuilder.append((String)object2);
            if (bl2) {
                object2 = "__";
                stringBuilder.append((String)object2);
                continue;
            }
            c2 = '&';
            stringBuilder.append(c2);
        }
        int n3 = stringBuilder.length() + -1;
        stringBuilder.deleteCharAt(n3);
        if (bl2) {
            n3 = stringBuilder.length() + -1;
            stringBuilder.deleteCharAt(n3);
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public static boolean a(Context context) {
        int n3;
        String string2 = "com.jio.web";
        if ((context = context.getPackageManager()) != null) {
            n3 = 1;
            try {
                context.getPackageInfo(string2, n3);
            }
            catch (Exception exception) {}
        }
        n3 = 0;
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(ViewGroup viewGroup, View view, int n3) {
        if (view == null) return 0 != 0;
        int n4 = view.getVisibility();
        if (n4 != 0) return 0 != 0;
        if ((view = view.getParent()) == null) return 0 != 0;
        if (viewGroup == null) return 0 != 0;
        int n7 = viewGroup.getVisibility();
        if (n7 != 0 || (n4 = (int)(viewGroup.getGlobalVisibleRect((Rect)(view = new Rect())) ? 1 : 0)) == 0) return 0 != 0;
        n4 = view.height();
        long l2 = n4;
        long l3 = view.width();
        l2 *= l3;
        n7 = viewGroup.getHeight();
        l3 = n7;
        long l4 = viewGroup.getWidth();
        l3 *= l4;
        int n8 = 100;
        l4 = n8;
        l2 *= l4;
        l4 = l2 / l3;
        l4 = 0L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object <= 0) return 0 != 0;
        l4 = (long)n3 * l3;
        long l8 = l2 - l4;
        if ((n3 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1))) < 0) return 0 != 0;
        return 1 != 0;
    }

    public static final /* synthetic */ String access$getMUserAgent$p() {
        return b;
    }

    public static final void access$saveUserAgentIntoPref(Utility utility, Context context, String string2) {
        utility.getClass();
        j_0.p(context, "common_prefs", 0, string2, "userAgent");
    }

    public static final /* synthetic */ void access$setMUserAgent$p(String string2) {
        b = string2;
    }

    public static final int convertPixelsToDp(int n3) {
        float f5 = n3;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        return ok1_1.b(f5 / f6);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int convertTimeToSec(String object) {
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

    public static final String convertToSHA1(String object) {
        StringBuilder stringBuilder = new StringBuilder();
        if (object != null) {
            Object object2 = "SHA-1";
            object2 = MessageDigest.getInstance((String)object2);
            Object object3 = StandardCharsets.UTF_8;
            String string2 = "UTF_8";
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            object = ((String)object).getBytes((Charset)object3);
            object3 = "this as java.lang.String).getBytes(charset)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            object = ((MessageDigest)object2).digest((byte[])object);
            Intrinsics.checkNotNull(object);
            int n3 = ((Object)object).length;
            object3 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                block16: {
                    int n4 = object[i3] & 0xFF;
                    string2 = Integer.toHexString(n4);
                    char c2 = string2.length();
                    char c3 = '\u0001';
                    if (c2 != c3) break block16;
                    c2 = '0';
                    stringBuilder.append(c2);
                }
                stringBuilder.append(string2);
                continue;
            }
            try {
                object = stringBuilder.toString();
            }
            catch (Exception exception) {}
        }
        object = null;
        return object;
    }

    public static final String convertToSHA2(String object) {
        StringBuilder stringBuilder = new StringBuilder();
        if (object != null) {
            Object object2 = "SHA-256";
            object2 = MessageDigest.getInstance((String)object2);
            Object object3 = StandardCharsets.UTF_8;
            String string2 = "UTF_8";
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            object = ((String)object).getBytes((Charset)object3);
            object3 = "this as java.lang.String).getBytes(charset)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            object = ((MessageDigest)object2).digest((byte[])object);
            Intrinsics.checkNotNull(object);
            int n3 = ((Object)object).length;
            object3 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                block16: {
                    int n4 = object[i3] & 0xFF;
                    string2 = Integer.toHexString(n4);
                    char c2 = string2.length();
                    char c3 = '\u0001';
                    if (c2 != c3) break block16;
                    c2 = '0';
                    stringBuilder.append(c2);
                }
                stringBuilder.append(string2);
                continue;
            }
            try {
                object = stringBuilder.toString();
            }
            catch (Exception exception) {}
        }
        object = null;
        return object;
    }

    public static /* synthetic */ String encodeParameters$default(Utility utility, Map map2, String string2, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string2 = DEFAULT_PARAMS_ENCODING;
        }
        return utility.encodeParameters(map2, string2);
    }

    public static /* synthetic */ String getCcbValue$default(Utility utility, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        return utility.getCcbValue(string2);
    }

    public static /* synthetic */ b getContextBasedMockIJioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(Utility utility, Context context, String string2, List list, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            list = null;
        }
        return utility.getContextBasedMockIJioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(context, string2, list);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final String getSimSerialNumber(Context context) {
        block8: {
            int n3;
            int n4;
            block7: {
                String string2;
                Utility utility;
                Intrinsics.checkNotNullParameter(context, "context");
                String string3 = null;
                try {
                    utility = INSTANCE;
                    string2 = "android.permission.READ_PHONE_STATE";
                }
                catch (Exception exception) {
                    return string3;
                }
                boolean bl2 = utility.isPermissionGranted(context, string2);
                if (!bl2) return string3;
                n4 = utility.getCurrentUIModeType(context);
                n3 = 4;
                if (n4 == n3) break block7;
                return null;
            }
            n4 = Build.VERSION.SDK_INT;
            n3 = 26;
            if (n4 < n3) break block8;
            return null;
        }
        return Build.SERIAL;
    }

    public static final boolean ifOmSdkIsAvailable() {
        boolean bl2;
        Object object = "message";
        Object object2 = "com.iab.omid.library.ril.Omid";
        Class.forName((String)object2);
        object2 = "OM library is available";
        Intrinsics.checkNotNullParameter(object2, object);
        object2 = JioAds.Companion;
        object2 = ((JioAds$Companion)object2).getInstance();
        try {
            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            bl2 = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            object2 = "OM library is not added";
            Intrinsics.checkNotNullParameter(object2, object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static final boolean isNativeTargettingSupporting$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return true;
    }

    public static final boolean isURLValid(String string2) {
        boolean bl2;
        try {
            URL uRL = new URL(string2);
            uRL.toURI();
            bl2 = true;
        }
        catch (Exception exception) {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public static final boolean removeCachedDirectory(File file) {
        if (file == null) {
            return false;
        }
        boolean bl2 = file.exists();
        if (!bl2) {
            return true;
        }
        bl2 = file.isDirectory();
        if (!bl2) {
            return false;
        }
        String[] stringArray = file.list();
        if (stringArray != null) {
            for (String string2 : stringArray) {
                File file2 = new File(file, string2);
                boolean bl3 = file2.isDirectory();
                if (!(bl3 ? !(bl3 = Utility.removeCachedDirectory(file2)) : !(bl3 = file2.delete()))) continue;
                return false;
            }
        }
        return file.delete();
    }

    public static /* synthetic */ String replaceMacros$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(Utility utility, b b2, String string2, String string3, String string4, String string5, Integer n3, boolean bl2, boolean bl3, String string6, boolean bl4, String string7, boolean bl5, String string8, String string9, String string10, String string11, String string12, String string13, int n4, Object object) {
        boolean bl6;
        String string14;
        int n7 = n4;
        int n8 = n4 & 0x400;
        if (n8 != 0) {
            n8 = 0;
            string14 = null;
        } else {
            string14 = string7;
        }
        n8 = n7 & 0x800;
        if (n8 != 0) {
            n8 = 0;
            bl6 = false;
        } else {
            bl6 = bl5;
        }
        n8 = n7 & 0x1000;
        Object object2 = "";
        Object object3 = n8 != 0 ? object2 : string8;
        n8 = n7 & 0x2000;
        Object object4 = n8 != 0 ? object2 : string9;
        n8 = n7 & 0x4000;
        Object object5 = n8 != 0 ? object2 : string10;
        n8 = 32768;
        Object object6 = (n7 &= n8) != 0 ? object2 : string11;
        object2 = utility;
        return utility.replaceMacros$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(b2, string2, string3, string4, string5, n3, bl2, bl3, string6, bl4, string14, bl6, (String)object3, (String)object4, (String)object5, (String)object6, string12, string13);
    }

    /*
     * Exception decompiling
     */
    public static final String replaceSSAIMacros(Context var0, String var1_1, String var2_2, String var3_3, String var4_4, String var5_5, JioAdsMetadata var6_6, String var7_7, JioAdView$AD_TYPE var8_8, String var9_9, Integer var10_10, boolean var11_11, String var12_12, String var13_13, JioAdView var14_14, boolean var15_15, String var16_16, boolean var17_17, String var18_18, String var19_19, String var20_20, String var21_21) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [8 : 557->562)] java.lang.Exception
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

    public static /* synthetic */ String replaceSSAIMacros$default(Context context, String string2, String string3, String string4, String string5, String string6, JioAdsMetadata jioAdsMetadata, String string7, JioAdView$AD_TYPE jioAdView$AD_TYPE, String string8, Integer n3, boolean bl2, String string9, String string10, JioAdView jioAdView, boolean bl3, String string11, boolean bl4, String string12, String string13, String string14, String string15, int n4, Object object) {
        boolean bl5;
        String string16;
        int n7 = n4 & 0x10000;
        if (n7 != 0) {
            n7 = 0;
            string16 = null;
        } else {
            string16 = string11;
        }
        n7 = n4 & 0x20000;
        if (n7 != 0) {
            n7 = 0;
            bl5 = false;
        } else {
            bl5 = bl4;
        }
        n7 = n4 & 0x40000;
        String string17 = "";
        String string18 = n7 != 0 ? string17 : string12;
        n7 = n4 & 0x80000;
        String string19 = n7 != 0 ? string17 : string13;
        n7 = n4 & 0x100000;
        String string20 = n7 != 0 ? string17 : string14;
        n7 = n4 & 0x200000;
        String string21 = n7 != 0 ? string17 : string15;
        string17 = context;
        return Utility.replaceSSAIMacros(context, string2, string3, string4, string5, string6, jioAdsMetadata, string7, jioAdView$AD_TYPE, string8, n3, bl2, string9, string10, jioAdView, bl3, string16, bl5, string18, string19, string20, string21);
    }

    public final String a(String string2, String string3) {
        block20: {
            CharSequence charSequence = "__%5Bcmd%5D";
            String string4 = "__";
            boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl2) {
                bl2 = TextUtils.isEmpty((CharSequence)string2);
                if (bl2) break block20;
                bl2 = TextUtils.isEmpty((CharSequence)string3);
                if (bl2) break block20;
                CharSequence charSequence2 = "__\\[cmd?\\]";
                Regex regex = new Regex((String)charSequence2);
                charSequence2 = new StringBuilder(string4);
                ((StringBuilder)charSequence2).append(string3);
                charSequence2 = ((StringBuilder)charSequence2).toString();
                string2 = regex.replace(string2, (String)charSequence2);
                charSequence2 = "__\\{cmd?\\}";
                regex = new Regex((String)charSequence2);
                charSequence2 = new StringBuilder(string4);
                ((StringBuilder)charSequence2).append(string3);
                charSequence2 = ((StringBuilder)charSequence2).toString();
                string2 = regex.replace(string2, (String)charSequence2);
                bl2 = false;
                regex = null;
                bl2 = StringsKt.F(string2, charSequence, false);
                if (!bl2) break block20;
                regex = new Regex((String)charSequence);
                charSequence = new StringBuilder(string4);
                ((StringBuilder)charSequence).append(string3);
                string3 = ((StringBuilder)charSequence).toString();
                try {
                    string2 = regex.replace(string2, string3);
                }
                catch (Exception exception) {
                    string4 = "Error while replacing string for click tracker-->";
                    charSequence = new StringBuilder(string4);
                    com.jio.jioads.jioreel.tracker.model.b.c(this, exception, (StringBuilder)charSequence);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                }
            }
        }
        return string2;
    }

    public final String a(String string2, HashMap hashMap) {
        block19: {
            CharSequence charSequence = "md_";
            hashMap = fh1_2.q(hashMap);
            boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (bl2) break block19;
            bl2 = false;
            String string3 = null;
            boolean bl3 = StringsKt.F(string2, charSequence, false);
            if (!bl3) break block19;
            bl3 = hashMap.isEmpty();
            boolean bl4 = true;
            if (!(bl3 ^= bl4)) break block19;
            Object object = ((LinkedHashMap)hashMap).keySet();
            try {
                object = object.iterator();
            }
            catch (Exception exception) {
                string3 = "Exception while replacing MetaData->";
                charSequence = new StringBuilder(string3);
                ((StringBuilder)charSequence).append(exception);
                Object object2 = ((StringBuilder)charSequence).toString();
                charSequence = "message";
                Intrinsics.checkNotNullParameter(object2, (String)charSequence);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
            }
            while (true) {
                boolean bl5 = object.hasNext();
                if (!bl5) break;
                Object object3 = object.next();
                object3 = (String)object3;
                CharSequence charSequence2 = String.valueOf(object3);
                boolean bl6 = StringsKt.F(string2, charSequence2, false);
                if (!bl6) continue;
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append((String)object3);
                charSequence2 = ((StringBuilder)charSequence2).toString();
                object3 = ((LinkedHashMap)hashMap).get(object3);
                object3 = (String)object3;
                string2 = this.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2, (String)charSequence2, (String)object3, bl4);
                continue;
                break;
            }
        }
        return string2;
    }

    public final boolean canHandleIntent(Context object, Intent object2) {
        boolean bl2;
        block13: {
            block14: {
                int n3;
                String string2;
                String string3;
                block12: {
                    string3 = "message";
                    string2 = "Build version: ";
                    Intrinsics.checkNotNullParameter(object, "context");
                    Intrinsics.checkNotNullParameter(object2, "intent");
                    bl2 = false;
                    n3 = Build.VERSION.SDK_INT;
                    int n4 = 30;
                    if (n3 >= n4) break block12;
                    object = object.getPackageManager();
                    object = object.queryIntentActivities(object2, 0);
                    object2 = "queryIntentActivities(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    boolean bl3 = object.isEmpty();
                    if (bl3) break block13;
                    break block14;
                }
                object = new StringBuilder(string2);
                object.append(n3);
                object2 = " passing back true from canHandleIntent";
                object.append((String)object2);
                object = object.toString();
                Intrinsics.checkNotNullParameter(object, string3);
                object = JioAds.Companion;
                object = object.getInstance();
                try {
                    object.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
                catch (Exception exception) {
                    Intrinsics.checkNotNullParameter("No Application can handle this intent", string3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
            }
            bl2 = true;
        }
        return bl2;
    }

    public final boolean checkVisibility(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        ViewParent viewParent = viewGroup.getParent();
        if (viewParent == null) {
            return false;
        }
        viewParent = viewGroup.getParent();
        String string2 = "null cannot be cast to non-null type android.view.ViewGroup";
        Intrinsics.checkNotNull(viewParent, string2);
        viewParent = (ViewGroup)viewParent;
        n3 = (int)(Utility.a((ViewGroup)viewParent, (View)viewGroup, n3) ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(viewGroup.hasWindowFocus() ? 1 : 0)) != 0) {
            boolean bl2;
            n3 = viewParent.indexOfChild((View)viewGroup);
            int n4 = viewGroup.getLeft();
            int bl22 = viewGroup.getTop();
            int n7 = viewGroup.getRight();
            int n8 = viewGroup.getBottom();
            string2 = new Rect(n4, bl22, n7, n8);
            n4 = viewParent.getChildCount();
            boolean bl3 = true;
            for (n7 = 0; n7 < n4; ++n7) {
                int n10;
                int n14;
                int n15;
                int n16;
                String string3;
                View view = viewParent.getChildAt(n7);
                String string4 = view.getClass().getName();
                boolean bl4 = string4.equalsIgnoreCase(string3 = viewGroup.getClass().getName());
                if (bl4 || !(bl4 = string2.intersect((Rect)(string4 = new Rect(n16 = view.getLeft(), n15 = view.getTop(), n14 = view.getRight(), n10 = view.getBottom())))) || (n8 = view.getVisibility()) != 0 || n7 <= n3) continue;
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final String compress(String object) {
        int n3;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            block13: {
                Object object2;
                block12: {
                    object2 = new ByteArrayOutputStream();
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream((OutputStream)object2);
                    Object object3 = Charsets.UTF_8;
                    object = ((String)object).getBytes((Charset)object3);
                    object3 = "this as java.lang.String).getBytes(charset)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    ((OutputStream)gZIPOutputStream).write((byte[])object);
                    ((OutputStream)gZIPOutputStream).close();
                    int n4 = Build.VERSION.SDK_INT;
                    int n7 = 26;
                    if (n4 < n7) break block12;
                    object = com.jio.jioads.util.a.a();
                    object2 = ((ByteArrayOutputStream)object2).toByteArray();
                    object = Yx.b((Base64.Encoder)object, (byte[])object2);
                    break block13;
                }
                object = ((ByteArrayOutputStream)object2).toByteArray();
                n3 = 0;
                object2 = null;
                try {
                    object = Base64.encodeToString((byte[])object, (int)0);
                }
                catch (IOException iOException) {
                    object = "";
                }
            }
            return object;
        }
        return object;
    }

    public final int convertDpToPixel(float f5) {
        int n3;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object <= 0) {
            n3 = (int)f5;
        } else {
            object = true;
            n3 = on_2.b(f5, (int)object);
        }
        return n3;
    }

    public final JSONArray convertHashMapToJSONArray(HashMap iterator) {
        Object object;
        Intrinsics.checkNotNullParameter(iterator, "customData");
        JSONArray jSONArray = new JSONArray();
        iterator = iterator.entrySet();
        try {
            iterator = iterator.iterator();
        }
        catch (Exception exception) {
            object = "Exception while converting hashMap to jsonarray: ";
            LO1.b((String)object, exception);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
        while (true) {
            boolean bl2 = iterator.hasNext();
            if (!bl2) break;
            object = iterator.next();
            object = (Map.Entry)object;
            Object object2 = object.getKey();
            object2 = (String)object2;
            object = object.getValue();
            object = (String)object;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(object2, object);
            jSONArray.put((Object)jSONObject);
            continue;
            break;
        }
        return jSONArray;
    }

    public final long convertMinToMillis(Long l2) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNull(l2);
        long l3 = l2;
        return timeUnit.toMillis(l3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String convertTimeFormat(String object) {
        String string2;
        block10: {
            block9: {
                Object object2;
                string2 = "";
                Object object3 = "inputTime";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Object object4 = "HH:mm:ss.SSS";
                try {
                    object2 = Locale.getDefault();
                }
                catch (Exception exception) {
                    return string2;
                }
                object3 = new SimpleDateFormat((String)object4, (Locale)object2);
                object2 = "HH:mm:ss";
                Locale locale = Locale.getDefault();
                object4 = new SimpleDateFormat((String)object2, locale);
                object = ((DateFormat)object3).parse((String)object);
                if (object == null) break block9;
                object = ((DateFormat)object4).format((Date)object);
                break block10;
            }
            object = null;
        }
        if (object != null) return object;
        return string2;
    }

    public final String convertTimestamp(String object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "timestamp");
        Locale locale = Locale.US;
        Object object2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale);
        String string2 = "yyyy-MM-dd'T'HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string2, locale);
        try {
            object = ((DateFormat)object2).parse((String)object);
        }
        catch (Exception exception) {
            return "";
        }
        object2 = Calendar.getInstance();
        ((Calendar)object2).setTime((Date)object);
        int n3 = 13;
        string2 = null;
        ((Calendar)object2).add(n3, 0);
        object = simpleDateFormat.format((Date)object);
        object2 = "format(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int convertToSeconds(String object) {
        block17: {
            String string2;
            Intrinsics.checkNotNullParameter(object, "hhmmss");
            try {
                object = this.convertTimeFormat((String)object);
                string2 = ":";
            }
            catch (Exception exception) {
                return 0;
            }
            String[] stringArray = new String[]{string2};
            int n3 = 6;
            object = StringsKt.a0((CharSequence)object, stringArray, false, 0, n3);
            int n4 = object.size();
            n3 = 3;
            if (n4 != n3) break block17;
            Object e2 = object.get(0);
            String string3 = (String)e2;
            n4 = Integer.parseInt(string3);
            n3 = 1;
            Object e5 = object.get(n3);
            String string4 = (String)e5;
            n3 = Integer.parseInt(string4);
            int n7 = 2;
            object = object.get(n7);
            object = (String)object;
            int n8 = Integer.parseInt((String)object);
            return a60.a(n3, 60, n4 *= 3600, n8);
        }
        String string5 = "Invalid time format. Use HH:mm:ss.SSS";
        object = new IllegalArgumentException(string5);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String encodeAdRequestParameters(Map object, String string2) {
        String string3 = "iaf";
        String string4 = "sbz";
        String string5 = "eads";
        Intrinsics.checkNotNullParameter(object, "params");
        Intrinsics.checkNotNullParameter(string2, "paramsEncoding");
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Object object2 = object.entrySet();
            object2 = object2.iterator();
            while (true) {
                boolean bl2;
                char c2;
                if ((c2 = object2.hasNext()) == '\u0000') {
                    int n3 = stringBuilder.length() + -1;
                    stringBuilder.deleteCharAt(n3);
                    object = stringBuilder.toString();
                    Intrinsics.checkNotNull(object);
                    return object;
                }
                Object object3 = object2.next();
                object3 = (Map.Entry)object3;
                Object object4 = object3.getKey();
                object4 = (String)object4;
                object3 = object3.getValue();
                int n4 = ((String)(object3 = (String)object3)).length();
                if (n4 <= 0) continue;
                String string6 = URLEncoder.encode(object4, string2);
                stringBuilder.append(string6);
                n4 = 61;
                stringBuilder.append((char)n4);
                n4 = (int)(object.containsKey(string5) ? 1 : 0);
                if (n4 != 0 && (n4 = (int)(Intrinsics.areEqual(object4, string5) ? 1 : 0)) != 0 || (n4 = (int)(object.containsKey(string4) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object4, string4) ? 1 : 0)) != 0 || (n4 = (int)(object.containsKey(string3) ? 1 : 0)) != 0 && (bl2 = Intrinsics.areEqual(object4, string3))) {
                    stringBuilder.append((String)object3);
                } else {
                    object3 = URLEncoder.encode((String)object3, string2);
                    stringBuilder.append((String)object3);
                }
                c2 = '&';
                stringBuilder.append(c2);
            }
        }
        catch (Exception exception) {
            return "Encoding not supported.";
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String encodeParameters(Map object, String string2) {
        Intrinsics.checkNotNullParameter(object, "params");
        Intrinsics.checkNotNullParameter(string2, "paramsEncoding");
        StringBuilder stringBuilder = new StringBuilder();
        try {
            object = object.entrySet();
            object = object.iterator();
            while (true) {
                char c2;
                if ((c2 = object.hasNext()) == '\u0000') {
                    int n3 = stringBuilder.length() + -1;
                    stringBuilder.deleteCharAt(n3);
                    return stringBuilder.toString();
                }
                Object object2 = object.next();
                Object object3 = object2.getKey();
                object3 = (String)object3;
                object2 = object2.getValue();
                boolean bl2 = TextUtils.isEmpty((CharSequence)(object2 = (String)object2));
                if (bl2) continue;
                object3 = URLEncoder.encode(object3, string2);
                stringBuilder.append((String)object3);
                char c3 = '=';
                stringBuilder.append(c3);
                object2 = URLEncoder.encode((String)object2, string2);
                stringBuilder.append((String)object2);
                c2 = '&';
                stringBuilder.append(c2);
            }
        }
        catch (Exception exception) {
            return "Encoding not supported.";
        }
    }

    public final String ensureMilliseconds(String string2) {
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = StringsKt.G(string2, '.');
        if (!bl2) {
            string3 = ".000";
            string2 = string2.concat(string3);
        }
        return string2;
    }

    public final long generateTransactionId() {
        return ThreadLocalRandom.current().nextLong(10000000000L, 100000000000L);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String getAdvidFromPreferences(Context object) {
        String string2;
        void var2_6;
        Object object2;
        Object var2_4 = null;
        if (object == null) {
            return null;
        }
        String string3 = "common_prefs";
        String string4 = "advid";
        String string5 = "";
        try {
            object2 = j_0.d(object, string3, 0, string5, string4);
            string3 = "null cannot be cast to non-null type kotlin.String";
        }
        catch (Exception exception) {
            return var2_6;
        }
        Intrinsics.checkNotNull(object2, string3);
        String string6 = string2 = (String)object2;
        return var2_6;
    }

    public final String getAndroidVersion() {
        return Build.VERSION.RELEASE;
    }

    public final String getBundleName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageName();
    }

    public final String getCCBString$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        String string2 = g;
        if (string2 != null) {
            Intrinsics.checkNotNull(string2);
        } else {
            string2 = null;
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String getCbValue(Context object, String string2) {
        String string3 = "";
        String string4 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
        Intrinsics.checkNotNullParameter(object, "context");
        Object object2 = "creativeID";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        try {
            object = Utility.a();
            return object;
        }
        catch (Exception exception) {
            try {
                object2 = new Random();
                object = object.getPackageName();
            }
            catch (Exception exception2) {}
            StringBuilder stringBuilder = new StringBuilder();
            long l2 = ((Random)object2).nextLong();
            stringBuilder.append(l2);
            stringBuilder.append(string3);
            object2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            Intrinsics.checkNotNull(object);
            int n3 = 2;
            object = ((String)object).substring(0, n3);
            Intrinsics.checkNotNullExpressionValue(object, string4);
            stringBuilder.append((String)object);
            int n4 = 58;
            stringBuilder.append((char)n4);
            n4 = ((String)object2).length();
            n4 /= n3;
            object = ((String)object2).substring(0, n4);
            Intrinsics.checkNotNullExpressionValue(object, string4);
            stringBuilder.append((String)object);
            object = string2.substring(0, n3);
            Intrinsics.checkNotNullExpressionValue(object, string4);
            stringBuilder.append((String)object);
            return stringBuilder.toString();
        }
        return string3;
    }

    public final String getCcbStr() {
        return g;
    }

    /*
     * Unable to fully structure code
     */
    public final String getCcbValue(String var1_1) {
        var2_2 = ':';
        var3_3 = new Random();
        var4_4 = new StringBuilder();
        var5_5 = System.currentTimeMillis();
        var4_4.append(var5_5);
        var4_4.append(var2_2);
        var7_6 = JioAds.Companion;
        var7_6 = var7_6.getInstance();
        var7_6 = var7_6.getAppPackage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var4_4.append((String)var7_6);
        var4_4.append(var2_2);
        var5_5 = var3_3.nextLong();
        var4_4.append(var5_5);
        var4_4.append(var2_2);
        var5_5 = var3_3.nextLong();
        var4_4.append(var5_5);
        var4_4.append(var1_1);
        var3_3 = var4_4.toString();
        var4_4 = Charsets.UTF_8;
        var3_3 = var3_3.getBytes((Charset)var4_4);
        var4_4 = "this as java.lang.String).getBytes(charset)";
        Intrinsics.checkNotNullExpressionValue(var3_3, (String)var4_4);
        var4_4 = new CRC32();
        var8_7 = ((Object)var3_3).length;
        var4_4.update((byte[])var3_3, 0, var8_7);
        var9_8 = var4_4.getValue();
        var3_3 = Long.toHexString(var9_8);
        var4_4 = "toHexString(...)";
        try {
            Intrinsics.checkNotNullExpressionValue(var3_3, (String)var4_4);
        }
        catch (Exception v0) {
            block43: {
                block42: {
                    block41: {
                        var3_3 = JioAds.Companion;
                        var3_3 = var3_3.getInstance();
                        var3_3 = var3_3.getAppPackage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var4_4 = new Random();
                        var5_5 = var4_4.nextLong();
                        while (true) {
                            var11_9 = 1;
                            var12_10 = 8888L + (var5_5 >>>= var11_9);
                            ** try [egrp 25[TRYBLOCK] [35 : 246->249)] { 
lbl72:
                            // 1 sources

                            var14_11 = 8889L;
                            var5_5 = 0L;
                            var16_12 = (cfr_temp_0 = (var12_10 -= (var5_5 %= var14_11)) - var5_5) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                            if (var16_12 >= 0) break;
                            var5_5 = var4_4.nextLong();
                            continue;
                            break;
                        }
                        var4_4 = new StringBuilder();
                        var8_7 = 0;
                        var7_6 = null;
                        var17_13 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                        var11_9 = 2;
                        if (var3_3 == null) break block41;
                        var3_3 = var3_3.substring(0, var11_9);
                        Intrinsics.checkNotNullExpressionValue(var3_3, var17_13);
                        break block42;
                    }
                    var3_3 = null;
                }
                var4_4.append((String)var3_3);
                var4_4.append(var2_2);
                var18_14 = 10000L;
                var4_4.append(var18_14);
                if (var1_1 == null) break block43;
                var7_6 = var1_1.substring(0, var11_9);
                Intrinsics.checkNotNullExpressionValue(var7_6, var17_13);
            }
            try {
                var4_4.append((String)var7_6);
                var3_3 = var4_4.toString();
            }
lbl117:
            // 16 sources

            catch (Exception v1) {
                var3_3 = "";
            }
        }
        return var3_3;
    }

    public final Context getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return a;
    }

    public final b getContextBasedMockIJioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(Context context, String string2, List list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "adspotId");
        n n3 = new n(context, string2, list);
        return n3;
    }

    public final String getCountry() {
        return Locale.getDefault().getCountry();
    }

    public final long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public final int getCurrentUIModeType(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        object = object.getSystemService("uimode");
        String string2 = "null cannot be cast to non-null type android.app.UiModeManager";
        Intrinsics.checkNotNull(object, string2);
        object = (UiModeManager)object;
        int n3 = object.getCurrentModeType();
        int n4 = 12;
        if (n3 == n4 || n3 == (n4 = 14)) {
            n3 = 1;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map getErrorMap(e object) {
        Exception exception2;
        HashMap<CharSequence, Object> hashMap;
        String string2;
        block17: {
            boolean bl2;
            String string3;
            boolean bl3;
            CharSequence charSequence;
            block16: {
                string2 = "osv";
                Intrinsics.checkNotNullParameter(object, "errorRequestModel");
                hashMap = new HashMap<CharSequence, Object>();
                try {
                    charSequence = ((e)object).a;
                    bl3 = TextUtils.isEmpty((CharSequence)charSequence);
                    if (bl3) break block16;
                    charSequence = "title";
                    string3 = ((e)object).a;
                    Intrinsics.checkNotNull(string3);
                    hashMap.put(charSequence, string3);
                }
                catch (Exception exception2) {
                    break block17;
                }
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).g)))) {
                charSequence = "des";
                string3 = ((e)object).g;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).f)))) {
                charSequence = "adspot";
                string3 = ((e)object).f;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).i)))) {
                charSequence = "mth";
                string3 = ((e)object).i;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).b)))) {
                charSequence = "ts";
                string3 = ((e)object).b;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).c)))) {
                charSequence = "advid";
                string3 = ((e)object).c;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).d)))) {
                charSequence = "uid";
                string3 = ((e)object).d;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).e)))) {
                charSequence = "pt";
                string3 = ((e)object).e;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).j)))) {
                charSequence = "package";
                string3 = ((e)object).j;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).k)))) {
                charSequence = "code";
                string3 = ((e)object).k;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).l)))) {
                charSequence = "dvm";
                string3 = ((e)object).l;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).o)))) {
                charSequence = "dvb";
                string3 = ((e)object).o;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).m)))) {
                charSequence = "vr";
                string3 = ((e)object).m;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = ((e)object).n)))) {
                charSequence = "av";
                string3 = ((e)object).n;
                Intrinsics.checkNotNull(string3);
                hashMap.put(charSequence, string3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)string2))) {
                charSequence = new StringBuilder();
                string3 = Build.VERSION.RELEASE;
                ((StringBuilder)charSequence).append(string3);
                string3 = "";
                ((StringBuilder)charSequence).append(string3);
                charSequence = ((StringBuilder)charSequence).toString();
                hashMap.put(string2, charSequence);
            }
            if (bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((e)object).p))) return hashMap;
            string2 = "viewUrl";
            object = ((e)object).p;
            Intrinsics.checkNotNull(object);
            hashMap.put(string2, object);
            return hashMap;
        }
        string2 = "Error while converting error data: ";
        LO1.b(string2, exception2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return hashMap;
    }

    public final String getHTML() {
        return "<html lang=\"en\">\n           <head>\n               <title></title>\n               <meta name=\"viewport\" content=\"width=device-width,height=device-height,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\">\n           </head>\n           <body><div class=\"ads-custom-DA\">\n               <div id=\"MAX_Element\" style=\"position: fixed; top: 0px; bottom: 0px; right: 0px; left: 0px;cursor: pointer;\"><script src=\"https://mercury.akamaized.net/delivery/js/aa292f2aa620cd815bef2503fda49342.v1.0.js\"></script><img id=\"port\" data-click = '[\"https://mercury-ck.jio.com/delivery/ck.php?oaparams=2__asi=11214__source=__cb=8dont8o459__dle=2__at=1__ob=1__cd=6__aud=-1__c=24982__rl=0__li=__bi=__mi=__ro=__ag=__tm=0__rr=0.0000__rt=1__rc=1__rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0__dt=1__osv=11__br=google__os=1__ifa=86fbb284-fe83-4840-a061-d7a985cbc670__av=1.0.3__mn=sdk_gphone_x86__vr=AN-2.0.2__a=3075__cn=India__pn=__ct=__st=__ma=1__cid=3075_11214_24982_98188_0_8dont8o459_[ccb]__b=98188__trq=[trq]__bz=[bz]__ccb=[ccb]__[cmd]__trackonly=1__oadest=\"]\n   ' data-deeplink = 'https://www.ajio.com' onClick=\"clik_tracker(this);return false;\"><img id=\"land\" data-click = '[\"https://mercury-ck.jio.com/delivery/ck.php?oaparams=2__asi=11214__source=__cb=8dont8o459__dle=2__at=1__ob=1__cd=6__aud=-1__c=24982__rl=0__li=__bi=__mi=__ro=__ag=__tm=0__rr=0.0000__rt=1__rc=1__rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0__dt=1__osv=11__br=google__os=1__ifa=86fbb284-fe83-4840-a061-d7a985cbc670__av=1.0.3__mn=sdk_gphone_x86__vr=AN-2.0.2__a=3075__cn=India__pn=__ct=__st=__ma=1__cid=3075_11214_24982_98188_0_8dont8o459_[ccb]__b=98188__trq=[trq]__bz=[bz]__ccb=[ccb]__[cmd]__trackonly=1__oadest=\"]\n   ' data-deeplink = 'https://www.ajio.com' onClick=\"clik_tracker(this);return false;\"><script type=\"text/javascript\">var paramsArray = {\"closeButton\":\"f\",\"dt\":\"1\",\"height\":\"1977\",\"width\":\"1080\"}\n   ;var v, d, t;var output = {\"l\":{\"url\":\"https://mercury.akamaized.net/i/5cbd003c6376ae5470dfb466127e1cd8_98188_0.jpg\",\"resolution\":\"320x50\",\"url_min\":\"\",\"url_max\":\"\",\"dt\":1},\"p\":{\"url\":\"https://mercury.akamaized.net/i/1fa5debc48b352e1e54aeefe6bd523b9_98188_0.jpg\",\"resolution\":\"320x480\",\"url_min\":\"\",\"url_max\":\"\",\"dt\":1}}; var tracker =[\"https://mercury.akamaized.net/cm/i.gif?asi=11214&source=&cb=8dont8o459&dle=2&at=1&ob=1&cd=6&aud=-1&c=24982&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&dt=1&osv=11&br=google&os=1&ifa=86fbb284-fe83-4840-a061-d7a985cbc670&av=1.0.3&mn=sdk_gphone_x86&vr=AN-2.0.2&a=3075&cn=India&pn=&ct=&st=&ma=1&cid=3075_11214_24982_98188_0_8dont8o459_[ccb]&b=98188&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]\"]\n   ; var viewableImpTracker = [\"https://mercury.akamaized.net/cm/vi.gif?asi=11214&source=&cb=8dont8o459&dle=2&at=1&ob=1&cd=6&aud=-1&c=24982&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&dt=1&osv=11&br=google&os=1&ifa=86fbb284-fe83-4840-a061-d7a985cbc670&av=1.0.3&mn=sdk_gphone_x86&vr=AN-2.0.2&a=3075&cn=India&pn=&ct=&st=&ma=1&cid=3075_11214_24982_98188_0_8dont8o459_[ccb]&b=98188&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]\"]\n   ; var flag =0;MAX_simplepop(output, paramsArray, v, d, t, flag);</script></div>\n               </div>\n           </body>\n       </html> ";
    }

    public final String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public final String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public final String getModel() {
        return Build.MODEL;
    }

    /*
     * Exception decompiling
     */
    public final String getNetworkConnectionType(Context var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 25->29)] java.lang.Exception
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

    public final HashMap getPredefinedParams$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(Context object, boolean bl2) {
        String string2;
        String string3;
        String string4;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        if (object != null) {
            string4 = this.getNetworkConnectionType((Context)object);
            if (string4 != null) {
                string3 = "md_nt";
                hashMap.put(string3, string4);
            }
            if ((string4 = Utility.getSimSerialNumber((Context)object)) != null) {
                string3 = "md_srid";
                hashMap.put(string3, string4);
            }
            if (bl2) {
                string4 = this.getNetworkConnectionType((Context)object);
                if (string4 != null) {
                    string3 = "ap";
                    hashMap.put(string3, string4);
                }
                if ((object = Utility.getSimSerialNumber((Context)object)) != null) {
                    string4 = "sn";
                    hashMap.put(string4, object);
                }
            }
        }
        if (bl2) {
            object = TimeZone.getDefault().getDisplayName();
            Intrinsics.checkNotNullExpressionValue(object, "getDisplayName(...)");
            string4 = "tz";
            hashMap.put(string4, object);
        }
        object = String.valueOf(Calendar.getInstance().get(11));
        hashMap.put("md_hr", object);
        int n3 = Calendar.getInstance().get(12);
        object = String.valueOf(n3);
        hashMap.put("md_min", object);
        object = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(object, "MODEL");
        boolean bl3 = false;
        string3 = " ";
        String string5 = "";
        object = kotlin.text.b.n((String)object, string3, string5, false);
        string4 = DEFAULT_PARAMS_ENCODING;
        object = URLEncoder.encode((String)object, string4);
        if (object != null && !(bl3 = TextUtils.isEmpty((CharSequence)object))) {
            if (bl2) {
                string4 = "mn";
                hashMap.put(string4, object);
            }
            string4 = "md_dvm";
            hashMap.put(string4, object);
        }
        if ((object = Build.BRAND) != null && !(bl3 = TextUtils.isEmpty((CharSequence)object))) {
            if (bl2) {
                string4 = "br";
                hashMap.put(string4, object);
            }
            string4 = "md_dvb";
            hashMap.put(string4, object);
        }
        if (bl2) {
            hashMap.put("os", "1");
            object = new StringBuilder();
            string2 = Build.VERSION.RELEASE;
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(string5);
            object = ((StringBuilder)object).toString();
            string2 = "osv";
            hashMap.put(string2, object);
        }
        object = new StringBuilder();
        string2 = Build.VERSION.RELEASE;
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(string5);
        object = ((StringBuilder)object).toString();
        hashMap.put("md_osv", object);
        return hashMap;
    }

    public final String[] getScreenHeightAndWidth(Context object) {
        int n3;
        int n4;
        int n7 = 2;
        String[] stringArray = new String[n7];
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int n8 = displayMetrics.widthPixels;
        int n10 = displayMetrics.heightPixels;
        Object object2 = new StringBuilder("actual device width : ");
        ((StringBuilder)object2).append(n8);
        object2 = ((StringBuilder)object2).toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        String string3 = "actual device height: ";
        object3 = new StringBuilder(string3);
        ((StringBuilder)object3).append(n10);
        object3 = ((StringBuilder)object3).toString();
        Intrinsics.checkNotNullParameter(object3, string2);
        object2 = ((JioAds$Companion)object2).getInstance();
        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (object != null && (object = object.getResources()) != null && (object = object.getConfiguration()) != null) {
            n4 = ((Configuration)object).orientation;
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        object2 = null;
        int n14 = 1;
        object3 = "";
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            stringArray[0] = object = UX.a(n8, (String)object3);
            stringArray[n14] = object = UX.a(n10, (String)object3);
        } else if (object != null && (n4 = ((Integer)object).intValue()) == n14) {
            stringArray[0] = object = UX.a(n10, (String)object3);
            stringArray[n14] = object = UX.a(n8, (String)object3);
        } else {
            stringArray[0] = object = UX.a(n10, (String)object3);
            stringArray[n14] = object = UX.a(n8, (String)object3);
        }
        return stringArray;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String getSimOperator(Context object) {
        TelephonyManager telephonyManager;
        String string2;
        String string3 = null;
        if (object != null) {
            string2 = "phone";
            Object object2 = object.getSystemService(string2);
        } else {
            Object var1_3 = null;
        }
        string2 = "null cannot be cast to non-null type android.telephony.TelephonyManager";
        try {
            void var1_4;
            Intrinsics.checkNotNull(var1_4, string2);
            telephonyManager = (TelephonyManager)var1_4;
        }
        catch (Exception exception) {
            return string3;
        }
        return telephonyManager.getSimOperator();
    }

    public final String getStaticDataForTestingVast() {
        return "<VAST version=\"3.0\">\n    <Ad id=\"138184\" sequence=\"1\">\n        <InLine>\n            <AdSystem>\n                <![CDATA[ JioAds ]]>\n            </AdSystem>\n            <AdTitle>\n                <![CDATA[ Reliance Foundation_30 secs ]]>\n            </AdTitle>\n            <Description>\n                <![CDATA[ Inline Video Ad ]]>\n            </Description>\n            <Error>\n                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&ec=[ERRORCODE]&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd] ]]>\n            </Error>\n            <Impression id=\"primaryAdServer\">\n                <![CDATA[ https://mercury.akamaized.net/cm/i.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&seq=[seq] ]]>\n            </Impression>\n            <ViewableImpression id=\"primaryAdServer\">\n                <Viewable>\n                    <![CDATA[ https://mercury.akamaized.net/cm/vi.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&seq=[seq] ]]>\n                </Viewable>\n            </ViewableImpression>\n            <Creatives>\n                <Creative sequence=\"1\" id=\"138184\">\n                    <Linear skipoffset=\"00:00:00\">\n                        <AdID>\n                            <![CDATA[ 138184 ]]>\n                        </AdID>\n                        <Duration>00:00:30</Duration>\n                        <TrackingEvents>\n                            <Tracking event=\"start\">\n                                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&event=start ]]>\n                            </Tracking>\n                            <Tracking event=\"midpoint\">\n                                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&event=midpoint ]]>\n                            </Tracking>\n                            <Tracking event=\"firstQuartile\">\n                                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&event=firstquartile ]]>\n                            </Tracking>\n                            <Tracking event=\"thirdQuartile\">\n                                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&event=thirdquartile ]]>\n                            </Tracking>\n                            <Tracking event=\"complete\">\n                                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&event=complete ]]>\n                            </Tracking>\n                            <Tracking event=\"mute\">\n                                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&event=mute ]]>\n                            </Tracking>\n                            <Tracking event=\"pause\">\n                                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&event=pause ]]>\n                            </Tracking>\n                            <Tracking event=\"unmute\">\n                                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&event=unmute ]]>\n                            </Tracking>\n                            <Tracking event=\"resume\">\n                                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&event=resume ]]>\n                            </Tracking>\n                            <Tracking event=\"replay\">\n                                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&event=replay ]]>\n                            </Tracking>\n                            <Tracking event=\"fullscreen\">\n                                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&event=fullscreen ]]>\n                            </Tracking>\n                            <Tracking event=\"stop\">\n                                <![CDATA[ https://mercury.akamaized.net/cm/e.gif?asi=15048&source=&cb=ttv0tey0ag&dle=2&at=5&ob=5&cd=6&aud=-1&c=36313&rl=0&li=&bi=&mi=&ro=&ag=&tm=0&rr=0.0000&rt=1&rc=1&rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0&os=1&av=1.0.0&vr=AN-1.15.84&mn=motorolaedge30&br=motorola&osv=13&dt=1&a=3075&cn=India&pn=363641&ct=Morvi&st=Gujarat&cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]&b=138184&trq=[trq]&bz=[bz]&ccb=[ccb]&[cmd]&event=stop ]]>\n                            </Tracking>\n                        </TrackingEvents>\n                        <VideoClicks>\n                            <ClickTracking id=\"JioAds\">\n                                <![CDATA[ https://mercury-ck.jio.com/delivery/ck.php?oaparams=2__asi=15048__source=__cb=ttv0tey0ag__dle=2__at=5__ob=5__cd=6__aud=-1__c=36313__rl=0__li=__bi=__mi=__ro=__ag=__tm=0__rr=0.0000__rt=1__rc=1__rcs=da4b9237bacccdf19c0760cab7aec4a8359010b0__os=1__av=1.0.0__vr=AN-1.15.84__mn=motorolaedge30__br=motorola__osv=13__dt=1__a=3075__cn=India__pn=363641__ct=Morvi__st=Gujarat__cid=3075_15048_36313_138184_0_ttv0tey0ag_[ccb]__b=138184__trq=[trq]__bz=[bz]__ccb=[ccb]__[cmd] ]]>\n                            </ClickTracking>\n                        </VideoClicks>\n                        <MediaFiles>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"1920\" height=\"1080\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"14\">\n                                <![CDATA[ https://mercury.akamaized.net/v/92de67ea356c078ec5e0b26a7bd7c0b7_36313_0.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"176\" height=\"144\" type=\"video/3gpp\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"56\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209123604_mvpfid_1.3gp ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"320\" height=\"180\" type=\"video/3gpp\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"192\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209123613_mvpfid_2.3gp ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"480\" height=\"270\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"394\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209123623_mvpfid_3.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"640\" height=\"360\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"299\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209123642_mvpfid_4.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"640\" height=\"360\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"394\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209123657_mvpfid_5.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"640\" height=\"480\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"485\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209123715_mvpfid_6.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"720\" height=\"406\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"485\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209123736_mvpfid_7.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"854\" height=\"480\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"706\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209123757_mvpfid_8.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"960\" height=\"540\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"1222\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209123832_mvpfid_9.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"1024\" height=\"576\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"706\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209123909_mvpfid_10.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"1024\" height=\"576\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"1222\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209123939_mvpfid_11.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"1280\" height=\"720\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"706\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209124022_mvpfid_12.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"1280\" height=\"720\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"1222\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209124056_mvpfid_13.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"1280\" height=\"720\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"1958\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209124143_mvpfid_14.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"1920\" height=\"1080\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"2598\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209124240_mvpfid_15.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"progressive\" width=\"1920\" height=\"1080\" type=\"video/mp4\" scalable=\"true\" maintainAspectRatio=\"true\" bitrate=\"3981\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/20230209124347_mvpfid_16.mp4 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"streaming\" width=\"640\" height=\"360\" type=\"application/x-mpegURL\" scalable=\"true\" maintainAspectRatio=\"true\" minBitrate=\"120\" maxBitrate=\"120\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/mvpfid_17/20230209124521_mvpfid_17.m3u8 ]]>\n                            </MediaFile>\n                            <MediaFile id=\"RJAP\" delivery=\"streaming\" width=\"1920\" height=\"1080\" type=\"application/x-mpegURL\" scalable=\"true\" maintainAspectRatio=\"true\" minBitrate=\"120\" maxBitrate=\"120\">\n                                <![CDATA[ https://mercury.akamaized.net/v/138184/mvpfid_19/20230209124558_mvpfid_19.m3u8 ]]>\n                            </MediaFile>\n                        </MediaFiles>\n                        <AdParameters>\n                            <jtitle>\n                                <![CDATA[ Reliance Foundation ]]>\n                            </jtitle>\n                            <jdesc>\n                                <![CDATA[ reliancefoundation.org/ ]]>\n                            </jdesc>\n                            <jctatext>\n                                <![CDATA[ Know More ]]>\n                            </jctatext>\n                            <jicon>\n                                <![CDATA[ https://mercury.akamaized.net/i/eeab25fd4483cb428f6072738ed2e538_0_138184.jpg ]]>\n                            </jicon>\n                        </AdParameters>\n                    </Linear>\n                </Creative>\n            </Creatives>\n        </InLine>\n    </Ad>\n</VAST> ";
    }

    public final String[] getStbModels$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return e;
    }

    public final String getTime(long l2) {
        long l3;
        String string2;
        int n3 = 1000;
        long l4 = n3;
        l4 = l2 / l4;
        long l7 = 60;
        l4 %= l7;
        int n4 = 60000;
        long l8 = n4;
        l8 = l2 / l8 % l7;
        l7 = 3600000;
        l2 /= l7;
        int n7 = 24;
        l7 = n7;
        StringBuilder stringBuilder = new StringBuilder();
        long l12 = 0L;
        long l14 = (l2 %= l7) - l12;
        Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object > 0) {
            stringBuilder.append(l2);
            string2 = " Hours ";
            stringBuilder.append(string2);
        }
        if (object > 0 || (l3 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1)) > 0) {
            stringBuilder.append(l8);
            string2 = " Mins ";
            stringBuilder.append(string2);
        }
        return jl0_0.b(stringBuilder, l4, " Seconds");
    }

    public final String getTimeStamp(Date date) {
        Locale locale = Locale.getDefault();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
        simpleDateFormat.format(date);
        return simpleDateFormat.format(date);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getUidFromPreferences(Context object) {
        String string2 = null;
        if (object == null) {
            return null;
        }
        String string3 = "common_prefs";
        try {
            SharedPreferences sharedPreferences2 = j_0.o(object, string3);
            string3 = "dev_subscriberId_key";
            string3 = sharedPreferences2.getString(string3, null);
            boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
            if (bl2) {
                string3 = "subscriberId_key";
                string2 = sharedPreferences2.getString(string3, null);
            } else {
                string2 = string3;
            }
        }
        catch (Exception exception) {}
        l_0.h("getting uid from sharedPRef: ", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return string2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getUserAgent(Context var1_1) {
        synchronized (this) {
            block27: {
                block26: {
                    var2_3 = "inside getUserAgent";
                    var3_4 = "message";
                    try {
                        Intrinsics.checkNotNullParameter(var2_3, (String)var3_4);
                        var2_3 = JioAds.Companion;
                        var3_4 = var2_3.getInstance();
                        var3_4.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var3_4 = JioAds$LogLevel.NONE;
                        try {
                            var3_4 = var2_3.getInstance();
                            var3_4 = var3_4.getCustomUserAgent();
                            var4_5 = null;
                            if (var3_4 != null) {
                                var3_4 = StringsKt.m0((CharSequence)var3_4);
                                var3_4 = var3_4.toString();
                            } else {
                                var5_6 = 0;
                                var3_4 = null;
                            }
                            if (var3_4 != null && (var5_6 = var3_4.length()) != 0) {
                                var1_1 = var2_3.getInstance();
                                if ((var1_1 = var1_1.getCustomUserAgent()) == null) return var4_5;
                                var1_1 = StringsKt.m0((CharSequence)var1_1);
                                return var1_1.toString();
                            }
                        }
                        catch (Exception v0) {
                            break block26;
                        }
                    }
                    catch (Throwable var1_2) {
                        break block27;
                    }
                    {
                        var2_3 = Utility.b;
                        if (var2_3 != null || var1_1 == null) break block26;
                        var2_3 = "common_prefs";
                        var3_4 = "";
                        var6_7 = "userAgent";
                        var7_8 = false;
                    }
                    {
                        var5_6 = (var2_3 = j_0.d((Context)var1_1, (String)var2_3, 0, var3_4, var6_7)) instanceof String;
                        if ((var2_3 = var5_6 != 0 ? (String)var2_3 : null) == null) {
                            var2_3 = "";
                        }
                        var3_4 = "json";
                        Intrinsics.checkNotNullParameter(var2_3, (String)var3_4);
                    }
                    try {
                        var3_4 = new JSONObject((String)var2_3);
                        var6_7 = "user_agent";
                        var6_7 = var3_4.optString(var6_7);
                        var8_9 = "optString(...)";
                        Intrinsics.checkNotNullExpressionValue(var6_7, var8_9);
                        var8_9 = "saveTime";
                        var9_10 = var3_4.optLong(var8_9);
                        var2_3 = new m(var6_7, var9_10);
                    }
                    catch (Exception v1) {
                        var2_3 = null;
                    }
                    if (var2_3 == null) ** GOTO lbl57
                    {
                        block28: {
                            var3_4 = var2_3.a;
                            break block28;
lbl57:
                            // 1 sources

                            var5_6 = 0;
                            var3_4 = null;
                        }
                        var11_11 = 1;
                        if (var3_4 != null && (var12_12 = var3_4.length()) != 0) {
                            var12_12 = 0;
                            var8_9 = null;
                        } else {
                            var12_12 = 1;
                        }
                        if ((var12_12 ^= var11_11) == 0) ** GOTO lbl-1000
                        var4_5 = var3_4;
                    }
lbl-1000:
                    // 2 sources

                    {
                        Utility.b = var4_5;
                        if (var2_3 == null) ** GOTO lbl83
                    }
                    try {
                        var13_13 = var2_3.b;
                        var9_10 = System.currentTimeMillis() - var13_13;
                        var13_13 = 86400000L;
                        var15_14 = var9_10 == var13_13 ? 0 : (var9_10 < var13_13 ? -1 : 1);
                        if (var15_14 >= 0) {
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Exception v2) {}
                    var7_8 = true;
lbl-1000:
                    // 2 sources

                    {
                        if (!var7_8 && (var5_6 = (var3_4 = var2_3.a).length()) != 0) {
                            Utility.b = var1_1 = var2_3.a;
                            break block26;
                        }
lbl83:
                        // 3 sources

                        var2_3 = new o((Context)var1_1);
                        s.c((Function0)var2_3);
                    }
                }
                var1_1 = "returning useragent";
                var2_3 = "message";
                Intrinsics.checkNotNullParameter(var1_1, (String)var2_3);
                var1_1 = JioAds.Companion;
                var1_1 = var1_1.getInstance();
                var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var1_1 = JioAds$LogLevel.NONE;
                return Utility.b;
            }
            throw var1_2;
        }
    }

    public final Map getUserAgentHeader(Context object) {
        Intrinsics.checkNotNullParameter(object, "mContext");
        HashMap<String, Context> hashMap = new HashMap<String, Context>();
        String string2 = "User-Agent";
        object = this.getUserAgent((Context)object);
        try {
            hashMap.put(string2, (Context)object);
        }
        catch (Exception exception) {
            string2 = "message";
            Intrinsics.checkNotNullParameter("Reqhead", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
        return hashMap;
    }

    public final long getViewableTime(int n3, boolean n4) {
        long l2 = !(n3 == 0 ? n4 == 0 : n3 != (n4 = 1)) ? 2000L : 1000L;
        return l2;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean isAppForeground() {
        void var2_5;
        int n3;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)runningAppProcessInfo);
        int bl2 = runningAppProcessInfo.importance;
        int n4 = 100;
        if (bl2 != n4 && bl2 != (n3 = 200)) {
            boolean bl3 = false;
            runningAppProcessInfo = null;
        } else {
            boolean bl4 = true;
        }
        return (boolean)var2_5;
    }

    public final boolean isApplicationError(String string2) {
        Intrinsics.checkNotNullParameter(string2, "errorTitle");
        String string3 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING.getErrorTitle();
        boolean bl2 = Intrinsics.areEqual(string2, string3);
        boolean bl3 = true;
        if (bl2) {
            bl2 = true;
        } else {
            string3 = JioAdError$JioAdErrorType.ERROR_MISMATCH_AD_TYPE.getErrorTitle();
            bl2 = Intrinsics.areEqual(string2, string3);
        }
        if (!bl2) {
            string3 = JioAdError$JioAdErrorType.ERROR_INVALID_AD_REQUEST_PARAMETERS.getErrorTitle();
            bl3 = Intrinsics.areEqual(string2, string3);
        }
        return bl3;
    }

    public final boolean isChromecustomTabDependancyAvailable() {
        Object object = "message";
        boolean bl2 = true;
        Object object2 = "android.support.customtabs.CustomTabsIntent";
        try {
            Class.forName((String)object2);
            object2 = "Custom chromeTab available: true";
        }
        catch (Exception exception) {
            object2 = "Chrome Tab Available: true";
            try {
                Intrinsics.checkNotNullParameter(object2, object);
                object2 = JioAds.Companion;
            }
            catch (Exception exception2) {
                Intrinsics.checkNotNullParameter("Chrome Tab Available: false", object);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                return false;
            }
            object2 = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return bl2;
        }
        Intrinsics.checkNotNullParameter(object2, object);
        object2 = JioAds.Companion;
        object2 = ((JioAds$Companion)object2).getInstance();
        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        return bl2;
    }

    public final boolean isConfigEnvUpdated() {
        return d;
    }

    public final boolean isConfigInit() {
        return c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object isCustomChromeTabAvailable(Context object, String charSequence, int n3) {
        Exception exception2;
        String string2 = "com.android.chrome";
        Intrinsics.checkNotNullParameter(object, "context");
        String string3 = "url";
        Intrinsics.checkNotNullParameter(charSequence, string3);
        boolean bl2 = this.isChromecustomTabDependancyAvailable();
        String string4 = "android.intent.action.VIEW";
        int n4 = 1;
        if (n3 != n4) {
            try {
                return new Intent(string4);
            }
            catch (Exception exception2) {
            }
        } else {
            n3 = this.getCurrentUIModeType((Context)object);
            String string5 = "message";
            int n7 = 4;
            String string6 = "build(...)";
            if (n3 == n7) {
                if (!bl2) return new Intent(string4);
                boolean bl3 = Utility.a((Context)object);
                if (!bl3) return new Intent(string4);
                object = "OpenInApp is enabled and jio pages is available so returning JioPages customTab intent";
                Intrinsics.checkNotNullParameter(object, string5);
                object = JioAds.Companion;
                object = ((JioAds$Companion)object).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = new CustomTabsIntent$e();
                charSequence = ((CustomTabsIntent$e)object).a;
                String string7 = "android.support.customtabs.extra.TITLE_VISIBILITY";
                charSequence.putExtra(string7, n4);
                object = ((CustomTabsIntent$e)object).a();
                Intrinsics.checkNotNullExpressionValue(object, string6);
                charSequence = ((CustomTabsIntent)object).intent;
                string7 = "com.jio.web";
                charSequence.setPackage(string7);
                charSequence = ((CustomTabsIntent)object).intent;
                string7 = "ENABLE_CURSOR";
                charSequence.putExtra(string7, n4 != 0);
                return object;
            }
            if (!bl2) return new Intent(string4);
            string3 = "android.support.customtabs.action.CustomTabsService";
            Object object2 = new Intent(string3);
            object2.setPackage(string2);
            string3 = object.getPackageManager();
            n7 = 0;
            object2 = string3.queryIntentServices((Intent)object2, 0);
            string3 = "queryIntentServices(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            n3 = object2.isEmpty() ^ n4;
            if (n3 == 0) return new Intent(string4);
            object2 = "OpenInApp is enabled and Chrome Custom Tab is available so returning Chrome customTab intent";
            Intrinsics.checkNotNullParameter(object2, string5);
            object2 = JioAds.Companion;
            object2 = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = new CustomTabsIntent$e();
            object2 = ((CustomTabsIntent$e)object2).a();
            Intrinsics.checkNotNullExpressionValue(object2, string6);
            string3 = ((CustomTabsIntent)object2).intent;
            string3.setPackage(string2);
            string2 = ((CustomTabsIntent)object2).intent;
            charSequence = Uri.parse((String)charSequence);
            string2.setData((Uri)charSequence);
            charSequence = ((CustomTabsIntent)object2).intent;
            string2 = "intent";
            Intrinsics.checkNotNullExpressionValue(charSequence, string2);
            boolean bl4 = this.canHandleIntent((Context)object, (Intent)charSequence);
            if (!bl4) return new Intent(string4);
            return object2;
        }
        charSequence = new StringBuilder("Exception in isCustomChromeTabAvailable ");
        com.jio.jioads.jioreel.tracker.model.b.c(this, exception2, (StringBuilder)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return null;
    }

    public final boolean isDeliveryError(String string2) {
        Intrinsics.checkNotNullParameter(string2, "errorTitle");
        String string3 = JioAdError$JioAdErrorType.ERROR_NETWORK_ERROR.getErrorTitle();
        boolean bl2 = Intrinsics.areEqual(string2, string3);
        boolean bl3 = true;
        if (bl2) {
            bl2 = true;
        } else {
            string3 = JioAdError$JioAdErrorType.ERROR_REQUEST_BLOCKED.getErrorTitle();
            bl2 = Intrinsics.areEqual(string2, string3);
        }
        if (bl2) {
            bl2 = true;
        } else {
            string3 = JioAdError$JioAdErrorType.ERROR_ADSPOT_NOT_LINKED.getErrorTitle();
            bl2 = Intrinsics.areEqual(string2, string3);
        }
        if (bl2) {
            bl2 = true;
        } else {
            string3 = JioAdError$JioAdErrorType.ERROR_AD_SPOT_DOES_NOT_EXIST.getErrorTitle();
            bl2 = Intrinsics.areEqual(string2, string3);
        }
        if (bl2) {
            bl2 = true;
        } else {
            string3 = JioAdError$JioAdErrorType.ERROR_DAILY_IMPRESSION_LIMIT_REACHED.getErrorTitle();
            bl2 = Intrinsics.areEqual(string2, string3);
        }
        if (!bl2) {
            string3 = JioAdError$JioAdErrorType.ERROR_NOFILL.getErrorTitle();
            bl3 = Intrinsics.areEqual(string2, string3);
        }
        return bl3;
    }

    public final boolean isDeviceJioSTB() {
        Object[] objectArray = e;
        String string2 = Build.MODEL;
        return tp_2.w(objectArray, string2);
    }

    public final boolean isDeviceTypeTablet(Context context) {
        int n3;
        block5: {
            block4: {
                String string2 = "context";
                Intrinsics.checkNotNullParameter(context, string2);
                try {
                    context = context.getResources();
                }
                catch (Exception exception) {}
                context = context.getConfiguration();
                n3 = context.screenLayout & 0xF;
                int n4 = 3;
                if (n3 < n4) break block4;
                n3 = 1;
                break block5;
            }
            n3 = 0;
            context = null;
        }
        return n3 != 0;
    }

    public final boolean isFireTvJCApp(Context context) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(context, "context");
        Object object = Build.MANUFACTURER;
        String string2 = "Amazon";
        int n3 = Intrinsics.areEqual(string2, object);
        return n3 != 0 && (bl2 = this.isPackage(context, string2 = "com.jio.media.stb.ondemand", (Integer)(object = Integer.valueOf(n3 = 4))));
    }

    public final boolean isIntentActivityPresent(Context context, String string2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "url");
        Intent intent = new Intent("android.intent.action.VIEW");
        string2 = Uri.parse((String)string2);
        intent.setData((Uri)string2);
        return this.canHandleIntent(context, intent);
    }

    public final boolean isInternetAvailable(Context object) {
        boolean bl2;
        String string2;
        if (object != null) {
            string2 = "connectivity";
            object = object.getSystemService(string2);
        } else {
            bl2 = false;
            object = null;
        }
        object = (ConnectivityManager)object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        boolean bl3 = false;
        if (n3 >= n4) {
            if (object != null && (string2 = jk2_0.a((ConnectivityManager)object)) != null) {
                if ((object = object.getNetworkCapabilities((Network)string2)) == null) {
                    return false;
                }
                n3 = 1;
                n4 = (int)(object.hasTransport(n3) ? 1 : 0);
                if (n4 != 0 || (n4 = (int)(object.hasTransport(0) ? 1 : 0)) != 0 || (n4 = (int)(object.hasTransport(3) ? 1 : 0)) != 0 || (bl2 = object.hasTransport(n4 = 2))) {
                    bl3 = true;
                }
            }
            return bl3;
        }
        if (object != null && (object = object.getActiveNetworkInfo()) != null) {
            bl3 = object.isConnected();
        }
        return bl3;
    }

    public final boolean isJioStbOttModel() {
        Object[] objectArray = f;
        String string2 = Build.PRODUCT;
        return tp_2.w(objectArray, string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isPackage(Context context, String string2, Integer n3) {
        String string3;
        PackageManager packageManager;
        boolean bl2;
        block11: {
            block10: {
                Intrinsics.checkNotNullParameter(string2, "packageName");
                bl2 = false;
                if (context == null) return bl2;
                try {
                    packageManager = context.getPackageManager();
                    string3 = null;
                    if (packageManager == null) break block10;
                }
                catch (Exception exception) {
                    return bl2;
                }
                String string4 = context.getPackageName();
                packageManager = packageManager.getPackageInfo(string4, 0);
                break block11;
            }
            packageManager = null;
        }
        if (packageManager != null) {
            string3 = packageManager.packageName;
        }
        int n4 = Intrinsics.areEqual(string2, string3);
        if (n4 == 0) return bl2;
        if (n3 == null) return true;
        int n7 = this.getCurrentUIModeType(context);
        n4 = n3;
        if (n7 != n4) return bl2;
        return true;
    }

    public final boolean isPermissionGranted(Context object, String string2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(string2, "permission");
        boolean bl2 = false;
        try {
            int n3 = object.checkCallingOrSelfPermission(string2);
            if (n3 == 0) {
                bl2 = true;
            }
            return bl2;
        }
        catch (Exception exception) {
            l_0.h("Exception while checking for permission ", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return false;
        }
    }

    public final boolean isSDKError(String string2) {
        Intrinsics.checkNotNullParameter(string2, "errorTitle");
        String string3 = JioAdError$JioAdErrorType.ERROR_TIMEOUT.getErrorTitle();
        boolean bl2 = Intrinsics.areEqual(string2, string3);
        boolean bl3 = true;
        if (bl2) {
            bl2 = true;
        } else {
            string3 = JioAdError$JioAdErrorType.ERROR_AD_DOWNLOADING.getErrorTitle();
            bl2 = Intrinsics.areEqual(string2, string3);
        }
        if (bl2) {
            bl2 = true;
        } else {
            string3 = JioAdError$JioAdErrorType.ERROR_ADPOD_TIMEOUT.getErrorTitle();
            bl2 = Intrinsics.areEqual(string2, string3);
        }
        if (bl2) {
            bl2 = true;
        } else {
            string3 = JioAdError$JioAdErrorType.ERROR_IN_LOAD_AD.getErrorTitle();
            bl2 = Intrinsics.areEqual(string2, string3);
        }
        if (bl2) {
            bl2 = true;
        } else {
            string3 = JioAdError$JioAdErrorType.ERROR_PLAYER_PREPARATION_FAILED.getErrorTitle();
            bl2 = Intrinsics.areEqual(string2, string3);
        }
        if (bl2) {
            bl2 = true;
        } else {
            string3 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR.getErrorTitle();
            bl2 = Intrinsics.areEqual(string2, string3);
        }
        if (!bl2) {
            string3 = JioAdError$JioAdErrorType.ERROR_PARSING.getErrorTitle();
            bl3 = Intrinsics.areEqual(string2, string3);
        }
        return bl3;
    }

    public final boolean isSystemApp$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        Object object2 = object.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(object2, "getPackageManager(...)");
        object = object.getPackageName();
        boolean bl2 = false;
        object = object2.getApplicationInfo((String)object, 0);
        object2 = "getApplicationInfo(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        int n3 = object.flags & 0x81;
        int n4 = 1;
        if (n3 == n4) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean isWebViewEnabled() {
        boolean bl2;
        Object object = "message";
        Object object2 = "web view enabled";
        Intrinsics.checkNotNullParameter(object2, object);
        object2 = JioAds.Companion;
        object2 = ((JioAds$Companion)object2).getInstance();
        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        try {
            CookieManager.getInstance();
            bl2 = true;
        }
        catch (Exception exception) {
            object2 = "web view disabled";
            Intrinsics.checkNotNullParameter(object2, object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final String loadJSONFromAsset(Context object, String object2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Object object3 = "fileName";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object = object.getAssets();
        object = object.open((String)object2);
        object2 = "open(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        int n3 = ((InputStream)object).available();
        object2 = new byte[n3];
        ((InputStream)object).read((byte[])object2);
        ((InputStream)object).close();
        object3 = Charsets.UTF_8;
        try {
            object = new String((byte[])object2, (Charset)object3);
        }
        catch (IOException iOException) {
            object = null;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void logError(Context var1_1, String var2_6, d var3_7, String var4_8, String var5_9, com.jio.jioads.cdnlogging.a var6_10, String var7_11, Boolean var8_12, String var9_13, String var10_14, boolean var11_15) {
        var12_16 = new Object();
        var12_16.a = var4_8;
        var12_16.g = var5_9 /* !! */ ;
        var12_16.f = var2_6;
        var12_16.h = var3_7;
        var12_16.i = var7_11;
        var2_6 = Calendar.getInstance();
        var4_8 = Locale.getDefault();
        var5_9 /* !! */  = "yyyy-dd-MM HH:mm:ss";
        var3_7 = new SimpleDateFormat((String)var5_9 /* !! */ , (Locale)var4_8);
        var2_6 = var2_6.getTime();
        var12_16.b = var2_6 = var3_7.format((Date)var2_6);
        var2_6 = null;
        var3_7 = null;
        if (var1_1 /* !! */  != null) {
            Intrinsics.checkNotNullParameter(var1_1 /* !! */ , "context");
            var4_8 = "common_prefs";
            var5_9 /* !! */  = "advid";
            var7_11 = "";
            var4_8 = j_0.d(var1_1 /* !! */ , (String)var4_8, 0, var7_11, (String)var5_9 /* !! */ );
            var5_9 /* !! */  = "null cannot be cast to non-null type kotlin.String";
            try {
                Intrinsics.checkNotNull(var4_8, (String)var5_9 /* !! */ );
                var4_8 = (String)var4_8;
            }
            catch (Exception v0) {
                var13_17 = false;
                var4_8 = null;
            }
            var12_16.c = var4_8;
        }
        if (var1_1 /* !! */  != null) {
            var4_8 = Utility.INSTANCE.getUidFromPreferences(var1_1 /* !! */ );
        } else {
            var13_17 = false;
            var4_8 = null;
        }
        var12_16.d = var4_8;
        var12_16.e = "AN";
        var12_16.j = var9_13;
        var12_16.k = var10_14;
        var12_16.l = var4_8 = Build.MODEL;
        var12_16.o = var4_8 = Build.BRAND;
        var12_16.m = var4_8 = Constants$SDKVersion.Companion.getLIBRARY_VERSION();
        if (var1_1 /* !! */  == null) ** GOTO lbl-1000
        Utility.INSTANCE.getClass();
        var4_8 = var1_1 /* !! */ .getPackageManager();
        var5_9 /* !! */  = var1_1 /* !! */ .getPackageName();
        var4_8 = var4_8.getPackageInfo((String)var5_9 /* !! */ , 0);
        if (var4_8 != null) {
            var4_8 = var4_8.versionName;
        } else lbl-1000:
        // 2 sources

        {
            var13_17 = false;
            var4_8 = null;
        }
        var12_16.n = var4_8;
        var4_8 = p.t;
        if (var4_8 != null) {
            var4_8 = var4_8.d;
        } else {
            var13_17 = false;
            var4_8 = null;
        }
        var13_17 = TextUtils.isEmpty((CharSequence)var4_8);
        if (!var13_17) {
            var4_8 = p.t;
            if (var4_8 != null) {
                var3_7 = var4_8.d;
            }
            var12_16.p = var3_7;
        }
        var3_7 = "<PACKAGE_NAME>";
        var4_8 = "https://mercury.akamaized.net/an/<PACKAGE_NAME>/err.gif";
        var5_9 /* !! */  = "internet is not available or context is null";
        var14_18 = '?';
        var9_13 = "UTF-8";
        var10_14 = "Inside syncError().packageName: ";
        var15_19 = "message";
        if (var6_10 != null) {
            var11_15 = var6_10.d;
            if (!var11_15 && (var16_20 = var6_10.a) == 0 && (var16_20 = var6_10.b) == 0 && (var16_20 = var6_10.c) == 0) {
                Intrinsics.checkNotNullParameter("CDN Error logging is disabled", var15_19);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var1_1 /* !! */  = JioAds$LogLevel.NONE;
            } else {
                var17_21 = var12_16.h;
                var18_22 = com.jio.jioads.cdnlogging.d.a;
                if (var17_21 == var18_22 && !var11_15 && !(var19_23 = var6_10.a)) {
                    Intrinsics.checkNotNullParameter("CDN Error logging is disabled for high severity errors", var15_19);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 /* !! */  = JioAds$LogLevel.NONE;
                } else {
                    var18_22 = com.jio.jioads.cdnlogging.d.b;
                    if (var17_21 == var18_22 && !var11_15 && !(var19_23 = var6_10.b)) {
                        Intrinsics.checkNotNullParameter("CDN Error logging is disabled for Mid severity errors", var15_19);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var1_1 /* !! */  = JioAds$LogLevel.NONE;
                    } else {
                        var18_22 = com.jio.jioads.cdnlogging.d.c;
                        if (var17_21 == var18_22 && !var11_15 && !(var20_24 = var6_10.c)) {
                            Intrinsics.checkNotNullParameter("CDN Error logging is disabled for low severity errors", var15_19);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var1_1 /* !! */  = JioAds$LogLevel.NONE;
                        } else if (var1_1 /* !! */  != null && (var11_15 = (var6_10 = Utility.INSTANCE).isInternetAvailable(var1_1 /* !! */ ))) {
                            var5_9 /* !! */  = JioAds.Companion;
                            var21_25 = var5_9 /* !! */ .getInstance().getAppPackage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            l_0.h(var10_14, var21_25);
                            var5_9 /* !! */ .getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var5_9 /* !! */  = JioAds$LogLevel.NONE;
                            var22_27 = var6_10.isFireTvJCApp(var1_1 /* !! */ );
                            if (var22_27) {
                                var2_6 = "https://mercury.akamaized.net/an/com.jio.media.stb.ondemand.firetv/err.gif";
                            } else {
                                var22_27 = var6_10.isDeviceJioSTB();
                                var10_14 = "com.jio.media.stb.ondemand";
                                var16_20 = 4;
                                var2_6 = var22_27 != false && (var22_27 = var6_10.isPackage(var1_1 /* !! */ , var10_14, (Integer)(var5_9 /* !! */  = Integer.valueOf(var16_20)))) != false ? "https://mercury.akamaized.net/an/com.jio.media.stb.ondemand/err.gif" : ((var22_27 = var6_10.isPackage(var1_1 /* !! */ , var10_14, (Integer)(var5_9 /* !! */  = Integer.valueOf(var16_20)))) != false ? "https://mercury.akamaized.net/an/com.jio.media.stb.ondemand.atv/err.gif" : kotlin.text.b.n((String)var4_8, (String)var3_7, var21_25, false));
                            }
                            var3_7 = var6_10.getErrorMap(var12_16);
                            var3_7 = var6_10.encodeAdRequestParameters((Map)var3_7, var9_13);
                            var4_8 = new StringBuilder();
                            var4_8.append((String)var2_6);
                            var4_8.append(var14_18);
                            var4_8.append((String)var3_7);
                            var2_6 = var4_8.toString();
                            try {
                                com.jio.jioads.cdnlogging.c.a(var1_1 /* !! */ , (String)var2_6, var8_12);
                            }
                            catch (IOException var1_2) {
                                var2_6 = Utility.INSTANCE;
                                Intrinsics.checkNotNullParameter(var2_6.printStacktrace(var1_2), var15_19);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var1_3 = JioAds$LogLevel.NONE;
                            }
                        } else {
                            Intrinsics.checkNotNullParameter(var5_9 /* !! */ , var15_19);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var1_1 /* !! */  = JioAds$LogLevel.NONE;
                        }
                    }
                }
            }
        } else if (var11_15) {
            if (var1_1 /* !! */  != null && (var11_15 = (var6_10 = Utility.INSTANCE).isInternetAvailable(var1_1 /* !! */ ))) {
                var5_9 /* !! */  = JioAds.Companion;
                var21_26 = var5_9 /* !! */ .getInstance().getAppPackage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                l_0.h(var10_14, var21_26);
                var5_9 /* !! */ .getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var5_9 /* !! */  = JioAds$LogLevel.NONE;
                var2_6 = kotlin.text.b.n((String)var4_8, (String)var3_7, var21_26, false);
                var3_7 = var6_10.getErrorMap(var12_16);
                var3_7 = var6_10.encodeAdRequestParameters((Map)var3_7, var9_13);
                var4_8 = new StringBuilder();
                var4_8.append((String)var2_6);
                var4_8.append(var14_18);
                var4_8.append((String)var3_7);
                var2_6 = var4_8.toString();
                try {
                    com.jio.jioads.cdnlogging.c.a(var1_1 /* !! */ , (String)var2_6, var8_12);
                }
                catch (IOException var1_4) {
                    var2_6 = Utility.INSTANCE;
                    Intrinsics.checkNotNullParameter(var2_6.printStacktrace(var1_4), var15_19);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_5 = JioAds$LogLevel.NONE;
                }
            } else {
                Intrinsics.checkNotNullParameter(var5_9 /* !! */ , var15_19);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var1_1 /* !! */  = JioAds$LogLevel.NONE;
            }
        }
    }

    public final Map parseQueryString(String object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "queryString");
        LinkedHashMap<String[], Object> linkedHashMap = new LinkedHashMap<String[], Object>();
        Object object2 = new String[]{"&"};
        int n3 = 6;
        object = StringsKt.a0((CharSequence)object, (String[])object2, false, 0, n3).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (String)object.next();
            Object object3 = new String[]{"="};
            object2 = StringsKt.a0((CharSequence)object2, object3, false, 0, n3);
            object3 = (String)object2.get(0);
            int n4 = 1;
            object2 = (String)object2.get(n4);
            linkedHashMap.put((String[])object3, object2);
        }
        return linkedHashMap;
    }

    public final String printStacktrace(Exception object) {
        Intrinsics.checkNotNullParameter(object, "e");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        ((Throwable)object).printStackTrace(printWriter);
        object = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public final String readJsonFile(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        Object object2 = "response.json";
        object = object.getAssets();
        object = object.open((String)object2);
        object2 = "open(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        int n3 = ((InputStream)object).available();
        object2 = new byte[n3];
        ((InputStream)object).read((byte[])object2);
        ((InputStream)object).close();
        Charset charset = Charsets.UTF_8;
        try {
            object = new String((byte[])object2, charset);
        }
        catch (Exception exception) {
            object = "";
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2, String string3, String charSequence, boolean bl2) {
        Exception exception2;
        block5: {
            Object object;
            CharSequence charSequence2;
            CharSequence charSequence3;
            String string4;
            String string5;
            block4: {
                string5 = "%5D";
                string4 = "%5B";
                charSequence3 = "\\[";
                charSequence2 = "key";
                Intrinsics.checkNotNullParameter(string3, (String)charSequence2);
                try {
                    boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                    if (bl3) return String.valueOf(string2);
                    bl3 = TextUtils.isEmpty((CharSequence)charSequence);
                    if (bl3) return String.valueOf(string2);
                    if (!bl2 || (bl2 = TextUtils.isEmpty((CharSequence)charSequence))) break block4;
                    object = DEFAULT_PARAMS_ENCODING;
                    charSequence = URLEncoder.encode(charSequence, (String)object);
                }
                catch (Exception exception2) {
                    break block5;
                }
            }
            if (string2 != null) {
                charSequence2 = new StringBuilder((String)charSequence3);
                ((StringBuilder)charSequence2).append(string3);
                charSequence3 = "?\\]";
                ((StringBuilder)charSequence2).append((String)charSequence3);
                charSequence3 = ((StringBuilder)charSequence2).toString();
                object = new Regex((String)charSequence3);
                Intrinsics.checkNotNull(charSequence);
                string2 = ((Regex)object).replace(string2, (String)charSequence);
            } else {
                string2 = null;
            }
            if (string2 == null) return String.valueOf(string2);
            object = new StringBuilder(string4);
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append(string5);
            object = ((StringBuilder)object).toString();
            boolean bl4 = false;
            charSequence3 = null;
            bl2 = StringsKt.F(string2, (CharSequence)object, false);
            bl4 = true;
            if (bl2 != bl4) return String.valueOf(string2);
            charSequence3 = new StringBuilder(string4);
            ((StringBuilder)charSequence3).append(string3);
            ((StringBuilder)charSequence3).append(string5);
            string3 = ((StringBuilder)charSequence3).toString();
            object = new Regex(string3);
            string3 = String.valueOf(charSequence);
            string2 = ((Regex)object).replace(string2, string3);
            return String.valueOf(string2);
        }
        String string6 = "Error while replacing string-->";
        charSequence = new StringBuilder(string6);
        com.jio.jioads.jioreel.tracker.model.b.c(this, exception2, (StringBuilder)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return String.valueOf(string2);
    }

    /*
     * Exception decompiling
     */
    public final String replaceMacros(k var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 305->308)] java.lang.Exception
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String replaceMacros$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(b var1_1, String var2_2, String var3_3, String var4_4, String var5_5, Integer var6_6, boolean var7_7, boolean var8_8, String var9_9, boolean var10_10, String var11_11, boolean var12_12, String var13_13, String var14_14, String var15_15, String var16_16, String var17_17, String var18_18) {
        block201: {
            block222: {
                block219: {
                    block207: {
                        block206: {
                            block204: {
                                block205: {
                                    block203: {
                                        block224: {
                                            block202: {
                                                block200: {
                                                    var19_19 = this;
                                                    var20_20 = var2_2;
                                                    var21_21 = var3_3;
                                                    var22_22 /* !! */  = var4_4;
                                                    var23_23 /* !! */  = var5_5;
                                                    var24_24 = var6_6;
                                                    var25_25 = var9_9;
                                                    var26_26 = var11_11;
                                                    var27_27 /* !! */  = var13_13;
                                                    var28_28 /* !! */  = var14_14;
                                                    var29_29 = var15_15;
                                                    var30_30 /* !! */  = var16_16;
                                                    var31_31 = 3;
                                                    var32_32 = "icid";
                                                    var33_33 = 2;
                                                    var34_34 = "[crr]";
                                                    var35_35 = "mol_impression_id";
                                                    var36_36 = "LATLONG";
                                                    var37_37 = "context";
                                                    var38_38 = "300x250";
                                                    var39_39 = "seq";
                                                    var40_40 /* !! */  = "cid";
                                                    var41_41 = "asi";
                                                    var42_42 = "PLAYERSIZE";
                                                    var43_43 = "ADTYPE";
                                                    var44_44 = "LIMITADTRACKING";
                                                    var45_45 = "lt";
                                                    var46_46 = "ap";
                                                    var47_47 = "lc";
                                                    var48_48 = "sh";
                                                    var49_49 = "br";
                                                    var50_50 = "osv";
                                                    var51_51 = "mn";
                                                    var52_52 = "DEVICEUA";
                                                    var53_53 = "ua";
                                                    var54_54 = "vr";
                                                    var55_55 = "st";
                                                    var56_56 = "av";
                                                    var22_22 /* !! */  = "cn";
                                                    var57_57 = "TIMESTAMP";
                                                    var26_26 = "ct";
                                                    var58_58 = "2";
                                                    var23_23 /* !! */  = "pn";
                                                    var59_59 = "id";
                                                    var60_60 = "la";
                                                    var61_61 = "APPBUNDLE";
                                                    var62_62 = "ai";
                                                    var63_63 /* !! */  = "trq";
                                                    var64_64 = "BREAKPOSITION";
                                                    var65_65 = "optJSONObject(...)";
                                                    var66_66 = "bz";
                                                    var67_67 = "ifa";
                                                    var68_68 = var1_1;
                                                    Intrinsics.checkNotNullParameter(var1_1, "iJioAdView");
                                                    Intrinsics.checkNotNullParameter(var13_13, "impressionId");
                                                    var24_24 = "creativeId";
                                                    Intrinsics.checkNotNullParameter(var14_14, (String)var24_24);
                                                    var68_68 = "appId";
                                                    Intrinsics.checkNotNullParameter(var15_15, (String)var68_68);
                                                    var69_69 = var68_68;
                                                    Intrinsics.checkNotNullParameter(var16_16, "cbString");
                                                    var68_68 = var1_1.k0();
                                                    var30_30 /* !! */  = JioAdView$AdState.DESTROYED;
                                                    var70_70 = false;
                                                    var29_29 = null;
                                                    if (var68_68 == var30_30 /* !! */ ) {
                                                        return null;
                                                    }
                                                    var30_30 /* !! */  = var1_1.Y();
                                                    var68_68 = var30_30 /* !! */  != null ? Utility.INSTANCE.getAdvidFromPreferences((Context)var30_30 /* !! */ ) : null;
                                                    if (var30_30 /* !! */  != null) {
                                                        var29_29 = Utility.INSTANCE.getUidFromPreferences((Context)var30_30 /* !! */ );
                                                    } else {
                                                        var70_70 = false;
                                                        var29_29 = null;
                                                    }
                                                    var28_28 /* !! */  = var1_1.P();
                                                    var71_71 = var24_24;
                                                    var24_24 = var1_1.R();
                                                    var72_72 = var24_24 != null ? (var24_24 = var24_24.getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)var30_30 /* !! */ )) : null;
                                                    var24_24 = var1_1.K();
                                                    var27_27 /* !! */  = var1_1.q0();
                                                    var73_73 = var29_29;
                                                    var29_29 = var1_1.L();
                                                    var74_74 /* !! */  = var29_29;
                                                    var70_70 = var1_1.W();
                                                    if (var20_20 == null) return var20_20;
                                                    var75_75 = var70_70;
                                                    try {
                                                        var29_29 = JioAdView$AD_TYPE.INTERSTITIAL;
                                                        var76_76 = var68_68;
                                                        var68_68 = "";
                                                        if (var24_24 == var29_29) break block200;
                                                    }
                                                    catch (Exception var85_85) {
                                                        var21_21 = var85_85;
                                                        break block201;
                                                    }
                                                    {
                                                        var29_29 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                                                        if (var24_24 == var29_29 || var12_12) break block200;
                                                    }
                                                    {
                                                        var77_77 = var24_24;
                                                        var24_24 = "\\s";
                                                        var29_29 = new Regex((String)var24_24);
                                                        var20_20 = var29_29.replace(var20_20, (String)var68_68);
                                                        var78_78 = var20_20.length() - 1;
                                                        var70_70 = false;
                                                        var29_29 = null;
                                                        var79_79 = false;
                                                        var80_80 /* !! */  = null;
                                                    }
                                                    block31: while (var70_70 <= var78_78) {
                                                        var81_81 = var28_28 /* !! */ ;
                                                        var82_82 = var79_79 == false ? var70_70 : var78_78;
                                                        var82_82 = (boolean)var20_20.charAt((int)var82_82);
                                                        var83_83 = var27_27 /* !! */ ;
                                                        var84_84 = 32 != 0;
                                                        if ((var84_84 = Intrinsics.compare((int)var82_82, (int)var84_84)) <= false) {
                                                            var84_84 = true;
                                                        } else {
                                                            var84_84 = false;
                                                            var27_27 /* !! */  = null;
                                                        }
                                                        if (!var79_79) {
                                                            if (!var84_84) {
                                                                var28_28 /* !! */  = var81_81;
                                                                var27_27 /* !! */  = var83_83;
                                                                var79_79 = true;
                                                                continue;
                                                            }
                                                            var84_84 = true;
                                                            var70_70 += var84_84;
lbl126:
                                                            // 2 sources

                                                            while (true) {
                                                                var28_28 /* !! */  = var81_81;
                                                                var27_27 /* !! */  = var83_83;
                                                                continue block31;
                                                                break;
                                                            }
                                                        }
                                                        if (!var84_84) lbl-1000:
                                                        // 2 sources

                                                        {
                                                            while (true) {
                                                                var84_84 = true;
                                                                var24_24 = var20_20.subSequence((int)var70_70, (int)(var78_78 += var84_84));
                                                                var20_20 = var24_24.toString();
                                                                break block202;
                                                                break;
                                                            }
                                                        }
                                                        var78_78 += -1;
                                                        ** continue;
                                                    }
                                                    var83_83 = var27_27 /* !! */ ;
                                                    var81_81 = var28_28 /* !! */ ;
                                                    ** while (true)
                                                }
                                                var77_77 = var24_24;
                                                var83_83 = var27_27 /* !! */ ;
                                                var81_81 = var28_28 /* !! */ ;
                                            }
                                            if (var30_30 /* !! */  != null) {
                                                var24_24 = "multiad_pref";
                                                var24_24 = j_0.o((Context)var30_30 /* !! */ , (String)var24_24);
                                                var27_27 /* !! */  = "loc";
                                                var24_24 = var24_24.getString((String)var27_27 /* !! */ , (String)var68_68);
                                            } else {
                                                var78_78 = false;
                                                var24_24 = null;
                                            }
                                            var84_84 = TextUtils.isEmpty((CharSequence)var24_24);
                                            if (!var84_84) {
                                                Intrinsics.checkNotNull(var24_24);
                                                var27_27 /* !! */  = new JSONObject((String)var24_24);
                                                var24_24 = var27_27 /* !! */ .getString(var23_23 /* !! */ );
                                                var28_28 /* !! */  = var27_27 /* !! */ .getString(var26_26);
                                                var29_29 = var27_27 /* !! */ .getString(var22_22 /* !! */ );
                                                var27_27 /* !! */  = var27_27 /* !! */ .getString((String)var55_55);
                                                var79_79 = TextUtils.isEmpty((CharSequence)var24_24);
                                                if (!var79_79 && (var79_79 = StringsKt.H(var20_20, var23_23 /* !! */ ))) {
                                                    var80_80 /* !! */  = var30_30 /* !! */ ;
                                                    var86_86 = true;
                                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var23_23 /* !! */ , (String)var24_24, (boolean)var86_86);
                                                } else {
                                                    var80_80 /* !! */  = var30_30 /* !! */ ;
                                                }
                                                var87_87 = TextUtils.isEmpty((CharSequence)var28_28 /* !! */ );
                                                if (!var87_87 && (var87_87 = StringsKt.H(var20_20, var26_26))) {
                                                    var87_87 = true;
                                                    var88_88 = 1.4E-45f;
                                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var26_26, (String)var28_28 /* !! */ , var87_87);
                                                }
                                                if (!(var87_87 = TextUtils.isEmpty((CharSequence)var29_29)) && (var87_87 = StringsKt.H(var20_20, var22_22 /* !! */ ))) {
                                                    var87_87 = true;
                                                    var88_88 = 1.4E-45f;
                                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var22_22 /* !! */ , (String)var29_29, var87_87);
                                                }
                                                if (!(var89_89 = TextUtils.isEmpty((CharSequence)var27_27 /* !! */ )) && (var89_89 = StringsKt.H(var20_20, (CharSequence)var55_55))) {
                                                    var89_89 = true;
                                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var55_55, (String)var27_27 /* !! */ , var89_89);
                                                }
                                            } else {
                                                var80_80 /* !! */  = var30_30 /* !! */ ;
                                            }
                                            var89_89 = TextUtils.isEmpty((CharSequence)var3_3);
                                            var23_23 /* !! */  = "ccb";
                                            if (!var89_89 && (var89_89 = StringsKt.H(var20_20, var23_23 /* !! */ ))) {
                                                var89_89 = true;
                                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var23_23 /* !! */ , (String)var21_21, var89_89);
                                            } else {
                                                var89_89 = true;
                                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var23_23 /* !! */ , (String)var68_68, var89_89);
                                            }
                                            var78_78 = TextUtils.isEmpty((CharSequence)var3_3);
                                            var26_26 = "CACHEBUSTING";
                                            var20_20 = var78_78 == false && (var78_78 = (boolean)StringsKt.H(var20_20, var26_26)) != false ? var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var26_26, (String)var21_21, var89_89) : var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var26_26, (String)var68_68, var89_89);
                                            if (var25_25 != null && !(var89_89 = TextUtils.isEmpty((CharSequence)var9_9))) {
                                                var89_89 = TextUtils.isEmpty((CharSequence)var3_3);
                                                if (!var89_89 && (var89_89 = StringsKt.H((CharSequence)var25_25, var23_23 /* !! */ ))) {
                                                    var89_89 = true;
                                                    var21_21 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var25_25, var23_23 /* !! */ , (String)var21_21, var89_89);
                                                } else {
                                                    var89_89 = true;
                                                    var21_21 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var25_25, var23_23 /* !! */ , (String)var68_68, var89_89);
                                                }
                                                var87_87 = StringsKt.H(var20_20, var40_40 /* !! */ );
                                                if (var87_87) {
                                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var40_40 /* !! */ , (String)var21_21, var89_89);
                                                }
                                            }
                                            var21_21 = var67_67;
                                            var89_89 = StringsKt.H(var20_20, var67_67);
                                            var23_23 /* !! */  = "0";
                                            var24_24 = "common_prefs";
                                            var25_25 = "1";
                                            if (!var89_89) break block224;
                                            if (var80_80 /* !! */  != null) {
                                                var22_22 /* !! */  = "GlobalId";
                                                var26_26 = var80_80 /* !! */ ;
                                                var84_84 = false;
                                                var27_27 /* !! */  = null;
                                                var22_22 /* !! */  = j_0.d((Context)var80_80 /* !! */ , (String)var24_24, 0, var68_68, var22_22 /* !! */ );
                                                var27_27 /* !! */  = "null cannot be cast to non-null type kotlin.String";
                                                Intrinsics.checkNotNull(var22_22 /* !! */ , (String)var27_27 /* !! */ );
                                            } else {
                                                var26_26 = var80_80 /* !! */ ;
                                                var22_22 /* !! */  = var68_68;
                                            }
                                            var27_27 /* !! */  = new JSONObject();
                                            var82_82 = TextUtils.isEmpty((CharSequence)var22_22 /* !! */ );
                                            if (!var82_82) {
                                                var27_27 /* !! */  = new JSONObject(var22_22 /* !! */ );
                                            }
                                            var22_22 /* !! */  = new JSONObject();
                                            var82_82 = TextUtils.isEmpty((CharSequence)var83_83);
                                            if (!var82_82) {
                                                var28_28 /* !! */  = var83_83;
                                                var70_70 = var27_27 /* !! */ .has(var83_83);
                                                if (var70_70) {
                                                    var22_22 /* !! */  = var27_27 /* !! */ .optJSONObject(var83_83);
                                                    var29_29 = var65_65;
                                                    Intrinsics.checkNotNullExpressionValue(var22_22 /* !! */ , var65_65);
                                                }
                                            } else {
                                                var29_29 = var65_65;
                                                var28_28 /* !! */  = var83_83;
                                                if (var26_26 != null) {
                                                    var30_30 /* !! */  = var26_26.getPackageName();
                                                } else {
                                                    var86_86 = false;
                                                    var30_30 /* !! */  = null;
                                                }
                                                var86_86 = TextUtils.isEmpty((CharSequence)var30_30 /* !! */ );
                                                if (var86_86 == false) {
                                                    if (var26_26 != null) {
                                                        var30_30 /* !! */  = var26_26.getPackageName();
                                                    } else {
                                                        var86_86 = false;
                                                        var30_30 /* !! */  = null;
                                                    }
                                                    var86_86 = var27_27 /* !! */ .has(var30_30 /* !! */ );
                                                    if (var86_86 != false) {
                                                        if (var26_26 != null) {
                                                            var22_22 /* !! */  = var26_26.getPackageName();
                                                        } else {
                                                            var89_89 = false;
                                                            var22_22 /* !! */  = null;
                                                        }
                                                        var22_22 /* !! */  = var27_27 /* !! */ .optJSONObject(var22_22 /* !! */ );
                                                        Intrinsics.checkNotNullExpressionValue(var22_22 /* !! */ , (String)var29_29);
                                                    }
                                                }
                                            }
                                            var27_27 /* !! */  = "adspots";
                                            var27_27 /* !! */  = var22_22 /* !! */ .optJSONObject((String)var27_27 /* !! */ );
                                            var29_29 = "mtype";
                                            if ((var29_29 = var22_22 /* !! */ .optJSONObject((String)var29_29)) != null) {
                                                var30_30 /* !! */  = var81_81;
                                                var29_29 = var29_29.optString(var81_81);
                                            } else {
                                                var30_30 /* !! */  = var81_81;
                                                var70_70 = false;
                                                var29_29 = null;
                                            }
                                            if (var27_27 /* !! */  != null && (var90_90 = var27_27 /* !! */ .has(var30_30 /* !! */ )) != '\u0000') {
                                                var27_27 /* !! */  = var27_27 /* !! */ .get(var30_30 /* !! */ );
                                                var27_27 /* !! */  = var27_27 /* !! */ .toString();
                                                var22_22 /* !! */  = new JSONObject((String)var27_27 /* !! */ );
                                                var55_55 = var59_59;
                                                var84_84 = false;
                                                var27_27 /* !! */  = null;
                                                var22_22 /* !! */  = var22_22 /* !! */ .optString(var59_59, null);
                                            } else {
                                                var55_55 = var59_59;
                                                var84_84 = false;
                                                var27_27 /* !! */  = null;
                                                var22_22 /* !! */  = var22_22 /* !! */ .optString(var59_59, null);
                                            }
                                            var84_84 = TextUtils.isEmpty((CharSequence)var29_29);
                                            if (!var84_84) {
                                                var84_84 = kotlin.text.b.j((String)var29_29, var23_23 /* !! */ );
                                                if (var84_84) {
                                                    var84_84 = true;
                                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var68_68, var84_84);
lbl288:
                                                    // 2 sources

                                                    while (true) {
                                                        var22_22 /* !! */  = var58_58;
                                                        break block203;
                                                        break;
                                                    }
                                                }
                                                var84_84 = true;
                                                var90_90 = kotlin.text.b.j((String)var29_29, (String)var25_25);
                                                if (var90_90 != '\u0000') {
                                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, var22_22 /* !! */ , var84_84);
                                                    ** continue;
                                                }
                                                var22_22 /* !! */  = var58_58;
                                                var70_70 = kotlin.text.b.j((String)var29_29, var58_58);
                                                if (var70_70) {
                                                    var29_29 = var76_76;
                                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var76_76, var84_84);
                                                }
                                                break block203;
                                            } else {
                                                var22_22 /* !! */  = var58_58;
                                                var29_29 = var76_76;
                                                if (var76_76 != null && !(var84_84 = TextUtils.isEmpty((CharSequence)var76_76))) {
                                                    var84_84 = true;
                                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var76_76, var84_84);
                                                    break block203;
                                                } else {
                                                    var84_84 = true;
                                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var68_68, var84_84);
                                                }
                                            }
                                            break block203;
                                        }
                                        var22_22 /* !! */  = var58_58;
                                        var26_26 = var80_80 /* !! */ ;
                                        var30_30 /* !! */  = var81_81;
                                        var28_28 /* !! */  = var83_83;
                                    }
                                    var21_21 = "uid";
                                    if (var73_73 != null && !(var84_84 = (boolean)TextUtils.isEmpty((CharSequence)var73_73)) && (var84_84 = StringsKt.H(var20_20, (CharSequence)var21_21))) {
                                        var29_29 = var73_73;
                                        var84_84 = true;
                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, var73_73, var84_84);
                                        var21_21 = var63_63 /* !! */ ;
                                        var84_84 = true;
                                    } else {
                                        var84_84 = true;
                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var68_68, var84_84);
                                        var21_21 = var63_63 /* !! */ ;
                                    }
                                    var70_70 = StringsKt.H(var20_20, (CharSequence)var21_21);
                                    if (var70_70) {
                                        var91_91 = System.currentTimeMillis();
                                        var29_29 = String.valueOf(var91_91);
                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var29_29, var84_84);
                                    }
                                    var27_27 /* !! */  = var57_57;
                                    var70_70 = StringsKt.H(var20_20, var57_57);
                                    if (var70_70) {
                                        var55_55 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
                                        var29_29 = new SimpleDateFormat((String)var55_55);
                                        var55_55 = new Date();
                                        var29_29 = var29_29.format((Date)var55_55);
                                        var90_90 = '\u0001';
                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var57_57, (String)var29_29, (boolean)var90_90);
                                    }
                                    var27_27 /* !! */  = var62_62;
                                    var70_70 = StringsKt.H(var20_20, var62_62);
                                    if (var70_70) {
                                        if (var28_28 /* !! */  != null) {
                                            var70_70 = true;
                                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var62_62, (String)var28_28 /* !! */ , var70_70);
                                        } else {
                                            if (var26_26 != null) {
                                                var29_29 = var26_26.getPackageName();
                                            } else {
                                                var70_70 = false;
                                                var29_29 = null;
                                            }
                                            if (var29_29 != null && (var90_90 = TextUtils.isEmpty((CharSequence)var29_29)) == '\u0000') {
                                                var90_90 = '\u0001';
                                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , (String)var29_29, (boolean)var90_90);
                                            } else {
                                                var90_90 = '\u0001';
                                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , (String)var68_68, (boolean)var90_90);
                                            }
lbl360:
                                            // 3 sources

                                            while (true) {
                                                var27_27 /* !! */  = var61_61;
                                                var70_70 = StringsKt.H(var20_20, var61_61);
                                                if (!var70_70) break block204;
                                                break block205;
                                                break;
                                            }
                                        }
                                    }
                                    var90_90 = '\u0001';
                                    ** while (true)
                                }
                                if (var28_28 /* !! */  != null) {
                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var61_61, (String)var28_28 /* !! */ , (boolean)var90_90);
                                } else {
                                    if (var26_26 != null) {
                                        var28_28 /* !! */  = var26_26.getPackageName();
                                    } else {
                                        var82_82 = false;
                                        var28_28 /* !! */  = null;
                                    }
                                    if (var28_28 /* !! */  != null && !(var70_70 = TextUtils.isEmpty((CharSequence)var28_28 /* !! */ ))) {
                                        var70_70 = true;
                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , (String)var28_28 /* !! */ , var70_70);
                                    } else {
                                        var70_70 = true;
                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , (String)var68_68, var70_70);
                                    }
                                }
                            }
                            var27_27 /* !! */  = var56_56;
                            var82_82 = StringsKt.H(var20_20, var56_56);
                            if (!var82_82) ** GOTO lbl412
                            if (var26_26 != null) {
                                try {
                                    var28_28 /* !! */  = var26_26.getPackageManager();
                                    if (var28_28 /* !! */  == null) break block206;
                                    var29_29 = var26_26.getPackageName();
                                    var90_90 = '\u0000';
                                    var55_55 = null;
                                    var28_28 /* !! */  = var28_28 /* !! */ .getPackageInfo((String)var29_29, 0);
                                    break block207;
                                }
                                catch (Exception v0) {}
                            }
                        }
                        var82_82 = false;
                        var28_28 /* !! */  = null;
                    }
                    if (var28_28 /* !! */  == null) ** GOTO lbl403
                    {
                        block225: {
                            var28_28 /* !! */  = var28_28 /* !! */ .versionName;
                            break block225;
lbl403:
                            // 1 sources

                            var82_82 = false;
                            var28_28 /* !! */  = null;
                        }
                        if (var28_28 /* !! */  != null && !(var70_70 = TextUtils.isEmpty((CharSequence)var28_28 /* !! */ ))) {
                            var70_70 = true;
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , (String)var28_28 /* !! */ , var70_70);
                        } else {
                            var70_70 = true;
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , (String)var68_68, var70_70);
                        }
lbl412:
                        // 3 sources

                        var27_27 /* !! */  = var54_54;
                        var82_82 = StringsKt.H(var20_20, var54_54);
                        if (var82_82) {
                            var28_28 /* !! */  = Constants$SDKVersion.Companion;
                            var28_28 /* !! */  = var28_28 /* !! */ .getLIBRARY_VERSION();
                            var70_70 = true;
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var54_54, (String)var28_28 /* !! */ , var70_70);
                        }
                        var27_27 /* !! */  = var41_41;
                        var82_82 = StringsKt.H(var20_20, var41_41);
                        if (var82_82) {
                            var82_82 = true;
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var41_41, var30_30 /* !! */ , var82_82);
                        }
                        var27_27 /* !! */  = var39_39;
                        var82_82 = StringsKt.H(var20_20, var39_39);
                        if (var82_82) {
                            var28_28 /* !! */  = var6_6;
                            if (var6_6 != null) {
                                var29_29 = new StringBuilder();
                                var29_29.append((String)var68_68);
                                var29_29.append(var6_6);
                                var28_28 /* !! */  = var29_29.toString();
                                var70_70 = true;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var39_39, (String)var28_28 /* !! */ , var70_70);
                            }
                        }
                        var27_27 /* !! */  = var66_66;
                        var82_82 = StringsKt.H(var20_20, var66_66);
                        var29_29 = "audio";
                        var30_30 /* !! */  = "video";
                        if (!var82_82) ** GOTO lbl574
                        var28_28 /* !! */  = JioAdView$AD_TYPE.INFEED;
                        var55_55 = var77_77;
                        if (var77_77 != var28_28 /* !! */ ) ** GOTO lbl461
                    }
                    {
                        block226: {
                            if (var26_26 == null || !(var82_82 = var19_19.isDeviceTypeTablet((Context)var26_26)) && (var82_82 = var19_19.getCurrentUIModeType((Context)var26_26)) != (var93_92 = 4 != 0)) break block226;
                            var28_28 /* !! */  = "728x90";
                            var93_92 = true;
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , (String)var28_28 /* !! */ , var93_92);
lbl449:
                            // 4 sources

                            while (true) {
                                var40_40 /* !! */  = var22_22 /* !! */ ;
lbl451:
                                // 7 sources

                                while (true) {
                                    var2_2 = var23_23 /* !! */ ;
lbl453:
                                    // 2 sources

                                    while (true) {
                                        var3_3 = var30_30 /* !! */ ;
                                        ** GOTO lbl565
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        var28_28 /* !! */  = "320x50";
                        var93_92 = true;
                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , (String)var28_28 /* !! */ , var93_92);
                        ** GOTO lbl449
lbl461:
                        // 1 sources

                        var93_92 = true;
                        var28_28 /* !! */  = JioAdView$AD_TYPE.CONTENT_STREAM;
                        if (var77_77 != var28_28 /* !! */ ) ** GOTO lbl467
                        var28_28 /* !! */  = var38_38;
                    }
                    {
                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var66_66, var38_38, var93_92);
                        ** GOTO lbl449
lbl467:
                        // 1 sources

                        var28_28 /* !! */  = var38_38;
                        var40_40 /* !! */  = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                        if (var77_77 != var40_40 /* !! */ ) ** GOTO lbl473
                        var93_92 = true;
                    }
                    {
                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var66_66, var30_30 /* !! */ , var93_92);
                        ** continue;
lbl473:
                        // 1 sources

                        var40_40 /* !! */  = JioAdView$AD_TYPE.CUSTOM_NATIVE;
                        if (var77_77 != var40_40 /* !! */ ) ** GOTO lbl486
                        var40_40 /* !! */  = var22_22 /* !! */ ;
                        var22_22 /* !! */  = var5_5;
                    }
                    {
                        block227: {
                            if (var5_5 != null && !(var82_82 = kotlin.text.b.k(var5_5))) break block227;
                            var82_82 = true;
                            var22_22 /* !! */  = " ";
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , var22_22 /* !! */ , var82_82);
                            ** GOTO lbl451
                        }
                        var82_82 = true;
                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var66_66, var5_5, var82_82);
                        ** GOTO lbl451
lbl486:
                        // 1 sources

                        var40_40 /* !! */  = var22_22 /* !! */ ;
                        var22_22 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL;
                        if (var77_77 != var22_22 /* !! */ ) ** GOTO lbl508
                        if (!var7_7) ** GOTO lbl493
                        var89_89 = true;
                    }
                    {
                        block229: {
                            block228: {
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var66_66, var30_30 /* !! */ , var89_89);
                                ** GOTO lbl451
lbl493:
                                // 1 sources

                                var89_89 = true;
                                if (!var8_8) break block228;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var66_66, (String)var29_29, var89_89);
                                ** GOTO lbl451
                            }
                            if (var26_26 == null || (var89_89 = (var22_22 /* !! */  = Utility.INSTANCE).getCurrentUIModeType((Context)var26_26)) != (var82_82 = 4 != 0)) break block229;
                            var22_22 /* !! */  = "1920x1080";
                            var82_82 = true;
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var66_66, var22_22 /* !! */ , var82_82);
                            ** GOTO lbl451
                        }
                        var22_22 /* !! */  = "320x480";
                        var82_82 = true;
                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , var22_22 /* !! */ , var82_82);
                        ** continue;
lbl508:
                        // 1 sources

                        var22_22 /* !! */  = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                        if (var77_77 != var22_22 /* !! */ ) ** GOTO lbl555
                        var2_2 = var23_23 /* !! */ ;
                        var89_89 = var75_75;
                        var87_87 = true;
                        var88_88 = 1.4E-45f;
                        if (var75_75 != var87_87) ** GOTO lbl517
                    }
                    {
                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var66_66, var30_30 /* !! */ , var87_87);
                        ** continue;
lbl517:
                        // 1 sources

                        var22_22 /* !! */  = (String)var1_1.Q();
                        if (var22_22 /* !! */  == null) ** GOTO lbl530
                        var89_89 = ((String)var22_22 /* !! */ ).length;
                        if (!var89_89) {
                            var89_89 = true;
                            var94_93 = true;
                        } else {
                            var89_89 = true;
                            var94_93 = false;
                        }
                        var87_87 = var94_93 ^ true;
                        if (var87_87 != var89_89) ** GOTO lbl530
                    }
                    {
                        block230: {
                            var22_22 /* !! */  = (String)var1_1.Q();
                            break block230;
lbl530:
                            // 2 sources

                            var89_89 = false;
                            var22_22 /* !! */  = null;
                        }
                        if (var22_22 /* !! */  != null) {
                            var23_23 /* !! */  = new StringBuilder();
                            var3_3 = var30_30 /* !! */ ;
                            var82_82 = false;
                            var28_28 /* !! */  = null;
                            var86_86 = var22_22 /* !! */ [0];
                            var23_23 /* !! */ .append(var86_86);
                            var82_82 = 120 != 0;
                            var23_23 /* !! */ .append((char)var82_82);
                            var82_82 = true;
                            var89_89 = (boolean)var22_22 /* !! */ [var82_82];
                            var23_23 /* !! */ .append((int)var89_89);
                            var22_22 /* !! */  = var23_23 /* !! */ .toString();
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , var22_22 /* !! */ , var82_82);
                        } else {
                            var3_3 = var30_30 /* !! */ ;
                            var89_89 = true;
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , (String)var28_28 /* !! */ , var89_89);
                        }
                        ** GOTO lbl565
lbl555:
                        // 1 sources

                        var2_2 = var23_23 /* !! */ ;
                        var3_3 = var30_30 /* !! */ ;
                        var89_89 = true;
                        var23_23 /* !! */  = JioAdView$AD_TYPE.INSTREAM_AUDIO;
                        if (var77_77 != var23_23 /* !! */ ) ** GOTO lbl562
                    }
                    {
                        block208: {
                            block209: {
                                block231: {
                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var66_66, (String)var29_29, var89_89);
                                    break block231;
lbl562:
                                    // 1 sources

                                    var23_23 /* !! */  = var11_11;
                                    if (var11_11 != null) {
                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var66_66, var11_11, var89_89);
                                    }
                                }
lbl566:
                                // 2 sources

                                while (true) {
                                    var22_22 /* !! */  = var60_60;
                                    var87_87 = StringsKt.H(var20_20, var60_60);
                                    var27_27 /* !! */  = "acc";
                                    var28_28 /* !! */  = "lo";
                                    var30_30 /* !! */  = "gts";
                                    if (var87_87) break block208;
                                    break block209;
                                    break;
                                }
lbl574:
                                // 1 sources

                                var40_40 /* !! */  = var22_22 /* !! */ ;
                                var2_2 = var23_23 /* !! */ ;
                                var3_3 = var30_30 /* !! */ ;
                                var55_55 = var77_77;
                                ** continue;
                            }
                            var87_87 = StringsKt.H(var20_20, (CharSequence)var28_28 /* !! */ );
                            if (var87_87 || (var87_87 = StringsKt.H(var20_20, (CharSequence)var27_27 /* !! */ )) || (var87_87 = StringsKt.H(var20_20, var30_30 /* !! */ ))) break block208;
                            var63_63 /* !! */  = var21_21;
                            var9_9 = var24_24;
                            var41_41 = var25_25;
                            var6_6 = var29_29;
                            var77_77 = var55_55;
                            var58_58 = var40_40 /* !! */ ;
                            var95_94 = false;
                            var21_21 = null;
lbl590:
                            // 3 sources

                            while (true) {
                                var90_90 = ',';
                                ** GOTO lbl725
                                break;
                            }
                        }
                        if (var26_26 != null) {
                            var23_23 /* !! */  = var37_37;
                            Intrinsics.checkNotNullParameter(var26_26, var37_37);
                            var6_6 = var29_29;
                            var29_29 = j_0.o((Context)var26_26, (String)var24_24);
                            var58_58 = var40_40 /* !! */ ;
                            var40_40 /* !! */  = "lat";
                            var9_9 = var24_24;
                            var96_95 = 0L;
                            var98_96 = var29_29.getLong(var40_40 /* !! */ , var96_95);
                            var100_97 = Double.longBitsToDouble(var98_96);
                            var40_40 /* !! */  = Double.valueOf(var100_97);
                            var77_77 = var55_55;
                            var55_55 = "lon";
                            var98_96 = var29_29.getLong((String)var55_55, var96_95);
                            var100_97 = Double.longBitsToDouble(var98_96);
                            var55_55 = var100_97;
                            var23_23 /* !! */  = "accu";
                            var78_78 = false;
                            var24_24 = null;
                            var88_88 = var29_29.getFloat(var23_23 /* !! */ , 0.0f);
                            var23_23 /* !! */  = Float.valueOf(var88_88);
                            var41_41 = var25_25;
                            var102_98 = 0L;
                            var102_98 = var29_29.getLong(var30_30 /* !! */ , var102_98);
                            var24_24 = var102_98;
                            var25_25 = "provider";
                            var63_63 /* !! */  = var21_21;
                            var95_94 = false;
                            var21_21 = null;
                            var25_25 = var29_29.getString((String)var25_25, null);
                            var70_70 = 5 != 0;
                            var29_29 = new Object[var70_70];
                            var38_38 = null;
                            var29_29[0] = var40_40 /* !! */ ;
                            var93_92 = true;
                            var29_29[var93_92] = var55_55;
                            var29_29[var33_33] = var23_23 /* !! */ ;
                            var29_29[var31_31] = var24_24;
                            var87_87 = 4 != 0;
                            var88_88 = 5.6E-45f;
                            var29_29[var87_87] = var25_25;
                        } else {
                            var63_63 /* !! */  = var21_21;
                            var9_9 = var24_24;
                            var41_41 = var25_25;
                            var6_6 = var29_29;
                            var77_77 = var55_55;
                            var58_58 = var40_40 /* !! */ ;
                            var95_94 = false;
                            var21_21 = null;
                            var70_70 = false;
                            var29_29 = null;
                        }
                        if ((var26_26 == null || (var87_87 = (var23_23 /* !! */  = Utility.INSTANCE).isPermissionGranted((Context)var26_26, (String)(var24_24 = "android.permission.ACCESS_FINE_LOCATION"))) != (var78_78 = true)) && (var26_26 == null || (var87_87 = (var23_23 /* !! */  = Utility.INSTANCE).isPermissionGranted((Context)var26_26, (String)(var24_24 = "android.permission.ACCESS_COARSE_LOCATION"))) != (var78_78 = true))) ** GOTO lbl730
                        if (var29_29 == null) ** GOTO lbl590
                        var87_87 = ((Object)var29_29).length;
                        if (!var87_87) {
                            var87_87 = true;
                            var88_88 = 1.4E-45f;
                        } else {
                            var87_87 = false;
                            var88_88 = 0.0f;
                            var23_23 /* !! */  = null;
                        }
                        if (var87_87 ^= var78_78) ** break;
                        ** continue;
                    }
                    {
                        block217: {
                            block218: {
                                block215: {
                                    block216: {
                                        block213: {
                                            block214: {
                                                block210: {
                                                    block211: {
                                                        var23_23 /* !! */  = new StringBuilder();
                                                        var78_78 = false;
                                                        var24_24 = null;
                                                        var25_25 = var29_29[0];
                                                        var23_23 /* !! */ .append(var25_25);
                                                        var23_23 /* !! */ .append((String)var68_68);
                                                        var23_23 /* !! */  = var23_23 /* !! */ .toString();
                                                        var24_24 = new StringBuilder();
                                                        var104_99 = true;
                                                        var55_55 = var29_29[var104_99];
                                                        var24_24.append(var55_55);
                                                        var24_24.append((String)var68_68);
                                                        var24_24 = var24_24.toString();
                                                        var25_25 = new StringBuilder();
                                                        var55_55 = var29_29[var33_33];
                                                        var25_25.append(var55_55);
                                                        var25_25.append((String)var68_68);
                                                        var25_25 = var25_25.toString();
                                                        var55_55 = new StringBuilder();
                                                        var29_29 = var29_29[var31_31];
                                                        var55_55.append(var29_29);
                                                        var55_55.append((String)var68_68);
                                                        var29_29 = var55_55.toString();
                                                        var90_90 = (char)TextUtils.isEmpty((CharSequence)var23_23 /* !! */ );
                                                        var40_40 /* !! */  = "null";
                                                        if (var90_90 == '\u0000' && (var90_90 = (char)Intrinsics.areEqual(var23_23 /* !! */ , var40_40 /* !! */ )) == '\u0000') {
                                                            var90_90 = '\u0001';
                                                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var22_22 /* !! */ , var23_23 /* !! */ , (boolean)var90_90);
                                                        } else {
                                                            var90_90 = '\u0001';
                                                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var22_22 /* !! */ , (String)var68_68, (boolean)var90_90);
                                                        }
                                                        var89_89 = TextUtils.isEmpty((CharSequence)var24_24);
                                                        var20_20 = var89_89 == false && (var89_89 = Intrinsics.areEqual(var24_24, var40_40 /* !! */ )) == false ? var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var28_28 /* !! */ , (String)var24_24, (boolean)var90_90) : var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var28_28 /* !! */ , (String)var68_68, (boolean)var90_90);
                                                        var22_22 /* !! */  = var36_36;
                                                        var82_82 = StringsKt.H(var20_20, var36_36);
                                                        if (!(!var82_82 || (var82_82 = TextUtils.isEmpty((CharSequence)var23_23 /* !! */ )) || (var82_82 = Intrinsics.areEqual(var23_23 /* !! */ , var40_40 /* !! */ )) || (var82_82 = TextUtils.isEmpty((CharSequence)var24_24)) || (var82_82 = Intrinsics.areEqual(var24_24, var40_40 /* !! */ )))) {
                                                            var28_28 /* !! */  = new StringBuilder();
                                                            var28_28 /* !! */ .append(var23_23 /* !! */ );
                                                            var90_90 = ',';
                                                            var28_28 /* !! */ .append(var90_90);
                                                            var28_28 /* !! */ .append((String)var24_24);
                                                            var24_24 = var28_28 /* !! */ .toString();
                                                            var82_82 = true;
                                                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var36_36, (String)var24_24, var82_82);
                                                        } else {
                                                            var90_90 = ',';
                                                        }
                                                        var89_89 = TextUtils.isEmpty((CharSequence)var25_25);
                                                        if (!var89_89 && !(var89_89 = Intrinsics.areEqual(var25_25, var40_40 /* !! */ ))) {
                                                            var89_89 = true;
                                                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , var23_23 /* !! */ , var89_89);
                                                        } else {
                                                            var89_89 = true;
                                                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , (String)var68_68, var89_89);
                                                        }
                                                        var87_87 = TextUtils.isEmpty((CharSequence)var29_29);
                                                        var20_20 = var87_87 == false && (var87_87 = Intrinsics.areEqual(var29_29, var40_40 /* !! */ )) == false ? var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var30_30 /* !! */ , (String)var29_29, var89_89) : var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var30_30 /* !! */ , (String)var68_68, var89_89);
lbl725:
                                                        // 3 sources

                                                        while (true) {
                                                            var22_22 /* !! */  = var53_53;
                                                            var87_87 = StringsKt.H(var20_20, var53_53);
                                                            if (!var87_87) break block210;
                                                            break block211;
                                                            break;
                                                        }
lbl730:
                                                        // 1 sources

                                                        var90_90 = ',';
                                                        var87_87 = true;
                                                        var88_88 = 1.4E-45f;
                                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var28_28 /* !! */ , (String)var68_68, var87_87);
                                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var22_22 /* !! */ , (String)var68_68, var87_87);
                                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var27_27 /* !! */ , (String)var68_68, var87_87);
                                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var30_30 /* !! */ , (String)var68_68, var87_87);
                                                        ** continue;
                                                    }
                                                    var23_23 /* !! */  = JioAds.Companion;
                                                    var24_24 = var23_23 /* !! */ .getInstance();
                                                    var78_78 = var24_24.isChromiumDependencyPresent1();
                                                    if (!var78_78) {
                                                        if (var26_26 != null) {
                                                            var23_23 /* !! */  = var19_19.getUserAgent((Context)var26_26);
lbl745:
                                                            // 2 sources

                                                            while (true) {
                                                                var27_27 /* !! */  = var23_23 /* !! */ ;
                                                                break;
                                                            }
                                                        } else {
                                                            var84_84 = false;
                                                            var27_27 /* !! */  = null;
                                                        }
                                                    } else {
                                                        var23_23 /* !! */  = var23_23 /* !! */ .getInstance();
                                                        var23_23 /* !! */  = var23_23 /* !! */ .getCustomUserAgent();
                                                        ** continue;
                                                    }
                                                    if (var27_27 /* !! */  != null && !(var87_87 = TextUtils.isEmpty((CharSequence)var27_27 /* !! */ ))) {
                                                        var87_87 = true;
                                                        var88_88 = 1.4E-45f;
                                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var22_22 /* !! */ , (String)var27_27 /* !! */ , var87_87);
                                                    } else {
                                                        var87_87 = true;
                                                        var88_88 = 1.4E-45f;
                                                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var22_22 /* !! */ , (String)var68_68, var87_87);
                                                    }
lbl763:
                                                    // 3 sources

                                                    while (true) {
                                                        var22_22 /* !! */  = var35_35;
                                                        var87_87 = StringsKt.H(var20_20, var35_35);
                                                        if (!var87_87) break block213;
                                                        break block214;
                                                        break;
                                                    }
                                                }
                                                var84_84 = false;
                                                var27_27 /* !! */  = null;
                                                ** continue;
                                            }
                                            var23_23 /* !! */  = var13_13;
                                            var78_78 = true;
                                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var35_35, var13_13, var78_78);
lbl776:
                                            // 2 sources

                                            while (true) {
                                                var22_22 /* !! */  = var71_71;
                                                var87_87 = StringsKt.H(var20_20, (CharSequence)var71_71);
                                                if (!var87_87) break block215;
                                                break block216;
                                                break;
                                            }
                                        }
                                        var78_78 = true;
                                        ** continue;
                                    }
                                    var23_23 /* !! */  = var14_14;
                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var71_71, var14_14, var78_78);
lbl787:
                                    // 2 sources

                                    while (true) {
                                        var22_22 /* !! */  = var34_34;
                                        var78_78 = StringsKt.H(var20_20, var34_34);
                                        if (!var78_78) break block217;
                                        break block218;
                                        break;
                                    }
                                }
                                var23_23 /* !! */  = var14_14;
                                ** continue;
                            }
                            var24_24 = "-1";
                            var20_20 = kotlin.text.b.p(var20_20, var34_34, (String)var24_24);
                        }
                        if (var89_89 = (boolean)StringsKt.H(var20_20, var22_22 /* !! */  = "[apId]")) {
                            var22_22 /* !! */  = "apId";
                            var70_70 = false;
                            var29_29 = null;
                            var78_78 = true;
                            var21_21 = var15_15;
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var22_22 /* !! */ , var15_15, var78_78);
                        } else {
                            var70_70 = false;
                            var29_29 = null;
                            var78_78 = true;
                            var21_21 = var15_15;
                        }
                        var22_22 /* !! */  = var32_32;
                        var104_99 = StringsKt.H(var20_20, var32_32);
                        if (var104_99) {
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var32_32, var23_23 /* !! */ , var78_78);
                        }
                        if (var89_89 = StringsKt.H(var20_20, var22_22 /* !! */  = "appid")) {
                            var22_22 /* !! */  = "appid";
                            var87_87 = true;
                            var88_88 = 1.4E-45f;
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var22_22 /* !! */ , (String)var21_21, var87_87);
                        } else {
                            var87_87 = true;
                            var88_88 = 1.4E-45f;
                        }
                        var22_22 /* !! */  = var69_69;
                        var78_78 = StringsKt.H(var20_20, (CharSequence)var69_69);
                        if (var78_78) {
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var69_69, (String)var21_21, var87_87);
                        }
                        if ((var95_94 = StringsKt.H(var20_20, (CharSequence)(var21_21 = "[cb]"))) && (var95_94 = var16_16.length()) > false) {
                            var21_21 = "[cb]";
                            var22_22 /* !! */  = var16_16;
                            var20_20 = kotlin.text.b.p(var20_20, (String)var21_21, var16_16);
                        }
                        var21_21 = var52_52;
                        var89_89 = StringsKt.H(var20_20, var52_52);
                        if (var89_89) {
                            if (var27_27 /* !! */  != null && !(var89_89 = TextUtils.isEmpty((CharSequence)var27_27 /* !! */ ))) {
                                var89_89 = true;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var52_52, (String)var27_27 /* !! */ , var89_89);
                            } else {
                                var89_89 = true;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var68_68, var89_89);
                            }
                        }
                        var21_21 = var51_51;
                        var89_89 = StringsKt.H(var20_20, var51_51);
                        if (var89_89) {
                            var22_22 /* !! */  = Build.MODEL;
                            if (var22_22 /* !! */  != null && !(var87_87 = TextUtils.isEmpty((CharSequence)var22_22 /* !! */ ))) {
                                var87_87 = true;
                                var88_88 = 1.4E-45f;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var51_51, var22_22 /* !! */ , var87_87);
                            } else {
                                var87_87 = true;
                                var88_88 = 1.4E-45f;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var68_68, var87_87);
                            }
                        }
                        if (var95_94 = (boolean)StringsKt.H(var20_20, (CharSequence)(var21_21 = "[osv]"))) {
                            var21_21 = new StringBuilder();
                            var22_22 /* !! */  = Build.VERSION.RELEASE;
                            var21_21.append(var22_22 /* !! */ );
                            var21_21.append((String)var68_68);
                            var21_21 = var21_21.toString();
                            var22_22 /* !! */  = "[osv]";
                            var23_23 /* !! */  = "UTF-8";
                            var21_21 = URLEncoder.encode((String)var21_21, var23_23 /* !! */ );
                            Intrinsics.checkNotNull(var21_21);
                            var20_20 = kotlin.text.b.p(var20_20, var22_22 /* !! */ , (String)var21_21);
                        } else {
                            var21_21 = var50_50;
                            var89_89 = StringsKt.H(var20_20, var50_50);
                            if (var89_89) {
                                var22_22 /* !! */  = new StringBuilder();
                                var23_23 /* !! */  = Build.VERSION.RELEASE;
                                var22_22 /* !! */ .append(var23_23 /* !! */ );
                                var22_22 /* !! */ .append((String)var68_68);
                                var22_22 /* !! */  = var22_22 /* !! */ .toString();
                                if (var22_22 /* !! */  != null && !(var87_87 = TextUtils.isEmpty((CharSequence)var22_22 /* !! */ ))) {
                                    var87_87 = true;
                                    var88_88 = 1.4E-45f;
                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var50_50, var22_22 /* !! */ , var87_87);
                                } else {
                                    var87_87 = true;
                                    var88_88 = 1.4E-45f;
                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var68_68, var87_87);
                                }
                            }
                        }
                        var21_21 = var49_49;
                        var89_89 = StringsKt.H(var20_20, var49_49);
                        if (var89_89) {
                            var22_22 /* !! */  = Build.BRAND;
                            if (var22_22 /* !! */  != null && !(var87_87 = TextUtils.isEmpty((CharSequence)var22_22 /* !! */ ))) {
                                var87_87 = true;
                                var88_88 = 1.4E-45f;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var49_49, var22_22 /* !! */ , var87_87);
                            } else {
                                var87_87 = true;
                                var88_88 = 1.4E-45f;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var68_68, var87_87);
                            }
                        }
                        var21_21 = var48_48;
                        var89_89 = StringsKt.H(var20_20, var48_48);
                        var23_23 /* !! */  = "sw";
                        if (var89_89 || (var89_89 = StringsKt.H(var20_20, var23_23 /* !! */ ))) {
                            var22_22 /* !! */  = var19_19.getScreenHeightAndWidth((Context)var26_26);
                            var78_78 = false;
                            var24_24 = null;
                            var25_25 = var22_22 /* !! */ [0];
                            var78_78 = true;
                            var22_22 /* !! */  = var22_22 /* !! */ [var78_78];
                            var20_20 = var25_25 != null && (var84_84 = TextUtils.isEmpty((CharSequence)var25_25)) == false ? var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var25_25, var78_78) : var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var68_68, var78_78);
                            var20_20 = var22_22 /* !! */  != null && (var95_94 = (boolean)TextUtils.isEmpty((CharSequence)var22_22 /* !! */ )) == false ? var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var23_23 /* !! */ , var22_22 /* !! */ , var78_78) : var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var23_23 /* !! */ , (String)var68_68, var78_78);
                        }
                        if (var95_94 = (boolean)StringsKt.H(var20_20, (CharSequence)(var21_21 = "[os]"))) {
                            var21_21 = "[os]";
                            var22_22 /* !! */  = "UTF-8";
                            var23_23 /* !! */  = var41_41;
                            var22_22 /* !! */  = URLEncoder.encode(var41_41, var22_22 /* !! */ );
                            Intrinsics.checkNotNull(var22_22 /* !! */ );
                            var20_20 = kotlin.text.b.p(var20_20, (String)var21_21, var22_22 /* !! */ );
                        } else {
                            var23_23 /* !! */  = var41_41;
                            var21_21 = "os";
                            var95_94 = StringsKt.H(var20_20, (CharSequence)var21_21);
                            if (var95_94 && !(var95_94 = (boolean)TextUtils.isEmpty((CharSequence)var41_41))) {
                                var21_21 = "M_OPERATING_SYSTEM";
                                var89_89 = true;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, var41_41, var89_89);
                            }
                        }
                        var21_21 = "dt";
                        var95_94 = StringsKt.H(var20_20, (CharSequence)var21_21);
                        if (var95_94) {
                            if (var26_26 != null) {
                                var21_21 = Utility.INSTANCE;
                                var95_94 = var21_21.getCurrentUIModeType((Context)var26_26);
                                var21_21 = (int)var95_94;
                            } else {
                                var95_94 = false;
                                var21_21 = null;
                            }
                            if (var21_21 != null && (var89_89 = var21_21.intValue()) == (var78_78 = 4 != 0)) {
                                var21_21 = String.valueOf((int)var78_78);
                                Intrinsics.checkNotNull(var21_21);
lbl936:
                                // 2 sources

                                while (true) {
                                    var22_22 /* !! */  = var21_21;
                                    var95_94 = true;
                                    break;
                                }
                            } else if (var21_21 == null) {
                                while (true) {
                                    var95_94 = true;
                                    var22_22 /* !! */  = String.valueOf((int)var95_94);
                                    Intrinsics.checkNotNull(var22_22 /* !! */ );
                                    break;
                                }
                            } else {
                                if ((var95_94 = var21_21.intValue()) != (var89_89 = true)) ** continue;
                                var95_94 = var19_19.isDeviceTypeTablet((Context)var26_26);
                                var21_21 = var95_94 != false ? String.valueOf(var33_33) : String.valueOf((int)var89_89);
                                Intrinsics.checkNotNull(var21_21);
                                ** continue;
                            }
                            var24_24 = "dt";
                            var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var24_24, var22_22 /* !! */ , var95_94);
                        }
                        var21_21 = var47_47;
                        var89_89 = StringsKt.H(var20_20, var47_47);
                        if (var89_89) {
                            if (var26_26 != null && (var22_22 /* !! */  = var26_26.getResources()) != null && (var22_22 /* !! */  = var22_22 /* !! */ .getConfiguration()) != null) {
                                var22_22 /* !! */  = var22_22 /* !! */ .locale;
                            } else {
                                var89_89 = false;
                                var22_22 /* !! */  = null;
                            }
                            var24_24 = new StringBuilder();
                            if (var22_22 /* !! */  != null) {
                                var25_25 = var22_22 /* !! */ .getISO3Language();
                            } else {
                                var104_99 = false;
                                var25_25 = null;
                            }
                            var24_24.append((String)var25_25);
                            var104_99 = 95 != 0;
                            var24_24.append((char)var104_99);
                            if (var22_22 /* !! */  != null) {
                                var22_22 /* !! */  = var22_22 /* !! */ .getCountry();
                            } else {
                                var89_89 = false;
                                var22_22 /* !! */  = null;
                            }
                            var24_24.append(var22_22 /* !! */ );
                            var22_22 /* !! */  = var24_24.toString();
                            var78_78 = TextUtils.isEmpty((CharSequence)var22_22 /* !! */ );
                            if (!var78_78) {
                                var78_78 = true;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, var22_22 /* !! */ , var78_78);
                            } else {
                                var78_78 = true;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var68_68, var78_78);
                            }
                        }
                        var21_21 = var46_46;
                        var89_89 = StringsKt.H(var20_20, var46_46);
                        if (var89_89) {
                            var22_22 /* !! */  = var19_19.getNetworkConnectionType((Context)var26_26);
                            if (var22_22 /* !! */  != null && !(var78_78 = (boolean)TextUtils.isEmpty((CharSequence)var22_22 /* !! */ ))) {
                                var78_78 = true;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var46_46, var22_22 /* !! */ , var78_78);
                            } else {
                                var78_78 = true;
                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var68_68, var78_78);
                            }
                        }
                        var21_21 = var45_45;
                        var89_89 = StringsKt.H(var20_20, var45_45);
                        if (!var89_89) ** GOTO lbl1034
                        if (var26_26 == null) break block219;
                        var22_22 /* !! */  = var37_37;
                        Intrinsics.checkNotNullParameter(var26_26, var37_37);
                        var22_22 /* !! */  = "limit-tracking";
                    }
                    try {
                        var24_24 = Boolean.FALSE;
                        var25_25 = var9_9;
                        var84_84 = 4 != 0;
                        var22_22 /* !! */  = j_0.d((Context)var26_26, (String)var9_9, (int)var84_84, var24_24, var22_22 /* !! */ );
                        var24_24 = "null cannot be cast to non-null type kotlin.Boolean";
                        Intrinsics.checkNotNull(var22_22 /* !! */ , (String)var24_24);
                        var22_22 /* !! */  = (Boolean)var22_22 /* !! */ ;
                        var84_84 = var22_22 /* !! */ .booleanValue();
                    }
                    catch (Exception v1) {
                        var84_84 = false;
                        var27_27 /* !! */  = null;
                    }
                    if (var84_84) break block219;
                    var22_22 /* !! */  = var2_2;
                    ** GOTO lbl-1000
                }
                var22_22 /* !! */  = var23_23 /* !! */ ;
lbl-1000:
                // 2 sources

                {
                    block236: {
                        block235: {
                            block232: {
                                block234: {
                                    block233: {
                                        block220: {
                                            block221: {
                                                var78_78 = TextUtils.isEmpty((CharSequence)var22_22 /* !! */ );
                                                if (!var78_78) {
                                                    var78_78 = true;
                                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, var22_22 /* !! */ , var78_78);
                                                } else {
                                                    var78_78 = true;
                                                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var68_68, var78_78);
                                                }
lbl1029:
                                                // 3 sources

                                                while (true) {
                                                    var21_21 = var44_44;
                                                    var78_78 = StringsKt.H(var20_20, var44_44);
                                                    if (!var78_78) break block220;
                                                    break block221;
                                                    break;
                                                }
lbl1034:
                                                // 1 sources

                                                var89_89 = false;
                                                var22_22 /* !! */  = null;
                                                ** continue;
                                            }
                                            var78_78 = TextUtils.isEmpty((CharSequence)var22_22 /* !! */ );
                                            if (!var78_78) {
                                                var78_78 = true;
                                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var44_44, var22_22 /* !! */ , var78_78);
                                            } else {
                                                var78_78 = true;
                                                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var44_44, (String)var68_68, var78_78);
                                            }
                                        }
                                        if (var95_94 = StringsKt.H(var20_20, (CharSequence)(var21_21 = "ERRORCODE"))) break block232;
                                        var21_21 = "ec";
                                        var95_94 = StringsKt.H(var20_20, (CharSequence)var21_21);
                                        if (!var95_94) break block233;
                                        var21_21 = var4_4;
                                        var89_89 = 44;
                                        if (var4_4 == null) break block234;
                                        break block235;
                                    }
                                    var89_89 = 44;
                                }
                                var21_21 = var63_63 /* !! */ ;
                                var104_99 = true;
                                break block236;
                            }
                            var21_21 = var4_4;
                            var89_89 = 44;
                        }
                        var24_24 = "ERRORCODE";
                        var104_99 = true;
                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var24_24, (String)var21_21, var104_99);
                        var21_21 = var63_63 /* !! */ ;
                    }
                    var78_78 = StringsKt.H(var20_20, (CharSequence)var21_21);
                    if (var78_78) {
                        var105_100 = System.currentTimeMillis();
                        var24_24 = String.valueOf(var105_100);
                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var24_24, var104_99);
                    }
                    var21_21 = var64_64;
                    var78_78 = StringsKt.H(var20_20, var64_64);
                    if (!var78_78) ** GOTO lbl1123
                    var24_24 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                    var25_25 = var77_77;
                    if (var77_77 != var24_24) break block222;
                }
                {
                    var27_27 /* !! */  = JioAdView$AdPodVariant.DEFAULT_ADPOD;
                    var28_28 /* !! */  = var74_74 /* !! */ ;
                    if (var74_74 /* !! */  != var27_27 /* !! */ ) ** GOTO lbl-1000
                    var30_30 /* !! */  = var58_58;
                    var84_84 = true;
                }
                {
                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var64_64, var58_58, var84_84);
                    ** GOTO lbl1116
                }
            }
            var28_28 /* !! */  = var74_74 /* !! */ ;
lbl-1000:
            // 2 sources

            {
                if (var25_25 != var24_24 || var28_28 /* !! */  != (var24_24 = JioAdView$AdPodVariant.NONE)) ** GOTO lbl1093
                var78_78 = true;
            }
            {
                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, var23_23 /* !! */ , var78_78);
                ** GOTO lbl1116
lbl1093:
                // 1 sources

                var23_23 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL;
                if (var25_25 != var23_23 /* !! */ ) ** GOTO lbl1099
                var23_23 /* !! */  = "4";
                var78_78 = true;
            }
            {
                block237: {
                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, var23_23 /* !! */ , var78_78);
                    ** GOTO lbl1116
lbl1099:
                    // 1 sources

                    if (var7_7) ** GOTO lbl1112
                    var23_23 /* !! */  = JioAdView$AD_TYPE.INSTREAM_AUDIO;
                    if (var25_25 != var23_23 /* !! */ ) break block237;
                    var24_24 = var2_2;
                    var87_87 = true;
                    var88_88 = 1.4E-45f;
                    ** GOTO lbl1115
                }
                var87_87 = true;
                var88_88 = 1.4E-45f;
            }
            {
                block223: {
                    block238: {
                        var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var68_68, var87_87);
                        break block238;
lbl1112:
                        // 1 sources

                        var87_87 = true;
                        var88_88 = 1.4E-45f;
                        var24_24 = var2_2;
lbl1115:
                        // 2 sources

                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, (String)var24_24, var87_87);
                    }
lbl1117:
                    // 2 sources

                    while (true) {
                        var21_21 = var43_43;
                        var87_87 = StringsKt.H(var20_20, var43_43);
                        if (var87_87) {
                            break block223;
                        }
                        ** GOTO lbl1137
                        break;
                    }
lbl1123:
                    // 1 sources

                    var25_25 = var77_77;
                    ** continue;
                }
                var23_23 /* !! */  = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                if (var25_25 != var23_23 /* !! */ ) ** GOTO lbl1132
                var23_23 /* !! */  = var3_3;
                var78_78 = true;
            }
            {
                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var43_43, var3_3, var78_78);
                ** GOTO lbl1137
lbl1132:
                // 1 sources

                var78_78 = true;
                var23_23 /* !! */  = JioAdView$AD_TYPE.INSTREAM_AUDIO;
                if (var25_25 != var23_23 /* !! */ ) ** GOTO lbl1137
                var23_23 /* !! */  = var6_6;
            }
            {
                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var43_43, (String)var6_6, var78_78);
lbl1137:
                // 4 sources

                var21_21 = var42_42;
                var87_87 = StringsKt.H(var20_20, var42_42);
                if (!var87_87) ** GOTO lbl1173
                var23_23 /* !! */  = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                if (var25_25 != var23_23 /* !! */ ) ** GOTO lbl1160
            }
            {
                block239: {
                    var22_22 /* !! */  = var1_1.a();
                    if (var22_22 /* !! */  != null) {
                        var23_23 /* !! */  = new StringBuilder();
                        var23_23 /* !! */ .append((Object)var22_22 /* !! */ );
                        var24_24 = "[0],";
                        var23_23 /* !! */ .append((String)var24_24);
                        var23_23 /* !! */ .append((Object)var22_22 /* !! */ );
                        var22_22 /* !! */  = "[1]";
                        var23_23 /* !! */ .append(var22_22 /* !! */ );
                        var22_22 /* !! */  = var23_23 /* !! */ .toString();
                        var87_87 = true;
                        var88_88 = 1.4E-45f;
                        var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var42_42, var22_22 /* !! */ , var87_87);
                    }
                    break block239;
lbl1160:
                    // 1 sources

                    var23_23 /* !! */  = new StringBuilder();
                    var24_24 = var17_17;
                    var23_23 /* !! */ .append(var17_17);
                    var23_23 /* !! */ .append((char)var89_89);
                    var22_22 /* !! */  = var18_18;
                    var23_23 /* !! */ .append(var18_18);
                    var22_22 /* !! */  = var23_23 /* !! */ .toString();
                    var87_87 = true;
                    var88_88 = 1.4E-45f;
                    var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var42_42, var22_22 /* !! */ , var87_87);
                }
                if (var72_72 != null) {
                    var24_24 = var72_72;
                    var20_20 = var19_19.a(var20_20, (HashMap)var72_72);
                }
                if (!(var95_94 = StringsKt.H(var20_20, (CharSequence)(var21_21 = "cmd")))) ** GOTO lbl1228
                var21_21 = new LinkedHashMap();
                var22_22 /* !! */  = var1_1.R();
                if (var22_22 /* !! */  != null) {
                    var22_22 /* !! */  = var22_22 /* !! */ .getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)var26_26);
                } else {
                    var89_89 = false;
                    var22_22 /* !! */  = null;
                }
                if (var22_22 /* !! */  != null) {
                    var22_22 /* !! */  = var1_1.R();
                    if (var22_22 /* !! */  != null) {
                        var29_29 = var22_22 /* !! */ .getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)var26_26);
                    }
                    Intrinsics.checkNotNull(var29_29);
                    var21_21.putAll(var29_29);
                }
                var89_89 = var21_21.isEmpty();
                var87_87 = true;
                var88_88 = 1.4E-45f;
                if (!(var89_89 ^= var87_87) || !var12_12) ** GOTO lbl1211
            }
            {
                var22_22 /* !! */  = Utility.a((HashMap)var21_21, var87_87);
                var23_23 /* !! */  = new StringBuilder();
                var24_24 = "cmd macro for clicktracker= ";
                var23_23 /* !! */ .append((String)var24_24);
                var23_23 /* !! */ .append(var22_22 /* !! */ );
                var23_23 /* !! */  = var23_23 /* !! */ .toString();
                var24_24 = "message";
                Intrinsics.checkNotNullParameter(var23_23 /* !! */ , (String)var24_24);
                var23_23 /* !! */  = JioAds.Companion;
                var23_23 /* !! */  = var23_23 /* !! */ .getInstance();
                var23_23 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var23_23 /* !! */  = JioAds$LogLevel.NONE;
                var20_20 = var19_19.a(var20_20, var22_22 /* !! */ );
lbl1211:
                // 2 sources

                var89_89 = var21_21.isEmpty();
                var87_87 = true;
                var88_88 = 1.4E-45f;
                if (!(var89_89 ^= var87_87)) ** GOTO lbl1228
            }
            {
                var22_22 /* !! */  = "__[cmd]";
                var89_89 = StringsKt.H(var20_20, var22_22 /* !! */ );
                if (var89_89) {
                    var22_22 /* !! */  = Utility.a((HashMap)var21_21, var87_87);
                    var23_23 /* !! */  = "[cmd]";
                    var20_20 = kotlin.text.b.p(var20_20, var23_23 /* !! */ , var22_22 /* !! */ );
                }
                var89_89 = var10_10;
                var21_21 = Utility.a((HashMap)var21_21, var10_10);
                var22_22 /* !! */  = "cmd";
                var87_87 = false;
                var88_88 = 0.0f;
                var23_23 /* !! */  = null;
                var20_20 = var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, var22_22 /* !! */ , (String)var21_21, false);
lbl1228:
                // 3 sources

                var21_21 = "idtype";
                var22_22 /* !! */  = "adid";
                var87_87 = true;
                var88_88 = 1.4E-45f;
                return var19_19.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var20_20, (String)var21_21, var22_22 /* !! */ , var87_87);
            }
        }
        var23_23 /* !! */  = "Exception while replacing macro ";
        var22_22 /* !! */  = new StringBuilder(var23_23 /* !! */ );
        com.jio.jioads.jioreel.tracker.model.b.c(var19_19, var85_85, (StringBuilder)var22_22 /* !! */ );
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var21_21 = JioAds$LogLevel.NONE;
        return var20_20;
    }

    public final String replaceVastMacros(j object, String string2) {
        String string3;
        boolean bl2;
        Object object2;
        Intrinsics.checkNotNullParameter(string2, "paramUrl");
        Object object3 = null;
        if (object != null && (object2 = ((j)object).n) != null) {
            object2 = ((com.jio.jioads.instreamads.vastparser.model.e)object2).e;
        } else {
            bl2 = false;
            object2 = null;
        }
        bl2 = TextUtils.isEmpty((CharSequence)object2);
        boolean bl3 = true;
        if (!bl2) {
            if (object != null && (object2 = ((j)object).n) != null) {
                object2 = ((com.jio.jioads.instreamads.vastparser.model.e)object2).e;
            } else {
                bl2 = false;
                object2 = null;
            }
            string3 = "ADSERVINGID";
            string2 = this.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2, string3, (String)object2, bl3);
        }
        if (object != null && (object2 = ((j)object).n) != null && (object2 = ((com.jio.jioads.instreamads.vastparser.model.e)object2).g) != null && (bl2 = object2.isEmpty() ^ bl3) == bl3) {
            boolean bl4;
            object2 = ((j)object).n;
            string3 = null;
            if (object2 != null && (object2 = ((com.jio.jioads.instreamads.vastparser.model.e)object2).g) != null && (object2 = (com.jio.jioads.instreamads.vastparser.model.c)object2.get(0)) != null) {
                object2 = ((com.jio.jioads.instreamads.vastparser.model.c)object2).e;
            } else {
                bl2 = false;
                object2 = null;
            }
            boolean bl5 = TextUtils.isEmpty((CharSequence)object2);
            if (bl5) {
                object2 = ((j)object).m;
                if (object2 != null && (object2 = ((q)object2).i) != null && (bl2 = object2.isEmpty() ^ bl3) == bl3 && (object = ((j)object).m) != null && (object = ((q)object).i) != null && (object = (com.jio.jioads.instreamads.vastparser.model.c)object.get(0)) != null) {
                    object3 = ((com.jio.jioads.instreamads.vastparser.model.c)object).e;
                }
            } else {
                object3 = object2;
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)object3))) {
                object = "UNIVERSALADID";
                string2 = this.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2, (String)object, (String)object3, bl3);
            }
        }
        return string2;
    }

    public final List replaceVastMacros(j j3, List object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "trackingEvents");
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (i)object.next();
            Object object3 = ((i)object2).b;
            boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
            if (!bl3) {
                String string2 = ((i)object2).b;
                Intrinsics.checkNotNull(string2);
                string2 = this.replaceVastMacros(j3, string2);
                object2 = ((i)object2).a;
                object3 = new i((String)object2, string2);
                arrayList.add(object3);
                continue;
            }
            arrayList.add(object2);
        }
        return arrayList;
    }

    public final void setCCBString$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        g = string2;
    }

    public final void setCcbStr(String string2) {
        g = string2;
    }

    public final void setConfigEnvUpdated(boolean bl2) {
        d = bl2;
    }

    public final void setConfigInit(boolean bl2) {
        c = bl2;
    }

    public final void setContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(Context object) {
        object = object != null ? object.getApplicationContext() : null;
        a = object;
    }

    public final long toMillis(String object) {
        long l2;
        String string2 = "yyyy-MM-dd'T'HH:mm:ss.SSS+";
        Object object2 = new SimpleDateFormat(string2);
        object = ((DateFormat)object2).parse((String)object);
        object2 = "parse(...)";
        try {
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            l2 = ((Date)object).getTime();
        }
        catch (ParseException parseException) {
            l2 = 0L;
        }
        return l2;
    }
}

