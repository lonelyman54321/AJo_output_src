/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import androidx.navigation.p;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Qb2
 */
public final class qb2_0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ boolean c;

    public qb2_0(String string2, qz1_2 qz1_22, boolean bl2) {
        this.a = string2;
        this.b = qz1_22;
        this.c = bl2;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        qb2_0 qb2_02 = this;
        yT1 yT12 = null;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n4 = ((Number)object4).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            Object object5;
            n4 = 1;
            object4 = SystemUiControllerKt.rememberSystemUiController(null, (b30_0)object3, 0, n4);
            object3.K(2097870129);
            n3 = (int)(object3.J(object4) ? 1 : 0);
            Object object6 = object3.v();
            if (n3 != 0 || object6 == (object5 = b30$a.a)) {
                object6 = new mb2_1(object4, 0);
                object3.o(object6);
            }
            object6 = (Function0)object6;
            object3.E();
            object4 = ly0_0.a;
            object3.q((Function0)object6);
            yT12 = CT1.b(new p[0], (b30_0)object3);
            object4 = qb2_02.b;
            n3 = (int)(qb2_02.c ? 1 : 0);
            nb2_0 nb2_02 = new nb2_0((qz1_2)object4, yT12, n3 != 0);
            object5 = qb2_02.a;
            object6 = null;
            int n7 = 8;
            object4 = yT12;
            qb2_02 = null;
            aU1.b(yT12, (String)object5, null, null, null, null, null, null, null, null, nb2_02, (b30_0)object3, n7, 0);
            object4 = "home_route";
            n3 = 6;
            e.p(yT12, (String)object4, null, n3);
        }
        return Unit.a;
    }
}

