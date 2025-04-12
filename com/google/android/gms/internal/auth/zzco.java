/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.net.Uri
 */
package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.gms.internal.auth.zzcb;
import com.google.android.gms.internal.auth.zzcc;
import com.google.android.gms.internal.auth.zzcj;
import com.google.android.gms.internal.auth.zzck;
import com.google.android.gms.internal.auth.zzcl;
import com.google.android.gms.internal.auth.zzcm;
import com.google.android.gms.internal.auth.zzcn;

final class zzco
implements zzcl {
    private static zzco zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzco() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzco(Context context) {
        this.zzb = context;
        zzcn zzcn2 = new zzcn(this, null);
        this.zzc = zzcn2;
        context = context.getContentResolver();
        Uri uri = zzcb.zza;
        context.registerContentObserver(uri, true, (ContentObserver)zzcn2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzco zza(Context object) {
        Class<zzco> clazz = zzco.class;
        synchronized (clazz) {
            Throwable throwable2;
            block3: {
                Object object2;
                try {
                    object2 = zza;
                    if (object2 != null) return zza;
                    object2 = "com.google.android.providers.gsf.permission.READ_GSERVICES";
                    int n3 = jq1_1.b(object, (String)object2);
                    object2 = n3 == 0 ? new zzco((Context)object) : new zzco();
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zze() {
        Class<zzco> clazz = zzco.class;
        synchronized (clazz) {
            Throwable throwable2;
            block4: {
                zzco zzco2;
                block3: {
                    try {
                        Object object;
                        zzco2 = zza;
                        if (zzco2 == null || (object = zzco2.zzb) == null || (zzco2 = zzco2.zzc) == null) break block3;
                        zzco2 = object.getContentResolver();
                        object = zza;
                        object = object.zzc;
                        zzco2.unregisterContentObserver((ContentObserver)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                zzco2 = null;
                zza = null;
                return;
            }
            throw throwable2;
        }
    }

    public final String zzc(String string2) {
        boolean bl2;
        Object object = this.zzb;
        if (object != null && !(bl2 = zzcc.zza(object))) {
            object = new zzcm(this, string2);
            object = zzcj.zza((zzck)object);
            try {
                return (String)object;
            }
            catch (IllegalStateException | NullPointerException | SecurityException runtimeException) {
                string2 = String.valueOf(string2);
                object = "Unable to read GServices for: ";
                object.concat(string2);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzd(String string2) {
        return zzcb.zza(this.zzb.getContentResolver(), string2, null);
    }
}

