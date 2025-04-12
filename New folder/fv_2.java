/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.skydoves.balloon.Balloon;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fv
 */
public final class fv_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fv_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (hy3_0)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((hy3_0)object3).l;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object2, "BackGround_UserProfile", false, null, null, 28, null);
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 1: {
                object = (pq$a$c)object;
                tr1_0 tr1_02 = (tr1_0)this.b;
                Intrinsics.checkNotNullParameter(tr1_02, "$showShimmer");
                Intrinsics.checkNotNullParameter(object, "it");
                object = Boolean.TRUE;
                tr1_02.setValue(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (View)object;
        Balloon balloon2 = (Balloon)this.b;
        Intrinsics.checkNotNullParameter(balloon2, "$balloon");
        Intrinsics.checkNotNullParameter(object, "it");
        balloon2.h();
        return Unit.a;
    }
}

