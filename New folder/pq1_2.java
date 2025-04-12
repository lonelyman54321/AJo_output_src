/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from PQ1
 */
public final class pq1_2
extends Lambda
implements Function1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ Ref$IntRef e;
    public final /* synthetic */ Ref$FloatRef f;

    public pq1_2(long l2, float[] fArray, Ref$IntRef ref$IntRef, Ref$FloatRef ref$FloatRef) {
        this.c = l2;
        this.d = fArray;
        this.e = ref$IntRef;
        this.f = ref$FloatRef;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5;
        Ref$FloatRef ref$FloatRef;
        object = (tm2)object;
        int n3 = ((tm2)object).b;
        long l2 = this.c;
        int n4 = mm3.e(l2);
        n3 = n3 > n4 ? ((tm2)object).b : mm3.e(l2);
        int n7 = ((tm2)object).c;
        n4 = mm3.d(l2);
        if (n7 >= n4) {
            n7 = mm3.d(l2);
        }
        n3 = ((tm2)object).b(n3);
        int n8 = ((tm2)object).b(n7);
        long l3 = nm3.a(n3, n8);
        Ref$IntRef ref$IntRef = this.e;
        n4 = ref$IntRef.element;
        object = ((tm2)object).a;
        float[] fArray = this.d;
        object.p(l3, fArray, n4);
        n4 = ref$IntRef.element;
        n3 = mm3.c(l3) * 4 + n4;
        n8 = ref$IntRef.element;
        while (true) {
            ref$FloatRef = this.f;
            if (n8 >= n3) break;
            int n10 = n8 + 1;
            float f6 = fArray[n10];
            float f7 = ref$FloatRef.element;
            fArray[n10] = f6 += f7;
            n10 = n8 + 3;
            fArray[n10] = f6 = fArray[n10] + f7;
            n8 += 4;
        }
        ref$IntRef.element = n3;
        float f8 = ref$FloatRef.element;
        ref$FloatRef.element = f5 = object.getHeight() + f8;
        return Unit.a;
    }
}

