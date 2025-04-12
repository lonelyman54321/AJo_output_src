/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

public final class ApiMetadata$Builder {
    private ComplianceOptions zza;

    public ApiMetadata build() {
        ComplianceOptions complianceOptions = this.zza;
        ApiMetadata apiMetadata = new ApiMetadata(complianceOptions);
        return apiMetadata;
    }

    public ApiMetadata$Builder setComplianceOptions(ComplianceOptions complianceOptions) {
        this.zza = complianceOptions;
        return this;
    }
}

