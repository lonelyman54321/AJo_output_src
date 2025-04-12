/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzjv;
import com.google.android.gms.internal.measurement.zzjw;
import com.google.android.gms.internal.measurement.zzjy;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzb;
import com.google.android.gms.internal.measurement.zzkg$zzd;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzma;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzmf;
import com.google.android.gms.internal.measurement.zzmg;
import com.google.android.gms.internal.measurement.zzmu;
import com.google.android.gms.internal.measurement.zzmx;
import com.google.android.gms.internal.measurement.zznj;
import com.google.android.gms.internal.measurement.zznl;
import java.util.Map;

final class zzls
implements zzme {
    private final zzlm zza;
    private final zzmu zzb;
    private final boolean zzc;
    private final zzjv zzd;

    private zzls(zzmu zzmu2, zzjv zzjv2, zzlm zzlm2) {
        boolean bl2;
        this.zzb = zzmu2;
        this.zzc = bl2 = zzjv2.zza(zzlm2);
        this.zzd = zzjv2;
        this.zza = zzlm2;
    }

    public static zzls zza(zzmu zzmu2, zzjv zzjv2, zzlm zzlm2) {
        zzls zzls2 = new zzls(zzmu2, zzjv2, zzlm2);
        return zzls2;
    }

    public final int zza(Object object) {
        zzmu zzmu2 = this.zzb;
        Object object2 = zzmu2.zzd(object);
        int n3 = zzmu2.zzb(object2);
        boolean bl2 = this.zzc;
        if (bl2) {
            object2 = this.zzd;
            object = ((zzjv)object2).zza(object);
            int n4 = ((zzjw)object).zza();
            n3 += n4;
        }
        return n3;
    }

    public final Object zza() {
        zzlm zzlm2 = this.zza;
        boolean bl2 = zzlm2 instanceof zzkg;
        if (bl2) {
            return ((zzkg)zzlm2).zzci();
        }
        return zzlm2.zzcm().zzak();
    }

    /*
     * Exception decompiling
     */
    public final void zza(Object var1_1, zzmf var2_2, zzjt var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 148->152)] java.lang.Throwable
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

    public final void zza(Object object, zznl zznl2) {
        boolean bl2;
        Object object2 = this.zzd.zza(object).zzd();
        while (bl2 = object2.hasNext()) {
            boolean bl3;
            zznj zznj2;
            Object object3 = (Map.Entry)object2.next();
            zzjy zzjy2 = (zzjy)object3.getKey();
            zznj zznj3 = zzjy2.zzc();
            if (zznj3 == (zznj2 = zznj.zzi) && !(bl3 = zzjy2.zze()) && !(bl3 = zzjy2.zzd())) {
                int n3;
                bl3 = object3 instanceof zzkt;
                if (bl3) {
                    n3 = zzjy2.zza();
                    object3 = ((zzkt)object3).zza().zzb();
                    zznl2.zza(n3, object3);
                    continue;
                }
                n3 = zzjy2.zza();
                object3 = object3.getValue();
                zznl2.zza(n3, object3);
                continue;
            }
            object = new IllegalStateException("Found invalid MessageSet item.");
            throw object;
        }
        object2 = this.zzb;
        object = ((zzmu)object2).zzd(object);
        ((zzmu)object2).zza(object, zznl2);
    }

    public final void zza(Object object, Object object2) {
        Object object3 = this.zzb;
        zzmg.zza((zzmu)object3, object, object2);
        boolean bl2 = this.zzc;
        if (bl2) {
            object3 = this.zzd;
            zzmg.zza((zzjv)object3, object, object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zza(Object object, byte[] byArray, int n3, int n4, zzit zzit2) {
        Object object2 = object;
        object2 = (zzkg)object;
        zzmx zzmx2 = ((zzkg)object2).zzb;
        Object object3 = zzmx.zzc();
        if (zzmx2 == object3) {
            ((zzkg)object2).zzb = zzmx2 = zzmx.zzd();
        }
        ((zzkg$zzb)object).zza();
        object = null;
        object2 = null;
        while (true) {
            Object object4;
            int n7;
            int n8;
            int n10;
            if (n3 < n4) {
                Object object5;
                n10 = zziu.zzc(byArray, n3, zzit2);
                int n14 = zzit2.zza;
                n3 = 11;
                n8 = 2;
                if (n14 != n3) {
                    n3 = n14 & 7;
                    if (n3 == n8) {
                        object5 = this.zzd;
                        object2 = zzit2.zzd;
                        Object object6 = this.zza;
                        n7 = n14 >>> 3;
                        object2 = object5 = ((zzjv)object5).zza((zzjt)object2, (zzlm)object6, n7);
                        object2 = (zzkg$zzd)object5;
                        if (object2 != null) {
                            zzma.zza();
                            object = new NoSuchMethodError();
                            throw object;
                        }
                        object6 = byArray;
                        n7 = n4;
                        object4 = zzmx2;
                        n3 = zziu.zza(n14, byArray, n10, n4, zzmx2, zzit2);
                        continue;
                    }
                    n3 = zziu.zza(n14, byArray, n10, n4, zzit2);
                    continue;
                }
                n3 = 0;
                object5 = null;
                n14 = 0;
                object3 = null;
            } else {
                if (n3 == n4) {
                    return;
                }
                throw zzkp.zzg();
            }
            while (n10 < n4) {
                n10 = zziu.zzc(byArray, n10, zzit2);
                n7 = zzit2.zza;
                int n15 = n7 >>> 3;
                int n16 = n7 & 7;
                if (n15 != n8) {
                    int n17 = 3;
                    if (n15 == n17) {
                        if (object2 != null) {
                            zzma.zza();
                            object = new NoSuchMethodError();
                            throw object;
                        }
                        if (n16 == n8) {
                            n10 = zziu.zza(byArray, n10, zzit2);
                            object3 = (zziy)zzit2.zzc;
                            continue;
                        }
                    }
                } else if (n16 == 0) {
                    n10 = zziu.zzc(byArray, n10, zzit2);
                    n3 = zzit2.zza;
                    object2 = this.zzd;
                    zzjt zzjt2 = zzit2.zzd;
                    object4 = this.zza;
                    object2 = (zzkg$zzd)((zzjv)object2).zza(zzjt2, (zzlm)object4, n3);
                    continue;
                }
                if (n7 == (n15 = 12)) break;
                n10 = zziu.zza(n7, byArray, n10, n4, zzit2);
            }
            if (object3 != null) {
                n3 = n3 << 3 | n8;
                zzmx2.zza(n3, object3);
            }
            n3 = n10;
        }
    }

    public final int zzb(Object object) {
        Object object2 = this.zzb.zzd(object);
        int n3 = object2.hashCode();
        boolean bl2 = this.zzc;
        if (bl2) {
            zzjv zzjv2 = this.zzd;
            object = zzjv2.zza(object);
            n3 *= 53;
            int n4 = ((zzjw)object).hashCode();
            n3 += n4;
        }
        return n3;
    }

    public final boolean zzb(Object object, Object object2) {
        Object object3;
        Object object4 = this.zzb.zzd(object);
        boolean bl2 = object4.equals(object3 = this.zzb.zzd(object2));
        if (!bl2) {
            return false;
        }
        bl2 = this.zzc;
        if (bl2) {
            object = this.zzd.zza(object);
            object2 = this.zzd.zza(object2);
            return ((zzjw)object).equals(object2);
        }
        return true;
    }

    public final void zzd(Object object) {
        this.zzb.zzf(object);
        this.zzd.zzc(object);
    }

    public final boolean zze(Object object) {
        return this.zzd.zza(object).zzg();
    }
}

