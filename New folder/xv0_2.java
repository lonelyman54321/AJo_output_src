/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/*
 * Renamed from xv0
 */
public final class xv0_2
extends FunctionReferenceImpl
implements Function0 {
    public final Object invoke() {
        Object object = (tv0_2)this.receiver;
        object.getClass();
        pl2_1.Companion.getClass();
        pl2_1 pl2_12 = new pl2_1();
        object = ((Fragment)object).getChildFragmentManager();
        pl2_12.show((FragmentManager)object, "ResultFragment");
        return Unit.a;
    }
}

