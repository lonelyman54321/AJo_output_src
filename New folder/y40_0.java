/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;

/*
 * Renamed from y40
 */
public final class y40_0
implements Runnable {
    public final /* synthetic */ BiConsumer a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ConfigContainer c;

    public /* synthetic */ y40_0(BiConsumer biConsumer, String string2, ConfigContainer configContainer) {
        this.a = biConsumer;
        this.b = string2;
        this.c = configContainer;
    }

    public final void run() {
        String string2 = this.b;
        ConfigContainer configContainer = this.c;
        ConfigGetParameterHandler.a(this.a, string2, configContainer);
    }
}

