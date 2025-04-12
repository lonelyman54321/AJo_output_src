/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public final class wL0
implements ao1_0 {
    public final boolean a;

    public wL0(boolean bl2) {
        this.a = bl2;
    }

    public final String a(Object object, ba2 object2) {
        object = (File)object;
        boolean bl2 = this.a;
        if (bl2) {
            object2 = new StringBuilder();
            String string2 = ((File)object).getPath();
            ((StringBuilder)object2).append(string2);
            char c2 = ':';
            ((StringBuilder)object2).append(c2);
            long l2 = ((File)object).lastModified();
            ((StringBuilder)object2).append(l2);
            object = ((StringBuilder)object2).toString();
        } else {
            object = ((File)object).getPath();
        }
        return object;
    }
}

