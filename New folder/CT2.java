/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;

public final class CT2 {
    public final Function0 a;
    public final Function0 b;
    public final boolean c;

    public CT2(Function0 function0, Function0 function02, boolean bl2) {
        this.a = function0;
        this.b = function02;
        this.c = bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ScrollAxisRange(value=");
        float f5 = ((Number)this.a.invoke()).floatValue();
        stringBuilder.append(f5);
        stringBuilder.append(", maxValue=");
        f5 = ((Number)this.b.invoke()).floatValue();
        stringBuilder.append(f5);
        stringBuilder.append(", reverseScrolling=");
        boolean bl2 = this.c;
        return AR.a(stringBuilder, bl2, ')');
    }
}

