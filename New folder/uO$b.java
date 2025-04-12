/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentCartPdpBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class uO$b
extends FunctionReferenceImpl
implements Function1 {
    public static final uO$b a;

    static {
        uO$b uO$b;
        a = uO$b = new FunctionReferenceImpl(1, FragmentCartPdpBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentCartPdpBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentCartPdpBinding.bind((View)object);
    }
}

