/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.devsettings.DevSettingsActivity;
import com.ril.ajio.services.network.OkHttpClientProvider;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yp0
 */
public final class yp0_1
implements Callable {
    public final /* synthetic */ DevSettingsActivity a;

    public /* synthetic */ yp0_1(DevSettingsActivity devSettingsActivity) {
        this.a = devSettingsActivity;
    }

    public final Object call() {
        boolean bl2;
        Object object = DevSettingsActivity.Companion;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((DevSettingsActivity)object).X;
        if (object2 != null) {
            bl2 = ((hy3_0)object2).p();
            object2 = bl2;
        } else {
            bl2 = false;
            object2 = null;
        }
        Intrinsics.checkNotNull(object2);
        bl2 = (Boolean)object2;
        hh3_2 hh3_22 = ((DevSettingsActivity)object).Y;
        if (bl2) {
            ((jo_2)hh3_22.getValue()).p(0);
            object2 = (jo_2)hh3_22.getValue();
            ((jo_2)object2).o(0.0f);
            object = ((DevSettingsActivity)object).X;
            if (object != null) {
                ((hy3_0)object).q();
            }
        }
        ((jo_2)hh3_22.getValue()).putPreference("LUXE_CMS_CATEGORY_RESPONSE", "");
        object = OkHttpClientProvider.Companion.getInstance();
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a().getCacheDir();
        ((OkHttpClientProvider)object).burstCache((File)object2);
        return Unit.a;
    }
}

