/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 */
package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.phenotype.ExperimentTokens$zza;
import com.google.android.gms.phenotype.zzd;
import com.google.android.gms.phenotype.zze;
import com.google.android.gms.phenotype.zzf;
import com.google.android.gms.phenotype.zzg;
import com.google.android.gms.phenotype.zzh;
import com.google.android.gms.phenotype.zzn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExperimentTokens
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private static final ExperimentTokens$zza zzaa;
    private static final byte[][] zzn;
    private static final ExperimentTokens zzo;
    private static final ExperimentTokens$zza zzx;
    private static final ExperimentTokens$zza zzy;
    private static final ExperimentTokens$zza zzz;
    private final String zzp;
    private final byte[] zzq;
    private final byte[][] zzr;
    private final byte[][] zzs;
    private final byte[][] zzt;
    private final byte[][] zzu;
    private final int[] zzv;
    private final byte[][] zzw;

    static {
        Object object = new zzh();
        CREATOR = object;
        byte[][] byArrayArray = new byte[][]{};
        zzn = byArrayArray;
        zzo = object = new ExperimentTokens("", null, byArrayArray, byArrayArray, byArrayArray, byArrayArray, null, null);
        zzx = object = new zzd();
        zzy = object = new zze();
        zzz = object = new zzf();
        zzaa = object = new zzg();
    }

    public ExperimentTokens(String string2, byte[] byArray, byte[][] byArray2, byte[][] byArray3, byte[][] byArray4, byte[][] byArray5, int[] nArray, byte[][] byArray6) {
        this.zzp = string2;
        this.zzq = byArray;
        this.zzr = byArray2;
        this.zzs = byArray3;
        this.zzt = byArray4;
        this.zzu = byArray5;
        this.zzv = nArray;
        this.zzw = byArray6;
    }

    private static List zza(int[] nArray) {
        if (nArray == null) {
            return Collections.emptyList();
        }
        int n3 = nArray.length;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(n3);
        for (int n4 : nArray) {
            Integer n7 = n4;
            arrayList.add(n7);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List zza(byte[][] byArray) {
        if (byArray == null) {
            return Collections.emptyList();
        }
        int n3 = byArray.length;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>(n3);
        for (Object object : byArray) {
            int n4 = 3;
            object = Base64.encodeToString((byte[])object, (int)n4);
            arrayList.add((byte[])object);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void zza(StringBuilder stringBuilder, String string2, byte[][] byArray) {
        stringBuilder.append(string2);
        string2 = "=";
        stringBuilder.append(string2);
        if (byArray == null) {
            string2 = "null";
        } else {
            string2 = "(";
            stringBuilder.append(string2);
            int n3 = byArray.length;
            boolean bl2 = true;
            for (int i3 = 0; i3 < n3; ++i3) {
                String string3;
                byte[] byArray2 = byArray[i3];
                if (!bl2) {
                    string3 = ", ";
                    stringBuilder.append(string3);
                }
                string3 = "'";
                stringBuilder.append(string3);
                int n4 = 3;
                String string4 = Base64.encodeToString((byte[])byArray2, (int)n4);
                stringBuilder.append(string4);
                stringBuilder.append(string3);
                bl2 = false;
                string3 = null;
            }
            string2 = ")";
        }
        stringBuilder.append(string2);
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof ExperimentTokens;
        if (bl2) {
            boolean bl3;
            object = (ExperimentTokens)object;
            Object object2 = this.zzp;
            Object object3 = ((ExperimentTokens)object).zzp;
            bl2 = com.google.android.gms.phenotype.zzn.equals(object2, object3);
            if (bl2 && (bl2 = Arrays.equals((byte[])(object2 = (Object)this.zzq), (byte[])(object3 = (Object)((ExperimentTokens)object).zzq))) && (bl2 = com.google.android.gms.phenotype.zzn.equals(object2 = ExperimentTokens.zza(this.zzr), object3 = ExperimentTokens.zza(((ExperimentTokens)object).zzr))) && (bl2 = com.google.android.gms.phenotype.zzn.equals(object2 = ExperimentTokens.zza(this.zzs), object3 = ExperimentTokens.zza(((ExperimentTokens)object).zzs))) && (bl2 = com.google.android.gms.phenotype.zzn.equals(object2 = ExperimentTokens.zza(this.zzt), object3 = ExperimentTokens.zza(((ExperimentTokens)object).zzt))) && (bl2 = com.google.android.gms.phenotype.zzn.equals(object2 = ExperimentTokens.zza(this.zzu), object3 = ExperimentTokens.zza(((ExperimentTokens)object).zzu))) && (bl2 = com.google.android.gms.phenotype.zzn.equals(object2 = ExperimentTokens.zza(this.zzv), object3 = ExperimentTokens.zza(((ExperimentTokens)object).zzv))) && (bl3 = com.google.android.gms.phenotype.zzn.equals(object2 = ExperimentTokens.zza(this.zzw), object = ExperimentTokens.zza(((ExperimentTokens)object).zzw)))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder;
        int n3;
        StringBuilder stringBuilder2 = new StringBuilder("ExperimentTokens");
        String string2 = "(";
        stringBuilder2.append(string2);
        Object object = this.zzp;
        String string3 = "null";
        Object object2 = "'";
        if (object == null) {
            object = string3;
        } else {
            n3 = lE2.a(2, (String)object);
            stringBuilder = new StringBuilder(n3);
            stringBuilder.append((String)object2);
            stringBuilder.append((String)object);
            stringBuilder.append((String)object2);
            object = stringBuilder.toString();
        }
        stringBuilder2.append((String)object);
        stringBuilder2.append(", direct=");
        object = this.zzq;
        if (object == null) {
            stringBuilder2.append(string3);
        } else {
            stringBuilder2.append((String)object2);
            n3 = 3;
            object = Base64.encodeToString((byte[])object, (int)n3);
            stringBuilder2.append((String)object);
            stringBuilder2.append((String)object2);
        }
        object = ", ";
        stringBuilder2.append((String)object);
        Object object3 = this.zzr;
        ExperimentTokens.zza(stringBuilder2, "GAIA", object3);
        stringBuilder2.append((String)object);
        object3 = this.zzs;
        ExperimentTokens.zza(stringBuilder2, "PSEUDO", object3);
        stringBuilder2.append((String)object);
        object3 = this.zzt;
        ExperimentTokens.zza(stringBuilder2, "ALWAYS", object3);
        stringBuilder2.append((String)object);
        object3 = this.zzu;
        ExperimentTokens.zza(stringBuilder2, "OTHER", object3);
        stringBuilder2.append((String)object);
        object2 = this.zzv;
        stringBuilder2.append("weak");
        stringBuilder2.append("=");
        object3 = ")";
        if (object2 == null) {
            stringBuilder2.append(string3);
        } else {
            stringBuilder2.append(string2);
            int n4 = ((Object)object2).length;
            string3 = null;
            boolean bl2 = true;
            for (int i3 = 0; i3 < n4; ++i3) {
                Object object4 = object2[i3];
                if (!bl2) {
                    stringBuilder2.append((String)object);
                }
                stringBuilder2.append((int)object4);
                bl2 = false;
                stringBuilder = null;
            }
            stringBuilder2.append((String)object3);
        }
        stringBuilder2.append((String)object);
        object = this.zzw;
        ExperimentTokens.zza(stringBuilder2, "directs", (byte[][])object);
        stringBuilder2.append((String)object3);
        return stringBuilder2.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zzp;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        Object object = this.zzq;
        SafeParcelWriter.writeByteArray(parcel, 3, object, false);
        object = this.zzr;
        SafeParcelWriter.writeByteArrayArray(parcel, 4, (byte[][])object, false);
        object = this.zzs;
        SafeParcelWriter.writeByteArrayArray(parcel, 5, (byte[][])object, false);
        object = this.zzt;
        SafeParcelWriter.writeByteArrayArray(parcel, 6, (byte[][])object, false);
        object = this.zzu;
        SafeParcelWriter.writeByteArrayArray(parcel, 7, (byte[][])object, false);
        object = this.zzv;
        SafeParcelWriter.writeIntArray(parcel, 8, object, false);
        object = this.zzw;
        SafeParcelWriter.writeByteArrayArray(parcel, 9, (byte[][])object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

