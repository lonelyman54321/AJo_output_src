/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from jQ2
 */
public final class jq2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2[] c;
    public final /* synthetic */ kQ2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int[] g;

    public jq2_0(Ns2[] ns2Array, kQ2 kQ22, int n3, int n4, int[] nArray) {
        this.c = ns2Array;
        this.d = kQ22;
        this.e = n3;
        this.f = n4;
        this.g = nArray;
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
            int n7 = object4 instanceof hQ2;
            int n8 = 0;
            je0_0 je0_02 = null;
            if (n7 != 0) {
                object4 = (hQ2)object4;
            } else {
                n4 = 0;
                object4 = null;
            }
            Object object5 = this.d;
            object5.getClass();
            if (object4 != null) {
                je0_02 = ((hQ2)object4).c;
            }
            n4 = this.e;
            if (je0_02 != null) {
                n7 = ns2.b;
                n4 -= n7;
                object5 = bp1_0.Ltr;
                int n10 = this.f;
                n4 = je0_02.a(n4, (bp1_0)((Object)object5), ns2, n10);
            } else {
                n8 = ns2.b;
                n4 -= n8;
                object5 = object5.b;
                n4 = object5.a(0, n4);
            }
            object5 = this.g;
            object2 = object5[object2];
            Ns2$a.d((Ns2$a)object, ns2, object2, n4);
            object2 = object3;
        }
        return Unit.a;
    }
}

