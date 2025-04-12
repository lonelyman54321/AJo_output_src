/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public final class M92
implements Runnable {
    public final /* synthetic */ S40 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ zr1_1 d;
    public final /* synthetic */ eK$a e;

    public /* synthetic */ M92(S40 s40, String string2, Function0 function0, zr1_1 zr1_12, eK$a a2) {
        this.a = s40;
        this.b = string2;
        this.c = function0;
        this.d = zr1_12;
        this.e = a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable3;
        boolean bl2;
        S40 s40;
        block8: {
            Object object = this.b;
            Object object2 = this.c;
            zr1_1 zr1_12 = this.d;
            eK$a eK$a = this.e;
            s40 = this.a;
            bl2 = s40.c();
            if (bl2) {
                s40.a((String)object);
            }
            try {
                object2.invoke();
                object = J92.a;
                zr1_12.i(object);
                eK$a.a(object);
            }
            catch (Throwable throwable2) {
                try {
                    object2 = new J92$a$a(throwable2);
                    zr1_12.i(object2);
                    eK$a.b(throwable2);
                }
                catch (Throwable throwable3) {
                    break block8;
                }
            }
            object = Unit.a;
            if (bl2) {
                s40.b();
            }
            return;
        }
        if (bl2) {
            s40.b();
        }
        throw throwable3;
    }
}

