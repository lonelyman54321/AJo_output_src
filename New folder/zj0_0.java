/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.ril.ajio.R$anim;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zj0
 */
public abstract class zj0_0 {
    public final Activity a;
    public final jo_2 b;

    public zj0_0(Activity activity) {
        jo_2 jo_22;
        this.a = activity;
        activity = activity.getApplication();
        this.b = jo_22 = new jo_2((Context)activity);
    }

    public static void a(Fragment object, Fragment object2, int n3, String string2) {
        if (object != null && n3 != 0) {
            object = ((Fragment)object).getChildFragmentManager();
            object.getClass();
            a a2 = new a((FragmentManager)object);
            a2.j(n3, (Fragment)object2, string2);
            int bl2 = R$anim.alpha_anim;
            a2.k(bl2, bl2, 0, 0);
            a2.c(string2);
            boolean bl3 = true;
            a2.o(bl3, bl3);
            return;
        }
        object = new Object[]{};
        object2 = yn3_0.a;
        String string3 = "Can not add fragment in DeeplinkHandler ";
        ((yn3$a)object2).d(string3, (Object[])object);
        Intrinsics.checkNotNullParameter(string3, "res");
    }
}

