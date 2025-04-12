/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ed3
 */
public final class ed3_0 {
    public static final void a(String string2, b30_0 object, int n3) {
        Object object2 = "name";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object = object.g(-1964262433);
        int n4 = n3 & 0xE;
        int n7 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).J(string2) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n8 = n4 & 0xB;
        if (n8 == n7 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            LP1$a lP1$a = LP1$a.b;
            float f5 = uq0_0.h;
            int n10 = 13;
            LP1 lP1 = h.i(lP1$a, 0.0f, f5, 0.0f, 0.0f, n10);
            long l2 = xx_1.j;
            long l3 = oj3_2.c;
            n4 = n4 << 6 & 0x380;
            int n14 = n4 | 0x6C06;
            n8 = 0;
            lP1$a = null;
            int n15 = 98;
            ov3.c(lP1, null, string2, l3, l2, 0, null, (b30_0)object, n14, n15);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new dd3_0(string2, n3);
        }
    }
}

