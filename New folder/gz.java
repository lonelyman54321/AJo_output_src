/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.BorderModifierNodeElement;

public final class gz {
    public static final LP1 a(LP1 lP1, float f5, long l2, i13 i132) {
        i93_0 i93_02 = new i93_0(l2);
        return gz.b(lP1, f5, i93_02, i132);
    }

    public static final LP1 b(LP1 lP1, float f5, ZD zD, i13 i132) {
        BorderModifierNodeElement borderModifierNodeElement = new BorderModifierNodeElement(f5, zD, i132);
        return lP1.then(borderModifierNodeElement);
    }

    public static final long c(long l2, float f5) {
        float f6 = r90_0.b(l2) - f5;
        f6 = Math.max(0.0f, f6);
        float f7 = r90_0.c(l2) - f5;
        f7 = Math.max(0.0f, f7);
        return s90.a(f6, f7);
    }
}

