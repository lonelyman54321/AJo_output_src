/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzfx;
import com.google.android.gms.tagmanager.zzap;
import com.google.android.gms.tagmanager.zzar;
import com.google.android.gms.tagmanager.zzas;
import com.google.android.gms.tagmanager.zzau;
import com.google.android.gms.tagmanager.zzav;
import com.google.android.gms.tagmanager.zzaw;
import com.google.android.gms.tagmanager.zzax;
import com.google.android.gms.tagmanager.zzay;
import com.google.android.gms.tagmanager.zzbb;
import com.google.android.gms.tagmanager.zzdc;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

final class zzaz
implements zzas {
    private static final String zza = "CREATE TABLE IF NOT EXISTS datalayer ( 'ID' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 'key' STRING NOT NULL, 'value' BLOB NOT NULL, 'expires' INTEGER NOT NULL);";
    private final Executor zzb;
    private final Context zzc;
    private final zzax zzd;
    private final Clock zze;

    public zzaz(Context context) {
        Object object = DefaultClock.getInstance();
        ExecutorService executorService = zzfx.zza().zza(2);
        this.zzc = context;
        this.zze = object;
        this.zzb = executorService;
        super(this, context, "google_tagmanager.db");
        this.zzd = object;
    }

    public static /* bridge */ /* synthetic */ Context zzd(zzaz zzaz2) {
        return zzaz2.zzc;
    }

    public static /* bridge */ /* synthetic */ String zze() {
        return zza;
    }

    /*
     * Exception decompiling
     */
    public static /* bridge */ /* synthetic */ List zzf(zzaz var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 28[TRYBLOCK] [40 : 330->342)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
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
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zzg(zzaz zzaz2, String object) {
        Throwable throwable2222222;
        Object object2 = "Cleared ";
        Object object3 = zzaz2.zzi("Error opening database for clearKeysWithPrefix.");
        if (object3 == null) {
            return;
        }
        String string2 = "datalayer";
        String string3 = "key = ? OR key LIKE ?";
        CharSequence charSequence = new StringBuilder();
        charSequence.append((String)object);
        String string4 = ".%";
        charSequence.append(string4);
        charSequence = charSequence.toString();
        object = new String[]{object, charSequence};
        int n3 = object3.delete(string2, string3, object);
        object3 = new StringBuilder((String)object2);
        ((StringBuilder)object3).append(n3);
        object = " items";
        ((StringBuilder)object3).append((String)object);
        object = ((StringBuilder)object3).toString();
        object2 = zzdc.zzb;
        ((zzbb)object2).zzd((String)object);
        zzaz2.zzj();
        return;
        {
            catch (Throwable throwable2222222) {
            }
            catch (SQLiteException sQLiteException) {}
            {
                ((Object)((Object)sQLiteException)).toString();
                zzaz2.zzj();
                return;
            }
        }
        zzaz2.zzj();
        throw throwable2222222;
    }

    public static /* bridge */ /* synthetic */ void zzh(zzaz zzaz2, List list, long l2) {
        zzaz2.zzl(list, l2);
    }

    private final SQLiteDatabase zzi(String object) {
        try {
            object = this.zzd;
        }
        catch (SQLiteException sQLiteException) {
            return null;
        }
        return ((zzax)((Object)object)).getWritableDatabase();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void zzj() {
        zzax zzax2;
        try {
            zzax2 = this.zzd;
        }
        catch (SQLiteException sQLiteException) {
            return;
        }
        zzax2.close();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void zzk(long l2) {
        String string2;
        String string3 = "Deleted ";
        SQLiteDatabase sQLiteDatabase = this.zzi("Error opening database for deleteOlderThan.");
        if (sQLiteDatabase == null) {
            return;
        }
        String string4 = "datalayer";
        String string5 = "expires <= ?";
        try {
            string2 = Long.toString(l2);
        }
        catch (SQLiteException sQLiteException) {
            return;
        }
        String[] stringArray = new String[]{string2};
        int n3 = sQLiteDatabase.delete(string4, string5, stringArray);
        Object object = new StringBuilder(string3);
        ((StringBuilder)object).append(n3);
        String string6 = " expired items";
        ((StringBuilder)object).append(string6);
        String string7 = ((StringBuilder)object).toString();
        object = zzdc.zzb;
        ((zzbb)object).zzd(string7);
    }

    /*
     * Exception decompiling
     */
    private final void zzl(List var1_1, long var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [12 : 166->176)] java.lang.Throwable
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

    public final void zza(String string2) {
        zzaw zzaw2 = new zzaw(this, string2);
        this.zzb.execute(zzaw2);
    }

    public final void zzb(zzar zzar2) {
        zzav zzav2 = new zzav(this, zzar2);
        this.zzb.execute(zzav2);
    }

    /*
     * Unable to fully structure code
     */
    public final void zzc(List var1_1, long var2_5) {
        var4_6 = new ArrayList<zzay>();
        var1_1 = var1_1.iterator();
        while (var5_7 = var1_1.hasNext()) {
            block15: {
                block16: {
                    block17: {
                        block18: {
                            var6_8 = (zzap)var1_1.next();
                            var8_10 = var6_8.zza;
                            var6_8 = var6_8.zzb;
                            var9_11 = new ByteArrayOutputStream();
                            var10_12 = null;
                            var11_13 = new ObjectOutputStream(var9_11);
                            try {
                                var11_13.writeObject(var6_8);
                                var10_12 = var9_11.toByteArray();
                            }
                            catch (Throwable var1_2) {
                            }
                            catch (IOException v0) {
                                break block16;
                            }
lbl14:
                            // 2 sources

                            while (true) {
                                var11_13.close();
                                while (true) {
                                    var9_11.close();
                                    break block15;
                                    break;
                                }
                                break;
                            }
                            var10_12 = var11_13;
                            break block18;
                            catch (Throwable var1_3) {
                            }
                            catch (IOException v1) {
                                break block17;
                            }
                        }
                        if (var10_12 == null) ** GOTO lbl34
                        var10_12.close();
lbl34:
                        // 2 sources

                        var9_11.close();
lbl35:
                        // 2 sources

                        throw var1_4;
                    }
                    var11_13 = null;
                }
                if (var11_13 == null) ** continue;
                ** continue;
                catch (IOException v2) {}
            }
            var7_9 = new zzay(var8_10, (byte[])var10_12);
            var4_6.add(var7_9);
        }
        var1_1 = this.zzb;
        var6_8 = new zzau(this, var4_6, var2_5);
        var1_1.execute((Runnable)var6_8);
        return;
        catch (IOException v3) {
            ** continue;
        }
    }
}

