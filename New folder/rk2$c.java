/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class rk2$c
extends rk2_0 {
    public final Qv1 a;
    public final Qv1 b;

    public rk2$c(Qv1 qv1, Qv1 qv12) {
        Intrinsics.checkNotNullParameter(qv1, "source");
        this.a = qv1;
        this.b = qv12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof rk2$c;
        if (!bl3) {
            return false;
        }
        object = (rk2$c)object;
        Qv1 qv1 = this.a;
        Qv1 qv12 = ((rk2$c)object).a;
        bl3 = Intrinsics.areEqual(qv1, qv12);
        if (!bl3) {
            return false;
        }
        qv12 = this.b;
        object = ((rk2$c)object).b;
        boolean bl4 = Intrinsics.areEqual(qv12, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Qv1 qv1 = this.a;
        int n4 = qv1.hashCode() * 31;
        Qv1 qv12 = this.b;
        if (qv12 == null) {
            n3 = 0;
            qv12 = null;
        } else {
            n3 = qv12.hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: ");
        Object object = this.a;
        charSequence.append(object);
        charSequence.append("\n                    ");
        charSequence = charSequence.toString();
        object = this.b;
        if (object != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append("|   mediatorLoadStates: ");
            stringBuilder.append(object);
            char c2 = '\n';
            stringBuilder.append(c2);
            charSequence = stringBuilder.toString();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append("|)");
        return ee3_2.c(((StringBuilder)object).toString());
    }
}

