/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.DatabaseCreator;
import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper$Companion;
import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper$fetchAllSharedWithMeCloset$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1;
import com.ril.ajio.data.database.entity.ShareProductExperience;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public final class ShareProductExperienceDaoHelper {
    public static final int $stable;
    public static final ShareProductExperienceDaoHelper$Companion Companion;
    private static ShareProductExperienceDaoHelper shareProductExperienceDaoHelper;

    static {
        ShareProductExperienceDaoHelper$Companion shareProductExperienceDaoHelper$Companion;
        Companion = shareProductExperienceDaoHelper$Companion = new ShareProductExperienceDaoHelper$Companion(null);
    }

    public static final /* synthetic */ String access$buildQueryToFetch(ShareProductExperienceDaoHelper shareProductExperienceDaoHelper, long l2) {
        return shareProductExperienceDaoHelper.buildQueryToFetch(l2);
    }

    public static final /* synthetic */ ShareProductExperienceDaoHelper access$getShareProductExperienceDaoHelper$cp() {
        return shareProductExperienceDaoHelper;
    }

    public static final /* synthetic */ void access$setShareProductExperienceDaoHelper$cp(ShareProductExperienceDaoHelper shareProductExperienceDaoHelper) {
        ShareProductExperienceDaoHelper.shareProductExperienceDaoHelper = shareProductExperienceDaoHelper;
    }

    private final String buildQueryToFetch(long l2) {
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM ShareProductExperiences WHERE id = ");
        stringBuilder.append(l2);
        stringBuilder.append(" AND isDeleted = 0 ORDER BY id");
        String string2 = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "with(...)");
        return string2;
    }

    public final es0_2 fetchAllSharedWithMeCloset() {
        Object object = DatabaseCreator.INSTANCE.getDBInstance();
        ShareProductExperienceDaoHelper$fetchAllSharedWithMeCloset$$inlined$map$1 shareProductExperienceDaoHelper$fetchAllSharedWithMeCloset$$inlined$map$1 = new ShareProductExperienceDaoHelper$fetchAllSharedWithMeCloset$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m(shareProductExperienceDaoHelper$fetchAllSharedWithMeCloset$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 fetchCompositeSharedWithMe(long l2) {
        es0_2 es0_22 = DatabaseCreator.INSTANCE.getDBInstance();
        ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1 shareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1 = new ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1(es0_22, this, l2);
        wm0_2 wm0_22 = ir0_2.a;
        return ms0_1.m(shareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1, wm0_22);
    }

    public final es0_2 insertShareProductExperience(ShareProductExperience object, String string2) {
        Intrinsics.checkNotNullParameter(object, "shareProductExperience");
        Intrinsics.checkNotNullParameter(string2, "products");
        es0_2 es0_22 = DatabaseCreator.INSTANCE.getDBInstance();
        ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1 shareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1 = new ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1(es0_22, (ShareProductExperience)object, string2);
        object = ir0_2.a;
        return ms0_1.m(shareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1, (CoroutineContext)object);
    }
}

