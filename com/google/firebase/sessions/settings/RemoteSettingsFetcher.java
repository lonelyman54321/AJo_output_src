/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri$Builder
 */
package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher$Companion;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2;
import java.net.URL;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RemoteSettingsFetcher
implements CrashlyticsSettingsFetcher {
    public static final RemoteSettingsFetcher$Companion Companion;
    private static final String FIREBASE_PLATFORM = "android";
    private static final String FIREBASE_SESSIONS_BASE_URL_STRING = "firebase-settings.crashlytics.com";
    private final ApplicationInfo appInfo;
    private final String baseUrl;
    private final CoroutineContext blockingDispatcher;

    static {
        RemoteSettingsFetcher$Companion remoteSettingsFetcher$Companion;
        Companion = remoteSettingsFetcher$Companion = new RemoteSettingsFetcher$Companion(null);
    }

    public RemoteSettingsFetcher(ApplicationInfo applicationInfo, CoroutineContext coroutineContext, String string2) {
        Intrinsics.checkNotNullParameter(applicationInfo, "appInfo");
        Intrinsics.checkNotNullParameter(coroutineContext, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(string2, "baseUrl");
        this.appInfo = applicationInfo;
        this.blockingDispatcher = coroutineContext;
        this.baseUrl = string2;
    }

    public /* synthetic */ RemoteSettingsFetcher(ApplicationInfo applicationInfo, CoroutineContext coroutineContext, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 4) != 0) {
            string2 = FIREBASE_SESSIONS_BASE_URL_STRING;
        }
        this(applicationInfo, coroutineContext, string2);
    }

    public static final /* synthetic */ URL access$settingsUrl(RemoteSettingsFetcher remoteSettingsFetcher) {
        return remoteSettingsFetcher.settingsUrl();
    }

    private final URL settingsUrl() {
        Object object = new Uri.Builder();
        object = object.scheme("https");
        Object object2 = this.baseUrl;
        object = object.authority((String)object2).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(FIREBASE_PLATFORM).appendPath("gmp");
        object2 = this.appInfo.getAppId();
        object = object.appendPath((String)object2).appendPath("settings");
        object2 = this.appInfo.getAndroidAppInfo().getAppBuildVersion();
        object = object.appendQueryParameter("build_version", (String)object2);
        object2 = this.appInfo.getAndroidAppInfo().getVersionName();
        object = object.appendQueryParameter("display_version", (String)object2);
        object = object.build().toString();
        object2 = new URL((String)object);
        return object2;
    }

    public Object doConfigFetch(Map object, Function2 object2, Function2 function2, f80_0 f80_02) {
        CoroutineContext coroutineContext = this.blockingDispatcher;
        RemoteSettingsFetcher$doConfigFetch$2 remoteSettingsFetcher$doConfigFetch$2 = new RemoteSettingsFetcher$doConfigFetch$2(this, (Map)object, (Function2)object2, function2, null);
        if ((object = Ae3.g(f80_02, coroutineContext, remoteSettingsFetcher$doConfigFetch$2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

