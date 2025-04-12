/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentProductCodeBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class Yz2$b
extends FunctionReferenceImpl
implements Function1 {
    public static final Yz2$b a;

    static {
        Yz2$b yz2$b;
        a = yz2$b = new FunctionReferenceImpl(1, FragmentProductCodeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentProductCodeBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentProductCodeBinding.bind((View)object);
    }
}

