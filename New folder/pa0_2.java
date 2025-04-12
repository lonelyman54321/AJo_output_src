/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.E$b;
import com.ril.ajio.data.repo.AddressRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pa0
 */
public final class pa0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pa0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = fq0_2.Companion;
                object = (fq0_2)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object2 = kd3_2.a();
                Object object3 = new AddressRepo();
                Object object4 = ((Fragment)object).requireActivity().getApplication();
                ((kd3_2)object2).a = object3;
                ((kd3_2)object2).b = object4;
                object = ((Fragment)object).requireActivity();
                Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
                Intrinsics.checkNotNull(object2);
                object3 = "owner";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object4 = "factory";
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                rd3_0 rd3_02 = object.getViewModelStore();
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object = object.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(rd3_02, "store");
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
                object3 = new pD3(rd3_02, (E$b)object2, (Wd0)object);
                object = h5_0.class;
                object2 = "modelClass";
                object = do_0.a(object, (String)object2, object, (String)object2, (String)object2);
                Intrinsics.checkNotNullParameter(object, "<this>");
                object2 = object.getQualifiedName();
                if (object2 != null) {
                    object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
                    return (h5_0)((pD3)object3).a((yn1_2)object, (String)object2);
                }
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            case 0: 
        }
        object = (Function0)object;
        Intrinsics.checkNotNullParameter(object, "$onBackPressed");
        object.invoke();
        return Unit.a;
    }
}

