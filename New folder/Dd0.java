/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;

public final class Dd0
implements Deferred$DeferredHandler {
    public final /* synthetic */ CrashlyticsNativeComponentDeferredProxy a;

    public /* synthetic */ Dd0(CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy) {
        this.a = crashlyticsNativeComponentDeferredProxy;
    }

    public final void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.b(this.a, provider);
    }
}

