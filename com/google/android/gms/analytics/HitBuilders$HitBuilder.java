/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.zzd;
import com.google.android.gms.internal.gtm.zzen;
import com.google.android.gms.internal.gtm.zzff;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HitBuilders$HitBuilder {
    ProductAction zza;
    final Map zzb;
    final List zzc;
    final List zzd;
    private final Map zze;

    public HitBuilders$HitBuilder() {
        Cloneable cloneable;
        this.zze = cloneable = new Cloneable();
        this.zzb = cloneable = new Cloneable();
        this.zzc = cloneable;
        super();
        this.zzd = cloneable;
    }

    private final HitBuilders$HitBuilder zza(String string2, String string3) {
        if (string3 != null) {
            Map map2 = this.zze;
            map2.put(string2, string3);
        }
        return this;
    }

    public HitBuilders$HitBuilder addImpression(Product product, String string2) {
        Map map2;
        boolean bl2;
        if (product == null) {
            zzen.zze("product should be non-null");
            return this;
        }
        if (string2 == null) {
            string2 = "";
        }
        if (!(bl2 = (map2 = this.zzb).containsKey(string2))) {
            map2 = this.zzb;
            ArrayList arrayList = new ArrayList();
            map2.put(string2, arrayList);
        }
        ((List)this.zzb.get(string2)).add(product);
        return this;
    }

    public HitBuilders$HitBuilder addProduct(Product product) {
        if (product == null) {
            zzen.zze("product should be non-null");
            return this;
        }
        this.zzd.add(product);
        return this;
    }

    public HitBuilders$HitBuilder addPromotion(Promotion promotion) {
        if (promotion == null) {
            zzen.zze("promotion should be non-null");
            return this;
        }
        this.zzc.add(promotion);
        return this;
    }

    public Map build() {
        Object object;
        Object object2;
        boolean bl2;
        Object object3 = this.zze;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>((Map<Object, Object>)object3);
        object3 = this.zza;
        if (object3 != null) {
            object3 = ((ProductAction)object3).zza();
            hashMap.putAll((Map<Object, Object>)object3);
        }
        object3 = this.zzc.iterator();
        int n3 = 1;
        int n4 = 1;
        while (bl2 = object3.hasNext()) {
            object2 = (Promotion)object3.next();
            object = com.google.android.gms.analytics.zzd.zzl(n4);
            object2 = ((Promotion)object2).zza((String)object);
            hashMap.putAll((Map<Object, Object>)object2);
            n4 += n3;
        }
        object3 = this.zzd.iterator();
        n4 = 1;
        while (bl2 = object3.hasNext()) {
            object2 = (Product)object3.next();
            object = com.google.android.gms.analytics.zzd.zzj(n4);
            object2 = ((Product)object2).zza((String)object);
            hashMap.putAll((Map<Object, Object>)object2);
            n4 += n3;
        }
        object3 = this.zzb.entrySet().iterator();
        n4 = 1;
        while (bl2 = object3.hasNext()) {
            boolean bl3;
            object2 = (Map.Entry)object3.next();
            object = (List)object2.getValue();
            String string2 = com.google.android.gms.analytics.zzd.zzg(n4);
            object = object.iterator();
            int n7 = 1;
            while (bl3 = object.hasNext()) {
                Object object4 = (Product)object.next();
                String string3 = com.google.android.gms.analytics.zzd.zzi(n7);
                string3 = string2.concat(string3);
                object4 = ((Product)object4).zza(string3);
                hashMap.putAll((Map<Object, Object>)object4);
                n7 += n3;
            }
            object = (CharSequence)object2.getKey();
            boolean bl4 = TextUtils.isEmpty((CharSequence)object);
            if (!bl4) {
                object2 = (String)object2.getKey();
                object = string2.concat("nm");
                hashMap.put(object, object2);
            }
            ++n4;
        }
        return hashMap;
    }

    public String get(String string2) {
        return (String)this.zze.get(string2);
    }

    public final HitBuilders$HitBuilder set(String string2, String string3) {
        if (string2 != null) {
            Map map2 = this.zze;
            map2.put(string2, string3);
        } else {
            string2 = "HitBuilder.set() called with a null paramName.";
            zzen.zze(string2);
        }
        return this;
    }

    public final HitBuilders$HitBuilder setAll(Map map2) {
        if (map2 == null) {
            return this;
        }
        Map map3 = this.zze;
        HashMap hashMap = new HashMap(map2);
        map3.putAll(hashMap);
        return this;
    }

    public HitBuilders$HitBuilder setCampaignParamsFromUrl(String object) {
        boolean bl2;
        Object object2;
        CharSequence charSequence;
        block12: {
            int n3;
            String string2;
            int n4;
            block11: {
                int n7;
                boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                charSequence = null;
                if (bl3) break block12;
                object2 = "?";
                bl3 = ((String)object).contains((CharSequence)object2);
                if (bl3 && (n7 = ((String[])(object2 = ((String)object).split("[\\?]"))).length) > (n4 = 1)) {
                    object = object2[n4];
                }
                object2 = "%3D";
                bl3 = ((String)object).contains((CharSequence)object2);
                string2 = "=";
                if (bl3) {
                    object2 = "UTF-8";
                    try {
                        object = URLDecoder.decode((String)object, (String)object2);
                        break block11;
                    }
                    catch (UnsupportedEncodingException unsupportedEncodingException) {
                        break block12;
                    }
                }
                bl3 = ((String)object).contains(string2);
                if (!bl3) break block12;
            }
            object = zzff.zzf((String)object);
            String string3 = "anid";
            String string4 = "gmob_t";
            CharSequence charSequence2 = "utm_source";
            String string5 = "gclid";
            String string6 = "aclid";
            String string7 = "utm_campaign";
            String string8 = "utm_medium";
            String string9 = "utm_term";
            String string10 = "utm_content";
            String string11 = "utm_id";
            object2 = new String[]{"dclid", charSequence2, string5, string6, string7, string8, string9, string10, string11, string3, string4};
            charSequence = new StringBuilder();
            for (n4 = 0; n4 < (n3 = 11); ++n4) {
                charSequence2 = object2[n4];
                n3 = (int)(TextUtils.isEmpty((CharSequence)(charSequence2 = (CharSequence)object.get(charSequence2))) ? 1 : 0);
                if (n3 != 0) continue;
                n3 = ((StringBuilder)charSequence).length();
                if (n3 > 0) {
                    charSequence2 = "&";
                    ((StringBuilder)charSequence).append((String)charSequence2);
                }
                charSequence2 = object2[n4];
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append(string2);
                charSequence2 = object2[n4];
                charSequence2 = (String)object.get(charSequence2);
                ((StringBuilder)charSequence).append((String)charSequence2);
            }
            charSequence = ((StringBuilder)charSequence).toString();
        }
        if (bl2 = TextUtils.isEmpty(charSequence)) {
            return this;
        }
        object = zzff.zzf(charSequence);
        object2 = (String)object.get("utm_content");
        this.zza("&cc", (String)object2);
        object2 = (String)object.get("utm_medium");
        this.zza("&cm", (String)object2);
        object2 = (String)object.get("utm_campaign");
        this.zza("&cn", (String)object2);
        object2 = (String)object.get("utm_source");
        this.zza("&cs", (String)object2);
        object2 = (String)object.get("utm_term");
        this.zza("&ck", (String)object2);
        object2 = (String)object.get("utm_id");
        this.zza("&ci", (String)object2);
        object2 = (String)object.get("anid");
        this.zza("&anid", (String)object2);
        object2 = (String)object.get("gclid");
        this.zza("&gclid", (String)object2);
        object2 = (String)object.get("dclid");
        this.zza("&dclid", (String)object2);
        object2 = (String)object.get("aclid");
        this.zza("&aclid", (String)object2);
        object = (String)object.get("gmob_t");
        this.zza("&gmob_t", (String)object);
        return this;
    }

    public HitBuilders$HitBuilder setCustomDimension(int n3, String string2) {
        String string3 = com.google.android.gms.analytics.zzd.zza(n3);
        this.set(string3, string2);
        return this;
    }

    public HitBuilders$HitBuilder setCustomMetric(int n3, float f5) {
        String string2 = com.google.android.gms.analytics.zzd.zzd(n3);
        String string3 = Float.toString(f5);
        this.set(string2, string3);
        return this;
    }

    public HitBuilders$HitBuilder setHitType(String string2) {
        this.set("&t", string2);
        return this;
    }

    public HitBuilders$HitBuilder setNewSession() {
        this.set("&sc", "start");
        return this;
    }

    public HitBuilders$HitBuilder setNonInteraction(boolean bl2) {
        String string2 = zzff.zzc(bl2);
        this.set("&ni", string2);
        return this;
    }

    public HitBuilders$HitBuilder setProductAction(ProductAction productAction) {
        this.zza = productAction;
        return this;
    }

    public HitBuilders$HitBuilder setPromotionAction(String string2) {
        this.zze.put("&promoa", string2);
        return this;
    }
}

