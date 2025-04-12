/*
 * Decompiled with CFR 0.152.
 */
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aN
 */
public final class an_1 {
    public static void a(Object[] object, int n3, String string2, String string3, ConstraintLayout constraintLayout) {
        object = Arrays.copyOf(object, n3);
        object = String.format(string2, object);
        Intrinsics.checkNotNullExpressionValue(object, string3);
        constraintLayout.setContentDescription((CharSequence)object);
    }
}

