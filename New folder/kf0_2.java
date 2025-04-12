/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from Kf0
 */
public final class kf0_2
implements Function2 {
    public final /* synthetic */ float a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ gu2_2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ gx0_2 f;

    public /* synthetic */ kf0_2(float f5, u10 u102, Function2 function2, gu2_2 gu2_22, int n3, gx0_2 gx0_22) {
        this.a = f5;
        this.b = u102;
        this.c = function2;
        this.d = gu2_22;
        this.e = n3;
        this.f = gx0_22;
    }

    public final Object invoke(Object object, Object object2) {
        lf0_2 lf0_22;
        Object object3;
        int n3;
        int n4;
        kf0_2 kf0_22 = this;
        Object object4 = object;
        object4 = (xf3_1)object;
        Object object5 = object2;
        object5 = (c60)object2;
        Object object6 = this.b;
        Intrinsics.checkNotNullParameter(object6, "$tabs");
        gu2_2 gu2_22 = this.d;
        Intrinsics.checkNotNullParameter(gu2_22, "$scrollableTabData");
        String string2 = "$this$SubcomposeLayout";
        Intrinsics.checkNotNullParameter(object4, string2);
        float f5 = of0_1.a;
        int n7 = object4.e0(f5);
        f5 = this.a;
        int n8 = object4.e0(f5);
        long l2 = ((c60)object5).a;
        int n10 = 14;
        long l3 = c60.b(l2, n7, 0, 0, 0, n10);
        Object object7 = bi3_0.Tabs;
        object6 = object4.w(object7, (Function2)object6);
        int n14 = yx_2.o((Iterable)object6, 10);
        object7 = new ArrayList(n14);
        object6 = object6.iterator();
        while ((n14 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
            Ns2 ns2 = ((xk1_0)object6.next()).Q(l3);
            ((ArrayList)object7).add(ns2);
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = n4 = n8 * 2;
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        object6 = ((ArrayList)object7).iterator();
        while ((n3 = object6.hasNext()) != 0) {
            object3 = (Ns2)object6.next();
            int n15 = ref$IntRef.element;
            n14 = ((Ns2)object3).a;
            ref$IntRef.element = n15 += n14;
            n15 = ref$IntRef2.element;
            n3 = ((Ns2)object3).b;
            ref$IntRef2.element = n3 = Math.max(n15, n3);
        }
        int n16 = ref$IntRef.element;
        int n17 = ref$IntRef2.element;
        n14 = kf0_22.e;
        gx0_2 gx0_22 = kf0_22.f;
        Object object8 = kf0_22.c;
        object6 = lf0_22;
        object3 = object7;
        object7 = object8;
        object8 = object4;
        lf0_22 = new lf0_2(n8, (ArrayList)object3, (xf3_1)object4, (Function2)object7, gu2_22, n14, (c60)object5, ref$IntRef, ref$IntRef2, gx0_22);
        return cl1_0.a((dl1_1)object4, n16, n17, lf0_22);
    }
}

