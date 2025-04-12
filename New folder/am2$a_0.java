/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.NoResult;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aM2$a
 */
public final class am2$a_0
extends am2_2 {
    public final NoResult a;

    public am2$a_0(NoResult noResult) {
        Intrinsics.checkNotNullParameter(noResult, "noResult");
        this.a = noResult;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof am2$a_0;
        if (!bl3) {
            return false;
        }
        object = (am2$a_0)object;
        NoResult noResult = this.a;
        object = ((am2$a_0)object).a;
        boolean bl4 = Intrinsics.areEqual(noResult, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FAILURE(noResult=");
        NoResult noResult = this.a;
        stringBuilder.append(noResult);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

