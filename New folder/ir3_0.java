/*
 * Decompiled with CFR 0.152.
 */
import androidx.transition.Transition;
import androidx.transition.Transition$i;
import androidx.transition.Transition$j;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ir3
 */
public final class ir3_0
implements Transition$j {
    public static void b(StringBuilder stringBuilder, String string2, String string3) {
        stringBuilder.append(string2);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), string3);
    }

    public void a(Transition$i transition$i, Transition transition2, boolean bl2) {
        transition$i.onTransitionStart(transition2, bl2);
    }
}

