/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentDeleteAddressBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class Eo0$b
extends FunctionReferenceImpl
implements Function1 {
    public static final Eo0$b a;

    static {
        Eo0$b eo0$b;
        a = eo0$b = new FunctionReferenceImpl(1, FragmentDeleteAddressBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentDeleteAddressBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentDeleteAddressBinding.bind((View)object);
    }
}

