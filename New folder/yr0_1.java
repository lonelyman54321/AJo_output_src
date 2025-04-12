/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yR0
 */
public final class yr0_1 {
    private Boolean a = null;
    private Boolean b = null;
    private Boolean c = null;

    public final Boolean a() {
        return this.a;
    }

    public final Boolean b() {
        return this.c;
    }

    public final Boolean c() {
        return this.b;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof yr0_1;
        if (!bl3) {
            return false;
        }
        object = (yr0_1)object;
        Boolean bl4 = this.a;
        Boolean bl5 = ((yr0_1)object).a;
        bl3 = Intrinsics.areEqual(bl4, bl5);
        if (!bl3) {
            return false;
        }
        bl4 = this.b;
        bl5 = ((yr0_1)object).b;
        bl3 = Intrinsics.areEqual(bl4, bl5);
        if (!bl3) {
            return false;
        }
        bl4 = this.c;
        object = ((yr0_1)object).c;
        boolean bl6 = Intrinsics.areEqual(bl4, object);
        if (!bl6) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.a;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Boolean bl3 = this.b;
        if (bl3 == null) {
            n3 = 0;
            bl3 = null;
        } else {
            n3 = ((Object)bl3).hashCode();
        }
        n4 = (n4 + n3) * 31;
        bl3 = this.c;
        if (bl3 != null) {
            n7 = ((Object)bl3).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        Boolean bl2 = this.a;
        Boolean bl3 = this.b;
        Boolean bl4 = this.c;
        StringBuilder stringBuilder = new StringBuilder("FleekVideoConfig(shouldAutoPlay=");
        stringBuilder.append(bl2);
        stringBuilder.append(", shouldPlayOnMute=");
        stringBuilder.append(bl3);
        stringBuilder.append(", shouldLoop=");
        return nx3_0.a(stringBuilder, bl4, ")");
    }
}

