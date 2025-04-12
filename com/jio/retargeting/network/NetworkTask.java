/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.jio.retargeting.network;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import com.jio.retargeting.network.NetworkTask$PostResult;
import com.jio.retargeting.network.NetworkTaskListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class NetworkTask {
    public final Context a;
    public final int b;
    public final int c;
    public URL d;
    public final String e;
    public final NetworkTaskListener f;
    public final String g;

    public NetworkTask(Context object, int n3, String string2, String string3, boolean bl2, int n4, NetworkTaskListener networkTaskListener) {
        Intrinsics.checkNotNullParameter(object, "context");
        String string4 = "url";
        Intrinsics.checkNotNullParameter(string2, string4);
        this.a = object;
        this.b = n3;
        this.c = n4;
        object = "";
        this.e = object;
        super(string2);
        try {
            this.d = object;
        }
        catch (MalformedURLException malformedURLException) {
            object = "Malformed URL";
            j.b((String)object);
        }
        this.f = networkTaskListener;
        if (string3 != null) {
            this.e = string3;
        }
        object = Utility.INSTANCE;
        Context context = this.a;
        this.g = object = ((Utility)object).getUserAgent(context);
        object = this.e;
        this.a((String)object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(HttpURLConnection object, String string2) {
        void var0_3;
        Object object2;
        block5: {
            l_0.h("Final Payload: ", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            try {
                object = ((URLConnection)object).getOutputStream();
                Charset charset = StandardCharsets.UTF_8;
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)object, charset);
                object2 = new BufferedWriter(outputStreamWriter);
            }
            catch (Throwable throwable) {
                object2 = null;
                break block5;
            }
            try {
                ((Writer)object2).write(string2);
                ((BufferedWriter)object2).flush();
            }
            catch (Throwable throwable) {
                break block5;
            }
            ((BufferedWriter)object2).close();
            return;
        }
        if (object2 != null) {
            ((BufferedWriter)object2).close();
        }
        throw var0_3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(HttpURLConnection object, StringBuilder object2) {
        void var0_5;
        Object object3;
        String string2;
        block18: {
            Object object4;
            block16: {
                block17: {
                    block19: {
                        Object object5;
                        string2 = "message";
                        try {
                            object = ((URLConnection)object).getInputStream();
                        }
                        catch (IOException iOException) {
                            object5 = "IOException while Network call :";
                            object3 = new StringBuilder((String)object5);
                            object4 = iOException.getMessage();
                            ((StringBuilder)object3).append((String)object4);
                            Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string2);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object4 = JioAds$LogLevel.NONE;
                            object = ((HttpURLConnection)object).getErrorStream();
                        }
                        object4 = null;
                        try {
                            object5 = new InputStreamReader((InputStream)object);
                            object3 = new BufferedReader((Reader)object5);
                        }
                        catch (Throwable throwable) {
                            break block16;
                        }
                        catch (IOException iOException) {
                            // empty catch block
                            break block17;
                        }
                        try {
                            while ((object = ((BufferedReader)object3).readLine()) != null) {
                                ((StringBuilder)object2).append((String)object);
                                char c2 = '\r';
                                ((StringBuilder)object2).append(c2);
                            }
                        }
                        catch (Throwable throwable) {
                            break block18;
                        }
                        catch (IOException iOException) {
                            break block19;
                        }
                        try {
                            ((BufferedReader)object3).close();
                            return;
                        }
                        catch (IOException iOException) {
                            Intrinsics.checkNotNullParameter(String.valueOf(iOException.getMessage()), string2);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object = JioAds$LogLevel.NONE;
                            return;
                        }
                    }
                    object4 = object3;
                }
                object2 = "Error reading server response in background thread";
                {
                    Intrinsics.checkNotNullParameter(object2, string2);
                    object2 = "throwable";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object = JioAds.Companion;
                    object = ((JioAds$Companion)object).getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    if (object4 == null) return;
                }
                try {
                    ((BufferedReader)object4).close();
                    return;
                }
                catch (IOException iOException) {
                    Intrinsics.checkNotNullParameter(String.valueOf(iOException.getMessage()), string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
                return;
            }
            object3 = object4;
        }
        if (object3 == null) throw var0_5;
        try {
            ((BufferedReader)object3).close();
            throw var0_5;
        }
        catch (IOException iOException) {
            Intrinsics.checkNotNullParameter(String.valueOf(iOException.getMessage()), string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
        }
        throw var0_5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final NetworkTask$PostResult a(String object) {
        int n3;
        int n4;
        boolean bl2;
        CharSequence charSequence;
        Object object2;
        String string2;
        block16: {
            IOException iOException2;
            block14: {
                String string3;
                block15: {
                    SecurityException securityException2;
                    block13: {
                        Exception exception2;
                        block12: {
                            Object object3;
                            block11: {
                                string2 = "message";
                                object2 = "ResponseCode : ";
                                charSequence = new StringBuilder();
                                bl2 = true;
                                n4 = -1;
                                try {
                                    object3 = this.d;
                                    boolean bl3 = ((String)object).length();
                                    object3 = this.a((URL)object3, (int)(bl3 ? 1 : 0));
                                    bl3 = this.b;
                                    if (bl3 != bl2) break block11;
                                    NetworkTask.a((HttpURLConnection)object3, (String)object);
                                }
                                catch (Exception exception2) {
                                    break block12;
                                }
                                catch (SecurityException securityException2) {
                                    break block13;
                                }
                                catch (IOException iOException2) {
                                    break block14;
                                }
                            }
                            n4 = ((HttpURLConnection)object3).getResponseCode();
                            CharSequence charSequence2 = new StringBuilder((String)object2);
                            charSequence2.append(n4);
                            object2 = charSequence2.toString();
                            Intrinsics.checkNotNullParameter(object2, string2);
                            object2 = JioAds.Companion;
                            object2 = ((JioAds$Companion)object2).getInstance();
                            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object2 = JioAds$LogLevel.NONE;
                            n3 = 301;
                            if (n4 != n3 && n4 != (n3 = 302) && n4 != (n3 = 303)) {
                                NetworkTask.a((HttpURLConnection)object3, charSequence);
                                break block15;
                            } else {
                                charSequence2 = "Location";
                                charSequence2 = ((URLConnection)object3).getHeaderField((String)charSequence2);
                                this.d = object2 = new URL((String)charSequence2);
                                NetworkTask.a((HttpURLConnection)object3, charSequence);
                                return this.a((String)object);
                            }
                        }
                        object2 = "Exception while sending payload in background thread";
                        LO1.b((String)object2, exception2);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        break block15;
                    }
                    string3 = "Security error while sending payload in background thread";
                    object2 = new StringBuilder(string3);
                    object = securityException2.getMessage();
                    ((StringBuilder)object2).append((String)object);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
                bl2 = false;
                string3 = null;
                break block16;
            }
            String string4 = "Network error while posting event in background thread ";
            object2 = new StringBuilder(string4);
            object = iOException2.getMessage();
            ((StringBuilder)object2).append((String)object);
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
        object = charSequence.toString();
        object2 = "toString(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        n3 = TextUtils.isEmpty((CharSequence)object);
        if (n3 == 0) {
            object2 = this.f;
            if (object2 != null) {
                object2.onSuccess((String)object, n4);
            }
        } else {
            object2 = this.f;
            if (object2 != null) {
                object2.onError(bl2, (String)object);
            }
        }
        if ((n3 = ((String)object).length()) > 0 && (n3 = (int)(StringsKt.F((CharSequence)object, (CharSequence)(object2 = "errors"), false) ? 1 : 0)) != 0) {
            object2 = new StringBuilder("Response code : ");
            ((StringBuilder)object2).append(n4);
            charSequence = " Body: ";
            ((StringBuilder)object2).append((String)charSequence);
            ((StringBuilder)object2).append((String)object);
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
            object = JioAds.Companion.getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        if (!bl2) return NetworkTask$PostResult.DONE;
        return NetworkTask$PostResult.RETRY_LATER;
    }

    public final HttpURLConnection a(URL object, int n3) {
        Intrinsics.checkNotNull(object);
        URLConnection uRLConnection = ((URL)object).openConnection();
        Object object2 = "null cannot be cast to non-null type java.net.HttpURLConnection";
        Intrinsics.checkNotNull(uRLConnection, (String)object2);
        uRLConnection = (HttpURLConnection)uRLConnection;
        int n4 = this.c * 1000;
        uRLConnection.setReadTimeout(n4);
        n4 = this.c * 1000;
        uRLConnection.setConnectTimeout(n4);
        n4 = this.b;
        int n7 = 1;
        object2 = n4 == 0 ? "GET" : (n4 == n7 ? "POST" : "Invalid Method");
        ((HttpURLConnection)uRLConnection).setRequestMethod((String)object2);
        uRLConnection.setDoInput(n7 != 0);
        if (n3 > 0) {
            uRLConnection.setDoOutput(n7 != 0);
        }
        ((HttpURLConnection)uRLConnection).setInstanceFollowRedirects(n7 != 0);
        uRLConnection.setUseCaches(false);
        uRLConnection.setRequestProperty("Content-Type", "application/json");
        CharSequence charSequence = this.g;
        uRLConnection.setRequestProperty("User-Agent", (String)charSequence);
        charSequence = new StringBuilder("Request url: ");
        ((StringBuilder)charSequence).append(object);
        object = ((StringBuilder)charSequence).toString();
        charSequence = "message";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = new StringBuilder("Request timeout: ");
        n7 = this.c;
        ((StringBuilder)object2).append(n7);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), (String)charSequence);
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        return uRLConnection;
    }

    public final Context getContext() {
        return this.a;
    }

    public final NetworkTask$PostResult post(String string2) {
        Intrinsics.checkNotNullParameter(string2, "payload");
        return this.a(string2);
    }
}

