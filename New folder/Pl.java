/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Pl {
    public static final Ol a(Ol ol) {
        Ol ol2 = Pl.b(ol);
        int n3 = ol2.b();
        for (int i3 = 0; i3 < n3; ++i3) {
            float f5 = ol.a(i3);
            ol2.e(f5, i3);
        }
        return ol2;
    }

    public static final Ol b(Ol ol) {
        ol = ol.c();
        Intrinsics.checkNotNull(ol, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return ol;
    }
}

