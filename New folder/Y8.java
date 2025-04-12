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

public final class Y8
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ Y8(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke() {
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (o12_0)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                n3 = 2;
                object2 = new pc0_0(object, n3);
                Object object3 = new pw_2((Function0)object2);
                object2 = "owner";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                String string2 = "factory";
                Intrinsics.checkNotNullParameter(object3, string2);
                rd3_0 rd3_02 = object.getViewModelStore();
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = object.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(rd3_02, "store");
                Intrinsics.checkNotNullParameter(object3, string2);
                Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
                object2 = hy3_0.class;
                string2 = "modelClass";
                object = on_2.c(rd3_02, (pw_2)object3, (Wd0)object, object2, string2);
                object2 = ef0_0.a(object2, string2, string2, "<this>");
                object3 = object2.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (hy3_0)((pD3)object).a((yn1_2)object2, (String)object3);
                }
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            case 0: 
        }
        q9$a q9$a = q9_0.Companion;
        object = (q9_0)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((q9_0)object).P0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("app");
            object = null;
        }
        object2 = new b52_0((Application)object);
        return object2;
    }
}

