/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from fQ0$e
 */
public final class fq0$e_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Fragment c;

    public fq0$e_0(Fragment fragment) {
        this.c = fragment;
        super(0);
    }

    public final Object invoke() {
        return this.c.requireActivity().getDefaultViewModelProviderFactory();
    }
}

