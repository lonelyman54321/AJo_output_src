/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.Intrinsics;

public final class Fz2 {
    public static final HashMap e;
    public final boolean a;
    public final File b;
    public final Lock c;
    public FileChannel d;

    static {
        HashMap hashMap;
        e = hashMap = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public Fz2(String string2, File serializable, boolean bl2) {
        Object object;
        String string3 = "name";
        Intrinsics.checkNotNullParameter(string2, string3);
        this.a = bl2;
        if (serializable != null) {
            string3 = Ft2.a(string2, ".lck");
            object = new File((File)serializable, string3);
        } else {
            bl2 = false;
            object = null;
        }
        this.b = object;
        serializable = e;
        // MONITORENTER : serializable
        object = ((HashMap)serializable).get(string2);
        if (object == null) {
            ((HashMap)serializable).put(string2, object);
        }
        object = (Lock)object;
        // MONITOREXIT : serializable
        this.c = object;
    }

    /*
     * Unable to fully structure code
     */
    public final void a(boolean var1_1) {
        block9: {
            block8: {
                var2_2 = this.c;
                var2_2.lock();
                if (!var1_1) ** GOTO lbl33
                var3_3 = this.b;
                if (var3_3 == null) break block9;
                var2_2 = var3_3.getParentFile();
                if (var2_2 == null) break block8;
                var2_2.mkdirs();
            }
            var2_2 = new FileOutputStream((File)var3_3);
            var3_3 = var2_2.getChannel();
            var3_3.lock();
            this.d = var3_3;
            ** GOTO lbl33
        }
        var2_2 = "No lock directory was provided.";
        try {
            var3_3 = new IOException((String)var2_2);
            throw var3_3;
        }
        catch (IOException v0) {
            ** continue;
        }
lbl29:
        // 1 sources

        while (true) {
            var1_1 = false;
            var3_3 = null;
            this.d = null;
lbl33:
            // 3 sources

            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }
        catch (IOException iOException) {}
        this.c.unlock();
    }
}

