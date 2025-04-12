/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from yk
 */
public final class yk_1
extends Lambda
implements gx0_2 {
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Hk e;
    public final /* synthetic */ hx0_2 f;

    public yk_1(p83_0 p83_02, Object object, Hk hk, u10 u102) {
        this.c = p83_02;
        this.d = object;
        this.e = hk;
        this.f = u102;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (kl_0)object;
        object2 = (b30_0)object2;
        int n3 = ((Number)(object3 = (Number)object3)).intValue();
        int n4 = n3 & 6;
        if (n4 == 0) {
            n4 = n3 & 8;
            n4 = n4 == 0 ? (int)(object2.J(object) ? 1 : 0) : (int)(object2.x(object) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n3 |= n4;
        }
        if ((n3 &= 0x13) == (n4 = 18) && (n3 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object3 = this.c;
            n4 = (int)(object2.J(object3) ? 1 : 0);
            Object object4 = this.d;
            int n7 = object2.x(object4);
            n4 |= n7;
            Hk hk = this.e;
            int n8 = object2.x(hk);
            Object object5 = object2.v();
            b30$a$a b30$a$a = b30$a.a;
            if ((n4 |= n8) != 0 || object5 == b30$a$a) {
                object5 = new xk_1((p83_0)object3, object4, hk);
                object2.o(object5);
            }
            object5 = (Function1)object5;
            ly0_0.b(object, (Function1)object5, (b30_0)object2);
            object3 = hk.d;
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            Object object6 = object;
            object6 = ((ll_2)object).a;
            ((nr1_1)object3).i(object4, object6);
            object3 = object2.v();
            if (object3 == b30$a$a) {
                object3 = new fk_1((kl_0)object);
                object2.o(object3);
            }
            object3 = (fk_1)object3;
            object = 0;
            object6 = this.f;
            object6.invoke(object3, object4, object2, object);
        }
        return Unit.a;
    }
}

