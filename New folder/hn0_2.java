/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.IFilter;
import com.ril.ajio.kmm.shared.bonanza.model.CouponAttributeValues;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from hN0
 */
public final class hn0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;

    public hn0_2(ob0_1 ob0_12, f80_0 f80_02) {
        this.a = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        object = new hn0_2(ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hn0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hn0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((ob0_1)object).m;
        Object object3 = (p83_0)((h83_0)object2).getValue();
        ((ob0_1)object).z.clear();
        p83_0 p83_02 = new p83_0();
        object3 = ((p83_0)object3).listIterator();
        while (true) {
            IFilter iFilter;
            Object object4 = object3;
            object4 = (ob3_2)object3;
            boolean bl2 = ((ob3_2)object4).hasNext();
            if (!bl2) break;
            object4 = (IFilter)((ob3_2)object4).next();
            int n3 = 7;
            Object object5 = null;
            boolean bl3 = false;
            CouponAttributeValues couponAttributeValues = null;
            Boolean bl4 = null;
            Object object6 = iFilter;
            iFilter = new IFilter(null, null, false, n3, null);
            object6 = ((IFilter)object4).getKey();
            iFilter.setKey((String)object6);
            object6 = new p83_0();
            object4 = ((IFilter)object4).getCouponAttributeValues();
            if (object4 != null) {
                object4 = ((p83_0)object4).listIterator();
                while (true) {
                    object5 = object4;
                    object5 = (ob3_2)object4;
                    bl3 = ((ob3_2)object5).hasNext();
                    if (!bl3) break;
                    object5 = (CouponAttributeValues)((ob3_2)object5).next();
                    bl4 = Boolean.FALSE;
                    object5 = ((CouponAttributeValues)object5).getValue();
                    couponAttributeValues = new CouponAttributeValues(bl4, (String)object5);
                    ((p83_0)object6).add(couponAttributeValues);
                }
            }
            object4 = new p83_0();
            iFilter.setCouponAttributeValues((p83_0)object4);
            object4 = iFilter.getCouponAttributeValues();
            if (object4 != null) {
                ((p83_0)object4).addAll((Collection)object6);
            }
            p83_02.add(iFilter);
        }
        ((ob0_1)object).n.setValue(null);
        ((h83_0)object2).setValue(p83_02);
        ((ob0_1)object).G = true;
        ((ob0_1)object).c("coupon bonanza - coupon filter screen", "Clear Filters");
        return Unit.a;
    }
}

