/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy$MissingNativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;
import java.util.concurrent.atomic.AtomicReference;

public final class CrashlyticsNativeComponentDeferredProxy
implements CrashlyticsNativeComponent {
    private static final NativeSessionFileProvider MISSING_NATIVE_SESSION_FILE_PROVIDER;
    private final AtomicReference availableNativeComponent;
    private final Deferred deferredNativeComponent;

    static {
        CrashlyticsNativeComponentDeferredProxy$MissingNativeSessionFileProvider crashlyticsNativeComponentDeferredProxy$MissingNativeSessionFileProvider = new CrashlyticsNativeComponentDeferredProxy$MissingNativeSessionFileProvider(null);
        MISSING_NATIVE_SESSION_FILE_PROVIDER = crashlyticsNativeComponentDeferredProxy$MissingNativeSessionFileProvider;
    }

    public CrashlyticsNativeComponentDeferredProxy(Deferred deferred) {
        Object object = new AtomicReference(null);
        this.availableNativeComponent = object;
        this.deferredNativeComponent = deferred;
        object = new Dd0(this);
        deferred.whenAvailable((Deferred$DeferredHandler)object);
    }

    public static /* synthetic */ void a(String string2, String string3, long l2, StaticSessionData staticSessionData, Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.lambda$prepareNativeSession$1(string2, string3, l2, staticSessionData, provider);
    }

    public static /* synthetic */ void b(CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy, Provider provider) {
        crashlyticsNativeComponentDeferredProxy.lambda$new$0(provider);
    }

    private /* synthetic */ void lambda$new$0(Provider object) {
        Logger.getLogger().d("Crashlytics native component now available.");
        AtomicReference atomicReference = this.availableNativeComponent;
        object = (CrashlyticsNativeComponent)object.get();
        atomicReference.set(object);
    }

    private static /* synthetic */ void lambda$prepareNativeSession$1(String string2, String string3, long l2, StaticSessionData staticSessionData, Provider object) {
        object = object.get();
        ((CrashlyticsNativeComponent)object).prepareNativeSession(string2, string3, l2, staticSessionData);
    }

    public NativeSessionFileProvider getSessionFileProvider(String object) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent)this.availableNativeComponent.get();
        object = crashlyticsNativeComponent == null ? MISSING_NATIVE_SESSION_FILE_PROVIDER : crashlyticsNativeComponent.getSessionFileProvider((String)object);
        return object;
    }

    public boolean hasCrashDataForCurrentSession() {
        boolean bl2;
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent)this.availableNativeComponent.get();
        if (crashlyticsNativeComponent != null && (bl2 = crashlyticsNativeComponent.hasCrashDataForCurrentSession())) {
            bl2 = true;
        } else {
            bl2 = false;
            crashlyticsNativeComponent = null;
        }
        return bl2;
    }

    public boolean hasCrashDataForSession(String string2) {
        boolean bl2;
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent)this.availableNativeComponent.get();
        if (crashlyticsNativeComponent != null && (bl2 = crashlyticsNativeComponent.hasCrashDataForSession(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public void prepareNativeSession(String string2, String string3, long l2, StaticSessionData staticSessionData) {
        Ed0 ed0;
        Object object = Logger.getLogger();
        Object object2 = new StringBuilder("Deferring native open session: ");
        ((StringBuilder)object2).append(string2);
        object2 = ((StringBuilder)object2).toString();
        ((Logger)object).v((String)object2);
        object = this.deferredNativeComponent;
        object2 = ed0;
        ed0 = new Ed0(string2, string3, l2, staticSessionData);
        object.whenAvailable(ed0);
    }
}

