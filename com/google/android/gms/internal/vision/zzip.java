/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzho;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.internal.vision.zziq;
import com.google.android.gms.internal.vision.zzis;
import com.google.android.gms.internal.vision.zziu;
import com.google.android.gms.internal.vision.zziw;
import com.google.android.gms.internal.vision.zzjb$zzc;
import com.google.android.gms.internal.vision.zzjb$zze;
import com.google.android.gms.internal.vision.zzjb$zzf;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzky;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzld;
import com.google.android.gms.internal.vision.zzle;
import com.google.android.gms.internal.vision.zzlu;
import com.google.android.gms.internal.vision.zzml;
import com.google.android.gms.internal.vision.zzmr;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

final class zzip
extends zziq {
    public final int zza(Map.Entry entry) {
        return ((zzjb$zzf)entry.getKey()).zzb;
    }

    public final zziu zza(Object object) {
        return ((zzjb$zzc)object).zzc;
    }

    public final Object zza(zzio zzio2, zzkk zzkk2, int n3) {
        return zzio2.zza(zzkk2, n3);
    }

    public final Object zza(zzld object, Object object2, zzio zzio2, zziu zziu2, Object object3, zzlu object4) {
        object2 = (zzjb$zze)object2;
        object4 = ((zzjb$zze)object2).zzd;
        int cfr_ignored_0 = ((zzjb$zzf)object4).zzb;
        boolean cfr_ignored_1 = ((zzjb$zzf)object4).zzd;
        object4 = ((zzjb$zzf)object4).zzc;
        Object object5 = zzml.zzn;
        Object object6 = null;
        if (object4 != object5) {
            Object object7;
            object5 = zzis.zza;
            Object object8 = ((Enum)object4).ordinal();
            object8 = (Object)object5[object8];
            switch (object8) {
                default: {
                    break;
                }
                case 18: {
                    object4 = ((zzjb$zze)object2).zzc.getClass();
                    object6 = object.zza((Class)object4, zzio2);
                    break;
                }
                case 17: {
                    object4 = ((zzjb$zze)object2).zzc.getClass();
                    object6 = object.zzb((Class)object4, zzio2);
                    break;
                }
                case 16: {
                    object6 = object.zzl();
                    break;
                }
                case 15: {
                    object6 = object.zzn();
                    break;
                }
                case 14: {
                    object = new IllegalStateException("Shouldn't reach here.");
                    throw object;
                }
                case 13: {
                    long l2 = object.zzt();
                    object6 = l2;
                    break;
                }
                case 12: {
                    object7 = object.zzs();
                    object6 = object7;
                    break;
                }
                case 11: {
                    long l3 = object.zzr();
                    object6 = l3;
                    break;
                }
                case 10: {
                    object7 = object.zzq();
                    object6 = object7;
                    break;
                }
                case 9: {
                    object7 = object.zzo();
                    object6 = object7;
                    break;
                }
                case 8: {
                    object7 = object.zzk();
                    object6 = (boolean)object7;
                    break;
                }
                case 7: {
                    object7 = object.zzj();
                    object6 = object7;
                    break;
                }
                case 6: {
                    long l4 = object.zzi();
                    object6 = l4;
                    break;
                }
                case 5: {
                    object7 = object.zzh();
                    object6 = object7;
                    break;
                }
                case 4: {
                    long l7 = object.zzf();
                    object6 = l7;
                    break;
                }
                case 3: {
                    long l8 = object.zzg();
                    object6 = l8;
                    break;
                }
                case 2: {
                    float f5 = object.zze();
                    object6 = Float.valueOf(f5);
                    break;
                }
                case 1: {
                    double d2 = object.zzd();
                    object6 = d2;
                }
            }
            object = ((zzjb$zze)object2).zzd;
            Object object9 = ((zzjb$zzf)object).zzd;
            if (object9 != 0) {
                zziu2.zzb((zziw)object, object6);
            } else {
                object = ((zzjb$zzf)object).zzc;
                object7 = ((Enum)object).ordinal();
                object9 = 17;
                if ((object7 = (Object)((Object)object5[object7])) == object9 || object7 == (object9 = 18)) {
                    object = ((zzjb$zze)object2).zzd;
                    if ((object = zziu2.zza((zziw)object)) != null) {
                        object6 = zzjf.zza(object, object6);
                    }
                }
                object = ((zzjb$zze)object2).zzd;
                zziu2.zza((zziw)object, object6);
            }
            return object3;
        }
        object.zzh();
        throw null;
    }

    public final void zza(zzht object, Object object2, zzio zzio2, zziu zziu2) {
        object2 = (zzjb$zze)object2;
        zzkk zzkk2 = ((zzjb$zze)object2).zzc.zzq().zze();
        int n3 = ((zzht)object).zza();
        if (n3 == 0) {
            object = zzjf.zzb;
        } else {
            byte[] byArray = new byte[n3];
            ((zzht)object).zza(byArray, 0, 0, n3);
            object = byArray;
        }
        object = ByteBuffer.wrap((byte[])object);
        n3 = (int)(((ByteBuffer)object).hasArray() ? 1 : 0);
        if (n3 != 0) {
            boolean bl2 = true;
            zzho zzho2 = new zzho((ByteBuffer)object, bl2);
            zzky.zza().zza(zzkk2).zza(zzkk2, zzho2, zzio2);
            object = ((zzjb$zze)object2).zzd;
            zziu2.zza((zziw)object, zzkk2);
            int n4 = zzho2.zza();
            int n7 = -1 >>> 1;
            if (n4 == n7) {
                return;
            }
            throw zzjk.zze();
        }
        object = new IllegalArgumentException("Direct buffers not yet supported");
        throw object;
    }

    public final void zza(zzld object, Object object2, zzio zzio2, zziu zziu2) {
        object2 = (zzjb$zze)object2;
        Class<?> clazz = ((zzjb$zze)object2).zzc.getClass();
        object = object.zza(clazz, zzio2);
        object2 = ((zzjb$zze)object2).zzd;
        zziu2.zza((zziw)object2, object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zza(zzmr zzmr2, Map.Entry object) {
        zzjb$zzf zzjb$zzf = (zzjb$zzf)object.getKey();
        int n3 = zzjb$zzf.zzd;
        if (n3 != 0) {
            int[] nArray = zzis.zza;
            int n4 = zzjb$zzf.zzc.ordinal();
            n3 = nArray[n4];
            n4 = 0;
            Object var7_17 = null;
            switch (n3) {
                default: {
                    return;
                }
                case 18: {
                    boolean bl2;
                    List list = (List)object.getValue();
                    if (list == null || (bl2 = list.isEmpty())) return;
                    int n7 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzky zzky2 = zzky.zza();
                    Class<?> clazz = list.get(0).getClass();
                    zzlc zzlc2 = zzky2.zza(clazz);
                    zzle.zza(n7, (List)object, zzmr2, zzlc2);
                    return;
                }
                case 17: {
                    boolean bl3;
                    List list = (List)object.getValue();
                    if (list == null || (bl3 = list.isEmpty())) return;
                    int n8 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzky zzky3 = zzky.zza();
                    Class<?> clazz = list.get(0).getClass();
                    zzlc zzlc3 = zzky3.zza(clazz);
                    zzle.zzb(n8, (List)object, zzmr2, zzlc3);
                    return;
                }
                case 16: {
                    int n10 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zza(n10, object, zzmr2);
                    return;
                }
                case 15: {
                    int n14 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzb(n14, object, zzmr2);
                    return;
                }
                case 14: {
                    int n15 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzh(n15, object, zzmr2, false);
                    return;
                }
                case 13: {
                    int n16 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zze(n16, object, zzmr2, false);
                    return;
                }
                case 12: {
                    int n17 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzj(n17, object, zzmr2, false);
                    return;
                }
                case 11: {
                    int n18 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzg(n18, object, zzmr2, false);
                    return;
                }
                case 10: {
                    int n19 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzl(n19, object, zzmr2, false);
                    return;
                }
                case 9: {
                    int n20 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzi(n20, object, zzmr2, false);
                    return;
                }
                case 8: {
                    int n21 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzn(n21, object, zzmr2, false);
                    return;
                }
                case 7: {
                    int n22 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzk(n22, object, zzmr2, false);
                    return;
                }
                case 6: {
                    int n24 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzf(n24, object, zzmr2, false);
                    return;
                }
                case 5: {
                    int n25 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzh(n25, object, zzmr2, false);
                    return;
                }
                case 4: {
                    int n26 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzd(n26, object, zzmr2, false);
                    return;
                }
                case 3: {
                    int n27 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzc(n27, object, zzmr2, false);
                    return;
                }
                case 2: {
                    int n28 = zzjb$zzf.zzb;
                    object = (List)object.getValue();
                    zzle.zzb(n28, object, zzmr2, false);
                    return;
                }
                case 1: 
            }
            int n29 = zzjb$zzf.zzb;
            object = (List)object.getValue();
            zzle.zza(n29, object, zzmr2, false);
            return;
        }
        int[] nArray = zzis.zza;
        Object object2 = zzjb$zzf.zzc;
        int n30 = ((Enum)object2).ordinal();
        n3 = nArray[n30];
        switch (n3) {
            default: {
                return;
            }
            case 18: {
                int n32 = zzjb$zzf.zzb;
                Object v4 = object.getValue();
                object2 = zzky.zza();
                object = object.getValue().getClass();
                object = ((zzky)object2).zza((Class)object);
                zzmr2.zza(n32, v4, (zzlc)object);
                return;
            }
            case 17: {
                int n34 = zzjb$zzf.zzb;
                Object v5 = object.getValue();
                object2 = zzky.zza();
                object = object.getValue().getClass();
                object = ((zzky)object2).zza((Class)object);
                zzmr2.zzb(n34, v5, (zzlc)object);
                return;
            }
            case 16: {
                int n35 = zzjb$zzf.zzb;
                object = (String)object.getValue();
                zzmr2.zza(n35, (String)object);
                return;
            }
            case 15: {
                int n36 = zzjb$zzf.zzb;
                object = (zzht)object.getValue();
                zzmr2.zza(n36, (zzht)object);
                return;
            }
            case 14: {
                int n37 = zzjb$zzf.zzb;
                int n38 = (Integer)object.getValue();
                zzmr2.zzc(n37, n38);
                return;
            }
            case 13: {
                int n39 = zzjb$zzf.zzb;
                long l2 = (Long)object.getValue();
                zzmr2.zze(n39, l2);
                return;
            }
            case 12: {
                int n41 = zzjb$zzf.zzb;
                int n42 = (Integer)object.getValue();
                zzmr2.zzf(n41, n42);
                return;
            }
            case 11: {
                int n43 = zzjb$zzf.zzb;
                long l3 = (Long)object.getValue();
                zzmr2.zzb(n43, l3);
                return;
            }
            case 10: {
                int n44 = zzjb$zzf.zzb;
                int n45 = (Integer)object.getValue();
                zzmr2.zza(n44, n45);
                return;
            }
            case 9: {
                int n46 = zzjb$zzf.zzb;
                int n47 = (Integer)object.getValue();
                zzmr2.zze(n46, n47);
                return;
            }
            case 8: {
                int n48 = zzjb$zzf.zzb;
                boolean bl4 = (Boolean)object.getValue();
                zzmr2.zza(n48, bl4);
                return;
            }
            case 7: {
                int n49 = zzjb$zzf.zzb;
                int n50 = (Integer)object.getValue();
                zzmr2.zzd(n49, n50);
                return;
            }
            case 6: {
                int n51 = zzjb$zzf.zzb;
                long l4 = (Long)object.getValue();
                zzmr2.zzd(n51, l4);
                return;
            }
            case 5: {
                int n52 = zzjb$zzf.zzb;
                int n54 = (Integer)object.getValue();
                zzmr2.zzc(n52, n54);
                return;
            }
            case 4: {
                int n55 = zzjb$zzf.zzb;
                long l7 = (Long)object.getValue();
                zzmr2.zzc(n55, l7);
                return;
            }
            case 3: {
                int n56 = zzjb$zzf.zzb;
                long l8 = (Long)object.getValue();
                zzmr2.zza(n56, l8);
                return;
            }
            case 2: {
                int n57 = zzjb$zzf.zzb;
                float f5 = ((Float)object.getValue()).floatValue();
                zzmr2.zza(n57, f5);
                return;
            }
            case 1: 
        }
        int n58 = zzjb$zzf.zzb;
        double d2 = (Double)object.getValue();
        zzmr2.zza(n58, d2);
    }

    public final boolean zza(zzkk zzkk2) {
        return zzkk2 instanceof zzjb$zzc;
    }

    public final zziu zzb(Object object) {
        return ((zzjb$zzc)object).zza();
    }

    public final void zzc(Object object) {
        this.zza(object).zzb();
    }
}

