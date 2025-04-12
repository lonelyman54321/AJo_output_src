/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.ReturnFragmentLayoutRevampBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class dN2$b
extends FunctionReferenceImpl
implements Function1 {
    public static final dN2$b a;

    static {
        dN2$b dN2$b;
        a = dN2$b = new FunctionReferenceImpl(1, ReturnFragmentLayoutRevampBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/ReturnFragmentLayoutRevampBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return ReturnFragmentLayoutRevampBinding.bind((View)object);
    }
}

