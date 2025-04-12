/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.net.Uri
 */
package com.google.android.gms.internal.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.gms.internal.vision.zzaq;
import com.google.android.gms.internal.vision.zzay;
import com.google.android.gms.internal.vision.zzba;
import com.google.android.gms.internal.vision.zzbb;
import com.google.android.gms.internal.vision.zzbc;
import com.google.android.gms.internal.vision.zzbf;

final class zzbd
implements zzay {
    private static zzbd zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzbd() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzbd(Context context) {
        this.zzb = context;
        zzbf zzbf2 = new zzbf(this, null);
        this.zzc = zzbf2;
        context = context.getContentResolver();
        Uri uri = zzaq.zza;
        context.registerContentObserver(uri, true, (ContentObserver)zzbf2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzbd zza(Context object) {
        Class<zzbd> clazz = zzbd.class;
        synchronized (clazz) {
            Throwable throwable2;
            block3: {
                Object object2;
                try {
                    object2 = zza;
                    if (object2 != null) return zza;
                    object2 = "com.google.android.providers.gsf.permission.READ_GSERVICES";
                    int n3 = jq1_1.b(object, (String)object2);
                    object2 = n3 == 0 ? new zzbd((Context)object) : new zzbd();
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
    public static void zza() {
        Class<zzbd> clazz = zzbd.class;
        synchronized (clazz) {
            Throwable throwable2;
            block4: {
                zzbd zzbd2;
                block3: {
                    try {
                        Object object;
                        zzbd2 = zza;
                        if (zzbd2 == null || (object = zzbd2.zzb) == null || (zzbd2 = zzbd2.zzc) == null) break block3;
                        zzbd2 = object.getContentResolver();
                        object = zza;
                        object = object.zzc;
                        zzbd2.unregisterContentObserver((ContentObserver)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                zzbd2 = null;
                zza = null;
                return;
            }
            throw throwable2;
        }
    }

    private final String zzc(String string2) {
        Object object = this.zzb;
        if (object == null) {
            return null;
        }
        object = new zzbc(this, string2);
        object = zzbb.zza((zzba)object);
        try {
            return (String)object;
        }
        catch (IllegalStateException | SecurityException runtimeException) {
            string2 = String.valueOf(string2);
            int n3 = string2.length();
            if (n3 != 0) {
                object = "Unable to read GServices for: ";
                ((String)object).concat(string2);
            }
            return null;
        }
    }

    public final /* synthetic */ Object zza(String string2) {
        return this.zzc(string2);
    }

    public final /* synthetic */ String zzb(String string2) {
        return zzaq.zza(this.zzb.getContentResolver(), string2, null);
    }
}

