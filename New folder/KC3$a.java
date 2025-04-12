/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import kotlin.jvm.functions.Function0;

public final class KC3$a
implements KC3 {
    public final i a;

    public KC3$a(mu1_1 object) {
        object = object.getLifecycle();
        this.a = object;
    }

    public final Function0 a(AbstractComposeView object) {
        i$b i$b;
        Object object2 = this.a;
        Object object3 = ((i)object2).b();
        int n3 = object3.compareTo(i$b = i$b.DESTROYED);
        if (n3 > 0) {
            object3 = new lc3_0((AbstractComposeView)((Object)object));
            ((i)object2).a((lu1)object3);
            object = new mc3_0((i)object2, (lc3_0)object3);
            return object;
        }
        object3 = new StringBuilder("Cannot configure ");
        ((StringBuilder)object3).append(object);
        ((StringBuilder)object3).append(" to disposeComposition at Lifecycle ON_DESTROY: ");
        ((StringBuilder)object3).append(object2);
        ((StringBuilder)object3).append("is already destroyed");
        object = ((StringBuilder)object3).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

