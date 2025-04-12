/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class ii1 {
    public static final /* synthetic */ int a;

    public static final void a(D30 d30, u10 u102, b30_0 object, int n3) {
        MB2[] mB2Array;
        int n4;
        int n7 = 2;
        int n8 = 8;
        object = object.g(-1669497937);
        int n10 = n3 & 6;
        if (n10 == 0) {
            n10 = n3 & 8;
            n10 = n10 == 0 ? (int)(((j30_0)object).J(d30) ? 1 : 0) : (int)(((j30_0)object).x(d30) ? 1 : 0);
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n3;
        } else {
            n10 = n3;
        }
        int n14 = n3 & 0x30;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object).x(u102) ? 1 : 0);
            n14 = n14 != 0 ? 32 : 16;
            n10 |= n14;
        }
        if ((n14 = n10 & 0x13) == (n4 = 18) && (n14 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            ((j30_0)object).r();
            Intrinsics.checkNotNull(d30, "null cannot be cast to non-null type androidx.compose.ui.tooling.CompositionDataRecordImpl");
            Object object2 = d30.a;
            Object object3 = ((j30_0)object).c;
            object2.add(object3);
            object3 = ki1.a;
            Boolean bl2 = Boolean.TRUE;
            object3 = ((vc3_1)object3).c(bl2);
            object2 = li1_0.a.c(object2);
            mB2Array = new MB2[n7];
            bl2 = null;
            mB2Array[0] = object3;
            n4 = 1;
            mB2Array[n4] = object2;
            L30.b(mB2Array, u102, (b30_0)object, n8 |= (n10 &= 0x70));
        }
        object = ((j30_0)object).X();
        if (object != null) {
            mB2Array = new hi1(d30, u102, n3);
            ((CF2)object).d = mB2Array;
        }
    }

    public static void b(StringBuilder stringBuilder, Object object) {
        if (object == null) {
            object = "null";
            stringBuilder.append((String)object);
        } else {
            String string2 = object.getClass().getSimpleName();
            int n3 = string2.length();
            if (n3 <= 0 && (n3 = (string2 = object.getClass().getName()).lastIndexOf(46)) > 0) {
                string2 = string2.substring(++n3);
            }
            stringBuilder.append(string2);
            char c2 = '{';
            stringBuilder.append(c2);
            int n4 = System.identityHashCode(object);
            object = Integer.toHexString(n4);
            stringBuilder.append((String)object);
        }
    }
}

