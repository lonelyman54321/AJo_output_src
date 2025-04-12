/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.ShareProductExperienceDao_Impl;

class ShareProductExperienceDao_Impl$4
extends n23 {
    final /* synthetic */ ShareProductExperienceDao_Impl this$0;

    public ShareProductExperienceDao_Impl$4(ShareProductExperienceDao_Impl shareProductExperienceDao_Impl, FP2 fP2) {
        this.this$0 = shareProductExperienceDao_Impl;
        super(fP2);
    }

    public String createQuery() {
        return "UPDATE ListShareProductExperiences SET isDeleted = 0 WHERE cId = ?";
    }
}

