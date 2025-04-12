/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.internal.Preconditions;

public class ModuleInstallStatusUpdate$ProgressInfo {
    private final long zaa;
    private final long zab;

    public ModuleInstallStatusUpdate$ProgressInfo(long l2, long l3) {
        Preconditions.checkNotZero(l3);
        this.zaa = l2;
        this.zab = l3;
    }

    public long getBytesDownloaded() {
        return this.zaa;
    }

    public long getTotalBytesToDownload() {
        return this.zab;
    }
}

