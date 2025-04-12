/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iv3
 */
public final class iv3_0
implements hx0_2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;

    public iv3_0(LP1 lP1, float f5, boolean bl2, float f6, long l2, boolean bl3, long l3) {
        this.a = lP1;
        this.b = f5;
        this.c = bl2;
        this.d = f6;
        this.e = l2;
        this.f = bl3;
        this.g = l3;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        boolean bl2;
        object = (KA)object;
        object2 = (WW$b)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        int n3 = ((Number)object4).intValue();
        String string2 = "$this$CoilImage";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "it";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        int bl22 = n3 & 0x281;
        int n4 = 128;
        float f5 = 1.8E-43f;
        if (bl22 == n4 && (bl2 = object3.h())) {
            object3.D();
        } else {
            float f6 = this.b;
            object2 = this.a;
            object = j.h((LP1)object2, f6);
            object3.K(1058546862);
            n3 = (int)(object3.J(object2) ? 1 : 0);
            float f7 = this.d;
            int n7 = object3.b(f7);
            n3 |= n7;
            long l2 = this.e;
            int n8 = object3.d(l2);
            Object object5 = object3.v();
            if ((n3 |= n8) != 0 || object5 == (object4 = b30$a.a)) {
                object5 = new gv3((LP1)object2, f7, l2);
                object3.o(object5);
            }
            object5 = (Function1)object5;
            object3.E();
            boolean bl3 = this.c;
            n3 = 0;
            object4 = null;
            object = x20_0.a((LP1)object, bl3, (Function1)object5, null);
            f5 = uq0_0.c;
            object = h.e((LP1)object, f5);
            object2 = new Object();
            boolean bl4 = this.f;
            object = x20_0.a((LP1)object, bl4, (Function1)object2, null);
            object2 = SP2.a;
            long l3 = this.g;
            object = androidx.compose.foundation.a.b((LP1)object, l3, (i13)object2);
            boolean bl5 = false;
            f5 = 0.0f;
            object2 = null;
            HA.a((LP1)object, (b30_0)object3, 0);
        }
        return Unit.a;
    }
}

