/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadt;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzagg;
import com.google.android.gms.internal.ads.zzfu;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class zzage
extends zzagg {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzage() {
        Object object = new zzadt();
        super((zzafa)object);
        this.zzb = -9223372036854775807L;
        long[] lArray = new long[]{};
        this.zzc = lArray;
        object = new long[0];
        this.zzd = (long[])object;
    }

    private static Double zzg(zzfu zzfu2) {
        return Double.longBitsToDouble(zzfu2.zzt());
    }

    private static Object zzh(zzfu zzfu2, int n3) {
        if (n3 != 0) {
            int n4;
            String string2 = null;
            int n7 = 1;
            if (n3 != n7) {
                n7 = 2;
                if (n3 != n7) {
                    int n8 = 3;
                    if (n3 != n8) {
                        n8 = 8;
                        if (n3 != n8) {
                            n8 = 10;
                            if (n3 != n8) {
                                n4 = 11;
                                if (n3 != n4) {
                                    return null;
                                }
                                long l2 = (long)zzage.zzg(zzfu2).doubleValue();
                                Date date = new Date(l2);
                                zzfu2.zzL(n7);
                                return date;
                            }
                            n3 = zzfu2.zzp();
                            ArrayList<Object> arrayList = new ArrayList<Object>(n3);
                            for (n4 = 0; n4 < n3; ++n4) {
                                n8 = zzfu2.zzm();
                                Object object = zzage.zzh(zzfu2, n8);
                                if (object == null) continue;
                                arrayList.add(object);
                            }
                            return arrayList;
                        }
                        return zzage.zzj(zzfu2);
                    }
                    HashMap<String, Object> hashMap = new HashMap<String, Object>();
                    while (true) {
                        string2 = zzage.zzi(zzfu2);
                        n7 = zzfu2.zzm();
                        if (n7 == (n8 = 9)) {
                            return hashMap;
                        }
                        Object object = zzage.zzh(zzfu2, n7);
                        if (object == null) continue;
                        hashMap.put(string2, object);
                    }
                }
                return zzage.zzi(zzfu2);
            }
            int n10 = zzfu2.zzm();
            if (n10 == n7) {
                n4 = 1;
            }
            return n4 != 0;
        }
        return zzage.zzg(zzfu2);
    }

    private static String zzi(zzfu object) {
        int n3 = ((zzfu)object).zzq();
        int n4 = ((zzfu)object).zzd();
        ((zzfu)object).zzL(n3);
        object = ((zzfu)object).zzM();
        String string2 = new String((byte[])object, n4, n3);
        return string2;
    }

    private static HashMap zzj(zzfu zzfu2) {
        int n3 = zzfu2.zzp();
        HashMap<String, Object> hashMap = new HashMap<String, Object>(n3);
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = zzage.zzi(zzfu2);
            int n4 = zzfu2.zzm();
            Object object = zzage.zzh(zzfu2, n4);
            if (object == null) continue;
            hashMap.put(string2, object);
        }
        return hashMap;
    }

    public final boolean zza(zzfu zzfu2) {
        return true;
    }

    public final boolean zzb(zzfu object, long l2) {
        Object object2;
        String string2;
        int n3;
        int n4 = ((zzfu)object).zzm();
        if (n4 == (n3 = 2) && (n4 = (int)((string2 = "onMetaData").equals(object2 = zzage.zzi((zzfu)object)) ? 1 : 0)) != 0 && (n4 = ((zzfu)object).zzb()) != 0 && (n4 = ((zzfu)object).zzm()) == (n3 = 8)) {
            double d2;
            double d5;
            double d7;
            double d9;
            object = zzage.zzj((zzfu)object);
            object2 = object.get("duration");
            n3 = object2 instanceof Double;
            double d12 = 1000000.0;
            if (n3 != 0 && (d9 = (d7 = (d5 = ((Double)(object2 = (Double)object2)).doubleValue()) - (d2 = 0.0)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) > 0) {
                this.zzb = l2 = (long)(d5 *= d12);
            }
            if ((n4 = (object = object.get(object2 = "keyframes")) instanceof Map) != 0) {
                object = (Map)object;
                object2 = object.get("filepositions");
                string2 = "times";
                object = object.get(string2);
                n3 = object2 instanceof List;
                if (n3 != 0 && (n3 = object instanceof List) != 0) {
                    object2 = (List)object2;
                    object = (List)object;
                    n3 = object.size();
                    long[] lArray = new long[n3];
                    this.zzc = lArray;
                    lArray = new long[n3];
                    this.zzd = lArray;
                    lArray = null;
                    for (int i3 = 0; i3 < n3; ++i3) {
                        Object object3 = object2.get(i3);
                        Object object4 = object.get(i3);
                        boolean bl2 = object4 instanceof Double;
                        if (bl2 && (bl2 = object3 instanceof Double)) {
                            long l3;
                            long[] lArray2 = this.zzc;
                            double d13 = (Double)object4 * d12;
                            lArray2[i3] = l3 = (long)d13;
                            object4 = this.zzd;
                            object3 = (Double)object3;
                            long l4 = ((Double)object3).longValue();
                            object4[i3] = l4;
                            continue;
                        }
                        object = new long[0];
                        this.zzc = (long[])object;
                        object = new long[0];
                        this.zzd = (long[])object;
                        break;
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}

