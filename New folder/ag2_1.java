/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.dresstool.Question;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ag2
 */
public final class ag2_1 {
    public static final void a(Question question, gv0_1 gv0_12, b30_0 b30_02, int n3) {
        Question question2 = question;
        gv0_1 gv0_13 = gv0_12;
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(gv0_12, "onItemClick");
        int bl2 = 1106204569;
        float f5 = 29.917772f;
        Object object = b30_02;
        Object object2 = b30_02.g(bl2);
        Object object3 = LP1$a.b;
        object = zp.c;
        Object object4 = Nc$a.m;
        object = oZ.a((zp$l)object, (Gx$a)object4, (b30_0)object2, 0);
        int n4 = ((j30_0)object2).P;
        Object object5 = ((j30_0)object2).P();
        Object object6 = a30_0.c((b30_0)object2, (LP1)object3);
        N20.W.getClass();
        Object object7 = N20$a.b;
        Object object8 = ((j30_0)object2).a;
        int n7 = object8 instanceof mp;
        if (n7 != 0) {
            Object object9;
            ((j30_0)object2).A();
            n7 = ((j30_0)object2).O;
            if (n7 != 0) {
                ((j30_0)object2).C((Function0)object7);
            } else {
                ((j30_0)object2).n();
            }
            object7 = N20$a.e;
            Ow3.a((b30_0)object2, object, (Function2)object7);
            object = N20$a.d;
            Ow3.a((b30_0)object2, object5, (Function2)object);
            object = N20$a.f;
            boolean bl3 = ((j30_0)object2).O;
            if (bl3 || !(bl3 = Intrinsics.areEqual(object5 = ((j30_0)object2).v(), object7 = Integer.valueOf(n4)))) {
                rk_0.a(n4, (j30_0)object2, n4, (N20$a$a)object);
            }
            object = N20$a.c;
            Ow3.a((b30_0)object2, object6, (Function2)object);
            object = question.getTitle();
            object4 = "";
            object7 = object == null ? object4 : object;
            float f6 = 1.0f;
            object8 = j.c((LP1)object3, f6);
            float f7 = uq0_0.o;
            float f8 = 0.0f;
            Object object10 = null;
            float f11 = f7;
            object8 = h.i((LP1)object8, f7, 0.0f, f7, 0.0f, 10);
            object6 = y20_0.a;
            tv0_0 tv0_02 = tv0_0.h;
            long l2 = oj3_2.d;
            int n8 = 1772592;
            long l3 = 0L;
            j30_0 j30_02 = null;
            long l4 = 0L;
            int n10 = 0;
            long l7 = 0L;
            int n14 = 130964;
            Object object11 = object6;
            Ll3.b((String)object7, (LP1)object8, l3, l2, null, tv0_02, (RU0)object6, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object2, n8, 0, n14);
            object7 = question.getSub_title();
            if (object7 == null) {
                object7 = object4;
            }
            Object object12 = j.c((LP1)object3, f6);
            float f12 = uq0_0.g;
            int n15 = 8;
            f8 = f7;
            object8 = h.i((LP1)object12, f7, f12, f7, 0.0f, n15);
            tv0_02 = tv0_0.e;
            l2 = oj3_2.c;
            n8 = 1772592;
            l3 = 0L;
            j30_02 = null;
            l4 = 0L;
            n10 = 0;
            l7 = 0L;
            n14 = 130964;
            object11 = object6;
            Ll3.b((String)object7, (LP1)object8, l3, l2, null, tv0_02, (RU0)object6, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object2, n8, 0, n14);
            int n16 = -1326042851;
            float f14 = -1.7912815E-9f;
            ((j30_0)object2).K(n16);
            object6 = ((j30_0)object2).v();
            object7 = b30$a.a;
            if (object6 == object7) {
                long l8 = zx_0.d(0x80C0C0C0L);
                object6 = new OX(l8);
                ((j30_0)object2).o(object6);
            }
            l2 = ((OX)object6).a;
            n16 = -1326040465;
            f14 = -1.7915464E-9f;
            object6 = wg2_2.a((j30_0)object2, false, n16);
            if (object6 == object7) {
                f14 = uq0_0.e;
                object6 = SP2.a(f14);
                ((j30_0)object2).o(object6);
            }
            object6 = (rp2_0)object6;
            n7 = -1326038092;
            float f15 = -1.7918098E-9f;
            object8 = wg2_2.a((j30_0)object2, false, n7);
            if (object8 == object7) {
                f15 = uq0_0.I;
                object8 = QV.a(j.k((LP1)object3, f15), (i13)object6);
                l3 = OX.f;
                object8 = a.b((LP1)object8, l3, (i13)object6);
                f11 = uq0_0.c;
                long l12 = OX.k;
                int n17 = 4;
                object10 = object6;
                l4 = l2;
                l2 = l12;
                l12 = l4;
                object8 = c13_0.c((LP1)object8, f11, (i13)object6, l2, l4, n17);
                ((j30_0)object2).o(object8);
            }
            object8 = (LP1)object8;
            int n18 = -1326025897;
            f11 = -1.7931637E-9f;
            object12 = wg2_2.a((j30_0)object2, false, n18);
            if (object12 == object7) {
                f11 = uq0_0.h;
                object12 = h.e((LP1)object3, f11);
                f8 = uq0_0.G;
                object12 = QV.a(j.h((LP1)object12, f8), (i13)object6);
                ((j30_0)object2).o(object12);
            }
            object11 = object12;
            object11 = (LP1)object12;
            n18 = -1326020514;
            f11 = -1.7937614E-9f;
            object12 = wg2_2.a((j30_0)object2, false, n18);
            if (object12 == object7) {
                object7 = j.c((LP1)object3, f6);
                f11 = uq0_0.c;
                f8 = uq0_0.h;
                object12 = h.h((LP1)object7, f12, f11, f12, f8);
                ((j30_0)object2).o(object12);
            }
            object7 = object12;
            object7 = (LP1)object12;
            ((j30_0)object2).T(false);
            object12 = h.i(j.c((LP1)object3, f6), 0.0f, f7, 0.0f, 0.0f, 13);
            zp$i zp$i = zp.g(uq0_0.j);
            f5 = 0.0f;
            object10 = new nk2_0(f7, f5, f7, f5);
            object3 = object9;
            object = gv0_12;
            object4 = object8;
            object5 = object7;
            j30_02 = object2;
            object2 = question;
            object9 = new ug2_2(gv0_12, (LP1)object8, (LP1)object11, (LP1)object7, (rp2_0)object6, question);
            n15 = 0;
            tv0_02 = null;
            n7 = 0;
            f15 = 0.0f;
            object8 = null;
            f6 = 0.0f;
            int n19 = 24966;
            n10 = 234;
            object7 = object12;
            object12 = object10;
            object10 = null;
            f8 = 0.0f;
            object = j30_02;
            j30_02 = null;
            object11 = object9;
            object9 = object;
            xq1_0.b((LP1)object7, null, (mk2_0)object12, false, zp$i, null, null, false, (Function1)object3, (b30_0)object, n19, n10);
            boolean bl4 = true;
            f5 = Float.MIN_VALUE;
            ((j30_0)object).T(bl4);
            object3 = ((j30_0)object).X();
            if (object3 != null) {
                n4 = n3;
                ((CF2)object3).d = object = new vg2_2(question2, gv0_13, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

