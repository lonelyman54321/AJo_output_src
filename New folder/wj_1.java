/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from wj
 */
public final class wj_1
extends Lambda
implements Function1 {
    public final /* synthetic */ FragmentManager c;

    public wj_1(FragmentManager fragmentManager) {
        this.c = fragmentManager;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (FragmentContainerView)((Object)object);
        Object object2 = this.c;
        if (object2 != null) {
            int n3 = object.getId();
            object = ((FragmentManager)object2).D(n3);
        } else {
            boolean bl3 = false;
            object = null;
        }
        if (object != null && !(bl2 = ((FragmentManager)object2).S())) {
            a a2 = new a((FragmentManager)object2);
            object2 = "beginTransaction()";
            Intrinsics.checkNotNullExpressionValue(a2, (String)object2);
            a2.i((Fragment)object);
            a2.p();
        }
        return Unit.a;
    }
}

