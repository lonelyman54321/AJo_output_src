/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfqi;
import com.google.android.gms.internal.ads.zzfqq;
import java.util.HashSet;
import org.json.JSONObject;

public abstract class zzfqp
extends zzfqq {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfqp(zzfqi hashSet, HashSet hashSet2, JSONObject jSONObject, long l2) {
        super((zzfqi)((Object)hashSet));
        this.zza = hashSet = new HashSet(hashSet2);
        this.zzb = jSONObject;
        this.zzc = l2;
    }
}

