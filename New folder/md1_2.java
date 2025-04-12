/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from md1
 */
public final class md1_2 {
    public static final void a(ke1_2 ke1_22, LP1 lP1, he1_2 he1_22, Throwable throwable, b30_0 object, int n3) {
        LP1 lP12;
        Object object2;
        Intrinsics.checkNotNullParameter(ke1_22, "<this>");
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Object object3 = "imageOptions";
        Intrinsics.checkNotNullParameter(he1_22, (String)object3);
        object = object.g(334390494);
        int n4 = n3 & 6;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).J(ke1_22) ? 1 : 0);
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
            n7 = (int)(((j30_0)object).J(he1_22) ? 1 : 0);
            n7 = n7 != 0 ? 256 : 128;
            n4 |= n7;
        }
        if ((n7 = n3 & 0xC00) == 0) {
            n7 = (int)(((j30_0)object).x(throwable) ? 1 : 0);
            n7 = n7 != 0 ? 2048 : 1024;
            n4 |= n7;
        }
        if ((n4 &= 0x493) == (n7 = 1170) && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            boolean bl2;
            n4 = ke1_22 instanceof ke1_2;
            object3 = n4 != 0 ? ke1_22.a : mz0_2.a;
            object3 = (Iterable)object3;
            object2 = new ArrayList();
            object3 = object3.iterator();
            while (bl2 = object3.hasNext()) {
                lP12 = object3.next();
                boolean bl3 = lP12 instanceof je1$a;
                if (!bl3) continue;
                ((ArrayList)object2).add(lP12);
            }
            object3 = ((ArrayList)object2).iterator();
            while ((n7 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object2 = (je1$a)object3.next();
                object2.a();
            }
        }
        object = ((j30_0)object).X();
        if (object != null) {
            jd1_2 jd1_22;
            object3 = jd1_22;
            object2 = ke1_22;
            lP12 = lP1;
            jd1_22 = new jd1_2(ke1_22, lP1, he1_22, throwable, n3);
            ((CF2)object).d = jd1_22;
        }
    }

    public static final void b(ke1_2 ke1_22, LP1 lP1, he1_2 he1_22, u10 u102, b30_0 object, int n3) {
        LP1 lP12;
        Object object2;
        Intrinsics.checkNotNullParameter(ke1_22, "<this>");
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Intrinsics.checkNotNullParameter(he1_22, "imageOptions");
        Object object3 = "executor";
        Intrinsics.checkNotNullParameter(u102, (String)object3);
        object = object.g(-1603288356);
        int n4 = n3 & 6;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).J(ke1_22) ? 1 : 0);
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
            n7 = (int)(((j30_0)object).J(he1_22) ? 1 : 0);
            n7 = n7 != 0 ? 256 : 128;
            n4 |= n7;
        }
        if ((n7 = n3 & 0xC00) == 0) {
            n7 = (int)(((j30_0)object).x(u102) ? 1 : 0);
            n7 = n7 != 0 ? 2048 : 1024;
            n4 |= n7;
        }
        if ((n4 &= 0x493) == (n7 = 1170) && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            boolean bl2;
            n4 = ke1_22 instanceof ke1_2;
            object3 = n4 != 0 ? ke1_22.a : mz0_2.a;
            object3 = (Iterable)object3;
            object2 = new ArrayList();
            object3 = object3.iterator();
            while (bl2 = object3.hasNext()) {
                lP12 = object3.next();
                boolean bl3 = lP12 instanceof je1$b;
                if (!bl3) continue;
                ((ArrayList)object2).add(lP12);
            }
            object3 = ((ArrayList)object2).iterator();
            while ((n7 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object2 = (je1$b)object3.next();
                object2.c();
            }
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ld1_2 ld1_22;
            object3 = ld1_22;
            object2 = ke1_22;
            lP12 = lP1;
            ld1_22 = new ld1_2(ke1_22, lP1, he1_22, u102, n3);
            ((CF2)object).d = ld1_22;
        }
    }

    public static final void c(ke1_2 ke1_22, LP1 lP1, Object object, he1_2 he1_22, ih_0 ih_02, b30_0 object2, int n3) {
        LP1 lP12;
        Object object3;
        Intrinsics.checkNotNullParameter(ke1_22, "<this>");
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Object object4 = "imageOptions";
        Intrinsics.checkNotNullParameter(he1_22, (String)object4);
        object2 = object2.g(0x7717A7A1);
        int n4 = n3 & 6;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object2).J(ke1_22) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = n3 & 0x30;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object2).J(lP1) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n7 = n3 & 0x180) == 0) {
            n7 = (int)(((j30_0)object2).x(object) ? 1 : 0);
            n7 = n7 != 0 ? 256 : 128;
            n4 |= n7;
        }
        if ((n7 = n3 & 0xC00) == 0) {
            n7 = (int)(((j30_0)object2).J(he1_22) ? 1 : 0);
            n7 = n7 != 0 ? 2048 : 1024;
            n4 |= n7;
        }
        if ((n7 = n3 & 0x6000) == 0) {
            n7 = (int)(((j30_0)object2).x(ih_02) ? 1 : 0);
            n7 = n7 != 0 ? 16384 : 8192;
            n4 |= n7;
        }
        if ((n4 &= 0x2493) == (n7 = 9362) && (n4 = (int)(((j30_0)object2).h() ? 1 : 0)) != 0) {
            ((j30_0)object2).D();
        } else {
            boolean bl2;
            n4 = ke1_22 instanceof ke1_2;
            object4 = n4 != 0 ? ke1_22.a : mz0_2.a;
            object4 = (Iterable)object4;
            object3 = new ArrayList();
            object4 = object4.iterator();
            while (bl2 = object4.hasNext()) {
                lP12 = object4.next();
                boolean bl3 = lP12 instanceof je1$d;
                if (!bl3) continue;
                ((ArrayList)object3).add(lP12);
            }
            object4 = ((ArrayList)object3).iterator();
            while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object3 = (je1$d)object4.next();
                object3.b();
            }
        }
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            kd1_2 kd1_22;
            object4 = kd1_22;
            object3 = ke1_22;
            lP12 = lP1;
            kd1_22 = new kd1_2(ke1_22, lP1, object, he1_22, ih_02, n3);
            ((CF2)object2).d = kd1_22;
        }
    }
}

