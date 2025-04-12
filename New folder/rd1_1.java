/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rD1
 */
public final class rd1_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rd1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (ms2_2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                int n4 = 1;
                Object object2 = new l12_0((Fragment)object, n4);
                Object object3 = new pw_2((Function0)object2);
                object2 = "owner";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                String string2 = "factory";
                Intrinsics.checkNotNullParameter(object3, string2);
                rd3_0 rd3_02 = object.getViewModelStore();
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = object.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(rd3_02, "store");
                Intrinsics.checkNotNullParameter(object3, string2);
                Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
                object = op2_2.class;
                string2 = "modelClass";
                object2 = on_2.c(rd3_02, (pw_2)object3, (Wd0)object2, (Class)object, string2);
                object = ef0_0.a((Class)object, string2, string2, "<this>");
                object3 = object.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (op2_2)((pD3)object2).a((yn1_2)object, (String)object3);
                }
                object = "Local and anonymous classes can not be ViewModels".toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            case 1: {
                qz1_2 qz1_22 = (qz1_2)this.b;
                Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
                Boolean bl2 = Boolean.FALSE;
                qz1_22.o.setValue(bl2);
                return Unit.a;
            }
            case 0: 
        }
        vd1_1 vd1_12 = (vd1_1)this.b;
        Intrinsics.checkNotNullParameter(vd1_12, "this$0");
        vd1_12 = vd1_12.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(vd1_12, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)vd1_12);
        return jo_22;
    }
}

