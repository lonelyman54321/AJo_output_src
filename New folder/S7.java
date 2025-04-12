/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.functions.Function1;

public final class S7
implements Function1 {
    public final /* synthetic */ AjioHomeActivity a;

    public /* synthetic */ S7(AjioHomeActivity ajioHomeActivity) {
        this.a = ajioHomeActivity;
    }

    public final Object invoke(Object object) {
        AjioHomeActivity ajioHomeActivity = this.a;
        object = (DataCallback)object;
        return AjioHomeActivity.J2(ajioHomeActivity, (DataCallback)object);
    }
}

