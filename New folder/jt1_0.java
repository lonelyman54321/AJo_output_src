/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from jT1
 */
public final class jt1_0
extends Lambda
implements Function0 {
    public final /* synthetic */ gt1_0 c;

    public jt1_0(gt1_0 gt1_02) {
        this.c = gt1_02;
        super(0);
    }

    public final Object invoke() {
        Object object = (String)this.c.l.getValue();
        if (object != null) {
            int n3 = 2;
            object = Pattern.compile((String)object, n3);
        } else {
            object = null;
        }
        return object;
    }
}

