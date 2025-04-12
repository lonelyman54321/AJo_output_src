/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TY0
 */
public final class ty0_1
implements Function0 {
    public final /* synthetic */ vy0_0 a;

    public /* synthetic */ ty0_1(vy0_0 vy0_02) {
        this.a = vy0_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((Fragment)object).getParentFragment();
        if (object2 == null) return null;
        if ((object2 = ((Fragment)object2).getParentFragment()) == null) return null;
        Application application = ((Fragment)object).requireActivity().getApplication();
        Object object3 = new uy0_0(application, (vy0_0)object);
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

