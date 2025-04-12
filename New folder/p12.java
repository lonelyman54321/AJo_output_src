/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.NewPlpRepo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class p12
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ p12(Fragment fragment, int n3) {
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
                Object object = (xp2_2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Application application = ((Fragment)object).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                object = (NewPlpRepo)((xp2_2)object).G.getValue();
                return new e12_0(application, (NewPlpRepo)object);
            }
            case 0: 
        }
        Object object = (s12)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((Fragment)object).getParentFragment();
        if (object2 == null) return null;
        Application application = ((Fragment)object).requireActivity().getApplication();
        Object object3 = new q12(application, (s12)object);
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
}

