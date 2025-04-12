/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jj1
 */
public final class jj1_2 {
    public int a;
    public int b;
    public ArrayList c;

    public jj1_2() {
        throw null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof jj1_2;
        if (n3 == 0) {
            return false;
        }
        object = (jj1_2)object;
        int n4 = this.a;
        n3 = ((jj1_2)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        n4 = ((jj1_2)object).b;
        if (n3 != n4) {
            return false;
        }
        ArrayList arrayList = this.c;
        object = ((jj1_2)object).c;
        boolean bl3 = Intrinsics.areEqual(arrayList, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            n4 = 0;
            arrayList = null;
        } else {
            n4 = arrayList.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("InternalWalletViewInfo(internalWalletsStartIndex=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", internalWalletsEndIndex=");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", internalWalletsData=");
        ArrayList arrayList = this.c;
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

