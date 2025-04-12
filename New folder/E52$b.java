/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import kotlin.Unit;

public final class E52$b
implements fs0_2 {
    public final /* synthetic */ b52_0 a;

    public E52$b(b52_0 b52_02) {
        this.a = b52_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        int n3 = ((Number)object).intValue();
        object2 = this.a.b;
        Integer n4 = new Integer(n3);
        ((LiveData)object2).k(n4);
        return Unit.a;
    }
}

