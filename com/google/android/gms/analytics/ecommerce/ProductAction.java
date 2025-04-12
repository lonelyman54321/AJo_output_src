/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProductAction {
    public static final String ACTION_ADD = "add";
    public static final String ACTION_CHECKOUT = "checkout";
    public static final String ACTION_CHECKOUT_OPTION = "checkout_option";
    public static final String ACTION_CHECKOUT_OPTIONS = "checkout_options";
    public static final String ACTION_CLICK = "click";
    public static final String ACTION_DETAIL = "detail";
    public static final String ACTION_PURCHASE = "purchase";
    public static final String ACTION_REFUND = "refund";
    public static final String ACTION_REMOVE = "remove";
    final Map zza;

    public ProductAction(String string2) {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
        this.zzb("&pa", string2);
    }

    public ProductAction setCheckoutOptions(String string2) {
        this.zzb("&col", string2);
        return this;
    }

    public ProductAction setCheckoutStep(int n3) {
        String string2 = Integer.toString(n3);
        this.zzb("&cos", string2);
        return this;
    }

    public ProductAction setProductActionList(String string2) {
        this.zzb("&pal", string2);
        return this;
    }

    public ProductAction setProductListSource(String string2) {
        this.zzb("&pls", string2);
        return this;
    }

    public ProductAction setTransactionAffiliation(String string2) {
        this.zzb("&ta", string2);
        return this;
    }

    public ProductAction setTransactionCouponCode(String string2) {
        this.zzb("&tcc", string2);
        return this;
    }

    public ProductAction setTransactionId(String string2) {
        this.zzb("&ti", string2);
        return this;
    }

    public ProductAction setTransactionRevenue(double d2) {
        String string2 = Double.toString(d2);
        this.zzb("&tr", string2);
        return this;
    }

    public ProductAction setTransactionShipping(double d2) {
        String string2 = Double.toString(d2);
        this.zzb("&ts", string2);
        return this;
    }

    public ProductAction setTransactionTax(double d2) {
        String string2 = Double.toString(d2);
        this.zzb("&tt", string2);
        return this;
    }

    public String toString() {
        boolean bl2;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Iterator iterator = this.zza.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2;
            Map.Entry entry = iterator.next();
            String string3 = (String)entry.getKey();
            boolean bl3 = string3.startsWith(string2 = "&");
            if (bl3) {
                string3 = (String)entry.getKey();
                int n3 = 1;
                string3 = string3.substring(n3);
                entry = (String)entry.getValue();
                hashMap.put(string3, entry);
                continue;
            }
            string3 = (String)entry.getKey();
            entry = (String)entry.getValue();
            hashMap.put(string3, entry);
        }
        return zzj.zzb(hashMap);
    }

    public final Map zza() {
        Map map2 = this.zza;
        HashMap hashMap = new HashMap(map2);
        return hashMap;
    }

    public final void zzb(String string2, String string3) {
        Preconditions.checkNotNull(string2, "Name should be non-null");
        this.zza.put(string2, string3);
    }
}

