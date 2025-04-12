/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.ProductExperienceDao_Impl;
import com.ril.ajio.data.database.entity.ProductExperience;

class ProductExperienceDao_Impl$1
extends BA0 {
    final /* synthetic */ ProductExperienceDao_Impl this$0;

    public ProductExperienceDao_Impl$1(ProductExperienceDao_Impl productExperienceDao_Impl, FP2 fP2) {
        this.this$0 = productExperienceDao_Impl;
        super(fP2);
    }

    public void bind(bg3_0 bg3_02, ProductExperience productExperience) {
        int n3 = productExperience.getId();
        long l2 = n3;
        int n4 = 1;
        bg3_02.m0(n4, l2);
        String string2 = productExperience.productId;
        int n7 = 2;
        if (string2 == null) {
            bg3_02.w0(n7);
        } else {
            bg3_02.c0(n7, string2);
        }
        double d2 = productExperience.getSellingPrice();
        bg3_02.r(3, d2);
        l2 = productExperience.getExpType();
        bg3_02.m0(4, l2);
        long l3 = productExperience.getViewedMillis();
        bg3_02.m0(5, l3);
        l2 = productExperience.getStoreType();
        bg3_02.m0(6, l2);
    }

    public String createQuery() {
        return "INSERT OR IGNORE INTO `ProductExperience` (`id`,`productId`,`sellingPrice`,`expType`,`viewedMillis`,`storeType`) VALUES (nullif(?, 0),?,?,?,?,?)";
    }
}

