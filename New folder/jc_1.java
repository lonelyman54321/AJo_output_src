/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from jC
 */
public final class jc_1
implements Function0 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ Subcomponent d;
    public final /* synthetic */ Component e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ yp0_0 g;

    public /* synthetic */ jc_1(Ref$ObjectRef ref$ObjectRef, c80 c802, dr0_0 dr0_02, Subcomponent subcomponent, Component component, boolean bl2, yp0_0 yp0_02) {
        this.a = ref$ObjectRef;
        this.b = c802;
        this.c = dr0_02;
        this.d = subcomponent;
        this.e = component;
        this.f = bl2;
        this.g = yp0_02;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$brandsPageData");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$coroutineScope");
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Object object3 = this.g;
        Intrinsics.checkNotNullParameter(object3, "$fleekBrandPageGAEventsUtil");
        Object object4 = ((Ref$ObjectRef)object).element;
        if (object4 != null) {
            uc_2 uc_22;
            boolean bl2 = this.f;
            Component component = this.e;
            boolean bl3 = false;
            object4 = uc_22;
            Object object5 = component;
            uc_22 = new uc_2((yp0_0)object3, dr0_02, bl2, component, null);
            int n3 = 3;
            object3 = null;
            Ae3.d((i90_0)object2, null, null, uc_22, n3);
            object2 = this.d;
            Object object6 = object2 != null && (object4 = ((Subcomponent)object2).getResourceOwner()) != null ? (object4 = ((ResourceOwner)object4).getId()) : null;
            object5 = object = ((Ref$ObjectRef)object).element;
            object5 = (BrandPageModel)object;
            bl3 = bl2 ^ true;
            object4 = dr0_02;
            object3 = object2;
            dr0_02.N((Subcomponent)object2, component, (String)object6, (BrandPageModel)object5, bl3);
        }
        return Unit.a;
    }
}

