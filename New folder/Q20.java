/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.tooling.ComposeViewAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class Q20
extends FunctionReferenceImpl
implements Function0 {
    public final Object invoke() {
        ((ComposeViewAdapter)((Object)this.receiver)).requestLayout();
        return Unit.a;
    }
}

