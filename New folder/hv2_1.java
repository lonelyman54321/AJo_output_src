/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.user.AppliedFacetValue;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hv2
 */
public final class hv2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ bv2_0 b;
    public final /* synthetic */ ProductsList c;

    public hv2_1(bv2_0 bv2_02, ProductsList productsList, f80_0 f80_02) {
        this.b = bv2_02;
        this.c = productsList;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        bv2_0 bv2_02 = this.b;
        ProductsList productsList = this.c;
        object = new hv2_1(bv2_02, productsList, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hv2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hv2_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Serializable serializable;
        Object object2;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        bv2_0 bv2_02 = this.b;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            this.a = n4;
            object = bv2_0.Companion;
            bv2_02.getClass();
            object = ir0_2.a;
            object2 = this.c;
            serializable = new cv2_2(bv2_02, (ProductsList)object2, null);
            object = Ae3.g(this, object, (Function2)((Object)serializable));
            if (object == object3) {
                return object3;
            }
        }
        object = (ArrayList)object;
        object3 = bv2_0.Companion;
        bv2_02.getClass();
        int n7 = object.isEmpty() ^ n4;
        if (n7 != 0) {
            object = object.iterator();
            while (true) {
                int n8;
                String string2;
                Object object4;
                Object object5;
                int n10;
                Object object6;
                block14: {
                    n7 = (int)(object.hasNext() ? 1 : 0);
                    serializable = bv2_02.U;
                    object2 = bv2_02.T;
                    if (n7 == 0) break;
                    object6 = object3 = object.next();
                    object6 = (FacetValue)object3;
                    object3 = bv2_02.X1.iterator();
                    while ((n10 = object3.hasNext()) != 0) {
                        int n14;
                        object4 = object5 = object3.next();
                        object4 = ((FacetValue)object5).getCode();
                        if (object4 == null || (n14 = ((String)object4).equals(string2 = ((FacetValue)object6).getCode())) != n4) continue;
                        break block14;
                    }
                    n10 = 0;
                    object5 = null;
                }
                object5 = (FacetValue)object5;
                if (object5 != null) {
                    ((FacetValue)object5).setSelected(n4 != 0);
                }
                if ((n7 = ((ArrayList)object2).size()) < (n10 = bv2_02.j())) {
                    object4 = "facet";
                    string2 = null;
                    n8 = 4;
                    object5 = object3;
                    object3 = new AppliedFacetValue((String)object4, (FacetValue)object6, 0, n8, null);
                    n3 = ((ArrayList)object2).isEmpty() ^ n4;
                    n10 = 0;
                    object5 = null;
                    if (n3 != 0) {
                        ((ArrayList)object2).add(0, object3);
                        continue;
                    }
                    ((ArrayList)object2).add(0, object3);
                    continue;
                }
                object4 = "facet";
                string2 = null;
                n8 = 4;
                object5 = object3;
                object3 = new AppliedFacetValue((String)object4, (FacetValue)object6, 0, n8, null);
                ((ArrayList)serializable).add(object3);
            }
            int n15 = ((ArrayList)object2).size();
            if (n15 >= (n7 = bv2_02.j())) {
                object = ((AppliedFacetValue)CollectionsKt.S((List)object2)).getType();
                n15 = (int)(Intrinsics.areEqual(object, object3 = "more") ? 1 : 0);
                if (n15 == 0) {
                    n15 = ((ArrayList)serializable).isEmpty() ^ n4;
                    if (n15 != 0) {
                        n3 = ((ArrayList)serializable).size();
                        object = new AppliedFacetValue((String)object3, null, n3);
                        ((ArrayList)object2).add(object);
                    }
                } else {
                    object = (AppliedFacetValue)CollectionsKt.S((List)object2);
                    n7 = ((ArrayList)serializable).size();
                    ((AppliedFacetValue)object).setSize(n7);
                }
            }
            object = bv2_02.l;
            object3 = bv2_02.T;
            ((LiveData)object).k(object3);
        }
        return Unit.a;
    }
}

