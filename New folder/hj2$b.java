/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.PdpSizeChartPagerBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class hj2$b
extends FunctionReferenceImpl
implements Function1 {
    public static final hj2$b a;

    static {
        hj2$b hj2$b;
        a = hj2$b = new FunctionReferenceImpl(1, PdpSizeChartPagerBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/PdpSizeChartPagerBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return PdpSizeChartPagerBinding.bind((View)object);
    }
}

