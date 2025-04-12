/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from NC
 */
public final class nc_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nc_1(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final Object invoke() {
        Object object;
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2;
                bf1_2 bf1_22 = (bf1_2)this.b;
                Intrinsics.checkNotNullParameter(bf1_22, "$viewModel");
                CMSNavigation cMSNavigation = (CMSNavigation)this.c;
                Intrinsics.checkNotNullParameter(cMSNavigation, "$item");
                Function1 function1 = (Function1)this.d;
                Intrinsics.checkNotNullParameter(function1, "$onItemClick");
                bf1_22.i = string2 = cMSNavigation.getName();
                bf1_22.j = string2 = "";
                bf1_22.k = string2;
                bf1_22.l = string2;
                function1.invoke(cMSNavigation);
                return Unit.a;
            }
            case 0: 
        }
        Object object2 = (Ref$ObjectRef)this.b;
        Intrinsics.checkNotNullParameter(object2, "$brandsPageData");
        Object object3 = object = this.d;
        object3 = (dr0_0)object;
        Intrinsics.checkNotNullParameter(object3, "$fleekViewModel");
        object = ((Ref$ObjectRef)object2).element;
        if (object != null) {
            Object object4 = object = this.c;
            object4 = (Component)object;
            if (object4 != null) {
                object = ((Component)object4).getSubcomponents();
                Object object5 = null;
                object = object != null ? (Subcomponent)CollectionsKt.firstOrNull((List)object) : null;
                Object object6 = ((Component)object4).getSubcomponents();
                if (object6 != null && (object6 = (Subcomponent)CollectionsKt.firstOrNull((List)object6)) != null && (object6 = ((Subcomponent)object6).getResourceOwner()) != null) {
                    object5 = ((ResourceOwner)object6).getId();
                }
                object6 = object5;
                Object object7 = object2 = ((Ref$ObjectRef)object2).element;
                object7 = (BrandPageModel)object2;
                object3.getClass();
                n3 = (int)(dr0_0.E((Component)object4) ? 1 : 0);
                boolean bl2 = n3 ^ 1;
                object5 = object;
                ((dr0_0)object3).N((Subcomponent)object, (Component)object4, (String)object6, (BrandPageModel)object7, bl2);
            }
        }
        return Unit.a;
    }
}

