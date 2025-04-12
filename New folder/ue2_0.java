/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 */
import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.viewpager2.widget.ViewPager2;
import com.ril.ajio.R$id;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uE2
 */
public final class ue2_0
extends RecyclerView$B {
    public final View a;
    public final ViewPager2 b;
    public ue2$a_0 c;

    public ue2_0(View object) {
        Intrinsics.checkNotNullParameter(object, "containerView");
        super((View)object);
        this.a = object;
        int n3 = R$id.rating_view_pager;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (ViewPager2)((Object)object);
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void w(String string2) {
        Exception exception2;
        Object object;
        Object[] objectArray;
        block4: {
            ViewPager2 viewPager2;
            int n3;
            int n4;
            block3: {
                Intrinsics.checkNotNullParameter(string2, "sourcePage");
                objectArray = null;
                object = "LP";
                try {
                    n4 = Intrinsics.areEqual(string2, object);
                    n3 = 7;
                    viewPager2 = this.b;
                    if (n4 == 0) break block3;
                }
                catch (Exception exception2) {
                    break block4;
                }
                n4 = mz3_0.d(0);
                ai0_2.u(0, n4, n3, (View)viewPager2);
                this.x(string2);
                return;
            }
            n4 = 24;
            n4 = mz3_0.d(n4);
            ai0_2.u(0, n4, n3, (View)viewPager2);
            object = this.c;
            if (object != null) return;
            this.x(string2);
            return;
        }
        object = yn3_0.a;
        String string3 = exception2.getLocalizedMessage();
        String string4 = "Exception while attaching fragment: ";
        string3 = kp1_0.c(string4, string3);
        objectArray = new Object[]{};
        ((yn3$a)object).a(string3, objectArray);
    }

    public final void x(String object) {
        ue2$a_0 ue2$a_0;
        Object object2 = zv0_2.b(this.itemView.getContext());
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.app.Activity");
        object2 = (Activity)object2;
        object2 = (AjioHomeActivity)object2;
        this.c = ue2$a_0 = new ue2$a_0((AjioHomeActivity)object2, (String)object);
        object = this.b;
        ((ViewPager2)((Object)object)).setOrientation(0);
        ((ViewPager2)((Object)object)).setUserInputEnabled(false);
        ue2$a_0 = this.c;
        ((ViewPager2)((Object)object)).setAdapter(ue2$a_0);
        ((ViewPager2)((Object)object)).setCurrentItem(0);
    }
}

