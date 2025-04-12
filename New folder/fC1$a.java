/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class fC1$a
implements fc1_0 {
    public final String a;

    public /* synthetic */ fC1$a(String string2) {
        this.a = string2;
    }

    public final boolean equals(Object object) {
        String string2;
        boolean bl2;
        boolean bl3 = object instanceof fC1$a;
        boolean bl4 = false;
        if (bl3 && (bl2 = Intrinsics.areEqual(string2 = this.a, object = ((fC1$a)object).a))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Asset(assetName=");
        String string2 = this.a;
        return h30_0.a(stringBuilder, string2, ")");
    }
}

