/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzp;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhav;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbf;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhcm;
import com.google.android.gms.internal.ads.zzhct;
import com.google.android.gms.internal.ads.zzhdo;
import com.google.android.gms.internal.ads.zzhdr;
import com.google.android.gms.internal.ads.zzhdz;
import java.util.List;

final class zzhan
implements zzhdr {
    private final zzham zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzhan(zzham zzham2) {
        zzhcb.zzc(zzham2, "input");
        this.zza = zzham2;
        zzham2.zzc = this;
    }

    private final Object zzR(zzhdz zzhdz2, zzhay zzhay2) {
        Object object = zzhdz2.zze();
        this.zzT(object, zzhdz2, zzhay2);
        zzhdz2.zzf(object);
        return object;
    }

    private final Object zzS(zzhdz zzhdz2, zzhay zzhay2) {
        Object object = zzhdz2.zze();
        this.zzU(object, zzhdz2, zzhay2);
        zzhdz2.zzf(object);
        return object;
    }

    private final void zzT(Object object, zzhdz zzhdz2, zzhay zzhay2) {
        block5: {
            int n3;
            int n4;
            int n7 = this.zzc;
            this.zzc = n4 = this.zzb >>> 3 << 3 | 4;
            try {
                zzhdz2.zzh(object, this, zzhay2);
                n3 = this.zzb;
            }
            catch (Throwable throwable) {
                this.zzc = n7;
                throw throwable;
            }
            int n8 = this.zzc;
            if (n3 != n8) break block5;
            this.zzc = n7;
            return;
        }
        object = zzhcd.zzg();
        throw object;
    }

    private final void zzU(Object object, zzhdz zzhdz2, zzhay zzhay2) {
        zzham zzham2 = this.zza;
        int n3 = zzham2.zzn();
        int n4 = zzham2.zza;
        int n7 = zzham2.zzb;
        if (n4 < n7) {
            int n8;
            n7 = this.zza.zze(n3);
            zzham zzham3 = this.zza;
            zzham3.zza = n4 = zzham3.zza + 1;
            zzhdz2.zzh(object, this, zzhay2);
            this.zza.zzz(0);
            object = this.zza;
            ((zzham)object).zza = n8 = ((zzham)object).zza + -1;
            ((zzham)object).zzA(n7);
            return;
        }
        object = new zzhcd("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        throw object;
    }

    private final void zzV(int n3) {
        zzham zzham2 = this.zza;
        int n4 = zzham2.zzd();
        if (n4 == n3) {
            return;
        }
        throw zzhcd.zzj();
    }

    private final void zzW(int n3) {
        int n4 = this.zzb & 7;
        if (n4 == n3) {
            return;
        }
        throw zzhcd.zza();
    }

    private static final void zzX(int n3) {
        if ((n3 &= 3) == 0) {
            return;
        }
        throw zzhcd.zzg();
    }

    private static final void zzY(int n3) {
        if ((n3 &= 7) == 0) {
            return;
        }
        throw zzhcd.zzg();
    }

    public static zzhan zzq(zzham zzham2) {
        zzhan zzhan2 = zzham2.zzc;
        if (zzhan2 != null) {
            return zzhan2;
        }
        zzhan2 = new zzhan(zzham2);
        return zzhan2;
    }

    public final void zzA(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzhbp;
            int n7 = 2;
            if (n4 != 0) {
                List list = object;
                list = (zzhbp)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        zzham zzham2;
                        object = this.zza;
                        n7 = ((zzham)object).zzn();
                        n3 = ((zzham)object).zzd() + n7;
                        do {
                            n7 = this.zza.zzf();
                            ((zzhbp)list).zzi(n7);
                        } while ((n7 = (zzham2 = this.zza).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    n3 = this.zza.zzf();
                    ((zzhbp)list).zzi(n3);
                    object = this.zza;
                    n3 = (int)(((zzham)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n7 = this.zzb));
            } else {
                Object object2;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        Object object3;
                        zzham zzham3 = this.zza;
                        n7 = zzham3.zzn();
                        n4 = zzham3.zzd() + n7;
                        do {
                            object3 = this.zza.zzf();
                            object.add(object3);
                        } while ((n7 = ((zzham)(object3 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    object2 = this.zza.zzf();
                    object.add(object2);
                    object2 = this.zza;
                    n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n7 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    public final void zzB(List object) {
        block6: {
            int n3;
            int n4;
            block11: {
                block12: {
                    int n7;
                    block10: {
                        Object object2;
                        int n8;
                        block7: {
                            List list;
                            block8: {
                                block9: {
                                    n4 = object instanceof zzhbp;
                                    n3 = 5;
                                    n8 = 2;
                                    if (n4 == 0) break block7;
                                    list = object;
                                    list = (zzhbp)object;
                                    n7 = this.zzb & 7;
                                    if (n7 == n8) break block8;
                                    if (n7 != n3) break block9;
                                    do {
                                        n7 = this.zza.zzg();
                                        ((zzhbp)list).zzi(n7);
                                        object = this.zza;
                                        n7 = (int)(((zzham)object).zzC() ? 1 : 0);
                                        if (n7 != 0) break block6;
                                    } while ((n7 = ((zzham)(object = this.zza)).zzm()) == (n3 = this.zzb));
                                    break block10;
                                }
                                throw zzhcd.zza();
                            }
                            object = this.zza;
                            n7 = ((zzham)object).zzn();
                            zzhan.zzX(n7);
                            zzham zzham2 = this.zza;
                            n3 = zzham2.zzd();
                            int n10 = n3 + n7;
                            do {
                                n7 = this.zza.zzg();
                                ((zzhbp)list).zzi(n7);
                            } while ((n7 = ((zzham)(object = this.zza)).zzd()) < n10);
                            break block6;
                        }
                        n4 = this.zzb & 7;
                        if (n4 == n8) break block11;
                        if (n4 != n3) break block12;
                        do {
                            object2 = this.zza.zzg();
                            object.add(object2);
                            object2 = this.zza;
                            n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                            if (n4 != 0) break block6;
                        } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n3 = this.zzb));
                        n7 = n4;
                    }
                    this.zzd = n7;
                    return;
                }
                throw zzhcd.zza();
            }
            Object object3 = this.zza;
            n4 = ((zzham)object3).zzn();
            zzhan.zzX(n4);
            zzham zzham3 = this.zza;
            n3 = zzham3.zzd() + n4;
            do {
                object3 = this.zza.zzg();
                object.add(object3);
            } while ((n4 = ((zzham)(object3 = this.zza)).zzd()) < n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzC(List object) {
        int n3;
        int n4 = object instanceof zzhct;
        int n7 = 2;
        int n8 = 1;
        if (n4 == 0) {
            Object object2;
            n4 = this.zzb & 7;
            if (n4 != n8) {
                if (n4 != n7) throw zzhcd.zza();
                Object object3 = this.zza;
                n4 = ((zzham)object3).zzn();
                zzhan.zzY(n4);
                zzham zzham2 = this.zza;
                n7 = zzham2.zzd() + n4;
                do {
                    long l2 = this.zza.zzo();
                    object3 = l2;
                    object.add(object3);
                } while ((n4 = ((zzham)(object3 = this.zza)).zzd()) < n7);
                return;
            }
            do {
                long l3 = this.zza.zzo();
                object2 = l3;
                object.add(object2);
                object2 = this.zza;
                n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                if (n4 != 0) return;
            } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n7 = this.zzb));
            n3 = n4;
        } else {
            Object object4 = object;
            object4 = (zzhct)object;
            n3 = this.zzb & 7;
            if (n3 != n8) {
                if (n3 != n7) throw zzhcd.zza();
                object = this.zza;
                n3 = ((zzham)object).zzn();
                zzhan.zzY(n3);
                zzham zzham3 = this.zza;
                n7 = zzham3.zzd() + n3;
                do {
                    long l4 = this.zza.zzo();
                    ((zzhct)object4).zzg(l4);
                } while ((n3 = ((zzham)(object = this.zza)).zzd()) < n7);
                return;
            }
            do {
                long l7 = this.zza.zzo();
                ((zzhct)object4).zzg(l7);
                object = this.zza;
                n3 = (int)(((zzham)object).zzC() ? 1 : 0);
                if (n3 == 0) continue;
                return;
            } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n7 = this.zzb));
        }
        this.zzd = n3;
    }

    public final void zzD(List object) {
        block6: {
            int n3;
            int n4;
            block11: {
                block12: {
                    int n7;
                    block10: {
                        Object object2;
                        int n8;
                        block7: {
                            List list;
                            block8: {
                                block9: {
                                    n4 = object instanceof zzhbf;
                                    n3 = 5;
                                    n8 = 2;
                                    if (n4 == 0) break block7;
                                    list = object;
                                    list = (zzhbf)object;
                                    n7 = this.zzb & 7;
                                    if (n7 == n8) break block8;
                                    if (n7 != n3) break block9;
                                    do {
                                        float f5 = this.zza.zzc();
                                        ((zzhbf)list).zzh(f5);
                                        object = this.zza;
                                        n7 = (int)(((zzham)object).zzC() ? 1 : 0);
                                        if (n7 != 0) break block6;
                                    } while ((n7 = ((zzham)(object = this.zza)).zzm()) == (n3 = this.zzb));
                                    break block10;
                                }
                                throw zzhcd.zza();
                            }
                            object = this.zza;
                            n7 = ((zzham)object).zzn();
                            zzhan.zzX(n7);
                            zzham zzham2 = this.zza;
                            n3 = zzham2.zzd();
                            int n10 = n3 + n7;
                            do {
                                float f6 = this.zza.zzc();
                                ((zzhbf)list).zzh(f6);
                            } while ((n7 = ((zzham)(object = this.zza)).zzd()) < n10);
                            break block6;
                        }
                        n4 = this.zzb & 7;
                        if (n4 == n8) break block11;
                        if (n4 != n3) break block12;
                        do {
                            float f7 = this.zza.zzc();
                            object2 = Float.valueOf(f7);
                            object.add(object2);
                            object2 = this.zza;
                            n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                            if (n4 != 0) break block6;
                        } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n3 = this.zzb));
                        n7 = n4;
                    }
                    this.zzd = n7;
                    return;
                }
                throw zzhcd.zza();
            }
            Object object3 = this.zza;
            n4 = ((zzham)object3).zzn();
            zzhan.zzX(n4);
            zzham zzham3 = this.zza;
            n3 = zzham3.zzd() + n4;
            do {
                float f8 = this.zza.zzc();
                object3 = Float.valueOf(f8);
                object.add(object3);
            } while ((n4 = ((zzham)(object3 = this.zza)).zzd()) < n3);
        }
    }

    public final void zzE(List list, zzhdz zzhdz2, zzhay zzhay2) {
        int n3 = this.zzb;
        int n4 = n3 & 7;
        int n7 = 3;
        if (n4 == n7) {
            block2: {
                Object object;
                do {
                    object = this.zzR(zzhdz2, zzhay2);
                    list.add(object);
                    object = this.zza;
                    n4 = (int)(((zzham)object).zzC() ? 1 : 0);
                    if (n4 != 0 || (n4 = this.zzd) != 0) break block2;
                } while ((n4 = ((zzham)(object = this.zza)).zzm()) == n3);
                this.zzd = n4;
            }
            return;
        }
        throw zzhcd.zza();
    }

    public final void zzF(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzhbp;
            int n7 = 2;
            if (n4 != 0) {
                List list = object;
                list = (zzhbp)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        zzham zzham2;
                        object = this.zza;
                        n7 = ((zzham)object).zzn();
                        n3 = ((zzham)object).zzd() + n7;
                        do {
                            n7 = this.zza.zzh();
                            ((zzhbp)list).zzi(n7);
                        } while ((n7 = (zzham2 = this.zza).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    n3 = this.zza.zzh();
                    ((zzhbp)list).zzi(n3);
                    object = this.zza;
                    n3 = (int)(((zzham)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n7 = this.zzb));
            } else {
                Object object2;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        Object object3;
                        zzham zzham3 = this.zza;
                        n7 = zzham3.zzn();
                        n4 = zzham3.zzd() + n7;
                        do {
                            object3 = this.zza.zzh();
                            object.add(object3);
                        } while ((n7 = ((zzham)(object3 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    object2 = this.zza.zzh();
                    object.add(object2);
                    object2 = this.zza;
                    n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n7 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    public final void zzG(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzhct;
            int n7 = 2;
            if (n4 != 0) {
                List list = object;
                list = (zzhct)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        zzham zzham2;
                        object = this.zza;
                        n7 = ((zzham)object).zzn();
                        n3 = ((zzham)object).zzd() + n7;
                        do {
                            long l2 = this.zza.zzp();
                            ((zzhct)list).zzg(l2);
                        } while ((n7 = (zzham2 = this.zza).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    long l3 = this.zza.zzp();
                    ((zzhct)list).zzg(l3);
                    object = this.zza;
                    n3 = (int)(((zzham)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n7 = this.zzb));
            } else {
                Object object2;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        Object object3;
                        zzham zzham3 = this.zza;
                        n7 = zzham3.zzn();
                        n4 = zzham3.zzd() + n7;
                        do {
                            long l4 = this.zza.zzp();
                            object3 = l4;
                            object.add(object3);
                        } while ((n7 = ((zzham)(object3 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    long l7 = this.zza.zzp();
                    object2 = l7;
                    object.add(object2);
                    object2 = this.zza;
                    n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n7 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    public final void zzH(List list, zzhdz zzhdz2, zzhay zzhay2) {
        int n3 = this.zzb;
        int n4 = n3 & 7;
        int n7 = 2;
        if (n4 == n7) {
            block2: {
                Object object;
                do {
                    object = this.zzS(zzhdz2, zzhay2);
                    list.add(object);
                    object = this.zza;
                    n4 = (int)(((zzham)object).zzC() ? 1 : 0);
                    if (n4 != 0 || (n4 = this.zzd) != 0) break block2;
                } while ((n4 = ((zzham)(object = this.zza)).zzm()) == n3);
                this.zzd = n4;
            }
            return;
        }
        throw zzhcd.zza();
    }

    public final void zzI(List object) {
        block6: {
            int n3;
            int n4;
            block11: {
                block12: {
                    int n7;
                    block10: {
                        Object object2;
                        int n8;
                        block7: {
                            List list;
                            block8: {
                                block9: {
                                    n4 = object instanceof zzhbp;
                                    n3 = 5;
                                    n8 = 2;
                                    if (n4 == 0) break block7;
                                    list = object;
                                    list = (zzhbp)object;
                                    n7 = this.zzb & 7;
                                    if (n7 == n8) break block8;
                                    if (n7 != n3) break block9;
                                    do {
                                        n7 = this.zza.zzk();
                                        ((zzhbp)list).zzi(n7);
                                        object = this.zza;
                                        n7 = (int)(((zzham)object).zzC() ? 1 : 0);
                                        if (n7 != 0) break block6;
                                    } while ((n7 = ((zzham)(object = this.zza)).zzm()) == (n3 = this.zzb));
                                    break block10;
                                }
                                throw zzhcd.zza();
                            }
                            object = this.zza;
                            n7 = ((zzham)object).zzn();
                            zzhan.zzX(n7);
                            zzham zzham2 = this.zza;
                            n3 = zzham2.zzd();
                            int n10 = n3 + n7;
                            do {
                                n7 = this.zza.zzk();
                                ((zzhbp)list).zzi(n7);
                            } while ((n7 = ((zzham)(object = this.zza)).zzd()) < n10);
                            break block6;
                        }
                        n4 = this.zzb & 7;
                        if (n4 == n8) break block11;
                        if (n4 != n3) break block12;
                        do {
                            object2 = this.zza.zzk();
                            object.add(object2);
                            object2 = this.zza;
                            n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                            if (n4 != 0) break block6;
                        } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n3 = this.zzb));
                        n7 = n4;
                    }
                    this.zzd = n7;
                    return;
                }
                throw zzhcd.zza();
            }
            Object object3 = this.zza;
            n4 = ((zzham)object3).zzn();
            zzhan.zzX(n4);
            zzham zzham3 = this.zza;
            n3 = zzham3.zzd() + n4;
            do {
                object3 = this.zza.zzk();
                object.add(object3);
            } while ((n4 = ((zzham)(object3 = this.zza)).zzd()) < n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzJ(List object) {
        int n3;
        int n4 = object instanceof zzhct;
        int n7 = 2;
        int n8 = 1;
        if (n4 == 0) {
            Object object2;
            n4 = this.zzb & 7;
            if (n4 != n8) {
                if (n4 != n7) throw zzhcd.zza();
                Object object3 = this.zza;
                n4 = ((zzham)object3).zzn();
                zzhan.zzY(n4);
                zzham zzham2 = this.zza;
                n7 = zzham2.zzd() + n4;
                do {
                    long l2 = this.zza.zzt();
                    object3 = l2;
                    object.add(object3);
                } while ((n4 = ((zzham)(object3 = this.zza)).zzd()) < n7);
                return;
            }
            do {
                long l3 = this.zza.zzt();
                object2 = l3;
                object.add(object2);
                object2 = this.zza;
                n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                if (n4 != 0) return;
            } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n7 = this.zzb));
            n3 = n4;
        } else {
            Object object4 = object;
            object4 = (zzhct)object;
            n3 = this.zzb & 7;
            if (n3 != n8) {
                if (n3 != n7) throw zzhcd.zza();
                object = this.zza;
                n3 = ((zzham)object).zzn();
                zzhan.zzY(n3);
                zzham zzham3 = this.zza;
                n7 = zzham3.zzd() + n3;
                do {
                    long l4 = this.zza.zzt();
                    ((zzhct)object4).zzg(l4);
                } while ((n3 = ((zzham)(object = this.zza)).zzd()) < n7);
                return;
            }
            do {
                long l7 = this.zza.zzt();
                ((zzhct)object4).zzg(l7);
                object = this.zza;
                n3 = (int)(((zzham)object).zzC() ? 1 : 0);
                if (n3 == 0) continue;
                return;
            } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n7 = this.zzb));
        }
        this.zzd = n3;
    }

    public final void zzK(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzhbp;
            int n7 = 2;
            if (n4 != 0) {
                List list = object;
                list = (zzhbp)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        zzham zzham2;
                        object = this.zza;
                        n7 = ((zzham)object).zzn();
                        n3 = ((zzham)object).zzd() + n7;
                        do {
                            n7 = this.zza.zzl();
                            ((zzhbp)list).zzi(n7);
                        } while ((n7 = (zzham2 = this.zza).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    n3 = this.zza.zzl();
                    ((zzhbp)list).zzi(n3);
                    object = this.zza;
                    n3 = (int)(((zzham)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n7 = this.zzb));
            } else {
                Object object2;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        Object object3;
                        zzham zzham3 = this.zza;
                        n7 = zzham3.zzn();
                        n4 = zzham3.zzd() + n7;
                        do {
                            object3 = this.zza.zzl();
                            object.add(object3);
                        } while ((n7 = ((zzham)(object3 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    object2 = this.zza.zzl();
                    object.add(object2);
                    object2 = this.zza;
                    n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n7 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    public final void zzL(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzhct;
            int n7 = 2;
            if (n4 != 0) {
                List list = object;
                list = (zzhct)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        zzham zzham2;
                        object = this.zza;
                        n7 = ((zzham)object).zzn();
                        n3 = ((zzham)object).zzd() + n7;
                        do {
                            long l2 = this.zza.zzu();
                            ((zzhct)list).zzg(l2);
                        } while ((n7 = (zzham2 = this.zza).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    long l3 = this.zza.zzu();
                    ((zzhct)list).zzg(l3);
                    object = this.zza;
                    n3 = (int)(((zzham)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n7 = this.zzb));
            } else {
                Object object2;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        Object object3;
                        zzham zzham3 = this.zza;
                        n7 = zzham3.zzn();
                        n4 = zzham3.zzd() + n7;
                        do {
                            long l4 = this.zza.zzu();
                            object3 = l4;
                            object.add(object3);
                        } while ((n7 = ((zzham)(object3 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    long l7 = this.zza.zzu();
                    object2 = l7;
                    object.add(object2);
                    object2 = this.zza;
                    n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n7 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzM(List list, boolean n3) {
        int n4 = this.zzb & 7;
        int n7 = 2;
        if (n4 != n7) throw zzhcd.zza();
        n4 = list instanceof zzhcm;
        if (n4 != 0 && n3 == 0) {
            Object object;
            list = (zzhcm)list;
            do {
                object = this.zzp();
                list.zzi((zzhac)object);
                object = this.zza;
                n3 = (int)(((zzham)object).zzC() ? 1 : 0);
                if (n3 != 0) return;
            } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n4 = this.zzb));
        } else {
            Object object;
            do {
                object = n3 != 0 ? this.zzu() : this.zzt();
                list.add(object);
                object = this.zza;
                n4 = (int)(((zzham)object).zzC() ? 1 : 0);
                if (n4 == 0) continue;
                return;
            } while ((n4 = ((zzham)(object = this.zza)).zzm()) == (n7 = this.zzb));
            n3 = n4;
        }
        this.zzd = n3;
    }

    public final void zzN(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzhbp;
            int n7 = 2;
            if (n4 != 0) {
                List list = object;
                list = (zzhbp)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        zzham zzham2;
                        object = this.zza;
                        n7 = ((zzham)object).zzn();
                        n3 = ((zzham)object).zzd() + n7;
                        do {
                            n7 = this.zza.zzn();
                            ((zzhbp)list).zzi(n7);
                        } while ((n7 = (zzham2 = this.zza).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    n3 = this.zza.zzn();
                    ((zzhbp)list).zzi(n3);
                    object = this.zza;
                    n3 = (int)(((zzham)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n7 = this.zzb));
            } else {
                Object object2;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        Object object3;
                        zzham zzham3 = this.zza;
                        n7 = zzham3.zzn();
                        n4 = zzham3.zzd() + n7;
                        do {
                            object3 = this.zza.zzn();
                            object.add(object3);
                        } while ((n7 = ((zzham)(object3 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    object2 = this.zza.zzn();
                    object.add(object2);
                    object2 = this.zza;
                    n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n7 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    public final void zzO(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzhct;
            int n7 = 2;
            if (n4 != 0) {
                List list = object;
                list = (zzhct)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        zzham zzham2;
                        object = this.zza;
                        n7 = ((zzham)object).zzn();
                        n3 = ((zzham)object).zzd() + n7;
                        do {
                            long l2 = this.zza.zzv();
                            ((zzhct)list).zzg(l2);
                        } while ((n7 = (zzham2 = this.zza).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    long l3 = this.zza.zzv();
                    ((zzhct)list).zzg(l3);
                    object = this.zza;
                    n3 = (int)(((zzham)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n7 = this.zzb));
            } else {
                Object object2;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        Object object3;
                        zzham zzham3 = this.zza;
                        n7 = zzham3.zzn();
                        n4 = zzham3.zzd() + n7;
                        do {
                            long l4 = this.zza.zzv();
                            object3 = l4;
                            object.add(object3);
                        } while ((n7 = ((zzham)(object3 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    long l7 = this.zza.zzv();
                    object2 = l7;
                    object.add(object2);
                    object2 = this.zza;
                    n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n7 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    public final boolean zzP() {
        this.zzW(0);
        return this.zza.zzD();
    }

    public final boolean zzQ() {
        int n3;
        zzham zzham2 = this.zza;
        int n4 = zzham2.zzC();
        if (n4 == 0 && (n4 = this.zzb) != (n3 = this.zzc)) {
            return this.zza.zzE(n4);
        }
        return false;
    }

    public final double zza() {
        this.zzW(1);
        return this.zza.zzb();
    }

    public final float zzb() {
        this.zzW(5);
        return this.zza.zzc();
    }

    public final int zzc() {
        int n3;
        int n4 = this.zzd;
        if (n4 != 0) {
            this.zzb = n4;
            n3 = 0;
            this.zzd = 0;
        } else {
            zzham zzham2 = this.zza;
            this.zzb = n4 = zzham2.zzm();
        }
        if (n4 != 0 && n4 != (n3 = this.zzc)) {
            return n4 >>> 3;
        }
        return -1 >>> 1;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        this.zzW(0);
        return this.zza.zzf();
    }

    public final int zzf() {
        this.zzW(5);
        return this.zza.zzg();
    }

    public final int zzg() {
        this.zzW(0);
        return this.zza.zzh();
    }

    public final int zzh() {
        this.zzW(5);
        return this.zza.zzk();
    }

    public final int zzi() {
        this.zzW(0);
        return this.zza.zzl();
    }

    public final int zzj() {
        this.zzW(0);
        return this.zza.zzn();
    }

    public final long zzk() {
        this.zzW(1);
        return this.zza.zzo();
    }

    public final long zzl() {
        this.zzW(0);
        return this.zza.zzp();
    }

    public final long zzm() {
        this.zzW(1);
        return this.zza.zzt();
    }

    public final long zzn() {
        this.zzW(0);
        return this.zza.zzu();
    }

    public final long zzo() {
        this.zzW(0);
        return this.zza.zzv();
    }

    public final zzhac zzp() {
        this.zzW(2);
        return this.zza.zzw();
    }

    public final Object zzr(Class object, zzhay zzhay2) {
        this.zzW(3);
        object = zzhdo.zza().zzb((Class)object);
        return this.zzR((zzhdz)object, zzhay2);
    }

    public final Object zzs(Class object, zzhay zzhay2) {
        this.zzW(2);
        object = zzhdo.zza().zzb((Class)object);
        return this.zzS((zzhdz)object, zzhay2);
    }

    public final String zzt() {
        this.zzW(2);
        return this.zza.zzx();
    }

    public final String zzu() {
        this.zzW(2);
        return this.zza.zzy();
    }

    public final void zzv(Object object, zzhdz zzhdz2, zzhay zzhay2) {
        this.zzW(3);
        this.zzT(object, zzhdz2, zzhay2);
    }

    public final void zzw(Object object, zzhdz zzhdz2, zzhay zzhay2) {
        this.zzW(2);
        this.zzU(object, zzhdz2, zzhay2);
    }

    /*
     * WARNING - void declaration
     */
    public final void zzx(List object) {
        block10: {
            void var5_11;
            int n4 = object instanceof zzgzp;
            int n7 = 2;
            if (n4 != 0) {
                int n3;
                Object list = object;
                list = (zzgzp)object;
                int n32 = this.zzb & 7;
                if (n32 != 0) {
                    if (n32 == n7) {
                        zzham zzham2;
                        object = this.zza;
                        n7 = ((zzham)object).zzn();
                        int n8 = ((zzham)object).zzd() + n7;
                        do {
                            n7 = (int)(this.zza.zzD() ? 1 : 0);
                            ((zzgzp)list).zzg(n7 != 0);
                        } while ((n7 = (zzham2 = this.zza).zzd()) < n8);
                        this.zzV(n8);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    n3 = this.zza.zzD();
                    ((zzgzp)list).zzg(n3 != 0);
                    object = this.zza;
                    n3 = ((zzham)object).zzC();
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n7 = this.zzb));
            } else {
                Object object2;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        Object object3;
                        zzham zzham3 = this.zza;
                        n7 = zzham3.zzn();
                        n4 = zzham3.zzd() + n7;
                        do {
                            object3 = this.zza.zzD();
                            object.add(object3);
                        } while ((n7 = ((zzham)(object3 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    throw zzhcd.zza();
                }
                do {
                    object2 = this.zza.zzD();
                    object.add(object2);
                    object2 = this.zza;
                    n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n7 = this.zzb));
                int n10 = n4;
            }
            this.zzd = var5_11;
        }
    }

    public final void zzy(List list) {
        int n3 = this.zzb & 7;
        int n4 = 2;
        if (n3 == n4) {
            Object object;
            do {
                object = this.zzp();
                list.add(object);
                object = this.zza;
                n3 = (int)(((zzham)object).zzC() ? 1 : 0);
                if (n3 == 0) continue;
                return;
            } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n4 = this.zzb));
            this.zzd = n3;
            return;
        }
        throw zzhcd.zza();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzz(List object) {
        int n3;
        int n4 = object instanceof zzhav;
        int n7 = 2;
        int n8 = 1;
        if (n4 == 0) {
            Object object2;
            n4 = this.zzb & 7;
            if (n4 != n8) {
                if (n4 != n7) throw zzhcd.zza();
                Object object3 = this.zza;
                n4 = ((zzham)object3).zzn();
                zzhan.zzY(n4);
                zzham zzham2 = this.zza;
                n7 = zzham2.zzd() + n4;
                do {
                    double d2 = this.zza.zzb();
                    object3 = d2;
                    object.add(object3);
                } while ((n4 = ((zzham)(object3 = this.zza)).zzd()) < n7);
                return;
            }
            do {
                double d5 = this.zza.zzb();
                object2 = d5;
                object.add(object2);
                object2 = this.zza;
                n4 = (int)(((zzham)object2).zzC() ? 1 : 0);
                if (n4 != 0) return;
            } while ((n4 = ((zzham)(object2 = this.zza)).zzm()) == (n7 = this.zzb));
            n3 = n4;
        } else {
            Object object4 = object;
            object4 = (zzhav)object;
            n3 = this.zzb & 7;
            if (n3 != n8) {
                if (n3 != n7) throw zzhcd.zza();
                object = this.zza;
                n3 = ((zzham)object).zzn();
                zzhan.zzY(n3);
                zzham zzham3 = this.zza;
                n7 = zzham3.zzd() + n3;
                do {
                    double d7 = this.zza.zzb();
                    ((zzhav)object4).zzh(d7);
                } while ((n3 = ((zzham)(object = this.zza)).zzd()) < n7);
                return;
            }
            do {
                double d9 = this.zza.zzb();
                ((zzhav)object4).zzh(d9);
                object = this.zza;
                n3 = (int)(((zzham)object).zzC() ? 1 : 0);
                if (n3 == 0) continue;
                return;
            } while ((n3 = ((zzham)(object = this.zza)).zzm()) == (n7 = this.zzb));
        }
        this.zzd = n3;
    }
}

