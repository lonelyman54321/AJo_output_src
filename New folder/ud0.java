/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

public final class ud0
implements Runnable {
    public final /* synthetic */ CrashlyticsCore a;
    public final /* synthetic */ SettingsProvider b;

    public /* synthetic */ ud0(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider) {
        this.a = crashlyticsCore;
        this.b = settingsProvider;
    }

    public final void run() {
        CrashlyticsCore crashlyticsCore = this.a;
        SettingsProvider settingsProvider = this.b;
        CrashlyticsCore.f(crashlyticsCore, settingsProvider);
    }
}

