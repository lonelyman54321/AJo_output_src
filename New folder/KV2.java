/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class KV2 {
    public final String a;
    public final String b;
    public final String c;

    public KV2(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "currentPrice");
        Intrinsics.checkNotNullParameter(string3, "currentPriceFormat");
        Intrinsics.checkNotNullParameter(string4, "productCode");
        this.a = string2;
        this.b = string3;
        this.c = string4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof KV2;
        if (!bl3) {
            return false;
        }
        object = (KV2)object;
        String string2 = this.a;
        String string3 = ((KV2)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string3 = this.b;
        string2 = ((KV2)object).b;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        string3 = this.c;
        object = ((KV2)object).c;
        boolean bl4 = Intrinsics.areEqual(string3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        String string2 = this.b;
        n3 = zy_2.b(n3, 31, string2);
        return this.c.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SearchRvPriceDrop(currentPrice=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", currentPriceFormat=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", productCode=");
        string2 = this.c;
        return h30_0.a(stringBuilder, string2, ")");
    }
}

