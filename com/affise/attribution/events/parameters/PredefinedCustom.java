/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.Predefined;
import com.affise.attribution.events.parameters.PredefinedString;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class PredefinedCustom {
    private final Map predefinedParameters;

    public PredefinedCustom() {
        LinkedHashMap linkedHashMap;
        this.predefinedParameters = linkedHashMap = new LinkedHashMap();
    }

    private final void add(Predefined object, Object object2) {
        Map map2 = this.predefinedParameters;
        object = object.value();
        map2.put(object, object2);
    }

    public final String conversionId(String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "orderId");
        Intrinsics.checkNotNullParameter(string2, "productId");
        CharSequence charSequence = new StringBuilder();
        charSequence.append((String)object);
        charSequence.append('_');
        charSequence.append(string2);
        charSequence = charSequence.toString();
        PredefinedString predefinedString = PredefinedString.ORDER_ID;
        this.add(predefinedString, object);
        object = PredefinedString.PRODUCT_ID;
        this.add((Predefined)object, string2);
        object = PredefinedString.CONVERSION_ID;
        this.add((Predefined)object, charSequence);
        return charSequence;
    }

    public final Map get$attribution_release() {
        return fh1_2.o(this.predefinedParameters);
    }
}

