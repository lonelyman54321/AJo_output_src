/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.services.data.dresstool.Question;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cv
 */
public final class cv_1 {
    public static final void a(Question question, u2_0 u2_02, b30_0 b30_02, int n3) {
        Question question2 = question;
        u2_0 u2_03 = u2_02;
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(u2_02, "onNextClick");
        int bl2 = 1963649366;
        Object object = b30_02;
        j30_0 j30_02 = b30_02.g(bl2);
        Object object2 = LP1$a.b;
        object = zp.c;
        Object object3 = Nc$a.m;
        fG2$a fG2$a = null;
        object = oZ.a((zp$l)object, (Gx$a)object3, j30_02, 0);
        int n4 = j30_02.P;
        Object object4 = j30_02.P();
        Object object5 = a30_0.c(j30_02, (LP1)object2);
        N20.W.getClass();
        Object object6 = N20$a.b;
        Object object7 = j30_02.a;
        boolean bl3 = object7 instanceof mp;
        if (bl3) {
            j30_02.A();
            bl3 = j30_02.O;
            if (bl3) {
                j30_02.C((Function0)object6);
            } else {
                j30_02.n();
            }
            object6 = N20$a.e;
            Ow3.a(j30_02, object, (Function2)object6);
            object = N20$a.d;
            Ow3.a(j30_02, object4, (Function2)object);
            object = N20$a.f;
            boolean bl4 = j30_02.O;
            if (bl4 || !(bl4 = Intrinsics.areEqual(object4 = j30_02.v(), object6 = Integer.valueOf(n4)))) {
                rk_0.a(n4, j30_02, n4, (N20$a$a)object);
            }
            object = N20$a.c;
            Ow3.a(j30_02, object5, (Function2)object);
            object = question.getTitle();
            object3 = "";
            object6 = object == null ? object3 : object;
            int n7 = 1065353216;
            float f5 = 1.0f;
            object7 = j.c((LP1)object2, f5);
            float f6 = uq0_0.o;
            float f7 = uq0_0.g;
            float f8 = f6;
            object7 = h.i((LP1)object7, f6, f7, f6, 0.0f, 8);
            object5 = y20_0.a;
            tv0_0 tv0_02 = tv0_0.h;
            long l2 = oj3_2.f;
            int n8 = 1772592;
            long l3 = 0L;
            int n10 = 0;
            long l4 = 0L;
            long l7 = 0L;
            int n14 = 130964;
            Ll3.b((String)object6, (LP1)object7, l3, l2, null, tv0_02, (RU0)object5, l4, null, null, l7, 0, false, 0, 0, null, null, j30_02, n8, 0, n14);
            object6 = question.getSub_title();
            if (object6 == null) {
                object6 = object3;
            }
            LP1 lP1 = j.c((LP1)object2, f5);
            f8 = uq0_0.j;
            int n15 = 8;
            f7 = f6;
            object7 = h.i(lP1, f6, f8, f6, 0.0f, n15);
            tv0_02 = tv0_0.e;
            l2 = oj3_2.c;
            n8 = 1772592;
            l3 = 0L;
            n10 = 0;
            l4 = 0L;
            l7 = 0L;
            n14 = 130964;
            Ll3.b((String)object6, (LP1)object7, l3, l2, null, tv0_02, (RU0)object5, l4, null, null, l7, 0, false, 0, 0, null, null, j30_02, n8, 0, n14);
            object3 = SP2.a(f6);
            object2 = c.a(j.c(h.e(QV.a((LP1)object2, (i13)object3), f6), f5), 3.81f);
            n7 = -640582299;
            f5 = -7.370768E15f;
            j30_02.K(n7);
            object = j30_02.v();
            object3 = b30$a.a;
            if (object == object3) {
                object = new xr1_1();
                j30_02.o(object);
            }
            object = (wr1_1)object;
            j30_02.T(false);
            bl4 = false;
            f6 = 0.0f;
            object4 = null;
            n4 = 0;
            object3 = null;
            int n16 = 28;
            object5 = u2_02;
            object2 = d.a((LP1)object2, (wr1_1)object, null, false, null, u2_02, n16);
            long l8 = zx_0.d(4293981431L);
            fG2$a = fg2_1.a;
            object6 = a.b((LP1)object2, l8, fG2$a);
            object7 = question.getBannerUrl();
            int n17 = R$drawable.ic_placeholder_revamp;
            i70$a$b i70$a$b = i70$a.g;
            n15 = 16;
            f8 = 0.0f;
            object = j30_02;
            n10 = 3072;
            Je1.a((LP1)object6, object7, n17, i70$a$b, null, j30_02, n10, n15);
            boolean bl5 = true;
            j30_02.T(bl5);
            object2 = j30_02.X();
            if (object2 != null) {
                n4 = n3;
                ((CF2)object2).d = object = new bv_1(question2, u2_03, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

