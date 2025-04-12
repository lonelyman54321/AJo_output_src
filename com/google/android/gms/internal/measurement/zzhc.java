/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzgw;
import com.google.android.gms.internal.measurement.zzhb;
import com.google.android.gms.internal.measurement.zzhd;
import com.google.android.gms.internal.measurement.zzhe;
import java.util.Map;

public final class zzhc
implements zzhe {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zza(ContentResolver object, String string2) {
        Throwable throwable422;
        block15: {
            RemoteException remoteException222;
            Throwable throwable2222;
            Object object2;
            Object object3;
            block13: {
                block14: {
                    object3 = zzgw.zza;
                    if ((object = object.acquireUnstableContentProviderClient(object3)) == null) {
                        object = new zzhd("Unable to acquire ContentProviderClient");
                        throw object;
                    }
                    String[] stringArray = new String[]{string2};
                    object2 = object;
                    string2 = object.query(object3, null, null, stringArray, null);
                    if (string2 == null) break block13;
                    try {
                        int n3 = string2.moveToFirst();
                        if (n3 == 0) break block14;
                        n3 = 1;
                        object2 = string2.getString(n3);
                    }
                    catch (Throwable throwable2222) {}
                    string2.close();
                    object.release();
                    return object2;
                }
                string2.close();
                object.release();
                return null;
            }
            object3 = "ContentProvider query returned null cursor";
            object2 = new zzhd((String)object3);
            throw object2;
            if (string2 == null) throw throwable2222;
            try {
                string2.close();
                throw throwable2222;
            }
            catch (Throwable throwable3) {
                try {
                    throwable2222.addSuppressed(throwable3);
                    throw throwable2222;
                }
                catch (Throwable throwable422) {
                    break block15;
                }
                catch (RemoteException remoteException222) {}
            }
            object3 = "ContentProvider query failed";
            object2 = new zzhd((String)object3, remoteException222);
            throw object2;
        }
        object.release();
        throw throwable422;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zza(ContentResolver var1_1, String[] var2_2, zzhb var3_6) {
        block17: {
            block15: {
                var4_8 /* !! */  = zzgw.zzb;
                if ((var1_1 /* !! */  = var1_1 /* !! */ .acquireUnstableContentProviderClient(var4_8 /* !! */ )) == null) {
                    var1_1 /* !! */  = new zzhd("Unable to acquire ContentProviderClient");
                    throw var1_1 /* !! */ ;
                }
                var5_9 /* !! */  = var1_1 /* !! */ ;
                var2_2 = var1_1 /* !! */ .query(var4_8 /* !! */ , null, null, (String[])var2_2, null);
                if (var2_2 != null) {
                }
                ** GOTO lbl41
                {
                    block16: {
                        catch (RemoteException var2_4) {
                            break block15;
                        }
                        try {
                            var6_10 = var2_2.getCount();
                            var3_6 = var3_6.zza(var6_10);
                            while ((var6_10 = (int)var2_2.moveToNext()) != 0) {
                                var6_10 = 0;
                                var5_9 /* !! */  = null;
                                var5_9 /* !! */  = var2_2.getString(0);
                                var7_11 = 1;
                                var4_8 /* !! */  = var2_2.getString(var7_11);
                                var3_6.put(var5_9 /* !! */ , var4_8 /* !! */ );
                            }
                        }
                        catch (Throwable var3_7) {
                            break block16;
                        }
                        var6_10 = (int)var2_2.isAfterLast();
                        if (var6_10 != 0) {
                            var2_2.close();
                            var1_1 /* !! */ .release();
                            return var3_6;
                        }
                        ** GOTO lbl-1000
                        catch (Throwable var2_3) {
                            break block17;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var5_9 /* !! */  = "Cursor read incomplete (ContentProvider dead?)";
                            var3_6 = new zzhd((String)var5_9 /* !! */ );
                            throw var3_6;
lbl41:
                            // 1 sources

                            var5_9 /* !! */  = "ContentProvider query returned null cursor";
                            var3_6 = new zzhd((String)var5_9 /* !! */ );
                            throw var3_6;
                        }
                    }
                    if (var2_2 == null) throw var3_7;
                    try {
                        var2_2.close();
                        throw var3_7;
                    }
                    catch (Throwable var2_5) {}
                    {
                        var3_7.addSuppressed(var2_5);
                        throw var3_7;
                    }
                }
            }
            var5_9 /* !! */  = "ContentProvider query failed";
            var3_6 = new zzhd((String)var5_9 /* !! */ , var2_4);
            throw var3_6;
        }
        var1_1 /* !! */ .release();
        throw var2_3;
    }
}

