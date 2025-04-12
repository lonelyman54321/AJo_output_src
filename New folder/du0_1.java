/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/*
 * Renamed from dU0
 */
public final class du0_1
extends FunctionReferenceImpl
implements Function0 {
    public final Object invoke() {
        uu0_1 uu0_12;
        Object object = (b)this.receiver;
        uu0_1 uu0_13 = ((b)object).f.s1();
        if (uu0_13 == (uu0_12 = uu0_1.Inactive)) {
            object = ((b)object).c;
            object.invoke();
        }
        return Unit.a;
    }
}

