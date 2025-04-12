/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MC0
 */
public final class mc0_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ mc0_1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke() {
        String string2 = "Local and anonymous classes can not be ViewModels";
        Object object = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
        Object object2 = "<this>";
        String string3 = "modelClass";
        Class<e12_0> clazz = e12_0.class;
        Object object3 = "defaultCreationExtras";
        String string4 = "store";
        String string5 = "factory";
        Object object4 = "owner";
        Fragment fragment = this.b;
        Object object5 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                fragment = (o12_0)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object5);
                object5 = new m12_0((o12_0)fragment);
                pw_2 pw_22 = new pw_2((Function0)object5);
                Intrinsics.checkNotNullParameter(fragment, (String)object4);
                Intrinsics.checkNotNullParameter(pw_22, string5);
                object5 = fragment.getViewModelStore();
                Intrinsics.checkNotNullParameter(fragment, (String)object4);
                object4 = fragment.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object5, string4);
                Intrinsics.checkNotNullParameter(pw_22, string5);
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object3 = on_2.c((rd3_0)object5, pw_22, (Wd0)object4, clazz, string3);
                object2 = ef0_0.a(clazz, string3, string3, (String)object2);
                string3 = object2.getQualifiedName();
                if (string3 != null) {
                    string2 = ((String)object).concat(string3);
                    return (e12_0)((pD3)object3).a((yn1_2)object2, string2);
                }
                string2 = string2.toString();
                object = new IllegalArgumentException(string2);
                throw object;
            }
            case 0: 
        }
        Object object6 = rc0_2.Companion;
        fragment = (rc0_2)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object5);
        n3 = 0;
        object5 = new pc0_0(fragment, 0);
        object6 = new pw_2((Function0)object5);
        Intrinsics.checkNotNullParameter(fragment, (String)object4);
        Intrinsics.checkNotNullParameter(object6, string5);
        object5 = fragment.getViewModelStore();
        Intrinsics.checkNotNullParameter(fragment, (String)object4);
        object4 = fragment.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object5, string4);
        Intrinsics.checkNotNullParameter(object6, string5);
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object3 = on_2.c((rd3_0)object5, (pw_2)object6, (Wd0)object4, clazz, string3);
        object2 = ef0_0.a(clazz, string3, string3, (String)object2);
        string3 = object2.getQualifiedName();
        if (string3 != null) {
            string2 = ((String)object).concat(string3);
            return (e12_0)((pD3)object3).a((yn1_2)object2, string2);
        }
        string2 = string2.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }
}

