/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/*
 * Renamed from Cb3
 */
public final class cb3_2
implements d33 {
    public final long a;
    public final long b;

    public cb3_2(long l2, long l3) {
        this.a = l2;
        this.b = l3;
        String string2 = " ms) cannot be negative";
        long l4 = 0L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 >= 0) {
            Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (object >= 0) {
                return;
            }
            String string3 = Ov2.a(l3, "replayExpiration(", string2);
            string3 = string3.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
            throw illegalArgumentException;
        }
        String string4 = Ov2.a(l2, "stopTimeout(", string2);
        string4 = string4.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string4);
        throw illegalArgumentException;
    }

    public final es0_2 a(jb3_2 es0_22) {
        qg3_2 qg3_22 = new cb3$a_0(this, null);
        es0_22 = ms0_1.n(es0_22, qg3_22);
        qg3_22 = new qg3_2(2, null);
        gt0_2 gt0_22 = new gt0_2((qr_2)es0_22, (Cb3$b)qg3_22);
        return ms0_1.h(gt0_22);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof cb3_2;
        if (!bl2) return false;
        object = (cb3_2)object;
        long l2 = this.a;
        long l3 = ((cb3_2)object).a;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) return false;
        l3 = this.b;
        l2 = ((cb3_2)object).b;
        long l7 = l3 - l2;
        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object3) return false;
        return true;
    }

    public final int hashCode() {
        long l2 = this.a;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3) * 31;
        l3 = this.b;
        long l4 = l3 >>> n3;
        int n7 = (int)(l3 ^ l4);
        return n4 + n7;
    }

    public final String toString() {
        long l2;
        CharSequence charSequence;
        Object object;
        int n3 = 2;
        Serializable serializable = new vu1_2(n3);
        long l3 = 0L;
        String string2 = "ms";
        long l4 = this.a;
        long l7 = l4 - l3;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 > 0) {
            object = "stopTimeout=";
            charSequence = new StringBuilder((String)object);
            ((StringBuilder)charSequence).append(l4);
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            ((vu1_2)serializable).add(charSequence);
        }
        if ((object2 = (l2 = (l4 = this.b) - (l3 = Long.MAX_VALUE)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) < 0) {
            object = "replayExpiration=";
            charSequence = new StringBuilder((String)object);
            ((StringBuilder)charSequence).append(l4);
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            ((vu1_2)serializable).add(charSequence);
        }
        object = kotlin.collections.a.a((vu1_2)serializable);
        serializable = new StringBuilder("SharingStarted.WhileSubscribed(");
        charSequence = CollectionsKt.R((Iterable)object, null, null, null, null, 63);
        return ui0_1.a((StringBuilder)serializable, (String)charSequence, ')');
    }
}

