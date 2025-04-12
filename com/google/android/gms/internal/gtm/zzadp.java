/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabq;
import com.google.android.gms.internal.gtm.zzabr;
import com.google.android.gms.internal.gtm.zzabu;
import com.google.android.gms.internal.gtm.zzabv;
import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacq;
import com.google.android.gms.internal.gtm.zzacs;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadt;
import com.google.android.gms.internal.gtm.zzadw;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzadz;
import com.google.android.gms.internal.gtm.zzaef;
import com.google.android.gms.internal.gtm.zzaem;
import com.google.android.gms.internal.gtm.zzaen;
import com.google.android.gms.internal.gtm.zzaey;
import com.google.android.gms.internal.gtm.zzaez;
import com.google.android.gms.internal.gtm.zzyl;
import com.google.android.gms.internal.gtm.zzym;
import com.google.android.gms.internal.gtm.zzyv;
import com.google.android.gms.internal.gtm.zzyx;
import com.google.android.gms.internal.gtm.zzzb;
import java.util.Map;

final class zzadp
implements zzadx {
    private final zzadl zza;
    private final zzaem zzb;
    private final boolean zzc;
    private final zzabr zzd;

    private zzadp(zzaem zzaem2, zzabr zzabr2, zzadl zzadl2) {
        boolean bl2;
        this.zzb = zzaem2;
        this.zzc = bl2 = zzadl2 instanceof zzacc;
        this.zzd = zzabr2;
        this.zza = zzadl2;
    }

    public static zzadp zzc(zzaem zzaem2, zzabr zzabr2, zzadl zzadl2) {
        zzadp zzadp2 = new zzadp(zzaem2, zzabr2, zzadl2);
        return zzadp2;
    }

    public final int zza(Object object) {
        Object object2 = object;
        object2 = ((zzacf)object).zzc;
        int n3 = ((zzaen)object2).zzb();
        boolean bl2 = this.zzc;
        if (bl2) {
            object = ((zzacc)object).zza;
            int n4 = ((zzabv)object).zzc();
            n3 += n4;
        }
        return n3;
    }

    public final int zzb(Object object) {
        Object object2 = object;
        object2 = ((zzacf)object).zzc;
        int n3 = ((zzaen)object2).hashCode();
        boolean bl2 = this.zzc;
        if (bl2) {
            object = ((zzacc)object).zza;
            n3 *= 53;
            object = ((zzabv)object).zza;
            int n4 = ((zzaef)object).hashCode();
            n3 += n4;
        }
        return n3;
    }

    public final Object zze() {
        zzadl zzadl2 = this.zza;
        boolean bl2 = zzadl2 instanceof zzacf;
        if (bl2) {
            return ((zzacf)zzadl2).zzae();
        }
        return zzadl2.zzav().zzE();
    }

    public final void zzf(Object object) {
        this.zzb.zzi(object);
        this.zzd.zza(object);
    }

    public final void zzg(Object object, Object object2) {
        Object object3 = this.zzb;
        zzadz.zzq((zzaem)object3, object, object2);
        boolean bl2 = this.zzc;
        if (bl2) {
            object3 = this.zzd;
            zzadz.zzp((zzabr)object3, object, object2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(Object object, zzadw object2, zzabq object3) {
        Throwable throwable2;
        zzaem zzaem2 = this.zzb;
        Object object4 = zzaem2.zza(object);
        Object object5 = object;
        object5 = ((zzacc)object).zzU();
        while (true) {
            Object object6;
            zzadm zzadm2;
            int n3;
            Object object7;
            int n4;
            int n7;
            block16: {
                block15: {
                    block18: {
                        block17: {
                            try {
                                n7 = object2.zzc();
                                n4 = -1 >>> 1;
                                if (n7 == n4) {
                                    break block15;
                                }
                            }
                            catch (Throwable throwable2) {
                                break;
                            }
                            {
                                n7 = object2.zzd();
                                object7 = this.zzd;
                                n3 = 11;
                                if (n7 == n3) break block16;
                                n4 = n7 & 7;
                                n3 = 2;
                                if (n4 != n3) break block17;
                            }
                            zzadm2 = this.zza;
                            object6 = ((zzabq)object3).zzb((zzadl)zzadm2, n7 >>>= 3);
                            if (object6 != null) {
                                ((zzabr)object7).zzb((zzadw)object2, object6, (zzabq)object3, (zzabv)object5);
                                continue;
                            }
                            n7 = (int)(zzaem2.zzk(object4, (zzadw)object2, 0) ? 1 : 0);
                            break block18;
                        }
                        n7 = (int)(object2.zzQ() ? 1 : 0);
                    }
                    if (n7 != 0) continue;
                }
                zzaem2.zzj(object, object4);
                return;
            }
            n7 = 0;
            object6 = null;
            n3 = 0;
            zzyx zzyx2 = null;
            boolean bl2 = false;
            {
                int n8;
                int n10;
                while ((n10 = object2.zzc()) != n4) {
                    int n14;
                    n10 = object2.zzd();
                    if (n10 == (n14 = 16)) {
                        bl2 = object2.zzj();
                        object6 = this.zza;
                        object6 = ((zzabq)object3).zzb((zzadl)object6, (int)(bl2 ? 1 : 0));
                        continue;
                    }
                    n14 = 26;
                    if (n10 == n14) {
                        if (object6 != null) {
                            ((zzabr)object7).zzb((zzadw)object2, object6, (zzabq)object3, (zzabv)object5);
                            continue;
                        }
                        zzyx2 = object2.zzp();
                        continue;
                    }
                    n10 = (int)(object2.zzQ() ? 1 : 0);
                    if (n10 != 0) continue;
                }
                if ((n4 = object2.zzd()) != (n8 = 12)) {
                    object3 = "Protocol message end-group tag did not match expected tag.";
                    object2 = new zzacq((String)object3);
                    throw object2;
                }
                if (zzyx2 == null) continue;
                if (object6 != null) {
                    zzadm2 = ((zzace)object6).zzc;
                    zzadm2 = zzadm2.zzav();
                    object7 = zzyx2;
                    object7 = (zzyv)zzyx2;
                    object7 = ((zzyv)object7).zza;
                    zzyx2 = (zzyv)zzyx2;
                    n3 = ((zzyv)zzyx2).zzd();
                    bl2 = true;
                    object7 = zzzb.zzH((byte[])object7, 0, n3, bl2);
                    zzadm2.zzy((zzzb)object7, (zzabq)object3);
                    object6 = ((zzace)object6).zzd;
                    zzadm2 = zzadm2.zzE();
                    ((zzabv)object5).zzk((zzabu)object6, zzadm2);
                    ((zzzb)object7).zzz(0);
                    continue;
                }
                zzaem2.zzg(object4, (int)(bl2 ? 1 : 0), zzyx2);
                continue;
            }
            break;
        }
        zzaem2.zzj(object, object4);
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzi(Object object, byte[] byArray, int n3, int n4, zzyl zzyl2) {
        Object object2 = object;
        object2 = (zzacf)object;
        zzaen zzaen2 = ((zzacf)object2).zzc;
        Object object3 = zzaen.zzc();
        if (zzaen2 == object3) {
            ((zzacf)object2).zzc = zzaen2 = zzaen.zzf();
        }
        object = ((zzacc)object).zzU();
        object2 = null;
        object3 = null;
        while (true) {
            Object object4;
            Object object5;
            Object object6;
            int n7;
            int n8;
            if (n3 < n4) {
                Object object7;
                n8 = zzym.zzi(byArray, n3, zzyl2);
                n3 = zzyl2.zza;
                int n10 = 11;
                n7 = 2;
                if (n3 != n10) {
                    n10 = n3 & 7;
                    if (n10 == n7) {
                        object3 = zzyl2.zzd;
                        object6 = this.zza;
                        n7 = n3 >>> 3;
                        zzace zzace2 = ((zzabq)object3).zzb((zzadl)object6, n7);
                        if (zzace2 != null) {
                            object7 = zzace2.zzc;
                            object3 = zzadt.zza();
                            object7 = object7.getClass();
                            object7 = ((zzadt)object3).zzb((Class)object7);
                            n3 = zzym.zzd((zzadx)object7, byArray, n8, n4, zzyl2);
                            object3 = zzyl2.zzc;
                            object6 = zzace2.zzd;
                            ((zzabv)object).zzk((zzabu)object6, object3);
                        } else {
                            object6 = byArray;
                            n7 = n4;
                            object5 = zzaen2;
                            object4 = zzyl2;
                            n3 = zzym.zzh(n3, byArray, n8, n4, zzaen2, zzyl2);
                        }
                        object3 = zzace2;
                        continue;
                    }
                    n3 = zzym.zzo(n3, byArray, n8, n4, zzyl2);
                    continue;
                }
                n3 = 0;
                object7 = null;
                n10 = 0;
                object6 = null;
            } else {
                if (n3 == n4) {
                    return;
                }
                object = new zzacq("Failed to parse the message.");
                throw object;
            }
            while (n8 < n4) {
                n8 = zzym.zzi(byArray, n8, zzyl2);
                int n14 = zzyl2.zza;
                int n15 = n14 >>> 3;
                int n16 = n14 & 7;
                if (n15 != n7) {
                    int n17 = 3;
                    if (n15 == n17) {
                        if (object3 != null) {
                            object5 = ((zzace)object3).zzc;
                            object4 = zzadt.zza();
                            object5 = object5.getClass();
                            n8 = zzym.zzd(((zzadt)object4).zzb((Class)object5), byArray, n8, n4, zzyl2);
                            object5 = zzyl2.zzc;
                            object4 = ((zzace)object3).zzd;
                            ((zzabv)object).zzk((zzabu)object4, object5);
                            continue;
                        }
                        if (n16 == n7) {
                            n8 = zzym.zza(byArray, n8, zzyl2);
                            object6 = (zzyx)zzyl2.zzc;
                            continue;
                        }
                    }
                } else if (n16 == 0) {
                    n8 = zzym.zzi(byArray, n8, zzyl2);
                    n3 = zzyl2.zza;
                    object3 = zzyl2.zzd;
                    object5 = this.zza;
                    object3 = ((zzabq)object3).zzb((zzadl)object5, n3);
                    continue;
                }
                if (n14 == (n15 = 12)) break;
                n8 = zzym.zzo(n14, byArray, n8, n4, zzyl2);
            }
            if (object6 != null) {
                n3 = n3 << 3 | n7;
                zzaen2.zzj(n3, object6);
            }
            n3 = n8;
        }
    }

    public final void zzj(Object object, zzaez zzaez2) {
        boolean bl2;
        Object object2 = object;
        object2 = ((zzacc)object).zza.zzg();
        while (bl2 = object2.hasNext()) {
            boolean bl3;
            zzaey zzaey2;
            Object object3 = (Map.Entry)object2.next();
            zzabu zzabu2 = (zzabu)object3.getKey();
            zzaey zzaey3 = zzabu2.zze();
            if (zzaey3 == (zzaey2 = zzaey.zzi) && !(bl3 = zzabu2.zzg())) {
                int n3;
                zzabu2.zzf();
                bl3 = object3 instanceof zzacs;
                if (bl3) {
                    n3 = zzabu2.zza();
                    object3 = ((zzacs)object3).zza().zzb();
                    zzaez2.zzw(n3, object3);
                    continue;
                }
                n3 = zzabu2.zza();
                object3 = object3.getValue();
                zzaez2.zzw(n3, object3);
                continue;
            }
            object = new IllegalStateException("Found invalid MessageSet item.");
            throw object;
        }
        ((zzacf)object).zzc.zzk(zzaez2);
    }

    public final boolean zzk(Object object, Object object2) {
        Object object3 = object;
        object3 = ((zzacf)object).zzc;
        Object object4 = object2;
        object4 = ((zzacf)object2).zzc;
        boolean bl2 = ((zzaen)object3).equals(object4);
        if (!bl2) {
            return false;
        }
        bl2 = this.zzc;
        if (bl2) {
            object = ((zzacc)object).zza;
            object2 = ((zzacc)object2).zza;
            return ((zzabv)object).equals(object2);
        }
        return true;
    }

    public final boolean zzl(Object object) {
        return ((zzacc)object).zza.zzm();
    }
}

