/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.CartPdpWebViewBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class wO$b
extends FunctionReferenceImpl
implements Function1 {
    public static final wO$b a;

    static {
        wO$b wO$b;
        a = wO$b = new FunctionReferenceImpl(1, CartPdpWebViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/CartPdpWebViewBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return CartPdpWebViewBinding.bind((View)object);
    }
}

