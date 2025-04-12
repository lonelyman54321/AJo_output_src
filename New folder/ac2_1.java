/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.view.BaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ac2
 */
public final class ac2_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public ac2_1(Activity activity, String string2, String string3, f80_0 f80_02) {
        this.a = activity;
        this.b = string2;
        this.c = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.b;
        String string3 = this.c;
        Activity activity = this.a;
        object = new ac2_1(activity, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ac2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ac2_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        boolean bl2 = object instanceof BaseActivity;
        if (bl2) {
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
            object = ((AjioHomeActivity)object).T0;
            bl2 = false;
            object2 = null;
            object = object != null ? ((Fragment)object).getChildFragmentManager() : null;
            if (object != null) {
                object2 = ((FragmentManager)object).E("OrderSummaryFragment");
            }
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment");
            object2 = (bg2_1)object2;
            object = this.c;
            Intrinsics.checkNotNull(object);
            object2.getClass();
            String string2 = this.b;
            Intrinsics.checkNotNullParameter(string2, "orderId");
            Object object3 = "shipmentCode";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            ((bg2_1)object2).r = string2;
            ((bg2_1)object2).s = object;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                object2 = ((bg2_1)object2).Pa();
                ((qz1_2)object2).i(string2, (String)object);
            } else {
                String string3;
                object3 = ((Fragment)object2).requireActivity();
                n3 = t70.checkSelfPermission((Context)object3, string3 = "android.permission.WRITE_EXTERNAL_STORAGE");
                if (n3 == 0) {
                    object2 = ((bg2_1)object2).Pa();
                    ((qz1_2)object2).i(string2, (String)object);
                } else {
                    object = ((bg2_1)object2).y;
                    ((I3)object).a(string3);
                }
            }
        }
        return Unit.a;
    }
}

