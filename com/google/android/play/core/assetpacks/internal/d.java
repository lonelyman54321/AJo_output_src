/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.internal.a;
import com.google.android.play.core.assetpacks.internal.c;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.h;
import java.util.List;

public final class d
extends a
implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    public final void c(String string2, List list, Bundle bundle, h h3) {
        Parcel parcel = this.a();
        parcel.writeString(string2);
        parcel.writeTypedList(list);
        c.c(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)h3);
        this.b(14, parcel);
    }

    public final void d(String string2, Bundle bundle, Bundle bundle2, h h3) {
        Parcel parcel = this.a();
        parcel.writeString(string2);
        c.c(parcel, (Parcelable)bundle);
        c.c(parcel, (Parcelable)bundle2);
        parcel.writeStrongBinder((IBinder)h3);
        this.b(11, parcel);
    }

    public final void e(String string2, Bundle bundle, h h3) {
        Parcel parcel = this.a();
        parcel.writeString(string2);
        c.c(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)h3);
        this.b(5, parcel);
    }

    public final void f(String string2, Bundle bundle, h h3) {
        Parcel parcel = this.a();
        parcel.writeString(string2);
        c.c(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)h3);
        this.b(10, parcel);
    }

    public final void g(String string2, Bundle bundle, Bundle bundle2, h h3) {
        Parcel parcel = this.a();
        parcel.writeString(string2);
        c.c(parcel, (Parcelable)bundle);
        c.c(parcel, (Parcelable)bundle2);
        parcel.writeStrongBinder((IBinder)h3);
        this.b(6, parcel);
    }

    public final void h(String string2, Bundle bundle, Bundle bundle2, h h3) {
        Parcel parcel = this.a();
        parcel.writeString(string2);
        c.c(parcel, (Parcelable)bundle);
        c.c(parcel, (Parcelable)bundle2);
        parcel.writeStrongBinder((IBinder)h3);
        this.b(7, parcel);
    }

    public final void i(String string2, Bundle bundle, Bundle bundle2, h h3) {
        Parcel parcel = this.a();
        parcel.writeString(string2);
        c.c(parcel, (Parcelable)bundle);
        c.c(parcel, (Parcelable)bundle2);
        parcel.writeStrongBinder((IBinder)h3);
        this.b(9, parcel);
    }

    public final void j(String string2, Bundle bundle, Bundle bundle2, h h3) {
        Parcel parcel = this.a();
        parcel.writeString(string2);
        c.c(parcel, (Parcelable)bundle);
        c.c(parcel, (Parcelable)bundle2);
        parcel.writeStrongBinder((IBinder)h3);
        this.b(13, parcel);
    }

    public final void k(String string2, List list, Bundle bundle, h h3) {
        Parcel parcel = this.a();
        parcel.writeString(string2);
        parcel.writeTypedList(list);
        c.c(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)h3);
        this.b(12, parcel);
    }

    public final void l(String string2, List list, Bundle bundle, h h3) {
        Parcel parcel = this.a();
        parcel.writeString(string2);
        parcel.writeTypedList(list);
        c.c(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)h3);
        this.b(2, parcel);
    }
}

