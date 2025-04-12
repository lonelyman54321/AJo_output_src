/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.seen_components.SeenApiModel;
import kotlin.jvm.internal.Intrinsics;

public final class qX2$d
extends qx2_1 {
    public final SeenApiModel a;

    public qX2$d(SeenApiModel seenApiModel) {
        this.a = seenApiModel;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof qX2$d;
        if (!bl3) {
            return false;
        }
        object = (qX2$d)object;
        SeenApiModel seenApiModel = this.a;
        object = ((qX2$d)object).a;
        boolean bl4 = Intrinsics.areEqual(seenApiModel, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        SeenApiModel seenApiModel = this.a;
        if (seenApiModel == null) {
            n3 = 0;
            seenApiModel = null;
        } else {
            n3 = seenApiModel.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SUCCESS(seenApiResponse=");
        SeenApiModel seenApiModel = this.a;
        stringBuilder.append(seenApiModel);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

