/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.ICoupon;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

public final class Jb0$e
extends Lambda
implements hx0_2 {
    public final /* synthetic */ List c;
    public final /* synthetic */ ob0_1 d;
    public final /* synthetic */ i90_0 e;

    public Jb0$e(List list, ob0_1 ob0_12, c80 c802) {
        this.c = list;
        this.d = ob0_12;
        this.e = c802;
        super(4);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        int n3;
        object = (wr1_2)object;
        object2 = (Number)object2;
        int n4 = ((Number)object2).intValue();
        object3 = (b30_0)object3;
        int n7 = ((Number)(object4 = (Number)object4)).intValue();
        int n8 = n7 & 6;
        if (n8 == 0) {
            n3 = (int)(object3.J(object) ? 1 : 0);
            n3 = n3 != 0 ? 4 : 2;
            n3 |= n7;
        } else {
            n3 = n7;
        }
        if ((n7 &= 0x30) == 0) {
            n7 = (int)(object3.c(n4) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n3 |= n7;
        }
        if ((n3 &= 0x93) == (n7 = 146) && (n3 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = (ICoupon)this.c.get(n4);
            n4 = 1266980934;
            object3.K(n4);
            object4 = this.e;
            ob0_1 ob0_12 = this.d;
            object2 = new Jb0$b((i90_0)object4, ob0_12, (ICoupon)object);
            n7 = 72;
            Jb0.b(ob0_12, (ICoupon)object, (Jb0$b)object2, (b30_0)object3, n7);
            object3.E();
        }
        return Unit.a;
    }
}

