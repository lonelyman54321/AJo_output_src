/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.zbr;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zbb;
import com.google.android.gms.internal.auth-api.zbc;

public abstract class zbq
extends zbb
implements zbr {
    public zbq() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public final boolean zba(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 103: {
                Object object = Status.CREATOR;
                object = (Status)zbc.zba(parcel, object);
                zbc.zbb(parcel);
                this.zbb((Status)object);
                break;
            }
            case 102: {
                Object object = Status.CREATOR;
                object = (Status)zbc.zba(parcel, object);
                zbc.zbb(parcel);
                this.zbc((Status)object);
                break;
            }
            case 101: {
                Object object = GoogleSignInAccount.CREATOR;
                object = (GoogleSignInAccount)zbc.zba(parcel, object);
                Object object2 = Status.CREATOR;
                object2 = (Status)zbc.zba(parcel, object2);
                zbc.zbb(parcel);
                this.zbd((GoogleSignInAccount)object, (Status)object2);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

