/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabn;
import com.google.android.gms.internal.gtm.zzabq;
import com.google.android.gms.internal.gtm.zzabx;
import com.google.android.gms.internal.gtm.zzacg;
import com.google.android.gms.internal.gtm.zzacp;
import com.google.android.gms.internal.gtm.zzacq;
import com.google.android.gms.internal.gtm.zzacx;
import com.google.android.gms.internal.gtm.zzada;
import com.google.android.gms.internal.gtm.zzadt;
import com.google.android.gms.internal.gtm.zzadw;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzyo;
import com.google.android.gms.internal.gtm.zzyx;
import com.google.android.gms.internal.gtm.zzzb;
import java.util.List;

final class zzzc
implements zzadw {
    private final zzzb zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzzc(zzzb zzzb2) {
        this.zza = zzzb2;
        zzzb2.zzc = this;
    }

    private final Object zzR(zzadx zzadx2, zzabq zzabq2) {
        Object object = zzadx2.zze();
        this.zzT(object, zzadx2, zzabq2);
        zzadx2.zzf(object);
        return object;
    }

    private final Object zzS(zzadx zzadx2, zzabq zzabq2) {
        Object object = zzadx2.zze();
        this.zzU(object, zzadx2, zzabq2);
        zzadx2.zzf(object);
        return object;
    }

    private final void zzT(Object object, zzadx object2, zzabq zzabq2) {
        int n3;
        int n4;
        int n7 = this.zzc;
        this.zzc = n4 = this.zzb >>> 3 << 3 | 4;
        try {
            object2.zzh(object, this, zzabq2);
            n3 = this.zzb;
        }
        catch (Throwable throwable) {
            this.zzc = n7;
            throw throwable;
        }
        int n8 = this.zzc;
        if (n3 == n8) {
            this.zzc = n7;
            return;
        }
        object2 = "Failed to parse the message.";
        object = new zzacq((String)object2);
        throw object;
    }

    private final void zzU(Object object, zzadx zzadx2, zzabq zzabq2) {
        zzzb zzzb2 = this.zza;
        int n3 = zzzb2.zzn();
        int n4 = zzzb2.zza;
        int n7 = zzzb2.zzb;
        if (n4 < n7) {
            int n8;
            int n10 = zzzb2.zze(n3);
            zzzb zzzb3 = this.zza;
            zzzb3.zza = n4 = zzzb3.zza + 1;
            zzadx2.zzh(object, this, zzabq2);
            this.zza.zzz(0);
            object = this.zza;
            ((zzzb)object).zza = n8 = ((zzzb)object).zza + -1;
            ((zzzb)object).zzA(n10);
            return;
        }
        object = new zzacq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        throw object;
    }

    private final void zzV(int n3) {
        zzzb zzzb2 = this.zza;
        int n4 = zzzb2.zzd();
        if (n4 == n3) {
            return;
        }
        zzacq zzacq2 = new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        throw zzacq2;
    }

    private final void zzW(int n3) {
        int n4 = this.zzb & 7;
        if (n4 == n3) {
            return;
        }
        zzacp zzacp2 = new zzacp("Protocol message tag had invalid wire type.");
        throw zzacp2;
    }

    private static final void zzX(int n3) {
        if ((n3 &= 3) == 0) {
            return;
        }
        zzacq zzacq2 = new zzacq("Failed to parse the message.");
        throw zzacq2;
    }

    private static final void zzY(int n3) {
        if ((n3 &= 7) == 0) {
            return;
        }
        zzacq zzacq2 = new zzacq("Failed to parse the message.");
        throw zzacq2;
    }

    public static zzzc zzq(zzzb zzzb2) {
        zzzc zzzc2 = zzzb2.zzc;
        if (zzzc2 != null) {
            return zzzc2;
        }
        zzzc2 = new zzzc(zzzb2);
        return zzzc2;
    }

    public final void zzA(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzacg;
            Object object2 = "Protocol message tag had invalid wire type.";
            int n7 = 2;
            if (n4 != 0) {
                int n8;
                List list = object;
                list = (zzacg)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        object = this.zza;
                        int n10 = ((zzzb)object).zzn();
                        n3 = ((zzzb)object).zzd() + n10;
                        do {
                            n10 = this.zza.zzf();
                            ((zzacg)list).zzh(n10);
                        } while ((n10 = ((zzzb)(object2 = this.zza)).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    n3 = this.zza.zzf();
                    ((zzacg)list).zzh(n3);
                    object = this.zza;
                    n3 = (int)(((zzzb)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzzb)(object = this.zza)).zzm()) == (n8 = this.zzb));
            } else {
                int n14;
                Object object3;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        zzzb zzzb2 = this.zza;
                        int n15 = zzzb2.zzn();
                        n4 = zzzb2.zzd() + n15;
                        do {
                            object2 = this.zza.zzf();
                            object.add(object2);
                        } while ((n15 = ((zzzb)(object2 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    object3 = this.zza.zzf();
                    object.add(object3);
                    object3 = this.zza;
                    n4 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzzb)(object3 = this.zza)).zzm()) == (n14 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    public final void zzB(List object) {
        block6: {
            Object object2;
            int n3;
            block11: {
                block12: {
                    int n4;
                    block10: {
                        int n7;
                        Object object3;
                        int n8;
                        int n10;
                        block7: {
                            List list;
                            block8: {
                                block9: {
                                    int n14;
                                    n3 = object instanceof zzacg;
                                    object2 = "Protocol message tag had invalid wire type.";
                                    n10 = 5;
                                    n8 = 2;
                                    if (n3 == 0) break block7;
                                    list = object;
                                    list = (zzacg)object;
                                    n4 = this.zzb & 7;
                                    if (n4 == n8) break block8;
                                    if (n4 != n10) break block9;
                                    do {
                                        n4 = this.zza.zzg();
                                        ((zzacg)list).zzh(n4);
                                        object = this.zza;
                                        n4 = (int)(((zzzb)object).zzC() ? 1 : 0);
                                        if (n4 != 0) break block6;
                                    } while ((n4 = ((zzzb)(object = this.zza)).zzm()) == (n14 = this.zzb));
                                    break block10;
                                }
                                object = new zzacp((String)object2);
                                throw object;
                            }
                            object = this.zza;
                            n4 = ((zzzb)object).zzn();
                            zzzc.zzX(n4);
                            object2 = this.zza;
                            int n15 = ((zzzb)object2).zzd();
                            int n16 = n15 + n4;
                            do {
                                n4 = this.zza.zzg();
                                ((zzacg)list).zzh(n4);
                            } while ((n4 = ((zzzb)(object = this.zza)).zzd()) < n16);
                            break block6;
                        }
                        n3 = this.zzb & 7;
                        if (n3 == n8) break block11;
                        if (n3 != n10) break block12;
                        do {
                            object3 = this.zza.zzg();
                            object.add(object3);
                            object3 = this.zza;
                            n3 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                            if (n3 != 0) break block6;
                        } while ((n3 = ((zzzb)(object3 = this.zza)).zzm()) == (n7 = this.zzb));
                        n4 = n3;
                    }
                    this.zzd = n4;
                    return;
                }
                object = new zzacp((String)object2);
                throw object;
            }
            Object object4 = this.zza;
            n3 = ((zzzb)object4).zzn();
            zzzc.zzX(n3);
            object2 = this.zza;
            int n17 = ((zzzb)object2).zzd() + n3;
            do {
                object4 = this.zza.zzg();
                object.add(object4);
            } while ((n3 = ((zzzb)(object4 = this.zza)).zzd()) < n17);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzC(List object) {
        int n3;
        int n4 = object instanceof zzada;
        Object object2 = "Protocol message tag had invalid wire type.";
        int n7 = 2;
        int n8 = 1;
        if (n4 == 0) {
            int n10;
            Object object3;
            n4 = this.zzb & 7;
            if (n4 != n8) {
                if (n4 != n7) {
                    object = new zzacp((String)object2);
                    throw object;
                }
                zzzb zzzb2 = this.zza;
                n4 = zzzb2.zzn();
                zzzc.zzY(n4);
                object2 = this.zza;
                int n14 = ((zzzb)object2).zzd();
                n4 += n14;
                do {
                    long l2 = this.zza.zzo();
                    object2 = l2;
                    object.add(object2);
                } while ((n14 = ((zzzb)(object2 = this.zza)).zzd()) < n4);
                return;
            }
            do {
                long l3 = this.zza.zzo();
                object3 = l3;
                object.add(object3);
                object3 = this.zza;
                n4 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                if (n4 != 0) return;
            } while ((n4 = ((zzzb)(object3 = this.zza)).zzm()) == (n10 = this.zzb));
            n3 = n4;
        } else {
            int n15;
            Object object4 = object;
            object4 = (zzada)object;
            n3 = this.zzb & 7;
            if (n3 != n8) {
                if (n3 != n7) {
                    object = new zzacp((String)object2);
                    throw object;
                }
                object = this.zza;
                n3 = ((zzzb)object).zzn();
                zzzc.zzY(n3);
                object2 = this.zza;
                int n16 = ((zzzb)object2).zzd();
                n3 += n16;
                do {
                    long l4 = this.zza.zzo();
                    ((zzada)object4).zzf(l4);
                } while ((n16 = ((zzzb)(object2 = this.zza)).zzd()) < n3);
                return;
            }
            do {
                long l7 = this.zza.zzo();
                ((zzada)object4).zzf(l7);
                object = this.zza;
                n3 = (int)(((zzzb)object).zzC() ? 1 : 0);
                if (n3 == 0) continue;
                return;
            } while ((n3 = ((zzzb)(object = this.zza)).zzm()) == (n15 = this.zzb));
        }
        this.zzd = n3;
    }

    public final void zzD(List object) {
        block6: {
            Object object2;
            int n3;
            block11: {
                block12: {
                    int n4;
                    block10: {
                        int n7;
                        Object object3;
                        int n8;
                        int n10;
                        block7: {
                            List list;
                            block8: {
                                block9: {
                                    int n14;
                                    n3 = object instanceof zzabx;
                                    object2 = "Protocol message tag had invalid wire type.";
                                    n10 = 5;
                                    n8 = 2;
                                    if (n3 == 0) break block7;
                                    list = object;
                                    list = (zzabx)object;
                                    n4 = this.zzb & 7;
                                    if (n4 == n8) break block8;
                                    if (n4 != n10) break block9;
                                    do {
                                        float f5 = this.zza.zzc();
                                        ((zzabx)list).zzf(f5);
                                        object = this.zza;
                                        n4 = (int)(((zzzb)object).zzC() ? 1 : 0);
                                        if (n4 != 0) break block6;
                                    } while ((n4 = ((zzzb)(object = this.zza)).zzm()) == (n14 = this.zzb));
                                    break block10;
                                }
                                object = new zzacp((String)object2);
                                throw object;
                            }
                            object = this.zza;
                            n4 = ((zzzb)object).zzn();
                            zzzc.zzX(n4);
                            object2 = this.zza;
                            int n15 = ((zzzb)object2).zzd();
                            int n16 = n15 + n4;
                            do {
                                float f6 = this.zza.zzc();
                                ((zzabx)list).zzf(f6);
                            } while ((n4 = ((zzzb)(object = this.zza)).zzd()) < n16);
                            break block6;
                        }
                        n3 = this.zzb & 7;
                        if (n3 == n8) break block11;
                        if (n3 != n10) break block12;
                        do {
                            float f7 = this.zza.zzc();
                            object3 = Float.valueOf(f7);
                            object.add(object3);
                            object3 = this.zza;
                            n3 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                            if (n3 != 0) break block6;
                        } while ((n3 = ((zzzb)(object3 = this.zza)).zzm()) == (n7 = this.zzb));
                        n4 = n3;
                    }
                    this.zzd = n4;
                    return;
                }
                object = new zzacp((String)object2);
                throw object;
            }
            Object object4 = this.zza;
            n3 = ((zzzb)object4).zzn();
            zzzc.zzX(n3);
            object2 = this.zza;
            int n17 = ((zzzb)object2).zzd() + n3;
            do {
                float f8 = this.zza.zzc();
                object4 = Float.valueOf(f8);
                object.add(object4);
            } while ((n3 = ((zzzb)(object4 = this.zza)).zzd()) < n17);
        }
    }

    public final void zzE(List object, zzadx zzadx2, zzabq zzabq2) {
        int n3 = this.zzb;
        int n4 = n3 & 7;
        int n7 = 3;
        if (n4 == n7) {
            block2: {
                Object object2;
                do {
                    object2 = this.zzR(zzadx2, zzabq2);
                    object.add(object2);
                    object2 = this.zza;
                    n4 = (int)(((zzzb)object2).zzC() ? 1 : 0);
                    if (n4 != 0 || (n4 = this.zzd) != 0) break block2;
                } while ((n4 = ((zzzb)(object2 = this.zza)).zzm()) == n3);
                this.zzd = n4;
            }
            return;
        }
        object = new zzacp("Protocol message tag had invalid wire type.");
        throw object;
    }

    public final void zzF(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzacg;
            Object object2 = "Protocol message tag had invalid wire type.";
            int n7 = 2;
            if (n4 != 0) {
                int n8;
                List list = object;
                list = (zzacg)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        object = this.zza;
                        int n10 = ((zzzb)object).zzn();
                        n3 = ((zzzb)object).zzd() + n10;
                        do {
                            n10 = this.zza.zzh();
                            ((zzacg)list).zzh(n10);
                        } while ((n10 = ((zzzb)(object2 = this.zza)).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    n3 = this.zza.zzh();
                    ((zzacg)list).zzh(n3);
                    object = this.zza;
                    n3 = (int)(((zzzb)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzzb)(object = this.zza)).zzm()) == (n8 = this.zzb));
            } else {
                int n14;
                Object object3;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        zzzb zzzb2 = this.zza;
                        int n15 = zzzb2.zzn();
                        n4 = zzzb2.zzd() + n15;
                        do {
                            object2 = this.zza.zzh();
                            object.add(object2);
                        } while ((n15 = ((zzzb)(object2 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    object3 = this.zza.zzh();
                    object.add(object3);
                    object3 = this.zza;
                    n4 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzzb)(object3 = this.zza)).zzm()) == (n14 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    public final void zzG(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzada;
            Object object2 = "Protocol message tag had invalid wire type.";
            int n7 = 2;
            if (n4 != 0) {
                int n8;
                List list = object;
                list = (zzada)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        object = this.zza;
                        int n10 = ((zzzb)object).zzn();
                        n3 = ((zzzb)object).zzd() + n10;
                        do {
                            long l2 = this.zza.zzp();
                            ((zzada)list).zzf(l2);
                        } while ((n10 = ((zzzb)(object2 = this.zza)).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    long l3 = this.zza.zzp();
                    ((zzada)list).zzf(l3);
                    object = this.zza;
                    n3 = (int)(((zzzb)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzzb)(object = this.zza)).zzm()) == (n8 = this.zzb));
            } else {
                int n14;
                Object object3;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        zzzb zzzb2 = this.zza;
                        int n15 = zzzb2.zzn();
                        n4 = zzzb2.zzd() + n15;
                        do {
                            long l4 = this.zza.zzp();
                            object2 = l4;
                            object.add(object2);
                        } while ((n15 = ((zzzb)(object2 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    long l7 = this.zza.zzp();
                    object3 = l7;
                    object.add(object3);
                    object3 = this.zza;
                    n4 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzzb)(object3 = this.zza)).zzm()) == (n14 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    public final void zzH(List object, zzadx zzadx2, zzabq zzabq2) {
        int n3 = this.zzb;
        int n4 = n3 & 7;
        int n7 = 2;
        if (n4 == n7) {
            block2: {
                Object object2;
                do {
                    object2 = this.zzS(zzadx2, zzabq2);
                    object.add(object2);
                    object2 = this.zza;
                    n4 = (int)(((zzzb)object2).zzC() ? 1 : 0);
                    if (n4 != 0 || (n4 = this.zzd) != 0) break block2;
                } while ((n4 = ((zzzb)(object2 = this.zza)).zzm()) == n3);
                this.zzd = n4;
            }
            return;
        }
        object = new zzacp("Protocol message tag had invalid wire type.");
        throw object;
    }

    public final void zzI(List object) {
        block6: {
            Object object2;
            int n3;
            block11: {
                block12: {
                    int n4;
                    block10: {
                        int n7;
                        Object object3;
                        int n8;
                        int n10;
                        block7: {
                            List list;
                            block8: {
                                block9: {
                                    int n14;
                                    n3 = object instanceof zzacg;
                                    object2 = "Protocol message tag had invalid wire type.";
                                    n10 = 5;
                                    n8 = 2;
                                    if (n3 == 0) break block7;
                                    list = object;
                                    list = (zzacg)object;
                                    n4 = this.zzb & 7;
                                    if (n4 == n8) break block8;
                                    if (n4 != n10) break block9;
                                    do {
                                        n4 = this.zza.zzk();
                                        ((zzacg)list).zzh(n4);
                                        object = this.zza;
                                        n4 = (int)(((zzzb)object).zzC() ? 1 : 0);
                                        if (n4 != 0) break block6;
                                    } while ((n4 = ((zzzb)(object = this.zza)).zzm()) == (n14 = this.zzb));
                                    break block10;
                                }
                                object = new zzacp((String)object2);
                                throw object;
                            }
                            object = this.zza;
                            n4 = ((zzzb)object).zzn();
                            zzzc.zzX(n4);
                            object2 = this.zza;
                            int n15 = ((zzzb)object2).zzd();
                            int n16 = n15 + n4;
                            do {
                                n4 = this.zza.zzk();
                                ((zzacg)list).zzh(n4);
                            } while ((n4 = ((zzzb)(object = this.zza)).zzd()) < n16);
                            break block6;
                        }
                        n3 = this.zzb & 7;
                        if (n3 == n8) break block11;
                        if (n3 != n10) break block12;
                        do {
                            object3 = this.zza.zzk();
                            object.add(object3);
                            object3 = this.zza;
                            n3 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                            if (n3 != 0) break block6;
                        } while ((n3 = ((zzzb)(object3 = this.zza)).zzm()) == (n7 = this.zzb));
                        n4 = n3;
                    }
                    this.zzd = n4;
                    return;
                }
                object = new zzacp((String)object2);
                throw object;
            }
            Object object4 = this.zza;
            n3 = ((zzzb)object4).zzn();
            zzzc.zzX(n3);
            object2 = this.zza;
            int n17 = ((zzzb)object2).zzd() + n3;
            do {
                object4 = this.zza.zzk();
                object.add(object4);
            } while ((n3 = ((zzzb)(object4 = this.zza)).zzd()) < n17);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzJ(List object) {
        int n3;
        int n4 = object instanceof zzada;
        Object object2 = "Protocol message tag had invalid wire type.";
        int n7 = 2;
        int n8 = 1;
        if (n4 == 0) {
            int n10;
            Object object3;
            n4 = this.zzb & 7;
            if (n4 != n8) {
                if (n4 != n7) {
                    object = new zzacp((String)object2);
                    throw object;
                }
                zzzb zzzb2 = this.zza;
                n4 = zzzb2.zzn();
                zzzc.zzY(n4);
                object2 = this.zza;
                int n14 = ((zzzb)object2).zzd();
                n4 += n14;
                do {
                    long l2 = this.zza.zzt();
                    object2 = l2;
                    object.add(object2);
                } while ((n14 = ((zzzb)(object2 = this.zza)).zzd()) < n4);
                return;
            }
            do {
                long l3 = this.zza.zzt();
                object3 = l3;
                object.add(object3);
                object3 = this.zza;
                n4 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                if (n4 != 0) return;
            } while ((n4 = ((zzzb)(object3 = this.zza)).zzm()) == (n10 = this.zzb));
            n3 = n4;
        } else {
            int n15;
            Object object4 = object;
            object4 = (zzada)object;
            n3 = this.zzb & 7;
            if (n3 != n8) {
                if (n3 != n7) {
                    object = new zzacp((String)object2);
                    throw object;
                }
                object = this.zza;
                n3 = ((zzzb)object).zzn();
                zzzc.zzY(n3);
                object2 = this.zza;
                int n16 = ((zzzb)object2).zzd();
                n3 += n16;
                do {
                    long l4 = this.zza.zzt();
                    ((zzada)object4).zzf(l4);
                } while ((n16 = ((zzzb)(object2 = this.zza)).zzd()) < n3);
                return;
            }
            do {
                long l7 = this.zza.zzt();
                ((zzada)object4).zzf(l7);
                object = this.zza;
                n3 = (int)(((zzzb)object).zzC() ? 1 : 0);
                if (n3 == 0) continue;
                return;
            } while ((n3 = ((zzzb)(object = this.zza)).zzm()) == (n15 = this.zzb));
        }
        this.zzd = n3;
    }

    public final void zzK(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzacg;
            Object object2 = "Protocol message tag had invalid wire type.";
            int n7 = 2;
            if (n4 != 0) {
                int n8;
                List list = object;
                list = (zzacg)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        object = this.zza;
                        int n10 = ((zzzb)object).zzn();
                        n3 = ((zzzb)object).zzd() + n10;
                        do {
                            n10 = this.zza.zzl();
                            ((zzacg)list).zzh(n10);
                        } while ((n10 = ((zzzb)(object2 = this.zza)).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    n3 = this.zza.zzl();
                    ((zzacg)list).zzh(n3);
                    object = this.zza;
                    n3 = (int)(((zzzb)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzzb)(object = this.zza)).zzm()) == (n8 = this.zzb));
            } else {
                int n14;
                Object object3;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        zzzb zzzb2 = this.zza;
                        int n15 = zzzb2.zzn();
                        n4 = zzzb2.zzd() + n15;
                        do {
                            object2 = this.zza.zzl();
                            object.add(object2);
                        } while ((n15 = ((zzzb)(object2 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    object3 = this.zza.zzl();
                    object.add(object3);
                    object3 = this.zza;
                    n4 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzzb)(object3 = this.zza)).zzm()) == (n14 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    public final void zzL(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzada;
            Object object2 = "Protocol message tag had invalid wire type.";
            int n7 = 2;
            if (n4 != 0) {
                int n8;
                List list = object;
                list = (zzada)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        object = this.zza;
                        int n10 = ((zzzb)object).zzn();
                        n3 = ((zzzb)object).zzd() + n10;
                        do {
                            long l2 = this.zza.zzu();
                            ((zzada)list).zzf(l2);
                        } while ((n10 = ((zzzb)(object2 = this.zza)).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    long l3 = this.zza.zzu();
                    ((zzada)list).zzf(l3);
                    object = this.zza;
                    n3 = (int)(((zzzb)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzzb)(object = this.zza)).zzm()) == (n8 = this.zzb));
            } else {
                int n14;
                Object object3;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        zzzb zzzb2 = this.zza;
                        int n15 = zzzb2.zzn();
                        n4 = zzzb2.zzd() + n15;
                        do {
                            long l4 = this.zza.zzu();
                            object2 = l4;
                            object.add(object2);
                        } while ((n15 = ((zzzb)(object2 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    long l7 = this.zza.zzu();
                    object3 = l7;
                    object.add(object3);
                    object3 = this.zza;
                    n4 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzzb)(object3 = this.zza)).zzm()) == (n14 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzM(List object, boolean n3) {
        int n4 = this.zzb & 7;
        int n7 = 2;
        if (n4 == n7) {
            n4 = object instanceof zzacx;
            if (n4 != 0 && n3 == 0) {
                zzzb zzzb2;
                object = (zzacx)object;
                do {
                    this.zzp();
                    object.zza();
                    zzzb2 = this.zza;
                    n3 = (int)(zzzb2.zzC() ? 1 : 0);
                    if (n3 != 0) return;
                } while ((n3 = (zzzb2 = this.zza).zzm()) == (n4 = this.zzb));
            } else {
                Object object2;
                do {
                    object2 = n3 != 0 ? this.zzu() : this.zzt();
                    ((List)object).add(object2);
                    object2 = this.zza;
                    n4 = (int)(((zzzb)object2).zzC() ? 1 : 0);
                    if (n4 == 0) continue;
                    return;
                } while ((n4 = ((zzzb)(object2 = this.zza)).zzm()) == (n7 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
            return;
        }
        object = new zzacp("Protocol message tag had invalid wire type.");
        throw object;
    }

    public final void zzN(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzacg;
            Object object2 = "Protocol message tag had invalid wire type.";
            int n7 = 2;
            if (n4 != 0) {
                int n8;
                List list = object;
                list = (zzacg)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        object = this.zza;
                        int n10 = ((zzzb)object).zzn();
                        n3 = ((zzzb)object).zzd() + n10;
                        do {
                            n10 = this.zza.zzn();
                            ((zzacg)list).zzh(n10);
                        } while ((n10 = ((zzzb)(object2 = this.zza)).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    n3 = this.zza.zzn();
                    ((zzacg)list).zzh(n3);
                    object = this.zza;
                    n3 = (int)(((zzzb)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzzb)(object = this.zza)).zzm()) == (n8 = this.zzb));
            } else {
                int n14;
                Object object3;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        zzzb zzzb2 = this.zza;
                        int n15 = zzzb2.zzn();
                        n4 = zzzb2.zzd() + n15;
                        do {
                            object2 = this.zza.zzn();
                            object.add(object2);
                        } while ((n15 = ((zzzb)(object2 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    object3 = this.zza.zzn();
                    object.add(object3);
                    object3 = this.zza;
                    n4 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzzb)(object3 = this.zza)).zzm()) == (n14 = this.zzb));
                n3 = n4;
            }
            this.zzd = n3;
        }
    }

    public final void zzO(List object) {
        block10: {
            int n3;
            int n4 = object instanceof zzada;
            Object object2 = "Protocol message tag had invalid wire type.";
            int n7 = 2;
            if (n4 != 0) {
                int n8;
                List list = object;
                list = (zzada)object;
                n3 = this.zzb & 7;
                if (n3 != 0) {
                    if (n3 == n7) {
                        object = this.zza;
                        int n10 = ((zzzb)object).zzn();
                        n3 = ((zzzb)object).zzd() + n10;
                        do {
                            long l2 = this.zza.zzv();
                            ((zzada)list).zzf(l2);
                        } while ((n10 = ((zzzb)(object2 = this.zza)).zzd()) < n3);
                        this.zzV(n3);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    long l3 = this.zza.zzv();
                    ((zzada)list).zzf(l3);
                    object = this.zza;
                    n3 = (int)(((zzzb)object).zzC() ? 1 : 0);
                    if (n3 != 0) break block10;
                } while ((n3 = ((zzzb)(object = this.zza)).zzm()) == (n8 = this.zzb));
            } else {
                int n14;
                Object object3;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        zzzb zzzb2 = this.zza;
                        int n15 = zzzb2.zzn();
                        n4 = zzzb2.zzd() + n15;
                        do {
                            long l4 = this.zza.zzv();
                            object2 = l4;
                            object.add(object2);
                        } while ((n15 = ((zzzb)(object2 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    long l7 = this.zza.zzv();
                    object3 = l7;
                    object.add(object3);
                    object3 = this.zza;
                    n4 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzzb)(object3 = this.zza)).zzm()) == (n14 = this.zzb));
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
        zzzb zzzb2 = this.zza;
        int n4 = zzzb2.zzC();
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
            zzzb zzzb2 = this.zza;
            this.zzb = n4 = zzzb2.zzm();
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

    public final zzyx zzp() {
        this.zzW(2);
        return this.zza.zzw();
    }

    public final Object zzr(Class object, zzabq zzabq2) {
        this.zzW(3);
        object = zzadt.zza().zzb((Class)object);
        return this.zzR((zzadx)object, zzabq2);
    }

    public final Object zzs(Class object, zzabq zzabq2) {
        this.zzW(2);
        object = zzadt.zza().zzb((Class)object);
        return this.zzS((zzadx)object, zzabq2);
    }

    public final String zzt() {
        this.zzW(2);
        return this.zza.zzx();
    }

    public final String zzu() {
        this.zzW(2);
        return this.zza.zzy();
    }

    public final void zzv(Object object, zzadx zzadx2, zzabq zzabq2) {
        this.zzW(3);
        this.zzT(object, zzadx2, zzabq2);
    }

    public final void zzw(Object object, zzadx zzadx2, zzabq zzabq2) {
        this.zzW(2);
        this.zzU(object, zzadx2, zzabq2);
    }

    /*
     * WARNING - void declaration
     */
    public final void zzx(List object) {
        block10: {
            void var6_12;
            int n4 = object instanceof zzyo;
            Object object2 = "Protocol message tag had invalid wire type.";
            int n7 = 2;
            if (n4 != 0) {
                int n3;
                int n8;
                Object list = object;
                list = (zzyo)object;
                int n32 = this.zzb & 7;
                if (n32 != 0) {
                    if (n32 == n7) {
                        object = this.zza;
                        int n10 = ((zzzb)object).zzn();
                        int n14 = ((zzzb)object).zzd() + n10;
                        do {
                            n10 = (int)(this.zza.zzD() ? 1 : 0);
                            ((zzyo)list).zze(n10 != 0);
                        } while ((n10 = ((zzzb)(object2 = this.zza)).zzd()) < n14);
                        this.zzV(n14);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    n8 = this.zza.zzD();
                    ((zzyo)list).zze(n8 != 0);
                    object = this.zza;
                    n8 = ((zzzb)object).zzC();
                    if (n8 != 0) break block10;
                } while ((n8 = ((zzzb)(object = this.zza)).zzm()) == (n3 = this.zzb));
            } else {
                int n15;
                Object object3;
                n4 = this.zzb & 7;
                if (n4 != 0) {
                    if (n4 == n7) {
                        zzzb zzzb2 = this.zza;
                        int n16 = zzzb2.zzn();
                        n4 = zzzb2.zzd() + n16;
                        do {
                            object2 = this.zza.zzD();
                            object.add(object2);
                        } while ((n16 = ((zzzb)(object2 = this.zza)).zzd()) < n4);
                        this.zzV(n4);
                        return;
                    }
                    object = new zzacp((String)object2);
                    throw object;
                }
                do {
                    object3 = this.zza.zzD();
                    object.add(object3);
                    object3 = this.zza;
                    n4 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                    if (n4 != 0) break block10;
                } while ((n4 = ((zzzb)(object3 = this.zza)).zzm()) == (n15 = this.zzb));
                int n17 = n4;
            }
            this.zzd = var6_12;
        }
    }

    public final void zzy(List object) {
        int n3 = this.zzb & 7;
        int n4 = 2;
        if (n3 == n4) {
            Object object2;
            do {
                object2 = this.zzp();
                object.add(object2);
                object2 = this.zza;
                n3 = (int)(((zzzb)object2).zzC() ? 1 : 0);
                if (n3 == 0) continue;
                return;
            } while ((n3 = ((zzzb)(object2 = this.zza)).zzm()) == (n4 = this.zzb));
            this.zzd = n3;
            return;
        }
        object = new zzacp("Protocol message tag had invalid wire type.");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzz(List object) {
        int n3;
        int n4 = object instanceof zzabn;
        Object object2 = "Protocol message tag had invalid wire type.";
        int n7 = 2;
        int n8 = 1;
        if (n4 == 0) {
            int n10;
            Object object3;
            n4 = this.zzb & 7;
            if (n4 != n8) {
                if (n4 != n7) {
                    object = new zzacp((String)object2);
                    throw object;
                }
                zzzb zzzb2 = this.zza;
                n4 = zzzb2.zzn();
                zzzc.zzY(n4);
                object2 = this.zza;
                int n14 = ((zzzb)object2).zzd();
                n4 += n14;
                do {
                    double d2 = this.zza.zzb();
                    object2 = d2;
                    object.add(object2);
                } while ((n14 = ((zzzb)(object2 = this.zza)).zzd()) < n4);
                return;
            }
            do {
                double d5 = this.zza.zzb();
                object3 = d5;
                object.add(object3);
                object3 = this.zza;
                n4 = (int)(((zzzb)object3).zzC() ? 1 : 0);
                if (n4 != 0) return;
            } while ((n4 = ((zzzb)(object3 = this.zza)).zzm()) == (n10 = this.zzb));
            n3 = n4;
        } else {
            int n15;
            Object object4 = object;
            object4 = (zzabn)object;
            n3 = this.zzb & 7;
            if (n3 != n8) {
                if (n3 != n7) {
                    object = new zzacp((String)object2);
                    throw object;
                }
                object = this.zza;
                n3 = ((zzzb)object).zzn();
                zzzc.zzY(n3);
                object2 = this.zza;
                int n16 = ((zzzb)object2).zzd();
                n3 += n16;
                do {
                    double d7 = this.zza.zzb();
                    ((zzabn)object4).zzf(d7);
                } while ((n16 = ((zzzb)(object2 = this.zza)).zzd()) < n3);
                return;
            }
            do {
                double d9 = this.zza.zzb();
                ((zzabn)object4).zzf(d9);
                object = this.zza;
                n3 = (int)(((zzzb)object).zzC() ? 1 : 0);
                if (n3 == 0) continue;
                return;
            } while ((n3 = ((zzzb)(object = this.zza)).zzm()) == (n15 = this.zzb));
        }
        this.zzd = n3;
    }
}

