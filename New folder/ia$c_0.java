/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from IA$c
 */
public final class ia$c_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2[] c;
    public final /* synthetic */ List d;
    public final /* synthetic */ dl1_1 e;
    public final /* synthetic */ Ref$IntRef f;
    public final /* synthetic */ Ref$IntRef g;
    public final /* synthetic */ IA h;

    public ia$c_0(Ns2[] ns2Array, List list, dl1_1 dl1_12, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, IA iA) {
        this.c = ns2Array;
        this.d = list;
        this.e = dl1_12;
        this.f = ref$IntRef;
        this.g = ref$IntRef2;
        this.h = iA;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Ns2[] ns2Array = this.c;
        int n3 = ns2Array.length;
        int n4 = 0;
        Object object2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Ns2 ns2 = ns2Array[i3];
            int n7 = n4 + 1;
            Intrinsics.checkNotNull(ns2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            object2 = this.d.get(n4);
            xk1_0 xk1_02 = object2;
            xk1_02 = (xk1_0)object2;
            bp1_0 bp1_02 = this.e.getLayoutDirection();
            int n8 = this.f.element;
            int n10 = this.g.element;
            Nc nc = this.h.a;
            object2 = object;
            HA.b((Ns2$a)object, ns2, xk1_02, bp1_02, n8, n10, nc);
            n4 = n7;
        }
        return Unit.a;
    }
}

