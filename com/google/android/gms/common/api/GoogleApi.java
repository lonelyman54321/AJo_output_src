/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$HasAccountOptions;
import com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.GoogleApi$Settings$Builder;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.api.zad;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.ClientSettings$Builder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collection;
import java.util.Collections;

public abstract class GoogleApi
implements HasApiKey {
    protected final GoogleApiManager zaa;
    private final Context zab;
    private final String zac;
    private final Api zad;
    private final Api$ApiOptions zae;
    private final ApiKey zaf;
    private final Looper zag;
    private final int zah;
    private final GoogleApiClient zai;
    private final StatusExceptionMapper zaj;

    public GoogleApi(Activity activity, Api api, Api$ApiOptions api$ApiOptions, GoogleApi$Settings googleApi$Settings) {
        this((Context)activity, activity, api, api$ApiOptions, googleApi$Settings);
    }

    public GoogleApi(Activity activity, Api api, Api$ApiOptions api$ApiOptions, StatusExceptionMapper object) {
        GoogleApi$Settings$Builder googleApi$Settings$Builder = new GoogleApi$Settings$Builder();
        googleApi$Settings$Builder.setMapper((StatusExceptionMapper)object);
        object = activity.getMainLooper();
        googleApi$Settings$Builder.setLooper((Looper)object);
        object = googleApi$Settings$Builder.build();
        this(activity, api, api$ApiOptions, (GoogleApi$Settings)object);
    }

    private GoogleApi(Context object, Activity activity, Api object2, Api$ApiOptions object3, GoogleApi$Settings googleApi$Settings) {
        int n3;
        Preconditions.checkNotNull(object, "Null context is not permitted.");
        Preconditions.checkNotNull(object2, "Api must not be null.");
        Preconditions.checkNotNull(googleApi$Settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context = object.getApplicationContext();
        String string2 = "The provided context did not have an application context.";
        this.zab = context = (Context)Preconditions.checkNotNull(context, string2);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 30;
        object = n4 >= n7 ? o01.a(object) : this.getApiFallbackAttributionTag((Context)object);
        this.zac = object;
        this.zad = object2;
        this.zae = object3;
        string2 = googleApi$Settings.zab;
        this.zag = string2;
        object = ApiKey.getSharedApiKey((Api)object2, (Api$ApiOptions)object3, (String)object);
        this.zaf = object;
        this.zai = object2 = new zabv(this);
        this.zaa = object2 = GoogleApiManager.zak(context);
        this.zah = n3 = ((GoogleApiManager)object2).zaa();
        this.zaj = object3 = googleApi$Settings.zaa;
        if (activity != null && (n3 = activity instanceof GoogleApiActivity) == 0 && (object3 = Looper.myLooper()) == (googleApi$Settings = Looper.getMainLooper())) {
            zaae.zad(activity, (GoogleApiManager)object2, (ApiKey)object);
        }
        ((GoogleApiManager)object2).zaz(this);
    }

    public GoogleApi(Context context, Api api, Api$ApiOptions api$ApiOptions, Looper object, StatusExceptionMapper statusExceptionMapper) {
        GoogleApi$Settings$Builder googleApi$Settings$Builder = new GoogleApi$Settings$Builder();
        googleApi$Settings$Builder.setLooper((Looper)object);
        googleApi$Settings$Builder.setMapper(statusExceptionMapper);
        object = googleApi$Settings$Builder.build();
        this(context, api, api$ApiOptions, (GoogleApi$Settings)object);
    }

    public GoogleApi(Context context, Api api, Api$ApiOptions api$ApiOptions, GoogleApi$Settings googleApi$Settings) {
        this(context, null, api, api$ApiOptions, googleApi$Settings);
    }

    public GoogleApi(Context context, Api api, Api$ApiOptions api$ApiOptions, StatusExceptionMapper object) {
        GoogleApi$Settings$Builder googleApi$Settings$Builder = new GoogleApi$Settings$Builder();
        googleApi$Settings$Builder.setMapper((StatusExceptionMapper)object);
        object = googleApi$Settings$Builder.build();
        this(context, api, api$ApiOptions, (GoogleApi$Settings)object);
    }

    private final BaseImplementation$ApiMethodImpl zad(int n3, BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        baseImplementation$ApiMethodImpl.zak();
        this.zaa.zau(this, n3, baseImplementation$ApiMethodImpl);
        return baseImplementation$ApiMethodImpl;
    }

    private final Task zae(int n3, TaskApiCall taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        StatusExceptionMapper statusExceptionMapper = this.zaj;
        this.zaa.zav(this, n3, taskApiCall, taskCompletionSource, statusExceptionMapper);
        return taskCompletionSource.getTask();
    }

    public GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    public ClientSettings$Builder createClientSettingsBuilder() {
        ClientSettings$Builder clientSettings$Builder = new ClientSettings$Builder();
        Object object = this.zae;
        boolean bl2 = object instanceof Api$ApiOptions$HasGoogleSignInAccountOptions;
        object = bl2 && (object = ((Api$ApiOptions$HasGoogleSignInAccountOptions)object).getGoogleSignInAccount()) != null ? ((GoogleSignInAccount)object).getAccount() : ((bl2 = (object = this.zae) instanceof Api$ApiOptions$HasAccountOptions) ? ((Api$ApiOptions$HasAccountOptions)object).getAccount() : null);
        clientSettings$Builder.zab((Account)object);
        object = this.zae;
        bl2 = object instanceof Api$ApiOptions$HasGoogleSignInAccountOptions;
        object = bl2 ? ((object = ((Api$ApiOptions$HasGoogleSignInAccountOptions)object).getGoogleSignInAccount()) == null ? Collections.emptySet() : ((GoogleSignInAccount)object).getRequestedScopes()) : Collections.emptySet();
        clientSettings$Builder.zaa((Collection)object);
        object = this.zab.getClass().getName();
        clientSettings$Builder.zac((String)object);
        object = this.zab.getPackageName();
        clientSettings$Builder.setRealClientPackageName((String)object);
        return clientSettings$Builder;
    }

    public Task disconnectService() {
        return this.zaa.zan(this);
    }

    public BaseImplementation$ApiMethodImpl doBestEffortWrite(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        this.zad(2, baseImplementation$ApiMethodImpl);
        return baseImplementation$ApiMethodImpl;
    }

    public Task doBestEffortWrite(TaskApiCall taskApiCall) {
        return this.zae(2, taskApiCall);
    }

    public BaseImplementation$ApiMethodImpl doRead(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        this.zad(0, baseImplementation$ApiMethodImpl);
        return baseImplementation$ApiMethodImpl;
    }

    public Task doRead(TaskApiCall taskApiCall) {
        return this.zae(0, taskApiCall);
    }

    public Task doRegisterEventListener(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod) {
        Preconditions.checkNotNull(registerListenerMethod);
        Preconditions.checkNotNull(unregisterListenerMethod);
        Object object = registerListenerMethod.getListenerKey();
        Object object2 = "Listener has already been released.";
        Preconditions.checkNotNull(object, object2);
        Preconditions.checkNotNull(unregisterListenerMethod.getListenerKey(), object2);
        object = registerListenerMethod.getListenerKey();
        object2 = unregisterListenerMethod.getListenerKey();
        Preconditions.checkArgument(Objects.equal(object, object2), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        object = com.google.android.gms.common.api.zad.zaa;
        return this.zaa.zao(this, registerListenerMethod, unregisterListenerMethod, (Runnable)object);
    }

    public Task doRegisterEventListener(RegistrationMethods object) {
        Preconditions.checkNotNull(object);
        Object object2 = ((RegistrationMethods)object).register.getListenerKey();
        Object object3 = "Listener has already been released.";
        Preconditions.checkNotNull(object2, object3);
        Preconditions.checkNotNull(((RegistrationMethods)object).zaa.getListenerKey(), object3);
        object2 = ((RegistrationMethods)object).register;
        object3 = ((RegistrationMethods)object).zaa;
        object = ((RegistrationMethods)object).zab;
        return this.zaa.zao(this, (RegisterListenerMethod)object2, (UnregisterListenerMethod)object3, (Runnable)object);
    }

    public Task doUnregisterEventListener(ListenerHolder$ListenerKey listenerHolder$ListenerKey) {
        return this.doUnregisterEventListener(listenerHolder$ListenerKey, 0);
    }

    public Task doUnregisterEventListener(ListenerHolder$ListenerKey listenerHolder$ListenerKey, int n3) {
        Preconditions.checkNotNull(listenerHolder$ListenerKey, "Listener key cannot be null.");
        return this.zaa.zap(this, listenerHolder$ListenerKey, n3);
    }

    public BaseImplementation$ApiMethodImpl doWrite(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        this.zad(1, baseImplementation$ApiMethodImpl);
        return baseImplementation$ApiMethodImpl;
    }

    public Task doWrite(TaskApiCall taskApiCall) {
        return this.zae(1, taskApiCall);
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final ApiKey getApiKey() {
        return this.zaf;
    }

    public Api$ApiOptions getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public ListenerHolder registerListener(Object object, String string2) {
        Looper looper = this.zag;
        return ListenerHolders.createListenerHolder(object, looper, string2);
    }

    public final int zaa() {
        return this.zah;
    }

    public final Api$Client zab(Looper object, zabq object2) {
        boolean bl2;
        Object object3;
        ClientSettings clientSettings = this.createClientSettingsBuilder().build();
        Object object4 = object3 = Preconditions.checkNotNull(this.zad.zaa());
        object4 = (Api$AbstractClientBuilder)object3;
        Api$ApiOptions api$ApiOptions = this.zae;
        Context context = this.zab;
        object = ((Api$AbstractClientBuilder)object4).buildClient(context, (Looper)object, clientSettings, (Object)api$ApiOptions, (GoogleApiClient$ConnectionCallbacks)object2, (GoogleApiClient$OnConnectionFailedListener)object2);
        object2 = this.getContextAttributionTag();
        if (object2 != null && (bl2 = object instanceof BaseGmsClient)) {
            object3 = object;
            object3 = (BaseGmsClient)object;
            ((BaseGmsClient)object3).setAttributionTag((String)object2);
        }
        if (object2 != null && (bl2 = object instanceof NonGmsServiceBrokerClient)) {
            object3 = object;
            object3 = (NonGmsServiceBrokerClient)object;
            ((NonGmsServiceBrokerClient)object3).zac((String)object2);
        }
        return (Api$Client)object;
    }

    public final zact zac(Context context, Handler handler) {
        ClientSettings clientSettings = this.createClientSettingsBuilder().build();
        zact zact2 = new zact(context, handler, clientSettings);
        return zact2;
    }
}

