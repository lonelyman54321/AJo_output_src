/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.icing.zzbp;
import com.google.firebase.appindexing.Indexable$Metadata;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzx;

public final class zzac
extends AbstractSafeParcelable
implements Indexable$Metadata {
    public static final Parcelable.Creator CREATOR;
    private final boolean zza;
    private final int zzb;
    private final String zzc;
    private final Bundle zzd;
    private final Bundle zze;

    static {
        zzx zzx2 = new zzx();
        CREATOR = zzx2;
    }

    public zzac(boolean bl2, int n3, String string2, Bundle bundle, Bundle bundle2) {
        this.zza = bl2;
        this.zzb = n3;
        this.zzc = string2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzd = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        this.zze = bundle2;
        ClassLoader classLoader = zzac.class.getClassLoader();
        zzbp.zza(classLoader);
        bundle2.setClassLoader(classLoader);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        int n3;
        Object object2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof zzac;
        if (!bl4) {
            return false;
        }
        object = (zzac)object;
        Object object3 = this.zza;
        bl4 = Objects.equal(object3, object2 = Boolean.valueOf((n3 = ((zzac)object).zza) != 0));
        if (bl4 && (bl4 = Objects.equal(object3 = Integer.valueOf(this.zzb), object2 = Integer.valueOf(n3 = ((zzac)object).zzb))) && (bl4 = Objects.equal(object3 = this.zzc, object2 = ((zzac)object).zzc)) && (bl4 = Thing.zzb((Bundle)(object3 = this.zzd), (Bundle)(object2 = ((zzac)object).zzd))) && (bl2 = Thing.zzb((Bundle)(object3 = this.zze), (Bundle)(object = ((zzac)object).zze)))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bl2 = this.zza;
        Integer n3 = this.zzb;
        String string2 = this.zzc;
        Integer n4 = Thing.zzc(this.zzd);
        Integer n7 = Thing.zzc(this.zze);
        Object[] objectArray = new Object[]{bl2, n3, string2, n4, n7};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = Ex0.a("worksOffline: ");
        int n3 = this.zza;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", score: ");
        n3 = this.zzb;
        stringBuilder.append(n3);
        String string2 = this.zzc;
        n3 = (int)(string2.isEmpty() ? 1 : 0);
        if (n3 == 0) {
            stringBuilder.append(", accountEmail: ");
            string2 = this.zzc;
            stringBuilder.append(string2);
        }
        string2 = this.zzd;
        String string3 = "}";
        if (string2 != null && (n3 = (int)(string2.isEmpty() ? 1 : 0)) == 0) {
            stringBuilder.append(", Properties { ");
            string2 = this.zzd;
            Thing.zza((Bundle)string2, stringBuilder);
            stringBuilder.append(string3);
        }
        if ((n3 = (int)((string2 = this.zze).isEmpty() ? 1 : 0)) == 0) {
            stringBuilder.append(", embeddingProperties { ");
            string2 = this.zze;
            Thing.zza((Bundle)string2, stringBuilder);
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeBoolean(parcel, 1, n4 != 0);
        n4 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n4);
        String string2 = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        Bundle bundle = this.zzd;
        SafeParcelWriter.writeBundle(parcel, 4, bundle, false);
        bundle = this.zze;
        SafeParcelWriter.writeBundle(parcel, 5, bundle, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

