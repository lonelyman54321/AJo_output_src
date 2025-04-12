/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ga0
 */
public final class ga0_0 {
    public static final void a(boolean bl2, String string2, Function0 function0, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(string2, "buttonText");
        Object object2 = "onButtonClicked";
        Intrinsics.checkNotNullParameter(function0, (String)object2);
        object = object.g(876574688);
        int n4 = n3 & 0xE;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).a(bl2) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = n3 & 0x70;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(string2) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n7 = n3 & 0x380) == 0) {
            n7 = (int)(((j30_0)object).x(function0) ? 1 : 0);
            n7 = n7 != 0 ? 256 : 128;
            n4 |= n7;
        }
        n7 = n4 & 0x2DB;
        int n8 = 146;
        float f5 = 2.05E-43f;
        if (n7 == n8 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            LP1 lP1 = LP1$a.b;
            f5 = 12;
            lP1 = h.e(lP1, f5);
            LP1 lP12 = j.c(lP1, 1.0f);
            n7 = n4 & 0xE | 0x180;
            n8 = n4 & 0x70;
            n7 |= n8;
            n4 <<= 6;
            n8 = 57344;
            f5 = 8.0356E-41f;
            int n10 = n7 | (n4 &= n8);
            long l2 = 0L;
            int n14 = 40;
            n7 = (int)(bl2 ? 1 : 0);
            pe_1.a(bl2, string2, lP12, null, function0, l2, (b30_0)object, n10, n14);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new fa0_1(bl2, string2, function0, n3);
        }
    }
}

