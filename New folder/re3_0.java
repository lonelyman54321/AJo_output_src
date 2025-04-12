/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rE3
 */
public abstract class re3_0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public re3_0(int n3, int n4, int n7, int n8) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = n8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(Rv1 object) {
        Intrinsics.checkNotNullParameter(object, "loadType");
        int[] nArray = rE3$c.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 == n4) return this.a;
            n4 = 3;
            if (n3 == n4) {
                return this.b;
            }
            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            throw noWhenBranchMatchedException;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        throw illegalArgumentException;
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof re3_0;
        if (n4 == 0) {
            return false;
        }
        object = (re3_0)object;
        int n7 = this.a;
        n4 = ((re3_0)object).a;
        if (n7 != n4 || (n4 = this.b) != (n7 = ((re3_0)object).b) || (n4 = this.c) != (n7 = ((re3_0)object).c) || (n4 = this.d) != (n3 = ((re3_0)object).d)) {
            bl2 = false;
        }
        return bl2;
    }

    public int hashCode() {
        int n3 = this.a;
        int n4 = this.b;
        n3 += n4;
        n4 = this.c;
        n3 += n4;
        n4 = this.d;
        return n3 + n4;
    }
}

