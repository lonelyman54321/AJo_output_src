/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 */
package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.gtm.zzie;
import com.google.android.gms.internal.gtm.zzig;

final class zzid
implements Handler.Callback {
    final /* synthetic */ zzie zza;

    public zzid(zzie zzie2) {
        this.zza = zzie2;
    }

    public final boolean handleMessage(Message object) {
        Object object2;
        boolean bl2;
        int n3 = ((Message)object).what;
        int n4 = 1;
        if (n3 == n4 && (bl2 = (object2 = zzig.zzg()).equals(object = ((Message)object).obj))) {
            this.zza.zza.zzi();
            object = this.zza;
            object2 = ((zzie)object).zza;
            n3 = zzig.zzm((zzig)object2);
            if (!n3) {
                long l2 = 1800000L;
                ((zzie)object).zzc(l2);
            }
        }
        return n4 != 0;
    }
}

