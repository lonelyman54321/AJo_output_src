/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.auth.api.signin.internal.zbu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class SignInConfiguration
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zba;
    private final GoogleSignInOptions zbb;

    static {
        zbu zbu2 = new zbu();
        CREATOR = zbu2;
    }

    public SignInConfiguration(String string2, GoogleSignInOptions googleSignInOptions) {
        this.zba = string2 = Preconditions.checkNotEmpty(string2);
        this.zbb = googleSignInOptions;
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                Object object2;
                block5: {
                    boolean bl2 = object instanceof SignInConfiguration;
                    if (!bl2) {
                        return false;
                    }
                    object = (SignInConfiguration)object;
                    object2 = this.zba;
                    String string2 = ((SignInConfiguration)object).zba;
                    bl2 = ((String)object2).equals(string2);
                    if (!bl2) break block4;
                    object2 = this.zbb;
                    object = ((SignInConfiguration)object).zbb;
                    if (object2 != null) break block5;
                    if (object != null) break block4;
                    break block6;
                }
                boolean bl3 = ((GoogleSignInOptions)object2).equals(object);
                if (!bl3) break block4;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        HashAccumulator hashAccumulator = new HashAccumulator();
        Object object = this.zba;
        hashAccumulator = hashAccumulator.addObject(object);
        object = this.zbb;
        return hashAccumulator.addObject(object).hash();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zba;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        GoogleSignInOptions googleSignInOptions = this.zbb;
        SafeParcelWriter.writeParcelable(parcel, 5, googleSignInOptions, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final GoogleSignInOptions zba() {
        return this.zbb;
    }
}

