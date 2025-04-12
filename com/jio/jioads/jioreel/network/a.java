/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.network;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.network.b;
import com.jio.jioads.network.d;
import com.jio.jioads.network.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ a(b b2, String string2, int n3, Function1 function1) {
        this.a = b2;
        this.b = string2;
        this.c = n3;
        this.d = null;
        this.e = null;
        this.f = function1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block28: {
            block29: {
                var1_1 = this.b;
                var2_2 = "message";
                var3_6 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                var4_7 = this.a;
                Intrinsics.checkNotNullParameter(var4_7, "this$0");
                var5_8 = this.f;
                var6_27 = "$networkResult";
                Intrinsics.checkNotNullParameter(var5_8, var6_27);
                var4_7.getClass();
                var4_7 = null;
                var7_28 = 30;
                var8_29 = 0;
                var9_30 = null;
                try {
                    var10_31 = new URL((String)var1_1);
                    var1_1 = var10_31.openConnection();
                    var10_31 = "null cannot be cast to non-null type java.net.HttpURLConnection";
                    Intrinsics.checkNotNull(var1_1, (String)var10_31);
                    var1_1 = (HttpURLConnection)var1_1;
                    var9_30 = "GET";
                }
                catch (Throwable var2_4) {
                    break block28;
                }
                catch (Exception var5_15) {
                    ** GOTO lbl-1000
                }
                catch (IOException var5_16) {
                    ** GOTO lbl140
                }
                catch (SSLPeerUnverifiedException var5_17) {
                    ** GOTO lbl158
                }
                catch (ConnectException var5_18) {
                    ** GOTO lbl176
                }
                catch (SocketTimeoutException var5_19) {
                    ** GOTO lbl194
                }
                catch (MalformedURLException var5_20) {
                    ** GOTO lbl212
                }
                try {
                    var1_1.setRequestMethod((String)var9_30);
                    var8_29 = this.c * 1000;
                }
                catch (Throwable var2_3) {
                    var9_30 = var1_1;
                    break block28;
                }
                catch (Exception var5_9) {
                    var9_30 = var1_1;
                    ** GOTO lbl-1000
                }
                catch (IOException var5_10) {
                    var9_30 = var1_1;
                    ** GOTO lbl140
                }
                catch (SSLPeerUnverifiedException var5_11) {
                    var9_30 = var1_1;
                    ** GOTO lbl158
                }
                catch (ConnectException var5_12) {
                    var9_30 = var1_1;
                    ** GOTO lbl176
                }
                catch (SocketTimeoutException var5_13) {
                    var9_30 = var1_1;
                    ** GOTO lbl194
                }
                catch (MalformedURLException var5_14) {
                    var9_30 = var1_1;
                    ** GOTO lbl212
                }
                {
                    var1_1.setConnectTimeout(var8_29);
                    var1_1.setReadTimeout(var8_29);
                    var8_29 = 1;
                    var1_1.setInstanceFollowRedirects((boolean)var8_29);
                    var1_1.setUseCaches(false);
                    var10_31 = this.d;
                }
                if (var10_31 != null && (var11_32 = var10_31.isEmpty()) == 0) {
                    var13_34 = var10_31.size();
                    var12_33 = new ArrayList(var13_34);
                    var10_31 = var10_31.entrySet();
                    var10_31 = var10_31.iterator();
                    while ((var13_34 = (int)var10_31.hasNext()) != 0) {
                        var14_35 /* !! */  = var10_31.next();
                        var14_35 /* !! */  = (Map.Entry)var14_35 /* !! */ ;
                        var15_36 /* !! */  = var14_35 /* !! */ .getKey();
                        var15_36 /* !! */  = (String)var15_36 /* !! */ ;
                        var14_35 /* !! */  = var14_35 /* !! */ .getValue();
                        var14_35 /* !! */  = (String)var14_35 /* !! */ ;
                        var1_1.setRequestProperty((String)var15_36 /* !! */ , (String)var14_35 /* !! */ );
                        var14_35 /* !! */  = Unit.a;
                        var12_33.add(var14_35 /* !! */ );
                    }
                }
                var1_1.setDoInput((boolean)var8_29);
                var10_31 = this.e;
                if (var10_31 == null) ** GOTO lbl94
                {
                    var1_1.setDoOutput((boolean)var8_29);
                    var12_33 = var1_1.getOutputStream();
                    var9_30 = new OutputStreamWriter((OutputStream)var12_33);
                    var9_30.write((String)var10_31);
                    var9_30.flush();
                    var9_30.close();
lbl94:
                    // 2 sources

                    var12_33 = var1_1.getInputStream();
                    var10_31 = new InputStreamReader((InputStream)var12_33);
                    var9_30 = new BufferedReader((Reader)var10_31);
                    var10_31 = new StringBuffer();
                    var12_33 = var9_30.readLine();
                    while (var12_33 != null) {
                        var10_31.append((String)var12_33);
                        var12_33 = var9_30.readLine();
                    }
                    var9_30.close();
                    var8_29 = var1_1.getResponseCode();
                    var11_32 = 200;
                    if (var8_29 == var11_32) {
                        var10_31 = var10_31.toString();
                        var9_30 = new e((String)var10_31);
                        var5_8.invoke(var9_30);
                        break block29;
                    } else {
                        var11_32 = var1_1.getResponseCode();
                        var12_33 = String.valueOf(var11_32);
                        var10_31 = var10_31.toString();
                        var9_30 = new d((String)var12_33, (String)var10_31);
                        var5_8.invoke(var9_30);
                    }
                    break block29;
                }
lbl-1000:
                // 2 sources

                {
                    var1_1 = yc0_2.b((Throwable)var5_21);
                    var1_1 = var1_1.substring(0, var7_28);
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var3_6);
                    var3_6 = new StringBuilder();
                    var4_7 = "Exception while n/w call: ";
                    var3_6.append((String)var4_7);
                    var3_6.append((String)var1_1);
                    var1_1 = var3_6.toString();
                    Intrinsics.checkNotNullParameter(var1_1, var2_2);
                    var1_1 = JioAds.Companion;
                    var1_1 = var1_1.getInstance();
                    var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 = JioAds$LogLevel.NONE;
                    if (var9_30 == null) return;
lbl137:
                    // 6 sources

                    while (true) {
                        var1_1 = var9_30;
                        break block29;
                        break;
                    }
lbl140:
                    // 2 sources

                    var1_1 = yc0_2.b((Throwable)var5_22);
                    var1_1 = var1_1.substring(0, var7_28);
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var3_6);
                    var3_6 = new StringBuilder();
                    var4_7 = "IOException while n/w call: ";
                    var3_6.append((String)var4_7);
                    var3_6.append((String)var1_1);
                    var1_1 = var3_6.toString();
                    Intrinsics.checkNotNullParameter(var1_1, var2_2);
                    var1_1 = JioAds.Companion;
                    var1_1 = var1_1.getInstance();
                    var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 = JioAds$LogLevel.NONE;
                    if (var9_30 == null) return;
                    ** GOTO lbl137
lbl158:
                    // 2 sources

                    var1_1 = yc0_2.b((Throwable)var5_23);
                    var1_1 = var1_1.substring(0, var7_28);
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var3_6);
                    var3_6 = new StringBuilder();
                    var4_7 = "SSLPeerUnverifiedException while n/w call: ";
                    var3_6.append((String)var4_7);
                    var3_6.append((String)var1_1);
                    var1_1 = var3_6.toString();
                    Intrinsics.checkNotNullParameter(var1_1, var2_2);
                    var1_1 = JioAds.Companion;
                    var1_1 = var1_1.getInstance();
                    var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 = JioAds$LogLevel.NONE;
                    if (var9_30 == null) return;
                    ** GOTO lbl137
lbl176:
                    // 2 sources

                    var1_1 = yc0_2.b((Throwable)var5_24);
                    var1_1 = var1_1.substring(0, var7_28);
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var3_6);
                    var3_6 = new StringBuilder();
                    var4_7 = "ConnectException while n/w call: ";
                    var3_6.append((String)var4_7);
                    var3_6.append((String)var1_1);
                    var1_1 = var3_6.toString();
                    Intrinsics.checkNotNullParameter(var1_1, var2_2);
                    var1_1 = JioAds.Companion;
                    var1_1 = var1_1.getInstance();
                    var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 = JioAds$LogLevel.NONE;
                    if (var9_30 == null) return;
                    ** GOTO lbl137
lbl194:
                    // 2 sources

                    var1_1 = yc0_2.b((Throwable)var5_25);
                    var1_1 = var1_1.substring(0, var7_28);
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var3_6);
                    var3_6 = new StringBuilder();
                    var4_7 = "SocketTimeoutException while n/w call: ";
                    var3_6.append((String)var4_7);
                    var3_6.append((String)var1_1);
                    var1_1 = var3_6.toString();
                    Intrinsics.checkNotNullParameter(var1_1, var2_2);
                    var1_1 = JioAds.Companion;
                    var1_1 = var1_1.getInstance();
                    var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 = JioAds$LogLevel.NONE;
                    if (var9_30 == null) return;
                    ** GOTO lbl137
lbl212:
                    // 2 sources

                    var1_1 = yc0_2.b((Throwable)var5_26);
                    var1_1 = var1_1.substring(0, var7_28);
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var3_6);
                    var3_6 = new StringBuilder();
                    var4_7 = "MalformedURLException while n/w call: ";
                    var3_6.append((String)var4_7);
                    var3_6.append((String)var1_1);
                    var1_1 = var3_6.toString();
                    Intrinsics.checkNotNullParameter(var1_1, var2_2);
                    var1_1 = JioAds.Companion;
                    var1_1 = var1_1.getInstance();
                    var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 = JioAds$LogLevel.NONE;
                    if (var9_30 == null) return;
                    ** continue;
                }
            }
            var1_1.disconnect();
            return;
        }
        if (var9_30 == null) throw var2_5;
        var9_30.disconnect();
        throw var2_5;
    }
}

