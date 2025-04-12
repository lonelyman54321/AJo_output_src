/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentReturnRefundBreakupBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IH2$a
 */
public final class ih2$a_0
extends FunctionReferenceImpl
implements Function1 {
    public static final ih2$a_0 a;

    static {
        ih2$a_0 ih2$a_0;
        a = ih2$a_0 = new FunctionReferenceImpl(1, FragmentReturnRefundBreakupBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentReturnRefundBreakupBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentReturnRefundBreakupBinding.bind((View)object);
    }
}

