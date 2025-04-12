/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package com.google.firebase.sessions.settings;

import android.os.Build;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher;
import com.google.firebase.sessions.settings.RemoteSettings$Companion;
import com.google.firebase.sessions.settings.RemoteSettings$clearCachedSettings$1;
import com.google.firebase.sessions.settings.RemoteSettings$settingsCache$2;
import com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1;
import com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1;
import com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2;
import com.google.firebase.sessions.settings.SettingsCache;
import com.google.firebase.sessions.settings.SettingsProvider;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.a;
import kotlin.time.b;
import kotlinx.coroutines.d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class RemoteSettings
implements SettingsProvider {
    private static final RemoteSettings$Companion Companion;
    public static final String FORWARD_SLASH_STRING = "/";
    public static final String TAG = "SessionConfigFetcher";
    private final ApplicationInfo appInfo;
    private final CoroutineContext backgroundDispatcher;
    private final CrashlyticsSettingsFetcher configsFetcher;
    private final hs1_2 fetchInProgress;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final rq1_2 settingsCache$delegate;

    static {
        RemoteSettings$Companion remoteSettings$Companion;
        Companion = remoteSettings$Companion = new RemoteSettings$Companion(null);
    }

    public RemoteSettings(CoroutineContext object, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo, CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, ui0 ui02) {
        Intrinsics.checkNotNullParameter(object, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(applicationInfo, "appInfo");
        Intrinsics.checkNotNullParameter(crashlyticsSettingsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(ui02, "dataStore");
        this.backgroundDispatcher = object;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = applicationInfo;
        this.configsFetcher = crashlyticsSettingsFetcher;
        object = new RemoteSettings$settingsCache$2(ui02);
        this.settingsCache$delegate = object = yr1_2.b((Function0)object);
        this.fetchInProgress = object = ls1_2.a();
    }

    public static final /* synthetic */ SettingsCache access$getSettingsCache(RemoteSettings remoteSettings) {
        return remoteSettings.getSettingsCache();
    }

    private final SettingsCache getSettingsCache() {
        return (SettingsCache)this.settingsCache$delegate.getValue();
    }

    private final String removeForwardSlashesIn(String string2) {
        return oo1_1.a(FORWARD_SLASH_STRING, string2, "");
    }

    public final void clearCachedSettings$com_google_firebase_firebase_sessions() {
        c80 c802 = d.a(this.backgroundDispatcher);
        RemoteSettings$clearCachedSettings$1 remoteSettings$clearCachedSettings$1 = new RemoteSettings$clearCachedSettings$1(this, null);
        Ae3.d(c802, null, null, remoteSettings$clearCachedSettings$1, 3);
    }

    public Double getSamplingRate() {
        return this.getSettingsCache().sessionSamplingRate();
    }

    public Boolean getSessionEnabled() {
        return this.getSettingsCache().sessionsEnabled();
    }

    public a getSessionRestartTimeout-FghU774() {
        a a2;
        Integer n3 = this.getSettingsCache().sessionRestartTimeout();
        if (n3 != null) {
            Object object = a.b;
            int n4 = n3;
            object = aw0_1.SECONDS;
            long l2 = b.f(n4, (aw0_1)((Object)object));
            a2 = new a(l2);
        } else {
            a2 = null;
        }
        return a2;
    }

    public boolean isSettingsStale() {
        return this.getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object updateSettings(f80_0 var1_1) {
        block25: {
            block28: {
                block27: {
                    block26: {
                        var2_2 = this;
                        var3_3 /* !! */  = var1_1;
                        var4_9 = 0;
                        var5_10 = null;
                        var6_11 = 3;
                        var7_12 = 2;
                        var8_13 = 1;
                        var9_14 = var1_1 instanceof RemoteSettings$updateSettings$1;
                        if (!var9_14) ** GOTO lbl-1000
                        var10_15 = var1_1;
                        var10_15 = (RemoteSettings$updateSettings$1)var1_1;
                        var11_16 = var10_15.label;
                        var12_17 = -1 << -1;
                        var13_18 = var11_16 & var12_17;
                        if (var13_18 != 0) {
                            var10_15.label = var11_16 -= var12_17;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var10_15 = new RemoteSettings$updateSettings$1(var2_2, (f80_0)var3_3 /* !! */ );
                        }
                        var3_3 /* !! */  = var10_15.result;
                        var14_19 = j90_0.COROUTINE_SUSPENDED;
                        var12_17 = var10_15.label;
                        var13_18 = 0;
                        var15_20 /* !! */  = null;
                        if (var12_17 != 0) {
                            if (var12_17 != var8_13) {
                                if (var12_17 != var7_12) {
                                    if (var12_17 != var6_11) {
                                        var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        throw var3_3 /* !! */ ;
                                    }
                                    var5_10 = (hs1_2)var10_15.L$0;
                                    try {
                                        vl2_2.b(var3_3 /* !! */ );
                                    }
                                    finally {
                                        var8_13 = 0;
                                        break block25;
                                    }
                                } else {
                                    var16_21 = (hs1_2)var10_15.L$1;
                                    var17_22 = (RemoteSettings)var10_15.L$0;
                                    vl2_2.b(var3_3 /* !! */ );
                                }
                            }
                            var16_21 = (hs1_2)var10_15.L$1;
                            var17_22 = (RemoteSettings)var10_15.L$0;
                            vl2_2.b(var3_3 /* !! */ );
                        } else {
                            vl2_2.b(var3_3 /* !! */ );
                            var3_3 /* !! */  = var2_2.fetchInProgress;
                            var18_23 = var3_3 /* !! */ .a();
                            if (var18_23 == 0 && (var18_23 = (var3_3 /* !! */  = this.getSettingsCache()).hasCacheExpired$com_google_firebase_firebase_sessions()) == 0) {
                                return Unit.a;
                            }
                            var3_3 /* !! */  = var2_2.fetchInProgress;
                            var10_15.L$0 = var2_2;
                            var10_15.L$1 = var3_3 /* !! */ ;
                            var10_15.label = var8_13;
                            var16_21 = var3_3 /* !! */ .d(var10_15, null);
                            if (var16_21 == var14_19) {
                                return var14_19;
                            }
                            var16_21 = var3_3 /* !! */ ;
                            var17_22 = var2_2;
                        }
                        var3_3 /* !! */  = var17_22.getSettingsCache();
                        var18_23 = var3_3 /* !! */ .hasCacheExpired$com_google_firebase_firebase_sessions();
                        if (var18_23 != 0) break block26;
                        try {
                            var3_3 /* !! */  = Unit.a;
                            var16_21.b(null);
                            return var3_3 /* !! */ ;
                        }
                        catch (Throwable var3_6) {
                            var5_10 = var16_21;
                        }
                    }
                    var3_3 /* !! */  = InstallationId.Companion;
                    var19_24 = var17_22.firebaseInstallationsApi;
                    var10_15.L$0 = var17_22;
                    var10_15.L$1 = var16_21;
                    var10_15.label = var7_12;
                    var3_3 /* !! */  = var3_3 /* !! */ .create((FirebaseInstallationsApi)var19_24, var10_15);
                    if (var3_3 /* !! */  != var14_19) break block27;
                    return var14_19;
                }
                var3_3 /* !! */  = (InstallationId)var3_3 /* !! */ ;
                var3_3 /* !! */  = var3_3 /* !! */ .getFid();
                var19_24 = "";
                var20_25 = Intrinsics.areEqual(var3_3 /* !! */ , var19_24);
                if (!var20_25) break block28;
                var3_3 /* !! */  = Unit.a;
                var16_21.b(null);
                return var3_3 /* !! */ ;
            }
            var19_24 = "X-Crashlytics-Installation-ID";
            var21_26 = new Pair(var19_24, var3_3 /* !! */ );
            var3_3 /* !! */  = "X-Crashlytics-Device-Model";
            var19_24 = StringCompanionObject.INSTANCE;
            var19_24 = "%s/%s";
            var22_27 /* !! */  = new Object[var7_12];
            var22_27 /* !! */ [0] = var23_28 = Build.MANUFACTURER;
            var22_27 /* !! */ [var8_13] = var23_28 = Build.MODEL;
            var22_27 /* !! */  = Arrays.copyOf(var22_27 /* !! */ , var7_12);
            var19_24 = String.format((String)var19_24, var22_27 /* !! */ );
            var22_27 /* !! */  = "format(format, *args)";
            Intrinsics.checkNotNullExpressionValue(var19_24, (String)var22_27 /* !! */ );
            var19_24 = var17_22.removeForwardSlashesIn((String)var19_24);
            var22_27 /* !! */  = new Pair(var3_3 /* !! */ , var19_24);
            var3_3 /* !! */  = "X-Crashlytics-OS-Build-Version";
            var19_24 = Build.VERSION.INCREMENTAL;
            var23_28 = "INCREMENTAL";
            Intrinsics.checkNotNullExpressionValue(var19_24, (String)var23_28);
            var19_24 = var17_22.removeForwardSlashesIn((String)var19_24);
            var23_28 = new Pair(var3_3 /* !! */ , var19_24);
            var3_3 /* !! */  = "X-Crashlytics-OS-Display-Version";
            var19_24 = Build.VERSION.RELEASE;
            var24_29 = "RELEASE";
            Intrinsics.checkNotNullExpressionValue(var19_24, (String)var24_29);
            var19_24 = var17_22.removeForwardSlashesIn((String)var19_24);
            var24_29 = new Pair(var3_3 /* !! */ , var19_24);
            var3_3 /* !! */  = "X-Crashlytics-API-Client-Version";
            var19_24 = var17_22.appInfo;
            var19_24 = var19_24.getSessionSdkVersion();
            var15_20 /* !! */  = new Pair(var3_3 /* !! */ , var19_24);
            var18_23 = 5;
            var3_3 /* !! */  = new Pair[var18_23];
            var3_3 /* !! */ [0] = var21_26;
            var3_3 /* !! */ [var8_13] = var22_27 /* !! */ ;
            var3_3 /* !! */ [var7_12] = var23_28;
            var3_3 /* !! */ [var6_11] = var24_29;
            var4_9 = 4;
            var3_3 /* !! */ [var4_9] = var15_20 /* !! */ ;
            var3_3 /* !! */  = fh1_2.i(var3_3 /* !! */ );
            var5_10 = var17_22.configsFetcher;
            var8_13 = 0;
            var25_30 = new RemoteSettings$updateSettings$2$1(var17_22, null);
            var15_20 /* !! */  = new RemoteSettings$updateSettings$2$2(null);
            var10_15.L$0 = var16_21;
            var10_15.L$1 = null;
            var10_15.label = var6_11;
            var3_3 /* !! */  = var5_10.doConfigFetch((Map)var3_3 /* !! */ , var25_30, (Function2)var15_20 /* !! */ , var10_15);
            if (var3_3 /* !! */  == var14_19) {
                return var14_19;
            }
            var5_10 = var16_21;
        }
        try {
            var3_3 /* !! */  = Unit.a;
            var5_10.b(null);
            return Unit.a;
        }
        catch (Throwable var3_7) {}
        ** GOTO lbl-1000
        catch (Throwable var3_8) {
            var5_10 = var16_21;
        }
lbl-1000:
        // 2 sources

        {
            var6_11 = 0;
        }
        var5_10.b(null);
        throw var3_5;
    }
}

