/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentEligibleReturnBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vy0$b
 */
public final class vy0$b_1
extends FunctionReferenceImpl
implements Function1 {
    public static final vy0$b_1 a;

    static {
        vy0$b_1 vy0$b_1;
        a = vy0$b_1 = new FunctionReferenceImpl(1, FragmentEligibleReturnBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentEligibleReturnBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentEligibleReturnBinding.bind((View)object);
    }
}

