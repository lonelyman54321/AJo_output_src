/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from pZ
 */
public final class pz_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2[] c;
    public final /* synthetic */ qz_0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ dl1_1 g;
    public final /* synthetic */ int[] h;

    public pz_0(Ns2[] ns2Array, qz_0 qz_02, int n3, int n4, dl1_1 dl1_12, int[] nArray) {
        this.c = ns2Array;
        this.d = qz_02;
        this.e = n3;
        this.f = n4;
        this.g = dl1_12;
        this.h = nArray;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Ns2[] ns2Array = this.c;
        int n3 = ns2Array.length;
        Object object2 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            Ns2 ns2 = ns2Array[i3];
            Object object3 = object2 + 1;
            Intrinsics.checkNotNull(ns2);
            Object object4 = ns2.B();
            boolean bl2 = object4 instanceof hQ2;
            int n7 = 0;
            Object object5 = null;
            if (bl2) {
                object4 = (hQ2)object4;
            } else {
                n4 = 0;
                object4 = null;
            }
            Object object6 = this.g.getLayoutDirection();
            qz_0 qz_02 = this.d;
            qz_02.getClass();
            if (object4 != null) {
                object5 = ((hQ2)object4).c;
            }
            n4 = this.e;
            if (object5 != null) {
                int n8 = ns2.a;
                n4 -= n8;
                n8 = this.f;
                n4 = ((je0_0)object5).a(n4, (bp1_0)((Object)object6), ns2, n8);
            } else {
                n7 = ns2.a;
                n4 -= n7;
                object5 = qz_02.b;
                n4 = object5.a(0, n4, (bp1_0)((Object)object6));
            }
            object6 = this.h;
            object2 = (Object)object6[object2];
            Ns2$a.d((Ns2$a)object, ns2, n4, object2);
            object2 = object3;
        }
        return Unit.a;
    }
}

