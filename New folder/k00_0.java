/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.b;

/*
 * Renamed from K00
 */
public final class k00_0 {
    public final Object a;
    public final b b;
    public final gx0_2 c;
    public final Object d;
    public final Throwable e;

    public k00_0(Object object, b b2, gx0_2 gx0_22, Object object2, Throwable throwable) {
        this.a = object;
        this.b = b2;
        this.c = gx0_22;
        this.d = object2;
        this.e = throwable;
    }

    public /* synthetic */ k00_0(Object object, b b2, gx0_2 gx0_22, CancellationException cancellationException, int n3) {
        int n4 = n3 & 2;
        b b3 = n4 != 0 ? null : b2;
        int n7 = n3 & 4;
        gx0_2 gx0_23 = n7 != 0 ? null : gx0_22;
        n7 = n3 & 0x10;
        CancellationException cancellationException2 = n7 != 0 ? null : cancellationException;
        this(object, b3, gx0_23, null, cancellationException2);
    }

    public static k00_0 a(k00_0 k00_02, b b2, CancellationException throwable, int n3) {
        Object object = k00_02.a;
        int n4 = n3 & 2;
        if (n4 != 0) {
            b2 = k00_02.b;
        }
        b b3 = b2;
        gx0_2 gx0_22 = k00_02.c;
        Object object2 = k00_02.d;
        int n7 = n3 & 0x10;
        if (n7 != 0) {
            throwable = k00_02.e;
        }
        k00_02.getClass();
        k00_02 = new k00_0(object, b3, gx0_22, object2, throwable);
        return k00_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof k00_0;
        if (!bl3) {
            return false;
        }
        object = (k00_0)object;
        Object object2 = this.a;
        Object object3 = ((k00_0)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((k00_0)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((k00_0)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((k00_0)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.e;
        object = ((k00_0)object).e;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        Object object = this.a;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = object.hashCode();
        }
        n4 *= 31;
        Object object2 = this.b;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = object2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.c;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = object2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.d;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = object2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.e;
        if (object2 != null) {
            n7 = object2.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CompletedContinuation(result=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", cancelHandler=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", onCancellation=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", idempotentResume=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", cancelCause=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

