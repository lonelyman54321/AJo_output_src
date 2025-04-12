/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bE
 */
public final class be_2
implements sl3_0 {
    public final Z03 a;
    public final float b;

    public be_2(Z03 z03, float f5) {
        this.a = z03;
        this.b = f5;
    }

    public final long a() {
        return OX.l;
    }

    public final sl3_0 b(Function0 object) {
        sl3$a sl3$a = sl3$a.a;
        boolean bl2 = Intrinsics.areEqual(this, sl3$a);
        object = !bl2 ? this : (sl3_0)object.invoke();
        return object;
    }

    public final /* synthetic */ sl3_0 c(sl3_0 sl3_02) {
        return rl3_0.a(this, sl3_02);
    }

    public final ZD d() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof be_2;
        if (!bl3) {
            return false;
        }
        object = (be_2)object;
        Z03 z03 = this.a;
        Z03 z032 = ((be_2)object).a;
        bl3 = Intrinsics.areEqual(z03, z032);
        if (!bl3) {
            return false;
        }
        float f5 = this.b;
        float f6 = ((be_2)object).b;
        int n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final float getAlpha() {
        return this.b;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return Float.floatToIntBits(this.b) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BrushStyle(value=");
        Z03 z03 = this.a;
        stringBuilder.append(z03);
        stringBuilder.append(", alpha=");
        float f5 = this.b;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

