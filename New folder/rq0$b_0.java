/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rq0$b
 */
public final class rq0$b_0 {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public rq0$a_0 g;
    public int h;
    public long i;
    public final /* synthetic */ rq0_2 j;

    public rq0$b_0(rq0_2 rq0_22, String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.j = rq0_22;
        this.a = string2;
        rq0_22.getClass();
        int n3 = 2;
        Object object = new long[n3];
        this.b = object;
        object = new ArrayList;
        this.c = object;
        object = new ArrayList;
        super();
        this.d = object;
        object = new StringBuilder;
        super(string2);
        ((StringBuilder)object).append('.');
        int n4 = ((StringBuilder)object).length();
        for (int i3 = 0; i3 < n3; ++i3) {
            ((StringBuilder)object).append(i3);
            ArrayList arrayList = this.c;
            File file = this.j.b;
            String string3 = ((StringBuilder)object).toString();
            File file2 = new File(file, string3);
            arrayList.add(file2);
            ((StringBuilder)object).append(".tmp");
            arrayList = this.d;
            file = this.j.b;
            string3 = ((StringBuilder)object).toString();
            file2 = new File(file, string3);
            arrayList.add(file2);
            ((StringBuilder)object).setLength(n4);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Rq0$c a() {
        Rq0$c rq0$c;
        Object object;
        Object object2;
        int n3;
        int n4;
        Object object3;
        Object object4;
        Object object5 = ez3.a;
        boolean bl2 = this.e;
        if (!bl2) {
            return null;
        }
        object5 = this.j;
        boolean bl3 = ((rq0_2)object5).l;
        if (!bl3) {
            object4 = this.g;
            if (object4 != null) return null;
            bl3 = this.f;
            if (bl3) {
                return null;
            }
        }
        object4 = new ArrayList();
        Object object6 = object3 = this.b.clone();
        object6 = (long[])object3;
        object3 = null;
        for (n4 = 0; n4 < (n3 = 2); ++n4) {
            block24: {
                object2 = ((rq0_2)object5).a;
                object = this.c;
                object = ((ArrayList)object).get(n4);
                object = (File)object;
                object2 = ((gm0_2)object2).h((File)object);
                int n7 = ((rq0_2)object5).l;
                if (n7 != 0) break block24;
                n7 = this.h + 1;
                this.h = n7;
                object2 = object = new tq0_2((a93_0)object2, (rq0_2)object5, this);
            }
            ((ArrayList)object4).add(object2);
            continue;
        }
        try {
            object2 = this.j;
        }
        catch (FileNotFoundException fileNotFoundException) {
            object4 = ((ArrayList)object4).iterator();
            while ((n4 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object3 = (a93_0)object4.next();
                ez3.c((Closeable)object3);
            }
            try {
                ((rq0_2)object5).z(this);
                return null;
            }
            catch (IOException iOException) {
                return null;
            }
        }
        object = this.a;
        long l2 = this.i;
        object3 = rq0$c;
        return new Rq0$c((rq0_2)object2, (String)object, l2, (ArrayList)object4, (long[])object6);
    }
}

