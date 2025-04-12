/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.myaccount.order.fragment.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fb0
 */
public final class fb0_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fb0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = com.ril.ajio.myaccount.order.fragment.b.Companion;
                object = (b)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object2 = "owner";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                Object object3 = object.getViewModelStore();
                Intrinsics.checkNotNullParameter(object, (String)object2);
                E$b e$b = ((c61_0)object).getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = object.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object3, "store");
                Intrinsics.checkNotNullParameter(e$b, "factory");
                object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object3, e$b, (Wd0)object);
                object2 = BannerAdViewModel.class;
                object3 = "modelClass";
                object2 = do_0.a(object2, (String)object3, object2, (String)object3, (String)object3);
                Intrinsics.checkNotNullParameter(object2, "<this>");
                object3 = object2.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (BannerAdViewModel)((pD3)object).a((yn1_2)object2, (String)object3);
                }
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            case 1: {
                object = (Function0)object;
                Intrinsics.checkNotNullParameter(object, "$onButtonClicked");
                object.invoke();
                return Unit.a;
            }
            case 0: 
        }
        object = (Function0)object;
        Intrinsics.checkNotNullParameter(object, "$onCheckBoxPressed");
        object.invoke();
        return Unit.a;
    }
}

