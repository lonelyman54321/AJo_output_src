/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$n;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fN
 */
public final class fn_2
implements FragmentManager$n {
    public final /* synthetic */ qn_2 a;

    public /* synthetic */ fn_2(qn_2 qn_22) {
        this.a = qn_22;
    }

    public final void a() {
        Object object = qn_2.Companion;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((Fragment)object).getChildFragmentManager();
        int n3 = ((FragmentManager)object2).J();
        int n4 = 1;
        if (n3 >= n4) {
            n3 = ((Fragment)object).getChildFragmentManager().J() - n4;
            object2 = ((Fragment)object).getChildFragmentManager().I(n3);
            String string2 = "getBackStackEntryAt(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            object2 = object2.getName();
            object = ((Fragment)object).getChildFragmentManager().E((String)object2);
            n3 = object instanceof ic1_2;
            if (n3 != 0) {
                object = (ic1_2)object;
                object.R9();
            }
        }
    }
}

