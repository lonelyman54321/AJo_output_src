/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.ratings.PopUpImageModel;
import com.ril.ajio.services.data.ratings.UserReviewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

public final class BA2$d
extends Lambda
implements hx0_2 {
    public final /* synthetic */ List c;
    public final /* synthetic */ UserReviewModel d;
    public final /* synthetic */ i90_0 e;
    public final /* synthetic */ tr1_0 f;
    public final /* synthetic */ tr1_0 g;

    public BA2$d(ArrayList arrayList, UserReviewModel userReviewModel, c80 c802, tr1_0 tr1_02, tr1_0 tr1_03) {
        this.c = arrayList;
        this.d = userReviewModel;
        this.e = c802;
        this.f = tr1_02;
        this.g = tr1_03;
        super(4);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        float f5;
        int n3;
        BA2$d bA2$d = this;
        Object object5 = object;
        object5 = (wr1_2)object;
        Object object6 = object2;
        int n4 = ((Number)object2).intValue();
        object6 = object3;
        object6 = (b30_0)object3;
        Object object7 = object4;
        object7 = (Number)object4;
        int n7 = ((Number)object7).intValue();
        int n8 = n7 & 6;
        int n10 = 4;
        float f6 = 5.6E-45f;
        if (n8 == 0) {
            n3 = (int)(object6.J(object5) ? 1 : 0);
            if (n3 != 0) {
                n3 = 4;
                f5 = 5.6E-45f;
            } else {
                n3 = 2;
                f5 = 2.8E-45f;
            }
            n3 |= n7;
        } else {
            n3 = n7;
        }
        if ((n7 &= 0x30) == 0) {
            n7 = (int)(object6.c(n4) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n3 |= n7;
        }
        if ((n3 &= 0x93) == (n7 = 146) && (n3 = (int)(object6.h() ? 1 : 0)) != 0) {
            object6.D();
        } else {
            Object object8 = object5 = bA2$d.c.get(n4);
            object8 = (PopUpImageModel)object5;
            n3 = -9115106;
            object6.K(n3);
            f5 = n10;
            object5 = SP2.a(f5);
            float f7 = 0.0f;
            Object object9 = LP1$a.b;
            float f8 = 8;
            int n14 = 11;
            object7 = h.i((LP1)object9, 0.0f, 0.0f, f8, 0.0f, n14);
            n10 = 54;
            f6 = n10;
            LP1 lP1 = j.k(j.d((LP1)object7, f6), f6);
            tr1_0 tr1_02 = bA2$d.f;
            tr1_0 tr1_03 = bA2$d.g;
            Object object10 = bA2$d.d;
            Object object11 = bA2$d.e;
            object7 = object9;
            object9 = new BA2$b((PopUpImageModel)object8, n4, (UserReviewModel)object10, (i90_0)object11, tr1_02, tr1_03);
            object9 = v10.c(-208664991, (fx0_2)object9, (b30_0)object6);
            int n15 = 1769478;
            int n16 = 28;
            f8 = 3.9E-44f;
            long l2 = 0L;
            n7 = 0;
            object7 = null;
            object10 = lP1;
            object11 = object5;
            lP1 = null;
            JL.a((LP1)object10, (i13)object5, l2, null, f7, (u10)object9, (b30_0)object6, n15, n16);
            object6.E();
        }
        return Unit.a;
    }
}

