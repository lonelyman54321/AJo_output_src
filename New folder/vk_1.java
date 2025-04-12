/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from vk
 */
public final class vk_1
extends Lambda
implements Function2 {
    public final /* synthetic */ JE0 c;

    public vk_1(JE0 jE0) {
        this.c = jE0;
        super(2);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        block3: {
            block2: {
                void var2_5;
                Xz0 xz0 = (Xz0)((Object)object);
                Xz0 xz02 = (Xz0)var2_5;
                Xz0 xz03 = Xz0.PostExit;
                if (xz0 != xz03 || xz02 != xz03) break block2;
                vr3 vr32 = this.c.a();
                bl2 = vr32.d;
                if (!bl2) break block3;
            }
            bl2 = false;
            return bl2;
        }
        bl2 = true;
        return bl2;
    }
}

