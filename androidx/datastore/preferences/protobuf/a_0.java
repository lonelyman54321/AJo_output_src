/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.CodedOutputStream$b;
import androidx.datastore.preferences.protobuf.n;
import java.io.IOException;

/*
 * Renamed from androidx.datastore.preferences.protobuf.a
 */
public abstract class a_0
implements wo1_1 {
    protected int memoizedHashCode = 0;

    public int a() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final int c(st2_0 st2_02) {
        int n3;
        int n4 = this.a();
        if (n4 == (n3 = -1)) {
            n4 = st2_02.getSerializedSize(this);
            this.e(n4);
        }
        return n4;
    }

    public void e(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final DF$e toByteString() {
        Object object;
        Object object2;
        block14: {
            Object object3;
            Object object4;
            object2 = this;
            try {
                object2 = (n)this;
            }
            catch (IOException iOException) {
                object4 = new StringBuilder("Serializing ");
                object3 = this.getClass().getName();
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append(" to a ByteString threw an IOException (should never happen).");
                object4 = ((StringBuilder)object4).toString();
                object = new RuntimeException((String)object4, iOException);
                throw object;
            }
            int n3 = ((n)object2).getSerializedSize();
            object4 = DF.b;
            object4 = new byte[n3];
            object3 = CodedOutputStream.b;
            object3 = new CodedOutputStream$b((byte[])object4, n3);
            ((n)object2).d((CodedOutputStream)object3);
            int n4 = ((CodedOutputStream$b)object3).e;
            n3 = ((CodedOutputStream$b)object3).f;
            if ((n4 -= n3) != 0) break block14;
            object2 = new DF$e((byte[])object4);
            return object2;
        }
        object = "Did not write as much data as expected.";
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

