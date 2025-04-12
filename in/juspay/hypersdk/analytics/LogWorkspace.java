/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hypersdk.analytics.LogWorkspace$Companion;
import in.juspay.hypersdk.services.Workspace;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public final class LogWorkspace
extends Workspace {
    public static final LogWorkspace$Companion Companion;
    private static final String LOGS_DIR_NAME = "juspay_logs";
    public final File logsDir;

    static {
        LogWorkspace$Companion logWorkspace$Companion;
        Companion = logWorkspace$Companion = new LogWorkspace$Companion(null);
    }

    public LogWorkspace(Workspace object) {
        String string2 = "workspace";
        Intrinsics.checkNotNullParameter(object, string2);
        super((Workspace)object);
        this.logsDir = object = this.openInCache(LOGS_DIR_NAME);
        boolean bl2 = ((File)object).exists();
        if (!bl2) {
            ((File)object).mkdir();
        }
        this.setRoot((File)object);
    }
}

