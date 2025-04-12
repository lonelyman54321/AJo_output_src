/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

public class AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException
extends Exception {
    public AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException(String string2) {
        string2 = cP.a("Attestation conveyance preference ", string2, " not supported");
        super(string2);
    }
}

