/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.DialogLocationPermRevampBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class v52$b
extends FunctionReferenceImpl
implements Function1 {
    public static final v52$b a;

    static {
        v52$b v52$b;
        a = v52$b = new FunctionReferenceImpl(1, DialogLocationPermRevampBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/DialogLocationPermRevampBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return DialogLocationPermRevampBinding.bind((View)object);
    }
}

