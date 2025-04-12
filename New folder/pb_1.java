/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pB
 */
public final class pb_1
implements gx0_2 {
    public final /* synthetic */ ResourceOwner a;

    public pb_1(ResourceOwner resourceOwner) {
        this.a = resourceOwner;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0x51;
        n3 = 16;
        float f5 = 2.2E-44f;
        if (n4 == n3 && (n4 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            object = LP1$a.b;
            f5 = n3;
            object = h.e((LP1)object, f5);
            f5 = uq0_0.H;
            object = j.h((LP1)object, f5);
            f5 = 8;
            int n7 = 1;
            object = g.d((LP1)object, 0.0f, f5, n7);
            n3 = 4;
            f5 = n3;
            long l2 = OX.b;
            object3 = SP2.a;
            LP1 lP1 = gz.a((LP1)object, f5, l2, (i13)object3);
            object = this.a;
            if (object == null || (object = ((ResourceOwner)object).getLogo()) == null) {
                object = "";
            }
            float f6 = uq0_0.A;
            int n8 = 3072;
            int n10 = 4;
            ov3.i(lP1, (String)object, null, f6, (b30_0)object4, n8, n10);
        }
        return Unit.a;
    }
}

