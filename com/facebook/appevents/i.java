/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.appevents;

import com.facebook.FacebookException;
import com.facebook.appevents.c;
import com.facebook.appevents.c$a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class i {
    public static final Set b;
    public static final Set c;
    public static final Map d;
    public final LinkedHashMap a;

    static {
        Set set;
        Object object = p03_0.f("fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used");
        b = object;
        c = set = p03_0.f("fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time");
        Q92 q92 = Q92.IAPParameters;
        Pair pair = new Pair(object, set);
        object = new Pair((Object)q92, pair);
        d = eh1_2.d((Pair)object);
    }

    public i() {
        LinkedHashMap linkedHashMap;
        this.a = linkedHashMap = new LinkedHashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Q92 object, String object2, Object object3) {
        String string2;
        int n3 = 2;
        Intrinsics.checkNotNullParameter(object, "type");
        Intrinsics.checkNotNullParameter(object2, "key");
        LinkedHashMap linkedHashMap = "value";
        Intrinsics.checkNotNullParameter(string2, (String)((Object)linkedHashMap));
        try {
            linkedHashMap = com.facebook.appevents.c.g;
            c$a.a((String)object2);
        }
        catch (Exception exception) {
            return;
        }
        boolean bl2 = string2 instanceof String;
        if (!bl2 && !(bl2 = string2 instanceof Number)) {
            linkedHashMap = StringCompanionObject.INSTANCE;
            linkedHashMap = "Parameter value '%s' for key '%s' should be a string or a numeric type.";
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            int n4 = 1;
            objectArray[n4] = object2;
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            String string3 = String.format(linkedHashMap, objectArray2);
            string2 = "format(format, *args)";
            Intrinsics.checkNotNullExpressionValue(string3, string2);
            object = new FacebookException(string3);
            throw object;
        }
        LinkedHashMap linkedHashMap2 = this.a;
        bl2 = linkedHashMap2.containsKey(object);
        if (!bl2) {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap2.put(object, linkedHashMap);
        }
        object = linkedHashMap2.get(object);
        if ((object = (Map)object) == null) return;
        object.put(object2, string2);
    }
}

