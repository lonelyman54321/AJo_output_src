/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class KW0
extends Lambda
implements Function0 {
    public final /* synthetic */ Fragment c;

    public KW0(Fragment fragment) {
        this.c = fragment;
        super(0);
    }

    public final Object invoke() {
        return this.c.getDefaultViewModelProviderFactory();
    }
}

