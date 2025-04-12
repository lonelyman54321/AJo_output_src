/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzaqu;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzarn;
import java.util.concurrent.Executor;

public final class zzaqv {
    private final Executor zza;

    public zzaqv(Handler handler) {
        zzaqt zzaqt2 = new zzaqt(this, handler);
        this.zza = zzaqt2;
    }

    public final void zza(zzare zzare2, zzarn object) {
        zzare2.zzm("post-error");
        object = zzark.zza((zzarn)object);
        zzaqu zzaqu2 = new zzaqu(zzare2, (zzark)object, null);
        ((zzaqt)this.zza).zza.post((Runnable)zzaqu2);
    }

    public final void zzb(zzare zzare2, zzark zzark2, Runnable runnable2) {
        zzare2.zzq();
        zzare2.zzm("post-response");
        zzaqu zzaqu2 = new zzaqu(zzare2, zzark2, runnable2);
        ((zzaqt)this.zza).zza.post((Runnable)zzaqu2);
    }
}

