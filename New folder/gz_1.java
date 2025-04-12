/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gZ
 */
public final class gz_1
implements sl3_0 {
    public final long a;

    public gz_1(long l2) {
        this.a = l2;
        long l3 = 16;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 != false) {
            return;
        }
        String string2 = "ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final long a() {
        return this.a;
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
        return null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof gz_1;
        if (!bl3) {
            return false;
        }
        object = (gz_1)object;
        long l2 = this.a;
        long l3 = ((gz_1)object).a;
        boolean bl4 = OX.c(l2, l3);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final float getAlpha() {
        return OX.d(this.a);
    }

    public final int hashCode() {
        return mt3_0.a(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ColorStyle(value=");
        String string2 = OX.i(this.a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

