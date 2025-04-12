/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;

public abstract class ComplianceData$Builder {
    public abstract ComplianceData build();

    public abstract ComplianceData$Builder setPrivacyContext(ExternalPrivacyContext var1);

    public abstract ComplianceData$Builder setProductIdOrigin(ComplianceData.ProductIdOrigin var1);
}

