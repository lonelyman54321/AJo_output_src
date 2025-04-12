/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;

/*
 * Renamed from LC3
 */
public final class lc3_0
implements n {
    public final /* synthetic */ AbstractComposeView a;

    public /* synthetic */ lc3_0(AbstractComposeView abstractComposeView) {
        this.a = abstractComposeView;
    }

    public final void k(mu1_1 object, i$a i$a) {
        object = i$a.ON_DESTROY;
        if (i$a == object) {
            object = this.a;
            ((AbstractComposeView)((Object)object)).c();
        }
    }
}

