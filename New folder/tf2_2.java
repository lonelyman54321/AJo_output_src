/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tf2
 */
public final class tf2_2
extends ow_2 {
    public final ux2_1 a;
    public UserRepo b;
    public final hh3_2 c;
    public final zr1_1 d;
    public final zr1_1 e;
    public final zr1_1 f;
    public final zr1_1 g;
    public final zr1_1 h;
    public final zr1_1 i;
    public String j;

    public tf2_2(Application object, ux2_1 ux2_12) {
        Intrinsics.checkNotNullParameter(object, "application");
        Intrinsics.checkNotNullParameter(ux2_12, "postOrderUseCase");
        super((Application)object);
        this.a = ux2_12;
        super(this, 1);
        object = yr1_2.b((Function0)object);
        this.c = object;
        super();
        this.d = object;
        this.e = object;
        super();
        this.f = object;
        this.g = object;
        super();
        this.h = object;
        this.i = object;
    }
}

