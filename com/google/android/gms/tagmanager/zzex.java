/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 */
package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.tagmanager.zzey;
import com.google.android.gms.tagmanager.zzfa;

final class zzex
implements Handler.Callback {
    final /* synthetic */ zzey zza;

    public zzex(zzey zzey2) {
        this.zza = zzey2;
    }

    public final boolean handleMessage(Message object) {
        Object object2;
        boolean bl2;
        int n3 = ((Message)object).what;
        int n4 = 1;
        if (n3 == n4 && (bl2 = (object2 = zzfa.zzh()).equals(object = ((Message)object).obj))) {
            this.zza.zza.zza();
            object = this.zza;
            object2 = ((zzey)object).zza;
            n3 = zzfa.zzk((zzfa)object2);
            if (!n3) {
                long l2 = 1800000L;
                ((zzey)object).zzc(l2);
            }
        }
        return n4 != 0;
    }
}

