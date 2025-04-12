/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.internal.b;
import com.google.android.play.core.assetpacks.internal.c;
import com.google.android.play.core.assetpacks.internal.j;
import com.google.android.play.core.assetpacks.internal.k;

public abstract class i
extends b
implements j {
    public i() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    public final boolean a(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 2;
        String string2 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback";
        boolean bl2 = false;
        Object object = null;
        if (n3 != n7) {
            n7 = 3;
            if (n3 != n7) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            creator = (Bundle)c.a(parcel, creator);
            parcel2 = parcel.readStrongBinder();
            if (parcel2 != null) {
                bl2 = (string2 = parcel2.queryLocalInterface(string2)) instanceof k;
                if (bl2) {
                    object = string2;
                    object = (k)((Object)string2);
                } else {
                    object = new k((IBinder)parcel2);
                }
            }
            c.b(parcel);
            this.b((Bundle)creator, (k)object);
        } else {
            Parcelable.Creator creator = Bundle.CREATOR;
            creator = (Bundle)c.a(parcel, creator);
            parcel2 = parcel.readStrongBinder();
            if (parcel2 != null) {
                bl2 = (string2 = parcel2.queryLocalInterface(string2)) instanceof k;
                if (bl2) {
                    object = string2;
                    object = (k)((Object)string2);
                } else {
                    object = new k((IBinder)parcel2);
                }
            }
            c.b(parcel);
            this.c((Bundle)creator, (k)object);
        }
        return true;
    }
}

