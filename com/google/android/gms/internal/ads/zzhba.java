/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhbc;
import com.google.android.gms.internal.ads.zzhbd;
import com.google.android.gms.internal.ads.zzhbk;
import com.google.android.gms.internal.ads.zzhbl;
import com.google.android.gms.internal.ads.zzhbm;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhdd;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdo;
import com.google.android.gms.internal.ads.zzhdr;
import com.google.android.gms.internal.ads.zzhdz;
import com.google.android.gms.internal.ads.zzheb;
import com.google.android.gms.internal.ads.zzheq;
import com.google.android.gms.internal.ads.zzhfg;
import com.google.android.gms.internal.ads.zzhfi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class zzhba
extends zzhaz {
    public final int zza(Map.Entry entry) {
        return ((zzhbl)entry.getKey()).zzb;
    }

    public final zzhbd zzb(Object object) {
        return ((zzhbk)object).zza;
    }

    public final zzhbd zzc(Object object) {
        object = (zzhbk)object;
        throw null;
    }

    public final Object zzd(zzhay zzhay2, zzhde zzhde2, int n3) {
        return zzhay2.zzc(zzhde2, n3);
    }

    public final Object zze(Object object, zzhdr object2, Object object3, zzhay object4, zzhbd zzhbd2, Object object5, zzheq object6) {
        object3 = (zzhbm)object3;
        Object object7 = ((zzhbm)object3).zzd;
        int n3 = object7.zzd;
        int n4 = object7.zzb;
        if (n3 != 0 && (n3 = object7.zze) != 0) {
            object4 = zzhfg.zza;
            object4 = object7.zzc;
            int n7 = ((Enum)object4).ordinal();
            switch (n7) {
                default: {
                    object = ((zzhbm)object3).zzd;
                    object = String.valueOf((Object)((zzhbl)object).zzc);
                    object = "Type cannot be packed: ".concat((String)object);
                    object2 = new IllegalStateException((String)object);
                    throw object2;
                }
                case 17: {
                    object = new ArrayList();
                    object2.zzL((List)object);
                    break;
                }
                case 16: {
                    object = new ArrayList();
                    object2.zzK((List)object);
                    break;
                }
                case 15: {
                    object = new ArrayList();
                    object2.zzJ((List)object);
                    break;
                }
                case 14: {
                    object = new ArrayList();
                    object2.zzI((List)object);
                    break;
                }
                case 13: {
                    object4 = new ArrayList();
                    object2.zzA((List)object4);
                    object2 = ((zzhbm)object3).zzd;
                    int n8 = zzheb.zza;
                    object2 = ((zzhbl)object2).zza;
                    if (object2 != null) {
                        n8 = ((ArrayList)object4).size();
                        Object var13_16 = null;
                        int n10 = 0;
                        for (n3 = 0; n3 < n8; ++n3) {
                            Integer n14 = (Integer)((ArrayList)object4).get(n3);
                            int n15 = n14;
                            zzhbs zzhbs2 = object2.zza(n15);
                            if (zzhbs2 != null) {
                                if (n3 != n10) {
                                    ((ArrayList)object4).set(n10, n14);
                                }
                                ++n10;
                                continue;
                            }
                            object5 = zzheb.zzp(object, n4, n15, object5, (zzheq)object6);
                        }
                        if (n10 != n8) {
                            object = ((ArrayList)object4).subList(n10, n8);
                            object.clear();
                        }
                    }
                    object = object4;
                    break;
                }
                case 12: {
                    object = new ArrayList();
                    object2.zzN((List)object);
                    break;
                }
                case 7: {
                    object = new ArrayList();
                    object2.zzx((List)object);
                    break;
                }
                case 6: {
                    object = new ArrayList();
                    object2.zzB((List)object);
                    break;
                }
                case 5: {
                    object = new ArrayList();
                    object2.zzC((List)object);
                    break;
                }
                case 4: {
                    object = new ArrayList();
                    object2.zzF((List)object);
                    break;
                }
                case 3: {
                    object = new ArrayList();
                    object2.zzO((List)object);
                    break;
                }
                case 2: {
                    object = new ArrayList();
                    object2.zzG((List)object);
                    break;
                }
                case 1: {
                    object = new ArrayList();
                    object2.zzD((List)object);
                    break;
                }
                case 0: {
                    object = new ArrayList();
                    object2.zzz((List)object);
                }
            }
            object2 = ((zzhbm)object3).zzd;
            zzhbd2.zzk((zzhbc)object2, object);
        } else {
            int n16;
            object7 = object7.zzc;
            zzhfg zzhfg2 = zzhfg.zzn;
            if (object7 == zzhfg2) {
                n16 = object2.zzg();
                object4 = ((zzhbm)object3).zzd.zza.zza(n16);
                if (object4 == null) {
                    return zzheb.zzp(object, n4, n16, object5, (zzheq)object6);
                }
                object = n16;
            } else {
                int n17 = ((Enum)object7).ordinal();
                switch (n17) {
                    default: {
                        n17 = 0;
                        float f5 = 0.0f;
                        object = null;
                        break;
                    }
                    case 17: {
                        long l2 = object2.zzn();
                        object = l2;
                        break;
                    }
                    case 16: {
                        n17 = object2.zzi();
                        object = n17;
                        break;
                    }
                    case 15: {
                        long l3 = object2.zzm();
                        object = l3;
                        break;
                    }
                    case 14: {
                        n17 = object2.zzh();
                        object = n17;
                        break;
                    }
                    case 13: {
                        object = new IllegalStateException("Shouldn't reach here.");
                        throw object;
                    }
                    case 12: {
                        n17 = object2.zzj();
                        object = n17;
                        break;
                    }
                    case 11: {
                        object = object2.zzp();
                        break;
                    }
                    case 10: {
                        object = ((zzhbm)object3).zzd;
                        boolean bl2 = ((zzhbl)object).zzd;
                        if (!bl2 && (bl2 = (object = zzhbd2.zzf((zzhbc)object)) instanceof zzhbo)) {
                            object6 = zzhdo.zza();
                            object7 = object.getClass();
                            object6 = ((zzhdo)object6).zzb((Class)object7);
                            object7 = object;
                            object7 = (zzhbo)object;
                            boolean bl3 = ((zzhbo)object7).zzce();
                            if (!bl3) {
                                object7 = object6.zze();
                                object6.zzg(object7, object);
                                object = ((zzhbm)object3).zzd;
                                zzhbd2.zzk((zzhbc)object, object7);
                                object = object7;
                            }
                            object2.zzw(object, (zzhdz)object6, (zzhay)object4);
                            return object5;
                        }
                        object = ((zzhbm)object3).zzc.getClass();
                        object = object2.zzs((Class)object, (zzhay)object4);
                        break;
                    }
                    case 9: {
                        object = ((zzhbm)object3).zzd;
                        boolean bl4 = ((zzhbl)object).zzd;
                        if (!bl4 && (bl4 = (object = zzhbd2.zzf((zzhbc)object)) instanceof zzhbo)) {
                            object6 = zzhdo.zza();
                            object7 = object.getClass();
                            object6 = ((zzhdo)object6).zzb((Class)object7);
                            object7 = object;
                            object7 = (zzhbo)object;
                            boolean bl5 = ((zzhbo)object7).zzce();
                            if (!bl5) {
                                object7 = object6.zze();
                                object6.zzg(object7, object);
                                object = ((zzhbm)object3).zzd;
                                zzhbd2.zzk((zzhbc)object, object7);
                                object = object7;
                            }
                            object2.zzv(object, (zzhdz)object6, (zzhay)object4);
                            return object5;
                        }
                        object = ((zzhbm)object3).zzc.getClass();
                        object = object2.zzr((Class)object, (zzhay)object4);
                        break;
                    }
                    case 8: {
                        object = object2.zzt();
                        break;
                    }
                    case 7: {
                        n17 = (int)(object2.zzP() ? 1 : 0);
                        object = n17 != 0;
                        break;
                    }
                    case 6: {
                        n17 = object2.zzf();
                        object = n17;
                        break;
                    }
                    case 5: {
                        long l4 = object2.zzk();
                        object = l4;
                        break;
                    }
                    case 4: {
                        n17 = object2.zzg();
                        object = n17;
                        break;
                    }
                    case 3: {
                        long l7 = object2.zzo();
                        object = l7;
                        break;
                    }
                    case 2: {
                        long l8 = object2.zzl();
                        object = l8;
                        break;
                    }
                    case 1: {
                        float f6 = object2.zzb();
                        object = Float.valueOf(f6);
                        break;
                    }
                    case 0: {
                        double d2 = object2.zza();
                        object = d2;
                    }
                }
            }
            object2 = ((zzhbm)object3).zzd;
            int n18 = ((zzhbl)object2).zzd;
            if (n18 != 0) {
                zzhbd2.zzh((zzhbc)object2, object);
            } else {
                object2 = ((zzhbl)object2).zzc;
                n16 = ((Enum)object2).ordinal();
                if (n16 == (n18 = 9) || n16 == (n18 = 10)) {
                    object2 = ((zzhbm)object3).zzd;
                    if ((object2 = zzhbd2.zzf((zzhbc)object2)) != null) {
                        object4 = zzhcb.zzd;
                        object2 = ((zzhde)object2).zzcZ();
                        object = (zzhde)object;
                        object = object2.zzaS((zzhde)object).zzbs();
                    }
                }
                object2 = ((zzhbm)object3).zzd;
                zzhbd2.zzk((zzhbc)object2, object);
            }
        }
        return object5;
    }

    public final void zzf(Object object) {
        ((zzhbk)object).zza.zzi();
    }

    public final void zzg(zzhdr object, Object object2, zzhay zzhay2, zzhbd zzhbd2) {
        object2 = (zzhbm)object2;
        Class<?> clazz = ((zzhbm)object2).zzc.getClass();
        object = object.zzs(clazz, zzhay2);
        object2 = ((zzhbm)object2).zzd;
        zzhbd2.zzk((zzhbc)object2, object);
    }

    public final void zzh(zzhac object, Object object2, zzhay object3, zzhbd zzhbd2) {
        object2 = (zzhbm)object2;
        zzhdd zzhdd2 = ((zzhbm)object2).zzc.zzcY();
        object = ((zzhac)object).zzl();
        zzhdd2.zzaW((zzham)object, (zzhay)object3);
        object3 = zzhdd2.zzbs();
        object2 = ((zzhbm)object2).zzd;
        zzhbd2.zzk((zzhbc)object2, object3);
        ((zzham)object).zzz(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzi(zzhfi zzhfi2, Map.Entry object) {
        zzhbl zzhbl2 = (zzhbl)object.getKey();
        int n3 = zzhbl2.zzd;
        if (n3 != 0) {
            zzhfg zzhfg3 = zzhfg.zza;
            zzhfg3 = zzhbl2.zzc;
            n3 = zzhfg3.ordinal();
            Object var6_17 = null;
            switch (n3) {
                default: {
                    return;
                }
                case 17: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl2 = zzhbl2.zze;
                    zzheb.zzH(n3, object, zzhfi2, bl2);
                    return;
                }
                case 16: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl3 = zzhbl2.zze;
                    zzheb.zzG(n3, object, zzhfi2, bl3);
                    return;
                }
                case 15: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl4 = zzhbl2.zze;
                    zzheb.zzF(n3, object, zzhfi2, bl4);
                    return;
                }
                case 14: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl5 = zzhbl2.zze;
                    zzheb.zzE(n3, object, zzhfi2, bl5);
                    return;
                }
                case 13: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl6 = zzhbl2.zze;
                    zzheb.zzB(n3, object, zzhfi2, bl6);
                    return;
                }
                case 12: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl7 = zzhbl2.zze;
                    zzheb.zzJ(n3, object, zzhfi2, bl7);
                    return;
                }
                case 11: {
                    int n4 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    zzheb.zzu(n4, object, zzhfi2);
                    return;
                }
                case 10: {
                    boolean bl8;
                    List list = (List)object.getValue();
                    if (list == null || (bl8 = list.isEmpty())) return;
                    int n7 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    zzhdo zzhdo2 = zzhdo.zza();
                    Class<?> clazz = list.get(0).getClass();
                    zzhdz zzhdz2 = zzhdo2.zzb(clazz);
                    zzheb.zzD(n7, (List)object, zzhfi2, zzhdz2);
                    return;
                }
                case 9: {
                    boolean bl9;
                    List list = (List)object.getValue();
                    if (list == null || (bl9 = list.isEmpty())) return;
                    int n8 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    zzhdo zzhdo3 = zzhdo.zza();
                    Class<?> clazz = list.get(0).getClass();
                    zzhdz zzhdz3 = zzhdo3.zzb(clazz);
                    zzheb.zzA(n8, (List)object, zzhfi2, zzhdz3);
                    return;
                }
                case 8: {
                    int n10 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    zzheb.zzI(n10, object, zzhfi2);
                    return;
                }
                case 7: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl10 = zzhbl2.zze;
                    zzheb.zzt(n3, object, zzhfi2, bl10);
                    return;
                }
                case 6: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl11 = zzhbl2.zze;
                    zzheb.zzx(n3, object, zzhfi2, bl11);
                    return;
                }
                case 5: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl12 = zzhbl2.zze;
                    zzheb.zzy(n3, object, zzhfi2, bl12);
                    return;
                }
                case 4: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl13 = zzhbl2.zze;
                    zzheb.zzB(n3, object, zzhfi2, bl13);
                    return;
                }
                case 3: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl14 = zzhbl2.zze;
                    zzheb.zzK(n3, object, zzhfi2, bl14);
                    return;
                }
                case 2: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl15 = zzhbl2.zze;
                    zzheb.zzC(n3, object, zzhfi2, bl15);
                    return;
                }
                case 1: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl16 = zzhbl2.zze;
                    zzheb.zzz(n3, object, zzhfi2, bl16);
                    return;
                }
                case 0: {
                    n3 = zzhbl2.zzb;
                    object = (List)object.getValue();
                    boolean bl17 = zzhbl2.zze;
                    zzheb.zzv(n3, object, zzhfi2, bl17);
                    return;
                }
            }
        }
        zzhfg zzhfg5 = zzhfg.zza;
        zzhfg5 = zzhbl2.zzc;
        n3 = zzhfg5.ordinal();
        switch (n3) {
            default: {
                return;
            }
            case 17: {
                int n14 = zzhbl2.zzb;
                long l2 = (Long)object.getValue();
                zzhfi2.zzD(n14, l2);
                return;
            }
            case 16: {
                int n15 = zzhbl2.zzb;
                int n16 = (Integer)object.getValue();
                zzhfi2.zzB(n15, n16);
                return;
            }
            case 15: {
                int n17 = zzhbl2.zzb;
                long l3 = (Long)object.getValue();
                zzhfi2.zzz(n17, l3);
                return;
            }
            case 14: {
                int n18 = zzhbl2.zzb;
                int n19 = (Integer)object.getValue();
                zzhfi2.zzx(n18, n19);
                return;
            }
            case 13: {
                int n20 = zzhbl2.zzb;
                int n21 = (Integer)object.getValue();
                zzhfi2.zzr(n20, n21);
                return;
            }
            case 12: {
                int n22 = zzhbl2.zzb;
                int n24 = (Integer)object.getValue();
                zzhfi2.zzI(n22, n24);
                return;
            }
            case 11: {
                int n25 = zzhbl2.zzb;
                object = (zzhac)object.getValue();
                zzhfi2.zzd(n25, (zzhac)object);
                return;
            }
            case 10: {
                int n26 = zzhbl2.zzb;
                Object v4 = object.getValue();
                zzhdo zzhdo4 = zzhdo.zza();
                object = object.getValue().getClass();
                object = zzhdo4.zzb((Class)object);
                zzhfi2.zzv(n26, v4, (zzhdz)object);
                return;
            }
            case 9: {
                int n27 = zzhbl2.zzb;
                Object v5 = object.getValue();
                zzhdo zzhdo5 = zzhdo.zza();
                object = object.getValue().getClass();
                object = zzhdo5.zzb((Class)object);
                zzhfi2.zzq(n27, v5, (zzhdz)object);
                return;
            }
            case 8: {
                int n28 = zzhbl2.zzb;
                object = (String)object.getValue();
                zzhfi2.zzG(n28, (String)object);
                return;
            }
            case 7: {
                int n29 = zzhbl2.zzb;
                boolean bl18 = (Boolean)object.getValue();
                zzhfi2.zzb(n29, bl18);
                return;
            }
            case 6: {
                int n30 = zzhbl2.zzb;
                int n32 = (Integer)object.getValue();
                zzhfi2.zzk(n30, n32);
                return;
            }
            case 5: {
                int n34 = zzhbl2.zzb;
                long l4 = (Long)object.getValue();
                zzhfi2.zzm(n34, l4);
                return;
            }
            case 4: {
                int n35 = zzhbl2.zzb;
                int n36 = (Integer)object.getValue();
                zzhfi2.zzr(n35, n36);
                return;
            }
            case 3: {
                int n37 = zzhbl2.zzb;
                long l7 = (Long)object.getValue();
                zzhfi2.zzK(n37, l7);
                return;
            }
            case 2: {
                int n38 = zzhbl2.zzb;
                long l8 = (Long)object.getValue();
                zzhfi2.zzt(n38, l8);
                return;
            }
            case 1: {
                int n39 = zzhbl2.zzb;
                float f5 = ((Float)object.getValue()).floatValue();
                zzhfi2.zzo(n39, f5);
                return;
            }
            case 0: 
        }
        int n41 = zzhbl2.zzb;
        double d2 = (Double)object.getValue();
        zzhfi2.zzf(n41, d2);
    }

    public final boolean zzj(zzhde zzhde2) {
        return zzhde2 instanceof zzhbk;
    }
}

