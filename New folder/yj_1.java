/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.compose.ui.viewbinding.R$id;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from yj
 */
public final class yj_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;

    public yj_1(Function1 function1) {
        this.c = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        int n3 = R$id.binding_reference;
        object = object.getTag(n3);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        object = (BC3)object;
        this.c.invoke(object);
        return Unit.a;
    }
}

