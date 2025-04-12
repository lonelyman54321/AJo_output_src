/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.ShareProductExperienceDao_Impl;
import com.ril.ajio.data.database.entity.ListShareProductExperience;

class ShareProductExperienceDao_Impl$2
extends BA0 {
    final /* synthetic */ ShareProductExperienceDao_Impl this$0;

    public ShareProductExperienceDao_Impl$2(ShareProductExperienceDao_Impl shareProductExperienceDao_Impl, FP2 fP2) {
        this.this$0 = shareProductExperienceDao_Impl;
        super(fP2);
    }

    public void bind(bg3_0 bg3_02, ListShareProductExperience listShareProductExperience) {
        long l2 = listShareProductExperience.getLId();
        int n3 = 1;
        bg3_02.m0(n3, l2);
        int n4 = 2;
        long l3 = listShareProductExperience.getCId();
        bg3_02.m0(n4, l3);
        String string2 = listShareProductExperience.getProductId();
        int n7 = 3;
        if (string2 == null) {
            bg3_02.w0(n7);
        } else {
            string2 = listShareProductExperience.getProductId();
            bg3_02.c0(n7, string2);
        }
        l3 = (long)listShareProductExperience.isDeleted();
        bg3_02.m0(4, l3);
    }

    public String createQuery() {
        return "INSERT OR IGNORE INTO `ListShareProductExperiences` (`lId`,`cId`,`productId`,`isDeleted`) VALUES (nullif(?, 0),?,?,?)";
    }
}

