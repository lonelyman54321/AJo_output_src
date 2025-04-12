/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.affise.attribution;

import android.content.SharedPreferences;
import com.affise.attribution.debug.network.DebugNetworkUseCase;
import com.affise.attribution.debug.validate.DebugValidateUseCase;
import com.affise.attribution.deeplink.DeeplinkManagerImpl;
import com.affise.attribution.events.EventsManager;
import com.affise.attribution.events.StoreEventUseCase;
import com.affise.attribution.init.InitPropertiesStorage;
import com.affise.attribution.init.SetPropertiesWhenAppInitializedUseCase;
import com.affise.attribution.internal.StoreInternalEventUseCase;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.modules.AffiseModuleManager;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import com.affise.attribution.referrer.RetrieveReferrerOnServerUseCase;
import com.affise.attribution.session.SessionManager;
import com.affise.attribution.test.CrashApplicationUseCase;
import com.affise.attribution.usecase.EraseUserDataUseCaseImpl;
import com.affise.attribution.usecase.FirstAppOpenUseCase;
import com.affise.attribution.usecase.ImmediateSendToServerUseCase;
import com.affise.attribution.usecase.PreferencesUseCaseImpl;
import com.affise.attribution.usecase.SendGDPREventUseCaseImpl;
import com.affise.attribution.usecase.StoreInstallReferrerUseCase;
import com.affise.attribution.webBridge.WebBridgeManager;

public interface AffiseApi {
    public CrashApplicationUseCase getCrashApplicationUseCase();

    public DebugNetworkUseCase getDebugNetworkUseCase();

    public DebugValidateUseCase getDebugValidateUseCase();

    public DeeplinkManagerImpl getDeeplinkManager();

    public EraseUserDataUseCaseImpl getEraseUserDataUseCase();

    public EventsManager getEventsManager();

    public FirstAppOpenUseCase getFirstAppOpenUseCase();

    public ImmediateSendToServerUseCase getImmediateSendToServerUseCase();

    public InitPropertiesStorage getInitPropertiesStorage();

    public LogsManager getLogsManager();

    public AffiseModuleManager getModuleManager();

    public PostBackModelFactory getPostBackModelFactory();

    public PreferencesUseCaseImpl getPreferencesUseCase();

    public RetrieveReferrerOnServerUseCase getRetrieveReferrerOnServerUseCase();

    public SendGDPREventUseCaseImpl getSendGDPREventUseCase();

    public SessionManager getSessionManager();

    public SetPropertiesWhenAppInitializedUseCase getSetPropertiesWhenInitUseCase();

    public SharedPreferences getSharedPreferences();

    public StoreEventUseCase getStoreEventUseCase();

    public StoreInstallReferrerUseCase getStoreInstallReferrerUseCase();

    public StoreInternalEventUseCase getStoreInternalEventUseCase();

    public WebBridgeManager getWebBridgeManager();

    public boolean isInitialized();
}

