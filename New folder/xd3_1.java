/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.activity.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from XD3
 */
public final class xd3_1
extends Lambda
implements Function1 {
    public static final xd3_1 c;

    static {
        xd3_1 xd3_12;
        c = xd3_12 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = R$id.view_tree_on_back_pressed_dispatcher_owner;
        object = object.getTag(n3);
        n3 = object instanceof h82_0;
        object = n3 != 0 ? (h82_0)object : null;
        return object;
    }
}

