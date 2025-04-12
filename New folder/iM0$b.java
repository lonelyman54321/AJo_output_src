/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;

public final class iM0$b
extends p0_0 {
    public final ArrayDeque c;
    public final /* synthetic */ im0_2 d;

    public iM0$b(im0_2 object) {
        ArrayDeque<Object> arrayDeque;
        this.d = object;
        this.c = arrayDeque = new ArrayDeque<Object>();
        Object object2 = ((im0_2)object).a;
        boolean bl2 = ((File)object2).isDirectory();
        if (bl2) {
            object = ((im0_2)object).a;
            object = this.c((File)object);
            arrayDeque.push(object);
        } else {
            object2 = ((im0_2)object).a;
            bl2 = ((File)object2).isFile();
            if (bl2) {
                object = ((im0_2)object).a;
                String string2 = "rootFile";
                Intrinsics.checkNotNullParameter(object, string2);
                object2 = new iM0$c((File)object);
                arrayDeque.push(object2);
            } else {
                object = hb3_1.Done;
                this.a = object;
            }
        }
    }

    public final void a() {
        Object object;
        block5: {
            File file;
            while (true) {
                Object object2;
                if ((object2 = (iM0$c)((ArrayDeque)(object = this.c)).peek()) == null) {
                    object = null;
                    break block5;
                }
                file = ((iM0$c)object2).a();
                if (file == null) {
                    ((ArrayDeque)object).pop();
                    continue;
                }
                object2 = ((iM0$c)object2).a;
                int n3 = Intrinsics.areEqual(file, object2);
                if (n3 != 0 || (n3 = file.isDirectory()) == 0) break;
                n3 = ((ArrayDeque)object).size();
                im0_2 im0_22 = this.d;
                int n4 = im0_22.f;
                if (n3 >= n4) break;
                object2 = this.c(file);
                ((ArrayDeque)object).push(object2);
            }
            object = file;
        }
        if (object != null) {
            this.b = object;
            object = hb3_1.Ready;
            this.a = object;
        } else {
            object = hb3_1.Done;
            this.a = object;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final iM0$a c(File serializable) {
        void var2_6;
        FileWalkDirection fileWalkDirection = this.d.b;
        int[] nArray = iM0$b$d.$EnumSwitchMapping$0;
        int n3 = fileWalkDirection.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) == n4) {
            iM0$b$c iM0$b$c = new iM0$b$c(this, (File)serializable);
            return var2_6;
        }
        n4 = 2;
        if (n3 == n4) {
            iM0$b$a iM0$b$a = new iM0$b$a(this, (File)serializable);
            return var2_6;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }
}

