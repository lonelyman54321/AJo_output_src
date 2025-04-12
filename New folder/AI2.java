/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;

public final class AI2
implements Deferred$DeferredHandler {
    public final /* synthetic */ CrashlyticsRemoteConfigListener a;

    public /* synthetic */ AI2(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener) {
        this.a = crashlyticsRemoteConfigListener;
    }

    public final void handle(Provider provider) {
        RemoteConfigDeferredProxy.a(this.a, provider);
    }
}

