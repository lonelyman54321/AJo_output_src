/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.net.Uri
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zzgw;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzhn;
import com.google.android.gms.internal.measurement.zzho;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhs;

final class zzhq
implements zzhl {
    private static zzhq zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzhq() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzhq(Context context) {
        this.zzb = context;
        zzhs zzhs2 = new zzhs(this, null);
        this.zzc = zzhs2;
        context = context.getContentResolver();
        Uri uri = zzgw.zza;
        context.registerContentObserver(uri, true, (ContentObserver)zzhs2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzhq zza(Context object) {
        Class<zzhq> clazz = zzhq.class;
        synchronized (clazz) {
            Throwable throwable2;
            block3: {
                Object object2;
                try {
                    object2 = zza;
                    if (object2 != null) return zza;
                    object2 = "com.google.android.providers.gsf.permission.READ_GSERVICES";
                    int n3 = jq1_1.b(object, (String)object2);
                    object2 = n3 == 0 ? new zzhq((Context)object) : new zzhq();
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                zza = object2;
                return zza;
            }
            throw throwable2;
        }
    }

    public static /* synthetic */ String zza(zzhq zzhq2, String string2) {
        return zzgt.zza(zzhq2.zzb.getContentResolver(), string2, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zza() {
        Class<zzhq> clazz = zzhq.class;
        synchronized (clazz) {
            Throwable throwable2;
            block4: {
                zzhq zzhq2;
                block3: {
                    try {
                        Object object;
                        zzhq2 = zza;
                        if (zzhq2 == null || (object = zzhq2.zzb) == null || (zzhq2 = zzhq2.zzc) == null) break block3;
                        zzhq2 = object.getContentResolver();
                        object = zza;
                        object = object.zzc;
                        zzhq2.unregisterContentObserver((ContentObserver)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                zzhq2 = null;
                zza = null;
                return;
            }
            throw throwable2;
        }
    }

    private final String zzb(String object) {
        boolean bl2;
        Object object2 = this.zzb;
        if (object2 != null && !(bl2 = zzhg.zza(object2))) {
            object2 = new zzhp(this, (String)object);
            object = zzho.zza((zzhn)object2);
            try {
                return (String)object;
            }
            catch (IllegalStateException | NullPointerException | SecurityException runtimeException) {}
        }
        return null;
    }

    public final /* synthetic */ Object zza(String string2) {
        return this.zzb(string2);
    }
}

