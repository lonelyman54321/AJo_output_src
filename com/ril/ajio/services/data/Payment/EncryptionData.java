/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class EncryptionData {
    private String publicKey;
    private String version;

    public EncryptionData() {
        this(null, null, 3, null);
    }

    public EncryptionData(String string2, String string3) {
        this.publicKey = string2;
        this.version = string3;
    }

    public /* synthetic */ EncryptionData(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ EncryptionData copy$default(EncryptionData encryptionData, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = encryptionData.publicKey;
        }
        if ((n3 &= 2) != 0) {
            string3 = encryptionData.version;
        }
        return encryptionData.copy(string2, string3);
    }

    public final String component1() {
        return this.publicKey;
    }

    public final String component2() {
        return this.version;
    }

    public final EncryptionData copy(String string2, String string3) {
        EncryptionData encryptionData = new EncryptionData(string2, string3);
        return encryptionData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof EncryptionData;
        if (!bl3) {
            return false;
        }
        object = (EncryptionData)object;
        String string2 = this.publicKey;
        String string3 = ((EncryptionData)object).publicKey;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.version;
        object = ((EncryptionData)object).version;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int n3;
        String string2 = this.publicKey;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.version;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setPublicKey(String string2) {
        this.publicKey = string2;
    }

    public final void setVersion(String string2) {
        this.version = string2;
    }

    public String toString() {
        String string2 = this.publicKey;
        String string3 = this.version;
        return uc0_0.a("EncryptionData(publicKey=", string2, ", version=", string3, ")");
    }
}

