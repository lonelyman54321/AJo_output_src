/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.DressToolModel;
import kotlin.jvm.internal.Intrinsics;

public final class Bv0$d
extends bv0_1 {
    public final DressToolModel a;

    public Bv0$d(DressToolModel dressToolModel) {
        this.a = dressToolModel;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Bv0$d;
        if (!bl3) {
            return false;
        }
        object = (Bv0$d)object;
        DressToolModel dressToolModel = this.a;
        object = ((Bv0$d)object).a;
        boolean bl4 = Intrinsics.areEqual(dressToolModel, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        DressToolModel dressToolModel = this.a;
        if (dressToolModel == null) {
            n3 = 0;
            dressToolModel = null;
        } else {
            n3 = dressToolModel.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SUCCESS(data=");
        DressToolModel dressToolModel = this.a;
        stringBuilder.append(dressToolModel);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

