/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zbb;
import com.google.android.gms.internal.auth-api.zbc;
import com.google.android.gms.internal.auth-api.zbs;

public abstract class zbr
extends zbb
implements zbs {
    public zbr() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    public final boolean zba(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    return false;
                }
                Object object = Status.CREATOR;
                object = (Status)zbc.zba(parcel, object);
                String string2 = parcel.readString();
                zbc.zbb(parcel);
                this.zbd((Status)object, string2);
            } else {
                Object object = Status.CREATOR;
                object = (Status)zbc.zba(parcel, object);
                zbc.zbb(parcel);
                this.zbc((Status)object);
            }
        } else {
            Object object = Status.CREATOR;
            object = (Status)zbc.zba(parcel, object);
            Object object2 = Credential.CREATOR;
            object2 = (Credential)zbc.zba(parcel, object2);
            zbc.zbb(parcel);
            this.zbb((Status)object, (Credential)object2);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

