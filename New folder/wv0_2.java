/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from wv0
 */
public final class wv0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ tv0_2 a;

    public wv0_2(tv0_2 tv0_22, f80_0 f80_02) {
        this.a = tv0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tv0_2 tv0_22 = this.a;
        object = new wv0_2(tv0_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (wv0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wv0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        this.a.dismissAllowingStateLoss();
        object = hv3_0.K(R$string.something_wrong_msg);
        hv3_0.o0(1, (String)object, null);
        return Unit.a;
    }
}

