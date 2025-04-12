/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Fy2
 */
public final class fy2_2
extends Lambda
implements Function2 {
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public fy2_2(String string2, String string3) {
        this.c = string2;
        this.d = string3;
        super(2);
    }

    public final Object invoke(Object object, Object objectArray) {
        int n3;
        object = (b30_0)object;
        int n4 = (objectArray = (Number)objectArray).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n4 = 0;
            objectArray = new Object[]{};
            String string2 = this.c;
            String string3 = this.d;
            t10.b(string2, string3, (b30_0)object, objectArray);
        }
        return Unit.a;
    }
}

