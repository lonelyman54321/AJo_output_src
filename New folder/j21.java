/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class j21 {
    private final Boolean a;
    private final String b;

    public j21() {
        Boolean bl2 = Boolean.FALSE;
        this.a = bl2;
        this.b = "";
    }

    public final String a() {
        return this.b;
    }

    public final Boolean b() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof j21;
        if (!bl3) {
            return false;
        }
        object = (j21)object;
        Object object2 = this.a;
        Boolean bl4 = ((j21)object).a;
        bl3 = Intrinsics.areEqual(object2, bl4);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((j21)object).b;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Boolean bl2 = this.a;
        int n4 = 0;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n3 *= 31;
        String string2 = this.b;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        Boolean bl2 = this.a;
        String string2 = this.b;
        StringBuilder stringBuilder = new StringBuilder("HalfCardBannerConfig(enableSignupHalfCardBanner=");
        stringBuilder.append(bl2);
        stringBuilder.append(", bannerUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

