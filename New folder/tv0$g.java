/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class tv0$g
extends Lambda
implements Function0 {
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ rq1_2 d;

    public tv0$g(Fragment fragment, rq1_2 rq1_22) {
        this.c = fragment;
        this.d = rq1_22;
        super(0);
    }

    public final Object invoke() {
        Object object = (sD3)this.d.getValue();
        boolean bl2 = object instanceof f;
        object = bl2 ? (f)object : null;
        if (object == null || (object = object.getDefaultViewModelProviderFactory()) == null) {
            object = this.c.getDefaultViewModelProviderFactory();
        }
        return object;
    }
}

