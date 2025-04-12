/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext$Builder;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext$Builder;

public abstract class ExternalPRequestContext {
    public static ExternalPRequestContext$Builder builder() {
        AutoValue_ExternalPRequestContext$Builder autoValue_ExternalPRequestContext$Builder = new AutoValue_ExternalPRequestContext$Builder();
        return autoValue_ExternalPRequestContext$Builder;
    }

    public abstract Integer getOriginAssociatedProductId();
}

