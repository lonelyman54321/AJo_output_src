/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Wp0$b
extends Lambda
implements Function2 {
    public final /* synthetic */ d c;
    public final /* synthetic */ fq0_0 d;
    public final /* synthetic */ bs2_1 e;
    public final /* synthetic */ p83_0 f;
    public final /* synthetic */ fq0$a_0 g;

    public Wp0$b(d d2, fq0_0 fq0_02, cs2_1 cs2_12, p83_0 p83_02, fq0$a_0 fq0$a_0) {
        this.c = d2;
        this.d = fq0_02;
        this.e = cs2_12;
        this.f = p83_02;
        this.g = fq0$a_0;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            Object object3;
            object2 = this.c;
            n3 = (int)(object.x(object2) ? 1 : 0);
            Object object4 = this.d;
            int n7 = object.J(object4);
            Object object5 = object.v();
            if ((n3 |= n7) != 0 || object5 == (object3 = b30$a.a)) {
                object3 = this.f;
                object5 = new Yp0((fq0_0)object4, (p83_0)object3, (d)object2);
                object.o(object5);
            }
            object5 = (Function1)object5;
            ly0_0.b(object2, (Function1)object5, (b30_0)object);
            object4 = this.g;
            object3 = new Zp0((fq0$a_0)object4, (d)object2);
            object3 = v10.c(-497631156, (fx0_2)object3, (b30_0)object);
            int n8 = 384;
            object5 = this.e;
            US1.a((d)object2, (bs2_1)object5, (u10)object3, (b30_0)object, n8);
        }
        return Unit.a;
    }
}

