/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import java.io.File;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from EL0
 */
public final class el0_2
implements DL0$f {
    public final /* synthetic */ long a;
    public final /* synthetic */ dl0_1 b;
    public final /* synthetic */ File c;
    public final /* synthetic */ String d;

    public el0_2(long l2, dl0_1 dl0_12, File file, String string2) {
        this.a = l2;
        this.b = dl0_12;
        this.c = file;
        this.d = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Throwable throwable2;
        Serializable serializable;
        block5: {
            Object object;
            block4: {
                object = this.b;
                serializable = ((dl0_1)object).g;
                long l2 = ((AtomicLong)serializable).get();
                long l3 = this.a;
                File file = this.c;
                Object object2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                if (object2 < 0) {
                    file.delete();
                    return;
                }
                Object object3 = ((dl0_1)object).c;
                Object object4 = lz3_0.a;
                String string2 = this.d;
                Intrinsics.checkNotNullParameter(string2, "key");
                lz3_0.a.getClass();
                object4 = Charsets.UTF_8;
                object4 = string2.getBytes((Charset)object4);
                Intrinsics.checkNotNullExpressionValue(object4, "this as java.lang.String).getBytes(charset)");
                string2 = "MD5";
                object4 = lz3_0.u(string2, (byte[])object4);
                serializable = new File((File)object3, (String)object4);
                boolean bl2 = file.renameTo((File)serializable);
                if (!bl2) {
                    file.delete();
                }
                serializable = ((dl0_1)object).e;
                ((ReentrantLock)serializable).lock();
                try {
                    boolean bl3 = ((dl0_1)object).d;
                    if (bl3) break block4;
                    ((dl0_1)object).d = bl3 = true;
                    object3 = FacebookSdk.d();
                    string2 = null;
                    object4 = new al0_1(object, 0);
                    object3.execute((Runnable)object4);
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            object = Unit.a;
            ((ReentrantLock)serializable).unlock();
            return;
        }
        ((ReentrantLock)serializable).unlock();
        throw throwable2;
    }
}

