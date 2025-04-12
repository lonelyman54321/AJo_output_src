/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcelable
 */
package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object object = remoteActionCompat.a;
        boolean bl2 = versionedParcel.h(1);
        if (bl2) {
            object = versionedParcel.m();
        }
        remoteActionCompat.a = object;
        object = remoteActionCompat.b;
        bl2 = versionedParcel.h(2);
        if (bl2) {
            object = versionedParcel.g();
        }
        remoteActionCompat.b = object;
        object = remoteActionCompat.c;
        bl2 = versionedParcel.h(3);
        if (bl2) {
            object = versionedParcel.g();
        }
        remoteActionCompat.c = object;
        object = remoteActionCompat.d;
        bl2 = versionedParcel.h(4);
        if (bl2) {
            object = versionedParcel.k();
        }
        object = (PendingIntent)object;
        remoteActionCompat.d = object;
        boolean bl3 = remoteActionCompat.e;
        bl2 = versionedParcel.h(5);
        if (bl2) {
            bl3 = versionedParcel.e();
        }
        remoteActionCompat.e = bl3;
        bl3 = remoteActionCompat.f;
        bl2 = versionedParcel.h(6);
        if (bl2) {
            bl3 = versionedParcel.e();
        }
        remoteActionCompat.f = bl3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        Object object = remoteActionCompat.a;
        versionedParcel.n(1);
        versionedParcel.v((qB3)object);
        object = remoteActionCompat.b;
        versionedParcel.n(2);
        versionedParcel.q((CharSequence)object);
        object = remoteActionCompat.c;
        versionedParcel.n(3);
        versionedParcel.q((CharSequence)object);
        object = remoteActionCompat.d;
        versionedParcel.n(4);
        versionedParcel.t((Parcelable)object);
        boolean bl2 = remoteActionCompat.e;
        versionedParcel.n(5);
        versionedParcel.o(bl2);
        boolean bl3 = remoteActionCompat.f;
        versionedParcel.n(6);
        versionedParcel.o(bl3);
    }
}

