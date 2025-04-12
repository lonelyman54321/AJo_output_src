/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from fx
 */
public final class fx_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Yl3 c;

    public fx_0(Yl3 yl3) {
        this.c = yl3;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        Object object = this.c;
        if (object != null) {
            cm3_0 cm3_02 = new cm3_0((Yl3)object);
            object = (Boolean)cm3_02.invoke();
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

