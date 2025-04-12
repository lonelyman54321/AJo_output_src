/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds$Builder;
import com.google.android.datatransport.cct.internal.ExperimentIds$Builder;

public abstract class ExperimentIds {
    public static ExperimentIds$Builder builder() {
        AutoValue_ExperimentIds$Builder autoValue_ExperimentIds$Builder = new AutoValue_ExperimentIds$Builder();
        return autoValue_ExperimentIds$Builder;
    }

    public abstract byte[] getClearBlob();

    public abstract byte[] getEncryptedBlob();
}

