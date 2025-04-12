/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhl;
import com.google.android.gms.internal.vision.zzhn;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.internal.vision.zziq;
import com.google.android.gms.internal.vision.zziu;
import com.google.android.gms.internal.vision.zziw;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zzc;
import com.google.android.gms.internal.vision.zzjb$zze;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzjr;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzky;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzld;
import com.google.android.gms.internal.vision.zzle;
import com.google.android.gms.internal.vision.zzlu;
import com.google.android.gms.internal.vision.zzlx;
import com.google.android.gms.internal.vision.zzmo;
import com.google.android.gms.internal.vision.zzmr;
import java.util.Map;

final class zzkq
implements zzlc {
    private final zzkk zza;
    private final zzlu zzb;
    private final boolean zzc;
    private final zziq zzd;

    private zzkq(zzlu zzlu2, zziq zziq2, zzkk zzkk2) {
        boolean bl2;
        this.zzb = zzlu2;
        this.zzc = bl2 = zziq2.zza(zzkk2);
        this.zzd = zziq2;
        this.zza = zzkk2;
    }

    public static zzkq zza(zzlu zzlu2, zziq zziq2, zzkk zzkk2) {
        zzkq zzkq2 = new zzkq(zzlu2, zziq2, zzkk2);
        return zzkq2;
    }

    public final int zza(Object object) {
        Object object2 = this.zzb.zzb(object);
        int n3 = object2.hashCode();
        boolean bl2 = this.zzc;
        if (bl2) {
            zziq zziq2 = this.zzd;
            object = zziq2.zza(object);
            n3 *= 53;
            int n4 = ((zziu)object).hashCode();
            n3 += n4;
        }
        return n3;
    }

    public final Object zza() {
        return this.zza.zzq().zze();
    }

    /*
     * Exception decompiling
     */
    public final void zza(Object var1_1, zzld var2_2, zzio var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 144->148)] java.lang.Throwable
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

    public final void zza(Object object, zzmr zzmr2) {
        boolean bl2;
        Object object2 = this.zzd.zza(object).zzd();
        while (bl2 = object2.hasNext()) {
            boolean bl3;
            zzmo zzmo2;
            Object object3 = (Map.Entry)object2.next();
            zziw zziw2 = (zziw)object3.getKey();
            zzmo zzmo3 = zziw2.zzc();
            if (zzmo3 == (zzmo2 = zzmo.zzi) && !(bl3 = zziw2.zzd()) && !(bl3 = zziw2.zze())) {
                int n3;
                bl3 = object3 instanceof zzjr;
                if (bl3) {
                    n3 = zziw2.zza();
                    object3 = ((zzjr)object3).zza().zzc();
                    zzmr2.zza(n3, object3);
                    continue;
                }
                n3 = zziw2.zza();
                object3 = object3.getValue();
                zzmr2.zza(n3, object3);
                continue;
            }
            object = new IllegalStateException("Found invalid MessageSet item.");
            throw object;
        }
        object2 = this.zzb;
        object = ((zzlu)object2).zzb(object);
        ((zzlu)object2).zzb(object, zzmr2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zza(Object object, byte[] byArray, int n3, int n4, zzhn zzhn2) {
        Object object2 = object;
        object2 = (zzjb)object;
        zzlx zzlx2 = ((zzjb)object2).zzb;
        Object object3 = zzlx.zza();
        if (zzlx2 == object3) {
            ((zzjb)object2).zzb = zzlx2 = zzlx.zzb();
        }
        object = ((zzjb$zzc)object).zza();
        object2 = null;
        object3 = null;
        while (true) {
            Object object4;
            Object object5;
            int n7;
            Object object6;
            int n8;
            int n10;
            if (n3 < n4) {
                Object object7;
                n10 = zzhl.zza(byArray, n3, zzhn2);
                n3 = zzhn2.zza;
                int n14 = 11;
                n8 = 2;
                if (n3 != n14) {
                    n14 = n3 & 7;
                    if (n14 == n8) {
                        object3 = this.zzd;
                        object6 = zzhn2.zzd;
                        zzkk zzkk2 = this.zza;
                        n7 = n3 >>> 3;
                        object3 = ((zziq)object3).zza((zzio)object6, zzkk2, n7);
                        Object object8 = object3;
                        object8 = (zzjb$zze)object3;
                        if (object8 != null) {
                            object7 = zzky.zza();
                            object3 = ((zzjb$zze)object8).zzc.getClass();
                            object7 = ((zzky)object7).zza((Class)object3);
                            n3 = zzhl.zza((zzlc)object7, byArray, n10, n4, zzhn2);
                            object3 = ((zzjb$zze)object8).zzd;
                            object6 = zzhn2.zzc;
                            ((zziu)object).zza((zziw)object3, object6);
                        } else {
                            object6 = byArray;
                            n8 = n4;
                            object5 = zzlx2;
                            object4 = zzhn2;
                            n3 = zzhl.zza(n3, byArray, n10, n4, zzlx2, zzhn2);
                        }
                        object3 = object8;
                        continue;
                    }
                    n3 = zzhl.zza(n3, byArray, n10, n4, zzhn2);
                    continue;
                }
                n3 = 0;
                object7 = null;
                n14 = 0;
                object6 = null;
            } else {
                if (n3 == n4) {
                    return;
                }
                throw zzjk.zzg();
            }
            while (n10 < n4) {
                n10 = zzhl.zza(byArray, n10, zzhn2);
                n7 = zzhn2.zza;
                int n15 = n7 >>> 3;
                int n16 = n7 & 7;
                if (n15 != n8) {
                    int n17 = 3;
                    if (n15 == n17) {
                        if (object3 != null) {
                            object5 = zzky.zza();
                            object4 = ((zzjb$zze)object3).zzc.getClass();
                            n10 = zzhl.zza(((zzky)object5).zza((Class)object4), byArray, n10, n4, zzhn2);
                            object5 = ((zzjb$zze)object3).zzd;
                            object4 = zzhn2.zzc;
                            ((zziu)object).zza((zziw)object5, object4);
                            continue;
                        }
                        if (n16 == n8) {
                            n10 = zzhl.zze(byArray, n10, zzhn2);
                            object6 = (zzht)zzhn2.zzc;
                            continue;
                        }
                    }
                } else if (n16 == 0) {
                    n10 = zzhl.zza(byArray, n10, zzhn2);
                    n3 = zzhn2.zza;
                    object3 = this.zzd;
                    object5 = zzhn2.zzd;
                    object4 = this.zza;
                    object3 = (zzjb$zze)((zziq)object3).zza((zzio)object5, (zzkk)object4, n3);
                    continue;
                }
                if (n7 == (n15 = 12)) break;
                n10 = zzhl.zza(n7, byArray, n10, n4, zzhn2);
            }
            if (object6 != null) {
                n3 = n3 << 3 | n8;
                zzlx2.zza(n3, object6);
            }
            n3 = n10;
        }
    }

    public final boolean zza(Object object, Object object2) {
        Object object3;
        Object object4 = this.zzb.zzb(object);
        boolean bl2 = object4.equals(object3 = this.zzb.zzb(object2));
        if (!bl2) {
            return false;
        }
        bl2 = this.zzc;
        if (bl2) {
            object = this.zzd.zza(object);
            object2 = this.zzd.zza(object2);
            return ((zziu)object).equals(object2);
        }
        return true;
    }

    public final int zzb(Object object) {
        zzlu zzlu2 = this.zzb;
        Object object2 = zzlu2.zzb(object);
        int n3 = zzlu2.zze(object2);
        boolean bl2 = this.zzc;
        if (bl2) {
            object2 = this.zzd;
            object = ((zziq)object2).zza(object);
            int n4 = ((zziu)object).zzg();
            n3 += n4;
        }
        return n3;
    }

    public final void zzb(Object object, Object object2) {
        Object object3 = this.zzb;
        zzle.zza((zzlu)object3, object, object2);
        boolean bl2 = this.zzc;
        if (bl2) {
            object3 = this.zzd;
            zzle.zza((zziq)object3, object, object2);
        }
    }

    public final void zzc(Object object) {
        this.zzb.zzd(object);
        this.zzd.zzc(object);
    }

    public final boolean zzd(Object object) {
        return this.zzd.zza(object).zzf();
    }
}

