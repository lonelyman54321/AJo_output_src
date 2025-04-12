/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class J83 {
    public static final tr1_0 a(es0_2 es0_22, Object object, CoroutineContext coroutineContext, b30_0 b30_02, int n3, int n4) {
        n3 = n4 & 2;
        if (n3 != 0) {
            coroutineContext = f.a;
        }
        n3 = b30_02.x(coroutineContext) ? 1 : 0;
        n4 = b30_02.x(es0_22) ? 1 : 0;
        Object object2 = b30_02.v();
        b30$a$a b30$a$a = b30$a.a;
        if ((n3 |= n4) != 0 || object2 == b30$a$a) {
            object2 = new n83_0(coroutineContext, es0_22, null);
            b30_02.o(object2);
        }
        object2 = (Function2)object2;
        Object object3 = b30_02.v();
        if (object3 == b30$a$a) {
            object3 = J83.g(object);
            b30_02.o(object3);
        }
        object3 = (tr1_0)object3;
        boolean bl2 = b30_02.x(object2);
        Object object4 = b30_02.v();
        if (bl2 || object4 == b30$a$a) {
            object4 = new m83_0((Function2)object2, (tr1_0)object3, null);
            b30_02.o(object4);
        }
        object4 = (Function2)object4;
        ly0_0.e(es0_22, coroutineContext, (Function2)object4, b30_02);
        return object3;
    }

    public static final tr1_0 b(jb3_2 jb3_22, b30_0 b30_02, int n3) {
        f f5 = f.a;
        Object object = jb3_22.getValue();
        int n4 = n3 & 0xE;
        return J83.a(jb3_22, object, f5, b30_02, n4, 0);
    }

    public static final WR1 c() {
        U83 u83 = K83.b;
        WR1 wR1 = (WR1)u83.a();
        if (wR1 == null) {
            Object[] objectArray = new op0_0[]{};
            wR1 = new WR1(objectArray);
            u83.b(wR1);
        }
        return wR1;
    }

    public static final mp0 d(I83 i83, Function0 function0) {
        Object object = K83.a;
        object = new mp0(i83, function0);
        return object;
    }

    public static final mp0 e(Function0 function0) {
        Object object = K83.a;
        object = new mp0(null, function0);
        return object;
    }

    public static final ParcelableSnapshotMutableState f(Object object, I83 i83) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new h83_0(object, i83);
        return parcelableSnapshotMutableState;
    }

    public static /* synthetic */ ParcelableSnapshotMutableState g(Object object) {
        J83.l();
        qi_2 qi_22 = qi_2.b;
        return J83.f(object, qi_22);
    }

    public static final void h() {
        Intrinsics.checkNotNull(wv1_0.b, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
    }

    public static final void i() {
        Intrinsics.checkNotNull(vf_1.b, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
    }

    public static final tr1_0 j(Object object, b30_0 b30_02) {
        b30$a$a b30$a$a;
        Object object2 = b30_02.v();
        if (object2 == (b30$a$a = b30$a.a)) {
            object2 = J83.g(object);
            b30_02.o(object2);
        }
        object2 = (tr1_0)object2;
        object2.setValue(object);
        return object2;
    }

    public static final br2_2 k(Function0 object) {
        o83_0 o83_02 = new o83_0((Function0)object, null);
        object = new br2_2(o83_02);
        return object;
    }

    public static final void l() {
        Intrinsics.checkNotNull(qi_2.b, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }
}

