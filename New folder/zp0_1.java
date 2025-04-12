/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import com.ril.ajio.data.repo.StoreLPRepo;
import com.ril.ajio.devsettings.DevSettingsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zp0
 */
public final class zp0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zp0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (dl2_2)object;
                return StoreLPRepo.f((StoreLPRepo)object2, (dl2_2)object);
            }
            case 0: 
        }
        object = (Unit)object;
        object = DevSettingsActivity.Companion;
        object2 = (DevSettingsActivity)object2;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object2.getClass();
        object = new Handler();
        bp0_0 bp0_02 = new bp0_0(object2, 0);
        object.postDelayed((Runnable)bp0_02, 500L);
        return Unit.a;
    }
}

