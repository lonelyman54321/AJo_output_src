/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.E$b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from k8
 */
public final class k8_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        Object object = "Local and anonymous classes can not be ViewModels";
        Object object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
        Object object3 = "<this>";
        Object object4 = "modelClass";
        Class<F12> clazz = "defaultCreationExtras";
        Object object5 = "store";
        String string2 = "factory";
        Object object6 = "owner";
        Object object7 = "this$0";
        Object object8 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object8 = (Function0)object8;
                Intrinsics.checkNotNullParameter(object8, "$onCloseButtonClicked");
                object8.invoke();
                return Unit.a;
            }
            case 2: {
                object8 = (e12_0)object8;
                Intrinsics.checkNotNullParameter(object8, (String)object7);
                object = z40_0.Companion;
                object2 = ((e12_0)object8).a;
                object.getClass();
                return z40$a.a((Context)object2).a.a("enable_urgency_driver_pdp");
            }
            case 1: {
                object8 = (iq_0)object8;
                Intrinsics.checkNotNullParameter(object8, (String)object7);
                object7 = ((Fragment)object8).getParentFragment();
                if (object7 == null) return null;
                Application application = ((Fragment)object8).requireActivity().getApplication();
                hq_1 hq_12 = new hq_1(application, (iq_0)object8);
                object8 = new pw_2(hq_12);
                Intrinsics.checkNotNullParameter(object7, (String)object6);
                Intrinsics.checkNotNullParameter(object8, string2);
                rd3_0 rd3_02 = object7.getViewModelStore();
                object5 = oh2_0.a((Fragment)object7, (String)object6, rd3_02, (String)object5);
                Intrinsics.checkNotNullParameter(object8, string2);
                Intrinsics.checkNotNullParameter(object5, (String)((Object)clazz));
                clazz = F12.class;
                object5 = on_2.c(rd3_02, (pw_2)object8, object5, clazz, (String)object4);
                object3 = ef0_0.a(clazz, (String)object4, (String)object4, (String)object3);
                object4 = object3.getQualifiedName();
                if (object4 != null) {
                    object = ((String)object2).concat((String)object4);
                    return (F12)((pD3)object5).a((yn1_2)object3, (String)object);
                }
                object = object.toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            case 0: 
        }
        q9$a q9$a = q9_0.Companion;
        object8 = (q9_0)object8;
        Intrinsics.checkNotNullParameter(object8, (String)object7);
        Intrinsics.checkNotNullParameter(object8, (String)object6);
        object7 = object8.getViewModelStore();
        Intrinsics.checkNotNullParameter(object8, (String)object6);
        E$b e$b = ((z41_0)object8).getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object8, (String)object6);
        object6 = object8.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object7, (String)object5);
        Intrinsics.checkNotNullParameter(e$b, string2);
        clazz = li_2.a((Wd0)object6, (String)((Object)clazz), (rd3_0)object7, e$b, (Wd0)object6);
        object5 = tf2_2.class;
        object4 = do_0.a(object5, (String)object4, object5, (String)object4, (String)object4);
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object3 = object4.getQualifiedName();
        if (object3 != null) {
            object = ((String)object2).concat((String)object3);
            return (tf2_2)((pD3)((Object)clazz)).a((yn1_2)object4, (String)object);
        }
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

