/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhr;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzif;
import com.google.android.gms.internal.vision.zzij;
import com.google.android.gms.internal.vision.zzin;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.internal.vision.zzja;
import com.google.android.gms.internal.vision.zzjd;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzjy;
import com.google.android.gms.internal.vision.zzkf;
import com.google.android.gms.internal.vision.zzky;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzld;
import com.google.android.gms.internal.vision.zzml;
import java.util.List;
import java.util.Map;

final class zzig
implements zzld {
    private final zzif zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzig(zzif zzif2) {
        this.zza = zzif2 = (zzif)zzjf.zza((Object)zzif2, "input");
        zzif2.zzc = this;
    }

    public static zzig zza(zzif zzif2) {
        zzig zzig2 = zzif2.zzc;
        if (zzig2 != null) {
            return zzig2;
        }
        zzig2 = new zzig(zzif2);
        return zzig2;
    }

    private final Object zza(zzml object, Class clazz, zzio zzio2) {
        int[] nArray = zzij.zza;
        int n3 = object.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                object = new RuntimeException("unsupported field type.");
                throw object;
            }
            case 17: {
                return this.zzf();
            }
            case 16: {
                return this.zzo();
            }
            case 15: {
                return this.zzm();
            }
            case 14: {
                return this.zzt();
            }
            case 13: {
                return this.zzs();
            }
            case 12: {
                return this.zzr();
            }
            case 11: {
                return this.zzq();
            }
            case 10: {
                return this.zza(clazz, zzio2);
            }
            case 9: {
                return this.zzg();
            }
            case 8: {
                return this.zzh();
            }
            case 7: {
                return Float.valueOf(this.zze());
            }
            case 6: {
                return this.zzi();
            }
            case 5: {
                return this.zzj();
            }
            case 4: {
                return this.zzp();
            }
            case 3: {
                return this.zzd();
            }
            case 2: {
                return this.zzn();
            }
            case 1: 
        }
        return this.zzk();
    }

    private final void zza(int n3) {
        int n4 = this.zzb & 7;
        if (n4 == n3) {
            return;
        }
        throw zzjk.zzf();
    }

    private final void zza(List object, boolean n3) {
        int n4 = this.zzb & 7;
        int n7 = 2;
        if (n4 == n7) {
            Object object2;
            n4 = object instanceof zzjv;
            if (n4 != 0 && n3 == 0) {
                int n8;
                Object list = object;
                list = (zzjv)object;
                do {
                    object = this.zzn();
                    list.zza((zzht)object);
                    object = this.zza;
                    n8 = ((zzif)object).zzt();
                    if (n8 == 0) continue;
                    return;
                } while ((n8 = ((zzif)(object = this.zza)).zza()) == (n3 = this.zzb));
                this.zzd = n8;
                return;
            }
            do {
                object2 = n3 != 0 ? this.zzm() : this.zzl();
                ((List)object).add(object2);
                object2 = this.zza;
                n4 = (int)(((zzif)object2).zzt() ? 1 : 0);
                if (n4 == 0) continue;
                return;
            } while ((n4 = ((zzif)(object2 = this.zza)).zza()) == (n7 = this.zzb));
            this.zzd = n4;
            return;
        }
        throw zzjk.zzf();
    }

    private static void zzb(int n3) {
        if ((n3 &= 7) == 0) {
            return;
        }
        throw zzjk.zzg();
    }

    private final Object zzc(zzlc object, zzio zzio2) {
        zzif zzif2 = this.zza;
        int n3 = zzif2.zzm();
        Object object2 = this.zza;
        int n4 = ((zzif)object2).zza;
        int n7 = ((zzif)object2).zzb;
        if (n4 < n7) {
            int n8;
            n3 = ((zzif)object2).zzc(n3);
            object2 = object.zza();
            zzif zzif3 = this.zza;
            zzif3.zza = n7 = zzif3.zza + 1;
            object.zza(object2, this, zzio2);
            object.zzc(object2);
            this.zza.zza(0);
            object = this.zza;
            ((zzif)object).zza = n8 = ((zzif)object).zza + -1;
            ((zzif)object).zzd(n3);
            return object2;
        }
        object = new zzjk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        throw object;
    }

    private static void zzc(int n3) {
        if ((n3 &= 3) == 0) {
            return;
        }
        throw zzjk.zzg();
    }

    private final Object zzd(zzlc object, zzio zzio2) {
        block7: {
            Object object2;
            int n3;
            int n4 = this.zzc;
            this.zzc = n3 = this.zzb >>> 3 << 3 | 4;
            try {
                object2 = object.zza();
            }
            catch (Throwable throwable) {
                this.zzc = n4;
                throw throwable;
            }
            object.zza(object2, this, zzio2);
            object.zzc(object2);
            int n7 = this.zzb;
            int n8 = this.zzc;
            if (n7 != n8) break block7;
            this.zzc = n4;
            return object2;
        }
        object = zzjk.zzg();
        throw object;
    }

    private final void zzd(int n3) {
        zzif zzif2 = this.zza;
        int n4 = zzif2.zzu();
        if (n4 == n3) {
            return;
        }
        throw zzjk.zza();
    }

    public final int zza() {
        int n3;
        int n4 = this.zzd;
        if (n4 != 0) {
            this.zzb = n4;
            n4 = 0;
            Object var2_2 = null;
            this.zzd = 0;
        } else {
            zzif zzif2 = this.zza;
            this.zzb = n4 = zzif2.zza();
        }
        n4 = this.zzb;
        if (n4 != 0 && n4 != (n3 = this.zzc)) {
            return n4 >>> 3;
        }
        return -1 >>> 1;
    }

    public final Object zza(zzlc zzlc2, zzio zzio2) {
        this.zza(2);
        return this.zzc(zzlc2, zzio2);
    }

    public final Object zza(Class object, zzio zzio2) {
        this.zza(2);
        object = zzky.zza().zza((Class)object);
        return this.zzc((zzlc)object, zzio2);
    }

    public final void zza(List object) {
        Object object2;
        int n3 = object instanceof zzin;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            List list = object;
            list = (zzin)object;
            int n8 = this.zzb & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    object = this.zza;
                    n8 = ((zzif)object).zzm();
                    zzig.zzb(n8);
                    zzif zzif2 = this.zza;
                    n4 = zzif2.zzu() + n8;
                    do {
                        double d2 = this.zza.zzb();
                        ((zzin)list).zza(d2);
                    } while ((n8 = ((zzif)(object = this.zza)).zzu()) < n4);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                double d5 = this.zza.zzb();
                ((zzin)list).zza(d5);
                object = this.zza;
                n8 = (int)(((zzif)object).zzt() ? 1 : 0);
                if (n8 == 0) continue;
                return;
            } while ((n8 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
            this.zzd = n8;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzif)object3).zzm();
                zzig.zzb(n3);
                zzif zzif3 = this.zza;
                n4 = zzif3.zzu() + n3;
                do {
                    double d7 = this.zza.zzb();
                    object3 = d7;
                    object.add(object3);
                } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            double d9 = this.zza.zzb();
            object2 = d9;
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final void zza(List list, zzlc zzlc2, zzio zzio2) {
        int n3 = this.zzb;
        int n4 = n3 & 7;
        int n7 = 2;
        if (n4 == n7) {
            block2: {
                Object object;
                do {
                    object = this.zzc(zzlc2, zzio2);
                    list.add(object);
                    object = this.zza;
                    n4 = (int)(((zzif)object).zzt() ? 1 : 0);
                    if (n4 != 0 || (n4 = this.zzd) != 0) break block2;
                } while ((n4 = ((zzif)(object = this.zza)).zza()) == n3);
                this.zzd = n4;
            }
            return;
        }
        throw zzjk.zzf();
    }

    /*
     * Exception decompiling
     */
    public final void zza(Map var1_1, zzkf var2_3, zzio var3_4) {
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

    public final int zzb() {
        return this.zzb;
    }

    public final Object zzb(zzlc zzlc2, zzio zzio2) {
        this.zza(3);
        return this.zzd(zzlc2, zzio2);
    }

    public final Object zzb(Class object, zzio zzio2) {
        this.zza(3);
        object = zzky.zza().zza((Class)object);
        return this.zzd((zzlc)object, zzio2);
    }

    public final void zzb(List object) {
        int n3 = object instanceof zzja;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzja)object;
            int n8 = this.zzb & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    do {
                        float f5 = this.zza.zzc();
                        ((zzja)list).zza(f5);
                        object = this.zza;
                        n8 = (int)(((zzif)object).zzt() ? 1 : 0);
                        if (n8 == 0) continue;
                        return;
                    } while ((n8 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
                    this.zzd = n8;
                    return;
                }
                throw zzjk.zzf();
            }
            object = this.zza;
            n8 = ((zzif)object).zzm();
            zzig.zzc(n8);
            zzif zzif2 = this.zza;
            n4 = zzif2.zzu();
            int n10 = n4 + n8;
            do {
                float f6 = this.zza.zzc();
                ((zzja)list).zza(f6);
            } while ((n8 = ((zzif)(object = this.zza)).zzu()) < n10);
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                Object object2;
                do {
                    float f7 = this.zza.zzc();
                    object2 = Float.valueOf(f7);
                    object.add(object2);
                    object2 = this.zza;
                    n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
                    if (n3 == 0) continue;
                    return;
                } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
                this.zzd = n3;
                return;
            }
            throw zzjk.zzf();
        }
        Object object3 = this.zza;
        n3 = ((zzif)object3).zzm();
        zzig.zzc(n3);
        zzif zzif3 = this.zza;
        n4 = zzif3.zzu() + n3;
        do {
            float f8 = this.zza.zzc();
            object3 = Float.valueOf(f8);
            object.add(object3);
        } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
    }

    public final void zzb(List list, zzlc zzlc2, zzio zzio2) {
        int n3 = this.zzb;
        int n4 = n3 & 7;
        int n7 = 3;
        if (n4 == n7) {
            block2: {
                Object object;
                do {
                    object = this.zzd(zzlc2, zzio2);
                    list.add(object);
                    object = this.zza;
                    n4 = (int)(((zzif)object).zzt() ? 1 : 0);
                    if (n4 != 0 || (n4 = this.zzd) != 0) break block2;
                } while ((n4 = ((zzif)(object = this.zza)).zza()) == n3);
                this.zzd = n4;
            }
            return;
        }
        throw zzjk.zzf();
    }

    public final void zzc(List object) {
        Object object2;
        int n3 = object instanceof zzjy;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzjy)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzif)object).zzm();
                    zzif zzif2 = this.zza;
                    n4 = zzif2.zzu() + n7;
                    do {
                        long l2 = this.zza.zzd();
                        ((zzjy)list).zza(l2);
                    } while ((n7 = ((zzif)(object = this.zza)).zzu()) < n4);
                    this.zzd(n4);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                long l3 = this.zza.zzd();
                ((zzjy)list).zza(l3);
                object = this.zza;
                n7 = (int)(((zzif)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzif)object3).zzm();
                zzif zzif3 = this.zza;
                n4 = zzif3.zzu() + n3;
                do {
                    long l4 = this.zza.zzd();
                    object3 = l4;
                    object.add(object3);
                } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
                this.zzd(n4);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            long l7 = this.zza.zzd();
            object2 = l7;
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final boolean zzc() {
        int n3;
        zzif zzif2 = this.zza;
        int n4 = zzif2.zzt();
        if (n4 == 0 && (n4 = this.zzb) != (n3 = this.zzc)) {
            return this.zza.zzb(n4);
        }
        return false;
    }

    public final double zzd() {
        this.zza(1);
        return this.zza.zzb();
    }

    public final void zzd(List object) {
        Object object2;
        int n3 = object instanceof zzjy;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzjy)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzif)object).zzm();
                    zzif zzif2 = this.zza;
                    n4 = zzif2.zzu() + n7;
                    do {
                        long l2 = this.zza.zze();
                        ((zzjy)list).zza(l2);
                    } while ((n7 = ((zzif)(object = this.zza)).zzu()) < n4);
                    this.zzd(n4);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                long l3 = this.zza.zze();
                ((zzjy)list).zza(l3);
                object = this.zza;
                n7 = (int)(((zzif)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzif)object3).zzm();
                zzif zzif3 = this.zza;
                n4 = zzif3.zzu() + n3;
                do {
                    long l4 = this.zza.zze();
                    object3 = l4;
                    object.add(object3);
                } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
                this.zzd(n4);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            long l7 = this.zza.zze();
            object2 = l7;
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final float zze() {
        this.zza(5);
        return this.zza.zzc();
    }

    public final void zze(List object) {
        Object object2;
        int n3 = object instanceof zzjd;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzjd)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzif)object).zzm();
                    zzif zzif2 = this.zza;
                    n4 = zzif2.zzu() + n7;
                    do {
                        n7 = this.zza.zzf();
                        ((zzjd)list).zzc(n7);
                    } while ((n7 = ((zzif)(object = this.zza)).zzu()) < n4);
                    this.zzd(n4);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                n7 = this.zza.zzf();
                ((zzjd)list).zzc(n7);
                object = this.zza;
                n7 = (int)(((zzif)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzif)object3).zzm();
                zzif zzif3 = this.zza;
                n4 = zzif3.zzu() + n3;
                do {
                    object3 = this.zza.zzf();
                    object.add(object3);
                } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
                this.zzd(n4);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            object2 = this.zza.zzf();
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final long zzf() {
        this.zza(0);
        return this.zza.zzd();
    }

    public final void zzf(List object) {
        Object object2;
        int n3 = object instanceof zzjy;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            List list = object;
            list = (zzjy)object;
            int n8 = this.zzb & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    object = this.zza;
                    n8 = ((zzif)object).zzm();
                    zzig.zzb(n8);
                    zzif zzif2 = this.zza;
                    n4 = zzif2.zzu() + n8;
                    do {
                        long l2 = this.zza.zzg();
                        ((zzjy)list).zza(l2);
                    } while ((n8 = ((zzif)(object = this.zza)).zzu()) < n4);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                long l3 = this.zza.zzg();
                ((zzjy)list).zza(l3);
                object = this.zza;
                n8 = (int)(((zzif)object).zzt() ? 1 : 0);
                if (n8 == 0) continue;
                return;
            } while ((n8 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
            this.zzd = n8;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzif)object3).zzm();
                zzig.zzb(n3);
                zzif zzif3 = this.zza;
                n4 = zzif3.zzu() + n3;
                do {
                    long l4 = this.zza.zzg();
                    object3 = l4;
                    object.add(object3);
                } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            long l7 = this.zza.zzg();
            object2 = l7;
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final long zzg() {
        this.zza(0);
        return this.zza.zze();
    }

    public final void zzg(List object) {
        int n3 = object instanceof zzjd;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzjd)object;
            int n8 = this.zzb & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    do {
                        n8 = this.zza.zzh();
                        ((zzjd)list).zzc(n8);
                        object = this.zza;
                        n8 = (int)(((zzif)object).zzt() ? 1 : 0);
                        if (n8 == 0) continue;
                        return;
                    } while ((n8 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
                    this.zzd = n8;
                    return;
                }
                throw zzjk.zzf();
            }
            object = this.zza;
            n8 = ((zzif)object).zzm();
            zzig.zzc(n8);
            zzif zzif2 = this.zza;
            n4 = zzif2.zzu();
            int n10 = n4 + n8;
            do {
                n8 = this.zza.zzh();
                ((zzjd)list).zzc(n8);
            } while ((n8 = ((zzif)(object = this.zza)).zzu()) < n10);
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                Object object2;
                do {
                    object2 = this.zza.zzh();
                    object.add(object2);
                    object2 = this.zza;
                    n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
                    if (n3 == 0) continue;
                    return;
                } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
                this.zzd = n3;
                return;
            }
            throw zzjk.zzf();
        }
        Object object3 = this.zza;
        n3 = ((zzif)object3).zzm();
        zzig.zzc(n3);
        zzif zzif3 = this.zza;
        n4 = zzif3.zzu() + n3;
        do {
            object3 = this.zza.zzh();
            object.add(object3);
        } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
    }

    public final int zzh() {
        this.zza(0);
        return this.zza.zzf();
    }

    public final void zzh(List object) {
        Object object2;
        int n3 = object instanceof zzhr;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzhr)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzif)object).zzm();
                    zzif zzif2 = this.zza;
                    n4 = zzif2.zzu() + n7;
                    do {
                        n7 = (int)(this.zza.zzi() ? 1 : 0);
                        ((zzhr)list).zza(n7 != 0);
                    } while ((n7 = ((zzif)(object = this.zza)).zzu()) < n4);
                    this.zzd(n4);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                n7 = (int)(this.zza.zzi() ? 1 : 0);
                ((zzhr)list).zza(n7 != 0);
                object = this.zza;
                n7 = (int)(((zzif)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzif)object3).zzm();
                zzif zzif3 = this.zza;
                n4 = zzif3.zzu() + n3;
                do {
                    object3 = this.zza.zzi();
                    object.add(object3);
                } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
                this.zzd(n4);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            object2 = this.zza.zzi();
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final long zzi() {
        this.zza(1);
        return this.zza.zzg();
    }

    public final void zzi(List list) {
        this.zza(list, false);
    }

    public final int zzj() {
        this.zza(5);
        return this.zza.zzh();
    }

    public final void zzj(List list) {
        this.zza(list, true);
    }

    public final void zzk(List list) {
        int n3 = this.zzb & 7;
        int n4 = 2;
        if (n3 == n4) {
            Object object;
            do {
                object = this.zzn();
                list.add(object);
                object = this.zza;
                n3 = (int)(((zzif)object).zzt() ? 1 : 0);
                if (n3 == 0) continue;
                return;
            } while ((n3 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
            this.zzd = n3;
            return;
        }
        throw zzjk.zzf();
    }

    public final boolean zzk() {
        this.zza(0);
        return this.zza.zzi();
    }

    public final String zzl() {
        this.zza(2);
        return this.zza.zzj();
    }

    public final void zzl(List object) {
        Object object2;
        int n3 = object instanceof zzjd;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzjd)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzif)object).zzm();
                    zzif zzif2 = this.zza;
                    n4 = zzif2.zzu() + n7;
                    do {
                        n7 = this.zza.zzm();
                        ((zzjd)list).zzc(n7);
                    } while ((n7 = ((zzif)(object = this.zza)).zzu()) < n4);
                    this.zzd(n4);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                n7 = this.zza.zzm();
                ((zzjd)list).zzc(n7);
                object = this.zza;
                n7 = (int)(((zzif)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzif)object3).zzm();
                zzif zzif3 = this.zza;
                n4 = zzif3.zzu() + n3;
                do {
                    object3 = this.zza.zzm();
                    object.add(object3);
                } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
                this.zzd(n4);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            object2 = this.zza.zzm();
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final String zzm() {
        this.zza(2);
        return this.zza.zzk();
    }

    public final void zzm(List object) {
        Object object2;
        int n3 = object instanceof zzjd;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzjd)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzif)object).zzm();
                    zzif zzif2 = this.zza;
                    n4 = zzif2.zzu() + n7;
                    do {
                        n7 = this.zza.zzn();
                        ((zzjd)list).zzc(n7);
                    } while ((n7 = ((zzif)(object = this.zza)).zzu()) < n4);
                    this.zzd(n4);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                n7 = this.zza.zzn();
                ((zzjd)list).zzc(n7);
                object = this.zza;
                n7 = (int)(((zzif)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzif)object3).zzm();
                zzif zzif3 = this.zza;
                n4 = zzif3.zzu() + n3;
                do {
                    object3 = this.zza.zzn();
                    object.add(object3);
                } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
                this.zzd(n4);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            object2 = this.zza.zzn();
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final zzht zzn() {
        this.zza(2);
        return this.zza.zzl();
    }

    public final void zzn(List object) {
        int n3 = object instanceof zzjd;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzjd)object;
            int n8 = this.zzb & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    do {
                        n8 = this.zza.zzo();
                        ((zzjd)list).zzc(n8);
                        object = this.zza;
                        n8 = (int)(((zzif)object).zzt() ? 1 : 0);
                        if (n8 == 0) continue;
                        return;
                    } while ((n8 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
                    this.zzd = n8;
                    return;
                }
                throw zzjk.zzf();
            }
            object = this.zza;
            n8 = ((zzif)object).zzm();
            zzig.zzc(n8);
            zzif zzif2 = this.zza;
            n4 = zzif2.zzu();
            int n10 = n4 + n8;
            do {
                n8 = this.zza.zzo();
                ((zzjd)list).zzc(n8);
            } while ((n8 = ((zzif)(object = this.zza)).zzu()) < n10);
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                Object object2;
                do {
                    object2 = this.zza.zzo();
                    object.add(object2);
                    object2 = this.zza;
                    n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
                    if (n3 == 0) continue;
                    return;
                } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
                this.zzd = n3;
                return;
            }
            throw zzjk.zzf();
        }
        Object object3 = this.zza;
        n3 = ((zzif)object3).zzm();
        zzig.zzc(n3);
        zzif zzif3 = this.zza;
        n4 = zzif3.zzu() + n3;
        do {
            object3 = this.zza.zzo();
            object.add(object3);
        } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
    }

    public final int zzo() {
        this.zza(0);
        return this.zza.zzm();
    }

    public final void zzo(List object) {
        Object object2;
        int n3 = object instanceof zzjy;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            List list = object;
            list = (zzjy)object;
            int n8 = this.zzb & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    object = this.zza;
                    n8 = ((zzif)object).zzm();
                    zzig.zzb(n8);
                    zzif zzif2 = this.zza;
                    n4 = zzif2.zzu() + n8;
                    do {
                        long l2 = this.zza.zzp();
                        ((zzjy)list).zza(l2);
                    } while ((n8 = ((zzif)(object = this.zza)).zzu()) < n4);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                long l3 = this.zza.zzp();
                ((zzjy)list).zza(l3);
                object = this.zza;
                n8 = (int)(((zzif)object).zzt() ? 1 : 0);
                if (n8 == 0) continue;
                return;
            } while ((n8 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
            this.zzd = n8;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != n7) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzif)object3).zzm();
                zzig.zzb(n3);
                zzif zzif3 = this.zza;
                n4 = zzif3.zzu() + n3;
                do {
                    long l4 = this.zza.zzp();
                    object3 = l4;
                    object.add(object3);
                } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            long l7 = this.zza.zzp();
            object2 = l7;
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final int zzp() {
        this.zza(0);
        return this.zza.zzn();
    }

    public final void zzp(List object) {
        Object object2;
        int n3 = object instanceof zzjd;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzjd)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzif)object).zzm();
                    zzif zzif2 = this.zza;
                    n4 = zzif2.zzu() + n7;
                    do {
                        n7 = this.zza.zzq();
                        ((zzjd)list).zzc(n7);
                    } while ((n7 = ((zzif)(object = this.zza)).zzu()) < n4);
                    this.zzd(n4);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                n7 = this.zza.zzq();
                ((zzjd)list).zzc(n7);
                object = this.zza;
                n7 = (int)(((zzif)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzif)object3).zzm();
                zzif zzif3 = this.zza;
                n4 = zzif3.zzu() + n3;
                do {
                    object3 = this.zza.zzq();
                    object.add(object3);
                } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
                this.zzd(n4);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            object2 = this.zza.zzq();
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final int zzq() {
        this.zza(5);
        return this.zza.zzo();
    }

    public final void zzq(List object) {
        Object object2;
        int n3 = object instanceof zzjy;
        int n4 = 2;
        if (n3 != 0) {
            List list = object;
            list = (zzjy)object;
            int n7 = this.zzb & 7;
            if (n7 != 0) {
                if (n7 == n4) {
                    object = this.zza;
                    n7 = ((zzif)object).zzm();
                    zzif zzif2 = this.zza;
                    n4 = zzif2.zzu() + n7;
                    do {
                        long l2 = this.zza.zzr();
                        ((zzjy)list).zza(l2);
                    } while ((n7 = ((zzif)(object = this.zza)).zzu()) < n4);
                    this.zzd(n4);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                long l3 = this.zza.zzr();
                ((zzjy)list).zza(l3);
                object = this.zza;
                n7 = (int)(((zzif)object).zzt() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((zzif)(object = this.zza)).zza()) == (n4 = this.zzb));
            this.zzd = n7;
            return;
        }
        n3 = this.zzb & 7;
        if (n3 != 0) {
            if (n3 == n4) {
                Object object3 = this.zza;
                n3 = ((zzif)object3).zzm();
                zzif zzif3 = this.zza;
                n4 = zzif3.zzu() + n3;
                do {
                    long l4 = this.zza.zzr();
                    object3 = l4;
                    object.add(object3);
                } while ((n3 = ((zzif)(object3 = this.zza)).zzu()) < n4);
                this.zzd(n4);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            long l7 = this.zza.zzr();
            object2 = l7;
            object.add(object2);
            object2 = this.zza;
            n3 = (int)(((zzif)object2).zzt() ? 1 : 0);
            if (n3 == 0) continue;
            return;
        } while ((n3 = ((zzif)(object2 = this.zza)).zza()) == (n4 = this.zzb));
        this.zzd = n3;
    }

    public final long zzr() {
        this.zza(1);
        return this.zza.zzp();
    }

    public final int zzs() {
        this.zza(0);
        return this.zza.zzq();
    }

    public final long zzt() {
        this.zza(0);
        return this.zza.zzr();
    }
}

