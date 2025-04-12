/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;

public final class Ed0
implements Deferred$DeferredHandler {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ StaticSessionData d;

    public /* synthetic */ Ed0(String string2, String string3, long l2, StaticSessionData staticSessionData) {
        this.a = string2;
        this.b = string3;
        this.c = l2;
        this.d = staticSessionData;
    }

    public final void handle(Provider provider) {
        long l2 = this.c;
        StaticSessionData staticSessionData = this.d;
        String string2 = this.a;
        String string3 = this.b;
        CrashlyticsNativeComponentDeferredProxy.a(string2, string3, l2, staticSessionData, provider);
    }
}

