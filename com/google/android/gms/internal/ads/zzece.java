/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzece
implements zzgfa {
    public final ListenableFuture zza(Object object) {
        object = (InputStream)object;
        Object object2 = new JSONObject();
        if (object == null) {
            object = zzgft.zzh(object2);
        } else {
            block8: {
                zzu.zzp();
                Object object3 = new InputStreamReader((InputStream)object);
                object = zzt.zzN((InputStreamReader)object3);
                try {
                    object3 = new JSONObject((String)object);
                    object2 = object3;
                    break block8;
                }
                catch (JSONException jSONException) {
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                object3 = "AdsServiceSignalTask.startAdsServiceSignalTask";
                zzcby zzcby2 = zzu.zzo();
                zzcby2.zzw((Throwable)object, (String)object3);
            }
            object = zzgft.zzh(object2);
        }
        return object;
    }
}

