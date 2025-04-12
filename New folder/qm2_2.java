/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.data.repo.CartApiRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qm2
 */
public final class qm2_2
extends Hj {
    public final CartApiRepo a;
    public final zr1_1 b;
    public final zr1_1 c;

    public qm2_2(Application object) {
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        Application application = this.getApplication();
        super((Context)application);
        this.a = object;
        super();
        this.b = object;
        this.c = object;
    }
}

