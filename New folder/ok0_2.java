/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oK0
 */
public final class ok0_2
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Resource c;
    public final /* synthetic */ Component d;

    public /* synthetic */ ok0_2(dr0_0 dr0_02, boolean bl2, Resource resource, Component component) {
        this.a = dr0_02;
        this.b = bl2;
        this.c = resource;
        this.d = component;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        object = ((dr0_0)object).z;
        Object object2 = ((h83_0)object).getValue();
        ((h83_0)object).setValue(object2);
        boolean bl2 = this.b;
        object2 = this.c;
        Object object3 = this.d;
        if (bl2) {
            object = pp0_0.a;
            object = "insert_product_widget - remove from wishlist - success";
            object3 = dr0_0.x((Component)object3);
            pp0_0.d((Resource)object2, (String)object, (String)object3);
        } else {
            object = pp0_0.a;
            object = "insert_product_widget - add to wishlist - success";
            object3 = dr0_0.x((Component)object3);
            pp0_0.d((Resource)object2, (String)object, (String)object3);
        }
        return Unit.a;
    }
}

