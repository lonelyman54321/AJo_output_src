/*
 * Decompiled with CFR 0.152.
 */
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class cv3
implements hx0_2 {
    public final /* synthetic */ float a;
    public final /* synthetic */ tr1_0 b;

    public cv3(tr1_0 tr1_02, float f5) {
        this.a = f5;
        this.b = tr1_02;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        float f5;
        object = (SwipeRefreshState)object;
        object2 = (xs0_0)object2;
        float f6 = ((xs0_0)object2).a;
        object3 = (b30_0)object3;
        int n3 = ((Number)object4).intValue();
        object4 = "state";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0xE;
        if (n4 == 0) {
            n4 = (int)(object3.J(object) ? 1 : 0);
            if (n4 != 0) {
                n4 = 4;
                f5 = 5.6E-45f;
            } else {
                n4 = 2;
                f5 = 2.8E-45f;
            }
            n3 |= n4;
        }
        n4 = 130;
        f5 = 1.82E-43f;
        if ((n3 &= 0x28B) == n4 && (n3 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            int n7;
            f6 = ok1_1.b(((SwipeRefreshState)object).getIndicatorOffset());
            int n8 = 0;
            float f7 = 0.0f;
            object3 = null;
            f5 = this.a;
            float f8 = f6 - f5;
            n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
            if (n3 > 0) {
                n3 = 1;
                f6 = Float.MIN_VALUE;
            } else {
                n3 = 0;
                f6 = 0.0f;
                object2 = null;
            }
            float f11 = ((SwipeRefreshState)object).getIndicatorOffset();
            int n10 = ok1_1.b(f11);
            if (n3 != 0) {
                n8 = 100;
                f7 = 1.4E-43f;
            }
            object3 = n10 += n8;
            tr1_0 tr1_02 = this.b;
            tr1_02.setValue(object3);
            if (n3 != 0) {
                n3 = ok1_1.b(f5);
                float f12 = ok1_1.b(((SwipeRefreshState)object).getIndicatorOffset());
                n8 = 0x3DCCCCCD;
                f7 = 0.1f;
                n7 = ok1_1.b(f12 *= f7) + n3;
            } else {
                n3 = (int)(((SwipeRefreshState)object).isRefreshing() ? 1 : 0);
                if (n3 != 0) {
                    n7 = ok1_1.b(f5);
                } else {
                    float f14 = ((SwipeRefreshState)object).getIndicatorOffset();
                    n7 = ok1_1.b(f14);
                }
            }
            object = n7;
            tr1_02.setValue(object);
        }
        return Unit.a;
    }
}

