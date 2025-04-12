/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.ClearcutLogger$zzb;
import com.google.android.gms.clearcut.zzf;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;

public final class zze
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final zzha zzaa;
    public zzr zzag;
    public byte[] zzah;
    private int[] zzai;
    private String[] zzaj;
    private int[] zzak;
    private byte[][] zzal;
    private ExperimentTokens[] zzam;
    public final ClearcutLogger$zzb zzan;
    public final ClearcutLogger$zzb zzt;
    private boolean zzz;

    static {
        zzf zzf2 = new zzf();
        CREATOR = zzf2;
    }

    public zze(zzr zzr2, zzha zzha2, ClearcutLogger$zzb clearcutLogger$zzb, ClearcutLogger$zzb clearcutLogger$zzb2, int[] nArray, String[] stringArray, int[] nArray2, byte[][] byArray, ExperimentTokens[] experimentTokensArray, boolean bl2) {
        this.zzag = zzr2;
        this.zzaa = zzha2;
        this.zzt = clearcutLogger$zzb;
        this.zzan = null;
        this.zzai = nArray;
        this.zzaj = null;
        this.zzak = nArray2;
        this.zzal = null;
        this.zzam = null;
        this.zzz = bl2;
    }

    public zze(zzr zzr2, byte[] byArray, int[] nArray, String[] stringArray, int[] nArray2, byte[][] byArray2, boolean bl2, ExperimentTokens[] experimentTokensArray) {
        this.zzag = zzr2;
        this.zzah = byArray;
        this.zzai = nArray;
        this.zzaj = stringArray;
        this.zzaa = null;
        this.zzt = null;
        this.zzan = null;
        this.zzak = nArray2;
        this.zzal = byArray2;
        this.zzam = experimentTokensArray;
        this.zzz = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zze;
        if (bl3) {
            boolean bl4;
            object = (zze)object;
            Object object2 = this.zzag;
            Object object3 = ((zze)object).zzag;
            bl3 = Objects.equal(object2, object3);
            if (bl3 && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.zzah), (byte[])(object3 = (Object)((zze)object).zzah))) && (bl3 = Arrays.equals((int[])(object2 = (Object)this.zzai), (int[])(object3 = (Object)((zze)object).zzai))) && (bl3 = Arrays.equals(object2 = this.zzaj, object3 = ((zze)object).zzaj)) && (bl3 = Objects.equal(object2 = this.zzaa, object3 = ((zze)object).zzaa)) && (bl3 = Objects.equal(object2 = this.zzt, object3 = ((zze)object).zzt)) && (bl3 = Objects.equal(object2 = this.zzan, object3 = ((zze)object).zzan)) && (bl3 = Arrays.equals((int[])(object2 = (Object)this.zzak), (int[])(object3 = (Object)((zze)object).zzak))) && (bl3 = Arrays.deepEquals(object2 = (Object)this.zzal, object3 = (Object)((zze)object).zzal)) && (bl3 = Arrays.equals(object2 = this.zzam, object3 = ((zze)object).zzam)) && (bl3 = this.zzz) == (bl4 = ((zze)object).zzz)) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        zzr zzr2 = this.zzag;
        byte[] byArray = this.zzah;
        int[] nArray = this.zzai;
        String[] stringArray = this.zzaj;
        zzha zzha2 = this.zzaa;
        ClearcutLogger$zzb clearcutLogger$zzb = this.zzt;
        ClearcutLogger$zzb clearcutLogger$zzb2 = this.zzan;
        int[] nArray2 = this.zzak;
        byte[][] byArray2 = this.zzal;
        ExperimentTokens[] experimentTokensArray = this.zzam;
        Boolean bl2 = this.zzz;
        Object[] objectArray = new Object[]{zzr2, byArray, nArray, stringArray, zzha2, clearcutLogger$zzb, clearcutLogger$zzb2, nArray2, byArray2, experimentTokensArray, bl2};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder("LogEventParcelable[");
        Object object = this.zzag;
        stringBuilder.append(object);
        stringBuilder.append(", LogEventBytes: ");
        object = this.zzah;
        if (object == null) {
            bl2 = false;
            object = null;
        } else {
            String string2 = new String((byte[])object);
            object = string2;
        }
        stringBuilder.append((String)object);
        stringBuilder.append(", TestCodes: ");
        object = Arrays.toString(this.zzai);
        stringBuilder.append((String)object);
        stringBuilder.append(", MendelPackages: ");
        object = Arrays.toString(this.zzaj);
        stringBuilder.append((String)object);
        stringBuilder.append(", LogEvent: ");
        object = this.zzaa;
        stringBuilder.append(object);
        stringBuilder.append(", ExtensionProducer: ");
        object = this.zzt;
        stringBuilder.append(object);
        stringBuilder.append(", VeProducer: ");
        object = this.zzan;
        stringBuilder.append(object);
        stringBuilder.append(", ExperimentIDs: ");
        object = Arrays.toString(this.zzak);
        stringBuilder.append((String)object);
        stringBuilder.append(", ExperimentTokens: ");
        object = Arrays.toString((Object[])this.zzal);
        stringBuilder.append((String)object);
        stringBuilder.append(", ExperimentTokensParcelables: ");
        object = Arrays.toString(this.zzam);
        stringBuilder.append((String)object);
        stringBuilder.append(", AddPhenotypeExperimentTokens: ");
        bl2 = this.zzz;
        return Vm.a("]", bl2, stringBuilder);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        zzr zzr2 = this.zzag;
        SafeParcelWriter.writeParcelable(parcel, 2, zzr2, n3, false);
        Object object = this.zzah;
        SafeParcelWriter.writeByteArray(parcel, 3, object, false);
        object = this.zzai;
        SafeParcelWriter.writeIntArray(parcel, 4, object, false);
        object = this.zzaj;
        SafeParcelWriter.writeStringArray(parcel, 5, (String[])object, false);
        object = this.zzak;
        SafeParcelWriter.writeIntArray(parcel, 6, object, false);
        object = this.zzal;
        SafeParcelWriter.writeByteArrayArray(parcel, 7, (byte[][])object, false);
        boolean bl2 = this.zzz;
        SafeParcelWriter.writeBoolean(parcel, 8, bl2);
        object = this.zzam;
        SafeParcelWriter.writeTypedArray(parcel, 9, (Parcelable[])object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

