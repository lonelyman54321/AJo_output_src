/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.NewPlpRepo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gj2
 */
public final class gj2_2
implements Function0 {
    public final /* synthetic */ hj2_1 a;

    public /* synthetic */ gj2_2(hj2_1 hj2_12) {
        this.a = hj2_12;
    }

    public final Object invoke() {
        Object object = hj2_1.Companion;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Application application = ((Fragment)object).requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        object = (NewPlpRepo)((hj2_1)object).a.getValue();
        e12_0 e12_02 = new e12_0(application, (NewPlpRepo)object);
        return e12_02;
    }
}

