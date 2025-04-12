/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentProductBreakupBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class SA2$a
extends FunctionReferenceImpl
implements Function1 {
    public static final SA2$a a;

    static {
        SA2$a sA2$a;
        a = sA2$a = new FunctionReferenceImpl(1, FragmentProductBreakupBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentProductBreakupBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentProductBreakupBinding.bind((View)object);
    }
}

