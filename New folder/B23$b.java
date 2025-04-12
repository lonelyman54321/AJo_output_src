/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentSharedWithMeDetailBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class B23$b
extends FunctionReferenceImpl
implements Function1 {
    public static final B23$b a;

    static {
        B23$b b23$b;
        a = b23$b = new FunctionReferenceImpl(1, FragmentSharedWithMeDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentSharedWithMeDetailBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentSharedWithMeDetailBinding.bind((View)object);
    }
}

