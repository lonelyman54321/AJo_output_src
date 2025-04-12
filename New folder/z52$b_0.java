/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.DialogNotificationPermissionBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from z52$b
 */
public final class z52$b_0
extends FunctionReferenceImpl
implements Function1 {
    public static final z52$b_0 a;

    static {
        z52$b_0 z52$b_0;
        a = z52$b_0 = new FunctionReferenceImpl(1, DialogNotificationPermissionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/DialogNotificationPermissionBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return DialogNotificationPermissionBinding.bind((View)object);
    }
}

