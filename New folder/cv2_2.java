/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cv2
 */
public final class cv2_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ bv2_0 a;
    public final /* synthetic */ ProductsList b;

    public cv2_2(bv2_0 bv2_02, ProductsList productsList, f80_0 f80_02) {
        this.a = bv2_02;
        this.b = productsList;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        bv2_0 bv2_02 = this.a;
        ProductsList productsList = this.b;
        object = new cv2_2(bv2_02, productsList, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (cv2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((cv2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object arrayList) {
        boolean bl2;
        boolean bl3;
        Object object = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(arrayList);
        arrayList = new ArrayList<Object>();
        object = new ArrayList();
        Object object2 = this.a;
        Iterator iterator = CollectionsKt.k0(((bv2_0)object2).T);
        if ((iterator == null || (bl3 = iterator.isEmpty())) && (iterator = this.b) != null && (iterator = ((ProductsList)((Object)iterator)).getFacets()) != null && (iterator = CollectionsKt.k0((Iterable)((Object)iterator))) != null) {
            boolean bl4;
            iterator = ((Iterable)((Object)iterator)).iterator();
            while (bl4 = iterator.hasNext()) {
                boolean bl5;
                Facet facet = (Facet)iterator.next();
                Object object3 = ((bv2_0)object2).W;
                if (object3 == null || (object3 = fh1_2.o((Map)object3)) == null) continue;
                object3 = object3.entrySet().iterator();
                while (bl5 = object3.hasNext()) {
                    boolean bl6;
                    Iterator iterator2 = (Map.Entry)object3.next();
                    Object object4 = facet.getCode();
                    bl5 = Intrinsics.areEqual(object4, iterator2 = iterator2.getKey());
                    if (!bl5 || (iterator2 = facet.getValues()) == null || (iterator2 = CollectionsKt.k0((Iterable)((Object)iterator2))) == null) continue;
                    iterator2 = ((Iterable)((Object)iterator2)).iterator();
                    while (bl6 = iterator2.hasNext()) {
                        object4 = (FacetValue)iterator2.next();
                        boolean bl7 = ((FacetValue)object4).getSelected();
                        if (!bl7) continue;
                        String string2 = facet.getCode();
                        ((FacetValue)object4).setFacetCode(string2);
                        object.add(object4);
                    }
                }
            }
        }
        object = ((Iterable)CollectionsKt.k0((Iterable)object)).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (FacetValue)object.next();
            arrayList.add(object2);
        }
        return arrayList;
    }
}

