/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ky2
 */
public final class ky2_2
extends Lambda
implements Function2 {
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object[] e;

    public ky2_2(String string2, String string3, Object[] objectArray) {
        this.c = string2;
        this.d = string3;
        this.e = objectArray;
        super(2);
    }

    public final Object invoke(Object object, Object objectArray) {
        int n3;
        object = (b30_0)object;
        int n4 = (objectArray = (Number)objectArray).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            objectArray = this.e;
            n3 = objectArray.length;
            objectArray = Arrays.copyOf(objectArray, n3);
            String string2 = this.c;
            String string3 = this.d;
            t10.b(string2, string3, (b30_0)object, objectArray);
        }
        return Unit.a;
    }
}

