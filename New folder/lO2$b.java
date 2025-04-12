/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentReturnRequestCancelBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class lO2$b
extends FunctionReferenceImpl
implements Function1 {
    public static final lO2$b a;

    static {
        lO2$b lO2$b;
        a = lO2$b = new FunctionReferenceImpl(1, FragmentReturnRequestCancelBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentReturnRequestCancelBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentReturnRequestCancelBinding.bind((View)object);
    }
}

