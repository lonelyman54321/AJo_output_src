/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ShareProductExperienceDaoHelper$Companion {
    private ShareProductExperienceDaoHelper$Companion() {
    }

    public /* synthetic */ ShareProductExperienceDaoHelper$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final ShareProductExperienceDaoHelper getInstance() {
        ShareProductExperienceDaoHelper shareProductExperienceDaoHelper = ShareProductExperienceDaoHelper.access$getShareProductExperienceDaoHelper$cp();
        if (shareProductExperienceDaoHelper == null) {
            shareProductExperienceDaoHelper = new ShareProductExperienceDaoHelper();
            ShareProductExperienceDaoHelper.access$setShareProductExperienceDaoHelper$cp(shareProductExperienceDaoHelper);
        }
        if ((shareProductExperienceDaoHelper = ShareProductExperienceDaoHelper.access$getShareProductExperienceDaoHelper$cp()) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareProductExperienceDaoHelper");
            shareProductExperienceDaoHelper = null;
        }
        return shareProductExperienceDaoHelper;
    }
}

