/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$n;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bp
 */
public final class bp_2
implements FragmentManager$n {
    public final /* synthetic */ FragmentManager a;

    public /* synthetic */ bp_2(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void a() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$this_setupForAccessibility");
        Object object2 = ((FragmentManager)object).c.f();
        Object object3 = "getFragments(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (Fragment)CollectionsKt.S((List)object2);
        if (object2 != null) {
            boolean bl2;
            object = ((FragmentManager)object).c.f().iterator();
            while (bl2 = object.hasNext()) {
                int n3;
                View view;
                object3 = (Fragment)object.next();
                int n4 = Intrinsics.areEqual(object3, object2);
                if (n4 != 0) {
                    view = ((Fragment)object3).getView();
                    if (view != null) {
                        n3 = 0;
                        view.setVisibility(0);
                    }
                    if ((object3 = ((Fragment)object3).getView()) == null) continue;
                    n4 = 1;
                    object3.setImportantForAccessibility(n4);
                    continue;
                }
                view = ((Fragment)object3).getView();
                if (view != null) {
                    n3 = 8;
                    view.setVisibility(n3);
                }
                if ((object3 = ((Fragment)object3).getView()) == null) continue;
                n4 = 4;
                object3.setImportantForAccessibility(n4);
            }
        }
    }
}

