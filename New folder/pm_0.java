/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pm
 */
public final class pm_0 {
    public static final Pm$a d;
    public static pm_0 e;
    public final int a;
    public final UUID b;
    public Intent c;

    static {
        Pm$a pm$a;
        d = pm$a = new Object();
    }

    public pm_0(int n3) {
        UUID uUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uUID, "randomUUID()");
        Intrinsics.checkNotNullParameter(uUID, "callId");
        this.a = n3;
        this.b = uUID;
    }

    public final UUID a() {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return null;
        }
        try {
            return this.b;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return null;
        }
    }

    public final int b() {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return 0;
        }
        try {
            return this.a;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return 0;
        }
    }

    public final void c() {
        Pm$a pm$a;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            pm$a = d;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
        pm$a.a(this);
    }
}

