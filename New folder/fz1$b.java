/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentLoginNewBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class fz1$b
extends FunctionReferenceImpl
implements Function1 {
    public static final fz1$b a;

    static {
        fz1$b fz1$b;
        a = fz1$b = new FunctionReferenceImpl(1, FragmentLoginNewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentLoginNewBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentLoginNewBinding.bind((View)object);
    }
}

