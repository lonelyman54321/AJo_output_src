/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ComplianceData$1;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;

final class AutoValue_ComplianceData
extends ComplianceData {
    private final ExternalPrivacyContext privacyContext;
    private final ComplianceData$ProductIdOrigin productIdOrigin;

    private AutoValue_ComplianceData(ExternalPrivacyContext externalPrivacyContext, ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin) {
        this.privacyContext = externalPrivacyContext;
        this.productIdOrigin = complianceData$ProductIdOrigin;
    }

    public /* synthetic */ AutoValue_ComplianceData(ExternalPrivacyContext externalPrivacyContext, ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin, AutoValue_ComplianceData$1 autoValue_ComplianceData$1) {
        this(externalPrivacyContext, complianceData$ProductIdOrigin);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof ComplianceData;
        if (bl3) {
            boolean bl4;
            ExternalPrivacyContext externalPrivacyContext;
            object = (ComplianceData)object;
            Object object2 = this.privacyContext;
            if (!(object2 == null ? (object2 = ((ComplianceData)object).getPrivacyContext()) == null : (bl3 = object2.equals(externalPrivacyContext = ((ComplianceData)object).getPrivacyContext()))) || !((object2 = this.productIdOrigin) == null ? (object = ((ComplianceData)object).getProductIdOrigin()) == null : (bl4 = object2.equals(object = ((ComplianceData)object).getProductIdOrigin())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public ExternalPrivacyContext getPrivacyContext() {
        return this.privacyContext;
    }

    public ComplianceData$ProductIdOrigin getProductIdOrigin() {
        return this.productIdOrigin;
    }

    public int hashCode() {
        int n3;
        ExternalPrivacyContext externalPrivacyContext = this.privacyContext;
        int n4 = 0;
        if (externalPrivacyContext == null) {
            n3 = 0;
            externalPrivacyContext = null;
        } else {
            n3 = externalPrivacyContext.hashCode();
        }
        int n7 = 1000003;
        n3 = (n3 ^ n7) * n7;
        ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin = this.productIdOrigin;
        if (complianceData$ProductIdOrigin != null) {
            n4 = ((Object)((Object)complianceData$ProductIdOrigin)).hashCode();
        }
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ComplianceData{privacyContext=");
        Object object = this.privacyContext;
        stringBuilder.append(object);
        stringBuilder.append(", productIdOrigin=");
        object = this.productIdOrigin;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

