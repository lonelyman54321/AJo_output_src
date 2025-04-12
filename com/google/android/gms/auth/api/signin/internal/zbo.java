/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.internal.zbp;
import com.google.android.gms.internal.auth-api.zbb;

public abstract class zbo
extends zbb
implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    public final boolean zba(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            int n8 = 2;
            if (n3 != n8) {
                return false;
            }
            this.zbb();
        } else {
            this.zbc();
        }
        return n7;
    }
}

