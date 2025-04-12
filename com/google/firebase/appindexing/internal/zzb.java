/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.appindexing.internal.zzy;

public final class zzb
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private int zza;
    private final boolean zzb;
    private final String zzc;
    private final String zzd;
    private final byte[] zze;
    private final boolean zzf;

    static {
        zzy zzy2 = new zzy();
        CREATOR = zzy2;
    }

    public zzb(int n3, boolean bl2, String string2, String string3, byte[] byArray, boolean bl3) {
        this.zza = n3;
        this.zzb = bl2;
        this.zzc = string2;
        this.zzd = string3;
        this.zze = byArray;
        this.zzf = bl3;
    }

    public zzb(boolean bl2, String string2, String string3, byte[] byArray, boolean bl3) {
        this.zza = 0;
        this.zzb = bl2;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MetadataImpl { { eventStatus: '");
        int bl2 = this.zza;
        stringBuilder.append(bl2);
        stringBuilder.append("' } { uploadable: '");
        boolean bl3 = this.zzb;
        stringBuilder.append(bl3);
        Object object = "' } ";
        stringBuilder.append((String)object);
        String string2 = this.zzc;
        if (string2 != null) {
            stringBuilder.append("{ completionToken: '");
            string2 = this.zzc;
            stringBuilder.append(string2);
            stringBuilder.append((String)object);
        }
        if ((string2 = this.zzd) != null) {
            stringBuilder.append("{ accountName: '");
            string2 = this.zzd;
            stringBuilder.append(string2);
            stringBuilder.append((String)object);
        }
        if ((object = (Object)this.zze) != null) {
            stringBuilder.append("{ ssbContext: [ ");
            for (Object object2 : (Object)this.zze) {
                String string3 = "0x";
                stringBuilder.append(string3);
                String string4 = Integer.toHexString((int)object2);
                stringBuilder.append(string4);
                string4 = " ";
                stringBuilder.append(string4);
            }
            object = "] } ";
            stringBuilder.append((String)object);
        }
        stringBuilder.append("{ contextOnly: '");
        boolean bl4 = this.zzf;
        return Vm.a("' } }", bl4, stringBuilder);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int bl2 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, bl2);
        boolean bl3 = this.zzb;
        SafeParcelWriter.writeBoolean(parcel, 2, bl3);
        String string2 = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        Object object = this.zzd;
        SafeParcelWriter.writeString(parcel, 4, (String)object, false);
        object = this.zze;
        SafeParcelWriter.writeByteArray(parcel, 5, (byte[])object, false);
        boolean bl4 = this.zzf;
        SafeParcelWriter.writeBoolean(parcel, 6, bl4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final void zza(int n3) {
        this.zza = n3;
    }
}

