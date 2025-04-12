/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.ProductExperienceDao_Impl;
import com.ril.ajio.data.database.entity.ProductExperience;

class ProductExperienceDao_Impl$3
extends AA0 {
    final /* synthetic */ ProductExperienceDao_Impl this$0;

    public ProductExperienceDao_Impl$3(ProductExperienceDao_Impl productExperienceDao_Impl, FP2 fP2) {
        this.this$0 = productExperienceDao_Impl;
        super(fP2);
    }

    public void bind(bg3_0 bg3_02, ProductExperience productExperience) {
        long l2 = productExperience.getId();
        bg3_02.m0(1, l2);
    }

    public String createQuery() {
        return "DELETE FROM `ProductExperience` WHERE `id` = ?";
    }
}

