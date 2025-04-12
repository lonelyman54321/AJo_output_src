/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentSharedWithMeListBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class J23$b
extends FunctionReferenceImpl
implements Function1 {
    public static final J23$b a;

    static {
        J23$b j23$b;
        a = j23$b = new FunctionReferenceImpl(1, FragmentSharedWithMeListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentSharedWithMeListBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentSharedWithMeListBinding.bind((View)object);
    }
}

