/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/*
 * Renamed from Vo1
 */
public final class vo1_1 {
    public static final at3_0 a(at3_0 object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ((at3_0)object).b;
        Intrinsics.checkNotNull(object);
        object = ((KTypeProjection)object.getArguments().get((int)0)).b;
        Intrinsics.checkNotNull(object);
        zn1_2 zn1_22 = object.getClassifier();
        Intrinsics.checkNotNull(zn1_22, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        zn1_22 = (yn1_2)zn1_22;
        at3_0 at3_02 = new at3_0((yn1_2)zn1_22, (kn1_1)object);
        return at3_02;
    }
}

