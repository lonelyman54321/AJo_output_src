/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentCategoryBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class QV1$c
extends FunctionReferenceImpl
implements Function1 {
    public static final QV1$c a;

    static {
        QV1$c qV1$c;
        a = qV1$c = new FunctionReferenceImpl(1, FragmentCategoryBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentCategoryBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentCategoryBinding.bind((View)object);
    }
}

