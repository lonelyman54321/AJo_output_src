/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.ResultModel;
import kotlin.jvm.internal.Intrinsics;

public final class aM2$d
extends am2_2 {
    public final ResultModel a;

    public aM2$d(ResultModel resultModel) {
        Intrinsics.checkNotNullParameter(resultModel, "data");
        this.a = resultModel;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof aM2$d;
        if (!bl3) {
            return false;
        }
        object = (aM2$d)object;
        ResultModel resultModel = this.a;
        object = ((aM2$d)object).a;
        boolean bl4 = Intrinsics.areEqual(resultModel, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SUCCESS(data=");
        ResultModel resultModel = this.a;
        stringBuilder.append(resultModel);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

