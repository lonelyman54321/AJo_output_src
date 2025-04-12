/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class ul$a$b
extends Lambda
implements Function1 {
    public static final ul$a$b c;

    static {
        ul$a$b ul$a$b;
        c = ul$a$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        return Intrinsics.areEqual(((LP1$b)object).getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement");
    }
}

