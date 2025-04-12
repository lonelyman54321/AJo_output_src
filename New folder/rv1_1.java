/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rv1
 */
public final class rv1_1 {
    public static final eK$d a(VZ2 object, String string2, Function0 function0) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(string2, "debugTag");
        Intrinsics.checkNotNullParameter(function0, "block");
        lv1_0 lv1_02 = new lv1_0((VZ2)object, string2, function0);
        object = eK.a(lv1_02);
        Intrinsics.checkNotNullExpressionValue(object, "getFuture { completer ->\u2026 }\n        debugTag\n    }");
        return object;
    }

    public static eK$d b(CoroutineContext object, Function2 function2) {
        l90_0 l90_02 = l90_0.DEFAULT;
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter((Object)l90_02, "start");
        Intrinsics.checkNotNullParameter(function2, "block");
        mv1_1 mv1_12 = new mv1_1((CoroutineContext)object, l90_02, function2);
        object = eK.a(mv1_12);
        Intrinsics.checkNotNullExpressionValue(object, "getFuture { completer ->\u2026owable)\n        }\n    }\n}");
        return object;
    }
}

