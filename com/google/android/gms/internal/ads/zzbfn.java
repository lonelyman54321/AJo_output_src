/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfq;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbfn
extends Uf0 {
    private final AtomicBoolean zza;
    private final List zzb;
    private final zzbfq zzc;
    private final Uf0 zzd;

    public zzbfn(zzbfq list, Uf0 uf0) {
        AtomicBoolean atomicBoolean;
        this.zza = atomicBoolean = new AtomicBoolean(false);
        this.zzd = uf0;
        this.zzc = list;
        list = zzbep.zzjP;
        this.zzb = list = Arrays.asList(((String)zzba.zzc().zza((zzbeg)((Object)list))).split(","));
    }

    public final void extraCallback(String string2, Bundle bundle) {
        Uf0 uf0 = this.zzd;
        if (uf0 != null) {
            uf0.extraCallback(string2, bundle);
        }
    }

    public final Bundle extraCallbackWithResult(String string2, Bundle bundle) {
        Uf0 uf0 = this.zzd;
        if (uf0 != null) {
            return uf0.extraCallbackWithResult(string2, bundle);
        }
        return null;
    }

    public final void onActivityResized(int n3, int n4, Bundle bundle) {
        Uf0 uf0 = this.zzd;
        if (uf0 != null) {
            uf0.onActivityResized(n3, n4, bundle);
        }
    }

    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        Uf0 uf0 = this.zzd;
        if (uf0 != null) {
            uf0.onMessageChannelReady(bundle);
        }
    }

    public final void onNavigationEvent(int n3, Bundle object) {
        Object object2;
        this.zza.set(false);
        Object object3 = this.zzd;
        if (object3 != null) {
            ((Uf0)object3).onNavigationEvent(n3, (Bundle)object);
        }
        object = this.zzc;
        object3 = zzu.zzB();
        long l2 = object3.currentTimeMillis();
        ((zzbfq)object).zzi(l2);
        object = this.zzc;
        if (object != null && (object = this.zzb) != null && (n3 = (int)(object.contains(object2 = String.valueOf(n3)) ? 1 : 0)) != 0) {
            object2 = this.zzc;
            ((zzbfq)object2).zzf();
        }
    }

    public final void onPostMessage(String string2, Bundle bundle) {
        Object object;
        block9: {
            object = new JSONObject(string2);
            Object object2 = "gpa";
            int bl2 = -1;
            int n3 = object.optInt((String)object2, bl2);
            if (n3 != 0) break block9;
            object2 = this.zza;
            boolean bl3 = true;
            ((AtomicBoolean)object2).set(bl3);
            object2 = this.zzc;
            String string3 = "paw_id";
            object = object.getString(string3);
            try {
                ((zzbfq)object2).zzh((String)object);
            }
            catch (JSONException jSONException) {
                object2 = "Message is not in JSON format: ";
                zze.zzb((String)object2, jSONException);
            }
        }
        if ((object = this.zzd) != null) {
            ((Uf0)object).onPostMessage(string2, bundle);
        }
    }

    public final void onRelationshipValidationResult(int n3, Uri uri, boolean bl2, Bundle bundle) {
        Uf0 uf0 = this.zzd;
        if (uf0 != null) {
            uf0.onRelationshipValidationResult(n3, uri, bl2, bundle);
        }
    }

    public final Boolean zza() {
        return this.zza.get();
    }
}

