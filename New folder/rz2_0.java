/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rz2
 */
public final class rz2_0 {
    public final hj_1 a;
    public final DataCallback b;

    public rz2_0(hj_1 hj_12, DataCallback dataCallback) {
        Intrinsics.checkNotNullParameter((Object)hj_12, "requestType");
        Intrinsics.checkNotNullParameter(dataCallback, "priceValidationData");
        this.a = hj_12;
        this.b = dataCallback;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof rz2_0;
        if (!bl3) {
            return false;
        }
        object = (rz2_0)object;
        hj_1 hj_12 = this.a;
        Object object2 = ((rz2_0)object).a;
        if (hj_12 != object2) {
            return false;
        }
        object2 = this.b;
        object = ((rz2_0)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = ((Object)((Object)this.a)).hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PriceValidationData(requestType=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", priceValidationData=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

