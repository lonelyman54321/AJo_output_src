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
 * Renamed from cd3
 */
public final class cd3_2
implements Function0 {
    public final /* synthetic */ ed3_2 a;

    public /* synthetic */ cd3_2(ed3_2 ed3_22) {
        this.a = ed3_22;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((Fragment)object).requireActivity().getApplication();
        Object object3 = new xc3_2((Application)object2, (ed3_2)object);
        object2 = new pw_2((Function0)object3);
        object3 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object2, string2);
        rd3_0 rd3_02 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object2, string2);
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object3 = F12.class;
        string2 = "modelClass";
        object2 = on_2.c(rd3_02, (pw_2)object2, (Wd0)object, object3, string2);
        object = ef0_0.a(object3, string2, string2, "<this>");
        object3 = object.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (F12)((pD3)object2).a((yn1_2)object, (String)object3);
        }
        object = "Local and anonymous classes can not be ViewModels".toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

