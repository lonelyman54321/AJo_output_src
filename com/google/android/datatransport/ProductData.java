/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport;

import com.google.android.datatransport.AutoValue_ProductData;

public abstract class ProductData {
    public static ProductData withProductId(Integer n3) {
        AutoValue_ProductData autoValue_ProductData = new AutoValue_ProductData(n3);
        return autoValue_ProductData;
    }

    public abstract Integer getProductId();
}

