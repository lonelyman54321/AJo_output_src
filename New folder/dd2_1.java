/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from dd2
 */
public final class dd2_1
implements Function2 {
    public final /* synthetic */ ou0_0 a;
    public final /* synthetic */ ou0_0 b;
    public final /* synthetic */ ou0_0 c;
    public final /* synthetic */ ou0_0 d;
    public final /* synthetic */ b93 e;
    public final /* synthetic */ Ref$ObjectRef f;
    public final /* synthetic */ Ref$ObjectRef g;
    public final /* synthetic */ Ref$ObjectRef h;
    public final /* synthetic */ Ref$ObjectRef i;
    public final /* synthetic */ qz1_2 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ Function1 l;

    public dd2_1(ou0_0 ou0_02, ou0_0 ou0_03, ou0_0 ou0_04, ou0_0 ou0_05, b93 b932, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, qz1_2 qz1_22, yp0_2 yp0_22, je1_0 je1_02) {
        this.a = ou0_02;
        this.b = ou0_03;
        this.c = ou0_04;
        this.d = ou0_05;
        this.e = b932;
        this.f = ref$ObjectRef;
        this.g = ref$ObjectRef2;
        this.h = ref$ObjectRef3;
        this.i = ref$ObjectRef4;
        this.j = qz1_22;
        this.k = yp0_22;
        this.l = je1_02;
    }

    public final Object invoke(Object object, Object object2) {
        dd2_1 dd2_12 = this;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n3 = ((Number)object4).intValue() & 0xB;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4 && (n3 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object4 = LP1$a.b;
            f5 = 16;
            object4 = androidx.compose.foundation.layout.j.c(androidx.compose.foundation.layout.h.e((LP1)object4, f5), 1.0f);
            Object object5 = dd2_12.k;
            Function0 function0 = object5;
            function0 = (yp0_2)object5;
            object5 = dd2_12.l;
            fx0_2 fx0_22 = object5;
            fx0_22 = (je1_0)object5;
            ou0_0 ou0_02 = dd2_12.a;
            ou0_0 ou0_03 = dd2_12.b;
            ou0_0 ou0_04 = dd2_12.c;
            ou0_0 ou0_05 = dd2_12.d;
            b93 b932 = dd2_12.e;
            Ref$ObjectRef ref$ObjectRef = dd2_12.f;
            Ref$ObjectRef ref$ObjectRef2 = dd2_12.g;
            Ref$ObjectRef ref$ObjectRef3 = dd2_12.h;
            Ref$ObjectRef ref$ObjectRef4 = dd2_12.i;
            object5 = dd2_12.j;
            cd2_1 cd2_12 = new cd2_1(ou0_02, ou0_03, ou0_04, ou0_05, b932, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3, ref$ObjectRef4, (qz1_2)object5, (yp0_2)function0, (je1_0)fx0_22);
            u10 u102 = v10.c(-347465841, cd2_12, (b30_0)object3);
            int n7 = 3078;
            int n8 = 6;
            n4 = 0;
            f5 = 0.0f;
            cd2_12 = null;
            object5 = null;
            OA.a((LP1)object4, null, false, u102, (b30_0)object3, n7, n8);
        }
        return Unit.a;
    }
}

