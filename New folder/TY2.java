/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;

public final class TY2 {
    public final String a;
    public final Function2 b;
    public boolean c;

    public /* synthetic */ TY2(String string2) {
        sy2_2 sy2_22 = sy2_2.c;
        this(string2, sy2_22);
    }

    public TY2(String string2, Function2 function2) {
        this.a = string2;
        this.b = function2;
    }

    public TY2(String string2, boolean bl2, Function2 function2) {
        this(string2, function2);
        this.c = bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AccessibilityKey: ");
        String string2 = this.a;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

