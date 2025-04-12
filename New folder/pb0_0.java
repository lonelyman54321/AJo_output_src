/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.navigation.e;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pb0
 */
public final class pb0_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pb0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (NewProductDetailsFragment)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = ((Fragment)object).requireActivity();
                Intrinsics.checkNotNullExpressionValue(object2, "requireActivity(...)");
                object = "owner";
                Intrinsics.checkNotNullParameter(object2, (String)object);
                Object object3 = object2.getViewModelStore();
                object = cX1.a((FragmentActivity)object2, (String)object, (FragmentActivity)object2, (String)object);
                String string2 = "factory";
                object2 = dX1.a((FragmentActivity)object2, (rd3_0)object3, "store", (E$b)object, string2);
                String string3 = "defaultCreationExtras";
                object2 = li_2.a((Wd0)object2, string3, (rd3_0)object3, (E$b)object, (Wd0)object2);
                object = bu2_0.class;
                object3 = "modelClass";
                object = do_0.a(object, (String)object3, object, (String)object3, (String)object3);
                Intrinsics.checkNotNullParameter(object, "<this>");
                object3 = object.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (bu2_0)((pD3)object2).a((yn1_2)object, (String)object3);
                }
                object = "Local and anonymous classes can not be ViewModels".toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            case 0: 
        }
        yT1 yT12 = (yT1)this.b;
        Intrinsics.checkNotNullParameter(yT12, "$navController");
        e.p(yT12, "finish/coupon bonanza - coupons list screen", null, 6);
        return Unit.a;
    }
}

