/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.settings.SessionConfigs;
import com.google.firebase.sessions.settings.SettingsCache$1;
import com.google.firebase.sessions.settings.SettingsCache$Companion;
import com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1;
import com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2;
import com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1;
import com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class SettingsCache {
    private static final my2$a CACHE_DURATION_SECONDS;
    private static final my2$a CACHE_UPDATED_TIME;
    private static final SettingsCache$Companion Companion;
    private static final my2$a RESTART_TIMEOUT_SECONDS;
    private static final my2$a SAMPLING_RATE;
    private static final my2$a SESSIONS_ENABLED;
    public static final String TAG = "SettingsCache";
    private final ui0 dataStore;
    private SessionConfigs sessionConfigs;

    static {
        my2$a my2$a;
        Object object = new SettingsCache$Companion(null);
        Companion = object;
        object = "firebase_sessions_enabled";
        Object object2 = "name";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        SESSIONS_ENABLED = my2$a = new my2$a((String)object);
        object = "firebase_sessions_sampling_rate";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        SAMPLING_RATE = my2$a = new my2$a((String)object);
        object = "firebase_sessions_restart_timeout";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        RESTART_TIMEOUT_SECONDS = my2$a = new my2$a((String)object);
        object = "firebase_sessions_cache_duration";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        CACHE_DURATION_SECONDS = my2$a = new my2$a((String)object);
        object = "firebase_sessions_cache_updated_time";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        CACHE_UPDATED_TIME = object2 = new my2$a((String)object);
    }

    public SettingsCache(ui0 object) {
        Intrinsics.checkNotNullParameter(object, "dataStore");
        this.dataStore = object;
        object = new SettingsCache$1(this, null);
        Ae3.f((Function2)object);
    }

    public static final /* synthetic */ my2$a access$getCACHE_DURATION_SECONDS$cp() {
        return CACHE_DURATION_SECONDS;
    }

    public static final /* synthetic */ my2$a access$getCACHE_UPDATED_TIME$cp() {
        return CACHE_UPDATED_TIME;
    }

    public static final /* synthetic */ ui0 access$getDataStore$p(SettingsCache settingsCache2) {
        return settingsCache2.dataStore;
    }

    public static final /* synthetic */ my2$a access$getRESTART_TIMEOUT_SECONDS$cp() {
        return RESTART_TIMEOUT_SECONDS;
    }

    public static final /* synthetic */ my2$a access$getSAMPLING_RATE$cp() {
        return SAMPLING_RATE;
    }

    public static final /* synthetic */ my2$a access$getSESSIONS_ENABLED$cp() {
        return SESSIONS_ENABLED;
    }

    public static final /* synthetic */ Object access$updateConfigValue(SettingsCache settingsCache2, my2$a my2$a, Object object, f80_0 f80_02) {
        return settingsCache2.updateConfigValue(my2$a, object, f80_02);
    }

    public static final /* synthetic */ void access$updateSessionConfigs(SettingsCache settingsCache2, my2_0 my2_02) {
        settingsCache2.updateSessionConfigs(my2_02);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object updateConfigValue(my2$a var1_1, Object var2_3, f80_0 var3_4) {
        var4_5 = var3_4 instanceof SettingsCache$updateConfigValue$1;
        if (!var4_5) ** GOTO lbl-1000
        var5_6 = var3_4;
        var5_6 = (SettingsCache$updateConfigValue$1)var3_4;
        var6_7 = var5_6.label;
        var7_8 = -1 << -1;
        var8_9 = var6_7 & var7_8;
        if (var8_9 != 0) {
            var5_6.label = var6_7 -= var7_8;
        } else lbl-1000:
        // 2 sources

        {
            var5_6 = new SettingsCache$updateConfigValue$1(this, (f80_0)var3_4);
        }
        var3_4 = var5_6.result;
        var9_10 = j90_0.COROUTINE_SUSPENDED;
        var7_8 = var5_6.label;
        var8_9 = 1;
        if (var7_8 != 0) {
            if (var7_8 != var8_9) {
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            try {
                vl2_2.b(var3_4);
                return Unit.a;
            }
            catch (IOException var1_2) {}
        } else {
            vl2_2.b(var3_4);
            {
                var3_4 = this.dataStore;
                var10_11 = new SettingsCache$updateConfigValue$2(var2_3, (my2$a)var1_1, this, null);
                var5_6.label = var8_9;
                var1_1 = new ny2_2(var10_11, null);
                var1_1 = var3_4.a((Function2)var1_1, var5_6);
                if (var1_1 != var9_10) return Unit.a;
                return var9_10;
            }
        }
        var1_2.toString();
        return Unit.a;
    }

    private final void updateSessionConfigs(my2_0 object) {
        SessionConfigs sessionConfigs;
        Object object2 = SESSIONS_ENABLED;
        Object object3 = object2 = ((my2_0)object).b((my2$a)object2);
        object3 = (Boolean)object2;
        object2 = SAMPLING_RATE;
        Object object4 = object2 = ((my2_0)object).b((my2$a)object2);
        object4 = (Double)object2;
        object2 = RESTART_TIMEOUT_SECONDS;
        Object object5 = object2 = ((my2_0)object).b((my2$a)object2);
        object5 = (Integer)object2;
        object2 = CACHE_DURATION_SECONDS;
        Object object6 = object2 = ((my2_0)object).b((my2$a)object2);
        object6 = (Integer)object2;
        object2 = CACHE_UPDATED_TIME;
        Object object7 = object = ((my2_0)object).b((my2$a)object2);
        object7 = (Long)object;
        object2 = sessionConfigs;
        this.sessionConfigs = sessionConfigs = new SessionConfigs((Boolean)object3, (Double)object4, (Integer)object5, (Integer)object6, (Long)object7);
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        int n3;
        Object object = this.sessionConfigs;
        Object object2 = null;
        String string2 = "sessionConfigs";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        object = ((SessionConfigs)object).getCacheUpdatedTime();
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = sessionConfigs;
        }
        object2 = ((SessionConfigs)object2).getCacheDuration();
        if (object != null && object2 != null) {
            long l2 = System.currentTimeMillis();
            long l3 = (Long)object;
            l2 -= l3;
            l3 = 1000;
            n3 = (Integer)object2;
            long l4 = n3;
            long l7 = (l2 /= l3) - l4;
            Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object3 < 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object removeConfigs$com_google_firebase_firebase_sessions(f80_0 var1_1) {
        var2_3 = var1_1 instanceof SettingsCache$removeConfigs$1;
        if (!var2_3) ** GOTO lbl-1000
        var3_4 = var1_1;
        var3_4 = (SettingsCache$removeConfigs$1)var1_1;
        var4_5 = var3_4.label;
        var5_6 = -1 << -1;
        var6_7 = var4_5 & var5_6;
        if (var6_7 != 0) {
            var3_4.label = var4_5 -= var5_6;
        } else lbl-1000:
        // 2 sources

        {
            var3_4 = new SettingsCache$removeConfigs$1(this, (f80_0)var1_1);
        }
        var1_1 = var3_4.result;
        var7_8 = j90_0.COROUTINE_SUSPENDED;
        var5_6 = var3_4.label;
        var6_7 = 1;
        if (var5_6 != 0) {
            if (var5_6 != var6_7) {
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            try {
                vl2_2.b(var1_1);
                return Unit.a;
            }
            catch (IOException var1_2) {}
        } else {
            vl2_2.b(var1_1);
            {
                var1_1 = this.dataStore;
                var8_9 = new SettingsCache$removeConfigs$2(this, null);
                var3_4.label = var6_7;
                var9_10 = new ny2_2(var8_9, null);
                var1_1 = var1_1.a(var9_10, var3_4);
                if (var1_1 != var7_8) return Unit.a;
                return var7_8;
            }
        }
        var1_2.toString();
        return Unit.a;
    }

    public final Integer sessionRestartTimeout() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionRestartTimeout();
    }

    public final Double sessionSamplingRate() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionSamplingRate();
    }

    public final Boolean sessionsEnabled() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionEnabled();
    }

    public final Object updateSamplingRate(Double object, f80_0 object2) {
        my2$a my2$a = SAMPLING_RATE;
        if ((object = this.updateConfigValue(my2$a, object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final Object updateSessionCacheDuration(Integer object, f80_0 object2) {
        my2$a my2$a = CACHE_DURATION_SECONDS;
        if ((object = this.updateConfigValue(my2$a, object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final Object updateSessionCacheUpdatedTime(Long object, f80_0 object2) {
        my2$a my2$a = CACHE_UPDATED_TIME;
        if ((object = this.updateConfigValue(my2$a, object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final Object updateSessionRestartTimeout(Integer object, f80_0 object2) {
        my2$a my2$a = RESTART_TIMEOUT_SECONDS;
        if ((object = this.updateConfigValue(my2$a, object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final Object updateSettingsEnabled(Boolean object, f80_0 object2) {
        my2$a my2$a = SESSIONS_ENABLED;
        if ((object = this.updateConfigValue(my2$a, object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

