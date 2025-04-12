/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class GK0$a
implements Function2 {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ f23_0 d;
    public final /* synthetic */ dr0_0 e;
    public final /* synthetic */ FeedEngineData f;
    public final /* synthetic */ i90_0 g;
    public final /* synthetic */ yT1 h;
    public final /* synthetic */ yp0_0 i;

    public GK0$a(ft1_2 ft1_22, p83_0 p83_02, Activity activity, f23_0 f23_02, dr0_0 dr0_02, FeedEngineData feedEngineData, c80 c802, yT1 yT12, yp0_0 yp0_02) {
        this.a = ft1_22;
        this.b = p83_02;
        this.c = activity;
        this.d = f23_02;
        this.e = dr0_02;
        this.f = feedEngineData;
        this.g = c802;
        this.h = yT12;
        this.i = yp0_02;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        GK0$a gK0$a = this;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n4 = ((Number)object4).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            n4 = 1197296171;
            object3.K(n4);
            object4 = object3.v();
            Object object5 = b30$a.a;
            if (object4 == object5) {
                object5 = gK0$a.a;
                object4 = new oj0_0((ft1_2)object5);
                object4 = J83.e((Function0)object4);
                object3.o(object4);
            }
            Object object6 = object4;
            object6 = (ib3_0)object4;
            object3.E();
            object4 = j.c;
            long l2 = nz_1.a;
            Object object7 = fg2_1.a;
            object4 = androidx.compose.foundation.a.b((LP1)object4, l2, (i13)object7);
            Object object8 = object5 = gK0$a.g;
            object8 = (c80)object5;
            p83_0 p83_02 = gK0$a.b;
            Activity activity = gK0$a.c;
            f23_0 f23_02 = gK0$a.d;
            dr0_0 dr0_02 = gK0$a.e;
            object5 = gK0$a.f;
            ft1_2 ft1_22 = gK0$a.a;
            object7 = gK0$a.h;
            yp0_0 yp0_02 = gK0$a.i;
            ft1_2 ft1_23 = ft1_22;
            pj0_0 pj0_02 = new pj0_0(p83_02, activity, f23_02, dr0_02, (FeedEngineData)object5, ft1_22, (c80)object8, (ib3_0)object6, (yT1)object7, yp0_02);
            int n7 = 252;
            activity = null;
            object5 = ft1_22;
            ft1_22 = null;
            object7 = null;
            yp0_02 = null;
            xq1_0.a((LP1)object4, ft1_23, null, false, null, null, null, false, pj0_02, (b30_0)object3, 0, n7);
        }
        return Unit.a;
    }
}

