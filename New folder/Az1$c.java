/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Az1$c
extends Lambda
implements Function0 {
    public final /* synthetic */ Fragment c;

    public Az1$c(Fragment fragment) {
        this.c = fragment;
        super(0);
    }

    public final Object invoke() {
        return this.c.requireActivity().getViewModelStore();
    }
}

