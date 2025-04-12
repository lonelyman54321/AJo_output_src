/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class fX0$c
extends Lambda
implements Function0 {
    public final /* synthetic */ fx0_0 c;

    public fX0$c(fx0_0 fx0_02) {
        this.c = fx0_02;
        super(0);
    }

    public final Object invoke() {
        Object object;
        boolean bl2;
        Object object2;
        int bl22 = Build.VERSION.SDK_INT;
        int n3 = 23;
        fx0_0 fx0_02 = this.c;
        if (bl22 >= n3 && (object2 = fx0_02.b) != null && (bl2 = fx0_02.d)) {
            object = fx0_02.a;
            Intrinsics.checkNotNullParameter(object, "context");
            object = object.getNoBackupFilesDir();
            Intrinsics.checkNotNullExpressionValue(object, "context.noBackupFilesDir");
            String string2 = fx0_02.b;
            object2 = new File((File)object, string2);
            String string3 = ((File)object2).getAbsolutePath();
            fX0$a fX0$a = new fX0$a();
            yg3$a yg3$a = fx0_02.c;
            boolean bl3 = fx0_02.e;
            Context context = fx0_02.a;
            object = new fX0$b(context, string3, fX0$a, yg3$a, bl3);
        } else {
            Context context = fx0_02.a;
            fX0$a fX0$a = new fX0$a();
            yg3$a yg3$a = fx0_02.c;
            boolean bl4 = fx0_02.e;
            String string4 = fx0_02.b;
            object = new fX0$b(context, string4, fX0$a, yg3$a, bl4);
        }
        boolean bl5 = fx0_02.g;
        Intrinsics.checkNotNullParameter(object, "sQLiteOpenHelper");
        object.setWriteAheadLoggingEnabled(bl5);
        return object;
    }
}

