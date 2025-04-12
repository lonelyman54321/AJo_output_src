/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from fQ0$d
 */
public final class fq0$d_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Fragment c;

    public fq0$d_0(Fragment fragment) {
        this.c = fragment;
        super(0);
    }

    public final Object invoke() {
        return this.c.requireActivity().getDefaultViewModelCreationExtras();
    }
}

