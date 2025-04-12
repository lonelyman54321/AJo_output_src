/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.b$b;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Us3
extends Lambda
implements Function1 {
    public final /* synthetic */ FocusTargetNode c;
    public final /* synthetic */ aG2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Function1 f;

    public Us3(int n3, aG2 aG22, b$b b$b, FocusTargetNode focusTargetNode) {
        this.c = focusTargetNode;
        this.d = aG22;
        this.e = n3;
        this.f = b$b;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (zx$a)object;
        aG2 aG22 = this.d;
        Serializable serializable = (b$b)this.f;
        FocusTargetNode focusTargetNode = this.c;
        int n3 = this.e;
        boolean bl3 = Ts3.i(n3, aG22, serializable, focusTargetNode);
        serializable = Boolean.valueOf(bl3);
        if (!bl3 && (bl2 = object.a())) {
            serializable = null;
        }
        return serializable;
    }
}

