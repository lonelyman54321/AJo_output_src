/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks2
 */
import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from g8
 */
public final class g8_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ g8_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
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
        Object object7 = this.b;
        Object object8 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object7 = (fB)object7;
                Intrinsics.checkNotNullParameter(object7, (String)object8);
                object8 = ((Fragment)object7).getParentFragment();
                if (object8 == null) return null;
                if ((object8 = ((Fragment)object8).getParentFragment()) == null) return null;
                object7 = ((Fragment)object7).requireActivity().getApplication();
                int n4 = 1;
                Object object9 = new j8_0((ComponentCallbacks2)object7, n4);
                object7 = new pw_2((Function0)object9);
                Intrinsics.checkNotNullParameter(object8, (String)object6);
                Intrinsics.checkNotNullParameter(object7, string2);
                object9 = object8.getViewModelStore();
                object5 = oh2_0.a((Fragment)object8, (String)object6, (rd3_0)object9, object5);
                Intrinsics.checkNotNullParameter(object7, string2);
                Intrinsics.checkNotNullParameter(object5, (String)((Object)clazz));
                clazz = F12.class;
                object5 = on_2.c((rd3_0)object9, (pw_2)object7, (Wd0)object5, clazz, (String)object4);
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
        object7 = (q9_0)object7;
        Intrinsics.checkNotNullParameter(object7, (String)object8);
        object7 = ((Fragment)object7).requireActivity();
        Intrinsics.checkNotNullExpressionValue(object7, "requireActivity(...)");
        Intrinsics.checkNotNullParameter(object7, (String)object6);
        object8 = object7.getViewModelStore();
        object6 = cX1.a((FragmentActivity)object7, (String)object6, (FragmentActivity)object7, (String)object6);
        object5 = dX1.a((FragmentActivity)object7, (rd3_0)object8, (String)object5, (E$b)object6, string2);
        clazz = li_2.a((Wd0)object5, (String)((Object)clazz), (rd3_0)object8, (E$b)object6, (Wd0)object5);
        object5 = bu2_0.class;
        object4 = do_0.a(object5, (String)object4, object5, (String)object4, (String)object4);
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object3 = object4.getQualifiedName();
        if (object3 != null) {
            object = ((String)object2).concat((String)object3);
            return (bu2_0)((pD3)((Object)clazz)).a((yn1_2)object4, (String)object);
        }
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

