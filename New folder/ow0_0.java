/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ow0
 */
public final class ow0_0
implements pa3_0 {
    public final tr1_0 a;

    public ow0_0(tr1_0 tr1_02) {
        this.a = tr1_02;
    }

    public final Object a(rq2_1 rq2_12) {
        return this.a.getValue();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ow0_0;
        if (!bl3) {
            return false;
        }
        object = (ow0_0)object;
        tr1_0 tr1_02 = this.a;
        object = ((ow0_0)object).a;
        boolean bl4 = Intrinsics.areEqual(tr1_02, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DynamicValueHolder(state=");
        tr1_0 tr1_02 = this.a;
        stringBuilder.append(tr1_02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

