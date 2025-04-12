/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds$1;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import java.util.Arrays;

final class AutoValue_ExperimentIds
extends ExperimentIds {
    private final byte[] clearBlob;
    private final byte[] encryptedBlob;

    private AutoValue_ExperimentIds(byte[] byArray, byte[] byArray2) {
        this.clearBlob = byArray;
        this.encryptedBlob = byArray2;
    }

    public /* synthetic */ AutoValue_ExperimentIds(byte[] byArray, byte[] byArray2, AutoValue_ExperimentIds$1 autoValue_ExperimentIds$1) {
        this(byArray, byArray2);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof ExperimentIds;
        if (bl3) {
            boolean bl4;
            Object object2;
            object = (ExperimentIds)object;
            byte[] byArray = this.clearBlob;
            boolean bl5 = object instanceof AutoValue_ExperimentIds;
            if (bl5) {
                object2 = object;
                object2 = ((AutoValue_ExperimentIds)object).clearBlob;
            } else {
                object2 = ((ExperimentIds)object).getClearBlob();
            }
            bl3 = Arrays.equals(byArray, (byte[])object2);
            if (!bl3 || !(bl4 = Arrays.equals(byArray = this.encryptedBlob, (byte[])(object = bl5 ? (Object)((AutoValue_ExperimentIds)object).encryptedBlob : (Object)((ExperimentIds)object).getEncryptedBlob())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public byte[] getClearBlob() {
        return this.clearBlob;
    }

    public byte[] getEncryptedBlob() {
        return this.encryptedBlob;
    }

    public int hashCode() {
        int n3 = Arrays.hashCode(this.clearBlob);
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        n4 = Arrays.hashCode(this.encryptedBlob);
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExperimentIds{clearBlob=");
        String string2 = Arrays.toString(this.clearBlob);
        stringBuilder.append(string2);
        stringBuilder.append(", encryptedBlob=");
        string2 = Arrays.toString(this.encryptedBlob);
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

