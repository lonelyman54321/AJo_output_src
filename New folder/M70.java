/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;

public final class M70 {
    public final p83_0 a;

    public M70() {
        p83_0 p83_02;
        this.a = p83_02 = new p83_0();
    }

    public static void b(M70 m70, a80 function2, boolean bl2, Function0 function0) {
        LP1$a lP1$a = LP1$a.b;
        m70.getClass();
        n70_0 n70_02 = new n70_0((a80)function2, bl2, lP1$a, null, function0);
        function2 = new u10(262103052, n70_02, true);
        m70.a.add(function2);
    }

    public final void a(E70 e70, b30_0 object, int n3) {
        int n4;
        object = object.g(1320309496);
        int n7 = n3 & 6;
        if (n7 == 0) {
            n7 = ((j30_0)object).J(e70) ? 1 : 0;
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n8 = n3 & 0x30;
        if (n8 == 0) {
            n8 = ((j30_0)object).J(this) ? 1 : 0;
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n7 & 0x13) == (n4 = 18) && (n8 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            p83_0 p83_02 = this.a;
            n4 = p83_02.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                gx0_2 gx0_22 = (gx0_2)p83_02.get(i3);
                int n10 = n7 & 0xE;
                Integer n14 = n10;
                gx0_22.invoke(e70, object, n14);
            }
        }
        object = ((j30_0)object).X();
        if (object != null) {
            M70$a m70$a = new M70$a(this, e70, n3);
            ((CF2)object).d = m70$a;
        }
    }
}

