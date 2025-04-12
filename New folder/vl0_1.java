/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;

/*
 * Renamed from Vl0
 */
public final class vl0_1
implements ComponentFactory {
    public final /* synthetic */ Qualified a;

    public /* synthetic */ vl0_1(Qualified qualified) {
        this.a = qualified;
    }

    public final Object create(ComponentContainer componentContainer) {
        return DefaultHeartBeatController.c(this.a, componentContainer);
    }
}

