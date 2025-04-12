/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.os.Bundle
 */
package com.google.firebase.sessions.settings;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.sessions.settings.LocalOverrideSettings$Companion;
import com.google.firebase.sessions.settings.SettingsProvider;
import com.google.firebase.sessions.settings.SettingsProvider$DefaultImpls;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import kotlin.time.b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class LocalOverrideSettings
implements SettingsProvider {
    private static final LocalOverrideSettings$Companion Companion;
    public static final String SAMPLING_RATE = "firebase_sessions_sampling_rate";
    public static final String SESSIONS_ENABLED = "firebase_sessions_enabled";
    public static final String SESSION_RESTART_TIMEOUT = "firebase_sessions_sessions_restart_timeout";
    private final Bundle metadata;

    static {
        LocalOverrideSettings$Companion localOverrideSettings$Companion;
        Companion = localOverrideSettings$Companion = new LocalOverrideSettings$Companion(null);
    }

    public LocalOverrideSettings(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        PackageManager packageManager = object.getPackageManager();
        object = object.getPackageName();
        int n3 = 128;
        object = packageManager.getApplicationInfo((String)object, (int)n3).metaData;
        if (object == null) {
            object = Bundle.EMPTY;
        }
        this.metadata = object;
    }

    private static /* synthetic */ void getMetadata$annotations() {
    }

    public Double getSamplingRate() {
        Object object = this.metadata;
        String string2 = SAMPLING_RATE;
        boolean bl2 = object.containsKey(string2);
        if (bl2) {
            double d2 = this.metadata.getDouble(string2);
            object = d2;
        } else {
            bl2 = false;
            object = null;
        }
        return object;
    }

    public Boolean getSessionEnabled() {
        Object object = this.metadata;
        String string2 = SESSIONS_ENABLED;
        boolean bl2 = object.containsKey(string2);
        if (bl2) {
            bl2 = this.metadata.getBoolean(string2);
            object = bl2;
        } else {
            bl2 = false;
            object = null;
        }
        return object;
    }

    public a getSessionRestartTimeout-FghU774() {
        a a2;
        Bundle bundle = this.metadata;
        Object object = SESSION_RESTART_TIMEOUT;
        int n3 = bundle.containsKey(object);
        if (n3 != 0) {
            bundle = this.metadata;
            n3 = bundle.getInt(object);
            object = aw0_1.SECONDS;
            long l2 = b.f(n3, (aw0_1)((Object)object));
            a2 = new a(l2);
        } else {
            a2 = null;
        }
        return a2;
    }

    public boolean isSettingsStale() {
        return SettingsProvider$DefaultImpls.isSettingsStale(this);
    }

    public Object updateSettings(f80_0 f80_02) {
        return SettingsProvider$DefaultImpls.updateSettings(this, f80_02);
    }
}

