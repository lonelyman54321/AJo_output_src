/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentChooseStoreBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class Nc3$b
extends FunctionReferenceImpl
implements Function1 {
    public static final Nc3$b a;

    static {
        Nc3$b nc3$b;
        a = nc3$b = new FunctionReferenceImpl(1, FragmentChooseStoreBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentChooseStoreBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentChooseStoreBinding.bind((View)object);
    }
}

