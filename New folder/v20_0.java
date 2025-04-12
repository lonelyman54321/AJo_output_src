/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.tooling.ComposeViewAdapter;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from V20
 */
public final class v20_0
extends Lambda
implements Function0 {
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ b30_0 e;
    public final /* synthetic */ Class f;
    public final /* synthetic */ int g;
    public final /* synthetic */ ComposeViewAdapter h;

    public v20_0(String string2, String string3, b30_0 b30_02, Class clazz, int n3, ComposeViewAdapter composeViewAdapter) {
        this.c = string2;
        this.d = string3;
        this.e = b30_02;
        this.f = clazz;
        this.g = n3;
        this.h = composeViewAdapter;
        super(0);
    }

    public final Object invoke() {
        Object[] objectArray;
        Object object;
        Object object2;
        String string2;
        try {
            string2 = this.c;
        }
        catch (Throwable throwable) {
            boolean bl2;
            object2 = throwable;
            while ((bl2 = object2 instanceof ReflectiveOperationException) && (object = ((Throwable)object2).getCause()) != null) {
                object2 = object;
            }
            object = this.h.h;
            objectArray = ((fn3)object).b;
            synchronized (objectArray) {
                ((fn3)object).a = (Throwable)object2;
                object2 = Unit.a;
                throw throwable;
            }
        }
        object2 = this.d;
        object = this.e;
        objectArray = this.f;
        int n3 = this.g;
        objectArray = uy2_0.b((Class)objectArray, n3);
        n3 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n3);
        t10.b(string2, (String)object2, (b30_0)object, objectArray);
        return Unit.a;
    }
}

