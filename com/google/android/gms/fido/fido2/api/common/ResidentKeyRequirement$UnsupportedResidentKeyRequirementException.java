/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

public class ResidentKeyRequirement$UnsupportedResidentKeyRequirementException
extends Exception {
    public ResidentKeyRequirement$UnsupportedResidentKeyRequirementException(String string2) {
        string2 = cP.a("Resident key requirement ", string2, " not supported");
        super(string2);
    }
}

