/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.Process
 */
package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzex;
import com.google.android.gms.internal.location.zzf;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class zze
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final zzd zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final List zzf;
    private final zze zzg;

    static {
        Object object = new zzd(null);
        zza = object;
        object = new zzf();
        CREATOR = object;
        Process.myUid();
        Process.myPid();
    }

    public zze(int n3, String string2, String string3, String string4, List list, zze zze2) {
        boolean bl2;
        String string5 = "packageName";
        Intrinsics.checkNotNullParameter(string2, string5);
        if (zze2 != null && (bl2 = zze2.zza())) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed requirement.");
            throw illegalArgumentException;
        }
        this.zzb = n3;
        this.zzc = string2;
        this.zzd = string3;
        n3 = 0;
        Object object = null;
        if (string4 == null) {
            string4 = zze2 != null ? zze2.zze : null;
        }
        this.zze = string4;
        if (list == null) {
            if (zze2 != null) {
                object = zze2.zzf;
            }
            list = object;
            if (object == null) {
                list = zzex.zzi();
                object = "of(...)";
                Intrinsics.checkNotNullExpressionValue(list, (String)object);
            }
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        object = zzex.zzj(list);
        Intrinsics.checkNotNullExpressionValue(object, "copyOf(...)");
        this.zzf = object;
        this.zzg = zze2;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof zze;
        if (n3 != 0) {
            boolean bl2;
            Object object2;
            Object object3;
            n3 = this.zzb;
            object = (zze)object;
            int n4 = ((zze)object).zzb;
            if (n3 == n4 && (n3 = (int)(Intrinsics.areEqual(object3 = this.zzc, object2 = ((zze)object).zzc) ? 1 : 0)) != 0 && (n3 = (int)(Intrinsics.areEqual(object3 = this.zzd, object2 = ((zze)object).zzd) ? 1 : 0)) != 0 && (n3 = (int)(Intrinsics.areEqual(object3 = this.zze, object2 = ((zze)object).zze) ? 1 : 0)) != 0 && (n3 = (int)(Intrinsics.areEqual(object3 = this.zzg, object2 = ((zze)object).zzg) ? 1 : 0)) != 0 && (bl2 = Intrinsics.areEqual(object3 = this.zzf, object = ((zze)object).zzf))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer n3 = this.zzb;
        String string2 = this.zzc;
        String string3 = this.zzd;
        String string4 = this.zze;
        zze zze2 = this.zzg;
        Object[] objectArray = new Object[]{n3, string2, string3, string4, zze2};
        return Arrays.hashCode(objectArray);
    }

    public final String toString() {
        int n3;
        String string2 = this.zzc;
        int n4 = string2.length() + 18;
        CharSequence charSequence = this.zzd;
        int n7 = 0;
        if (charSequence != null) {
            n3 = ((String)charSequence).length();
        } else {
            n3 = 0;
            charSequence = null;
        }
        charSequence = new StringBuilder(n4 += n3);
        n4 = this.zzb;
        ((StringBuilder)charSequence).append(n4);
        string2 = "/";
        ((StringBuilder)charSequence).append(string2);
        String string3 = this.zzc;
        ((StringBuilder)charSequence).append(string3);
        string3 = this.zzd;
        if (string3 != null) {
            ((StringBuilder)charSequence).append("[");
            String string4 = this.zzc;
            int n8 = b.s(string3, string4, false);
            if (n8 != 0) {
                string4 = this.zzc;
                int n10 = string3.length();
                n8 = string4.length();
                ((StringBuilder)charSequence).append(string3, n8, n10);
            } else {
                ((StringBuilder)charSequence).append(string3);
            }
            string3 = "]";
            ((StringBuilder)charSequence).append(string3);
        }
        if ((string3 = this.zze) != null) {
            ((StringBuilder)charSequence).append(string2);
            string2 = this.zze;
            if (string2 != null) {
                n7 = string2.hashCode();
            }
            string2 = Integer.toHexString(n7);
            ((StringBuilder)charSequence).append(string2);
        }
        string2 = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        int n4 = this.zzb;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        Object object = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        Object object2 = this.zzd;
        SafeParcelWriter.writeString(parcel, 4, (String)object2, false);
        object2 = this.zze;
        SafeParcelWriter.writeString(parcel, 6, (String)object2, false);
        object2 = this.zzg;
        SafeParcelWriter.writeParcelable(parcel, 7, (Parcelable)object2, n3, false);
        object = this.zzf;
        SafeParcelWriter.writeTypedList(parcel, 8, (List)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }

    public final boolean zza() {
        zze zze2 = this.zzg;
        return zze2 != null;
    }
}

