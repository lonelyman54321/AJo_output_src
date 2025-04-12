/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.ReturnFeeBottomSheetLayoutBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PM2$b
 */
public final class pm2$b_0
extends FunctionReferenceImpl
implements Function1 {
    public static final pm2$b_0 a;

    static {
        pm2$b_0 pm2$b_0;
        a = pm2$b_0 = new FunctionReferenceImpl(1, ReturnFeeBottomSheetLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/ReturnFeeBottomSheetLayoutBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return ReturnFeeBottomSheetLayoutBinding.bind((View)object);
    }
}

