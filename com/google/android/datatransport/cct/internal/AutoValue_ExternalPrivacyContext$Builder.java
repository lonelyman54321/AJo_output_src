/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext$Builder;

final class AutoValue_ExternalPrivacyContext$Builder
extends ExternalPrivacyContext$Builder {
    private ExternalPRequestContext prequest;

    public ExternalPrivacyContext build() {
        ExternalPRequestContext externalPRequestContext = this.prequest;
        AutoValue_ExternalPrivacyContext autoValue_ExternalPrivacyContext = new AutoValue_ExternalPrivacyContext(externalPRequestContext, null);
        return autoValue_ExternalPrivacyContext;
    }

    public ExternalPrivacyContext$Builder setPrequest(ExternalPRequestContext externalPRequestContext) {
        this.prequest = externalPRequestContext;
        return this;
    }
}

