/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentExReturnTabAddressRevampBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class oC0$c
extends FunctionReferenceImpl
implements Function1 {
    public static final oC0$c a;

    static {
        oC0$c oC0$c;
        a = oC0$c = new FunctionReferenceImpl(1, FragmentExReturnTabAddressRevampBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentExReturnTabAddressRevampBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentExReturnTabAddressRevampBinding.bind((View)object);
    }
}

