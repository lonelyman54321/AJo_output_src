/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.kmm.shared.bonanza.model.CouponAttributeValues;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tb0
 */
public final class tb0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;

    public tb0_1(ob0_1 ob0_12, f80_0 f80_02) {
        this.a = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        object = new tb0_1(ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (tb0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tb0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Object object2;
        Object object3;
        int n4;
        vl2_2.b(object);
        ob0_1 ob0_12 = this.a;
        Iterator iterator = ob0_12.z.entrySet().iterator();
        Object object4 = "";
        String string2 = object4;
        block0: while ((n4 = iterator.hasNext()) != 0) {
            object4 = ((p83_0)iterator.next().getValue()).listIterator();
            while (true) {
                object3 = object4;
                object3 = (ob3_2)object4;
                int n3 = ((ob3_2)object3).hasNext();
                if (n3 == 0) continue block0;
                object3 = (CouponAttributeValues)((ob3_2)object3).next();
                n3 = string2.length();
                if (n3 > 0) {
                    object2 = ",";
                    string2 = Qj0.b(string2, (String)object2);
                }
                object3 = ((CouponAttributeValues)object3).getValue();
                string2 = Qj0.b(string2, (String)object3);
            }
        }
        Bundle bundle = new Bundle();
        iterator = ob0_12.z.entrySet().iterator();
        n4 = 0;
        object4 = null;
        block2: while (bl2 = iterator.hasNext()) {
            object3 = ((p83_0)iterator.next().getValue()).listIterator();
            while (true) {
                Boolean bl3;
                object2 = object3;
                object2 = (ob3_2)object3;
                boolean bl4 = ((ob3_2)object2).hasNext();
                if (!bl4) continue block2;
                boolean bl5 = Intrinsics.areEqual(object2 = ((CouponAttributeValues)((ob3_2)object2).next()).getSelected(), bl3 = Boolean.TRUE);
                if (!bl5) continue;
                ++n4;
            }
        }
        bundle.putInt("number_of_filters_applied", n4);
        NewCustomEventsRevamp.newPushCustomEvent$default(ob0_12.E, "coupon bonanza interaction", "filter applied", string2, "coupon_bonanza_filter_applied", null, null, null, bundle, "", false, null, 1648, null);
        return Unit.a;
    }
}

