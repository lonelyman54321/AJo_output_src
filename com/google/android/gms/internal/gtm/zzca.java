/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.gtm.zzby;
import com.google.android.gms.internal.gtm.zzbz;
import com.google.android.gms.internal.gtm.zzcb;
import com.google.android.gms.internal.gtm.zzel;

public final class zzca
implements ServiceConnection {
    final /* synthetic */ zzcb zza;
    private volatile boolean zzb;
    private volatile zzel zzc;

    public zzca(zzcb zzcb2) {
        this.zza = zzcb2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName var1_1, IBinder var2_4) {
        var1_1 = "AnalyticsServiceConnection.onServiceConnected";
        Preconditions.checkMainThread((String)var1_1);
        synchronized (this) {
            block16: {
                block15: {
                    if (var2_4 != null) ** GOTO lbl32
                    var1_1 = this.zza;
                    var2_4 = "Service connected with null binder";
                    var1_1.zzI((String)var2_4);
                    {
                        catch (Throwable var1_3) {
                            break block15;
                        }
                        this.notifyAll();
                        return;
lbl-1000:
                        // 2 sources

                        {
                            block18: {
                                block17: {
                                    while (var1_1 == null) {
                                        try {
                                            var1_1 = ConnectionTracker.getInstance();
                                            var2_4 = this.zza;
                                            var2_4 = var2_4.zzo();
                                            var3_5 = this.zza;
                                            var3_5 = zzcb.zza((zzcb)var3_5);
                                            var1_1.unbindService((Context)var2_4, (ServiceConnection)var3_5);
                                        }
                                        catch (IllegalArgumentException v0) {}
lbl23:
                                        // 3 sources

                                        while (true) {
                                            this.notifyAll();
                                            return;
                                            break;
                                        }
                                        ** GOTO lbl23
                                        catch (Throwable var1_2) {
                                            break block16;
                                        }
                                    }
                                    break block17;
lbl32:
                                    // 1 sources

                                    var1_1 = null;
                                    {
                                        var4_6 = "com.google.android.gms.analytics.internal.IAnalyticsService";
                                        var3_5 = var2_4.getInterfaceDescriptor();
                                        var5_7 = var4_6.equals(var3_5);
                                        if (!var5_7) ** GOTO lbl49
                                        var3_5 = "com.google.android.gms.analytics.internal.IAnalyticsService";
                                    }
                                    var5_7 = (var3_5 = var2_4.queryLocalInterface((String)var3_5)) instanceof zzel;
                                    if (!var5_7) ** GOTO lbl47
                                    {
                                        var3_5 = (zzel)var3_5;
lbl41:
                                        // 2 sources

                                        while (true) {
                                            var1_1 = var3_5;
                                            var2_4 = this.zza;
                                            var3_5 = "Bound to IAnalyticsService interface";
                                            var2_4.zzN((String)var3_5);
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl47:
                                        // 1 sources

                                        var3_5 = new zzel((IBinder)var2_4);
                                        ** continue;
lbl49:
                                        // 1 sources

                                        var2_4 = this.zza;
                                        var4_6 = "Got binder with a wrong descriptor";
                                        var2_4.zzJ(var4_6, var3_5);
                                        ** GOTO lbl-1000
                                    }
                                }
                                var6_8 = this.zzb;
                                if (var6_8) break block18;
                                var2_4 = this.zza;
                                var3_5 = "onServiceConnected received after the timeout limit";
                                var2_4.zzQ((String)var3_5);
                                var2_4 = this.zza;
                                var2_4 = var2_4.zzq();
                                var3_5 = new zzby(this, (zzel)var1_1);
                                var2_4.zzi((Runnable)var3_5);
                                ** GOTO lbl23
                            }
                            this.zzc = var1_1;
                            ** continue;
                        }
                    }
                }
                this.notifyAll();
                throw var1_3;
            }
            throw var1_2;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceDisconnected");
        zzr zzr2 = this.zza.zzq();
        zzbz zzbz2 = new zzbz(this, componentName);
        zzr2.zzi(zzbz2);
    }

    /*
     * Exception decompiling
     */
    public final zzel zza() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [11, 10 : 144->148)] java.lang.Throwable
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
}

