/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.SortFilterReviewsSheetBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class u93$b
extends FunctionReferenceImpl
implements Function1 {
    public static final u93$b a;

    static {
        u93$b u93$b;
        a = u93$b = new FunctionReferenceImpl(1, SortFilterReviewsSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/SortFilterReviewsSheetBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return SortFilterReviewsSheetBinding.bind((View)object);
    }
}

