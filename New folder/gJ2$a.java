/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 */
import android.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class gJ2$a
extends Lambda
implements Function2 {
    public static final gJ2$a c;

    static {
        gJ2$a gJ2$a;
        c = gJ2$a = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (Pp0)object;
        object2 = (Matrix)object2;
        object.z((Matrix)object2);
        return Unit.a;
    }
}

