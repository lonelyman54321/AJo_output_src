/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentPlpPeekBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class nv2$b
extends FunctionReferenceImpl
implements Function1 {
    public static final nv2$b a;

    static {
        nv2$b nv2$b;
        a = nv2$b = new FunctionReferenceImpl(1, FragmentPlpPeekBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentPlpPeekBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentPlpPeekBinding.bind((View)object);
    }
}

