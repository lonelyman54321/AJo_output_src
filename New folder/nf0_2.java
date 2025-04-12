/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Nf0
 */
public final class nf0_2
implements Function2 {
    public final /* synthetic */ float a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ gx0_2 e;

    public nf0_2(float f5, u10 u102, Function2 function2, int n3, gx0_2 gx0_22) {
        this.a = f5;
        this.b = u102;
        this.c = function2;
        this.d = n3;
        this.e = gx0_22;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            Object object3;
            object2 = NT2.b((b30_0)object);
            Object object4 = object.v();
            if (object4 == (object3 = b30$a.a)) {
                object4 = ly0_0.f(f.a, (b30_0)object);
                Q30 q30 = new Q30((c80)object4);
                object.o(q30);
                object4 = q30;
            }
            object4 = ((Q30)object4).a;
            object.K(2142211592);
            boolean bl2 = object.J(object2);
            boolean bl3 = object.J(object4);
            Object object5 = object.v();
            if ((bl2 |= bl3) || object5 == object3) {
                object4 = (c80)object4;
                object5 = new gu2_2((st2_2)object2, (c80)object4);
                object.o(object5);
            }
            Object object6 = object5;
            object6 = (gu2_2)object5;
            object.E();
            object4 = LP1$a.b;
            float f5 = 1.0f;
            object4 = j.c((LP1)object4, f5);
            object3 = Nc$a.d;
            object2 = NT2.a(j.n((LP1)object4, (Gx)object3, n3), (st2_2)object2);
            fx0_2 fx0_22 = jx2_0.c;
            object4 = null;
            object2 = QV.b(CY2.b((LP1)object2, false, fx0_22));
            Function2 function2 = this.c;
            Object object7 = object3 = this.b;
            object7 = (u10)object3;
            float f6 = this.a;
            int n7 = this.d;
            gx0_2 gx0_22 = this.e;
            fx0_22 = new kf0_2(f6, (u10)object7, function2, (gu2_2)object6, n7, gx0_22);
            tf3.a((LP1)object2, (Function2)fx0_22, (b30_0)object, 0, 0);
        }
        return Unit.a;
    }
}

