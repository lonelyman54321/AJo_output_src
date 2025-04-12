/*
 * Decompiled with CFR 0.152.
 */
import androidx.room.EmptyResultSetException;
import java.util.concurrent.Callable;

public final class eR2
implements v53_0 {
    public final /* synthetic */ Callable a;

    public eR2(Callable callable) {
        this.a = callable;
    }

    public final void b(H53$a h53$a) {
        Callable callable = this.a;
        callable = callable.call();
        try {
            h53$a.a(callable);
        }
        catch (EmptyResultSetException emptyResultSetException) {
            h53$a.b(emptyResultSetException);
        }
    }
}

