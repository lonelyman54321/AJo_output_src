/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbrf;

public class LiteSdkInfo
extends zzck {
    public LiteSdkInfo(Context context) {
    }

    public zzbrf getAdapterCreator() {
        zzbrb zzbrb2 = new zzbrb();
        return zzbrb2;
    }

    public zzen getLiteSdkVersion() {
        zzen zzen2 = new zzen(241806202, 241806000, "23.2.0");
        return zzen2;
    }
}

