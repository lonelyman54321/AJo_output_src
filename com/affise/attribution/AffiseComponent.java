/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.SharedPreferences
 */
package com.affise.attribution;

import android.app.Application;
import android.content.SharedPreferences;
import com.affise.attribution.AffiseApi;
import com.affise.attribution.AffiseComponent$2;
import com.affise.attribution.AffiseComponent$Companion;
import com.affise.attribution.AffiseComponent$buildConfigPropertiesProvider$2;
import com.affise.attribution.AffiseComponent$converterToBase64$2;
import com.affise.attribution.AffiseComponent$crashApplicationUseCase$2;
import com.affise.attribution.AffiseComponent$deviceUseCase$2;
import com.affise.attribution.AffiseComponent$httpClient$2;
import com.affise.attribution.AffiseComponent$internalEventToSerializedEventConverter$2;
import com.affise.attribution.AffiseComponent$providersToJsonStringConverter$2;
import com.affise.attribution.AffiseComponent$remarketingUseCase$2;
import com.affise.attribution.AffiseComponent$stringToSHA1Converter$2;
import com.affise.attribution.AffiseComponent$stringToSHA256Converter$2;
import com.affise.attribution.build.BuildConfigPropertiesProvider;
import com.affise.attribution.converter.Converter;
import com.affise.attribution.converter.ConverterToBase64;
import com.affise.attribution.converter.PostBackModelToJsonStringConverter;
import com.affise.attribution.converter.ProvidersToJsonStringConverter;
import com.affise.attribution.converter.StringToMD5Converter;
import com.affise.attribution.converter.StringToSHA1Converter;
import com.affise.attribution.converter.StringToSHA256Converter;
import com.affise.attribution.debug.network.DebugNetworkUseCase;
import com.affise.attribution.debug.validate.DebugValidateUseCase;
import com.affise.attribution.deeplink.DeeplinkClickRepository;
import com.affise.attribution.deeplink.DeeplinkManagerImpl;
import com.affise.attribution.events.EventsManager;
import com.affise.attribution.events.EventsRepository;
import com.affise.attribution.events.GDPREventRepository;
import com.affise.attribution.events.IsFirstForUserUseCase;
import com.affise.attribution.events.StoreEventUseCase;
import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.init.InitPropertiesStorage;
import com.affise.attribution.init.SetPropertiesWhenAppInitializedUseCase;
import com.affise.attribution.internal.InternalEventsRepository;
import com.affise.attribution.internal.StoreInternalEventUseCase;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.logs.LogsRepository;
import com.affise.attribution.logs.StoreLogsUseCase;
import com.affise.attribution.metrics.MetricsRepository;
import com.affise.attribution.modules.AffiseModuleManager;
import com.affise.attribution.network.CloudRepository;
import com.affise.attribution.network.HttpClient;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import com.affise.attribution.parameters.providers.UserAgentProvider;
import com.affise.attribution.referrer.RetrieveReferrerOnServerUseCase;
import com.affise.attribution.session.CurrentActiveActivityCountProvider;
import com.affise.attribution.session.SessionManager;
import com.affise.attribution.storages.EventsStorage;
import com.affise.attribution.storages.InternalEventsStorage;
import com.affise.attribution.storages.IsFirstForUserStorage;
import com.affise.attribution.storages.LogsStorage;
import com.affise.attribution.storages.MetricsStorage;
import com.affise.attribution.test.CrashApplicationUseCase;
import com.affise.attribution.usecase.DeviceUseCase;
import com.affise.attribution.usecase.EraseUserDataUseCaseImpl;
import com.affise.attribution.usecase.FirstAppOpenUseCase;
import com.affise.attribution.usecase.GoogleInstallReferrerUseCase;
import com.affise.attribution.usecase.ImmediateSendToServerUseCase;
import com.affise.attribution.usecase.IndexUseCase;
import com.affise.attribution.usecase.PreferencesUseCaseImpl;
import com.affise.attribution.usecase.RemarketingUseCase;
import com.affise.attribution.usecase.SendDataToServerUseCase;
import com.affise.attribution.usecase.SendGDPREventUseCaseImpl;
import com.affise.attribution.usecase.StoreInstallReferrerUseCase;
import com.affise.attribution.usecase.StoreUseCase;
import com.affise.attribution.utils.ActivityActionsManager;
import com.affise.attribution.webBridge.WebBridgeManager;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseComponent
implements AffiseApi {
    public static final AffiseComponent$Companion Companion;
    private static final String PREFERENCES_FILE_NAME = "com.affise.attribution";
    private final rq1_2 activityActionsManager$delegate;
    private final rq1_2 activityCountProvider$delegate;
    private final Application app;
    private final rq1_2 buildConfigPropertiesProvider$delegate;
    private final rq1_2 cloudRepository$delegate;
    private final rq1_2 converterToBase64$delegate;
    private final rq1_2 crashApplicationUseCase$delegate;
    private final rq1_2 debugNetworkUseCase$delegate;
    private final rq1_2 debugValidateUseCase$delegate;
    private final rq1_2 deeplinkManager$delegate;
    private final rq1_2 deviceUseCase$delegate;
    private final rq1_2 eraseUserDataUseCase$delegate;
    private final rq1_2 eventToSerializedEventConverter$delegate;
    private final rq1_2 eventsManager$delegate;
    private final rq1_2 eventsRepository$delegate;
    private final rq1_2 eventsStorage$delegate;
    private final rq1_2 firstAppOpenUseCase$delegate;
    private final rq1_2 gdprEventRepository$delegate;
    private final rq1_2 googleInstallReferrerUseCase$delegate;
    private final rq1_2 httpClient$delegate;
    private final rq1_2 immediateSendToServerUseCase$delegate;
    private final rq1_2 indexUseCase$delegate;
    private final InitPropertiesStorage initPropertiesStorage;
    private final rq1_2 internalEventToSerializedEventConverter$delegate;
    private final rq1_2 internalEventsRepository$delegate;
    private final rq1_2 internalEventsStorage$delegate;
    private final DeeplinkClickRepository isDeeplinkClickRepository;
    private final rq1_2 isFirstForUserStorage$delegate;
    private final rq1_2 isFirstForUserUseCase$delegate;
    private boolean isReady;
    private final rq1_2 logStorage$delegate;
    private final rq1_2 logsManager$delegate;
    private final rq1_2 logsRepository$delegate;
    private final rq1_2 metricsRepository$delegate;
    private final rq1_2 metricsStorage$delegate;
    private final rq1_2 moduleManager$delegate;
    private final rq1_2 postBackModelFactory$delegate;
    private final rq1_2 postBackModelToJsonStringConverter$delegate;
    private final rq1_2 preferencesUseCase$delegate;
    private final rq1_2 providersToJsonStringConverter$delegate;
    private final rq1_2 remarketingUseCase$delegate;
    private final rq1_2 retrieveReferrerOnServerUseCase$delegate;
    private final rq1_2 sendDataToServerUseCase$delegate;
    private final rq1_2 sendGDPREventUseCase$delegate;
    private final rq1_2 sessionManager$delegate;
    private final rq1_2 setPropertiesWhenInitUseCase$delegate;
    private final rq1_2 sharedPreferences$delegate;
    private final rq1_2 storeEventUseCase$delegate;
    private final rq1_2 storeInstallReferrerUseCase$delegate;
    private final rq1_2 storeInternalEventUseCase$delegate;
    private final rq1_2 storeLogsUseCase$delegate;
    private final rq1_2 storeUseCase$delegate;
    private final rq1_2 stringToMD5Converter$delegate;
    private final rq1_2 stringToSHA1Converter$delegate;
    private final rq1_2 stringToSHA256Converter$delegate;
    private final rq1_2 userAgentProvider$delegate;
    private final rq1_2 webBridgeManager$delegate;

    static {
        AffiseComponent$Companion affiseComponent$Companion;
        Companion = affiseComponent$Companion = new AffiseComponent$Companion(null);
    }

    public AffiseComponent(Application object, AffiseInitProperties object2) {
        Intrinsics.checkNotNullParameter(object, "app");
        Intrinsics.checkNotNullParameter(object2, "initProperties");
        this.app = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.postBackModelFactory$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.stringToMD5Converter$delegate = object;
        object = yr1_2.b(AffiseComponent$stringToSHA1Converter$2.INSTANCE);
        this.stringToSHA1Converter$delegate = object;
        object = yr1_2.b(AffiseComponent$stringToSHA256Converter$2.INSTANCE);
        this.stringToSHA256Converter$delegate = object;
        object = yr1_2.b(AffiseComponent$converterToBase64$2.INSTANCE);
        this.converterToBase64$delegate = object;
        object = yr1_2.b(AffiseComponent$providersToJsonStringConverter$2.INSTANCE);
        this.providersToJsonStringConverter$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.postBackModelToJsonStringConverter$delegate = object;
        object = yr1_2.b(AffiseComponent$buildConfigPropertiesProvider$2.INSTANCE);
        this.buildConfigPropertiesProvider$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.indexUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.activityCountProvider$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.eventsStorage$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.internalEventsStorage$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.eventToSerializedEventConverter$delegate = object;
        object = yr1_2.b(AffiseComponent$internalEventToSerializedEventConverter$2.INSTANCE);
        this.internalEventToSerializedEventConverter$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.eventsRepository$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.internalEventsRepository$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.logStorage$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.logsRepository$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.metricsStorage$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.metricsRepository$delegate = object;
        object = yr1_2.b(AffiseComponent$crashApplicationUseCase$2.INSTANCE);
        this.crashApplicationUseCase$delegate = object;
        object = yr1_2.b(AffiseComponent$httpClient$2.INSTANCE);
        this.httpClient$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.userAgentProvider$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.cloudRepository$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.gdprEventRepository$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.sendDataToServerUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.immediateSendToServerUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.storeLogsUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.isFirstForUserStorage$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.isFirstForUserUseCase$delegate = object;
        object = yr1_2.b(AffiseComponent$deviceUseCase$2.INSTANCE);
        this.deviceUseCase$delegate = object;
        object = yr1_2.b(AffiseComponent$remarketingUseCase$2.INSTANCE);
        this.remarketingUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.setPropertiesWhenInitUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.firstAppOpenUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.storeEventUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.storeInternalEventUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.googleInstallReferrerUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.storeInstallReferrerUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.retrieveReferrerOnServerUseCase$delegate = object;
        super();
        this.initPropertiesStorage = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.preferencesUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.eraseUserDataUseCase$delegate = object;
        super();
        this.isDeeplinkClickRepository = object;
        super(this, (AffiseInitProperties)object2);
        object = yr1_2.b((Function0)object);
        this.activityActionsManager$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.storeUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.sharedPreferences$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.logsManager$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.sessionManager$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.eventsManager$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.webBridgeManager$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.deeplinkManager$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.sendGDPREventUseCase$delegate = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.moduleManager$delegate = object;
        super(this, (AffiseInitProperties)object2);
        object = yr1_2.b((Function0)object);
        this.debugValidateUseCase$delegate = object;
        super((AffiseInitProperties)object2, this);
        object = yr1_2.b((Function0)object);
        this.debugNetworkUseCase$delegate = object;
        this.getSendGDPREventUseCase().sendForgetMeEvent();
        this.getFirstAppOpenUseCase().onAppCreated();
        this.getSessionManager().init();
        this.getSetPropertiesWhenInitUseCase().init((AffiseInitProperties)object2);
        this.getDeeplinkManager().init();
        object2 = Thread.getDefaultUncaughtExceptionHandler();
        Object object3 = this.getLogsManager();
        super((Thread.UncaughtExceptionHandler)object2, (LogsManager)object3);
        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)object);
        object = this.getModuleManager();
        object2 = this.getBuildConfigPropertiesProvider();
        object3 = this.getStringToMD5Converter();
        StringToSHA1Converter stringToSHA1Converter2 = this.getStringToSHA1Converter();
        ProvidersToJsonStringConverter providersToJsonStringConverter2 = this.getProvidersToJsonStringConverter();
        HttpClient httpClient2 = this.getHttpClient();
        PostBackModelFactory postBackModelFactory2 = this.getPostBackModelFactory();
        PostBackModelToJsonStringConverter postBackModelToJsonStringConverter2 = this.getPostBackModelToJsonStringConverter();
        SharedPreferences sharedPreferences2 = this.getSharedPreferences();
        Object[] objectArray = new Object[8];
        objectArray[0] = object2;
        int n3 = 1;
        objectArray[n3] = object3;
        objectArray[2] = stringToSHA1Converter2;
        objectArray[3] = providersToJsonStringConverter2;
        objectArray[4] = httpClient2;
        objectArray[5] = postBackModelFactory2;
        objectArray[6] = postBackModelToJsonStringConverter2;
        objectArray[7] = sharedPreferences2;
        object3 = xx_2.i(objectArray);
        ((AffiseModuleManager)object).init((List)object3);
        object = this.getStoreInstallReferrerUseCase();
        object3 = new AffiseComponent$2(this);
        object = ((StoreInstallReferrerUseCase)object).onReferrerSetupFinished((Function0)object3);
        object3 = this.getModuleManager();
        ((StoreInstallReferrerUseCase)object).init((AffiseModuleManager)object3);
        this.isReady = n3;
    }

    public static final /* synthetic */ ActivityActionsManager access$getActivityActionsManager(AffiseComponent affiseComponent) {
        return affiseComponent.getActivityActionsManager();
    }

    public static final /* synthetic */ CurrentActiveActivityCountProvider access$getActivityCountProvider(AffiseComponent affiseComponent) {
        return affiseComponent.getActivityCountProvider();
    }

    public static final /* synthetic */ Application access$getApp$p(AffiseComponent affiseComponent) {
        return affiseComponent.app;
    }

    public static final /* synthetic */ BuildConfigPropertiesProvider access$getBuildConfigPropertiesProvider(AffiseComponent affiseComponent) {
        return affiseComponent.getBuildConfigPropertiesProvider();
    }

    public static final /* synthetic */ CloudRepository access$getCloudRepository(AffiseComponent affiseComponent) {
        return affiseComponent.getCloudRepository();
    }

    public static final /* synthetic */ ConverterToBase64 access$getConverterToBase64(AffiseComponent affiseComponent) {
        return affiseComponent.getConverterToBase64();
    }

    public static final /* synthetic */ DeviceUseCase access$getDeviceUseCase(AffiseComponent affiseComponent) {
        return affiseComponent.getDeviceUseCase();
    }

    public static final /* synthetic */ Converter access$getEventToSerializedEventConverter(AffiseComponent affiseComponent) {
        return affiseComponent.getEventToSerializedEventConverter();
    }

    public static final /* synthetic */ EventsRepository access$getEventsRepository(AffiseComponent affiseComponent) {
        return affiseComponent.getEventsRepository();
    }

    public static final /* synthetic */ EventsStorage access$getEventsStorage(AffiseComponent affiseComponent) {
        return affiseComponent.getEventsStorage();
    }

    public static final /* synthetic */ GDPREventRepository access$getGdprEventRepository(AffiseComponent affiseComponent) {
        return affiseComponent.getGdprEventRepository();
    }

    public static final /* synthetic */ GoogleInstallReferrerUseCase access$getGoogleInstallReferrerUseCase(AffiseComponent affiseComponent) {
        return affiseComponent.getGoogleInstallReferrerUseCase();
    }

    public static final /* synthetic */ HttpClient access$getHttpClient(AffiseComponent affiseComponent) {
        return affiseComponent.getHttpClient();
    }

    public static final /* synthetic */ IndexUseCase access$getIndexUseCase(AffiseComponent affiseComponent) {
        return affiseComponent.getIndexUseCase();
    }

    public static final /* synthetic */ Converter access$getInternalEventToSerializedEventConverter(AffiseComponent affiseComponent) {
        return affiseComponent.getInternalEventToSerializedEventConverter();
    }

    public static final /* synthetic */ InternalEventsRepository access$getInternalEventsRepository(AffiseComponent affiseComponent) {
        return affiseComponent.getInternalEventsRepository();
    }

    public static final /* synthetic */ InternalEventsStorage access$getInternalEventsStorage(AffiseComponent affiseComponent) {
        return affiseComponent.getInternalEventsStorage();
    }

    public static final /* synthetic */ LogsStorage access$getLogStorage(AffiseComponent affiseComponent) {
        return affiseComponent.getLogStorage();
    }

    public static final /* synthetic */ LogsRepository access$getLogsRepository(AffiseComponent affiseComponent) {
        return affiseComponent.getLogsRepository();
    }

    public static final /* synthetic */ MetricsRepository access$getMetricsRepository(AffiseComponent affiseComponent) {
        return affiseComponent.getMetricsRepository();
    }

    public static final /* synthetic */ MetricsStorage access$getMetricsStorage(AffiseComponent affiseComponent) {
        return affiseComponent.getMetricsStorage();
    }

    public static final /* synthetic */ PostBackModelToJsonStringConverter access$getPostBackModelToJsonStringConverter(AffiseComponent affiseComponent) {
        return affiseComponent.getPostBackModelToJsonStringConverter();
    }

    public static final /* synthetic */ ProvidersToJsonStringConverter access$getProvidersToJsonStringConverter(AffiseComponent affiseComponent) {
        return affiseComponent.getProvidersToJsonStringConverter();
    }

    public static final /* synthetic */ RemarketingUseCase access$getRemarketingUseCase(AffiseComponent affiseComponent) {
        return affiseComponent.getRemarketingUseCase();
    }

    public static final /* synthetic */ SendDataToServerUseCase access$getSendDataToServerUseCase(AffiseComponent affiseComponent) {
        return affiseComponent.getSendDataToServerUseCase();
    }

    public static final /* synthetic */ StoreLogsUseCase access$getStoreLogsUseCase(AffiseComponent affiseComponent) {
        return affiseComponent.getStoreLogsUseCase();
    }

    public static final /* synthetic */ StoreUseCase access$getStoreUseCase(AffiseComponent affiseComponent) {
        return affiseComponent.getStoreUseCase();
    }

    public static final /* synthetic */ StringToMD5Converter access$getStringToMD5Converter(AffiseComponent affiseComponent) {
        return affiseComponent.getStringToMD5Converter();
    }

    public static final /* synthetic */ StringToSHA256Converter access$getStringToSHA256Converter(AffiseComponent affiseComponent) {
        return affiseComponent.getStringToSHA256Converter();
    }

    public static final /* synthetic */ UserAgentProvider access$getUserAgentProvider(AffiseComponent affiseComponent) {
        return affiseComponent.getUserAgentProvider();
    }

    public static final /* synthetic */ DeeplinkClickRepository access$isDeeplinkClickRepository$p(AffiseComponent affiseComponent) {
        return affiseComponent.isDeeplinkClickRepository;
    }

    public static final /* synthetic */ IsFirstForUserStorage access$isFirstForUserStorage(AffiseComponent affiseComponent) {
        return affiseComponent.isFirstForUserStorage();
    }

    public static final /* synthetic */ IsFirstForUserUseCase access$isFirstForUserUseCase(AffiseComponent affiseComponent) {
        return affiseComponent.isFirstForUserUseCase();
    }

    private final ActivityActionsManager getActivityActionsManager() {
        return (ActivityActionsManager)this.activityActionsManager$delegate.getValue();
    }

    private final CurrentActiveActivityCountProvider getActivityCountProvider() {
        return (CurrentActiveActivityCountProvider)this.activityCountProvider$delegate.getValue();
    }

    private final BuildConfigPropertiesProvider getBuildConfigPropertiesProvider() {
        return (BuildConfigPropertiesProvider)this.buildConfigPropertiesProvider$delegate.getValue();
    }

    private final CloudRepository getCloudRepository() {
        return (CloudRepository)this.cloudRepository$delegate.getValue();
    }

    private final ConverterToBase64 getConverterToBase64() {
        return (ConverterToBase64)this.converterToBase64$delegate.getValue();
    }

    private final DeviceUseCase getDeviceUseCase() {
        return (DeviceUseCase)this.deviceUseCase$delegate.getValue();
    }

    private final Converter getEventToSerializedEventConverter() {
        return (Converter)this.eventToSerializedEventConverter$delegate.getValue();
    }

    private final EventsRepository getEventsRepository() {
        return (EventsRepository)this.eventsRepository$delegate.getValue();
    }

    private final EventsStorage getEventsStorage() {
        return (EventsStorage)this.eventsStorage$delegate.getValue();
    }

    private final GDPREventRepository getGdprEventRepository() {
        return (GDPREventRepository)this.gdprEventRepository$delegate.getValue();
    }

    private final GoogleInstallReferrerUseCase getGoogleInstallReferrerUseCase() {
        return (GoogleInstallReferrerUseCase)this.googleInstallReferrerUseCase$delegate.getValue();
    }

    private final HttpClient getHttpClient() {
        return (HttpClient)this.httpClient$delegate.getValue();
    }

    private final IndexUseCase getIndexUseCase() {
        return (IndexUseCase)this.indexUseCase$delegate.getValue();
    }

    private final Converter getInternalEventToSerializedEventConverter() {
        return (Converter)this.internalEventToSerializedEventConverter$delegate.getValue();
    }

    private final InternalEventsRepository getInternalEventsRepository() {
        return (InternalEventsRepository)this.internalEventsRepository$delegate.getValue();
    }

    private final InternalEventsStorage getInternalEventsStorage() {
        return (InternalEventsStorage)this.internalEventsStorage$delegate.getValue();
    }

    private final LogsStorage getLogStorage() {
        return (LogsStorage)this.logStorage$delegate.getValue();
    }

    private final LogsRepository getLogsRepository() {
        return (LogsRepository)this.logsRepository$delegate.getValue();
    }

    private final MetricsRepository getMetricsRepository() {
        return (MetricsRepository)this.metricsRepository$delegate.getValue();
    }

    private final MetricsStorage getMetricsStorage() {
        return (MetricsStorage)this.metricsStorage$delegate.getValue();
    }

    private final PostBackModelToJsonStringConverter getPostBackModelToJsonStringConverter() {
        return (PostBackModelToJsonStringConverter)this.postBackModelToJsonStringConverter$delegate.getValue();
    }

    private final ProvidersToJsonStringConverter getProvidersToJsonStringConverter() {
        return (ProvidersToJsonStringConverter)this.providersToJsonStringConverter$delegate.getValue();
    }

    private final RemarketingUseCase getRemarketingUseCase() {
        return (RemarketingUseCase)this.remarketingUseCase$delegate.getValue();
    }

    private final SendDataToServerUseCase getSendDataToServerUseCase() {
        return (SendDataToServerUseCase)this.sendDataToServerUseCase$delegate.getValue();
    }

    private final StoreLogsUseCase getStoreLogsUseCase() {
        return (StoreLogsUseCase)this.storeLogsUseCase$delegate.getValue();
    }

    private final StoreUseCase getStoreUseCase() {
        return (StoreUseCase)this.storeUseCase$delegate.getValue();
    }

    private final StringToMD5Converter getStringToMD5Converter() {
        return (StringToMD5Converter)this.stringToMD5Converter$delegate.getValue();
    }

    private final StringToSHA1Converter getStringToSHA1Converter() {
        return (StringToSHA1Converter)this.stringToSHA1Converter$delegate.getValue();
    }

    private final StringToSHA256Converter getStringToSHA256Converter() {
        return (StringToSHA256Converter)this.stringToSHA256Converter$delegate.getValue();
    }

    private final UserAgentProvider getUserAgentProvider() {
        return (UserAgentProvider)this.userAgentProvider$delegate.getValue();
    }

    private final IsFirstForUserStorage isFirstForUserStorage() {
        return (IsFirstForUserStorage)this.isFirstForUserStorage$delegate.getValue();
    }

    private final IsFirstForUserUseCase isFirstForUserUseCase() {
        return (IsFirstForUserUseCase)this.isFirstForUserUseCase$delegate.getValue();
    }

    public CrashApplicationUseCase getCrashApplicationUseCase() {
        return (CrashApplicationUseCase)this.crashApplicationUseCase$delegate.getValue();
    }

    public DebugNetworkUseCase getDebugNetworkUseCase() {
        return (DebugNetworkUseCase)this.debugNetworkUseCase$delegate.getValue();
    }

    public DebugValidateUseCase getDebugValidateUseCase() {
        return (DebugValidateUseCase)this.debugValidateUseCase$delegate.getValue();
    }

    public DeeplinkManagerImpl getDeeplinkManager() {
        return (DeeplinkManagerImpl)this.deeplinkManager$delegate.getValue();
    }

    public EraseUserDataUseCaseImpl getEraseUserDataUseCase() {
        return (EraseUserDataUseCaseImpl)this.eraseUserDataUseCase$delegate.getValue();
    }

    public EventsManager getEventsManager() {
        return (EventsManager)this.eventsManager$delegate.getValue();
    }

    public FirstAppOpenUseCase getFirstAppOpenUseCase() {
        return (FirstAppOpenUseCase)this.firstAppOpenUseCase$delegate.getValue();
    }

    public ImmediateSendToServerUseCase getImmediateSendToServerUseCase() {
        return (ImmediateSendToServerUseCase)this.immediateSendToServerUseCase$delegate.getValue();
    }

    public InitPropertiesStorage getInitPropertiesStorage() {
        return this.initPropertiesStorage;
    }

    public LogsManager getLogsManager() {
        return (LogsManager)this.logsManager$delegate.getValue();
    }

    public AffiseModuleManager getModuleManager() {
        return (AffiseModuleManager)this.moduleManager$delegate.getValue();
    }

    public PostBackModelFactory getPostBackModelFactory() {
        return (PostBackModelFactory)this.postBackModelFactory$delegate.getValue();
    }

    public PreferencesUseCaseImpl getPreferencesUseCase() {
        return (PreferencesUseCaseImpl)this.preferencesUseCase$delegate.getValue();
    }

    public RetrieveReferrerOnServerUseCase getRetrieveReferrerOnServerUseCase() {
        return (RetrieveReferrerOnServerUseCase)this.retrieveReferrerOnServerUseCase$delegate.getValue();
    }

    public SendGDPREventUseCaseImpl getSendGDPREventUseCase() {
        return (SendGDPREventUseCaseImpl)this.sendGDPREventUseCase$delegate.getValue();
    }

    public SessionManager getSessionManager() {
        return (SessionManager)this.sessionManager$delegate.getValue();
    }

    public SetPropertiesWhenAppInitializedUseCase getSetPropertiesWhenInitUseCase() {
        return (SetPropertiesWhenAppInitializedUseCase)this.setPropertiesWhenInitUseCase$delegate.getValue();
    }

    public SharedPreferences getSharedPreferences() {
        Object object = this.sharedPreferences$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "<get-sharedPreferences>(...)");
        return (SharedPreferences)object;
    }

    public StoreEventUseCase getStoreEventUseCase() {
        return (StoreEventUseCase)this.storeEventUseCase$delegate.getValue();
    }

    public StoreInstallReferrerUseCase getStoreInstallReferrerUseCase() {
        return (StoreInstallReferrerUseCase)this.storeInstallReferrerUseCase$delegate.getValue();
    }

    public StoreInternalEventUseCase getStoreInternalEventUseCase() {
        return (StoreInternalEventUseCase)this.storeInternalEventUseCase$delegate.getValue();
    }

    public WebBridgeManager getWebBridgeManager() {
        return (WebBridgeManager)this.webBridgeManager$delegate.getValue();
    }

    public boolean isInitialized() {
        return this.isReady;
    }
}

