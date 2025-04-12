/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Sb0
 */
public final class sb0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;

    public sb0_2(ob0_1 ob0_12, f80_0 f80_02) {
        this.a = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        object = new sb0_2(ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (sb0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((sb0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        Bundle bundle = new Bundle();
        ob0_1 ob0_12 = this.a;
        int n3 = ((Number)ob0_12.h.getValue()).intValue();
        String string2 = "bbs_coins_used";
        bundle.putInt(string2, n3);
        Integer n4 = ob0_12.h();
        if (n4 != null) {
            n3 = n4;
        } else {
            n3 = 0;
            n4 = null;
        }
        bundle.putInt("bbs_coins_remaining", n3);
        n3 = ((Number)ob0_12.g.getValue()).intValue();
        bundle.putInt("no_coupons", n3);
        NewCustomEventsRevamp.newPushCustomEvent$default(ob0_12.E, "coupon bonanza interaction", "coupon unlocked failure", "unlock coupons failure", "coupon_bonanza_coupon_unlock_failure", null, null, null, bundle, "", false, null, 1648, null);
        return Unit.a;
    }
}

