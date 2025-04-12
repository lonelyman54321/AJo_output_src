/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Message
 */
import android.app.Application;
import android.content.Context;
import android.os.Message;
import com.ril.ajio.data.repo.CartApiRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from G4
 */
public final class g4_0
extends Hj {
    public final CartApiRepo a;
    public final zr1_1 b;
    public final zr1_1 c;
    public final zr1_1 d;
    public final zr1_1 e;
    public Message f;

    public g4_0(Application object) {
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        Application application = this.getApplication();
        super((Context)application);
        this.a = object;
        super();
        this.b = object;
        this.c = object;
        super();
        this.d = object;
        this.e = object;
        super();
        this.f = object;
    }
}

