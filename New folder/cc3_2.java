/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CC3
 */
public final class cc3_2
implements be2_2,
jm0_1 {
    public BC3 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Fragment c;

    public cc3_2(Function1 function1, Fragment fragment) {
        this.b = function1;
        this.c = fragment;
    }

    public final /* synthetic */ void A(mu1_1 mu1_12) {
        im0.a(mu1_12);
    }

    public final Object b(gn1_2 object, Object object2) {
        object2 = (Fragment)object2;
        Object object3 = "thisRef";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2 = "property";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = this.a;
        if (object == null) {
            object = this.c;
            object2 = ((Fragment)object).requireView();
            Intrinsics.checkNotNullExpressionValue(object2, "requireView(...)");
            object2 = (BC3)this.b.invoke(object2);
            object3 = ((Fragment)object).getViewLifecycleOwner().getLifecycle().b();
            i$b i$b = i$b.INITIALIZED;
            boolean bl2 = ((i$b)((Object)object3)).isAtLeast(i$b);
            if (bl2) {
                object = ((Fragment)object).getViewLifecycleOwner().getLifecycle();
                ((i)object).a(this);
                this.a = object2;
            }
            object = object2;
        }
        return object;
    }

    public final void onDestroy(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
        this.a = null;
    }

    public final /* synthetic */ void onStart(mu1_1 mu1_12) {
        im0.c(mu1_12);
    }

    public final void onStop(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final /* synthetic */ void p(mu1_1 mu1_12) {
        im0.b(mu1_12);
    }

    public final void w(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }
}

