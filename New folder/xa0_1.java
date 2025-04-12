/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.p;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Xa0
 */
public final class xa0_1
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ ob0_1 b;

    public xa0_1(String string2, ob0_1 ob0_12) {
        this.a = string2;
        this.b = ob0_12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        xa0_1 xa0_12 = this;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n4 = ((Number)object4).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            n4 = 1;
            Object object5 = null;
            object4 = SystemUiControllerKt.rememberSystemUiController(null, (b30_0)object3, 0, n4);
            object3.K(512031310);
            n3 = (int)(object3.J(object4) ? 1 : 0);
            Object object6 = object3.v();
            if (n3 != 0 || object6 == (object5 = b30$a.a)) {
                object6 = new na0_0((SystemUiController)object4);
                object3.o(object6);
            }
            object6 = (Function0)object6;
            object3.E();
            object4 = ly0_0.a;
            object3.q((Function0)object6);
            object4 = CT1.b(new p[0], (b30_0)object3);
            object5 = xa0_12.b;
            oa0_0 oa0_02 = new oa0_0((ob0_1)object5, (yT1)object4);
            object5 = xa0_12.a;
            object6 = null;
            int n7 = 8;
            aU1.b((yT1)object4, (String)object5, null, null, null, null, null, null, null, null, oa0_02, (b30_0)object3, n7, 0);
        }
        return Unit.a;
    }
}

