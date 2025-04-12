/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.ranges.f;

/*
 * Renamed from Lf0
 */
public final class lf0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ xf3_1 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ gu2_2 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ c60 g;
    public final /* synthetic */ Ref$IntRef h;
    public final /* synthetic */ Ref$IntRef i;
    public final /* synthetic */ gx0_2 j;

    public /* synthetic */ lf0_2(int n3, ArrayList arrayList, xf3_1 xf3_12, Function2 function2, gu2_2 gu2_22, int n4, c60 c602, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, gx0_2 gx0_22) {
        this.a = n3;
        this.b = arrayList;
        this.c = xf3_12;
        this.d = function2;
        this.e = gu2_22;
        this.f = n4;
        this.g = c602;
        this.h = ref$IntRef;
        this.i = ref$IntRef2;
        this.j = gx0_22;
    }

    public final Object invoke(Object object) {
        int n3;
        int n4;
        ArrayList<wh3_2> arrayList;
        Object object2;
        Object object3;
        gu2_2 gu2_22;
        xf3_1 xf3_12;
        Object object4;
        Object object5;
        lf0_2 lf0_22;
        block7: {
            int n7;
            long l2;
            float f5;
            int n8;
            float f6;
            Object object6;
            int n10;
            lf0_22 = this;
            object5 = object;
            object5 = (Ns2$a)object;
            object4 = this.b;
            Intrinsics.checkNotNullParameter(object4, "$tabPlaceables");
            xf3_12 = this.c;
            Intrinsics.checkNotNullParameter(xf3_12, "$this_SubcomposeLayout");
            gu2_22 = this.e;
            Intrinsics.checkNotNullParameter(gu2_22, "$scrollableTabData");
            object3 = this.h;
            Intrinsics.checkNotNullParameter(object3, "$layoutWidth");
            object2 = this.i;
            Intrinsics.checkNotNullParameter(object2, "$layoutHeight");
            Intrinsics.checkNotNullParameter(object5, "$this$layout");
            arrayList = new ArrayList<wh3_2>();
            object4 = ((Iterable)object4).iterator();
            int n14 = n4 = this.a;
            while (true) {
                n10 = object4.hasNext();
                wh3_2 wh3_22 = null;
                if (n10 == 0) break;
                object6 = (Ns2)object4.next();
                Ns2$a.f((Ns2$a)object5, (Ns2)object6, n14, 0);
                f6 = xf3_12.D0(n14);
                n8 = ((Ns2)object6).a;
                f5 = xf3_12.D0(n8);
                wh3_22 = new wh3_2(f6, f5);
                arrayList.add(wh3_22);
                n10 = ((Ns2)object6).a;
                n14 += n10;
            }
            object4 = bi3_0.Divider;
            Object object7 = lf0_22.d;
            object4 = ((Iterable)xf3_12.w(object4, (Function2)object7)).iterator();
            while ((n14 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object7 = (xk1_0)object4.next();
                object6 = lf0_22.g;
                l2 = ((c60)object6).a;
                int n15 = ((Ref$IntRef)object3).element;
                int n16 = 8;
                l2 = c60.b(l2, n15, n15, 0, 0, n16);
                object7 = object7.Q(l2);
                n10 = ((Ref$IntRef)object2).element;
                n7 = ((Ns2)object7).b;
                Ns2$a.f((Ns2$a)object5, (Ns2)object7, 0, n10 -= n7);
            }
            object4 = bi3_0.Indicator;
            object6 = lf0_22.j;
            object7 = new mf0_2((gx0_2)object6, arrayList);
            n7 = 241570463;
            f6 = 2.8358655E-30f;
            n8 = 1;
            f5 = Float.MIN_VALUE;
            object6 = new u10(n7, object7, n8 != 0);
            object4 = ((Iterable)xf3_12.w(object4, (Function2)object6)).iterator();
            while (true) {
                n14 = (int)(object4.hasNext() ? 1 : 0);
                n10 = 0;
                object6 = null;
                if (n14 == 0) break block7;
                object7 = (xk1_0)object4.next();
                n7 = ((Ref$IntRef)object3).element;
                n8 = ((Ref$IntRef)object2).element;
                if (n7 < 0 || n8 < 0) break;
                l2 = f60.i(n7, n7, n8, n8);
                object7 = object7.Q(l2);
                Ns2$a.f((Ns2$a)object5, (Ns2)object7, 0, 0);
            }
            object5 = new StringBuilder("width(");
            ((StringBuilder)object5).append(n7);
            ((StringBuilder)object5).append(") and height(");
            ((StringBuilder)object5).append(n8);
            ((StringBuilder)object5).append(") must be >= 0");
            hz0.a(((StringBuilder)object5).toString());
            throw null;
        }
        gu2_22.getClass();
        Intrinsics.checkNotNullParameter(xf3_12, "density");
        Intrinsics.checkNotNullParameter(arrayList, "tabPositions");
        object5 = gu2_22.c;
        int n17 = lf0_22.f;
        if (object5 == null || (n3 = ((Integer)object5).intValue()) != n17) {
            gu2_22.c = object5 = Integer.valueOf(n17);
            object5 = (wh3_2)CollectionsKt.N(n17, arrayList);
            if (object5 != null) {
                object4 = (wh3_2)CollectionsKt.S(arrayList);
                float f7 = ((wh3_2)object4).a;
                float f8 = ((wh3_2)object4).b;
                n17 = xf3_12.e0(f7 += f8) + n4;
                object3 = gu2_22.a;
                object2 = ((st2_2)object3).d;
                int n18 = ((e83_0)object2).o();
                n18 = n17 - n18;
                float f11 = ((wh3_2)object5).a;
                int n19 = xf3_12.e0(f11);
                n4 = n18 / 2;
                float f12 = ((wh3_2)object5).b;
                n3 = xf3_12.e0(f12) / 2;
                n19 -= (n4 -= n3);
                if ((n17 -= n18) < 0) {
                    n17 = 0;
                    f8 = 0.0f;
                    object4 = null;
                }
                n3 = kotlin.ranges.f.g(n19, 0, n17);
                object4 = ((st2_2)object3).a;
                n17 = ((e83_0)object4).o();
                if (n17 != n3) {
                    object4 = new fu2_1(gu2_22, n3, null);
                    object5 = gu2_22.b;
                    int n20 = 3;
                    Ae3.d((i90_0)object5, null, null, (Function2)object4, n20);
                }
            }
        }
        return Unit.a;
    }
}

