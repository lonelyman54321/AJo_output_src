/*
 * Decompiled with CFR 0.152.
 */
import java.security.PrivilegedAction;
import java.util.ServiceLoader;

/*
 * Renamed from vx1
 */
public final class vx1_2
implements PrivilegedAction {
    public final /* synthetic */ ClassLoader a;

    public /* synthetic */ vx1_2(ClassLoader classLoader) {
        this.a = classLoader;
    }

    public final Object run() {
        ClassLoader classLoader = this.a;
        return ServiceLoader.load(mr2_2.class, classLoader);
    }
}

