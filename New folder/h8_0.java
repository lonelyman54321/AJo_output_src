/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from h8
 */
public final class h8_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (qz1_2)object;
                Intrinsics.checkNotNullParameter(object, "$viewModel");
                object = ((qz1_2)object).k;
                Boolean bl2 = Boolean.TRUE;
                ((h83_0)object).setValue(bl2);
                return Unit.a;
            }
            case 0: 
        }
        Object object2 = q9_0.Companion;
        object = (q9_0)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object2 = ((Fragment)object).requireActivity().getApplication();
        Object object3 = new Z8((Application)object2, (q9_0)object);
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
        object = on_2.c(rd3_02, (pw_2)object2, (Wd0)object, object3, string2);
        object2 = ef0_0.a(object3, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (F12)((pD3)object).a((yn1_2)object2, (String)object3);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

