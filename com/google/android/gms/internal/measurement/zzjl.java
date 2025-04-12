/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziw;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.internal.measurement.zzjs;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzkc;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.gms.internal.measurement.zzma;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzmf;
import com.google.android.gms.internal.measurement.zzng;
import java.util.List;
import java.util.Map;

final class zzjl
implements zzmf {
    private final zzjk zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzjl(zzjk zzjk2) {
        this.zza = zzjk2 = (zzjk)zzkj.zza(zzjk2, "input");
        zzjk2.zzc = this;
    }

    public static zzjl zza(zzjk zzjk2) {
        zzjl zzjl2 = zzjk2.zzc;
        if (zzjl2 != null) {
            return zzjl2;
        }
        zzjl2 = new zzjl(zzjk2);
        return zzjl2;
    }

    private final Object zza(zzme zzme2, zzjt zzjt2) {
        Object object = zzme2.zza();
        this.zzc(object, zzme2, zzjt2);
        zzme2.zzd(object);
        return object;
    }

    private final Object zza(zzng object, Class clazz, zzjt zzjt2) {
        int[] nArray = zzjo.zza;
        int n3 = object.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                object = new IllegalArgumentException("unsupported field type.");
                throw object;
            }
            case 17: {
                return this.zzo();
            }
            case 16: {
                return this.zzj();
            }
            case 15: {
                return this.zzr();
            }
            case 14: {
                return this.zzn();
            }
            case 13: {
                return this.zzi();
            }
            case 12: {
                return this.zzm();
            }
            case 11: {
                return this.zzh();
            }
            case 10: {
                this.zzb(2);
                object = zzma.zza().zza(clazz);
                return this.zzb((zzme)object, zzjt2);
            }
            case 9: {
                return this.zzl();
            }
            case 8: {
                return this.zzg();
            }
            case 7: {
                return Float.valueOf(this.zzb());
            }
            case 6: {
                return this.zzk();
            }
            case 5: {
                return this.zzf();
            }
            case 4: {
                return this.zze();
            }
            case 3: {
                return this.zza();
            }
            case 2: {
                return this.zzp();
            }
            case 1: 
        }
        return this.zzs();
    }

    private final void zza(int n3) {
        zzjk zzjk2 = this.zza;
        int n4 = zzjk2.zzc();
        if (n4 == n3) {
            return;
        }
        throw zzkp.zzi();
    }

    private final void zza(List object, boolean n3) {
        int n4 = this.zzb & 7;
        int n7 = 2;
        if (n4 == n7) {
            Object object2;
            n4 = object instanceof zzkx;
            if (n4 != 0 && n3 == 0) {
                int n8;
                Object list = object;
                list = (zzkx)object;
                do {
                    object = this.zzp();
                    list.zza((zziy)object);
                    object = this.zza;
                    n8 = ((zzjk)object).zzt();
                    if (n8 == 0) continue;
                    return;
                } while ((n8 = ((zzjk)(object = this.zza)).zzi()) == (n3 = this.zzb));
                this.zzd = n8;
                return;
            }
            do {
                object2 = n3 != 0 ? this.zzr() : this.zzq();
                ((List)object).add(object2);
                object2 = this.zza;
                n4 = (int)(((zzjk)object2).zzt() ? 1 : 0);
                if (n4 == 0) continue;
                return;
            } while ((n4 = ((zzjk)(object2 = this.zza)).zzi()) == (n7 = this.zzb));
            this.zzd = n4;
            return;
        }
        throw zzkp.zza();
    }

    private final Object zzb(zzme zzme2, zzjt zzjt2) {
        Object object = zzme2.zza();
        this.zzd(object, zzme2, zzjt2);
        zzme2.zzd(object);
        return object;
    }

    private final void zzb(int n3) {
        int n4 = this.zzb & 7;
        if (n4 == n3) {
            return;
        }
        throw zzkp.zza();
    }

    private static void zzc(int n3) {
        if ((n3 &= 3) == 0) {
            return;
        }
        throw zzkp.zzg();
    }

    private final void zzc(Object object, zzme zzme2, zzjt zzjt2) {
        block5: {
            int n3;
            int n4;
            int n7 = this.zzc;
            this.zzc = n4 = this.zzb >>> 3 << 3 | 4;
            try {
                zzme2.zza(object, this, zzjt2);
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
        object = zzkp.zzg();
        throw object;
    }

    private static void zzd(int n3) {
        if ((n3 &= 7) == 0) {
            return;
        }
        throw zzkp.zzg();
    }

    private final void zzd(Object object, zzme zzme2, zzjt zzjt2) {
        int n3;
        int n4;
        int n7 = this.zza.zzj();
        this.zza.zzv();
        n7 = this.zza.zza(n7);
        zzjk zzjk2 = this.zza;
        zzjk2.zza = n4 = zzjk2.zza + 1;
        zzme2.zza(object, this, zzjt2);
        this.zza.zzb(0);
        object = this.zza;
        ((zzjk)object).zza = n3 = ((zzjk)object).zza + -1;
        ((zzjk)object).zzc(n7);
    }

    public final double zza() {
        this.zzb(1);
        return this.zza.zza();
    }

    public final void zza(Object object, zzme zzme2, zzjt zzjt2) {
        this.zzb(3);
        this.zzc(object, zzme2, zzjt2);
    }

    public final void zza(List object) {
        Object object2;
        int n3 = object instanceof zziw;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zziw)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzjk)object).zzj();
                    zzjk zzjk2 = this.zza;
                    n4 = zzjk2.zzc() + n7;
                    do {
                        n7 = (int)(this.zza.zzu() ? 1 : 0);
                        ((zziw)list).zza(n7 != 0);
                    } while ((n7 = ((zzjk)(object = this.zza)).zzc()) < n4);
                    this.zza(n4);
                    return;
                }
                throw zzkp.zza();
            }
            do {
                n7 = (int)(this.zza.zzu() ? 1 : 0);
                ((zziw)list).zza(n7 != 0);
                object = this.zza;
                n7 = (int)(((zzjk)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzjk)object3).zzj();
                zzjk zzjk3 = this.zza;
                n4 = zzjk3.zzc() + n3;
                do {
                    object3 = this.zza.zzu();
                    object.add(object3);
                } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
                this.zza(n4);
                return;
            }
            throw zzkp.zza();
        }
        do {
            object2 = this.zza.zzu();
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final void zza(List list, zzme zzme2, zzjt zzjt2) {
        int n3 = this.zzb;
        int n4 = n3 & 7;
        int n7 = 3;
        if (n4 == n7) {
            block2: {
                Object object;
                do {
                    object = this.zza(zzme2, zzjt2);
                    list.add(object);
                    object = this.zza;
                    n4 = (int)(((zzjk)object).zzt() ? 1 : 0);
                    if (n4 != 0 || (n4 = this.zzd) != 0) break block2;
                } while ((n4 = ((zzjk)(object = this.zza)).zzi()) == n3);
                this.zzd = n4;
            }
            return;
        }
        throw zzkp.zza();
    }

    /*
     * Exception decompiling
     */
    public final void zza(Map var1_1, zzlh var2_3, zzjt var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [12, 11 : 135->139)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final float zzb() {
        this.zzb(5);
        return this.zza.zzb();
    }

    public final void zzb(Object object, zzme zzme2, zzjt zzjt2) {
        this.zzb(2);
        this.zzd(object, zzme2, zzjt2);
    }

    public final void zzb(List list) {
        int n3 = this.zzb & 7;
        int n4 = 2;
        if (n3 == n4) {
            Object object;
            do {
                object = this.zzp();
                list.add(object);
                object = this.zza;
                n3 = (int)(((zzjk)object).zzt() ? 1 : 0);
                if (n3 == 0) continue;
                return;
            } while ((n3 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
            this.zzd = n3;
            return;
        }
        throw zzkp.zza();
    }

    public final void zzb(List list, zzme zzme2, zzjt zzjt2) {
        int n3 = this.zzb;
        int n4 = n3 & 7;
        int n7 = 2;
        if (n4 == n7) {
            block2: {
                Object object;
                do {
                    object = this.zzb(zzme2, zzjt2);
                    list.add(object);
                    object = this.zza;
                    n4 = (int)(((zzjk)object).zzt() ? 1 : 0);
                    if (n4 != 0 || (n4 = this.zzd) != 0) break block2;
                } while ((n4 = ((zzjk)(object = this.zza)).zzi()) == n3);
                this.zzd = n4;
            }
            return;
        }
        throw zzkp.zza();
    }

    public final int zzc() {
        int n3;
        int n4 = this.zzd;
        if (n4 != 0) {
            this.zzb = n4;
            n4 = 0;
            Object var2_2 = null;
            this.zzd = 0;
        } else {
            zzjk zzjk2 = this.zza;
            this.zzb = n4 = zzjk2.zzi();
        }
        n4 = this.zzb;
        if (n4 != 0 && n4 != (n3 = this.zzc)) {
            return n4 >>> 3;
        }
        return -1 >>> 1;
    }

    public final void zzc(List object) {
        Object object2;
        int n3 = object instanceof zzjs;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            List list = object;
            list = (zzjs)object;
            int n8 = this.zzb & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    object = this.zza;
                    n8 = ((zzjk)object).zzj();
                    zzjl.zzd(n8);
                    zzjk zzjk2 = this.zza;
                    n4 = zzjk2.zzc() + n8;
                    do {
                        double d2 = this.zza.zza();
                        ((zzjs)list).zza(d2);
                    } while ((n8 = ((zzjk)(object = this.zza)).zzc()) < n4);
                    return;
                }
                throw zzkp.zza();
            }
            do {
                double d5 = this.zza.zza();
                ((zzjs)list).zza(d5);
                object = this.zza;
                n8 = (int)(((zzjk)object).zzt() ? 1 : 0);
                if (n8 == 0) continue;
                return;
            } while ((n8 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
            this.zzd = n8;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzjk)object3).zzj();
                zzjl.zzd(n3);
                zzjk zzjk3 = this.zza;
                n4 = zzjk3.zzc() + n3;
                do {
                    double d7 = this.zza.zza();
                    object3 = d7;
                    object.add(object3);
                } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
                return;
            }
            throw zzkp.zza();
        }
        do {
            double d9 = this.zza.zza();
            object2 = d9;
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final void zzd(List object) {
        Object object2;
        int n3 = object instanceof zzkh;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzkh)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzjk)object).zzj();
                    zzjk zzjk2 = this.zza;
                    n4 = zzjk2.zzc() + n7;
                    do {
                        n7 = this.zza.zzd();
                        ((zzkh)list).zzd(n7);
                    } while ((n7 = ((zzjk)(object = this.zza)).zzc()) < n4);
                    this.zza(n4);
                    return;
                }
                throw zzkp.zza();
            }
            do {
                n7 = this.zza.zzd();
                ((zzkh)list).zzd(n7);
                object = this.zza;
                n7 = (int)(((zzjk)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzjk)object3).zzj();
                zzjk zzjk3 = this.zza;
                n4 = zzjk3.zzc() + n3;
                do {
                    object3 = this.zza.zzd();
                    object.add(object3);
                } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
                this.zza(n4);
                return;
            }
            throw zzkp.zza();
        }
        do {
            object2 = this.zza.zzd();
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final int zze() {
        this.zzb(0);
        return this.zza.zzd();
    }

    public final void zze(List object) {
        int n3 = object instanceof zzkh;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzkh)object;
            int n8 = this.zzb & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    do {
                        n8 = this.zza.zze();
                        ((zzkh)list).zzd(n8);
                        object = this.zza;
                        n8 = (int)(((zzjk)object).zzt() ? 1 : 0);
                        if (n8 == 0) continue;
                        return;
                    } while ((n8 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
                    this.zzd = n8;
                    return;
                }
                throw zzkp.zza();
            }
            object = this.zza;
            n8 = ((zzjk)object).zzj();
            zzjl.zzc(n8);
            zzjk zzjk2 = this.zza;
            n4 = zzjk2.zzc();
            int n10 = n4 + n8;
            do {
                n8 = this.zza.zze();
                ((zzkh)list).zzd(n8);
            } while ((n8 = ((zzjk)(object = this.zza)).zzc()) < n10);
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                Object object2;
                do {
                    object2 = this.zza.zze();
                    object.add(object2);
                    object2 = this.zza;
                    n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
                    if (n3 == 0) continue;
                    return;
                } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
                this.zzd = n3;
                return;
            }
            throw zzkp.zza();
        }
        Object object3 = this.zza;
        n3 = ((zzjk)object3).zzj();
        zzjl.zzc(n3);
        zzjk zzjk3 = this.zza;
        n4 = zzjk3.zzc() + n3;
        do {
            object3 = this.zza.zze();
            object.add(object3);
        } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
    }

    public final int zzf() {
        this.zzb(5);
        return this.zza.zze();
    }

    public final void zzf(List object) {
        Object object2;
        int n3 = object instanceof zzlb;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            List list = object;
            list = (zzlb)object;
            int n8 = this.zzb & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    object = this.zza;
                    n8 = ((zzjk)object).zzj();
                    zzjl.zzd(n8);
                    zzjk zzjk2 = this.zza;
                    n4 = zzjk2.zzc() + n8;
                    do {
                        long l2 = this.zza.zzk();
                        ((zzlb)list).zza(l2);
                    } while ((n8 = ((zzjk)(object = this.zza)).zzc()) < n4);
                    return;
                }
                throw zzkp.zza();
            }
            do {
                long l3 = this.zza.zzk();
                ((zzlb)list).zza(l3);
                object = this.zza;
                n8 = (int)(((zzjk)object).zzt() ? 1 : 0);
                if (n8 == 0) continue;
                return;
            } while ((n8 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
            this.zzd = n8;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzjk)object3).zzj();
                zzjl.zzd(n3);
                zzjk zzjk3 = this.zza;
                n4 = zzjk3.zzc() + n3;
                do {
                    long l4 = this.zza.zzk();
                    object3 = l4;
                    object.add(object3);
                } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
                return;
            }
            throw zzkp.zza();
        }
        do {
            long l7 = this.zza.zzk();
            object2 = l7;
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final int zzg() {
        this.zzb(0);
        return this.zza.zzf();
    }

    public final void zzg(List object) {
        int n3 = object instanceof zzkc;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzkc)object;
            int n8 = this.zzb & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    do {
                        float f5 = this.zza.zzb();
                        ((zzkc)list).zza(f5);
                        object = this.zza;
                        n8 = (int)(((zzjk)object).zzt() ? 1 : 0);
                        if (n8 == 0) continue;
                        return;
                    } while ((n8 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
                    this.zzd = n8;
                    return;
                }
                throw zzkp.zza();
            }
            object = this.zza;
            n8 = ((zzjk)object).zzj();
            zzjl.zzc(n8);
            zzjk zzjk2 = this.zza;
            n4 = zzjk2.zzc();
            int n10 = n4 + n8;
            do {
                float f6 = this.zza.zzb();
                ((zzkc)list).zza(f6);
            } while ((n8 = ((zzjk)(object = this.zza)).zzc()) < n10);
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                Object object2;
                do {
                    float f7 = this.zza.zzb();
                    object2 = Float.valueOf(f7);
                    object.add(object2);
                    object2 = this.zza;
                    n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
                    if (n3 == 0) continue;
                    return;
                } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
                this.zzd = n3;
                return;
            }
            throw zzkp.zza();
        }
        Object object3 = this.zza;
        n3 = ((zzjk)object3).zzj();
        zzjl.zzc(n3);
        zzjk zzjk3 = this.zza;
        n4 = zzjk3.zzc() + n3;
        do {
            float f8 = this.zza.zzb();
            object3 = Float.valueOf(f8);
            object.add(object3);
        } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
    }

    public final int zzh() {
        this.zzb(5);
        return this.zza.zzg();
    }

    public final void zzh(List object) {
        Object object2;
        int n3 = object instanceof zzkh;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzkh)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzjk)object).zzj();
                    zzjk zzjk2 = this.zza;
                    n4 = zzjk2.zzc() + n7;
                    do {
                        n7 = this.zza.zzf();
                        ((zzkh)list).zzd(n7);
                    } while ((n7 = ((zzjk)(object = this.zza)).zzc()) < n4);
                    this.zza(n4);
                    return;
                }
                throw zzkp.zza();
            }
            do {
                n7 = this.zza.zzf();
                ((zzkh)list).zzd(n7);
                object = this.zza;
                n7 = (int)(((zzjk)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzjk)object3).zzj();
                zzjk zzjk3 = this.zza;
                n4 = zzjk3.zzc() + n3;
                do {
                    object3 = this.zza.zzf();
                    object.add(object3);
                } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
                this.zza(n4);
                return;
            }
            throw zzkp.zza();
        }
        do {
            object2 = this.zza.zzf();
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final int zzi() {
        this.zzb(0);
        return this.zza.zzh();
    }

    public final void zzi(List object) {
        Object object2;
        int n3 = object instanceof zzlb;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzlb)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzjk)object).zzj();
                    zzjk zzjk2 = this.zza;
                    n4 = zzjk2.zzc() + n7;
                    do {
                        long l2 = this.zza.zzl();
                        ((zzlb)list).zza(l2);
                    } while ((n7 = ((zzjk)(object = this.zza)).zzc()) < n4);
                    this.zza(n4);
                    return;
                }
                throw zzkp.zza();
            }
            do {
                long l3 = this.zza.zzl();
                ((zzlb)list).zza(l3);
                object = this.zza;
                n7 = (int)(((zzjk)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzjk)object3).zzj();
                zzjk zzjk3 = this.zza;
                n4 = zzjk3.zzc() + n3;
                do {
                    long l4 = this.zza.zzl();
                    object3 = l4;
                    object.add(object3);
                } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
                this.zza(n4);
                return;
            }
            throw zzkp.zza();
        }
        do {
            long l7 = this.zza.zzl();
            object2 = l7;
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final int zzj() {
        this.zzb(0);
        return this.zza.zzj();
    }

    public final void zzj(List object) {
        int n3 = object instanceof zzkh;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzkh)object;
            int n8 = this.zzb & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    do {
                        n8 = this.zza.zzg();
                        ((zzkh)list).zzd(n8);
                        object = this.zza;
                        n8 = (int)(((zzjk)object).zzt() ? 1 : 0);
                        if (n8 == 0) continue;
                        return;
                    } while ((n8 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
                    this.zzd = n8;
                    return;
                }
                throw zzkp.zza();
            }
            object = this.zza;
            n8 = ((zzjk)object).zzj();
            zzjl.zzc(n8);
            zzjk zzjk2 = this.zza;
            n4 = zzjk2.zzc();
            int n10 = n4 + n8;
            do {
                n8 = this.zza.zzg();
                ((zzkh)list).zzd(n8);
            } while ((n8 = ((zzjk)(object = this.zza)).zzc()) < n10);
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                Object object2;
                do {
                    object2 = this.zza.zzg();
                    object.add(object2);
                    object2 = this.zza;
                    n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
                    if (n3 == 0) continue;
                    return;
                } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
                this.zzd = n3;
                return;
            }
            throw zzkp.zza();
        }
        Object object3 = this.zza;
        n3 = ((zzjk)object3).zzj();
        zzjl.zzc(n3);
        zzjk zzjk3 = this.zza;
        n4 = zzjk3.zzc() + n3;
        do {
            object3 = this.zza.zzg();
            object.add(object3);
        } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
    }

    public final long zzk() {
        this.zzb(1);
        return this.zza.zzk();
    }

    public final void zzk(List object) {
        Object object2;
        int n3 = object instanceof zzlb;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            List list = object;
            list = (zzlb)object;
            int n8 = this.zzb & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    object = this.zza;
                    n8 = ((zzjk)object).zzj();
                    zzjl.zzd(n8);
                    zzjk zzjk2 = this.zza;
                    n4 = zzjk2.zzc() + n8;
                    do {
                        long l2 = this.zza.zzn();
                        ((zzlb)list).zza(l2);
                    } while ((n8 = ((zzjk)(object = this.zza)).zzc()) < n4);
                    return;
                }
                throw zzkp.zza();
            }
            do {
                long l3 = this.zza.zzn();
                ((zzlb)list).zza(l3);
                object = this.zza;
                n8 = (int)(((zzjk)object).zzt() ? 1 : 0);
                if (n8 == 0) continue;
                return;
            } while ((n8 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
            this.zzd = n8;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzjk)object3).zzj();
                zzjl.zzd(n3);
                zzjk zzjk3 = this.zza;
                n4 = zzjk3.zzc() + n3;
                do {
                    long l4 = this.zza.zzn();
                    object3 = l4;
                    object.add(object3);
                } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
                return;
            }
            throw zzkp.zza();
        }
        do {
            long l7 = this.zza.zzn();
            object2 = l7;
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final long zzl() {
        this.zzb(0);
        return this.zza.zzl();
    }

    public final void zzl(List object) {
        Object object2;
        int n3 = object instanceof zzkh;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzkh)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzjk)object).zzj();
                    zzjk zzjk2 = this.zza;
                    n4 = zzjk2.zzc() + n7;
                    do {
                        n7 = this.zza.zzh();
                        ((zzkh)list).zzd(n7);
                    } while ((n7 = ((zzjk)(object = this.zza)).zzc()) < n4);
                    this.zza(n4);
                    return;
                }
                throw zzkp.zza();
            }
            do {
                n7 = this.zza.zzh();
                ((zzkh)list).zzd(n7);
                object = this.zza;
                n7 = (int)(((zzjk)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzjk)object3).zzj();
                zzjk zzjk3 = this.zza;
                n4 = zzjk3.zzc() + n3;
                do {
                    object3 = this.zza.zzh();
                    object.add(object3);
                } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
                this.zza(n4);
                return;
            }
            throw zzkp.zza();
        }
        do {
            object2 = this.zza.zzh();
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final long zzm() {
        this.zzb(1);
        return this.zza.zzn();
    }

    public final void zzm(List object) {
        Object object2;
        int n3 = object instanceof zzlb;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzlb)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzjk)object).zzj();
                    zzjk zzjk2 = this.zza;
                    n4 = zzjk2.zzc() + n7;
                    do {
                        long l2 = this.zza.zzo();
                        ((zzlb)list).zza(l2);
                    } while ((n7 = ((zzjk)(object = this.zza)).zzc()) < n4);
                    this.zza(n4);
                    return;
                }
                throw zzkp.zza();
            }
            do {
                long l3 = this.zza.zzo();
                ((zzlb)list).zza(l3);
                object = this.zza;
                n7 = (int)(((zzjk)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzjk)object3).zzj();
                zzjk zzjk3 = this.zza;
                n4 = zzjk3.zzc() + n3;
                do {
                    long l4 = this.zza.zzo();
                    object3 = l4;
                    object.add(object3);
                } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
                this.zza(n4);
                return;
            }
            throw zzkp.zza();
        }
        do {
            long l7 = this.zza.zzo();
            object2 = l7;
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final long zzn() {
        this.zzb(0);
        return this.zza.zzo();
    }

    public final void zzn(List list) {
        this.zza(list, false);
    }

    public final long zzo() {
        this.zzb(0);
        return this.zza.zzp();
    }

    public final void zzo(List list) {
        this.zza(list, true);
    }

    public final zziy zzp() {
        this.zzb(2);
        return this.zza.zzq();
    }

    public final void zzp(List object) {
        Object object2;
        int n3 = object instanceof zzkh;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzkh)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzjk)object).zzj();
                    zzjk zzjk2 = this.zza;
                    n4 = zzjk2.zzc() + n7;
                    do {
                        n7 = this.zza.zzj();
                        ((zzkh)list).zzd(n7);
                    } while ((n7 = ((zzjk)(object = this.zza)).zzc()) < n4);
                    this.zza(n4);
                    return;
                }
                throw zzkp.zza();
            }
            do {
                n7 = this.zza.zzj();
                ((zzkh)list).zzd(n7);
                object = this.zza;
                n7 = (int)(((zzjk)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzjk)object3).zzj();
                zzjk zzjk3 = this.zza;
                n4 = zzjk3.zzc() + n3;
                do {
                    object3 = this.zza.zzj();
                    object.add(object3);
                } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
                this.zza(n4);
                return;
            }
            throw zzkp.zza();
        }
        do {
            object2 = this.zza.zzj();
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final String zzq() {
        this.zzb(2);
        return this.zza.zzr();
    }

    public final void zzq(List object) {
        Object object2;
        int n3 = object instanceof zzlb;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzlb)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzjk)object).zzj();
                    zzjk zzjk2 = this.zza;
                    n4 = zzjk2.zzc() + n7;
                    do {
                        long l2 = this.zza.zzp();
                        ((zzlb)list).zza(l2);
                    } while ((n7 = ((zzjk)(object = this.zza)).zzc()) < n4);
                    this.zza(n4);
                    return;
                }
                throw zzkp.zza();
            }
            do {
                long l3 = this.zza.zzp();
                ((zzlb)list).zza(l3);
                object = this.zza;
                n7 = (int)(((zzjk)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzjk)(object = this.zza)).zzi()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzjk)object3).zzj();
                zzjk zzjk3 = this.zza;
                n4 = zzjk3.zzc() + n3;
                do {
                    long l4 = this.zza.zzp();
                    object3 = l4;
                    object.add(object3);
                } while ((n3 = ((zzjk)(object3 = this.zza)).zzc()) < n4);
                this.zza(n4);
                return;
            }
            throw zzkp.zza();
        }
        do {
            long l7 = this.zza.zzp();
            object2 = l7;
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzjk)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzjk)(object2 = this.zza)).zzi()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final String zzr() {
        this.zzb(2);
        return this.zza.zzs();
    }

    public final boolean zzs() {
        this.zzb(0);
        return this.zza.zzu();
    }

    public final boolean zzt() {
        int n3;
        zzjk zzjk2 = this.zza;
        int n4 = zzjk2.zzt();
        if (n4 == 0 && (n4 = this.zzb) != (n3 = this.zzc)) {
            return this.zza.zzd(n4);
        }
        return false;
    }
}

