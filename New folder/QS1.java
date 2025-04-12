/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class QS1 {
    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        if (object != null && (bl2 = object instanceof QS1)) {
            object = (QS1)object;
            boolean bl4 = false;
            object = null;
            bl2 = Intrinsics.areEqual(null, null);
            if (!bl2 || !(bl4 = Intrinsics.areEqual(null, null))) {
                bl3 = false;
            }
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder();
        String string2 = QS1.class.getSimpleName();
        charSequence.append(string2);
        charSequence.append("(0x");
        string2 = Integer.toHexString(0);
        charSequence.append(string2);
        charSequence.append(")");
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "sb.toString()");
        return charSequence;
    }
}

