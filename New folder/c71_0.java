/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Home.UserUnratedItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from C71
 */
public final class c71_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ c71_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (String)object;
                object2 = (g)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((g)object2).c;
                if (object != null) {
                    object.h();
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (Float)object;
        object2 = (i71_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        if (object != null) {
            float f5 = ((Number)object).floatValue();
            float f6 = 0.0f;
            object3 = null;
            float f7 = f5 - 0.0f;
            Object object4 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object4 == false) {
                ((i71_0)object2).Ra();
            } else {
                object3 = ((i71_0)object2).d;
                if (object3 != null) {
                    n3 = ((i71_0)object2).g;
                    object3 = (UserUnratedItem)CollectionsKt.N(n3, (List)object3);
                } else {
                    object4 = false;
                    f6 = 0.0f;
                    object3 = null;
                }
                if (object3 != null) {
                    Object object5 = Boolean.TRUE;
                    ((UserUnratedItem)object3).setItemRated((Boolean)object5);
                    object5 = Float.valueOf(f5);
                    ((UserUnratedItem)object3).setProductRating((Float)object5);
                    object5 = ((i71_0)object2).d;
                    if (object5 != null) {
                        int n4 = ((i71_0)object2).g;
                        object3 = (UserUnratedItem)((ArrayList)object5).set(n4, object3);
                    }
                    if ((object3 = ((i71_0)object2).f) != null) {
                        n3 = ((i71_0)object2).g;
                        ((RecyclerView$f)object3).notifyItemChanged(n3);
                    }
                    object5 = Looper.getMainLooper();
                    object3 = new Handler((Looper)object5);
                    object5 = new H71((i71_0)object2);
                    long l2 = 1500L;
                    object3.postDelayed((Runnable)object5, l2);
                }
            }
            object3 = h40_0.a;
            object4 = h40_0.v1();
            if (object4 != false) {
                object4 = 0x40800000;
                f6 = 4.0f;
                float f8 = f5 - f6;
                Object object6 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                if (object6 >= 0) {
                    object = ((i71_0)object2).p;
                    object4 = false;
                    f6 = 0.0f;
                    object3 = null;
                    object2 = new e71_0(0);
                    ((lq2_1)object).a((Function1)object2);
                }
            }
        } else {
            ((i71_0)object2).Ra();
        }
        return Unit.a;
    }
}

