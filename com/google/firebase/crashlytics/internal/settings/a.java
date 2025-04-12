/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.settings.SettingsController$1;
import java.util.concurrent.Callable;

public final class a
implements Callable {
    public final /* synthetic */ SettingsController$1 a;

    public /* synthetic */ a(SettingsController$1 var1_1) {
        this.a = var1_1;
    }

    public final Object call() {
        return SettingsController$1.a(this.a);
    }
}

