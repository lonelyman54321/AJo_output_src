/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l;

/*
 * Renamed from kF
 */
public final class kf_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kf_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     */
    public final Object invoke() {
        int bl2 = this.a;
        switch (bl2) {
            default: {
                void var1_5;
                Object object = (bb1_1)this.b;
                String string2 = "$progress$delegate";
                Intrinsics.checkNotNullParameter(object, string2);
                object = (Number)object.getValue();
                float f5 = ((Number)object).floatValue();
                float f6 = 1.0f;
                float f7 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
                if (f7 == false) {
                    boolean bl3 = true;
                    f5 = Float.MIN_VALUE;
                } else {
                    boolean bl4 = false;
                    f5 = 0.0f;
                    object = null;
                }
                return (boolean)var1_5;
            }
            case 1: {
                Object object = (so0_2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = ((Fragment)object).requireActivity();
                Intrinsics.checkNotNullExpressionValue(object2, "requireActivity(...)");
                object = "owner";
                Intrinsics.checkNotNullParameter(object2, (String)object);
                Object object3 = object2.getViewModelStore();
                object = cX1.a((FragmentActivity)object2, (String)object, (FragmentActivity)object2, (String)object);
                String string3 = "factory";
                object2 = dX1.a((FragmentActivity)object2, (rd3_0)object3, "store", (E$b)object, string3);
                String string4 = "defaultCreationExtras";
                object2 = li_2.a((Wd0)object2, string4, (rd3_0)object3, (E$b)object, (Wd0)object2);
                object = io2_1.class;
                object3 = "modelClass";
                object = do_0.a(object, (String)object3, object, (String)object3, (String)object3);
                Intrinsics.checkNotNullParameter(object, "<this>");
                object3 = object.getQualifiedName();
                if (object3 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
                    return (io2_1)((pD3)object2).a((yn1_2)object, (String)object3);
                }
                object = "Local and anonymous classes can not be ViewModels".toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            case 0: 
        }
        mF$a mF$a = (mF$a)this.b;
        mF$a.getClass();
        e01_0 e01_02 = e01_0.a;
        l l2 = ir0_2.b;
        mf_2 mf_22 = mF$a.c;
        lf_2 lf_22 = new lf_2(mf_22, mF$a, null);
        return kf_1.e(e01_02, l2, lf_22, 2);
    }
}

