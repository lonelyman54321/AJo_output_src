/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.common.moduleinstall.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RegistrationMethods$Builder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.moduleinstall.internal.zaab;
import com.google.android.gms.common.moduleinstall.internal.zai;
import com.google.android.gms.common.moduleinstall.internal.zaj;
import com.google.android.gms.common.moduleinstall.internal.zak;
import com.google.android.gms.common.moduleinstall.internal.zal;
import com.google.android.gms.common.moduleinstall.internal.zam;
import com.google.android.gms.common.moduleinstall.internal.zan;
import com.google.android.gms.common.moduleinstall.internal.zao;
import com.google.android.gms.common.moduleinstall.internal.zap;
import com.google.android.gms.common.moduleinstall.internal.zaq;
import com.google.android.gms.internal.base.zav;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zay
extends GoogleApi
implements ModuleInstallClient {
    public static final /* synthetic */ int zab;
    private static final Api$ClientKey zac;
    private static final Api$AbstractClientBuilder zad;
    private static final Api zae;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zac = api$ClientKey = new Api$ClientKey();
        zaq zaq2 = new zaq();
        zad = zaq2;
        zae = api = new Api("ModuleInstall.API", zaq2, api$ClientKey);
    }

    public zay(Activity activity) {
        Api api = zae;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(activity, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public zay(Context context) {
        Api api = zae;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public static final ApiFeatureRequest zad(boolean bl2, OptionalModuleApi ... optionalModuleApiArray) {
        OptionalModuleApi optionalModuleApi;
        boolean bl3;
        String string2 = "Requested APIs must not be null.";
        Preconditions.checkNotNull(optionalModuleApiArray, string2);
        int n3 = optionalModuleApiArray.length;
        int n4 = 0;
        if (n3 > 0) {
            bl3 = true;
        } else {
            bl3 = false;
            optionalModuleApi = null;
        }
        String string3 = "Please provide at least one OptionalModuleApi.";
        Preconditions.checkArgument(bl3, string3);
        while (n4 < n3) {
            optionalModuleApi = optionalModuleApiArray[n4];
            string3 = "Requested API must not be null.";
            Preconditions.checkNotNull(optionalModuleApi, string3);
            ++n4;
        }
        return ApiFeatureRequest.zaa(Arrays.asList(optionalModuleApiArray), bl2);
    }

    public final Task areModulesAvailable(OptionalModuleApi ... object) {
        Feature feature;
        boolean bl2 = true;
        Object object2 = ((ApiFeatureRequest)(object = zay.zad(false, (OptionalModuleApi[])object))).getApiFeatures();
        boolean bl3 = object2.isEmpty();
        if (bl3) {
            object = new ModuleAvailabilityResponse(bl2, 0);
            return Tasks.forResult(object);
        }
        object2 = TaskApiCall.builder();
        Object object3 = new Feature[bl2];
        object3[0] = feature = zav.zaa;
        ((TaskApiCall$Builder)object2).setFeatures((Feature)object3);
        ((TaskApiCall$Builder)object2).setMethodKey(27301);
        ((TaskApiCall$Builder)object2).setAutoResolveMissingFeatures(false);
        object3 = new zal(this, (ApiFeatureRequest)object);
        ((TaskApiCall$Builder)object2).run((RemoteCall)object3);
        object = ((TaskApiCall$Builder)object2).build();
        return this.doRead((TaskApiCall)object);
    }

    public final Task deferredInstall(OptionalModuleApi ... object) {
        zap zap2 = null;
        Object object2 = ((ApiFeatureRequest)(object = zay.zad(false, (OptionalModuleApi[])object))).getApiFeatures();
        boolean bl2 = object2.isEmpty();
        if (bl2) {
            object = Tasks.forResult(null);
        } else {
            object2 = TaskApiCall.builder();
            Feature feature = zav.zaa;
            Feature[] featureArray = new Feature[]{feature};
            ((TaskApiCall$Builder)object2).setFeatures(featureArray);
            int n3 = 27302;
            ((TaskApiCall$Builder)object2).setMethodKey(n3);
            ((TaskApiCall$Builder)object2).setAutoResolveMissingFeatures(false);
            zap2 = new zap(this, (ApiFeatureRequest)object);
            ((TaskApiCall$Builder)object2).run(zap2);
            object = ((TaskApiCall$Builder)object2).build();
            object = this.doRead((TaskApiCall)object);
        }
        return object;
    }

    public final Task getInstallModulesIntent(OptionalModuleApi ... object) {
        Feature feature;
        int n3 = 1;
        Object object2 = ((ApiFeatureRequest)(object = zay.zad(n3 != 0, (OptionalModuleApi[])object))).getApiFeatures();
        boolean bl2 = object2.isEmpty();
        if (bl2) {
            object = new ModuleInstallIntentResponse(null);
            return Tasks.forResult(object);
        }
        object2 = TaskApiCall.builder();
        Object object3 = new Feature[n3];
        object3[0] = feature = zav.zaa;
        ((TaskApiCall$Builder)object2).setFeatures((Feature)object3);
        ((TaskApiCall$Builder)object2).setMethodKey(27307);
        object3 = new zan(this, (ApiFeatureRequest)object);
        ((TaskApiCall$Builder)object2).run((RemoteCall)object3);
        object = ((TaskApiCall$Builder)object2).build();
        return this.doRead((TaskApiCall)object);
    }

    public final Task installModules(ModuleInstallRequest object) {
        boolean bl2 = true;
        ApiFeatureRequest apiFeatureRequest = ApiFeatureRequest.fromModuleInstallRequest((ModuleInstallRequest)object);
        InstallStatusListener installStatusListener = ((ModuleInstallRequest)object).getListener();
        object = ((ModuleInstallRequest)object).getListenerExecutor();
        Object object2 = apiFeatureRequest.getApiFeatures();
        boolean bl3 = object2.isEmpty();
        if (bl3) {
            object = new ModuleInstallResponse(0);
            object = Tasks.forResult(object);
        } else if (installStatusListener == null) {
            Feature object3;
            object = TaskApiCall.builder();
            object2 = new Feature[bl2];
            object2[0] = object3 = zav.zaa;
            ((TaskApiCall$Builder)object).setFeatures((Feature)object2);
            ((TaskApiCall$Builder)object).setAutoResolveMissingFeatures(bl2);
            int n3 = 27304;
            ((TaskApiCall$Builder)object).setMethodKey(n3);
            zao zak2 = new zao(this, apiFeatureRequest);
            ((TaskApiCall$Builder)object).run(zak2);
            object = ((TaskApiCall$Builder)object).build();
            object = this.doRead((TaskApiCall)object);
        } else {
            zai zai2;
            Preconditions.checkNotNull(installStatusListener);
            object2 = "InstallStatusListener";
            object = object == null ? this.registerListener(installStatusListener, (String)object2) : ListenerHolders.createListenerHolder((Object)installStatusListener, (Executor)object, (String)object2);
            zaab zaab2 = new zaab((ListenerHolder)object);
            AtomicReference atomicReference = new AtomicReference();
            object2 = zai2;
            Object object3 = this;
            Object object4 = atomicReference;
            zai2 = new zai(this, atomicReference, installStatusListener, apiFeatureRequest, zaab2);
            object2 = new zaj(this, zaab2);
            object3 = RegistrationMethods.builder();
            ((RegistrationMethods$Builder)object3).withHolder((ListenerHolder)object);
            object = new Feature[bl2];
            object[0] = object4 = zav.zaa;
            ((RegistrationMethods$Builder)object3).setFeatures((Feature[])object);
            ((RegistrationMethods$Builder)object3).setAutoResolveMissingFeatures(bl2);
            ((RegistrationMethods$Builder)object3).register(zai2);
            ((RegistrationMethods$Builder)object3).unregister((RemoteCall)object2);
            int n4 = 27305;
            ((RegistrationMethods$Builder)object3).setMethodKey(n4);
            object = ((RegistrationMethods$Builder)object3).build();
            object = this.doRegisterEventListener((RegistrationMethods)object);
            zak zak2 = new zak(atomicReference);
            object = ((Task)object).onSuccessTask(zak2);
        }
        return object;
    }

    public final Task releaseModules(OptionalModuleApi ... object) {
        zam zam2 = null;
        Object object2 = ((ApiFeatureRequest)(object = zay.zad(false, (OptionalModuleApi[])object))).getApiFeatures();
        boolean bl2 = object2.isEmpty();
        if (bl2) {
            object = Tasks.forResult(null);
        } else {
            object2 = TaskApiCall.builder();
            Feature feature = zav.zaa;
            Feature[] featureArray = new Feature[]{feature};
            ((TaskApiCall$Builder)object2).setFeatures(featureArray);
            int n3 = 27303;
            ((TaskApiCall$Builder)object2).setMethodKey(n3);
            ((TaskApiCall$Builder)object2).setAutoResolveMissingFeatures(false);
            zam2 = new zam(this, (ApiFeatureRequest)object);
            ((TaskApiCall$Builder)object2).run(zam2);
            object = ((TaskApiCall$Builder)object2).build();
            object = this.doRead((TaskApiCall)object);
        }
        return object;
    }

    public final Task unregisterListener(InstallStatusListener object) {
        object = ListenerHolders.createListenerKey(object, "InstallStatusListener");
        return this.doUnregisterEventListener((ListenerHolder$ListenerKey)object, 27306);
    }
}

