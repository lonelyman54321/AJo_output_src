/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy$1;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import java.io.File;

final class CrashlyticsNativeComponentDeferredProxy$MissingNativeSessionFileProvider
implements NativeSessionFileProvider {
    private CrashlyticsNativeComponentDeferredProxy$MissingNativeSessionFileProvider() {
    }

    public /* synthetic */ CrashlyticsNativeComponentDeferredProxy$MissingNativeSessionFileProvider(CrashlyticsNativeComponentDeferredProxy$1 crashlyticsNativeComponentDeferredProxy$1) {
        this();
    }

    public File getAppFile() {
        return null;
    }

    public CrashlyticsReport$ApplicationExitInfo getApplicationExitInto() {
        return null;
    }

    public File getBinaryImagesFile() {
        return null;
    }

    public File getDeviceFile() {
        return null;
    }

    public File getMetadataFile() {
        return null;
    }

    public File getMinidumpFile() {
        return null;
    }

    public File getOsFile() {
        return null;
    }

    public File getSessionFile() {
        return null;
    }
}

