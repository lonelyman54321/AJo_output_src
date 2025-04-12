/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ComplianceData;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ComplianceData$Builder;
import com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;

final class AutoValue_ComplianceData$Builder
extends ComplianceData$Builder {
    private ExternalPrivacyContext privacyContext;
    private ComplianceData$ProductIdOrigin productIdOrigin;

    public ComplianceData build() {
        ExternalPrivacyContext externalPrivacyContext = this.privacyContext;
        ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin = this.productIdOrigin;
        AutoValue_ComplianceData autoValue_ComplianceData = new AutoValue_ComplianceData(externalPrivacyContext, complianceData$ProductIdOrigin, null);
        return autoValue_ComplianceData;
    }

    public ComplianceData$Builder setPrivacyContext(ExternalPrivacyContext externalPrivacyContext) {
        this.privacyContext = externalPrivacyContext;
        return this;
    }

    public ComplianceData$Builder setProductIdOrigin(ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin) {
        this.productIdOrigin = complianceData$ProductIdOrigin;
        return this;
    }
}

