/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzcz;
import com.google.android.gms.internal.consent_sdk.zzda;
import com.google.android.gms.internal.consent_sdk.zzdd;
import com.google.android.gms.internal.consent_sdk.zzdh;
import com.google.android.gms.internal.consent_sdk.zzdi;
import com.google.android.gms.internal.consent_sdk.zzdj;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public abstract class zzde
extends zzda
implements Set {
    private transient zzdd zza;

    public static int zzf(int n3) {
        int n4;
        if ((n3 = Math.max(n3, 2)) < (n4 = 0x2CCCCCCC)) {
            double d2;
            double d5;
            double d7;
            double d9;
            n4 = Integer.highestOneBit(n3 + -1);
            while ((d9 = (d7 = (d5 = (double)(n4 += n4) * 0.7) - (d2 = (double)n3)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) < 0) {
            }
            return n4;
        }
        n4 = 0x40000000;
        if (n3 < n4) {
            return n4;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("collection too large");
        throw illegalArgumentException;
    }

    public static zzde zzi() {
        return zzdh.zza;
    }

    public static zzde zzj(Object object, Object objectArray, Object object2, Object object3) {
        int n3 = 4;
        objectArray = new Object[n3];
        objectArray[0] = "IABTCF_TCString";
        objectArray[1] = "IABGPP_HDR_GppString";
        objectArray[2] = "IABGPP_GppSID";
        objectArray[3] = "IABUSPrivacy_String";
        return zzde.zzl(n3, objectArray);
    }

    private static zzde zzl(int n3, Object ... objectArray) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                Object[] objectArray2;
                int n7;
                int n8 = zzde.zzf(n3);
                Object[] objectArray3 = new Object[n8];
                int n10 = n8 + -1;
                int n14 = 0;
                int n15 = 0;
                block0: for (n7 = 0; n7 < n3; ++n7) {
                    objectArray2 = objectArray[n7];
                    if (objectArray2 != null) {
                        int n16 = objectArray2.hashCode();
                        int n17 = zzcz.zza(n16);
                        while (true) {
                            int n18;
                            Object object;
                            if ((object = objectArray3[n18 = n17 & n10]) == null) {
                                n17 = n15 + 1;
                                objectArray[n15] = objectArray2;
                                objectArray3[n18] = objectArray2;
                                n14 += n16;
                                n15 = n17;
                                continue block0;
                            }
                            n18 = (int)(object.equals(objectArray2) ? 1 : 0);
                            if (n18 != 0) continue block0;
                            ++n17;
                        }
                    }
                    objectArray = hj0_0.a(n7, "at index ");
                    NullPointerException nullPointerException = new NullPointerException((String)objectArray);
                    throw nullPointerException;
                }
                n7 = 0;
                Arrays.fill(objectArray, n15, n3, null);
                if (n15 == n4) {
                    Object object = objectArray[0];
                    Objects.requireNonNull(object);
                    objectArray = new zzdi(object);
                    return objectArray;
                }
                n3 = zzde.zzf(n15);
                if (n3 >= (n8 /= 2)) {
                    n3 = 3;
                    if (n15 < n3) {
                        objectArray = Arrays.copyOf(objectArray, n15);
                    }
                    objectArray2 = objectArray;
                    zzdh zzdh2 = new zzdh(objectArray, n14, objectArray3, n10, n15);
                    return zzdh2;
                }
                return zzde.zzl(n15, objectArray);
            }
            Object object = objectArray[0];
            Objects.requireNonNull(object);
            objectArray = new zzdi(object);
            return objectArray;
        }
        return zzdh.zza;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n4 = object instanceof zzde;
        if (n4 != 0 && (n4 = this.zzk()) != 0) {
            Object object2 = object;
            object2 = (zzde)object;
            n4 = ((zzde)object2).zzk();
            if (n4 != 0) {
                n4 = this.hashCode();
                if (n4 != (n3 = object.hashCode())) return false;
            }
        }
        if (object == this) return bl2;
        n4 = object instanceof Set;
        if (n4 == 0) return false;
        object = (Set)object;
        n4 = this.size();
        n3 = object.size();
        if (n4 != n3) return false;
        try {
            boolean bl3 = this.containsAll((Collection<?>)object);
            if (bl3) return bl2;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n3;
        Iterator iterator = this.iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            Object e2 = iterator.next();
            if (e2 != null) {
                n3 = e2.hashCode();
            } else {
                n3 = 0;
                e2 = null;
            }
            n4 += n3;
        }
        return n4;
    }

    public abstract zzdj zzd();

    public final zzdd zzg() {
        zzdd zzdd2 = this.zza;
        if (zzdd2 == null) {
            this.zza = zzdd2 = this.zzh();
        }
        return zzdd2;
    }

    public zzdd zzh() {
        Object[] objectArray = this.toArray();
        int n3 = zzdd.zzd;
        n3 = objectArray.length;
        return zzdd.zzg(objectArray, n3);
    }

    public boolean zzk() {
        return false;
    }
}

