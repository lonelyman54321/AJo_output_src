/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.savedstate.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ZD3$b
 */
public final class zd3$b_0
extends Lambda
implements Function1 {
    public static final zd3$b_0 c;

    static {
        zd3$b_0 zd3$b_0;
        c = zd3$b_0 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = R$id.view_tree_saved_state_registry_owner;
        object = object.getTag(n3);
        n3 = object instanceof zs2_1;
        object = n3 != 0 ? (zs2_1)object : null;
        return object;
    }
}

