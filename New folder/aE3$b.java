/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.lifecycle.viewmodel.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class aE3$b
extends Lambda
implements Function1 {
    public static final aE3$b c;

    static {
        aE3$b aE3$b;
        c = aE3$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = R$id.view_tree_view_model_store_owner;
        object = object.getTag(n3);
        n3 = object instanceof sD3;
        object = n3 != 0 ? (sD3)object : null;
        return object;
    }
}

