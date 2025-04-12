/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from GU1$b
 */
public final class gu1$b_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Fragment c;

    public gu1$b_0(Fragment fragment) {
        this.c = fragment;
        super(0);
    }

    public final Object invoke() {
        return this.c.requireActivity().getViewModelStore();
    }
}

