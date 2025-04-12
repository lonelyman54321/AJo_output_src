/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzfjm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public final class zzfjn
implements zzfjm {
    private final Object[] zza;

    public zzfjn(zzl object, String object2, int n3, String string2, zzw zzw2) {
        int n4;
        Bundle bundle;
        ArrayList<Object> arrayList = Arrays.asList(string2.split(","));
        HashSet<String> hashSet = new HashSet<String>(arrayList);
        arrayList = new ArrayList<Object>();
        arrayList.add(string2);
        arrayList.add(object2);
        object2 = "networkType";
        int n7 = hashSet.contains(object2);
        if (n7 != 0) {
            object2 = n3;
            arrayList.add(object2);
        }
        if ((n7 = hashSet.contains(object2 = "birthday")) != 0) {
            long l2 = object.zzb;
            object2 = l2;
            arrayList.add(object2);
        }
        if ((n7 = hashSet.contains(object2 = "extras")) != 0) {
            object2 = zzfjn.zza(object.zzc);
            arrayList.add(object2);
        } else {
            object2 = "npa";
            n3 = (int)(hashSet.contains(object2) ? 1 : 0);
            if (n3 != 0) {
                bundle = object.zzc;
                object2 = bundle.getString((String)object2);
                arrayList.add(object2);
            }
        }
        object2 = "gender";
        n7 = hashSet.contains(object2);
        if (n7 != 0) {
            n7 = object.zzd;
            object2 = n7;
            arrayList.add(object2);
        }
        object2 = "keywords";
        n7 = (int)(hashSet.contains(object2) ? 1 : 0);
        n3 = 0;
        bundle = null;
        if (n7 != 0) {
            object2 = object.zze;
            if (object2 != null) {
                object2 = object2.toString();
                arrayList.add(object2);
            } else {
                arrayList.add(null);
            }
        }
        if ((n7 = (int)(hashSet.contains(object2 = "isTestDevice") ? 1 : 0)) != 0) {
            n7 = (int)(object.zzf ? 1 : 0);
            object2 = n7 != 0;
            arrayList.add(object2);
        }
        if ((n7 = hashSet.contains(object2 = "tagForChildDirectedTreatment")) != 0) {
            n7 = object.zzg;
            object2 = n7;
            arrayList.add(object2);
        }
        if ((n7 = (int)(hashSet.contains(object2 = "manualImpressionsEnabled") ? 1 : 0)) != 0) {
            n7 = (int)(object.zzh ? 1 : 0);
            object2 = n7 != 0;
            arrayList.add(object2);
        }
        if ((n7 = hashSet.contains(object2 = "publisherProvidedId")) != 0) {
            object2 = object.zzi;
            arrayList.add(object2);
        }
        if ((n7 = hashSet.contains(object2 = "location")) != 0) {
            object2 = object.zzk;
            if (object2 != null) {
                object2 = object2.toString();
                arrayList.add(object2);
            } else {
                arrayList.add(null);
            }
        }
        if ((n7 = hashSet.contains(object2 = "contentUrl")) != 0) {
            object2 = object.zzl;
            arrayList.add(object2);
        }
        if ((n7 = hashSet.contains(object2 = "networkExtras")) != 0) {
            object2 = zzfjn.zza(object.zzm);
            arrayList.add(object2);
        }
        if ((n7 = hashSet.contains(object2 = "customTargeting")) != 0) {
            object2 = zzfjn.zza(object.zzn);
            arrayList.add(object2);
        }
        if ((n7 = hashSet.contains(object2 = "categoryExclusions")) != 0) {
            object2 = object.zzo;
            if (object2 != null) {
                object2 = object2.toString();
                arrayList.add(object2);
            } else {
                arrayList.add(null);
            }
        }
        if ((n7 = hashSet.contains(object2 = "requestAgent")) != 0) {
            object2 = object.zzp;
            arrayList.add(object2);
        }
        if ((n7 = hashSet.contains(object2 = "requestPackage")) != 0) {
            object2 = object.zzq;
            arrayList.add(object2);
        }
        if ((n7 = hashSet.contains(object2 = "isDesignedForFamilies")) != 0) {
            n7 = object.zzr;
            object2 = n7 != 0;
            arrayList.add(object2);
        }
        if ((n7 = hashSet.contains(object2 = "tagForUnderAgeOfConsent")) != 0) {
            n7 = object.zzt;
            object2 = n7;
            arrayList.add(object2);
        }
        if ((n7 = (int)(hashSet.contains(object2 = "maxAdContentRating") ? 1 : 0)) != 0) {
            object = object.zzu;
            arrayList.add(object);
        }
        if ((n4 = hashSet.contains(object = "orientation")) != 0) {
            if (zzw2 != null) {
                n4 = zzw2.zza;
                object = n4;
                arrayList.add(object);
            } else {
                arrayList.add(null);
            }
        }
        object = arrayList.toArray();
        this.zza = object;
    }

    private static String zza(Bundle bundle) {
        boolean bl2;
        if (bundle == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Object object = bundle.keySet();
        Object object2 = new TreeSet(object);
        object2 = ((TreeSet)object2).iterator();
        while (bl2 = object2.hasNext()) {
            boolean bl3;
            object = (String)object2.next();
            object = (object = bundle.get((String)object)) == null ? "null" : ((bl3 = object instanceof Bundle) ? zzfjn.zza((Bundle)object) : object.toString());
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }

    public final boolean equals(Object objectArray) {
        boolean bl2 = objectArray instanceof zzfjn;
        if (!bl2) {
            return false;
        }
        objectArray = (zzfjn)objectArray;
        Object[] objectArray2 = this.zza;
        objectArray = objectArray.zza;
        return Arrays.equals(objectArray2, objectArray);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        Object object = this.zza;
        int n3 = Arrays.hashCode(object);
        object = Arrays.toString(object);
        StringBuilder stringBuilder = new StringBuilder("[PoolKey#");
        stringBuilder.append(n3);
        stringBuilder.append(" ");
        stringBuilder.append((String)object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

