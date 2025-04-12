/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nG0
 */
public final class ng0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ng0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (da1_2)object;
                Intrinsics.checkNotNullParameter(object, "scope");
                yq_1 yq_12 = ((da1_2)object).j;
                Object object2 = aa1_1.a;
                Object object3 = new Object();
                yq_12 = (yq_1)yq_12.c((xq_2)object2, (Function0)object3);
                object2 = ((da1_2)object).l.b;
                object3 = (za1_2)this.b;
                xq_2 xq_22 = object3.getKey();
                object2 = ((LinkedHashMap)object2).get(xq_22);
                Intrinsics.checkNotNull(object2);
                object2 = (Function1)object2;
                object2 = object3.b((Function1)object2);
                object3.a(object2, (da1_2)object);
                object = object3.getKey();
                yq_12.d((xq_2)object, object2);
                return Unit.a;
            }
            case 0: 
        }
        object = (Integer)object;
        int n4 = (Integer)object;
        Component component = (Component)this.b;
        Intrinsics.checkNotNullParameter(component, "$component");
        p83_0 p83_02 = component.getSubcomponents();
        if (p83_02 == null || (object = (Subcomponent)CollectionsKt.N(n4, p83_02)) == null || (object = ((Subcomponent)object).getUuid()) == null) {
            object = "";
        }
        return object;
    }
}

