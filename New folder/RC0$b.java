/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.ExchangeFragementLayoutRevampBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class RC0$b
extends FunctionReferenceImpl
implements Function1 {
    public static final RC0$b a;

    static {
        RC0$b rC0$b;
        a = rC0$b = new FunctionReferenceImpl(1, ExchangeFragementLayoutRevampBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/ExchangeFragementLayoutRevampBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return ExchangeFragementLayoutRevampBinding.bind((View)object);
    }
}

