/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import com.google.android.gms.internal.consent_sdk.zzb;
import com.google.android.gms.internal.consent_sdk.zzd;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzc
implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzd[] zzc;

    public /* synthetic */ zzc(String string2, String string3, zzd[] zzdArray) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = zzdArray;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        int n3;
        zzd[] zzdArray;
        zzd[] zzdArray2;
        String string2;
        block9: {
            string2 = this.zza;
            boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (bl2) {
                return;
            }
            zzdArray2 = this.zzb;
            string2 = string2.toLowerCase();
            boolean bl3 = TextUtils.isEmpty((CharSequence)zzdArray2);
            if (bl3) {
                zzdArray2 = new JSONObject();
            } else {
                zzdArray2 = zzdArray = new JSONObject((String)zzdArray2);
            }
            zzdArray = this.zzc;
            zzdArray2.toString();
            break block9;
            catch (JSONException jSONException) {}
            return;
        }
        for (int i3 = 0; i3 < (n3 = zzdArray.length); ++i3) {
            Object object = zzdArray[i3];
            zzb zzb2 = new zzb((zzd)object, string2, (JSONObject)zzdArray2);
            FutureTask futureTask = new FutureTask(zzb2);
            object = object.zza();
            object.execute(futureTask);
            try {
                object = futureTask.get();
                object = (Boolean)object;
                n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                if (n3 != 0) return;
                continue;
            }
            catch (ExecutionException executionException) {
                executionException.getCause();
                continue;
            }
            catch (InterruptedException interruptedException) {}
        }
    }
}

