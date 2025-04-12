/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentSpendHistoryRefreshBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class na3$b
extends FunctionReferenceImpl
implements Function1 {
    public static final na3$b a;

    static {
        na3$b na3$b;
        a = na3$b = new FunctionReferenceImpl(1, FragmentSpendHistoryRefreshBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentSpendHistoryRefreshBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentSpendHistoryRefreshBinding.bind((View)object);
    }
}

