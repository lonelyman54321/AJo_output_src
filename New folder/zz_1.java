/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.lifecycle.E$b;
import androidx.lifecycle.f;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZZ
 */
public final class zz_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zz_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object;
        int n3 = this.a;
        switch (n3) {
            default: {
                return m.d((Context)this.b);
            }
            case 1: {
                Object object2 = (pj0_2)this.b;
                String string2 = "this$0";
                Intrinsics.checkNotNullParameter(object2, string2);
                object2 = ((pj0_2)object2).f;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                    n3 = 0;
                    object2 = null;
                }
                object2.v1();
                return Unit.a;
            }
            case 0: 
        }
        Object object3 = (e00)this.b;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = ((e00)object3).j;
        object3 = "owner";
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        Object object5 = object4.getViewModelStore();
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        boolean bl2 = object4 instanceof f;
        if (bl2) {
            object = object4;
            object = ((f)object4).getDefaultViewModelProviderFactory();
        } else {
            object = tn0_0.a;
        }
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object4 = bl2 ? ((f)object4).getDefaultViewModelCreationExtras() : Wd0$a.b;
        Intrinsics.checkNotNullParameter(object5, "store");
        Intrinsics.checkNotNullParameter(object, "factory");
        Intrinsics.checkNotNullParameter(object4, "defaultCreationExtras");
        object3 = BannerAdViewModel.class;
        String string3 = "modelClass";
        object4 = rl3_0.b((rd3_0)object5, (E$b)object, (Wd0)object4, object3, string3);
        object3 = ef0_0.a(object3, string3, string3, "<this>");
        object5 = object3.getQualifiedName();
        if (object5 != null) {
            object5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object5);
            return (BannerAdViewModel)((pD3)object4).a((yn1_2)object3, (String)object5);
        }
        object3 = "Local and anonymous classes can not be ViewModels".toString();
        object4 = new IllegalArgumentException((String)object3);
        throw object4;
    }
}

