/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class yN2$f
extends Lambda
implements Function0 {
    public final /* synthetic */ Fragment c;

    public yN2$f(Fragment fragment) {
        this.c = fragment;
        super(0);
    }

    public final Object invoke() {
        return this.c.requireActivity().getDefaultViewModelProviderFactory();
    }
}

