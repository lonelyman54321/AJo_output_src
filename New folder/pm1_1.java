/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from pm1
 */
public final class pm1_1
implements Iterator,
KMappedMarker {
    public final ml1_2 a;
    public final ce2_2 b;
    public final qp0_2 c;
    public boolean d;
    public boolean e;

    public pm1_1(ml1_2 ml1_22, ce2_2 ce2_22, KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(ml1_22, "json");
        Intrinsics.checkNotNullParameter(ce2_22, "lexer");
        Intrinsics.checkNotNullParameter(kSerializer, "deserializer");
        this.a = ml1_22;
        this.b = ce2_22;
        this.c = kSerializer;
        this.d = true;
    }

    public final boolean hasNext() {
        boolean bl2 = this.e;
        byte c2 = 0;
        String string2 = null;
        if (bl2) {
            return false;
        }
        ce2_2 ce2_22 = this.b;
        int c3 = ce2_22.w();
        byte by2 = 10;
        boolean bl3 = true;
        int n3 = 9;
        if (c3 == n3) {
            this.e = bl3;
            ce2_22.g((byte)n3);
            byte by4 = ce2_22.w();
            if (by4 != by2) {
                byte by5;
                byte by6 = ce2_22.w();
                if (by6 != (by5 = 8)) {
                    ce2_22.p();
                } else {
                    q0_0.r(ce2_22, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6);
                    throw null;
                }
            }
            return false;
        }
        c2 = ce2_22.w();
        if (c2 == by2 && (c2 = (byte)(this.e ? 1 : 0)) == 0) {
            String string3;
            string2 = r0_0.d((byte)n3);
            int n4 = ce2_22.a;
            int n7 = n4 + -1;
            dp_1 dp_12 = ce2_22.g;
            n3 = dp_12.b;
            if (n4 != n3 && n7 >= 0) {
                char c5 = dp_12.a[n7];
                string3 = String.valueOf(c5);
            } else {
                string3 = "EOF";
            }
            string2 = uc0_0.a("Expected ", string2, ", but had '", string3, "' instead");
            q0_0.r(ce2_22, string2, n7, null, 4);
            throw null;
        }
        return bl3;
    }

    public final Object next() {
        Object object;
        boolean bl2 = this.d;
        if (bl2) {
            bl2 = false;
            object = null;
            this.d = false;
        } else {
            object = this.b;
            char c2 = ',';
            ((ce2_2)object).h(c2);
        }
        pj3_2 pj3_22 = pj3_2.OBJ;
        qp0_2 qp0_22 = this.c;
        SerialDescriptor serialDescriptor = qp0_22.getDescriptor();
        ml1_2 ml1_22 = this.a;
        ce2_2 ce2_22 = this.b;
        object = new ce3_2(ml1_22, pj3_22, ce2_22, serialDescriptor, null);
        return ((ce3_2)object).e(qp0_22);
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

