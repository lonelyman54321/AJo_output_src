/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzaj;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzay;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzbp;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.Iterator;
import java.util.List;

public final class zzbi
extends zzay {
    public zzbi() {
        List list = this.zza;
        zzbv zzbv2 = zzbv.zzy;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzz;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzaa;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzab;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzac;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzad;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzae;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzbj;
        list.add(zzbv2);
    }

    private static zzaq zza(zzbm zzbm2, zzaq object, zzaq zzaq2) {
        object = object.zzh();
        return zzbi.zza(zzbm2, (Iterator)object, zzaq2);
    }

    private static zzaq zza(zzbm zzbm2, Iterator iterator, zzaq zzaq2) {
        if (iterator != null) {
            boolean bl2;
            while (bl2 = iterator.hasNext()) {
                Object object = (zzaq)iterator.next();
                object = zzbm2.zza((zzaq)object);
                Object object2 = zzaq2;
                object2 = (zzaf)zzaq2;
                boolean bl3 = (object = ((zzh)object).zza((zzaf)object2)) instanceof zzaj;
                if (!bl3) continue;
                String string2 = "break";
                object2 = ((zzaj)(object = (zzaj)object)).zzb();
                bl3 = string2.equals(object2);
                if (bl3) {
                    return zzaq.zzc;
                }
                object2 = "return";
                string2 = ((zzaj)object).zzb();
                bl3 = ((String)object2).equals(string2);
                if (!bl3) continue;
                return object;
            }
        }
        return zzaq.zzc;
    }

    private static zzaq zzb(zzbm object, zzaq object2, zzaq zzaq2) {
        boolean bl2 = object2 instanceof Iterable;
        if (bl2) {
            object2 = ((Iterable)object2).iterator();
            return zzbi.zza((zzbm)object, (Iterator)object2, zzaq2);
        }
        object = new IllegalArgumentException("Non-iterable type in for...of loop.");
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final zzaq zza(String object, zzh zzh2, List object2) {
        int[] nArray = zzbl.zza;
        Object object3 = zzg.zza((String)object);
        int n3 = ((Enum)object3).ordinal();
        int n4 = nArray[n3];
        n3 = 4;
        String string2 = "return";
        String string3 = "break";
        int n7 = 3;
        int n8 = 2;
        int n10 = 1;
        switch (n4) {
            default: {
                return this.zza((String)object);
            }
            case 8: {
                String string4;
                zzg.zza(zzbv.zzbj, n3, (List)object2);
                object = (zzaq)object2.get(0);
                zzaq zzaq2 = (zzaq)object2.get(n10);
                object3 = (zzaq)object2.get(n8);
                object2 = (zzaq)object2.get(n7);
                object2 = zzh2.zza((zzaq)object2);
                object3 = zzh2.zza((zzaq)object3).zzd();
                n3 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
                if (n3 != 0) {
                    object3 = object2;
                    object3 = (zzaf)object2;
                    n7 = (object3 = zzh2.zza((zzaf)object3)) instanceof zzaj;
                    if (n7 != 0) {
                        string4 = ((zzaj)(object3 = (zzaj)object3)).zzb();
                        n7 = (int)(string3.equals(string4) ? 1 : 0);
                        if (n7 != 0) return zzaq.zzc;
                        string4 = ((zzaj)object3).zzb();
                        n7 = (int)(string2.equals(string4) ? 1 : 0);
                        if (n7 != 0) {
                            return object3;
                        }
                    }
                }
                while ((n3 = (int)(((Boolean)(object3 = zzh2.zza((zzaq)object).zzd())).booleanValue() ? 1 : 0)) != 0) {
                    object3 = object2;
                    object3 = (zzaf)object2;
                    n7 = (object3 = zzh2.zza((zzaf)object3)) instanceof zzaj;
                    if (n7 != 0) {
                        string4 = ((zzaj)(object3 = (zzaj)object3)).zzb();
                        n7 = (int)(string3.equals(string4) ? 1 : 0);
                        if (n7 != 0) return zzaq.zzc;
                        string4 = ((zzaj)object3).zzb();
                        n7 = (int)(string2.equals(string4) ? 1 : 0);
                        if (n7 != 0) {
                            return object3;
                        }
                    }
                    zzh2.zza(zzaq2);
                }
                return zzaq.zzc;
            }
            case 7: {
                zzg.zza(zzbv.zzae, n7, (List)object2);
                object = object2.get(0);
                boolean bl2 = object instanceof zzas;
                if (bl2) {
                    object = ((zzaq)object2.get(0)).zzf();
                    zzaq zzaq4 = (zzaq)object2.get(n10);
                    zzaq4 = zzh2.zza(zzaq4);
                    object2 = (zzaq)object2.get(n8);
                    object2 = zzh2.zza((zzaq)object2);
                    object3 = new zzbn(zzh2, (String)object);
                    return zzbi.zzb((zzbm)object3, zzaq4, (zzaq)object2);
                }
                object = new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                throw object;
            }
            case 6: {
                zzg.zza(zzbv.zzad, n7, (List)object2);
                object = object2.get(0);
                boolean bl3 = object instanceof zzas;
                if (bl3) {
                    object = ((zzaq)object2.get(0)).zzf();
                    zzaq zzaq6 = (zzaq)object2.get(n10);
                    zzaq6 = zzh2.zza(zzaq6);
                    object2 = (zzaq)object2.get(n8);
                    object2 = zzh2.zza((zzaq)object2);
                    object3 = new zzbk(zzh2, (String)object);
                    return zzbi.zzb((zzbm)object3, zzaq6, (zzaq)object2);
                }
                object = new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                throw object;
            }
            case 5: {
                zzg.zza(zzbv.zzac, n7, (List)object2);
                object = object2.get(0);
                boolean bl4 = object instanceof zzas;
                if (bl4) {
                    object = ((zzaq)object2.get(0)).zzf();
                    zzaq zzaq8 = (zzaq)object2.get(n10);
                    zzaq8 = zzh2.zza(zzaq8);
                    object2 = (zzaq)object2.get(n8);
                    object2 = zzh2.zza((zzaq)object2);
                    object3 = new zzbp(zzh2, (String)object);
                    return zzbi.zzb((zzbm)object3, zzaq8, (zzaq)object2);
                }
                object = new IllegalArgumentException("Variable name in FOR_OF must be a string");
                throw object;
            }
            case 4: {
                zzg.zza(zzbv.zzab, n3, (List)object2);
                object = (zzaq)object2.get(0);
                object = zzh2.zza((zzaq)object);
                n4 = object instanceof zzaf;
                if (n4 != 0) {
                    Object object4;
                    String string5;
                    object = (zzaf)object;
                    zzaq zzaq9 = (zzaq)object2.get(n10);
                    object3 = (zzaq)object2.get(n8);
                    object2 = (zzaq)object2.get(n7);
                    object2 = zzh2.zza((zzaq)object2);
                    Object object5 = zzh2.zza();
                    Object object6 = null;
                    for (n8 = 0; n8 < (n10 = ((zzaf)object).zzb()); ++n8) {
                        string5 = ((zzaf)object).zza(n8).zzf();
                        object4 = zzh2.zza(string5);
                        ((zzh)object5).zzc(string5, (zzaq)object4);
                    }
                    while ((n8 = (int)(((Boolean)(object6 = zzh2.zza(zzaq9).zzd())).booleanValue() ? 1 : 0)) != 0) {
                        int n14;
                        object6 = object2;
                        object6 = (zzaf)object2;
                        n10 = (object6 = zzh2.zza((zzaf)object6)) instanceof zzaj;
                        if (n10 != 0) {
                            string5 = ((zzaj)(object6 = (zzaj)object6)).zzb();
                            n10 = (int)(string3.equals(string5) ? 1 : 0);
                            if (n10 != 0) return zzaq.zzc;
                            string5 = ((zzaj)object6).zzb();
                            n10 = (int)(string2.equals(string5) ? 1 : 0);
                            if (n10 != 0) {
                                return object6;
                            }
                        }
                        object6 = zzh2.zza();
                        string5 = null;
                        for (n10 = 0; n10 < (n14 = ((zzaf)object).zzb()); ++n10) {
                            object4 = ((zzaf)object).zza(n10).zzf();
                            zzaq zzaq10 = ((zzh)object5).zza((String)object4);
                            ((zzh)object6).zzc((String)object4, zzaq10);
                        }
                        ((zzh)object6).zza((zzaq)object3);
                        object5 = object6;
                    }
                    return zzaq.zzc;
                }
                object = new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                throw object;
            }
            case 3: {
                zzg.zza(zzbv.zzaa, n7, (List)object2);
                object = object2.get(0);
                boolean bl5 = object instanceof zzas;
                if (bl5) {
                    object = ((zzaq)object2.get(0)).zzf();
                    zzaq zzaq12 = (zzaq)object2.get(n10);
                    zzaq12 = zzh2.zza(zzaq12);
                    object2 = (zzaq)object2.get(n8);
                    object2 = zzh2.zza((zzaq)object2);
                    object3 = new zzbn(zzh2, (String)object);
                    return zzbi.zza((zzbm)object3, zzaq12, (zzaq)object2);
                }
                object = new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                throw object;
            }
            case 2: {
                zzg.zza(zzbv.zzz, n7, (List)object2);
                object = object2.get(0);
                boolean bl6 = object instanceof zzas;
                if (bl6) {
                    object = ((zzaq)object2.get(0)).zzf();
                    zzaq zzaq14 = (zzaq)object2.get(n10);
                    zzaq14 = zzh2.zza(zzaq14);
                    object2 = (zzaq)object2.get(n8);
                    object2 = zzh2.zza((zzaq)object2);
                    object3 = new zzbk(zzh2, (String)object);
                    return zzbi.zza((zzbm)object3, zzaq14, (zzaq)object2);
                }
                object = new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                throw object;
            }
            case 1: 
        }
        zzg.zza(zzbv.zzy, n7, (List)object2);
        object = object2.get(0);
        boolean bl7 = object instanceof zzas;
        if (bl7) {
            object = ((zzaq)object2.get(0)).zzf();
            zzaq zzaq16 = (zzaq)object2.get(n10);
            zzaq16 = zzh2.zza(zzaq16);
            object2 = (zzaq)object2.get(n8);
            object2 = zzh2.zza((zzaq)object2);
            object3 = new zzbp(zzh2, (String)object);
            return zzbi.zza((zzbm)object3, zzaq16, (zzaq)object2);
        }
        object = new IllegalArgumentException("Variable name in FOR_IN must be a string");
        throw object;
    }
}

