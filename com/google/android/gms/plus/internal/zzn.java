/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects$ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.zzo;
import java.util.Arrays;

public final class zzn
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zzaa;
    private final String[] zzab;
    private final String[] zzac;
    private final String[] zzad;
    private final String zzae;
    private final String zzaf;
    private final String zzag;
    private final String zzah;
    private final PlusCommonExtras zzai;
    private final int zzw;

    static {
        zzo zzo2 = new zzo();
        CREATOR = zzo2;
    }

    public zzn(int n3, String string2, String[] stringArray, String[] stringArray2, String[] stringArray3, String string3, String string4, String string5, String string6, PlusCommonExtras plusCommonExtras) {
        this.zzw = n3;
        this.zzaa = string2;
        this.zzab = stringArray;
        this.zzac = stringArray2;
        this.zzad = stringArray3;
        this.zzae = string3;
        this.zzaf = string4;
        this.zzag = string5;
        this.zzah = string6;
        this.zzai = plusCommonExtras;
    }

    public zzn(String string2, String[] stringArray, String[] stringArray2, String[] stringArray3, String string3, String string4, String string5, PlusCommonExtras plusCommonExtras) {
        this.zzw = 1;
        this.zzaa = string2;
        this.zzab = stringArray;
        this.zzac = stringArray2;
        this.zzad = stringArray3;
        this.zzae = string3;
        this.zzaf = string4;
        this.zzag = null;
        this.zzah = null;
        this.zzai = plusCommonExtras;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Object object2;
        Object object3;
        int n3 = object instanceof zzn;
        if (n3 == 0) {
            return false;
        }
        object = (zzn)object;
        n3 = this.zzw;
        int n4 = ((zzn)object).zzw;
        return n3 == n4 && (n3 = (int)(Objects.equal(object3 = this.zzaa, object2 = ((zzn)object).zzaa) ? 1 : 0)) != 0 && (n3 = (int)(Arrays.equals(object3 = this.zzab, object2 = ((zzn)object).zzab) ? 1 : 0)) != 0 && (n3 = (int)(Arrays.equals(object3 = this.zzac, object2 = ((zzn)object).zzac) ? 1 : 0)) != 0 && (n3 = (int)(Arrays.equals(object3 = this.zzad, object2 = ((zzn)object).zzad) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(object3 = this.zzae, object2 = ((zzn)object).zzae) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(object3 = this.zzaf, object2 = ((zzn)object).zzaf) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(object3 = this.zzag, object2 = ((zzn)object).zzag) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(object3 = this.zzah, object2 = ((zzn)object).zzah) ? 1 : 0)) != 0 && (bl2 = Objects.equal(object3 = this.zzai, object = ((zzn)object).zzai));
    }

    public final int hashCode() {
        Integer n3 = this.zzw;
        String string2 = this.zzaa;
        String[] stringArray = this.zzab;
        String[] stringArray2 = this.zzac;
        String[] stringArray3 = this.zzad;
        String string3 = this.zzae;
        String string4 = this.zzaf;
        String string5 = this.zzag;
        String string6 = this.zzah;
        PlusCommonExtras plusCommonExtras = this.zzai;
        Object[] objectArray = new Object[]{n3, string2, stringArray, stringArray2, stringArray3, string3, string4, string5, string6, plusCommonExtras};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        Objects$ToStringHelper objects$ToStringHelper = Objects.toStringHelper(this);
        Object object = this.zzw;
        objects$ToStringHelper = objects$ToStringHelper.add("versionCode", object);
        Object object2 = this.zzaa;
        objects$ToStringHelper = objects$ToStringHelper.add("accountName", object2);
        object2 = this.zzab;
        objects$ToStringHelper = objects$ToStringHelper.add("requestedScopes", object2);
        object2 = this.zzac;
        objects$ToStringHelper = objects$ToStringHelper.add("visibleActivities", object2);
        object2 = this.zzad;
        objects$ToStringHelper = objects$ToStringHelper.add("requiredFeatures", object2);
        object2 = this.zzae;
        objects$ToStringHelper = objects$ToStringHelper.add("packageNameForAuth", object2);
        object2 = this.zzaf;
        objects$ToStringHelper = objects$ToStringHelper.add("callingPackageName", object2);
        object2 = this.zzag;
        objects$ToStringHelper = objects$ToStringHelper.add("applicationName", object2);
        object = this.zzai.toString();
        return objects$ToStringHelper.add("extra", object).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zzaa;
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        Object object = this.zzab;
        SafeParcelWriter.writeStringArray(parcel, 2, object, false);
        object = this.zzac;
        SafeParcelWriter.writeStringArray(parcel, 3, object, false);
        object = this.zzad;
        SafeParcelWriter.writeStringArray(parcel, 4, object, false);
        object = this.zzae;
        SafeParcelWriter.writeString(parcel, 5, (String)object, false);
        object = this.zzaf;
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        object = this.zzag;
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        int n7 = this.zzw;
        SafeParcelWriter.writeInt(parcel, 1000, n7);
        object = this.zzah;
        SafeParcelWriter.writeString(parcel, 8, (String)object, false);
        object = this.zzai;
        SafeParcelWriter.writeParcelable(parcel, 9, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final String[] zzc() {
        return this.zzac;
    }

    public final String zzd() {
        return this.zzae;
    }

    public final Bundle zze() {
        Bundle bundle = new Bundle();
        Object object = PlusCommonExtras.class.getClassLoader();
        bundle.setClassLoader((ClassLoader)object);
        object = SafeParcelableSerializer.serializeToBytes(this.zzai);
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", (byte[])object);
        return bundle;
    }
}

