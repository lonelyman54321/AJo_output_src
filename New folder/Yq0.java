/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public class Yq0
implements Mq0$a {
    public final Yq0$a a;

    public Yq0(tj1_0 tj1_02) {
        this.a = tj1_02;
    }

    public final Zq0 build() {
        Object object = (tj1_0)this.a;
        File file = ((tj1_0)object).a.getCacheDir();
        if (file == null) {
            file = null;
        } else {
            object = ((tj1_0)object).b;
            if (object != null) {
                File file2;
                file = file2 = new File(file, (String)object);
            }
        }
        if (file == null) {
            return null;
        }
        boolean bl2 = file.isDirectory();
        if (!bl2 && !(bl2 = file.mkdirs())) {
            return null;
        }
        object = new Zq0(file);
        return object;
    }
}

