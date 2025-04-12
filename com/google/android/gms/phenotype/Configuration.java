/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.phenotype.zzc;
import com.google.android.gms.phenotype.zzi;
import com.google.android.gms.phenotype.zzn;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Configuration
extends AbstractSafeParcelable
implements Comparable {
    public static final Parcelable.Creator CREATOR;
    private final int zzc;
    private final zzi[] zzd;
    private final String[] zze;
    private final Map zzf;

    static {
        zzc zzc2 = new zzc();
        CREATOR = zzc2;
    }

    public Configuration(int n3, zzi[] zziArray, String[] stringArray) {
        TreeMap treeMap;
        this.zzc = n3;
        this.zzd = zziArray;
        this.zzf = treeMap = new TreeMap();
        for (zzi zzi2 : zziArray) {
            Map map2 = this.zzf;
            String string2 = zzi2.name;
            map2.put(string2, zzi2);
        }
        this.zze = stringArray;
        if (stringArray != null) {
            Arrays.sort(stringArray);
        }
    }

    public /* synthetic */ int compareTo(Object object) {
        object = (Configuration)object;
        int n3 = this.zzc;
        int n4 = ((Configuration)object).zzc;
        return n3 - n4;
    }

    public boolean equals(Object objectArray) {
        int n3 = objectArray instanceof Configuration;
        if (n3 != 0) {
            boolean bl2;
            Map map2;
            Object[] objectArray2;
            objectArray = (Configuration)objectArray;
            n3 = this.zzc;
            int n4 = objectArray.zzc;
            if (n3 == n4 && (n3 = (int)(zzn.equals(objectArray2 = this.zzf, map2 = objectArray.zzf) ? 1 : 0)) != 0 && (bl2 = Arrays.equals(objectArray2 = this.zze, objectArray = objectArray.zze))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String string2;
        StringBuilder stringBuilder = new StringBuilder("Configuration(");
        int n3 = this.zzc;
        stringBuilder.append(n3);
        stringBuilder.append(", (");
        Iterator object = this.zzf.values().iterator();
        while (true) {
            int n4 = object.hasNext();
            string2 = ", ";
            if (n4 == 0) break;
            zzi zzi2 = (zzi)object.next();
            stringBuilder.append(zzi2);
            stringBuilder.append(string2);
        }
        stringBuilder.append("), (");
        String[] stringArray = this.zze;
        if (stringArray != null) {
            for (String string3 : stringArray) {
                stringBuilder.append(string3);
                stringBuilder.append(string2);
            }
        } else {
            String string4 = "null";
            stringBuilder.append(string4);
        }
        stringBuilder.append("))");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        Object[] objectArray = this.zzd;
        SafeParcelWriter.writeTypedArray(parcel, 3, objectArray, n3, false);
        objectArray = this.zze;
        SafeParcelWriter.writeStringArray(parcel, 4, (String[])objectArray, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

