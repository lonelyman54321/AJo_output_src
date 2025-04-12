/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from gy2
 */
public final class gy2_2
extends Lambda
implements Function0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ hy2_0 d;

    public gy2_2(Context context, hy2_0 hy2_02) {
        this.c = context;
        this.d = hy2_02;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Intrinsics.checkNotNullExpressionValue(object, "applicationContext");
        String string2 = this.d.a;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(string2, "name");
        string2 = Intrinsics.stringPlus(string2, ".preferences_pb");
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(string2, "fileName");
        object = object.getApplicationContext().getFilesDir();
        string2 = Intrinsics.stringPlus("datastore/", string2);
        object2 = new File((File)object, string2);
        return object2;
    }
}

