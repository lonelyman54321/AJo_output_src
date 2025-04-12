/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 */
import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from fo1
 */
public final class fo1_2
extends LP1$c
implements eo1_2 {
    public Function1 n;
    public Function1 o;

    public fo1_2() {
        throw null;
    }

    public final boolean n0(KeyEvent object) {
        boolean bl2;
        Function1 function1 = this.o;
        if (function1 != null) {
            Yn1 yn1 = new Yn1((KeyEvent)object);
            object = (Boolean)function1.invoke(yn1);
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final boolean u0(KeyEvent object) {
        boolean bl2;
        Function1 function1 = this.n;
        if (function1 != null) {
            Yn1 yn1 = new Yn1((KeyEvent)object);
            object = (Boolean)function1.invoke(yn1);
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

