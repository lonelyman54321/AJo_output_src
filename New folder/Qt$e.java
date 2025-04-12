/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.ICouponBonanzaInfo;
import com.ril.ajio.bonanza.model.ICouponsAvailable;
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfoRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

public final class Qt$e
extends qg3_2
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ft1_2 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ ob0_1 d;

    public Qt$e(boolean bl2, ft1_2 ft1_22, ArrayList arrayList, ob0_1 ob0_12, f80_0 f80_02) {
        this.a = bl2;
        this.b = ft1_22;
        this.c = arrayList;
        this.d = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ft1_2 ft1_22 = this.b;
        Object object2 = this.c;
        List list = object2;
        list = (ArrayList)object2;
        boolean bl2 = this.a;
        ob0_1 ob0_12 = this.d;
        object2 = object;
        object = new Qt$e(bl2, ft1_22, (ArrayList)list, ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Qt$e)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Qt$e)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        Integer n4;
        int n7;
        int n8 = 1;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        int n10 = this.a;
        n10 = n10 != 0 ? 3 : 2;
        object2 = this.b;
        Object object3 = (Js1)CollectionsKt.T(((ft1_2)object2).j().i());
        if (object3 != null) {
            n7 = object3.getIndex();
            n4 = new Integer(n7);
        } else {
            n3 = 0;
            n4 = null;
        }
        object2 = ((ft1_2)object2).j();
        int n14 = object2.g();
        n7 = n14 + -1;
        if (n4 != null && (n3 = n4.intValue()) == n7 && (n7 = (object3 = (Collection)this.c).isEmpty() ^ n8) != 0 && n14 > n10) {
            object = this.d;
            n14 = (int)(((ob0_1)object).A ? 1 : 0);
            if (n14 == 0 && (object2 = ((ob0_1)object).t) != null && (object2 = ((ICouponBonanzaInfo)object2).getCouponsAvailable()) != null && (object2 = ((ICouponsAvailable)object2).getTotalPages()) != null) {
                n14 = ((Number)object2).intValue();
                n7 = ((ob0_1)object).B;
                if (n7 < (n14 -= n8)) {
                    ((ob0_1)object).B = n7 += n8;
                    object2 = ((ob0_1)object).g();
                    n7 = ((ob0_1)object).B;
                    n3 = 4;
                    object2 = ob0_1.f((ob0_1)object, (String)object2, n7, n3);
                    ((ob0_1)object).F = n8;
                    ((ob0_1)object).d((CouponBonanzaInfoRequest)object2);
                }
            }
        }
        return Unit.a;
    }
}

