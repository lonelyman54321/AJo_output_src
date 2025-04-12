/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabq;
import com.google.android.gms.internal.gtm.zzabr;
import com.google.android.gms.internal.gtm.zzabu;
import com.google.android.gms.internal.gtm.zzabv;
import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacd;
import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzadt;
import com.google.android.gms.internal.gtm.zzadw;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzadz;
import com.google.android.gms.internal.gtm.zzaex;
import com.google.android.gms.internal.gtm.zzaez;
import com.google.android.gms.internal.gtm.zzyx;
import java.util.List;
import java.util.Map;

final class zzabs
extends zzabr {
    public final void zza(Object object) {
        ((zzacc)object).zza.zzi();
    }

    public final void zzb(zzadw object, Object object2, zzabq zzabq2, zzabv zzabv2) {
        object2 = (zzace)object2;
        Class<?> clazz = ((zzace)object2).zzc.getClass();
        object = object.zzs(clazz, zzabq2);
        object2 = ((zzace)object2).zzd;
        zzabv2.zzk((zzabu)object2, object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzc(zzaez zzaez2, Map.Entry object) {
        zzacd zzacd2 = (zzacd)object.getKey();
        int n3 = zzacd2.zzd;
        if (n3 != 0) {
            zzaex zzaex3 = zzaex.zza;
            zzaex3 = zzacd2.zzc;
            n3 = zzaex3.ordinal();
            Object var6_17 = null;
            switch (n3) {
                default: {
                    return;
                }
                case 17: {
                    int n4 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzF(n4, object, zzaez2, false);
                    return;
                }
                case 16: {
                    int n7 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzE(n7, object, zzaez2, false);
                    return;
                }
                case 15: {
                    int n8 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzD(n8, object, zzaez2, false);
                    return;
                }
                case 14: {
                    int n10 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzC(n10, object, zzaez2, false);
                    return;
                }
                case 13: {
                    int n14 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzz(n14, object, zzaez2, false);
                    return;
                }
                case 12: {
                    int n15 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzH(n15, object, zzaez2, false);
                    return;
                }
                case 11: {
                    int n16 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzs(n16, object, zzaez2);
                    return;
                }
                case 10: {
                    boolean bl2;
                    List list = (List)object.getValue();
                    if (list == null || (bl2 = list.isEmpty())) return;
                    int n17 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadt zzadt2 = zzadt.zza();
                    Class<?> clazz = list.get(0).getClass();
                    zzadx zzadx2 = zzadt2.zzb(clazz);
                    zzadz.zzB(n17, (List)object, zzaez2, zzadx2);
                    return;
                }
                case 9: {
                    boolean bl3;
                    List list = (List)object.getValue();
                    if (list == null || (bl3 = list.isEmpty())) return;
                    int n18 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadt zzadt3 = zzadt.zza();
                    Class<?> clazz = list.get(0).getClass();
                    zzadx zzadx3 = zzadt3.zzb(clazz);
                    zzadz.zzy(n18, (List)object, zzaez2, zzadx3);
                    return;
                }
                case 8: {
                    int n19 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzG(n19, object, zzaez2);
                    return;
                }
                case 7: {
                    int n20 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzr(n20, object, zzaez2, false);
                    return;
                }
                case 6: {
                    int n21 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzv(n21, object, zzaez2, false);
                    return;
                }
                case 5: {
                    int n22 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzw(n22, object, zzaez2, false);
                    return;
                }
                case 4: {
                    int n24 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzz(n24, object, zzaez2, false);
                    return;
                }
                case 3: {
                    int n25 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzI(n25, object, zzaez2, false);
                    return;
                }
                case 2: {
                    int n26 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzA(n26, object, zzaez2, false);
                    return;
                }
                case 1: {
                    int n27 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzx(n27, object, zzaez2, false);
                    return;
                }
                case 0: {
                    int n28 = zzacd2.zzb;
                    object = (List)object.getValue();
                    zzadz.zzt(n28, object, zzaez2, false);
                    return;
                }
            }
        }
        zzaex zzaex5 = zzaex.zza;
        zzaex5 = zzacd2.zzc;
        n3 = zzaex5.ordinal();
        switch (n3) {
            default: {
                return;
            }
            case 17: {
                int n29 = zzacd2.zzb;
                long l2 = (Long)object.getValue();
                zzaez2.zzD(n29, l2);
                return;
            }
            case 16: {
                int n30 = zzacd2.zzb;
                int n32 = (Integer)object.getValue();
                zzaez2.zzB(n30, n32);
                return;
            }
            case 15: {
                int n34 = zzacd2.zzb;
                long l3 = (Long)object.getValue();
                zzaez2.zzz(n34, l3);
                return;
            }
            case 14: {
                int n35 = zzacd2.zzb;
                int n36 = (Integer)object.getValue();
                zzaez2.zzx(n35, n36);
                return;
            }
            case 13: {
                int n37 = zzacd2.zzb;
                int n38 = (Integer)object.getValue();
                zzaez2.zzr(n37, n38);
                return;
            }
            case 12: {
                int n39 = zzacd2.zzb;
                int n41 = (Integer)object.getValue();
                zzaez2.zzI(n39, n41);
                return;
            }
            case 11: {
                int n42 = zzacd2.zzb;
                object = (zzyx)object.getValue();
                zzaez2.zzd(n42, (zzyx)object);
                return;
            }
            case 10: {
                int n43 = zzacd2.zzb;
                Object v4 = object.getValue();
                zzadt zzadt4 = zzadt.zza();
                object = object.getValue().getClass();
                object = zzadt4.zzb((Class)object);
                zzaez2.zzv(n43, v4, (zzadx)object);
                return;
            }
            case 9: {
                int n44 = zzacd2.zzb;
                Object v5 = object.getValue();
                zzadt zzadt5 = zzadt.zza();
                object = object.getValue().getClass();
                object = zzadt5.zzb((Class)object);
                zzaez2.zzq(n44, v5, (zzadx)object);
                return;
            }
            case 8: {
                int n45 = zzacd2.zzb;
                object = (String)object.getValue();
                zzaez2.zzG(n45, (String)object);
                return;
            }
            case 7: {
                int n46 = zzacd2.zzb;
                boolean bl4 = (Boolean)object.getValue();
                zzaez2.zzb(n46, bl4);
                return;
            }
            case 6: {
                int n47 = zzacd2.zzb;
                int n48 = (Integer)object.getValue();
                zzaez2.zzk(n47, n48);
                return;
            }
            case 5: {
                int n49 = zzacd2.zzb;
                long l4 = (Long)object.getValue();
                zzaez2.zzm(n49, l4);
                return;
            }
            case 4: {
                int n50 = zzacd2.zzb;
                int n51 = (Integer)object.getValue();
                zzaez2.zzr(n50, n51);
                return;
            }
            case 3: {
                int n52 = zzacd2.zzb;
                long l7 = (Long)object.getValue();
                zzaez2.zzK(n52, l7);
                return;
            }
            case 2: {
                int n54 = zzacd2.zzb;
                long l8 = (Long)object.getValue();
                zzaez2.zzt(n54, l8);
                return;
            }
            case 1: {
                int n55 = zzacd2.zzb;
                float f5 = ((Float)object.getValue()).floatValue();
                zzaez2.zzo(n55, f5);
                return;
            }
            case 0: 
        }
        int n56 = zzacd2.zzb;
        double d2 = (Double)object.getValue();
        zzaez2.zzf(n56, d2);
    }
}

