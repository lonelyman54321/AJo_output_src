/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class G60$a {
    public final Function0 a;
    public final bl_2 b;

    public G60$a(RD$a$a rD$a$a, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = rD$a$a;
        this.b = cancellableContinuationImpl;
    }

    public final String toString() {
        bl_2 bl_22 = this.b;
        Object object = bl_22.getContext();
        Object object2 = h90_0.b;
        object = (object = (h90_0)object.get((CoroutineContext$a)object2)) != null ? ((h90_0)object).a : null;
        object2 = new StringBuilder("Request@");
        int n3 = this.hashCode();
        int n4 = CharsKt.checkRadix(16);
        String string2 = Integer.toString(n3, n4);
        String string3 = "toString(this, checkRadix(radix))";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        ((StringBuilder)object2).append(string2);
        if (object == null || (object = cP.a(string2 = "[", (String)object, string3 = "](")) == null) {
            object = "(";
        }
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("currentBounds()=");
        object = this.a.invoke();
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(", continuation=");
        ((StringBuilder)object2).append(bl_22);
        ((StringBuilder)object2).append(')');
        return ((StringBuilder)object2).toString();
    }
}

