/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eW0
 */
public final class ew0_2
implements Function1 {
    public final /* synthetic */ tr1_0 a;
    public final /* synthetic */ FragmentManager b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ tr1_0 d;

    public /* synthetic */ ew0_2(tr1_0 tr1_02, FragmentManager fragmentManager, Function2 function2, tr1_0 tr1_03) {
        this.a = tr1_02;
        this.b = fragmentManager;
        this.c = function2;
        this.d = tr1_03;
    }

    public final Object invoke(Object object) {
        object = (Context)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$container");
        Function2 function2 = this.c;
        Intrinsics.checkNotNullParameter(function2, "$fragentContainerFunc");
        tr1_0 tr1_02 = this.d;
        Intrinsics.checkNotNullParameter(tr1_02, "$containerId$delegate");
        Intrinsics.checkNotNullParameter(object, "context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView((Context)object);
        long l2 = ((Number)tr1_02.getValue()).longValue();
        int n3 = (int)l2;
        fragmentContainerView.setId(n3);
        object2.setValue((Object)fragmentContainerView);
        object = this.b;
        if (object != null) {
            object2 = new a((FragmentManager)object);
            n3 = fragmentContainerView.getId();
            object = n3;
            function2.invoke(object2, object);
        }
        return fragmentContainerView;
    }
}

