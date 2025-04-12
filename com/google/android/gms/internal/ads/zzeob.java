/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbtg;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzccn;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeob
extends zzbtg {
    private final String zza;
    private final zzbte zzb;
    private final zzccn zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public zzeob(String string2, zzbte object, zzccn object2, long l2) {
        JSONObject jSONObject;
        this.zzd = jSONObject = new JSONObject();
        this.zzf = false;
        this.zzc = object2;
        this.zza = string2;
        this.zzb = object;
        this.zze = l2;
        object2 = "adapter_version";
        Object object3 = object.zzf();
        object3 = ((zzbtt)object3).toString();
        jSONObject.put((String)object2, object3);
        object2 = "sdk_version";
        object = object.zzg();
        object = ((zzbtt)object).toString();
        jSONObject.put((String)object2, object);
        object = "name";
        try {
            jSONObject.put((String)object, (Object)string2);
            return;
        }
        catch (RemoteException | NullPointerException | JSONException throwable) {
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public static void zzb(String var0, zzccn var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [19, 18 : 94->102)] java.lang.Throwable
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzh(String var1_1, int var2_3) {
        synchronized (this) {
            block9: {
                var3_4 = this.zzf;
                if (var3_4) {
                }
                ** GOTO lbl10
                {
                    block11: {
                        block10: {
                            catch (Throwable var1_2) {
                                break block9;
                            }
                            return;
lbl10:
                            // 1 sources

                            try {
                                var4_5 = this.zzd;
                                var5_6 = "signal_error";
                                var4_5.put((String)var5_6, var1_1);
                                var1_1 = zzbep.zzbC;
                                var4_5 = zzba.zzc();
                                var1_1 = var4_5.zza((zzbeg)var1_1);
                                var1_1 = (Boolean)var1_1;
                                var6_7 = var1_1.booleanValue();
                                if (!var6_7) break block10;
                                var1_1 = this.zzd;
                                var4_5 = "latency";
                                var5_6 = zzu.zzB();
                                var7_8 = var5_6.elapsedRealtime();
                                var9_9 = this.zze;
                            }
                            catch (JSONException v0) {
                                break block11;
                            }
                            var1_1.put((String)var4_5, var7_8 -= var9_9);
                        }
                        var1_1 = zzbep.zzbB;
                        var4_5 = zzba.zzc();
                        var1_1 = var4_5.zza((zzbeg)var1_1);
                        var6_7 = (var1_1 = (Boolean)var1_1).booleanValue();
                        if (var6_7) {
                            var1_1 = this.zzd;
                            var4_5 = "signal_error_code";
                            var1_1.put((String)var4_5, var2_3);
                        }
                    }
                    var1_1 = this.zzc;
                    var11_10 = this.zzd;
                    var1_1.zzc(var11_10);
                }
                this.zzf = var6_7 = true;
                return;
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        synchronized (this) {
            String string2 = "Signal collection timeout.";
            int n3 = 3;
            this.zzh(string2, n3);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Object object;
                Object object2;
                boolean bl2;
                block7: {
                    try {
                        bl2 = this.zzf;
                        if (!bl2) break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    return;
                }
                try {
                    object2 = zzbep.zzbB;
                    object = zzba.zzc();
                    object2 = ((zzben)object).zza((zzbeg)object2);
                    object2 = (Boolean)object2;
                    bl2 = (Boolean)object2;
                    if (bl2) {
                        object2 = this.zzd;
                        object = "signal_error_code";
                        object2.put((String)object, 0);
                    }
                }
                catch (JSONException jSONException) {}
                {
                    object2 = this.zzc;
                    object = this.zzd;
                    ((zzccn)object2).zzc(object);
                    this.zzf = bl2 = true;
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(String var1_1) {
        synchronized (this) {
            block11: {
                block12: {
                    block10: {
                        try {
                            var2_3 = this.zzf;
                            if (!var2_3) break block10;
                        }
                        catch (Throwable var1_2) {
                            break block11;
                        }
                        return;
                    }
                    if (var1_1 != null) break block12;
                    var1_1 = "Adapter returned null signals";
                    this.zzf((String)var1_1);
                    return;
                }
                var3_4 = this.zzd;
                var4_5 = "signals";
                var3_4.put((String)var4_5, var1_1);
                var1_1 = zzbep.zzbC;
                var3_4 = zzba.zzc();
                var1_1 = var3_4.zza((zzbeg)var1_1);
                var1_1 = (Boolean)var1_1;
                var5_6 = var1_1.booleanValue();
                if (var5_6) {
                    var1_1 = this.zzd;
                    var3_4 = "latency";
                    var4_5 = zzu.zzB();
                    var6_7 = var4_5.elapsedRealtime();
                    var8_8 = this.zze;
                }
                ** GOTO lbl37
                {
                    catch (JSONException v0) {
                        ** GOTO lbl47
                    }
                    {
                        var1_1.put((String)var3_4, var6_7 -= var8_8);
lbl37:
                        // 2 sources

                        var1_1 = zzbep.zzbB;
                        var3_4 = zzba.zzc();
                        var1_1 = var3_4.zza((zzbeg)var1_1);
                        var5_6 = (var1_1 = (Boolean)var1_1).booleanValue();
                        if (var5_6) {
                            var1_1 = this.zzd;
                            var3_4 = "signal_error_code";
                            var4_5 = null;
                            var1_1.put((String)var3_4, 0);
                        }
lbl47:
                        // 4 sources

                        var1_1 = this.zzc;
                        var3_4 = this.zzd;
                        var1_1.zzc(var3_4);
                    }
                    this.zzf = var5_6 = true;
                    return;
                }
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(String string2) {
        synchronized (this) {
            int n3 = 2;
            this.zzh(string2, n3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg(zze object) {
        synchronized (this) {
            object = ((zze)object).zzb;
            int n3 = 2;
            this.zzh((String)object, n3);
            return;
        }
    }
}

