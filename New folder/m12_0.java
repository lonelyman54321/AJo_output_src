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
 * Renamed from m12
 */
public final class m12_0
implements Function0 {
    public final /* synthetic */ o12_0 a;

    public /* synthetic */ m12_0(o12_0 o12_02) {
        this.a = o12_02;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Application application = ((Fragment)object).requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        object = (NewPlpRepo)((o12_0)object).u.getValue();
        e12_0 e12_02 = new e12_0(application, (NewPlpRepo)object);
        return e12_02;
    }
}

