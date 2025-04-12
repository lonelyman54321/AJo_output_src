/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import com.ril.ajio.services.data.Product.PDPPriceError;
import com.ril.ajio.services.data.Product.PDPServiceError;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class PDPFunctionalRepo {
    public static final int $stable;
    private static final String ERROR_PRICE;
    public static final PDPFunctionalRepo INSTANCE;
    private static final ServiceErrorEventTracker serviceErrorEventTracker;

    static {
        PDPFunctionalRepo pDPFunctionalRepo;
        INSTANCE = pDPFunctionalRepo = new PDPFunctionalRepo();
        ERROR_PRICE = "902";
        serviceErrorEventTracker = ServiceErrorEventTracker.INSTANCE;
        $stable = 8;
    }

    private PDPFunctionalRepo() {
    }

    public final PDPPriceError checkPriceError(Product object) {
        Object object2;
        if (object != null && (object2 = ((Product)object).getServiceErrors()) != null) {
            boolean bl2;
            object2 = object2.iterator();
            while (bl2 = object2.hasNext()) {
                int n3;
                Object object3;
                Object object4 = (PDPServiceError)object2.next();
                Object object5 = ((Product)object).getShouldDisplayPricingError();
                int n4 = Intrinsics.areEqual(object5, object3 = Boolean.TRUE);
                if (n4 == 0 || object4 == null || (object5 = ((PDPServiceError)object4).getCode()) == null || (object5 = ((Integer)object5).toString()) == null) continue;
                object3 = ERROR_PRICE;
                Object object6 = null;
                n4 = b.s((String)object5, (String)object3, false);
                if (n4 != (n3 = 1) || (n4 = b.i((String)(object5 = ((PDPServiceError)object4).getSeverity()), (String)(object6 = "ERROR"), n3 != 0)) == 0 || (object5 = ((PDPServiceError)object4).getMessage()) == null || (n4 = ((String)object5).length()) == 0) continue;
                object = ((PDPServiceError)object4).getCode();
                object2 = "";
                if (object != null) {
                    int n7 = ((Number)object).intValue();
                    object6 = serviceErrorEventTracker;
                    object = ((PDPServiceError)object4).getMessage();
                    Object object7 = object == null ? object2 : object;
                    String string2 = "pdp screen";
                    String string3 = "Pdp Aggregator - Price Fetch";
                    int n8 = 64;
                    ServiceErrorEventTracker.trackServiceErrorEvent$default((ServiceErrorEventTracker)object6, string3, (String)object7, n7, null, null, string2, null, n8, null);
                }
                if ((object4 = ((PDPServiceError)object4).getMessage()) != null) {
                    object2 = object4;
                }
                object = new PDPPriceError(n3 != 0, (String)object2);
                return object;
            }
        }
        return null;
    }

    public final ArrayList getPriceBreakUpData(String arrayList, HashMap hashMap) {
        int n3;
        arrayList = arrayList != null && (n3 = arrayList.length()) != 0 && hashMap != null && (n3 = (int)(hashMap.isEmpty() ? 1 : 0)) == 0 ? (ArrayList)hashMap.get(arrayList) : null;
        return arrayList;
    }

    public final boolean isPriceBreakUpAvailable(HashMap hashMap) {
        int n3;
        boolean bl2 = false;
        if (hashMap != null) {
            n3 = hashMap.size();
        } else {
            n3 = 0;
            hashMap = null;
        }
        if (n3 > 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final void setPriceBreakUpMap(List object, HashMap hashMap) {
        Object object2 = "priceBreakUpMap";
        Intrinsics.checkNotNullParameter(hashMap, (String)object2);
        if (object != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                object2 = (ProductOptionItem)object.next();
                Object object3 = ((ProductOptionItem)object2).getPriceBreakUp();
                if (object3 == null || (bl3 = object3.isEmpty())) continue;
                object3 = ((ProductOptionItem)object2).getCode();
                object2 = ((ProductOptionItem)object2).getPriceBreakUp();
                hashMap.put(object3, object2);
            }
        }
    }
}

