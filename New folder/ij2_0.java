/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from IJ2
 */
public final class ij2_0
implements y63_0 {
    public final File a;
    public final IJ2$a b;
    public final long c;
    public long d;
    public boolean e;
    public boolean f;
    public final lg2_1 g;

    public ij2_0(File file, AU$b object) {
        long l2;
        Object object2 = "callback";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.a = file;
        this.b = object;
        this.c = l2 = 250000L;
        object = null;
        if (file != null) {
            object2 = p72_0.a;
            object2 = "<this>";
            try {
                Intrinsics.checkNotNullParameter(file, (String)object2);
                object = o72_0.e(file);
            }
            catch (IOException iOException) {
                CharSequence charSequence = new StringBuilder("Failed to use file ");
                Object object3 = this.a;
                charSequence.append(object3);
                object3 = " by Chucker";
                charSequence.append((String)object3);
                charSequence = charSequence.toString();
                object2 = new IOException((String)charSequence, iOException);
                this.a((IOException)object2);
            }
        }
        this.g = object;
    }

    public final void a(IOException iOException) {
        boolean bl2 = this.e;
        if (!bl2) {
            this.e = bl2 = true;
            this.b();
            IJ2$a iJ2$a = this.b;
            iJ2$a.a(iOException);
        }
    }

    public final void b() {
        block3: {
            Object object = this.g;
            if (object == null) break block3;
            try {
                ((lg2_1)object).close();
                object = Unit.a;
            }
            catch (IOException iOException) {
                this.a(iOException);
                Unit unit = Unit.a;
            }
        }
    }

    public final void close() {
        boolean bl2 = this.f;
        if (bl2) {
            return;
        }
        this.f = true;
        this.b();
        long l2 = this.d;
        IJ2$a iJ2$a = this.b;
        File file = this.a;
        iJ2$a.b(file, l2);
    }

    public final void flush() {
        block4: {
            boolean bl2 = this.e;
            if (bl2) {
                return;
            }
            lg2_1 lg2_12 = this.g;
            if (lg2_12 == null) break block4;
            try {
                lg2_12.flush();
            }
            catch (IOException iOException) {
                this.a(iOException);
            }
        }
    }

    public final void s0(ce_2 ce_22, long l2) {
        block6: {
            long l3;
            long l4;
            Object object;
            long l7;
            Object object2 = "source";
            Intrinsics.checkNotNullParameter(ce_22, (String)object2);
            long l8 = this.d;
            this.d = l7 = l8 + l2;
            boolean bl2 = this.e;
            if (!bl2 && (object = (l4 = l8 - (l3 = this.c)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) < 0) {
                object = l7 == l3 ? 0 : (l7 < l3 ? -1 : 1);
                if (object > 0) {
                    l2 = l3 - l8;
                }
                l8 = 0L;
                long l12 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
                if (l12 == false) {
                    return;
                }
                object2 = this.g;
                if (object2 == null) break block6;
                try {
                    ((lg2_1)object2).s0(ce_22, l2);
                }
                catch (IOException iOException) {
                    this.a(iOException);
                }
            }
        }
    }

    public final a timeout() {
        Object object = this.g;
        object = object == null ? null : ((lg2_1)object).b;
        if (object == null) {
            object = okio.a.d;
            String string2 = "NONE";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        }
        return object;
    }
}

