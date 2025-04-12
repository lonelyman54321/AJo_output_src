/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public final class xB0
extends Lambda
implements Function1 {
    public static final xB0 c;

    static {
        xB0 xB02;
        c = xB02 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (JSONObject)object;
        Intrinsics.checkNotNullParameter(object, "inApp");
        return object.optInt("priority", 1);
    }
}

