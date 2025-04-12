/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/*
 * Renamed from iM0
 */
public final class im0_2
implements Sequence {
    public final File a;
    public final FileWalkDirection b;
    public final Function1 c;
    public final Function1 d;
    public final Function2 e;
    public final int f;

    public im0_2(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 2;
        if (n7 != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        if ((n4 &= 0x20) != 0) {
            n3 = -1 >>> 1;
        }
        this.a = file;
        this.b = fileWalkDirection;
        this.c = function1;
        this.d = function12;
        this.e = function2;
        this.f = n3;
    }

    public final Iterator iterator() {
        iM0$b iM0$b = new iM0$b(this);
        return iM0$b;
    }
}

