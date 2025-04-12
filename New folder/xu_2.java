/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xu
 */
public final class xu_2
implements FunctionAdapter {
    public final /* synthetic */ Function1 a;

    public xu_2(fv_2 fv_22) {
        Intrinsics.checkNotNullParameter(fv_22, "function");
        this.a = fv_22;
    }

    public final void a(View view) {
        this.a.invoke(view);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof xu_2;
        boolean bl3 = false;
        if (bl2 && (bl2 = object instanceof FunctionAdapter)) {
            fx0_2 fx0_22 = this.a;
            object = ((FunctionAdapter)object).getFunctionDelegate();
            bl3 = Intrinsics.areEqual(fx0_22, object);
        }
        return bl3;
    }

    public final fx0_2 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return ((fx0_2)this.a).hashCode();
    }
}

