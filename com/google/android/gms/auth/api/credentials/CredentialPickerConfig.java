/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.zbb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class CredentialPickerConfig
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zba;
    private final boolean zbb;
    private final boolean zbc;
    private final int zbd;

    static {
        zbb zbb2 = new zbb();
        CREATOR = zbb2;
    }

    public CredentialPickerConfig(int n3, boolean n4, boolean bl2, boolean n7, int n8) {
        this.zba = n3;
        this.zbb = n4;
        this.zbc = bl2;
        n4 = 2;
        if (n3 < n4) {
            n3 = 1;
            if (n3 == n7) {
                n3 = 3;
            }
            this.zbd = n3;
            return;
        }
        this.zbd = n8;
    }

    public boolean isForNewAccount() {
        int n3 = this.zbd;
        int n4 = 3;
        return n3 == n4;
    }

    public boolean shouldShowAddAccountButton() {
        return this.zbb;
    }

    public boolean shouldShowCancelButton() {
        return this.zbc;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.shouldShowAddAccountButton();
        SafeParcelWriter.writeBoolean(parcel, 1, n4 != 0);
        n4 = this.shouldShowCancelButton();
        SafeParcelWriter.writeBoolean(parcel, 2, n4 != 0);
        n4 = this.isForNewAccount();
        SafeParcelWriter.writeBoolean(parcel, 3, n4 != 0);
        n4 = this.zbd;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        n4 = this.zba;
        SafeParcelWriter.writeInt(parcel, 1000, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

