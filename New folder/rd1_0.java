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
 * Renamed from RD1
 */
public final class rd1_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rd1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (xp2_2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = ((Fragment)object).requireActivity().getApplication();
                Object object3 = new sp2_1((Application)object2, (xp2_2)object);
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
            case 0: 
        }
        bf1_2 bf1_22 = (bf1_2)this.b;
        Intrinsics.checkNotNullParameter(bf1_22, "$viewModel");
        bf1_22.b();
        return Unit.a;
    }
}

