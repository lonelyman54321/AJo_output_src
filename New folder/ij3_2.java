/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from IJ3
 */
public final class ij3_2
extends Lambda
implements Function2 {
    public final /* synthetic */ se_1 c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ Ref$ObjectRef f;

    public ij3_2(ie2_2 ie2_22, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.c = ie2_22;
        this.d = ref$ObjectRef;
        this.e = ref$ObjectRef2;
        this.f = ref$ObjectRef3;
        super(2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        Ref$ObjectRef ref$ObjectRef;
        int n3;
        object = (Number)object;
        int n4 = ((Number)object).intValue();
        object2 = (Number)object2;
        long l2 = ((Number)object2).longValue();
        int n7 = 21589;
        if (n4 != n7) return Unit.a;
        object = "bad zip: extended timestamp extra too short";
        long l3 = 1L;
        long l4 = l2 - l3;
        n7 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n7 < 0) {
            object2 = new IOException((String)object);
            throw object2;
        }
        object2 = this.c;
        int n8 = object2.readByte();
        int n10 = n8 & 1;
        n10 = n10 == (n3 = 1) ? 1 : 0;
        int n14 = n8 & 2;
        int n15 = 2;
        n14 = n14 == n15 ? 1 : 0;
        n15 = 4;
        if ((n8 &= n15) != n15) {
            n3 = 0;
        }
        if (n10 != 0) {
            l3 = 5;
        }
        long l7 = 4;
        if (n14 != 0) {
            l3 += l7;
        }
        if (n3 != 0) {
            l3 += l7;
        }
        if ((n8 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1))) < 0) {
            object2 = new IOException((String)object);
            throw object2;
        }
        l2 = 1000L;
        if (n10 != 0) {
            n4 = object2.x0();
            l3 = (long)n4 * l2;
            object = l3;
            ref$ObjectRef = this.d;
            ref$ObjectRef.element = object;
        }
        if (n14 != 0) {
            n4 = object2.x0();
            l3 = (long)n4 * l2;
            object = l3;
            ref$ObjectRef = this.e;
            ref$ObjectRef.element = object;
        }
        if (n3 == 0) return Unit.a;
        n4 = object2.x0();
        long l8 = (long)n4 * l2;
        object = l8;
        object2 = this.f;
        ((Ref$ObjectRef)object2).element = object;
        return Unit.a;
    }
}

