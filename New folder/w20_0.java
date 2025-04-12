/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from w20
 */
public final class w20_0
implements gx0_2 {
    public final /* synthetic */ float a;
    public final /* synthetic */ wh3_2 b;

    public w20_0(float f5, wh3_2 wh3_22) {
        this.a = f5;
        this.b = wh3_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (LP1)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(object, "$this$composed");
        object2.K(-1898074397);
        object3 = ex0_0.a;
        int n3 = 250;
        int n4 = 2;
        Qs3 qs3 = Hl.c(n3, 0, (cx0_0)object3, n4);
        ib3_0 ib3_02 = jk_1.a(this.a, qs3, "", (b30_0)object2, 384, 8);
        Object object4 = this.b;
        float f5 = ((wh3_2)object4).a;
        float f6 = ((wh3_2)object4).b + f5 + f5;
        f5 = this.a;
        f6 -= f5;
        f5 = n4;
        qs3 = Hl.c(n3, 0, (cx0_0)object3, n4);
        object3 = jk_1.a(f6 /= f5, qs3, "", (b30_0)object2, 384, 8);
        object = j.c((LP1)object, 1.0f);
        object4 = Nc$a.g;
        object = j.n((LP1)object, (Gx)object4, n4);
        float f7 = ((xs0_0)object3.getValue()).a;
        object = g.d((LP1)object, f7, 0.0f, n4);
        f7 = ((xs0_0)ib3_02.getValue()).a;
        object = j.k((LP1)object, f7);
        object2.E();
        return object;
    }
}

