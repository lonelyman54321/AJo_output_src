/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Fg3
 */
public final class fg3_2
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ i13 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ nz g;
    public final /* synthetic */ float h;
    public final /* synthetic */ Function2 i;

    public fg3_2(LP1 lP1, i13 i132, long l2, float f5, nz nz4, float f6, u10 u102) {
        this.c = lP1;
        this.d = i132;
        this.e = l2;
        this.f = f5;
        this.g = nz4;
        this.h = f6;
        this.i = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                int n3;
                block6: {
                    object = (b30_0)object;
                    int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
                    if (n4 != (n3 = 2) || (n4 = (int)(object.h() ? 1 : 0)) == 0) break block6;
                    object.D();
                    break block7;
                }
                object2 = ty0_0.a;
                object2 = (sy0_1)object.j((H30)object2);
                long l2 = this.e;
                float f5 = this.f;
                long l3 = jg3_0.d(l2, (sy0_1)object2, f5, (b30_0)object);
                nz nz4 = this.g;
                float f6 = this.h;
                Object object3 = this.c;
                Object object4 = this.d;
                object2 = jg3_0.c((LP1)object3, (i13)object4, l3, nz4, f6);
                Object object5 = dg3_1.c;
                object2 = CY2.b((LP1)object2, false, (Function1)object5);
                object5 = Unit.a;
                boolean bl2 = false;
                object3 = null;
                Object object6 = new qg3_2(n3, null);
                Object object7 = tg3_0.a;
                int n7 = 6;
                object7 = new SuspendPointerInputElement(object5, null, (Function2)object6, n7);
                object2 = object2.then((LP1)object7);
                object7 = HA.e(Nc$a.a, true);
                int n8 = object.F();
                object6 = object.m();
                object2 = a30_0.c((b30_0)object, (LP1)object2);
                N20.W.getClass();
                object4 = N20$a.b;
                mp mp2 = object.i();
                boolean bl3 = mp2 instanceof mp;
                if (!bl3) break block8;
                object.A();
                bl2 = object.e();
                if (bl2) {
                    object.C((Function0)object4);
                } else {
                    object.n();
                }
                object3 = N20$a.e;
                Ow3.a((b30_0)object, object7, (Function2)object3);
                object7 = N20$a.d;
                Ow3.a((b30_0)object, object6, (Function2)object7);
                object7 = N20$a.f;
                boolean bl4 = object.e();
                if (bl4 || !(bl4 = Intrinsics.areEqual(object6 = object.v(), object3 = Integer.valueOf(n8)))) {
                    re0_0.a(n8, (b30_0)object, n8, (N20$a$a)object7);
                }
                object7 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object7);
                object2 = 0;
                object7 = this.i;
                object7.invoke(object, object2);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

