/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.Hilt_AJIOApplication$a;

/*
 * Renamed from gp
 */
public final class gp_2
implements az0_2 {
    public volatile Wh0 a;
    public final Object b;
    public final s10_0 c;

    public gp_2(Hilt_AJIOApplication$a hilt_AJIOApplication$a) {
        Object object;
        this.b = object = new Object();
        this.c = hilt_AJIOApplication$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object generatedComponent() {
        Object object = this.a;
        if (object != null) return this.a;
        object = this.b;
        synchronized (object) {
            try {
                Object object2 = this.a;
                if (object2 != null) return this.a;
                object2 = this.c;
                object2 = (Hilt_AJIOApplication$a)object2;
                this.a = object2 = ((Hilt_AJIOApplication$a)object2).a();
                return this.a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

