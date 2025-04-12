/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbwr;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzeao;
import com.google.android.gms.internal.ads.zzeas;
import com.google.android.gms.internal.ads.zzebh;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzeap
extends zzeas {
    private final Context zzg;
    private final Executor zzh;

    public zzeap(Context context, Executor executor) {
        zzbwr zzbwr2;
        this.zzg = context;
        this.zzh = executor;
        executor = zzu.zzt().zzb();
        this.zzf = zzbwr2 = new zzbwr(context, (Looper)executor, this, this);
    }

    /*
     * Exception decompiling
     */
    public final void onConnected(Bundle var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [26 : 113->117)] java.lang.Throwable
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

    public final void onConnectionFailed(ConnectionResult object) {
        zzm.zze("Cannot connect to remote service, fallback to local instance.");
        object = new zzebh(1);
        this.zza.zzd((Throwable)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zza(zzbxu object) {
        Object object2 = this.zzb;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                boolean bl2;
                try {
                    bl2 = this.zzc;
                    if (bl2) {
                        return this.zza;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                this.zzc = bl2 = true;
                this.zze = object;
                object = this.zzf;
                ((BaseGmsClient)object).checkAvailabilityAndConnect();
                object = this.zza;
                Object object3 = new zzeao(this);
                Executor executor = zzcci.zzf;
                ((zzccn)object).addListener((Runnable)object3, executor);
                object = this.zzg;
                object3 = this.zza;
                executor = this.zzh;
                zzeas.zzc((Context)object, (ListenableFuture)object3, executor);
                return this.zza;
            }
            throw throwable2;
        }
    }
}

