/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.ExperimentIds$Builder;

final class AutoValue_ExperimentIds$Builder
extends ExperimentIds$Builder {
    private byte[] clearBlob;
    private byte[] encryptedBlob;

    public ExperimentIds build() {
        byte[] byArray = this.clearBlob;
        byte[] byArray2 = this.encryptedBlob;
        AutoValue_ExperimentIds autoValue_ExperimentIds = new AutoValue_ExperimentIds(byArray, byArray2, null);
        return autoValue_ExperimentIds;
    }

    public ExperimentIds$Builder setClearBlob(byte[] byArray) {
        this.clearBlob = byArray;
        return this;
    }

    public ExperimentIds$Builder setEncryptedBlob(byte[] byArray) {
        this.encryptedBlob = byArray;
        return this;
    }
}

