/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class U3 {
    public static final boolean a(Object clazz, Object clazz2) {
        boolean bl2;
        if ((clazz = clazz.getClass()) == (clazz2 = clazz2.getClass())) {
            bl2 = true;
        } else {
            bl2 = false;
            clazz = null;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(hm0_2 hm0_22, hn2_2 object) {
        boolean bl2;
        IOException iOException;
        try {
            object = hm0_22.g((hn2_2)object).iterator();
            iOException = null;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        while (bl2 = object.hasNext()) {
            IOException iOException22;
            block7: {
                Object object2;
                hn2_2 hn2_22;
                block6: {
                    hn2_22 = (hn2_2)object.next();
                    try {
                        object2 = hm0_22.h(hn2_22);
                        boolean bl3 = ((hl0_1)object2).b;
                        if (!bl3) break block6;
                        U3.b(hm0_22, hn2_22);
                    }
                    catch (IOException iOException22) {
                        break block7;
                    }
                }
                object2 = "path";
                Intrinsics.checkNotNullParameter(hn2_22, (String)object2);
                hm0_22.d(hn2_22);
                continue;
            }
            if (iOException != null) continue;
            iOException = iOException22;
        }
        if (iOException == null) {
            return;
        }
        throw iOException;
    }
}

