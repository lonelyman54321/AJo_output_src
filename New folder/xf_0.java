/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.platform.AndroidComposeView;

/*
 * Renamed from Xf
 */
public final class xf_0
extends h80_0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AndroidComposeView b;
    public int c;

    public xf_0(AndroidComposeView androidComposeView, f80_0 f80_02) {
        this.b = androidComposeView;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.c = n3 = this.c | -1 << -1;
        return this.b.q(null, this);
    }
}

