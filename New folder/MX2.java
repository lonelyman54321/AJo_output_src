/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class MX2 {
    public final MX2$a a;
    public final MX2$a b;
    public final boolean c;

    public MX2(MX2$a mX2$a, MX2$a mX2$a2, boolean bl2) {
        this.a = mX2$a;
        this.b = mX2$a2;
        this.c = bl2;
    }

    public static MX2 a(MX2 mX2, MX2$a mX2$a, MX2$a mX2$a2, boolean bl2, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            mX2$a = mX2.a;
        }
        if ((n3 &= 2) != 0) {
            mX2$a2 = mX2.b;
        }
        mX2.getClass();
        mX2 = new MX2(mX2$a, mX2$a2, bl2);
        return mX2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof MX2;
        if (!bl3) {
            return false;
        }
        object = (MX2)object;
        MX2$a mX2$a = this.a;
        MX2$a mX2$a2 = ((MX2)object).a;
        bl3 = Intrinsics.areEqual(mX2$a, mX2$a2);
        if (!bl3) {
            return false;
        }
        mX2$a2 = this.b;
        mX2$a = ((MX2)object).b;
        bl3 = Intrinsics.areEqual(mX2$a2, mX2$a);
        if (!bl3) {
            return false;
        }
        bl3 = this.c;
        boolean bl4 = ((MX2)object).c;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        MX2$a mX2$a = this.a;
        int n3 = mX2$a.hashCode() * 31;
        MX2$a mX2$a2 = this.b;
        int n4 = (mX2$a2.hashCode() + n3) * 31;
        n3 = this.c ? 1 : 0;
        n3 = n3 != 0 ? 1231 : 1237;
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Selection(start=");
        MX2$a mX2$a = this.a;
        stringBuilder.append(mX2$a);
        stringBuilder.append(", end=");
        mX2$a = this.b;
        stringBuilder.append(mX2$a);
        stringBuilder.append(", handlesCrossed=");
        boolean bl2 = this.c;
        return AR.a(stringBuilder, bl2, ')');
    }
}

