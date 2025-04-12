/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from LP
 */
public final class lp_1
implements Function2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Cl2 c;
    public final /* synthetic */ Vo0 d;
    public final /* synthetic */ p83_0 e;

    public lp_1(Subcomponent subcomponent, int n3, hm0_0 hm0_02, Vo0 vo0, p83_0 p83_02) {
        this.a = subcomponent;
        this.b = n3;
        this.c = hm0_02;
        this.d = vo0;
        this.e = p83_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        Object object3;
        int n3;
        int n4;
        int n7;
        lp_1 lp_12 = this;
        Object object4 = object;
        object4 = (b30_0)object;
        Object object5 = object2;
        object5 = (Number)object2;
        int n8 = ((Number)object5).intValue() & 0xB;
        if (n8 == (n7 = 2) && (n8 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
            return Unit.a;
        }
        object5 = lp_12.a;
        if (object5 == null || (object5 = ((Subcomponent)object5).getHeading()) == null) {
            object5 = "";
        }
        long l2 = (n4 = lp_12.b) == (n3 = ((Cl2)(object3 = lp_12.c)).j()) ? OX.i : OX.f;
        long l3 = l2;
        n7 = ((Cl2)object3).j();
        object3 = n4 == n7 ? tv0_0.o : tv0_0.m;
        Object object6 = object3;
        object4.K(-1238601180);
        n7 = (int)(object4.c(n4) ? 1 : 0);
        Vo0 vo0 = lp_12.d;
        int n10 = object4.J(vo0);
        Object object7 = object4.v();
        if ((n7 |= n10) != 0 || object7 == (object3 = b30$a.a)) {
            object3 = lp_12.e;
            object7 = new kp_0((p83_0)object3, n4, vo0);
            object4.o(object7);
        }
        Object object8 = object7;
        object8 = (Function1)object7;
        object4.E();
        int n14 = 98266;
        n7 = 0;
        object3 = null;
        l2 = 0L;
        long l4 = 0L;
        long l7 = 0L;
        Object object9 = object4;
        object4 = object6;
        object6 = object9;
        Ll3.b((String)object5, null, l3, l2, null, (tv0_0)object4, null, l4, null, null, l7, 0, false, 0, 0, (Function1)object8, null, (b30_0)object9, 0, 0, n14);
        return Unit.a;
    }
}

