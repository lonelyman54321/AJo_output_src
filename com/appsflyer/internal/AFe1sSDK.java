/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1sSDK$AFa1vSDK;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AFe1sSDK
extends AFe1mSDK {
    public static final AFe1sSDK$AFa1vSDK AFa1vSDK;

    static {
        AFe1sSDK$AFa1vSDK aFe1sSDK$AFa1vSDK;
        AFa1vSDK = aFe1sSDK$AFa1vSDK = new AFe1sSDK$AFa1vSDK(null);
    }

    private AFe1sSDK(String string2, Map map2, byte[] byArray, String string3, boolean bl2) {
        super(string2, byArray, string3, map2, bl2);
    }

    public /* synthetic */ AFe1sSDK(String string2, Map map2, byte[] byArray, String string3, boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        boolean bl3;
        int n4;
        int n7 = n3 & 4;
        if (n7 != 0) {
            n4 = 0;
            byArray = null;
        }
        byte[] byArray2 = byArray;
        n4 = n3 & 8;
        if (n4 != 0) {
            string3 = "GET";
        }
        String string4 = string3;
        n4 = n3 & 0x10;
        if (n4 != 0) {
            bl2 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        this(string2, map2, byArray2, string4, bl3);
    }

    public static final AFe1sSDK getRevenue(String pairArray, String object, String string2, String string3) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(pairArray, (String)object2);
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        Intrinsics.checkNotNullParameter(string3, (String)object2);
        String string4 = AFe1sSDK$AFa1vSDK.AFAdRevenueData((String)pairArray, (String)object, string2);
        Object object3 = String.valueOf(System.currentTimeMillis());
        Object object4 = new Pair("Connection", "close");
        Pair pair = new Pair("af_request_epoch_ms", object3);
        pairArray = AFe1sSDK$AFa1vSDK.AFAdRevenueData((String)pairArray, string2, (String)object, string3, (String)object3);
        object = new Pair("af_sig", pairArray);
        pairArray = new Pair[]{object4, pair, object};
        object4 = fh1_2.i(pairArray);
        object3 = object2;
        object2 = new AFe1sSDK(string4, (Map)object4, null, null, false, 28, null);
        ((AFe1mSDK)object2).component3 = 10000;
        return object2;
    }
}

