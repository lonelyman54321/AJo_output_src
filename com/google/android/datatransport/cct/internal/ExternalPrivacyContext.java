/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext$Builder;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext$Builder;

public abstract class ExternalPrivacyContext {
    public static ExternalPrivacyContext$Builder builder() {
        AutoValue_ExternalPrivacyContext$Builder autoValue_ExternalPrivacyContext$Builder = new AutoValue_ExternalPrivacyContext$Builder();
        return autoValue_ExternalPrivacyContext$Builder;
    }

    public abstract ExternalPRequestContext getPrequest();
}

