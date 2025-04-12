/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 */
import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class o90$e
extends Lambda
implements Function1 {
    public final /* synthetic */ Vt1 c;
    public final /* synthetic */ Sk3 d;

    public o90$e(Vt1 vt1, Sk3 sk3) {
        this.c = vt1;
        this.d = sk3;
        super(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        int n3;
        int n4;
        Object object2;
        block3: {
            block2: {
                int n7;
                object = ((Yn1)object).a;
                x21_0 x21_02 = this.c.a();
                if (x21_02 != (object2 = x21_0.Selection) || (n4 = object.getKeyCode()) != (n7 = 4)) break block2;
                n3 = bo1_1.d((KeyEvent)object);
                n4 = 1;
                if ((n3 = (int)(ao1_2.a(n3, n4) ? 1 : 0)) != 0) break block3;
            }
            n4 = 0;
            return n4 != 0;
        }
        n3 = 0;
        object = null;
        object2 = this.d;
        ((Sk3)object2).g(null);
        return n4 != 0;
    }
}

