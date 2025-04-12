/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzcby;
import java.util.Map;

public final class zzbmi
implements zzblp {
    private final Context zza;

    public zzbmi(Context context) {
        this.zza = context;
    }

    public final void zza(Object object, Map object2) {
        Object object3;
        object = "text";
        boolean bl2 = object2.containsKey(object);
        if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object3 = (CharSequence)object2.get(object))))) {
            object3 = String.valueOf((String)object2.get(object));
            zze.zza("Opening Share Sheet with text: ".concat((String)object3));
            object3 = new Intent();
            object3.setAction("android.intent.action.SEND");
            object3.setType("text/plain");
            object = (String)object2.get(object);
            String string2 = "android.intent.extra.TEXT";
            object3.putExtra(string2, (String)object);
            object = "title";
            boolean bl3 = object2.containsKey(object);
            if (bl3) {
                object = (String)object2.get(object);
                object2 = "android.intent.extra.TITLE";
                object3.putExtra((String)object2, (String)object);
            }
            zzu.zzp();
            object = this.zza;
            try {
                zzt.zzT((Context)object, (Intent)object3);
                return;
            }
            catch (RuntimeException runtimeException) {
                zzm.zzk("Failed to open Share Sheet", runtimeException);
                object2 = "ShareSheetGmsgHandler.onGmsg";
                object3 = zzu.zzo();
                ((zzcby)object3).zzw(runtimeException, (String)object2);
            }
        }
    }
}

