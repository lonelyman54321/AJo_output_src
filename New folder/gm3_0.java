/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gm3
 */
public final class gm3_0 {
    public final S93 a;
    public final S93 b;
    public final S93 c;
    public final S93 d;

    public gm3_0() {
        this(null, null, null, null);
    }

    public gm3_0(S93 s93, S93 s932, S93 s933, S93 s934) {
        this.a = s93;
        this.b = s932;
        this.c = s933;
        this.d = s934;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        if (object != null && (bl2 = object instanceof gm3_0)) {
            object = (gm3_0)object;
            S93 s93 = this.a;
            S93 s932 = ((gm3_0)object).a;
            bl2 = Intrinsics.areEqual(s93, s932);
            if (!bl2) {
                return false;
            }
            s932 = this.b;
            s93 = ((gm3_0)object).b;
            bl2 = Intrinsics.areEqual(s932, s93);
            if (!bl2) {
                return false;
            }
            s932 = this.c;
            s93 = ((gm3_0)object).c;
            bl2 = Intrinsics.areEqual(s932, s93);
            if (!bl2) {
                return false;
            }
            s932 = this.d;
            object = ((gm3_0)object).d;
            boolean bl4 = Intrinsics.areEqual(s932, object);
            if (!bl4) {
                return false;
            }
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        S93 s93 = this.a;
        if (s93 != null) {
            n4 = s93.hashCode();
        } else {
            n4 = 0;
            s93 = null;
        }
        n4 *= 31;
        S93 s932 = this.b;
        if (s932 != null) {
            n3 = s932.hashCode();
        } else {
            n3 = 0;
            s932 = null;
        }
        n4 = (n4 + n3) * 31;
        s932 = this.c;
        if (s932 != null) {
            n3 = s932.hashCode();
        } else {
            n3 = 0;
            s932 = null;
        }
        n4 = (n4 + n3) * 31;
        s932 = this.d;
        if (s932 != null) {
            n7 = s932.hashCode();
        }
        return n4 + n7;
    }
}

