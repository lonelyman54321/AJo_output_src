/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.ril.ajio.services.data.ratings.PopUpImageModel;
import com.ril.ajio.services.data.ratings.UserReviewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class BA2$b
implements Function2 {
    public final /* synthetic */ PopUpImageModel a;
    public final /* synthetic */ int b;
    public final /* synthetic */ UserReviewModel c;
    public final /* synthetic */ i90_0 d;
    public final /* synthetic */ tr1_0 e;
    public final /* synthetic */ tr1_0 f;

    public BA2$b(PopUpImageModel popUpImageModel, int n3, UserReviewModel userReviewModel, i90_0 i90_02, tr1_0 tr1_02, tr1_0 tr1_03) {
        this.a = popUpImageModel;
        this.b = n3;
        this.c = userReviewModel;
        this.d = i90_02;
        this.e = tr1_02;
        this.f = tr1_03;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            Object object3;
            object.K(-1003410150);
            n4 = 212064437;
            object.K(n4);
            object.E();
            object2 = O30.f;
            object2 = (Vo0)object.j((H30)object2);
            Object object4 = object.v();
            b30$a$a b30$a$a = b30$a.a;
            if (object4 == b30$a$a) {
                object4 = new nl1_0((Vo0)object2);
                object.o(object4);
            }
            object4 = (nl1_0)object4;
            object2 = object.v();
            if (object2 == b30$a$a) {
                object2 = new C50();
                object.o(object2);
            }
            Object object5 = object2;
            object5 = (C50)object2;
            object2 = object.v();
            if (object2 == b30$a$a) {
                object2 = J83.g(Boolean.FALSE);
                object.o(object2);
            }
            object2 = (tr1_0)object2;
            Object object6 = object.v();
            if (object6 == b30$a$a) {
                object6 = new i50_0((C50)object5);
                object.o(object6);
            }
            object6 = (i50_0)object6;
            Object object7 = object.v();
            if (object7 == b30$a$a) {
                object7 = Unit.a;
                J83.h();
                object3 = wv1_0.b;
                object7 = J83.f(object7, (I83)object3);
                object.o(object7);
            }
            object7 = (tr1_0)object7;
            boolean bl2 = object.x(object4);
            boolean bl3 = object.c(257);
            Object object8 = object.v();
            if ((bl2 |= bl3) || object8 == b30$a$a) {
                object8 = new ga2_1((tr1_0)object7, (nl1_0)object4, (i50_0)object6, (tr1_0)object2);
                object.o(object8);
            }
            Object object9 = object8;
            object9 = (al1_1)object8;
            object3 = object.v();
            if (object3 == b30$a$a) {
                object3 = new ha2_2((tr1_0)object2, (i50_0)object6);
                object.o(object3);
            }
            object3 = (Function0)object3;
            n4 = (int)(object.x(object4) ? 1 : 0);
            object6 = object.v();
            if (n4 != 0 || object6 == b30$a$a) {
                n4 = 1;
                object6 = new yl0_2(object4, n4);
                object.o(object6);
            }
            object6 = (Function1)object6;
            n3 = 0;
            object2 = new AppendedSemanticsElement((Function1)object6, false);
            UserReviewModel userReviewModel = this.c;
            i90_0 i90_02 = this.d;
            object8 = this.a;
            int n7 = this.b;
            tr1_0 tr1_02 = this.e;
            tr1_0 tr1_03 = this.f;
            object6 = object4;
            object4 = new ia2_2((tr1_0)object7, (C50)object5, (Function0)object3, (PopUpImageModel)object8, n7, userReviewModel, i90_02, tr1_02, tr1_03);
            object4 = v10.c(1200550679, (fx0_2)object4, (b30_0)object);
            int n8 = 48;
            Mp1.a((LP1)object2, (u10)object4, (al1_1)object9, (b30_0)object, n8);
            object.E();
        }
        return Unit.a;
    }
}

