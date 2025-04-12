/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.ProductExperienceDao_Impl;

class ProductExperienceDao_Impl$4
extends n23 {
    final /* synthetic */ ProductExperienceDao_Impl this$0;

    public ProductExperienceDao_Impl$4(ProductExperienceDao_Impl productExperienceDao_Impl, FP2 fP2) {
        this.this$0 = productExperienceDao_Impl;
        super(fP2);
    }

    public String createQuery() {
        return "UPDATE ProductExperience SET viewedMillis=?, sellingPrice=?, storeType=?  WHERE expType = 1 AND productId LIKE?";
    }
}

