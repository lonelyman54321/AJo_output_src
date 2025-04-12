/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class GU1$d
extends Lambda
implements Function0 {
    public final /* synthetic */ Fragment c;

    public GU1$d(Fragment fragment) {
        this.c = fragment;
        super(0);
    }

    public final Object invoke() {
        return this.c.requireActivity().getDefaultViewModelProviderFactory();
    }
}

