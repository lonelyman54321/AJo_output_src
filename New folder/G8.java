/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.rto.entity.RtoFirebaseData;
import com.ril.ajio.services.data.Order.RtoResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class G8
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ G8(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3;
        int n4;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n7 = this.a;
        switch (n7) {
            default: {
                object = (DataCallback)object;
                object2 = (op2_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((op2_2)object2).v.k(object);
                return Unit.a;
            }
            case 2: {
                object = (Throwable)object;
                object2 = (e12_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                zr1_1 zr1_12 = ((e12_0)object2).N0;
                object2 = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object);
                object3 = object;
                object = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object2, (Throwable)object, "BackGround_GetProductUserSizeRecom", false, null, null, 24, null);
                zr1_12.k(object);
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                object2 = (hq_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((hq_2)object2).f.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (RtoResponseData)object;
        Object object4 = q9_0.Companion;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = ((q9_0)object2).S0;
        n7 = 0;
        object4 = null;
        String string2 = "appPreferences";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object3 = null;
        }
        int n8 = 0;
        n4 = ((sw_0)object3).getPreference("RTO_DIALOG_VISIBILITY_COUNT", 0);
        ((q9_0)object2).Za().d = object;
        Object object5 = ((q9_0)object2).Za().l;
        if (object5 != null) {
            n3 = ((RtoFirebaseData)object5).getVisibilityThreshold();
        } else {
            n3 = 0;
            object5 = null;
        }
        int n10 = 1;
        if (n4 >= n3) {
            ((q9_0)object2).Za().e(n10 != 0);
            object5 = ((q9_0)object2).S0;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object5 = null;
            }
            ((jo_2)object5).C(0);
        }
        if ((n3 = (int)(EQ2.a ? 1 : 0)) == 0) {
            object5 = ((q9_0)object2).Za().l;
            if (object5 != null) {
                n8 = ((RtoFirebaseData)object5).getVisibilityThreshold();
            }
            if (n4 < n8) {
                object5 = ((q9_0)object2).S0;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object4 = object5;
                }
                ((jo_2)object4).C(n4 += n10);
                N81.Companion.getClass();
                object3 = new N81();
                object4 = new Bundle();
                string2 = "rto_data";
                object4.putParcelable(string2, (Parcelable)object);
                ((Fragment)object3).setArguments((Bundle)object4);
                object = ((Fragment)object2).getChildFragmentManager();
                object2 = ((Fragment)object2).getTag();
                ((DialogFragment)object3).show((FragmentManager)object, (String)object2);
            }
        }
        return Unit.a;
    }
}

