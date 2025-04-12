/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.data.repo.GameZoneRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vY0
 */
public final class vy0_1
extends Hj {
    public final t30_0 a;
    public final GameZoneRepo b;
    public final zr1_1 c;
    public final zr1_1 d;

    public vy0_1(Application object) {
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        Object object2 = new t30_0();
        this.a = object2;
        this.b = object2 = new GameZoneRepo((Context)object);
        super();
        this.c = object;
        this.d = object;
    }
}

