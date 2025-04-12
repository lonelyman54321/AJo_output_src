/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fX0
 */
public final class fx0_0
implements yg3_1 {
    public final Context a;
    public final String b;
    public final yg3$a c;
    public final boolean d;
    public final boolean e;
    public final hh3_2 f;
    public boolean g;

    public fx0_0(Context object, String string2, yg3$a yg3$a, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(yg3$a, "callback");
        this.a = object;
        this.b = string2;
        this.c = yg3$a;
        this.d = bl2;
        this.e = bl3;
        super(this);
        object = yr1_2.b((Function0)object);
        this.f = object;
    }

    public final void close() {
        Object object = this.f;
        boolean bl2 = ((hh3_2)object).isInitialized();
        if (bl2) {
            object = (fX0$b)((Object)((hh3_2)object).getValue());
            ((fX0$b)((Object)object)).close();
        }
    }

    public final xg3_1 getWritableDatabase() {
        return ((fX0$b)((Object)this.f.getValue())).a(true);
    }

    public final void setWriteAheadLoggingEnabled(boolean bl2) {
        Object object = this.f;
        boolean bl3 = object.isInitialized();
        if (bl3) {
            object = (fX0$b)((Object)object.getValue());
            String string2 = "sQLiteOpenHelper";
            Intrinsics.checkNotNullParameter(object, string2);
            object.setWriteAheadLoggingEnabled(bl2);
        }
        this.g = bl2;
    }
}

