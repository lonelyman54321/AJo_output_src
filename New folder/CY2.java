/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

public final class CY2 {
    public static final AtomicInteger a;

    static {
        AtomicInteger atomicInteger;
        a = atomicInteger = new AtomicInteger(0);
    }

    public static final LP1 a(LP1 lP1, Function1 function1) {
        ClearAndSetSemanticsElement clearAndSetSemanticsElement = new ClearAndSetSemanticsElement(function1);
        return lP1.then(clearAndSetSemanticsElement);
    }

    public static final LP1 b(LP1 lP1, boolean bl2, Function1 function1) {
        AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement(function1, bl2);
        return lP1.then(appendedSemanticsElement);
    }
}

