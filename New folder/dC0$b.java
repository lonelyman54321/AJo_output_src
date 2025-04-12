/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentExReturnAddressRevampBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class dC0$b
extends FunctionReferenceImpl
implements Function1 {
    public static final dC0$b a;

    static {
        dC0$b dC0$b;
        a = dC0$b = new FunctionReferenceImpl(1, FragmentExReturnAddressRevampBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentExReturnAddressRevampBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentExReturnAddressRevampBinding.bind((View)object);
    }
}

