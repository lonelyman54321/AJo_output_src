/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.internal.b;
import com.google.android.play.core.assetpacks.internal.c;
import com.google.android.play.core.assetpacks.internal.h;
import java.util.List;

public abstract class g
extends b
implements h {
    public g() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    public final boolean a(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 15: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)c.a(parcel, creator);
                c.b(parcel);
                this.c((Bundle)creator);
                break;
            }
            case 14: {
                Parcelable.Creator creator = Bundle.CREATOR;
                parcel2 = (Bundle)c.a(parcel, creator);
                creator = (Bundle)c.a(parcel, creator);
                c.b(parcel);
                this.l((Bundle)parcel2, (Bundle)creator);
                break;
            }
            case 13: {
                Parcelable.Creator creator = Bundle.CREATOR;
                parcel2 = (Bundle)c.a(parcel, creator);
                creator = (Bundle)c.a(parcel, creator);
                c.b(parcel);
                this.m((Bundle)parcel2, (Bundle)creator);
                break;
            }
            case 12: {
                Parcelable.Creator creator = Bundle.CREATOR;
                parcel2 = (Bundle)c.a(parcel, creator);
                creator = (Bundle)c.a(parcel, creator);
                c.b(parcel);
                this.e((Bundle)parcel2, (Bundle)creator);
                break;
            }
            case 11: {
                Parcelable.Creator creator = Bundle.CREATOR;
                parcel2 = (Bundle)c.a(parcel, creator);
                creator = (Bundle)c.a(parcel, creator);
                c.b(parcel);
                this.h((Bundle)parcel2, (Bundle)creator);
                break;
            }
            case 10: {
                Parcelable.Creator creator = Bundle.CREATOR;
                parcel2 = (Bundle)c.a(parcel, creator);
                creator = (Bundle)c.a(parcel, creator);
                c.b(parcel);
                this.k((Bundle)parcel2, (Bundle)creator);
                break;
            }
            case 8: {
                Parcelable.Creator creator = Bundle.CREATOR;
                parcel2 = (Bundle)c.a(parcel, creator);
                creator = (Bundle)c.a(parcel, creator);
                c.b(parcel);
                this.j((Bundle)parcel2, (Bundle)creator);
                break;
            }
            case 7: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)c.a(parcel, creator);
                c.b(parcel);
                this.d((Bundle)creator);
                break;
            }
            case 6: {
                Parcelable.Creator creator = Bundle.CREATOR;
                parcel2 = (Bundle)c.a(parcel, creator);
                creator = (Bundle)c.a(parcel, creator);
                c.b(parcel);
                this.i((Bundle)parcel2, (Bundle)creator);
                break;
            }
            case 5: {
                Object object = Bundle.CREATOR;
                object = parcel.createTypedArrayList(object);
                c.b(parcel);
                this.g((List)object);
                break;
            }
            case 4: {
                n3 = parcel.readInt();
                parcel2 = Bundle.CREATOR;
                parcel2 = (Bundle)c.a(parcel, (Parcelable.Creator)parcel2);
                c.b(parcel);
                this.f(n3, (Bundle)parcel2);
                break;
            }
            case 3: {
                n3 = parcel.readInt();
                parcel2 = Bundle.CREATOR;
                parcel2 = (Bundle)c.a(parcel, (Parcelable.Creator)parcel2);
                c.b(parcel);
                this.b(n3, (Bundle)parcel2);
                break;
            }
            case 2: {
                n3 = parcel.readInt();
                parcel2 = Bundle.CREATOR;
                parcel2 = (Bundle)c.a(parcel, (Parcelable.Creator)parcel2);
                c.b(parcel);
                this.n(n3, (Bundle)parcel2);
            }
        }
        return true;
    }
}

