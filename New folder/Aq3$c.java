/*
 * Decompiled with CFR 0.152.
 */
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Aq3$c
extends Lambda
implements Function0 {
    public final /* synthetic */ Fragment c;

    public Aq3$c(Fragment fragment) {
        this.c = fragment;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity()");
        object = ((ComponentActivity)object).getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity().viewModelStore");
        return object;
    }
}

