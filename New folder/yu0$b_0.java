/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from yU0$b
 */
public final class yu0$b_0
extends Lambda
implements Function0 {
    public final /* synthetic */ FocusTargetNode c;

    public yu0$b_0(FocusTargetNode focusTargetNode) {
        this.c = focusTargetNode;
        super(0);
    }

    public final Object invoke() {
        FocusTargetNode focusTargetNode = this.c;
        LP1$c lP1$c = focusTargetNode.a;
        boolean bl2 = lP1$c.m;
        if (bl2) {
            OT0.b(focusTargetNode);
        }
        return Unit.a;
    }
}

