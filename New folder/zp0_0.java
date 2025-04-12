/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZP0
 */
public final class zp0_0
implements Function2 {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ String b;

    public /* synthetic */ zp0_0(Fragment fragment, String string2) {
        this.a = fragment;
        this.b = string2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (k)object;
        int n3 = (Integer)object2;
        Object object3 = fq0_2.Companion;
        object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "$fragment");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$tag");
        Intrinsics.checkNotNullParameter(object, "<this>");
        ((k)object).j(n3, (Fragment)object3, string2);
        ((k)object).e();
        return Unit.a;
    }
}

