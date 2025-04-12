/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper;

final class RecentlyViewedDaoHelper$insertToDBAndDelete$1
extends h80_0 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentlyViewedDaoHelper this$0;

    public RecentlyViewedDaoHelper$insertToDBAndDelete$1(RecentlyViewedDaoHelper recentlyViewedDaoHelper, f80_0 f80_02) {
        this.this$0 = recentlyViewedDaoHelper;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return RecentlyViewedDaoHelper.access$insertToDBAndDelete(this.this$0, null, null, this);
    }
}

