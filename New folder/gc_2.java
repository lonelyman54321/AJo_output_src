/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.services.data.fleek.feedModel.Hotspot;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gC
 */
public final class gc_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gc_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (gE2)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((gE2)object3).d;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object2, "setEditProductRating", false, null, null, 28, null);
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 0: 
        }
        object = (Subcomponent)object;
        Object object4 = "it";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object = ((Subcomponent)object).getHotspots();
        if (object != null && (object = (Hotspot)CollectionsKt.firstOrNull((List)object)) != null && (object = ((Hotspot)object).getHotspotUrl()) != null) {
            object4 = kj0_1.g();
            Activity activity = (Activity)this.b;
            ((kj0_1)object4).w(activity, (String)object);
        }
        return Unit.a;
    }
}

