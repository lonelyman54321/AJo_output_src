/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.sessions.settings;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import com.google.firebase.sessions.SessionEvents;
import com.google.firebase.sessions.settings.LocalOverrideSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher;
import com.google.firebase.sessions.settings.SessionsSettings$Companion;
import com.google.firebase.sessions.settings.SessionsSettings$Companion$dataStore$2;
import com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1;
import com.google.firebase.sessions.settings.SettingsProvider;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import kotlin.time.b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class SessionsSettings {
    public static final SessionsSettings$Companion Companion;
    private static final String TAG = "SessionsSettings";
    private static final be2_2 dataStore$delegate;
    private final SettingsProvider localOverrideSettings;
    private final SettingsProvider remoteSettings;

    static {
        Object object = new SessionsSettings$Companion(null);
        Companion = object;
        object = SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME();
        SessionsSettings$Companion$dataStore$2 sessionsSettings$Companion$dataStore$2 = SessionsSettings$Companion$dataStore$2.INSTANCE;
        cj2_0 cj2_02 = new cj2_0(sessionsSettings$Companion$dataStore$2);
        dataStore$delegate = dy2.a((String)object, cj2_02);
    }

    private SessionsSettings(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo) {
        LocalOverrideSettings localOverrideSettings = new LocalOverrideSettings(context);
        RemoteSettingsFetcher remoteSettingsFetcher = new RemoteSettingsFetcher(applicationInfo, coroutineContext, null, 4, null);
        ui0 ui02 = SessionsSettings$Companion.access$getDataStore(Companion, context);
        RemoteSettings remoteSettings = new RemoteSettings(coroutineContext2, firebaseInstallationsApi, applicationInfo, remoteSettingsFetcher, ui02);
        this(localOverrideSettings, remoteSettings);
    }

    public SessionsSettings(FirebaseApp firebaseApp, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, FirebaseInstallationsApi firebaseInstallationsApi) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(coroutineContext, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(coroutineContext2, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Context context = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "firebaseApp.applicationContext");
        ApplicationInfo applicationInfo = SessionEvents.INSTANCE.getApplicationInfo(firebaseApp);
        this(context, coroutineContext, coroutineContext2, firebaseInstallationsApi, applicationInfo);
    }

    public SessionsSettings(SettingsProvider settingsProvider, SettingsProvider settingsProvider2) {
        Intrinsics.checkNotNullParameter(settingsProvider, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(settingsProvider2, "remoteSettings");
        this.localOverrideSettings = settingsProvider;
        this.remoteSettings = settingsProvider2;
    }

    public static final /* synthetic */ be2_2 access$getDataStore$delegate$cp() {
        return dataStore$delegate;
    }

    private final boolean isValidSamplingRate(double d2) {
        double d5;
        double d7 = 0.0;
        boolean bl2 = false;
        Object object = d7 == d2 ? 0 : (d7 < d2 ? -1 : 1);
        if (object <= 0 && (object = (d5 = d2 - (d7 = 1.0)) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1)) <= 0) {
            bl2 = true;
        }
        return bl2;
    }

    private final boolean isValidSessionRestartTimeout-LRDsOJo(long l2) {
        boolean bl2;
        block3: {
            block2: {
                long l3 = 0L;
                long l4 = l2 - l3;
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object <= 0) break block2;
                boolean bl3 = a.e(l2);
                bl2 = true;
                if (bl3 ^= bl2) break block3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final double getSamplingRate() {
        double d2;
        boolean bl2;
        Double d5 = this.localOverrideSettings.getSamplingRate();
        if (d5 != null && (bl2 = this.isValidSamplingRate(d2 = ((Number)d5).doubleValue()))) {
            return d2;
        }
        d5 = this.remoteSettings.getSamplingRate();
        if (d5 != null && (bl2 = this.isValidSamplingRate(d2 = ((Number)d5).doubleValue()))) {
            return d2;
        }
        return 1.0;
    }

    public final long getSessionRestartTimeout-UwyO8pc() {
        long l2;
        boolean bl2;
        Object object = this.localOverrideSettings.getSessionRestartTimeout-FghU774();
        if (object != null && (bl2 = this.isValidSessionRestartTimeout-LRDsOJo(l2 = ((a)object).a))) {
            return l2;
        }
        object = this.remoteSettings.getSessionRestartTimeout-FghU774();
        if (object != null && (bl2 = this.isValidSessionRestartTimeout-LRDsOJo(l2 = ((a)object).a))) {
            return l2;
        }
        object = a.b;
        aw0_1 aw0_12 = aw0_1.MINUTES;
        return b.f(30, aw0_12);
    }

    public final boolean getSessionsEnabled() {
        Boolean bl2 = this.localOverrideSettings.getSessionEnabled();
        if (bl2 != null) {
            return bl2;
        }
        bl2 = this.remoteSettings.getSessionEnabled();
        if (bl2 != null) {
            return bl2;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public final Object updateSettings(f80_0 var1_1) {
        block7: {
            block8: {
                block4: {
                    block5: {
                        block6: {
                            var2_2 = var1_1 instanceof SessionsSettings$updateSettings$1;
                            if (!var2_2) ** GOTO lbl-1000
                            var3_3 = var1_1;
                            var3_3 = (SessionsSettings$updateSettings$1)var1_1;
                            var4_4 = var3_3.label;
                            var5_5 = -1 << -1;
                            var6_6 = var4_4 & var5_5;
                            if (var6_6 != 0) {
                                var3_3.label = var4_4 -= var5_5;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var3_3 = new SessionsSettings$updateSettings$1(this, (f80_0)var1_1);
                            }
                            var1_1 = var3_3.result;
                            var7_7 = j90_0.COROUTINE_SUSPENDED;
                            var5_5 = var3_3.label;
                            var6_6 = 2;
                            var8_8 = 1;
                            if (var5_5 == 0) break block4;
                            if (var5_5 == var8_8) break block5;
                            if (var5_5 != var6_6) break block6;
                            vl2_2.b(var1_1);
                            break block7;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var9_9 = (SessionsSettings)var3_3.L$0;
                    vl2_2.b(var1_1);
                    break block8;
                }
                vl2_2.b(var1_1);
                var1_1 = this.localOverrideSettings;
                var3_3.L$0 = this;
                var3_3.label = var8_8;
                var1_1 = var1_1.updateSettings(var3_3);
                if (var1_1 == var7_7) {
                    return var7_7;
                }
                var9_9 = this;
            }
            var1_1 = var9_9.remoteSettings;
            var5_5 = 0;
            var9_9 = null;
            var3_3.L$0 = null;
            var3_3.label = var6_6;
            var1_1 = var1_1.updateSettings(var3_3);
            if (var1_1 == var7_7) {
                return var7_7;
            }
        }
        return Unit.a;
    }
}

