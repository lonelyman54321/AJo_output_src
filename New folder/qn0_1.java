/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;

/*
 * Renamed from QN0
 */
public final class qn0_1
implements ComponentFactory {
    public final /* synthetic */ Qualified a;

    public /* synthetic */ qn0_1(Qualified qualified) {
        this.a = qualified;
    }

    public final Object create(ComponentContainer componentContainer) {
        return FirebaseMessagingRegistrar.a(this.a, componentContainer);
    }
}

