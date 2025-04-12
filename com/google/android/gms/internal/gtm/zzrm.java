/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzab;
import com.google.android.gms.internal.gtm.zzaca;
import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzad;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzr;
import com.google.android.gms.internal.gtm.zzre;
import com.google.android.gms.internal.gtm.zzrf;
import com.google.android.gms.internal.gtm.zzrg;
import com.google.android.gms.internal.gtm.zzrh;
import com.google.android.gms.internal.gtm.zzri;
import com.google.android.gms.internal.gtm.zzrj;
import com.google.android.gms.internal.gtm.zzrk;
import com.google.android.gms.internal.gtm.zzx;
import com.google.android.gms.internal.gtm.zzz;
import com.google.android.gms.tagmanager.zzfp;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class zzrm {
    public static zzap zza(zzap zzap2) {
        zzak zzak2 = zzap.zzg();
        zzak2.zzt(1);
        int n3 = zzap2.zzO();
        zzak2.zzt(n3);
        zzak2.zzi();
        List list = zzap2.zzq();
        zzak2.zza(list);
        boolean bl2 = zzap2.zzN();
        zzak2.zzo(bl2);
        return (zzap)zzak2.zzB();
    }

    public static zzrg zzb(zzz zzz2) {
        Object object;
        int n3;
        ArrayList<zzre> arrayList;
        int n4;
        HashSet hashSet;
        int n7;
        int n8 = zzz2.zzf();
        Object object2 = new zzap[n8];
        int n10 = 0;
        Object object3 = null;
        zzrh zzrh2 = null;
        for (int i3 = 0; i3 < (n7 = zzz2.zzf()); ++i3) {
            hashSet = new HashSet(0);
            zzrm.zze(i3, zzz2, object2, hashSet);
        }
        n7 = 0;
        hashSet = null;
        zzrh2 = new zzrh(null);
        ArrayList<zzre> arrayList2 = new ArrayList<zzre>();
        ArrayList<zzre> arrayList3 = null;
        for (int i8 = 0; i8 < (n4 = zzz2.zze()); ++i8) {
            arrayList = zzrm.zzf(zzz2.zzi(i8), zzz2, object2);
            arrayList2.add((zzre)((Object)arrayList));
        }
        arrayList3 = new ArrayList<zzre>();
        arrayList = null;
        for (n4 = 0; n4 < (n3 = zzz2.zzc()); ++n4) {
            object = zzrm.zzf(zzz2.zzh(n4), zzz2, object2);
            arrayList3.add((zzre)object);
        }
        arrayList = new ArrayList<zzre>();
        while (n10 < (n3 = zzz2.zza())) {
            object = zzrm.zzf(zzz2.zzg(n10), zzz2, object2);
            zzrh2.zzb((zzre)object);
            arrayList.add((zzre)object);
            ++n10;
        }
        object2 = zzz2.zzq().iterator();
        while ((n10 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            int n14;
            Object object4;
            int n15;
            object3 = (zzab)object2.next();
            object = new zzrj(null);
            Object object5 = ((zzab)object3).zzh().iterator();
            while ((n15 = object5.hasNext()) != 0) {
                n15 = (Integer)object5.next();
                object4 = (zzre)arrayList3.get(n15);
                ((zzrj)object).zzg((zzre)object4);
            }
            object5 = ((zzab)object3).zzg().iterator();
            while ((n15 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                n15 = (Integer)object5.next();
                object4 = (zzre)arrayList3.get(n15);
                ((zzrj)object).zzf((zzre)object4);
            }
            object5 = ((zzab)object3).zze().iterator();
            while ((n15 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                n15 = (Integer)object5.next();
                object4 = (zzre)arrayList2.get(n15);
                ((zzrj)object).zzd((zzre)object4);
            }
            object5 = ((zzab)object3).zzf().iterator();
            while ((n15 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                n15 = (Integer)object5.next();
                object4 = zzz2.zzm(n15).zzp();
                ((zzrj)object).zze((String)object4);
            }
            object5 = ((zzab)object3).zzk().iterator();
            while ((n15 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                n15 = (Integer)object5.next();
                object4 = (zzre)arrayList2.get(n15);
                ((zzrj)object).zzj((zzre)object4);
            }
            object5 = ((zzab)object3).zzl().iterator();
            while ((n15 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                n15 = (Integer)object5.next();
                object4 = zzz2.zzm(n15).zzp();
                ((zzrj)object).zzk((String)object4);
            }
            object5 = ((zzab)object3).zzc().iterator();
            while ((n15 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                n15 = (Integer)object5.next();
                object4 = (zzre)arrayList.get(n15);
                ((zzrj)object).zzb((zzre)object4);
            }
            object5 = ((zzab)object3).zzd().iterator();
            while ((n15 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                n15 = (Integer)object5.next();
                object4 = zzz2.zzm(n15).zzp();
                ((zzrj)object).zzc((String)object4);
            }
            object5 = ((zzab)object3).zzi().iterator();
            while ((n15 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                n15 = (Integer)object5.next();
                object4 = (zzre)arrayList.get(n15);
                ((zzrj)object).zzh((zzre)object4);
            }
            object3 = ((zzab)object3).zzj().iterator();
            while ((n14 = object3.hasNext()) != 0) {
                n14 = (Integer)object3.next();
                object5 = zzz2.zzm(n14).zzp();
                ((zzrj)object).zzi((String)object5);
            }
            object3 = ((zzrj)object).zza();
            zzrh2.zzc((zzri)object3);
        }
        object2 = zzz2.zzn();
        zzrh2.zze((String)object2);
        int n16 = zzz2.zzd();
        zzrh2.zzd(n16);
        return zzrh2.zza();
    }

    public static void zzc(InputStream inputStream, OutputStream outputStream) {
        int n3 = 1024;
        byte[] byArray = new byte[n3];
        int n4;
        int n7;
        while ((n7 = inputStream.read(byArray)) != (n4 = -1)) {
            n4 = 0;
            outputStream.write(byArray, 0, n7);
        }
        return;
    }

    private static zzad zzd(zzap zzap2) {
        zzace zzace2 = zzad.zza;
        boolean bl2 = zzap2.zzW(zzace2);
        if (!bl2) {
            String string2 = String.valueOf(zzap2);
            String string3 = "Expected a ServingValue and didn't get one. Value is: ";
            string2 = string3.concat(string2);
            zzrm.zzh(string2);
        }
        return (zzad)zzap2.zzV(zzace2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zzap zze(int n3, zzz object, zzap[] zzapArray, Set set) {
        Iterator iterator;
        block11: {
            int n4;
            Object object2;
            Object object3;
            block8: {
                block12: {
                    int n7;
                    Object object4;
                    block9: {
                        int n8;
                        block10: {
                            object3 = n3;
                            n8 = set.contains(object3);
                            if (n8 != 0) {
                                iterator = set.toString();
                                object2 = new StringBuilder("Value cycle detected.  Current value reference: ");
                                ((StringBuilder)object2).append(n3);
                                object4 = ".  Previous value references: ";
                                ((StringBuilder)object2).append((String)object4);
                                ((StringBuilder)object2).append((String)((Object)iterator));
                                ((StringBuilder)object2).append(".");
                                iterator = ((StringBuilder)object2).toString();
                                zzrm.zzh((String)((Object)iterator));
                            }
                            iterator = (zzak)((zzap)zzrm.zzg(((zzz)object).zzr(), n3, "values")).zzaa();
                            object2 = zzapArray[n3];
                            if (object2 != null) {
                                return object2;
                            }
                            set.add(object3);
                            int n10 = ((zzak)((Object)iterator)).zzu();
                            n4 = 2;
                            if (n10 == n4) break block8;
                            n4 = 3;
                            if (n10 == n4) break block9;
                            n4 = 4;
                            if (n10 == n4) break block10;
                            n4 = 7;
                            if (n10 != n4) break block11;
                            object3 = (zzak)zzrm.zza((zzap)((zzaca)((Object)iterator)).zzB()).zzaa();
                            iterator = zzrm.zzd((zzap)((zzaca)((Object)iterator)).zzB());
                            ((zzak)object3).zzm();
                            iterator = ((zzad)((Object)iterator)).zzi().iterator();
                            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                                n4 = (Integer)iterator.next();
                                object2 = zzrm.zze(n4, (zzz)object, zzapArray, set);
                                ((zzak)object3).zzh((zzap)object2);
                            }
                            break block12;
                        }
                        object3 = (zzak)zzrm.zza((zzap)((zzaca)((Object)iterator)).zzB()).zzaa();
                        iterator = zzrm.zzd((zzap)((zzaca)((Object)iterator)).zzB());
                        n8 = ((zzad)((Object)iterator)).zza();
                        object = zzfp.zzm(zzfp.zzk(zzrm.zze(n8, (zzz)object, zzapArray, set)));
                        ((zzak)object3).zzr((String)object);
                        break block12;
                    }
                    object3 = (zzak)zzrm.zza((zzap)((zzaca)((Object)iterator)).zzB()).zzaa();
                    n4 = ((zzad)((Object)(iterator = zzrm.zzd((zzap)((zzaca)((Object)iterator)).zzB())))).zzc();
                    if (n4 != (n7 = ((zzad)((Object)iterator)).zzd())) {
                        n4 = ((zzad)((Object)iterator)).zzc();
                        n7 = ((zzad)((Object)iterator)).zzd();
                        String string2 = "Uneven map keys (";
                        String string3 = ") and map values (";
                        String string4 = ")";
                        object2 = z41.a(string2, string3, string4, n4, n7);
                        zzrm.zzh((String)object2);
                    }
                    ((zzak)object3).zzk();
                    ((zzak)object3).zzl();
                    object2 = ((zzad)((Object)iterator)).zzg().iterator();
                    while ((n7 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                        n7 = (Integer)object2.next();
                        object4 = zzrm.zze(n7, (zzz)object, zzapArray, set);
                        ((zzak)object3).zzf((zzap)object4);
                    }
                    iterator = ((zzad)((Object)iterator)).zzh().iterator();
                    while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        n4 = (Integer)iterator.next();
                        object2 = zzrm.zze(n4, (zzz)object, zzapArray, set);
                        ((zzak)object3).zzg((zzap)object2);
                    }
                }
                iterator = object3;
                break block11;
            }
            object3 = zzrm.zzd((zzap)((zzaca)((Object)iterator)).zzB());
            iterator = (zzak)zzrm.zza((zzap)((zzaca)((Object)iterator)).zzB()).zzaa();
            ((zzak)((Object)iterator)).zzj();
            object3 = ((zzad)object3).zzf().iterator();
            while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object2 = (Integer)object3.next();
                n4 = (Integer)object2;
                object2 = zzrm.zze(n4, (zzz)object, zzapArray, set);
                ((zzak)((Object)iterator)).zze((zzap)object2);
            }
        }
        zzapArray[n3] = object = (zzap)((zzaca)((Object)iterator)).zzB();
        Integer n14 = n3;
        set.remove(n14);
        return (zzap)((zzaca)((Object)iterator)).zzB();
    }

    private static zzre zzf(zzr object, zzz zzz2, zzap[] zzapArray) {
        int n3 = 0;
        Object object2 = null;
        zzrf zzrf2 = new zzrf(null);
        object = ((zzr)object).zzc().iterator();
        while ((n3 = object.hasNext()) != 0) {
            object2 = (Integer)object.next();
            Object object3 = zzz2.zzp();
            n3 = (Integer)object2;
            String string2 = "properties";
            object2 = (zzx)zzrm.zzg((List)object3, n3, string2);
            object3 = zzz2.zzo();
            int n4 = ((zzx)object2).zza();
            String string3 = "keys";
            object3 = (String)zzrm.zzg((List)object3, n4, string3);
            n3 = ((zzx)object2).zzc();
            if (n3 < 0 || n3 >= (n4 = zzapArray.length)) {
                string3 = " in values";
                string2 = Gj0.b(n3, "Index out of bounds detected: ", string3);
                zzrm.zzh(string2);
            }
            object2 = zzapArray[n3];
            string2 = zzb.zzcL.toString();
            n4 = (int)(string2.equals(object3) ? 1 : 0);
            if (n4 != 0) {
                zzrf2.zzc((zzap)object2);
                continue;
            }
            zzrf2.zzb((String)object3, (zzap)object2);
        }
        return zzrf2.zza();
    }

    private static Object zzg(List list, int n3, String string2) {
        int n4;
        if (n3 < 0 || n3 >= (n4 = list.size())) {
            StringBuilder stringBuilder = new StringBuilder("Index out of bounds detected: ");
            stringBuilder.append(n3);
            String string3 = " in ";
            stringBuilder.append(string3);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            zzrm.zzh(string2);
        }
        return list.get(n3);
    }

    private static void zzh(String string2) {
        zzrk zzrk2 = new zzrk(string2);
        throw zzrk2;
    }
}

