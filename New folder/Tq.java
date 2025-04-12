/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public final class Tq {
    public final File a;
    public final File b;

    public Tq(File object) {
        File file;
        this.a = object;
        StringBuilder stringBuilder = new StringBuilder();
        object = ((File)object).getPath();
        stringBuilder.append((String)object);
        stringBuilder.append(".bak");
        object = stringBuilder.toString();
        this.b = file = new File((String)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Tq$a a() {
        FileNotFoundException fileNotFoundException222;
        String string2;
        Serializable serializable;
        Object object;
        block10: {
            boolean bl2;
            object = this.a;
            boolean bl3 = ((File)object).exists();
            if (bl3) {
                Object object2 = this.b;
                bl2 = ((File)object2).exists();
                if (!bl2) {
                    bl2 = ((File)object).renameTo((File)object2);
                    if (!bl2) {
                        serializable = new StringBuilder("Couldn't rename file ");
                        ((StringBuilder)serializable).append(object);
                        string2 = " to backup file ";
                        ((StringBuilder)serializable).append(string2);
                        ((StringBuilder)serializable).append(object2);
                        object2 = ((StringBuilder)serializable).toString();
                        Cx.f((String)object2);
                    }
                } else {
                    ((File)object).delete();
                }
            }
            try {
                return new Tq$a((File)object);
            }
            catch (FileNotFoundException fileNotFoundException222) {
                serializable = ((File)object).getParentFile();
                string2 = "Couldn't create ";
                if (serializable == null || !(bl2 = ((File)serializable).mkdirs())) break block10;
                try {
                    return new Tq$a((File)object);
                }
                catch (FileNotFoundException fileNotFoundException3) {
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    stringBuilder.append(object);
                    object = stringBuilder.toString();
                    serializable = new IOException((String)object, fileNotFoundException3);
                    throw serializable;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(object);
        object = stringBuilder.toString();
        serializable = new IOException((String)object, fileNotFoundException222);
        throw serializable;
    }
}

