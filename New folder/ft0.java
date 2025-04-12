/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class ft0
implements gi0_0 {
    public static final Wo0 a;
    public static final Object b;

    static {
        float f5 = 1.0f;
        Object object = new Wo0(f5, f5);
        a = object;
        b = object = new Object();
    }

    public static final kn1_0 a(LiveData object, zr1_1 zr1_12, Function2 function2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(zr1_12, "other");
        Intrinsics.checkNotNullParameter(function2, "func");
        kn1_0 kn1_02 = new kn1_0();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        av1_0 av1_02 = new av1_0(ref$ObjectRef, ref$ObjectRef2, kn1_02, function2);
        kn1_02.l((LiveData)object, av1_02);
        object = new bv1_1(ref$ObjectRef2, ref$ObjectRef, kn1_02, function2);
        kn1_02.l(zr1_12, (F62)object);
        return kn1_02;
    }

    public static kn1_0 b(LiveData liveData, Function2 function2, int n3) {
        Object object;
        wp_0 wp_02 = xp_0.c;
        Object object2 = "getIOThreadExecutor()";
        Intrinsics.checkNotNullExpressionValue(wp_02, (String)object2);
        if ((n3 &= 2) != 0) {
            function2 = Fv1.c;
        }
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(wp_02, "executor");
        Intrinsics.checkNotNullParameter(function2, "areEqual");
        kn1_0 kn1_02 = new kn1_0();
        object2 = new Ref$ObjectRef();
        ((Ref$ObjectRef)object2).element = object = b;
        object = new cv1_0(wp_02, (Ref$ObjectRef)object2, function2, kn1_02);
        kn1_02.l(liveData, (F62)object);
        return kn1_02;
    }

    public void h(dx2_1 dx2_12) {
    }

    public void j() {
    }

    public wp3 n(int n3, int n4) {
        jq0_0 jq0_02 = new jq0_0();
        return jq0_02;
    }
}

