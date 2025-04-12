/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.Camera
 *  android.os.SystemClock
 */
package com.google.android.gms.vision;

import android.hardware.Camera;
import android.os.SystemClock;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import java.nio.ByteBuffer;
import java.util.IdentityHashMap;

final class CameraSource$zza
implements Runnable {
    private Detector zza;
    private long zzb;
    private final Object zzc;
    private boolean zzd;
    private long zze;
    private int zzf;
    private ByteBuffer zzg;
    private final /* synthetic */ CameraSource zzh;

    public CameraSource$zza(CameraSource object, Detector detector) {
        long l2;
        this.zzh = object;
        this.zzb = l2 = SystemClock.elapsedRealtime();
        this.zzc = object = new Object();
        this.zzd = true;
        this.zzf = 0;
        this.zza = detector;
    }

    /*
     * Exception decompiling
     */
    public final void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [6 : 45->48)] java.lang.Throwable
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

    public final void zza() {
        Detector detector = this.zza;
        if (detector != null) {
            detector.release();
            detector = null;
            this.zza = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(boolean bl2) {
        Object object = this.zzc;
        synchronized (object) {
            this.zzd = bl2;
            Object object2 = this.zzc;
            object2.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(byte[] object, Camera object2) {
        Object object3 = this.zzc;
        synchronized (object3) {
            Throwable throwable2;
            block6: {
                int n3;
                block5: {
                    try {
                        Object object4 = this.zzg;
                        if (object4 == null) break block5;
                        object4 = ((ByteBuffer)object4).array();
                        object2.addCallbackBuffer((byte[])object4);
                        n3 = 0;
                        object2 = null;
                        this.zzg = null;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                object2 = this.zzh;
                n3 = ((IdentityHashMap)(object2 = CameraSource.zzd((CameraSource)object2))).containsKey(object);
                if (n3 == 0) {
                    return;
                }
                long l2 = SystemClock.elapsedRealtime();
                long l3 = this.zzb;
                this.zze = l2 -= l3;
                this.zzf = n3 = this.zzf + 1;
                object2 = this.zzh;
                object2 = CameraSource.zzd((CameraSource)object2);
                object = ((IdentityHashMap)object2).get(object);
                object = (ByteBuffer)object;
                this.zzg = object;
                object = this.zzc;
                object.notifyAll();
                return;
            }
            throw throwable2;
        }
    }
}

