/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.RvpBottomSheetLayoutBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class WQ2$b
extends FunctionReferenceImpl
implements Function1 {
    public static final WQ2$b a;

    static {
        WQ2$b wQ2$b;
        a = wQ2$b = new FunctionReferenceImpl(1, RvpBottomSheetLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/RvpBottomSheetLayoutBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return RvpBottomSheetLayoutBinding.bind((View)object);
    }
}

