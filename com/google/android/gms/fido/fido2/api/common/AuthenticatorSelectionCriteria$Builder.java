/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;

public class AuthenticatorSelectionCriteria$Builder {
    private Attachment zza;
    private Boolean zzb;
    private ResidentKeyRequirement zzc;

    public AuthenticatorSelectionCriteria build() {
        Object object = this.zza;
        object = object == null ? null : object.toString();
        Boolean bl2 = this.zzb;
        Object object2 = this.zzc;
        object2 = object2 == null ? null : object2.toString();
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = new AuthenticatorSelectionCriteria((String)object, bl2, null, (String)object2);
        return authenticatorSelectionCriteria;
    }

    public AuthenticatorSelectionCriteria$Builder setAttachment(Attachment attachment) {
        this.zza = attachment;
        return this;
    }

    public AuthenticatorSelectionCriteria$Builder setRequireResidentKey(Boolean bl2) {
        this.zzb = bl2;
        return this;
    }

    public AuthenticatorSelectionCriteria$Builder setResidentKeyRequirement(ResidentKeyRequirement residentKeyRequirement) {
        this.zzc = residentKeyRequirement;
        return this;
    }
}

