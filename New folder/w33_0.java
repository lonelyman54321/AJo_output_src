/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from W33
 */
public final class w33_0
extends qg3_2
implements Function2 {
    public HashMap a;
    public int b;
    public final /* synthetic */ e43_0 c;
    public final /* synthetic */ List d;

    public w33_0(e43_0 e43_02, ArrayList arrayList, f80_0 f80_02) {
        this.c = e43_02;
        this.d = arrayList;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ArrayList arrayList = (ArrayList)this.d;
        e43_0 e43_02 = this.c;
        object = new w33_0(e43_02, arrayList, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (w33_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((w33_0)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        void var2_5;
        Object object2;
        String string2;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.b;
        e43_0 e43_02 = this.c;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            HashMap hashMap = this.a;
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = new HashMap();
            string2 = null;
            ArrayList arrayList = (ArrayList)this.d;
            object2 = new W33$a(arrayList, e43_02, (HashMap)object, null);
            this.a = object;
            this.b = n4;
            object2 = be_1.c((Function2)object2, this);
            if (object2 == j90_02) {
                return j90_02;
            }
            Object object3 = object;
        }
        object = var2_5.entrySet().iterator();
        boolean bl2;
        while (bl2 = object.hasNext()) {
            Object object4;
            Object e2 = object.next();
            Intrinsics.checkNotNullExpressionValue(e2, "next(...)");
            Map.Entry entry = (Map.Entry)e2;
            object2 = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(object2, "<get-key>(...)");
            object2 = (String)object2;
            Object v4 = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(v4, "<get-value>(...)");
            dl2_2 dl2_22 = (dl2_2)v4;
            Object object5 = dl2_22.a;
            n4 = (int)(((cl2_2)object5).d() ? 1 : 0);
            if (n4 == 0 || (object4 = dl2_22.b) == null) continue;
            object5 = e43_02.c;
            Intrinsics.checkNotNull(object4);
            List list = ((RecentlyViewedProducts)object4).getProducts();
            string2 = "getProducts(...)";
            Intrinsics.checkNotNullExpressionValue(list, string2);
            ArrayList arrayList = e43_0.d(list);
            ((HashMap)object5).put(object2, arrayList);
        }
        return Unit.a;
    }
}

