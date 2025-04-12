/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzck;
import com.google.android.gms.internal.gtm.zzcl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class zzcm
extends zzbr {
    private volatile String zza;
    private Future zzb;

    public zzcm(zzbu zzbu2) {
        super(zzbu2);
    }

    public static /* bridge */ /* synthetic */ String zza(zzcm zzcm2) {
        return zzcm2.zzf();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String zzf() {
        block20: {
            var1_1 = "0";
            var2_2 = "Failed to close clientId writing stream";
            var3_4 = UUID.randomUUID().toString();
            var4_11 = Locale.US;
            var3_4 = var3_4.toLowerCase((Locale)var4_11);
            var4_11 = this.zzq();
            var4_11 = var4_11.zza();
            Preconditions.checkNotEmpty(var3_4);
            var5_14 = "ClientId should be saved from worker thread";
            Preconditions.checkNotMainThread((String)var5_14);
            var5_14 = null;
            var6_15 = "Storing clientId";
            {
                catch (Exception var2_3) {}
            }
            try {}
            catch (IOException var3_6) {}
            catch (FileNotFoundException var3_7) {}
            finally {
                ** GOTO lbl22
            }
            {
                break block20;
lbl22:
                // 1 sources

                this.zzO(var6_15, var3_4);
                var6_15 = "gaClientId";
                var5_14 = var4_11.openFileOutput(var6_15, 0);
                var4_11 = var3_4.getBytes();
                var5_14.write((byte[])var4_11);
                try {
                    var5_14.close();
                    return var3_4;
                }
                catch (IOException var4_12) {
                    this.zzJ(var2_2, var4_12);
                }
                return var3_4;
            }
        }
        this.zzJ("Error saving clientId file", var2_3);
        return var1_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzb() {
        this.zzV();
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Object object;
                Object object2;
                block9: {
                    InterruptedException interruptedException2;
                    block10: {
                        block7: {
                            try {
                                object2 = this.zza;
                                if (object2 != null) break block7;
                                object2 = this.zzq();
                                object = new zzck(this);
                                this.zzb = object2 = ((zzr)object2).zzg((Callable)object);
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                        }
                        if ((object2 = this.zzb) == null) return this.zza;
                        try {
                            object2 = object2.get();
                            this.zza = object2 = (String)object2;
                            break block9;
                        }
                        catch (ExecutionException executionException) {
                        }
                        catch (InterruptedException interruptedException2) {
                            break block10;
                        }
                        object = "Failed to load or generate client id";
                        this.zzJ((String)object, executionException);
                        this.zza = object2 = "0";
                        break block9;
                    }
                    object = "ClientId loading or generation was interrupted";
                    this.zzR((String)object, interruptedException2);
                    this.zza = object2 = "0";
                }
                object2 = this.zza;
                if (object2 == null) {
                    this.zza = object2 = "0";
                }
                object2 = "Loaded clientId";
                object = this.zza;
                this.zzO((String)object2, object);
                object2 = null;
                this.zzb = null;
                return this.zza;
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final String zzc() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [24, 23, 22 : 131->141)] java.lang.Throwable
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

    public final void zzd() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zze() {
        synchronized (this) {
            Object object = null;
            this.zza = null;
            object = this.zzq();
            zzcl zzcl2 = new zzcl(this);
            this.zzb = object = ((zzr)object).zzg(zzcl2);
            return this.zzb();
        }
    }
}

