/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from TC3
 */
public final class tc3_1
extends Lambda
implements Function1 {
    public static final tc3_1 c;

    static {
        tc3_1 tc3_12;
        c = tc3_12 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        boolean bl2 = object instanceof ViewGroup;
        uc3_1 uc3_12 = null;
        object = bl2 ? (ViewGroup)object : null;
        if (object != null) {
            uc3_12 = new uc3_1((ViewGroup)object);
        }
        return uc3_12;
    }
}

