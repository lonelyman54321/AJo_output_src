/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from kk2
 */
public final class kk2_2 {
    public static final void a(la2_0 la2_02, String string2, fe2_1 fe2_12, long l2, b30_0 object, int n3) {
        int n4;
        Object object2;
        Object object3;
        float f5;
        Intrinsics.checkNotNullParameter(la2_02, "orderCommunicationPacketConfig");
        Intrinsics.checkNotNullParameter(string2, "packetCode");
        Object object4 = "onHowToFindCodeClicked";
        Intrinsics.checkNotNullParameter(fe2_12, (String)object4);
        object = object.g(-1340834426);
        int n7 = n3 & 0xE;
        int n8 = 4;
        float f6 = 5.6E-45f;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(la2_02) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n10 = n3 & 0x70;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).J(string2) ? 1 : 0);
            if (n10 != 0) {
                n10 = 32;
                f5 = 4.5E-44f;
            } else {
                n10 = 16;
                f5 = 2.2E-44f;
            }
            n7 |= n10;
        }
        if ((n10 = n3 & 0x380) == 0) {
            n10 = (int)(((j30_0)object).x(fe2_12) ? 1 : 0);
            if (n10 != 0) {
                n10 = 256;
                f5 = 3.59E-43f;
            } else {
                n10 = 128;
                f5 = 1.8E-43f;
            }
            n7 |= n10;
        }
        if ((n10 = n3 & 0x1C00) == 0) {
            n10 = (int)(((j30_0)object).d(l2) ? 1 : 0);
            if (n10 != 0) {
                n10 = 2048;
                f5 = 2.87E-42f;
            } else {
                n10 = 1024;
                f5 = 1.435E-42f;
            }
            n7 |= n10;
        }
        n10 = 1170;
        f5 = 1.64E-42f;
        if ((n7 &= 0x16DB) == n10 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            object4 = j.c(LP1$a.b, 1.0f);
            double d2 = 0.5;
            f5 = (float)d2;
            f6 = n8;
            object3 = SP2.a(f6);
            object4 = gz.a((LP1)object4, f5, l2, (i13)object3);
            long l3 = OX.f;
            object2 = fg2_1.a;
            object3 = a.b((LP1)object4, l3, (i13)object2);
            object4 = new jk2_2(la2_02, fe2_12, string2);
            u10 u102 = v10.c(207884656, (fx0_2)object4, (b30_0)object);
            n10 = 0;
            f5 = 0.0f;
            object2 = null;
            n4 = 3072;
            int n14 = 6;
            OA.a((LP1)object3, null, false, u102, (b30_0)object, n4, n14);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            fk2_2 fk2_22;
            object4 = fk2_22;
            object3 = la2_02;
            object2 = fe2_12;
            n4 = n3;
            fk2_22 = new fk2_2(la2_02, string2, fe2_12, l2, n3);
            ((CF2)object).d = fk2_22;
        }
    }

    public static final Sl b(String object) {
        Object object2 = object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object3 = new String[]{"<b>", "</b>"};
        boolean bl2 = false;
        int n3 = 6;
        object2 = StringsKt.a0((CharSequence)object, (String[])object3, false, 0, n3);
        object3 = new Sl$a();
        object2 = object2.iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            String string2 = (String)object2.next();
            if (bl2) {
                tv0_0 tv0_02;
                tv0_0 tv0_03 = tv0_0.o;
                long l2 = 0L;
                long l3 = 0L;
                long l4 = 0L;
                long l7 = 0L;
                char c2 = (char)-5;
                S93 s93 = tv0_02;
                object = object2;
                object2 = tv0_02;
                tv0_02 = tv0_03;
                s93(l2, l3, tv0_03, null, null, null, null, l4, null, null, null, l7, null, null, c2);
                int n4 = ((Sl$a)object3).g(s93);
                try {
                    ((Sl$a)object3).c(string2);
                    object2 = Unit.a;
                }
                finally {
                    ((Sl$a)object3).e(n4);
                }
            } else {
                object = object2;
                ((Sl$a)object3).c(string2);
            }
            bl2 ^= true;
            object2 = object;
        }
        return ((Sl$a)object3).h();
    }
}

