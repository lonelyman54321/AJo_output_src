/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.e;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ds1
 */
public final class ds1_0 {
    public static final void a(hn1_2 hn1_22, LP1 lP1, xs1 xs12, Function2 function2, b30_0 object, int n3) {
        fx0_2 fx0_22;
        Object object2;
        object = object.g(2002163445);
        int n4 = n3 & 6;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(hn1_22) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = n3 & 0x30;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n7 = n3 & 0x180) == 0) {
            n7 = (int)(((j30_0)object).J(xs12) ? 1 : 0);
            n7 = n7 != 0 ? 256 : 128;
            n4 |= n7;
        }
        if ((n7 = n3 & 0xC00) == 0) {
            n7 = (int)(((j30_0)object).x(function2) ? 1 : 0);
            n7 = n7 != 0 ? 2048 : 1024;
            n4 |= n7;
        }
        if ((n4 &= 0x493) == (n7 = 1170) && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            object2 = J83.j(hn1_22, (b30_0)object);
            fx0_22 = new e(xs12, lP1, function2, (tr1_0)object2);
            n4 = -1488997347;
            object2 = v10.c(n4, fx0_22, (b30_0)object);
            n7 = 6;
            At1.a((u10)object2, (b30_0)object, n7);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            cs1_2 cs1_22;
            object2 = cs1_22;
            fx0_22 = hn1_22;
            cs1_22 = new cs1_2(hn1_22, lP1, xs12, function2, n3);
            ((CF2)object).d = cs1_22;
        }
    }
}

