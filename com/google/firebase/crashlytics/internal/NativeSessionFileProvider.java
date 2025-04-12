/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import java.io.File;

public interface NativeSessionFileProvider {
    public File getAppFile();

    public CrashlyticsReport.ApplicationExitInfo getApplicationExitInto();

    public File getBinaryImagesFile();

    public File getDeviceFile();

    public File getMetadataFile();

    public File getMinidumpFile();

    public File getOsFile();

    public File getSessionFile();
}

