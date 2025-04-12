/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ZD3$a
 */
public final class zd3$a_0
extends Lambda
implements Function1 {
    public static final zd3$a_0 c;

    static {
        zd3$a_0 zd3$a_0;
        c = zd3$a_0 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        object = object.getParent();
        boolean bl2 = object instanceof View;
        object = bl2 ? (View)object : null;
        return object;
    }
}

