/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.Personalization;

/*
 * Renamed from xI2
 */
public final class xi2_0
implements BiConsumer {
    public final /* synthetic */ Personalization a;

    public /* synthetic */ xi2_0(Personalization personalization) {
        this.a = personalization;
    }

    public final void accept(Object object, Object object2) {
        object = (String)object;
        object2 = (ConfigContainer)object2;
        this.a.logArmActive((String)object, (ConfigContainer)object2);
    }
}

