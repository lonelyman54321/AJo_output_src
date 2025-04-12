/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;

/*
 * Renamed from HJ3
 */
public final class hj3_2
extends Lambda
implements Function2 {
    public final /* synthetic */ Ref$BooleanRef c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Ref$LongRef e;
    public final /* synthetic */ se_1 f;
    public final /* synthetic */ Ref$LongRef g;
    public final /* synthetic */ Ref$LongRef h;

    public hj3_2(Ref$BooleanRef ref$BooleanRef, long l2, Ref$LongRef ref$LongRef, ie2_2 ie2_22, Ref$LongRef ref$LongRef2, Ref$LongRef ref$LongRef3) {
        this.c = ref$BooleanRef;
        this.d = l2;
        this.e = ref$LongRef;
        this.f = ie2_22;
        this.g = ref$LongRef2;
        this.h = ref$LongRef3;
        super(2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        object = (Number)object;
        int n3 = ((Number)object).intValue();
        object2 = (Number)object2;
        long l2 = ((Number)object2).longValue();
        int n4 = 1;
        if (n3 != n4) return Unit.a;
        object = this.c;
        boolean bl2 = ((Ref$BooleanRef)object).element;
        if (bl2) {
            object = new IOException("bad zip: zip64 extra repeated");
            throw object;
        }
        ((Ref$BooleanRef)object).element = n4;
        long l3 = this.d;
        long l4 = l2 - l3;
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 < 0) {
            object = new IOException("bad zip: zip64 extra too short");
            throw object;
        }
        object = this.e;
        l2 = ((Ref$LongRef)object).element;
        object2 = this.f;
        long l7 = 0xFFFFFFFFL;
        long l8 = l2 - l7;
        Object object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object4 == false) {
            l2 = object2.T();
        }
        ((Ref$LongRef)object).element = l2;
        object = this.g;
        l2 = ((Ref$LongRef)object).element;
        long l12 = 0L;
        Object object5 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        l2 = object5 == false ? object2.T() : l12;
        ((Ref$LongRef)object).element = l2;
        object = this.h;
        l2 = ((Ref$LongRef)object).element;
        long l14 = l2 - l7;
        Object object6 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object6 == false) {
            l12 = object2.T();
        }
        ((Ref$LongRef)object).element = l12;
        return Unit.a;
    }
}

