/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.plp.PLPExtras;
import com.ril.ajio.simpleCropView.CropImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ae0
 */
public final class ae0_0
implements Function1 {
    public final /* synthetic */ de0_2 a;

    public /* synthetic */ ae0_0(de0_2 de0_22) {
        this.a = de0_22;
    }

    public final Object invoke(Object object) {
        object = (Uri)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = ((de0_2)object2).g;
        if (object3 != null) {
            ((PLPExtras)object3).w = object;
            ((PLPExtras)object3).x = object = object.getPath();
            object = ((de0_2)object2).a;
            object = object != null ? ((CropImageView)((Object)object)).getActualCropRect() : null;
            ((PLPExtras)object3).B = object;
            og1_1.c();
            ((bu2_0)((de0_2)object2).h.getValue()).a.k(object3);
            object = ((PLPExtras)object3).e;
            if (object == null) {
                object = "";
            }
            object3 = ((PLPExtras)object3).H;
            object = at2_1.b((String)object, (String)object3);
            object3 = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
            String string2 = "search screen";
            ((NewEEcommerceEventsRevamp)object3).setPreviousScreenData(string2, string2);
            object3 = ((Fragment)object2).getActivity();
            if (object3 != null) {
                object3 = ((Fragment)object2).requireArguments();
                boolean bl2 = object3.getBoolean("FRAME");
                string2 = "activityFragmentListener";
                if (bl2) {
                    object3 = ((de0_2)object2).e;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl2 = false;
                        object3 = null;
                    }
                    object3.N();
                }
                if ((object3 = ((de0_2)object2).e) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object3 = null;
                }
                object3.N();
                object3 = ((de0_2)object2).e;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object3 = null;
                }
                if ((object2 = ((de0_2)object2).e) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    object2 = null;
                }
                object2 = object2.y();
                boolean bl3 = true;
                j3$a.a((j3_0)object3, (Fragment)object2, (Fragment)object, bl3, null);
            }
        }
        return Unit.a;
    }
}

