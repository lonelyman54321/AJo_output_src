/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 */
package com.appsflyer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFLogger$LogLevel;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerProperties$EmailsCryptType;
import com.appsflyer.PurchaseHandler$PurchaseValidationCallback;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.net.URI;
import java.util.Map;

public abstract class AppsFlyerLib {
    public static AppsFlyerLib getInstance() {
        return AFb1rSDK.getRevenue();
    }

    public abstract void addPushNotificationDeepLinkPath(String ... var1);

    public abstract void anonymizeUser(boolean var1);

    public abstract void appendParametersToDeepLinkingURL(String var1, Map var2);

    public abstract void enableFacebookDeferredApplinks(boolean var1);

    public abstract void enableTCFDataCollection(boolean var1);

    public abstract String getAppsFlyerUID(Context var1);

    public abstract String getAttributionId(Context var1);

    public abstract String getHostName();

    public abstract String getHostPrefix();

    public abstract String getOutOfStore(Context var1);

    public abstract String getSdkVersion();

    public abstract AppsFlyerLib init(String var1, AppsFlyerConversionListener var2, Context var3);

    public abstract boolean isPreInstalledApp(Context var1);

    public abstract boolean isStopped();

    public abstract void logAdRevenue(AFAdRevenueData var1, Map var2);

    public abstract void logEvent(Context var1, String var2, Map var3);

    public abstract void logEvent(Context var1, String var2, Map var3, AppsFlyerRequestListener var4);

    public abstract void logLocation(Context var1, double var2, double var4);

    public abstract void logSession(Context var1);

    public abstract void onPause(Context var1);

    public abstract void performOnAppAttribution(Context var1, URI var2);

    public abstract void performOnDeepLinking(Intent var1, Context var2);

    public abstract void registerConversionListener(Context var1, AppsFlyerConversionListener var2);

    public abstract void registerValidatorListener(Context var1, AppsFlyerInAppPurchaseValidatorListener var2);

    public abstract void sendInAppPurchaseData(Context var1, Map var2, PurchaseHandler.PurchaseValidationCallback var3);

    public abstract void sendPurchaseData(Context var1, Map var2, PurchaseHandler.PurchaseValidationCallback var3);

    public abstract void sendPushNotificationData(Activity var1);

    public abstract void setAdditionalData(Map var1);

    public abstract void setAndroidIdData(String var1);

    public abstract void setAppId(String var1);

    public abstract void setAppInviteOneLink(String var1);

    public abstract void setCollectAndroidID(boolean var1);

    public abstract void setCollectIMEI(boolean var1);

    public abstract void setCollectOaid(boolean var1);

    public abstract void setConsentData(AppsFlyerConsent var1);

    public abstract void setCurrencyCode(String var1);

    public abstract void setCustomerIdAndLogSession(String var1, Context var2);

    public abstract void setCustomerUserId(String var1);

    public abstract void setDebugLog(boolean var1);

    public abstract void setDisableAdvertisingIdentifiers(boolean var1);

    public abstract void setDisableNetworkData(boolean var1);

    public abstract void setExtension(String var1);

    public abstract void setHost(String var1, String var2);

    public abstract void setImeiData(String var1);

    public abstract void setIsUpdate(boolean var1);

    public abstract void setLogLevel(AFLogger$LogLevel var1);

    public abstract void setMinTimeBetweenSessions(int var1);

    public abstract void setOaidData(String var1);

    public abstract void setOneLinkCustomDomain(String ... var1);

    public abstract void setOutOfStore(String var1);

    public abstract void setPartnerData(String var1, Map var2);

    public abstract void setPhoneNumber(String var1);

    public abstract void setPluginInfo(PluginInfo var1);

    public abstract void setPreinstallAttribution(String var1, String var2, String var3);

    public abstract void setResolveDeepLinkURLs(String ... var1);

    public abstract void setSharingFilter(String ... var1);

    public abstract void setSharingFilterForAllPartners();

    public abstract void setSharingFilterForPartners(String ... var1);

    public abstract void setUserEmails(AppsFlyerProperties.EmailsCryptType var1, String ... var2);

    public abstract void setUserEmails(String ... var1);

    public abstract void start(Context var1);

    public abstract void start(Context var1, String var2);

    public abstract void start(Context var1, String var2, AppsFlyerRequestListener var3);

    public abstract void stop(boolean var1, Context var2);

    public abstract void subscribeForDeepLink(DeepLinkListener var1);

    public abstract void subscribeForDeepLink(DeepLinkListener var1, long var2);

    public abstract void unregisterConversionListener();

    public abstract void updateServerUninstallToken(Context var1, String var2);

    public abstract void validateAndLogInAppPurchase(Context var1, String var2, String var3, String var4, String var5, String var6, Map var7);

    public abstract void validateAndLogInAppPurchase(AFPurchaseDetails var1, Map var2, AppsFlyerInAppPurchaseValidationCallback var3);

    public abstract void waitForCustomerUserId(boolean var1);
}

