/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from ci1
 */
public final class ci1_2
implements we2_2 {
    public final InputStream a;

    public ci1_2(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "input");
        this.a = inputStream;
    }

    public final void close() {
        this.a.close();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long i0(ee_2 object, long l2) {
        AssertionError assertionError2;
        boolean bl2;
        block12: {
            int n3;
            int n4;
            byte[] byArray;
            ux2_2 ux2_22;
            String string2 = "Invalid number of bytes written: ";
            String string3 = "sink";
            Intrinsics.checkNotNullParameter(object, string3);
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) {
                return l3;
            }
            if (l4 < 0) {
                object = Ov2.a(l2, "byteCount (", ") < 0");
                object = object.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            bl2 = false;
            string3 = null;
            int n7 = 1;
            try {
                ux2_22 = ((ee_2)object).h(n7);
                byArray = ux2_22.a;
                n4 = ux2_22.c;
                n3 = byArray.length - n4;
            }
            catch (AssertionError assertionError2) {
                break block12;
            }
            long l7 = n3;
            l2 = Math.min(l2, l7);
            int n8 = (int)l2;
            Object object2 = this.a;
            int n10 = ((InputStream)object2).read(byArray, n4, n8);
            l2 = n10;
            long l8 = -1;
            long l12 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
            n4 = l12 == false ? 0 : (int)l2;
            String string4 = "data";
            if (n4 == n7) {
                int n14;
                Intrinsics.checkNotNullParameter(byArray, string4);
                ux2_22.c = n14 = ux2_22.c + n4;
                long l14 = ((ee_2)object).c;
                l8 = n4;
                ((ee_2)object).c = l14 += l8;
                return l2;
            }
            if (n4 >= 0 && n4 <= (l12 = (long)ux2_22.a())) {
                if (n4 != 0) {
                    int n15;
                    Intrinsics.checkNotNullParameter(byArray, string4);
                    ux2_22.c = n15 = ux2_22.c + n4;
                    long l15 = ((ee_2)object).c;
                    l8 = n4;
                    ((ee_2)object).c = l15 += l8;
                    return l2;
                }
                boolean bl3 = yx2_2.a(ux2_22);
                if (!bl3) return l2;
                ((ee_2)object).c();
                return l2;
            }
            object = new StringBuilder(string2);
            ((StringBuilder)object).append(n4);
            object2 = ". Should be in 0..";
            ((StringBuilder)object).append((String)object2);
            n10 = ux2_22.a();
            ((StringBuilder)object).append(n10);
            object = ((StringBuilder)object).toString();
            object = object.toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        Intrinsics.checkNotNullParameter(assertionError2, "<this>");
        Object object3 = ((Throwable)((Object)assertionError2)).getCause();
        if (object3 != null) {
            boolean bl4;
            object3 = ((Throwable)((Object)assertionError2)).getMessage();
            if (object3 != null) {
                String string5 = "getsockname failed";
                bl4 = StringsKt.F((CharSequence)object3, string5, false);
            } else {
                bl4 = false;
                object3 = null;
            }
            if (bl4) {
                bl2 = true;
            }
        }
        if (!bl2) throw assertionError2;
        object3 = new IOException((Throwable)((Object)assertionError2));
        throw object3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RawSource(");
        InputStream inputStream = this.a;
        stringBuilder.append(inputStream);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

