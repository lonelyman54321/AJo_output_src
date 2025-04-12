/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.source.j$a;
import com.google.common.base.Supplier;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;

/*
 * Renamed from rm0
 */
public final class rm0_0
implements Supplier {
    public final /* synthetic */ Class a;

    public /* synthetic */ rm0_0(Class clazz) {
        this.a = clazz;
    }

    public final Object get() {
        GenericDeclaration genericDeclaration = this.a;
        IllegalStateException illegalStateException = null;
        try {
            genericDeclaration = genericDeclaration.getConstructor(null);
        }
        catch (Exception exception) {
            illegalStateException = new IllegalStateException(exception);
            throw illegalStateException;
        }
        genericDeclaration = ((Constructor)genericDeclaration).newInstance(null);
        return (j$a)((Object)genericDeclaration);
    }
}

