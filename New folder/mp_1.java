/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from MP
 */
public final class mp_1
implements Function2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ Cl2 b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ Component d;
    public final /* synthetic */ Vo0 e;
    public final /* synthetic */ p83_0 f;

    public mp_1(p83_0 p83_02, hm0_0 hm0_02, c80 c802, Component component, Vo0 vo0, p83_0 p83_03) {
        this.a = p83_02;
        this.b = hm0_02;
        this.c = c802;
        this.d = component;
        this.e = vo0;
        this.f = p83_03;
    }

    public final Object invoke(Object object, Object object2) {
        block6: {
            int n3;
            mp_1 mp_12 = this;
            Object object3 = object;
            object3 = (b30_0)object;
            Object object4 = object2;
            object4 = (Number)object2;
            int n4 = ((Number)object4).intValue() & 0xB;
            if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0))) {
                object3.D();
            } else {
                object4 = mp_12.a;
                if (object4 != null) {
                    ListIterator listIterator = ((p83_0)object4).listIterator();
                    int n7 = 0;
                    while (true) {
                        lp_1 lp_12;
                        ip_0 ip_02;
                        int n8;
                        object4 = listIterator;
                        object4 = (ob3_2)listIterator;
                        int n10 = ((ob3_2)object4).hasNext();
                        if (n10 == 0) break block6;
                        object4 = ((ob3_2)object4).next();
                        int n14 = n7 + 1;
                        if (n7 < 0) break;
                        Object object5 = object4;
                        object5 = (Subcomponent)object4;
                        object4 = j.o(LP1$a.b);
                        float f5 = -uq0_0.c;
                        Object object6 = null;
                        LP1 lP1 = g.d((LP1)object4, f5, 0.0f, n3);
                        object4 = mp_12.b;
                        n10 = ((Cl2)object4).j();
                        if (n7 == n10) {
                            n10 = 1;
                            f5 = Float.MIN_VALUE;
                            n8 = 1;
                        } else {
                            n8 = 0;
                        }
                        Object object7 = (c80)mp_12.c;
                        Object object8 = object4;
                        object8 = (hm0_0)object4;
                        object6 = mp_12.d;
                        object4 = ip_02;
                        Object object9 = object8;
                        ip_02 = new ip_0((c80)object7, (Component)object6, (Subcomponent)object5, (hm0_0)object8, n7);
                        object9 = mp_12.e;
                        p83_0 p83_02 = mp_12.f;
                        object4 = lp_12;
                        object7 = object5;
                        lp_12 = new lp_1((Subcomponent)object5, n7, (hm0_0)object8, (Vo0)object9, p83_02);
                        object9 = v10.c(1573908375, lp_12, (b30_0)object3);
                        int n15 = 24960;
                        p83_02 = null;
                        long l2 = 0L;
                        long l3 = 0L;
                        n4 = n8;
                        object7 = ip_02;
                        object6 = lP1;
                        object8 = object3;
                        Uh3.a(n8 != 0, ip_02, lP1, false, (Function2)object9, null, null, l2, l3, (b30_0)object3, n15);
                        n7 = n14;
                    }
                    xx_2.n();
                    throw null;
                }
            }
        }
        return Unit.a;
    }
}

