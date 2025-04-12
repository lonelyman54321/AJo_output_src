/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.webkit.WebView
 */
package com.affise.attribution;

import android.app.Application;
import android.webkit.WebView;
import com.affise.attribution.Affise$Module;
import com.affise.attribution.AffiseApi;
import com.affise.attribution.AffiseComponent;
import com.affise.attribution.deeplink.DeeplinkManagerImpl;
import com.affise.attribution.deeplink.OnDeeplinkCallback;
import com.affise.attribution.events.Event;
import com.affise.attribution.events.EventsManager;
import com.affise.attribution.events.OnSendFailedCallback;
import com.affise.attribution.events.OnSendSuccessCallback;
import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.internal.InternalEvent;
import com.affise.attribution.modules.AffiseModules;
import com.affise.attribution.modules.OnKeyValueCallback;
import com.affise.attribution.parameters.base.Provider;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import com.affise.attribution.parameters.providers.AffiseDeviceIdProvider;
import com.affise.attribution.parameters.providers.RandomUserIdProvider;
import com.affise.attribution.referrer.OnReferrerCallback;
import com.affise.attribution.referrer.ReferrerKey;
import com.affise.attribution.referrer.RetrieveReferrerOnServerUseCase;
import com.affise.attribution.settings.AffiseSettings;
import com.affise.attribution.usecase.FirstAppOpenUseCase;
import com.affise.attribution.usecase.PreferencesUseCaseImpl;
import com.affise.attribution.usecase.SendGDPREventUseCaseImpl;
import com.affise.attribution.usecase.StoreInstallReferrerUseCase;
import com.affise.attribution.webBridge.WebBridgeManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class Affise {
    public static final Affise INSTANCE;
    private static AffiseApi api;

    static {
        Affise affise;
        INSTANCE = affise = new Affise();
    }

    private Affise() {
    }

    public static final /* synthetic */ AffiseApi access$getApi$p() {
        return api;
    }

    public static final void addPushToken(String string2) {
        Intrinsics.checkNotNullParameter(string2, "pushToken");
        AffiseApi affiseApi = api;
        if (affiseApi != null && (affiseApi = affiseApi.getSharedPreferences()) != null && (affiseApi = affiseApi.edit()) != null) {
            String string3 = "com.affise.attribution.init.PUSHTOKEN";
            affiseApi.putString(string3, string2);
            affiseApi.commit();
        }
    }

    public static final void crashApplication() {
        Object object = api;
        if (object != null && (object = object.getCrashApplicationUseCase()) != null) {
            object.crash();
        }
    }

    public static final void forget(String string2) {
        Intrinsics.checkNotNullParameter(string2, "userData");
        Object object = api;
        if (object != null && (object = object.getSendGDPREventUseCase()) != null) {
            ((SendGDPREventUseCaseImpl)object).registerForgetMeEvent(string2);
        }
    }

    public static final List getModulesInstalled() {
        return Affise$Module.getModulesInstalled();
    }

    public static final Map getProviders() {
        Object object = api;
        if (object == null || (object = object.getPostBackModelFactory()) == null || (object = ((PostBackModelFactory)object).getProvidersMap()) == null) {
            object = fh1_2.f();
        }
        return object;
    }

    public static final String getRandomDeviceId() {
        Iterator iterator = api;
        Object object = null;
        if (iterator != null && (iterator = iterator.getPostBackModelFactory()) != null) {
            Object object2;
            boolean bl2;
            block4: {
                iterator = ((Iterable)((PostBackModelFactory)((Object)iterator)).getAllProviders()).iterator();
                while (bl2 = iterator.hasNext()) {
                    object2 = iterator.next();
                    Object object3 = object2;
                    object3 = (Provider)object2;
                    boolean bl3 = object3 instanceof AffiseDeviceIdProvider;
                    if (!bl3) continue;
                    break block4;
                }
                bl2 = false;
                object2 = null;
            }
            boolean bl4 = object2 instanceof AffiseDeviceIdProvider;
            if (!bl4) {
                bl2 = false;
                object2 = null;
            }
            if ((object2 = (AffiseDeviceIdProvider)object2) != null) {
                object = ((AffiseDeviceIdProvider)object2).provide();
            }
        }
        return (String)object;
    }

    public static final String getRandomUserId() {
        Iterator iterator = api;
        Object object = null;
        if (iterator != null && (iterator = iterator.getPostBackModelFactory()) != null) {
            Object object2;
            boolean bl2;
            block4: {
                iterator = ((Iterable)((PostBackModelFactory)((Object)iterator)).getAllProviders()).iterator();
                while (bl2 = iterator.hasNext()) {
                    object2 = iterator.next();
                    Object object3 = object2;
                    object3 = (Provider)object2;
                    boolean bl3 = object3 instanceof RandomUserIdProvider;
                    if (!bl3) continue;
                    break block4;
                }
                bl2 = false;
                object2 = null;
            }
            boolean bl4 = object2 instanceof RandomUserIdProvider;
            if (!bl4) {
                bl2 = false;
                object2 = null;
            }
            if ((object2 = (RandomUserIdProvider)object2) != null) {
                object = ((RandomUserIdProvider)object2).provide();
            }
        }
        return (String)object;
    }

    public static final void getReferrer(OnReferrerCallback onReferrerCallback) {
        Affise.getReferrerUrl(onReferrerCallback);
    }

    public static final void getReferrerOnServer(OnReferrerCallback onReferrerCallback) {
        Object object = api;
        if (object != null && (object = object.getRetrieveReferrerOnServerUseCase()) != null) {
            ((RetrieveReferrerOnServerUseCase)object).getReferrerOnServer(onReferrerCallback);
        }
    }

    public static final void getReferrerOnServerValue(ReferrerKey referrerKey, OnReferrerCallback onReferrerCallback) {
        Intrinsics.checkNotNullParameter((Object)referrerKey, "key");
        Object object = api;
        if (object != null && (object = object.getRetrieveReferrerOnServerUseCase()) != null) {
            ((RetrieveReferrerOnServerUseCase)object).getReferrerOnServerValue(referrerKey, onReferrerCallback);
        }
    }

    public static final void getReferrerUrl(OnReferrerCallback onReferrerCallback) {
        Object object = api;
        if (object != null && (object = object.getStoreInstallReferrerUseCase()) != null) {
            ((StoreInstallReferrerUseCase)object).getReferrer(onReferrerCallback);
        }
    }

    public static final void getReferrerUrlValue(ReferrerKey referrerKey, OnReferrerCallback onReferrerCallback) {
        Intrinsics.checkNotNullParameter((Object)referrerKey, "key");
        Object object = api;
        if (object != null && (object = object.getStoreInstallReferrerUseCase()) != null) {
            ((StoreInstallReferrerUseCase)object).getReferrerValue(referrerKey, onReferrerCallback);
        }
    }

    public static final void getReferrerValue(ReferrerKey referrerKey, OnReferrerCallback onReferrerCallback) {
        Intrinsics.checkNotNullParameter((Object)referrerKey, "key");
        Affise.getReferrerUrlValue(referrerKey, onReferrerCallback);
    }

    public static final void getStatus(AffiseModules affiseModules, OnKeyValueCallback onKeyValueCallback) {
        Intrinsics.checkNotNullParameter((Object)affiseModules, "module");
        Intrinsics.checkNotNullParameter(onKeyValueCallback, "onComplete");
        Affise$Module.getStatus(affiseModules, onKeyValueCallback);
    }

    public static final boolean isBackgroundTrackingEnabled() {
        boolean bl2;
        Object object = api;
        if (object != null && (object = object.getPreferencesUseCase()) != null) {
            bl2 = ((PreferencesUseCaseImpl)object).isBackgroundTrackingEnabled();
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static final boolean isFirstRun() {
        Object object = api;
        boolean bl2 = object != null && (object = object.getFirstAppOpenUseCase()) != null ? ((FirstAppOpenUseCase)object).isFirstRun() : true;
        return bl2;
    }

    public static final boolean isInitialized() {
        boolean bl2;
        AffiseApi affiseApi = api;
        if (affiseApi != null) {
            bl2 = affiseApi.isInitialized();
        } else {
            bl2 = false;
            affiseApi = null;
        }
        return bl2;
    }

    public static final boolean isOfflineModeEnabled() {
        boolean bl2;
        Object object = api;
        if (object != null && (object = object.getPreferencesUseCase()) != null) {
            bl2 = ((PreferencesUseCaseImpl)object).isOfflineModeEnabled();
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static final boolean isTrackingEnabled() {
        boolean bl2;
        Object object = api;
        if (object != null && (object = object.getPreferencesUseCase()) != null) {
            bl2 = ((PreferencesUseCaseImpl)object).isTrackingEnabled();
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static final boolean moduleStart(AffiseModules affiseModules) {
        Intrinsics.checkNotNullParameter((Object)affiseModules, "module");
        return Affise$Module.moduleStart(affiseModules);
    }

    public static final void registerDeeplinkCallback(OnDeeplinkCallback onDeeplinkCallback) {
        Intrinsics.checkNotNullParameter(onDeeplinkCallback, "callback");
        Object object = api;
        if (object != null && (object = object.getDeeplinkManager()) != null) {
            ((DeeplinkManagerImpl)object).setDeeplinkCallback(onDeeplinkCallback);
        }
    }

    public static final void registerWebView(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Object object = api;
        if (object != null && (object = object.getWebBridgeManager()) != null) {
            ((WebBridgeManager)object).registerWebView(webView);
        }
    }

    public static final void sendEvent$attribution_release(Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Object object = api;
        if (object != null && (object = object.getStoreEventUseCase()) != null) {
            object.storeEvent(event);
        }
    }

    public static final void sendEventNow$attribution_release(Event event, OnSendSuccessCallback onSendSuccessCallback, OnSendFailedCallback onSendFailedCallback) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(onSendSuccessCallback, "success");
        Intrinsics.checkNotNullParameter(onSendFailedCallback, "failed");
        Object object = api;
        if (object != null && (object = object.getImmediateSendToServerUseCase()) != null) {
            object.sendNow(event, onSendSuccessCallback, onSendFailedCallback);
        }
    }

    public static final void sendEvents$attribution_release() {
        Object object = api;
        if (object != null && (object = object.getEventsManager()) != null) {
            int n3 = 3;
            EventsManager.sendEvents$default((EventsManager)object, false, false, n3, null);
        }
    }

    public static final void sendInternalEvent$attribution_release(InternalEvent internalEvent) {
        Intrinsics.checkNotNullParameter(internalEvent, "event");
        Object object = api;
        if (object != null && (object = object.getStoreInternalEventUseCase()) != null) {
            object.storeInternalEvent(internalEvent);
        }
    }

    public static final void setBackgroundTrackingEnabled(boolean bl2) {
        Object object = api;
        if (object != null && (object = object.getPreferencesUseCase()) != null) {
            ((PreferencesUseCaseImpl)object).setBackgroundTrackingEnabled(bl2);
        }
    }

    public static final void setOfflineModeEnabled(boolean bl2) {
        Object object = api;
        if (object != null && (object = object.getPreferencesUseCase()) != null) {
            ((PreferencesUseCaseImpl)object).setOfflineModeEnabled(bl2);
        }
    }

    public static final void setSecretId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "secretKey");
        Object object = api;
        if (object != null && (object = object.getInitPropertiesStorage()) != null) {
            object.updateSecretKey(string2);
        }
    }

    public static final void setTrackingEnabled(boolean bl2) {
        Object object = api;
        if (object != null && (object = object.getPreferencesUseCase()) != null) {
            ((PreferencesUseCaseImpl)object).setTrackingEnabled(bl2);
        }
    }

    public static final AffiseSettings settings(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "affiseAppId");
        Intrinsics.checkNotNullParameter(string3, "secretKey");
        AffiseSettings affiseSettings = new AffiseSettings(string2, string3);
        return affiseSettings;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void start$attribution_release(AffiseInitProperties object, Application application) {
        Class<Affise> clazz = Affise.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        Object object2 = "initProperties";
                        try {
                            Intrinsics.checkNotNullParameter(object, (String)object2);
                            object2 = "app";
                            Intrinsics.checkNotNullParameter(application, (String)object2);
                            object2 = api;
                            if (object2 != null) break block3;
                            api = object2 = new AffiseComponent(application, (AffiseInitProperties)object);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = INSTANCE;
                    object.getClass();
                }
                return;
            }
            throw throwable2;
        }
    }

    public static final void unregisterWebView() {
        Object object = api;
        if (object != null && (object = object.getWebBridgeManager()) != null) {
            ((WebBridgeManager)object).unregisterWebView();
        }
    }

    public final AffiseApi getApi$attribution_release() {
        return api;
    }
}

