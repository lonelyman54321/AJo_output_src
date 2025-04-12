/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class pJ0$c
implements Function2 {
    public final /* synthetic */ pj0_2 a;

    public pJ0$c(pj0_2 pj0_22) {
        this.a = pj0_22;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            n4 = (int)(vV1.e((Context)object2) ? 1 : 0);
            n3 = 0;
            pj0_2 pj0_22 = this.a;
            if (n4 == 0) {
                n4 = -1379479460;
                object.K(n4);
                int n7 = 1;
                object2 = new yz_1(pj0_22, n7);
                rB0.c((Function0)object2, (b30_0)object, 0);
                object.E();
            } else {
                n4 = -1379374835;
                object.K(n4);
                int n8 = 1;
                object2 = new zz_1(pj0_22, n8);
                rB0.e((Function0)object2, (b30_0)object, 0);
                object.E();
            }
        }
        return Unit.a;
    }
}

