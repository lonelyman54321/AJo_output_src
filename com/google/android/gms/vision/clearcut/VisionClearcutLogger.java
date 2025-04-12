/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.vision.clearcut;

import android.content.Context;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.ClearcutLogger$LogEventBuilder;
import com.google.android.gms.internal.vision.zzfe;
import com.google.android.gms.internal.vision.zzfi$zzo;
import com.google.android.gms.internal.vision.zzhf;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.internal.vision.zzjb$zzb;
import com.google.android.gms.vision.L;

public class VisionClearcutLogger {
    private final ClearcutLogger zza;
    private boolean zzb = true;

    public VisionClearcutLogger(Context context) {
        ClearcutLogger clearcutLogger;
        this.zza = clearcutLogger = new ClearcutLogger(context, "VISION", null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(int n3, zzfi$zzo object) {
        int n4;
        int n7 = 1;
        object = ((zzhf)object).zzh();
        if (n3 >= 0 && n3 <= (n4 = 3)) {
            Exception exception2222;
            block7: {
                n4 = (int)(this.zzb ? 1 : 0);
                if (n4 != 0) {
                    ClearcutLogger clearcutLogger = this.zza;
                    object = clearcutLogger.newEvent((byte[])object);
                    ClearcutLogger$LogEventBuilder clearcutLogger$LogEventBuilder = ((ClearcutLogger$LogEventBuilder)object).setEventCode(n3);
                    clearcutLogger$LogEventBuilder.log();
                    return;
                }
                {
                    catch (Exception exception2222) {
                        break block7;
                    }
                    Object object2 = zzfi$zzo.zza();
                    try {
                        zzio zzio2 = zzio.zzc();
                        int n8 = ((Object[])object).length;
                        ((zzjb$zzb)object2).zza((byte[])object, 0, n8, zzio2);
                        object = "Would have logged:\n%s";
                        object2 = object2.toString();
                        Object[] objectArray = new Object[n7];
                        objectArray[0] = object2;
                        L.e((String)object, objectArray);
                        return;
                    }
                    catch (Exception exception3) {}
                    object = "Parsing error";
                    {
                        Object[] objectArray = new Object[]{};
                        L.e(exception3, (String)object, objectArray);
                        return;
                    }
                }
            }
            zzfe.zza(exception2222);
            Object[] objectArray = new Object[]{};
            L.e(exception2222, "Failed to log", objectArray);
            return;
        }
        Integer n10 = n3;
        object = new Object[n7];
        object[0] = n10;
        L.i("Illegal event code: %d", (Object[])object);
    }
}

