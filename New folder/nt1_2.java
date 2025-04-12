/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from nT1
 */
public final class nt1_2
extends Lambda
implements Function0 {
    public final /* synthetic */ gt1_0 c;

    public nt1_2(gt1_0 gt1_02) {
        this.c = gt1_02;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c.e;
        if (object != null) {
            int n3 = 2;
            object = Pattern.compile((String)object, n3);
        } else {
            object = null;
        }
        return object;
    }
}

