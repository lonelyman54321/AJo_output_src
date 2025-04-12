/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentOrderRefundBreakupBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class OH2$a
extends FunctionReferenceImpl
implements Function1 {
    public static final OH2$a a;

    static {
        OH2$a oH2$a;
        a = oH2$a = new FunctionReferenceImpl(1, FragmentOrderRefundBreakupBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentOrderRefundBreakupBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentOrderRefundBreakupBinding.bind((View)object);
    }
}

