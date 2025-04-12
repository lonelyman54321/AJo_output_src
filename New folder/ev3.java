/*
 * Decompiled with CFR 0.152.
 */
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class ev3
implements Function2 {
    public final /* synthetic */ SwipeRefreshState a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ tr1_0 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ LP1 g;
    public final /* synthetic */ ib3_0 h;
    public final /* synthetic */ Function2 i;

    public ev3(SwipeRefreshState swipeRefreshState, mj0_2 mj0_22, float f5, float f6, tr1_0 tr1_02, u10 u102, LP1 lP1, ib3_0 ib3_02, u10 u103) {
        this.a = swipeRefreshState;
        this.b = mj0_22;
        this.c = f5;
        this.d = f6;
        this.e = tr1_02;
        this.f = u102;
        this.g = lP1;
        this.h = ib3_02;
        this.i = u103;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue() & 0xB;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4 && (n3 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            LP1$a lP1$a = LP1$a.b;
            f5 = this.d;
            Object object4 = this.e;
            object = new cv3((tr1_0)object4, f5);
            u10 u102 = v10.c(-2046880987, (fx0_2)object, (b30_0)object3);
            object2 = (u10)this.f;
            object4 = (u10)this.i;
            Object object5 = this.g;
            ib3_0 ib3_02 = this.h;
            object = new dv3((u10)object2, (LP1)object5, ib3_02, (u10)object4);
            n4 = -847416901;
            f5 = -2.6575557E8f;
            u10 u103 = v10.c(n4, (fx0_2)object, (b30_0)object3);
            int n7 = 817914240;
            int n8 = 360;
            object4 = this.a;
            object5 = this.b;
            ib3_02 = null;
            float f6 = this.c;
            SwipeRefreshKt.SwipeRefresh-Fsagccs((SwipeRefreshState)object4, (Function0)object5, lP1$a, false, f6, null, null, u102, false, u103, (b30_0)object3, n7, n8);
        }
        return Unit.a;
    }
}

