/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YQ
 */
public final class yq_0 {
    public final String a;
    public int b;
    public final boolean c;

    public yq_0(String string2, int n3, boolean bl2) {
        this.a = string2;
        this.b = n3;
        this.c = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof yq_0;
        if (n3 == 0) {
            return false;
        }
        object = (yq_0)object;
        String string2 = this.a;
        String string3 = ((yq_0)object).a;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((yq_0)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.c ? 1 : 0);
        int n7 = ((yq_0)object).c;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.c ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final String toString() {
        int bl2 = this.b;
        StringBuilder stringBuilder = new StringBuilder("CcItemDetailData(orderId=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", selectedEntryNumber=");
        stringBuilder.append(bl2);
        stringBuilder.append(", isFromOrderDetail=");
        boolean bl3 = this.c;
        return Vm.a(")", bl3, stringBuilder);
    }
}

