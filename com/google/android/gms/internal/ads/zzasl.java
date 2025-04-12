/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzars;
import com.google.android.gms.internal.ads.zzart;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasf;
import com.google.android.gms.internal.ads.zzask;

public final class zzasl {
    public static zzarh zza(Context object, zzars object2) {
        Object object3 = new zzasf(null, null);
        object2 = new zzart((zzars)object3);
        object = object.getApplicationContext();
        object3 = new zzask((Context)object);
        zzasa zzasa2 = new zzasa((zzarz)object3, 0x500000);
        object = new zzarh(zzasa2, (zzaqx)object2, 4);
        ((zzarh)object).zzd();
        return object;
    }
}

