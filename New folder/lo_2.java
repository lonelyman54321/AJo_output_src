/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lo
 */
public final class lo_2
implements Function1 {
    public final /* synthetic */ oo_0 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ lo_2(oo_0 oo_02, boolean bl2) {
        this.a = oo_02;
        this.b = bl2;
    }

    public final Object invoke(Object object) {
        object = (AppUpdateInfo)object;
        Object object2 = "this$0";
        oo_0 oo_02 = this.a;
        Intrinsics.checkNotNullParameter(oo_02, (String)object2);
        oo_02.c = object;
        int n3 = ((AppUpdateInfo)object).installStatus();
        int n4 = 11;
        zr1_1 zr1_12 = oo_02.a;
        if (n3 == n4) {
            int n7;
            qo_0.a = n7 = ((AppUpdateInfo)object).availableVersionCode();
            object = DataCallback.Companion;
            n3 = 4;
            object2 = n3;
            object = ((DataCallback$Companion)object).onSuccess(object2);
            zr1_12.k(object);
        } else {
            n3 = ((AppUpdateInfo)object).updateAvailability();
            if (n3 == (n4 = 3)) {
                int n8;
                qo_0.a = n8 = ((AppUpdateInfo)object).availableVersionCode();
                oo_02.b();
            } else {
                n3 = ((AppUpdateInfo)object).updateAvailability();
                if (n3 == (n4 = 2)) {
                    object2 = null;
                    n3 = (int)(((AppUpdateInfo)object).isUpdateTypeAllowed(0) ? 1 : 0);
                    if (n3 != 0) {
                        qo_0.a = ((AppUpdateInfo)object).availableVersionCode();
                        boolean bl2 = this.b;
                        if (bl2) {
                            oo_02.b();
                        } else {
                            object = DataCallback.Companion;
                            n3 = 1;
                            object2 = n3;
                            object = ((DataCallback$Companion)object).onSuccess(object2);
                            zr1_12.k(object);
                        }
                    }
                }
            }
        }
        return Unit.a;
    }
}

