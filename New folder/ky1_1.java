/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.E$b;
import com.ril.ajio.stl.fragment.ShopTheLookFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kY1
 */
public final class ky1_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ky1_1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                ShopTheLookFragment shopTheLookFragment = (ShopTheLookFragment)this.b;
                Intrinsics.checkNotNullParameter(shopTheLookFragment, "this$0");
                shopTheLookFragment = shopTheLookFragment.requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(shopTheLookFragment, "getApplication(...)");
                return new e43_0((Application)shopTheLookFragment);
            }
            case 1: {
                Object object = (mz2_0)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = ((Fragment)object).getParentFragment();
                if (object2 == null) return null;
                if ((object2 = ((Fragment)object2).getParentFragment()) == null) return null;
                Application application = ((Fragment)object).requireActivity().getApplication();
                Object object3 = new ez2_0(application, (mz2_0)object);
                object = new pw_2((Function0)object3);
                String string2 = "owner";
                Intrinsics.checkNotNullParameter(object2, string2);
                object3 = "factory";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                rd3_0 rd3_02 = object2.getViewModelStore();
                String string3 = "store";
                object2 = oh2_0.a((Fragment)object2, string2, rd3_02, string3);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
                Class<F12> clazz = F12.class;
                object3 = "modelClass";
                object2 = on_2.c(rd3_02, (pw_2)object, (Wd0)object2, clazz, (String)object3);
                object = ef0_0.a(clazz, (String)object3, (String)object3, "<this>");
                String string4 = object.getQualifiedName();
                if (string4 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                    String string5 = ((String)object3).concat(string4);
                    return (F12)((pD3)object2).a((yn1_2)object, string5);
                }
                object = "Local and anonymous classes can not be ViewModels".toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            case 0: 
        }
        Object object = (oy1_1)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object4 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        rd3_0 rd3_03 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object4);
        E$b e$b = object.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object4 = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_03, "store");
        Intrinsics.checkNotNullParameter(e$b, "factory");
        object4 = li_2.a((Wd0)object4, "defaultCreationExtras", rd3_03, e$b, (Wd0)object4);
        object = r43_0.class;
        String string6 = "modelClass";
        object = do_0.a((Class)object, string6, (Class)object, string6, string6);
        Intrinsics.checkNotNullParameter(object, "<this>");
        String string7 = object.getQualifiedName();
        if (string7 != null) {
            String string8 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(string7);
            return (r43_0)((pD3)object4).a((yn1_2)object, string8);
        }
        object = "Local and anonymous classes can not be ViewModels".toString();
        object4 = new IllegalArgumentException((String)object);
        throw object4;
    }
}

