/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from h22
 */
public final class h22_0
implements Function0 {
    public final /* synthetic */ NewProductDetailsFragment a;

    public /* synthetic */ h22_0(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        E$b e$b = ((Y51)object).getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(e$b, "factory");
        object2 = li_2.a((Wd0)object2, "defaultCreationExtras", (rd3_0)object3, e$b, (Wd0)object2);
        object = BannerAdViewModel.class;
        object3 = "modelClass";
        object = do_0.a((Class)object, (String)object3, (Class)object, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object, "<this>");
        object3 = object.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (BannerAdViewModel)((pD3)object2).a((yn1_2)object, (String)object3);
        }
        object = "Local and anonymous classes can not be ViewModels".toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

