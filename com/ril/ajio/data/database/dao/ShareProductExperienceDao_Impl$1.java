/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.ShareProductExperienceDao_Impl;
import com.ril.ajio.data.database.entity.ShareProductExperience;

class ShareProductExperienceDao_Impl$1
extends BA0 {
    final /* synthetic */ ShareProductExperienceDao_Impl this$0;

    public ShareProductExperienceDao_Impl$1(ShareProductExperienceDao_Impl shareProductExperienceDao_Impl, FP2 fP2) {
        this.this$0 = shareProductExperienceDao_Impl;
        super(fP2);
    }

    public void bind(bg3_0 bg3_02, ShareProductExperience shareProductExperience) {
        int n3 = shareProductExperience.getId();
        long l2 = n3;
        int n4 = 1;
        bg3_02.m0(n4, l2);
        String string2 = shareProductExperience.getShortLink();
        int n7 = 2;
        if (string2 == null) {
            bg3_02.w0(n7);
        } else {
            string2 = shareProductExperience.getShortLink();
            bg3_02.c0(n7, string2);
        }
        l2 = shareProductExperience.getExpType();
        n4 = 3;
        bg3_02.m0(n4, l2);
        n3 = 4;
        long l3 = shareProductExperience.getReceivedMillis();
        bg3_02.m0(n3, l3);
        string2 = shareProductExperience.getSenderId();
        n7 = 5;
        if (string2 == null) {
            bg3_02.w0(n7);
        } else {
            string2 = shareProductExperience.getSenderId();
            bg3_02.c0(n7, string2);
        }
        string2 = shareProductExperience.getSender();
        n7 = 6;
        if (string2 == null) {
            bg3_02.w0(n7);
        } else {
            string2 = shareProductExperience.getSender();
            bg3_02.c0(n7, string2);
        }
        long l4 = (long)shareProductExperience.isDeleted();
        bg3_02.m0(7, l4);
        l2 = shareProductExperience.getShareType();
        bg3_02.m0(8, l2);
    }

    public String createQuery() {
        return "INSERT OR IGNORE INTO `ShareProductExperiences` (`id`,`shortLink`,`expType`,`receivedMillis`,`senderId`,`sender`,`isDeleted`,`shareType`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
    }
}

