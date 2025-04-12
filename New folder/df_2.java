/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.nio.ByteBuffer;

/*
 * Renamed from dF
 */
public final class df_2
implements el0_0 {
    public final ByteBuffer a;
    public final ba2 b;

    public df_2(ByteBuffer byteBuffer, ba2 ba22) {
        this.a = byteBuffer;
        this.b = ba22;
    }

    public final Object a(f80_0 object) {
        object = this.a;
        Context context = null;
        try {
            Object object2 = new ce_2();
            object2.write((ByteBuffer)object);
            context = this.b.a;
            a00 a002 = new a00(context, 2);
            f93_0 f93_02 = new f93_0((se_1)object2, a002, null);
            object2 = ri0.MEMORY;
            object = new N93(f93_02, null, (ri0)((Object)object2));
            return object;
        }
        finally {
            ((ByteBuffer)object).position(0);
        }
    }
}

