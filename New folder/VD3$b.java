/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.lifecycle.runtime.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class VD3$b
extends Lambda
implements Function1 {
    public static final VD3$b c;

    static {
        VD3$b vD3$b;
        c = vD3$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        String string2 = "viewParent";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = R$id.view_tree_lifecycle_owner;
        object = object.getTag(n3);
        n3 = object instanceof mu1_1;
        object = n3 != 0 ? (mu1_1)object : null;
        return object;
    }
}

