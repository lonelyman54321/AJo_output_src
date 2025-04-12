/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import com.ril.ajio.bonanza.model.ICoupon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gb0
 */
public final class gb0_2
implements gx0_2 {
    public final /* synthetic */ ICoupon a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;

    public gb0_2(ICoupon iCoupon, Jb0$b jb0$b, boolean bl2) {
        this.a = iCoupon;
        this.b = jb0$b;
        this.c = bl2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        gb0_2 gb0_22 = this;
        Object object4 = object;
        object4 = (PA)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            float f5;
            long l2;
            b30$a$a b30$a$a;
            object6 = gb0_22.a.getSerialNumberId();
            Intrinsics.checkNotNull(object6);
            n4 = 10;
            long l3 = Em3.f(n4);
            object4 = tv0_0.n;
            object7 = LP1$a.b;
            float f6 = 12;
            float f7 = 4;
            object7 = h.h((LP1)object7, f6, f7, f7, f7);
            int n7 = 1492975081;
            f6 = 2.2253397E15f;
            object5.K(n7);
            Function0 function0 = gb0_22.b;
            int n8 = object5.J(function0);
            Object object8 = object5.v();
            if (n8 != 0 || object8 == (b30$a$a = b30$a.a)) {
                function0 = (Jb0$b)function0;
                n8 = 0;
                f7 = 0.0f;
                b30$a$a = null;
                object8 = new fb0_1(function0, 0);
                object5.o(object8);
            }
            object8 = (Function0)object8;
            object5.E();
            f6 = 0.0f;
            function0 = null;
            n8 = 7;
            f7 = 9.8E-45f;
            object7 = d.b((LP1)object7, false, null, (Function0)object8, n8);
            n7 = (int)(gb0_22.c ? 1 : 0);
            if (n7 != 0) {
                l2 = xx_1.e;
                f5 = 0.5f;
                l2 = OX.b(l2, f5);
            } else {
                l2 = xx_1.e;
            }
            int n10 = 3120;
            int n14 = 120784;
            f5 = 0.0f;
            object8 = null;
            long l4 = 0L;
            long l7 = 0L;
            int n15 = 2;
            int n16 = 1;
            int n17 = 199680;
            Object object9 = object5;
            object5 = object4;
            Ll3.b((String)object6, (LP1)object7, l2, l3, null, (tv0_0)object4, null, l4, null, null, l7, n15, false, n16, 0, null, null, (b30_0)object9, n17, n10, n14);
        }
        return Unit.a;
    }
}

