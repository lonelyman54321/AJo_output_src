/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public abstract class AA0
extends n23 {
    public AA0(FP2 fP2) {
        Intrinsics.checkNotNullParameter(fP2, "database");
        super(fP2);
    }

    public abstract void bind(bg3_0 var1, Object var2);

    public abstract String createQuery();

    public final int handle(Object object) {
        bg3_0 bg3_02 = this.acquire();
        try {
            this.bind(bg3_02, object);
            int n3 = bg3_02.q();
            return n3;
        }
        finally {
            this.release(bg3_02);
        }
    }

    public final int handleMultiple(Iterable object) {
        Throwable throwable2;
        bg3_0 bg3_02;
        block7: {
            int n3;
            block6: {
                int n4;
                Intrinsics.checkNotNullParameter(object, "entities");
                bg3_02 = this.acquire();
                try {
                    object = object.iterator();
                    n3 = 0;
                }
                catch (Throwable throwable2) {}
                while (true) {
                    n4 = object.hasNext();
                    if (n4 == 0) break block6;
                    break;
                }
                {
                    Object e2 = object.next();
                    this.bind(bg3_02, e2);
                    n4 = bg3_02.q();
                    n3 += n4;
                    continue;
                }
                break block7;
            }
            this.release(bg3_02);
            return n3;
        }
        this.release(bg3_02);
        throw throwable2;
    }

    public final int handleMultiple(Object[] objectArray) {
        Throwable throwable2;
        Intrinsics.checkNotNullParameter(objectArray, "entities");
        bg3_0 bg3_02 = this.acquire();
        int n3 = objectArray.length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            try {
                object = objectArray[i3];
            }
            catch (Throwable throwable2) {
            }
            this.bind(bg3_02, object);
            int n7 = bg3_02.q();
            n4 += n7;
            continue;
        }
        this.release(bg3_02);
        return n4;
        this.release(bg3_02);
        throw throwable2;
    }
}

