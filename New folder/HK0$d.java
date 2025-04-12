/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import kotlin.jvm.internal.Intrinsics;

public final class HK0$d
extends hk0_1 {
    public final FeedEngineData a;

    public HK0$d(FeedEngineData feedEngineData) {
        this.a = feedEngineData;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof HK0$d;
        if (!bl3) {
            return false;
        }
        object = (HK0$d)object;
        FeedEngineData feedEngineData = this.a;
        object = ((HK0$d)object).a;
        boolean bl4 = Intrinsics.areEqual(feedEngineData, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        FeedEngineData feedEngineData = this.a;
        if (feedEngineData == null) {
            n3 = 0;
            feedEngineData = null;
        } else {
            n3 = feedEngineData.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SUCCESS(feedEngineData=");
        FeedEngineData feedEngineData = this.a;
        stringBuilder.append(feedEngineData);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

