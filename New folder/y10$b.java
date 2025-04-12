/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.g;
import com.ril.ajio.videoPlayer.model.FleekConfigs;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class y10$b
implements Function2 {
    public static final y10$b a;

    static {
        y10$b y10$b;
        a = y10$b = new Object();
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n4 = ((Number)object4).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object4 = h40_0.a;
            object4 = h40_0.x();
            if (object4 == null || (object4 = ((FleekConfigs)object4).getAllBrandsDirectoryTitle()) == null) {
                object4 = "";
            }
            long l2 = oj3_2.f;
            av0_0 av0_02 = y20_0.a;
            int n7 = 600;
            tv0_0 tv0_02 = new tv0_0(n7);
            LP1$a lP1$a = LP1$a.b;
            float f5 = -uq0_0.o;
            LP1 lP1 = g.d(lP1$a, f5, 0.0f, n3);
            int n8 = 130964;
            long l3 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            int n10 = 1772592;
            Ll3.b((String)object4, lP1, l3, l2, null, tv0_02, av0_02, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object3, n10, 0, n8);
        }
        return Unit.a;
    }
}

