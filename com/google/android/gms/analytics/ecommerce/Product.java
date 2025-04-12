/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzd;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Product {
    final Map zza;

    public Product() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    public Product setBrand(String string2) {
        this.zzb("br", string2);
        return this;
    }

    public Product setCategory(String string2) {
        this.zzb("ca", string2);
        return this;
    }

    public Product setCouponCode(String string2) {
        this.zzb("cc", string2);
        return this;
    }

    public Product setCustomDimension(int n3, String string2) {
        String string3 = zzd.zzc(n3);
        this.zzb(string3, string2);
        return this;
    }

    public Product setCustomMetric(int n3, int n4) {
        String string2 = zzd.zzf(n3);
        String string3 = Integer.toString(n4);
        this.zzb(string2, string3);
        return this;
    }

    public Product setId(String string2) {
        this.zzb("id", string2);
        return this;
    }

    public Product setName(String string2) {
        this.zzb("nm", string2);
        return this;
    }

    public Product setPosition(int n3) {
        String string2 = Integer.toString(n3);
        this.zzb("ps", string2);
        return this;
    }

    public Product setPrice(double d2) {
        String string2 = Double.toString(d2);
        this.zzb("pr", string2);
        return this;
    }

    public Product setQuantity(int n3) {
        String string2 = Integer.toString(n3);
        this.zzb("qt", string2);
        return this;
    }

    public Product setVariant(String string2) {
        this.zzb("va", string2);
        return this;
    }

    public String toString() {
        return zzj.zzb(this.zza);
    }

    public final Map zza(String string2) {
        boolean bl2;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Iterator iterator = this.zza.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            String string3 = String.valueOf((String)object.getKey());
            object = (String)object.getValue();
            string3 = string2.concat(string3);
            hashMap.put(string3, object);
        }
        return hashMap;
    }

    public final void zzb(String string2, String string3) {
        Preconditions.checkNotNull(string2, "Name should be non-null");
        this.zza.put(string2, string3);
    }
}

