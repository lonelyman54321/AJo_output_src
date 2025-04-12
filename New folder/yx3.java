/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.internal.Intrinsics;

public final class yx3 {
    public final UserRepo a;
    public final NewPlpRepo b;
    public final t30_0 c;
    public final UserInformation d;
    public final zr1_1 e;
    public final zr1_1 f;

    public yx3(Application object, UserRepo object2, NewPlpRepo newPlpRepo) {
        Intrinsics.checkNotNullParameter(object, "application");
        Intrinsics.checkNotNullParameter(object2, "userRepo");
        Intrinsics.checkNotNullParameter(newPlpRepo, "plpRepo");
        this.a = object2;
        this.b = newPlpRepo;
        this.c = object2 = new t30_0();
        object = UserInformation.getInstance((Context)object);
        this.d = object;
        this.e = object;
        super();
        this.f = object;
    }
}

