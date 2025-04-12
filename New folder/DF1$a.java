/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.LuxeFragmentPlpPeekBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class DF1$a
extends FunctionReferenceImpl
implements Function1 {
    public static final DF1$a a;

    static {
        DF1$a dF1$a;
        a = dF1$a = new FunctionReferenceImpl(1, LuxeFragmentPlpPeekBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/LuxeFragmentPlpPeekBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return LuxeFragmentPlpPeekBinding.bind((View)object);
    }
}

