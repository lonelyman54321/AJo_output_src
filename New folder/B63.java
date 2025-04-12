/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class B63 {
    public static final B63 c;
    public final wq0 a;
    public final wq0 b;

    static {
        B63 b63;
        wq0$b wq0$b = wq0$b.a;
        c = b63 = new B63(wq0$b, wq0$b);
    }

    public B63(wq0 wq02, wq0 wq03) {
        this.a = wq02;
        this.b = wq03;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof B63;
        if (!bl3) {
            return false;
        }
        object = (B63)object;
        wq0 wq02 = this.a;
        wq0 wq03 = ((B63)object).a;
        bl3 = Intrinsics.areEqual(wq02, wq03);
        if (!bl3) {
            return false;
        }
        wq03 = this.b;
        object = ((B63)object).b;
        boolean bl4 = Intrinsics.areEqual(wq03, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Size(width=");
        wq0 wq02 = this.a;
        stringBuilder.append(wq02);
        stringBuilder.append(", height=");
        wq02 = this.b;
        stringBuilder.append(wq02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

