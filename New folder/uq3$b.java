/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class uq3$b
extends Lambda
implements Function0 {
    public final /* synthetic */ Fragment c;

    public uq3$b(Fragment fragment) {
        this.c = fragment;
        super(0);
    }

    public final Object invoke() {
        FragmentActivity fragmentActivity = this.c.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivity, "requireActivity()");
        return fragmentActivity.getDefaultViewModelProviderFactory();
    }
}

