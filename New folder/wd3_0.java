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
 * Renamed from WD3
 */
public final class wd3_0
extends Lambda
implements Function1 {
    public static final wd3_0 c;

    static {
        wd3_0 wd3_02;
        c = wd3_02 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        object = object.getParent();
        boolean bl2 = object instanceof View;
        object = bl2 ? (View)object : null;
        return object;
    }
}

