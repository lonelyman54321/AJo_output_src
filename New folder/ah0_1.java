/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.pdprefresh.fragments.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ah0
 */
public final class ah0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ah0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        IllegalStateException illegalStateException2;
        Object object2;
        block7: {
            block6: {
                int n3 = this.a;
                switch (n3) {
                    default: {
                        Object object3 = object;
                        object3 = (Throwable)object;
                        Object object4 = (hy3_0)this.b;
                        Intrinsics.checkNotNullParameter(object4, "this$0");
                        object = ((hy3_0)object4).w;
                        ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                        Intrinsics.checkNotNull(object3);
                        object4 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object3, "BackGround_GET_GPS_DATA", false, null, null, 28, null);
                        ((LiveData)object).k(object4);
                        return Unit.a;
                    }
                    case 0: 
                }
                object = (String)object;
                object2 = (e)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                Intrinsics.checkNotNullParameter(object, "it");
                Object object5 = "TOPBAR";
                boolean bl2 = Intrinsics.areEqual(object, object5);
                if (!bl2) {
                    object5 = ((e)object2).Pa();
                    ((yh0_0)object5).e();
                    object2 = ((Fragment)object2).getActivity();
                    if (object2 == null) return Unit.a;
                    if ((object2 = ((FragmentActivity)object2).getSupportFragmentManager()) == null) return Unit.a;
                    u93_0.Companion.getClass();
                    Intrinsics.checkNotNullParameter(object, "sortFilter");
                    object5 = new u93_0();
                    Bundle bundle = new Bundle();
                    String string2 = "SORT_FILTER_PAGE_SOURCE";
                    bundle.putString(string2, (String)object);
                    ((Fragment)object5).setArguments(bundle);
                    object = "SortFilterRatingsFragment";
                    ((DialogFragment)object5).show((FragmentManager)object2, (String)object);
                    return Unit.a;
                }
                try {
                    object = ((Fragment)object2).getActivity();
                    if (object == null) return Unit.a;
                    object = ((Fragment)object2).requireActivity();
                    boolean bl3 = object.isFinishing();
                    if (bl3) return Unit.a;
                    object = ((e)object2).g;
                    if (object != null) break block6;
                    object = "activityFragmentListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    bl3 = false;
                    object = null;
                }
                catch (IllegalStateException illegalStateException2) {
                    break block7;
                }
            }
            if ((object = object.y()) == null) return Unit.a;
            if ((object = ((Fragment)object).getChildFragmentManager()) == null) return Unit.a;
            ((FragmentManager)object).W();
            return Unit.a;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).e(illegalStateException2);
        return Unit.a;
    }
}

