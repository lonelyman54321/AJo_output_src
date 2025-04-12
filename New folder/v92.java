/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.b$b;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v92
extends Lambda
implements Function1 {
    public final /* synthetic */ FocusTargetNode c;
    public final /* synthetic */ FocusTargetNode d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Function1 f;

    public v92(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int n3, b$b b$b) {
        this.c = focusTargetNode;
        this.d = focusTargetNode2;
        this.e = n3;
        this.f = b$b;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (zx$a)object;
        FocusTargetNode focusTargetNode = this.d;
        Serializable serializable = (b$b)this.f;
        FocusTargetNode focusTargetNode2 = this.c;
        int n3 = this.e;
        boolean bl3 = u92_0.f(focusTargetNode2, focusTargetNode, n3, serializable);
        serializable = Boolean.valueOf(bl3);
        if (!bl3 && (bl2 = object.a())) {
            serializable = null;
        }
        return serializable;
    }
}

