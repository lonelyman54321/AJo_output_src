/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext$Builder;

final class AutoValue_ExternalPRequestContext$Builder
extends ExternalPRequestContext$Builder {
    private Integer originAssociatedProductId;

    public ExternalPRequestContext build() {
        Integer n3 = this.originAssociatedProductId;
        AutoValue_ExternalPRequestContext autoValue_ExternalPRequestContext = new AutoValue_ExternalPRequestContext(n3, null);
        return autoValue_ExternalPRequestContext;
    }

    public ExternalPRequestContext$Builder setOriginAssociatedProductId(Integer n3) {
        this.originAssociatedProductId = n3;
        return this;
    }
}

