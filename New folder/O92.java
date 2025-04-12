/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class O92 {
    public static final K92 a(S40 object, String object2, VZ2 vZ2, Function0 function0) {
        L92 l92;
        Intrinsics.checkNotNullParameter(object, "tracer");
        Intrinsics.checkNotNullParameter(object2, "label");
        Intrinsics.checkNotNullParameter(vZ2, "executor");
        Intrinsics.checkNotNullParameter(function0, "block");
        Object object3 = J92.b;
        zr1_1 zr1_12 = new LiveData(object3);
        object3 = l92;
        l92 = new L92(vZ2, (S40)object, (String)object2, function0, zr1_12);
        object = eK.a(l92);
        Intrinsics.checkNotNullExpressionValue(object, "getFuture { completer ->\u2026}\n            }\n        }");
        object2 = new K92(zr1_12, (eK$d)object);
        return object2;
    }
}

