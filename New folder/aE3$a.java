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

public final class aE3$a
extends Lambda
implements Function1 {
    public static final aE3$a c;

    static {
        aE3$a aE3$a;
        c = aE3$a = new Lambda(1);
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

