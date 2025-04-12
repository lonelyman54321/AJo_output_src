/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.auth.api.signin.internal.zaa;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class GoogleSignInOptionsExtensionParcelable
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    private int zab;
    private Bundle zac;

    static {
        zaa zaa2 = new zaa();
        CREATOR = zaa2;
    }

    public GoogleSignInOptionsExtensionParcelable(int n3, int n4, Bundle bundle) {
        this.zaa = n3;
        this.zab = n4;
        this.zac = bundle;
    }

    public GoogleSignInOptionsExtensionParcelable(GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        int n3 = googleSignInOptionsExtension.getExtensionType();
        googleSignInOptionsExtension = googleSignInOptionsExtension.toBundle();
        this(1, n3, (Bundle)googleSignInOptionsExtension);
    }

    public int getType() {
        return this.zab;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zaa;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        n4 = this.getType();
        SafeParcelWriter.writeInt(parcel, 2, n4);
        Bundle bundle = this.zac;
        SafeParcelWriter.writeBundle(parcel, 3, bundle, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

