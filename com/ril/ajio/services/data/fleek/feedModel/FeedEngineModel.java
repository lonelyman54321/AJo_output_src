/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FeedEngineModel {
    private FeedEngineData data;

    public FeedEngineModel() {
        this(null, 1, null);
    }

    public FeedEngineModel(FeedEngineData feedEngineData) {
        this.data = feedEngineData;
    }

    public /* synthetic */ FeedEngineModel(FeedEngineData feedEngineData, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            feedEngineData = null;
        }
        this(feedEngineData);
    }

    public static /* synthetic */ FeedEngineModel copy$default(FeedEngineModel feedEngineModel, FeedEngineData feedEngineData, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            feedEngineData = feedEngineModel.data;
        }
        return feedEngineModel.copy(feedEngineData);
    }

    public final FeedEngineData component1() {
        return this.data;
    }

    public final FeedEngineModel copy(FeedEngineData feedEngineData) {
        FeedEngineModel feedEngineModel = new FeedEngineModel(feedEngineData);
        return feedEngineModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FeedEngineModel;
        if (!bl3) {
            return false;
        }
        object = (FeedEngineModel)object;
        FeedEngineData feedEngineData = this.data;
        object = ((FeedEngineModel)object).data;
        boolean bl4 = Intrinsics.areEqual(feedEngineData, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final FeedEngineData getData() {
        return this.data;
    }

    public int hashCode() {
        int n3;
        FeedEngineData feedEngineData = this.data;
        if (feedEngineData == null) {
            n3 = 0;
            feedEngineData = null;
        } else {
            n3 = feedEngineData.hashCode();
        }
        return n3;
    }

    public final void setData(FeedEngineData feedEngineData) {
        this.data = feedEngineData;
    }

    public String toString() {
        FeedEngineData feedEngineData = this.data;
        StringBuilder stringBuilder = new StringBuilder("FeedEngineModel(data=");
        stringBuilder.append(feedEngineData);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

