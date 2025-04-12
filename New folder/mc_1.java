/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from MC
 */
public final class mc_1
implements Function0 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ Subcomponent d;

    public /* synthetic */ mc_1(Ref$ObjectRef ref$ObjectRef, Component component, dr0_0 dr0_02, Subcomponent subcomponent) {
        this.a = ref$ObjectRef;
        this.b = component;
        this.c = dr0_02;
        this.d = subcomponent;
    }

    public final Object invoke() {
        Component component;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$brandsPageData");
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Object object2 = ((Ref$ObjectRef)object).element;
        if (object2 != null && (component = this.b) != null) {
            object2 = component.getSubcomponents();
            object2 = object2 != null && (object2 = (Subcomponent)CollectionsKt.firstOrNull((List)object2)) != null && (object2 = ((Subcomponent)object2).getResourceOwner()) != null ? ((ResourceOwner)object2).getId() : null;
            Object object3 = object = ((Ref$ObjectRef)object).element;
            object3 = (BrandPageModel)object;
            dr0_02.getClass();
            boolean bl2 = dr0_0.E(component);
            boolean bl3 = bl2 ^ true;
            Subcomponent subcomponent = this.d;
            dr0_02.N(subcomponent, component, (String)object2, (BrandPageModel)object3, bl3);
        }
        return Unit.a;
    }
}

