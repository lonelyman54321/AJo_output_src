/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class iF$a$f
implements iF$a$e {
    public final f80_0 b;
    public final Throwable c;

    public iF$a$f(CancellableContinuationImpl object) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(object, "continuation");
        this.b = object;
        Object object2 = System.getProperty("io.ktor.development");
        if (object2 != null && (bl3 = Boolean.parseBoolean((String)object2)) == (bl2 = true)) {
            StringBuilder stringBuilder = new StringBuilder("WriteTask 0x");
            int n3 = object.hashCode();
            int n4 = CharsKt.checkRadix(16);
            object = Integer.toString(n3, n4);
            String string2 = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            object2 = new Throwable((String)object);
            yc0_2.b((Throwable)object2);
            this.c = object2;
        }
    }

    public final void a(Throwable object) {
        f80_0 f80_02 = this.c();
        if (object != null) {
            object = vl2_2.a((Throwable)object);
        } else {
            iF$a.a.getClass();
            object = iF$a$b.c;
        }
        f80_02.resumeWith(object);
    }

    public final Throwable b() {
        return this.c;
    }

    public final f80_0 c() {
        return this.b;
    }

    public final void resume() {
        f80_0 f80_02 = this.c();
        iF$a.a.getClass();
        Unit unit = iF$a$b.c;
        f80_02.resumeWith(unit);
    }
}

