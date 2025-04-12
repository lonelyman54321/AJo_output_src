/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from D8
 */
public final class d8_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                object2 = (e12_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((e12_0)object2).N0.k(object);
                return Unit.a;
            }
            case 1: {
                object = (Throwable)object;
                object2 = (hq_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = ((hq_2)object2).c;
                Intrinsics.checkNotNull(object);
                object = ((hq_2)object2).a.handleApiException((Throwable)object, "LuxBrandCategory");
                ((LiveData)object3).k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (bl2) {
            object3 = kj0_1.g();
            object2 = ((Fragment)object2).getActivity();
            object = (String)((DataCallback)object).getData();
            ((kj0_1)object3).w((Activity)object2, (String)object);
        }
        return Unit.a;
    }
}

