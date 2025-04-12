/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zae;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;

public abstract class zad
extends zab
implements zae {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean zaa(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 9: {
                Object object = zag.CREATOR;
                object = (zag)zac.zaa(parcel, object);
                zac.zab(parcel);
                break;
            }
            case 8: {
                Object object = zak.CREATOR;
                object = (zak)zac.zaa(parcel, object);
                zac.zab(parcel);
                this.zab((zak)object);
                break;
            }
            case 7: {
                Object object = Status.CREATOR;
                object = (Status)zac.zaa(parcel, object);
                object = GoogleSignInAccount.CREATOR;
                object = (GoogleSignInAccount)zac.zaa(parcel, object);
                zac.zab(parcel);
                break;
            }
            case 6: {
                Object object = Status.CREATOR;
                object = (Status)zac.zaa(parcel, object);
                zac.zab(parcel);
                break;
            }
            case 4: {
                Object object = Status.CREATOR;
                object = (Status)zac.zaa(parcel, object);
                zac.zab(parcel);
                break;
            }
            case 3: {
                Object object = ConnectionResult.CREATOR;
                object = (ConnectionResult)zac.zaa(parcel, object);
                object = zaa.CREATOR;
                object = (zaa)zac.zaa(parcel, object);
                zac.zab(parcel);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

