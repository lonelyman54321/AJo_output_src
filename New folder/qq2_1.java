/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from qq2
 */
public final class qq2_1
extends Lambda
implements Function0 {
    public final /* synthetic */ rq2_0 c;

    public qq2_1(rq2_0 rq2_02) {
        this.c = rq2_02;
        super(0);
    }

    public final Object invoke() {
        OR1 oR1 = null;
        int n3 = 1;
        Object object = this.c;
        List list = ((rq2_0)object).a;
        int n4 = list.size();
        nr1_1 nr1_12 = new nr1_1(n4);
        object = ((rq2_0)object).a;
        n4 = object.size();
        for (int i3 = 0; i3 < n4; i3 += n3) {
            boolean bl2;
            Object[] objectArray;
            Object object2 = (do1_0)object.get(i3);
            Object[] objectArray2 = ((do1_0)object2).b;
            int n7 = ((do1_0)object2).a;
            if (objectArray2 != null) {
                Integer n8 = n7;
                objectArray = ((do1_0)object2).b;
                objectArray2 = new hl1_0(n8, objectArray);
            } else {
                objectArray2 = n7;
            }
            n7 = nr1_12.e(objectArray2);
            if (n7 < 0) {
                bl2 = true;
            } else {
                bl2 = false;
                objectArray = null;
            }
            Object object3 = bl2 ? null : nr1_12.c[n7];
            if (object3 != null) {
                Object[] objectArray3;
                int n10 = TypeIntrinsics.isMutableList(object3);
                if (n10 != 0) {
                    objectArray3 = "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>";
                    Intrinsics.checkNotNull(object3, (String)objectArray3);
                    object3 = TypeIntrinsics.asMutableList(object3);
                    object3.add(object2);
                    object2 = object3;
                } else {
                    n10 = 2;
                    objectArray3 = new Object[n10];
                    objectArray3[0] = object3;
                    objectArray3[n3] = object2;
                    object2 = xx_2.j(objectArray3);
                }
            }
            if (bl2) {
                objectArray = nr1_12.b;
                objectArray[n7 ^= 0xFFFFFFFF] = objectArray2;
                objectArray2 = nr1_12.c;
                objectArray2[n7] = object2;
                continue;
            }
            objectArray2 = nr1_12.c;
            objectArray2[n7] = object2;
        }
        oR1 = new OR1(nr1_12);
        return oR1;
    }
}

